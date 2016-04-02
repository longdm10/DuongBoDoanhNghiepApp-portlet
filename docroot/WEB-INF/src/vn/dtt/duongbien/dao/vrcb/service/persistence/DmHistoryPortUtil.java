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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort;

import java.util.List;

/**
 * The persistence utility for the dm history port service. This utility wraps {@link DmHistoryPortPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryPortPersistence
 * @see DmHistoryPortPersistenceImpl
 * @generated
 */
public class DmHistoryPortUtil {
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
	public static void clearCache(DmHistoryPort dmHistoryPort) {
		getPersistence().clearCache(dmHistoryPort);
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
	public static List<DmHistoryPort> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmHistoryPort> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmHistoryPort> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmHistoryPort update(DmHistoryPort dmHistoryPort)
		throws SystemException {
		return getPersistence().update(dmHistoryPort);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmHistoryPort update(DmHistoryPort dmHistoryPort,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmHistoryPort, serviceContext);
	}

	/**
	* Returns all the dm history ports where portCode = &#63;.
	*
	* @param portCode the port code
	* @return the matching dm history ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort> findByPortCode(
		java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortCode(portCode);
	}

	/**
	* Returns a range of all the dm history ports where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portCode the port code
	* @param start the lower bound of the range of dm history ports
	* @param end the upper bound of the range of dm history ports (not inclusive)
	* @return the range of matching dm history ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort> findByPortCode(
		java.lang.String portCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortCode(portCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm history ports where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portCode the port code
	* @param start the lower bound of the range of dm history ports
	* @param end the upper bound of the range of dm history ports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort> findByPortCode(
		java.lang.String portCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortCode(portCode, start, end, orderByComparator);
	}

	/**
	* Returns the first dm history port in the ordered set where portCode = &#63;.
	*
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history port
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException if a matching dm history port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort findByPortCode_First(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException {
		return getPersistence().findByPortCode_First(portCode, orderByComparator);
	}

	/**
	* Returns the first dm history port in the ordered set where portCode = &#63;.
	*
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history port, or <code>null</code> if a matching dm history port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort fetchByPortCode_First(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortCode_First(portCode, orderByComparator);
	}

	/**
	* Returns the last dm history port in the ordered set where portCode = &#63;.
	*
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history port
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException if a matching dm history port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort findByPortCode_Last(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException {
		return getPersistence().findByPortCode_Last(portCode, orderByComparator);
	}

	/**
	* Returns the last dm history port in the ordered set where portCode = &#63;.
	*
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history port, or <code>null</code> if a matching dm history port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort fetchByPortCode_Last(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPortCode_Last(portCode, orderByComparator);
	}

	/**
	* Returns the dm history ports before and after the current dm history port in the ordered set where portCode = &#63;.
	*
	* @param id the primary key of the current dm history port
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history port
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException if a dm history port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort[] findByPortCode_PrevAndNext(
		int id, java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException {
		return getPersistence()
				   .findByPortCode_PrevAndNext(id, portCode, orderByComparator);
	}

	/**
	* Removes all the dm history ports where portCode = &#63; from the database.
	*
	* @param portCode the port code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPortCode(java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPortCode(portCode);
	}

	/**
	* Returns the number of dm history ports where portCode = &#63;.
	*
	* @param portCode the port code
	* @return the number of matching dm history ports
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortCode(java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPortCode(portCode);
	}

	/**
	* Returns the dm history port where portCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException} if it could not be found.
	*
	* @param portCode the port code
	* @param syncVersion the sync version
	* @return the matching dm history port
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException if a matching dm history port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort findByPortCodeAndSyncVersion(
		java.lang.String portCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException {
		return getPersistence()
				   .findByPortCodeAndSyncVersion(portCode, syncVersion);
	}

	/**
	* Returns the dm history port where portCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param portCode the port code
	* @param syncVersion the sync version
	* @return the matching dm history port, or <code>null</code> if a matching dm history port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort fetchByPortCodeAndSyncVersion(
		java.lang.String portCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortCodeAndSyncVersion(portCode, syncVersion);
	}

	/**
	* Returns the dm history port where portCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param portCode the port code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history port, or <code>null</code> if a matching dm history port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort fetchByPortCodeAndSyncVersion(
		java.lang.String portCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortCodeAndSyncVersion(portCode, syncVersion,
			retrieveFromCache);
	}

	/**
	* Removes the dm history port where portCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param portCode the port code
	* @param syncVersion the sync version
	* @return the dm history port that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort removeByPortCodeAndSyncVersion(
		java.lang.String portCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException {
		return getPersistence()
				   .removeByPortCodeAndSyncVersion(portCode, syncVersion);
	}

	/**
	* Returns the number of dm history ports where portCode = &#63; and syncVersion = &#63;.
	*
	* @param portCode the port code
	* @param syncVersion the sync version
	* @return the number of matching dm history ports
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortCodeAndSyncVersion(java.lang.String portCode,
		java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByPortCodeAndSyncVersion(portCode, syncVersion);
	}

	/**
	* Caches the dm history port in the entity cache if it is enabled.
	*
	* @param dmHistoryPort the dm history port
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort dmHistoryPort) {
		getPersistence().cacheResult(dmHistoryPort);
	}

	/**
	* Caches the dm history ports in the entity cache if it is enabled.
	*
	* @param dmHistoryPorts the dm history ports
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort> dmHistoryPorts) {
		getPersistence().cacheResult(dmHistoryPorts);
	}

	/**
	* Creates a new dm history port with the primary key. Does not add the dm history port to the database.
	*
	* @param id the primary key for the new dm history port
	* @return the new dm history port
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm history port with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history port
	* @return the dm history port that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException if a dm history port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort dmHistoryPort)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmHistoryPort);
	}

	/**
	* Returns the dm history port with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException} if it could not be found.
	*
	* @param id the primary key of the dm history port
	* @return the dm history port
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException if a dm history port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm history port with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history port
	* @return the dm history port, or <code>null</code> if a dm history port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm history ports.
	*
	* @return the dm history ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm history ports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history ports
	* @param end the upper bound of the range of dm history ports (not inclusive)
	* @return the range of dm history ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm history ports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history ports
	* @param end the upper bound of the range of dm history ports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPort> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm history ports from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm history ports.
	*
	* @return the number of dm history ports
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmHistoryPortPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmHistoryPortPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					DmHistoryPortPersistence.class.getName());

			ReferenceRegistry.registerReference(DmHistoryPortUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmHistoryPortPersistence persistence) {
	}

	private static DmHistoryPortPersistence _persistence;
}