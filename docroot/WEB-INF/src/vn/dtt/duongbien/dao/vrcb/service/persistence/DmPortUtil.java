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

import vn.dtt.duongbien.dao.vrcb.model.DmPort;

import java.util.List;

/**
 * The persistence utility for the dm port service. This utility wraps {@link DmPortPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmPortPersistence
 * @see DmPortPersistenceImpl
 * @generated
 */
public class DmPortUtil {
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
	public static void clearCache(DmPort dmPort) {
		getPersistence().clearCache(dmPort);
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
	public static List<DmPort> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmPort> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmPort> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmPort update(DmPort dmPort) throws SystemException {
		return getPersistence().update(dmPort);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmPort update(DmPort dmPort, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(dmPort, serviceContext);
	}

	/**
	* Returns all the dm ports where portCode = &#63;.
	*
	* @param portCode the port code
	* @return the matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPort> findByPortCode(
		java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortCode(portCode);
	}

	/**
	* Returns a range of all the dm ports where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portCode the port code
	* @param start the lower bound of the range of dm ports
	* @param end the upper bound of the range of dm ports (not inclusive)
	* @return the range of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPort> findByPortCode(
		java.lang.String portCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortCode(portCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm ports where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portCode the port code
	* @param start the lower bound of the range of dm ports
	* @param end the upper bound of the range of dm ports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPort> findByPortCode(
		java.lang.String portCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortCode(portCode, start, end, orderByComparator);
	}

	/**
	* Returns the first dm port in the ordered set where portCode = &#63;.
	*
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPort findByPortCode_First(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException {
		return getPersistence().findByPortCode_First(portCode, orderByComparator);
	}

	/**
	* Returns the first dm port in the ordered set where portCode = &#63;.
	*
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port, or <code>null</code> if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPort fetchByPortCode_First(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortCode_First(portCode, orderByComparator);
	}

	/**
	* Returns the last dm port in the ordered set where portCode = &#63;.
	*
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPort findByPortCode_Last(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException {
		return getPersistence().findByPortCode_Last(portCode, orderByComparator);
	}

	/**
	* Returns the last dm port in the ordered set where portCode = &#63;.
	*
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port, or <code>null</code> if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPort fetchByPortCode_Last(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPortCode_Last(portCode, orderByComparator);
	}

	/**
	* Returns the dm ports before and after the current dm port in the ordered set where portCode = &#63;.
	*
	* @param id the primary key of the current dm port
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm port
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a dm port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPort[] findByPortCode_PrevAndNext(
		int id, java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException {
		return getPersistence()
				   .findByPortCode_PrevAndNext(id, portCode, orderByComparator);
	}

	/**
	* Removes all the dm ports where portCode = &#63; from the database.
	*
	* @param portCode the port code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPortCode(java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPortCode(portCode);
	}

	/**
	* Returns the number of dm ports where portCode = &#63;.
	*
	* @param portCode the port code
	* @return the number of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortCode(java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPortCode(portCode);
	}

	/**
	* Returns all the dm ports where loCode = &#63;.
	*
	* @param loCode the lo code
	* @return the matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPort> findByLoCode(
		java.lang.String loCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLoCode(loCode);
	}

	/**
	* Returns a range of all the dm ports where loCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param loCode the lo code
	* @param start the lower bound of the range of dm ports
	* @param end the upper bound of the range of dm ports (not inclusive)
	* @return the range of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPort> findByLoCode(
		java.lang.String loCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLoCode(loCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm ports where loCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param loCode the lo code
	* @param start the lower bound of the range of dm ports
	* @param end the upper bound of the range of dm ports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPort> findByLoCode(
		java.lang.String loCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLoCode(loCode, start, end, orderByComparator);
	}

	/**
	* Returns the first dm port in the ordered set where loCode = &#63;.
	*
	* @param loCode the lo code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPort findByLoCode_First(
		java.lang.String loCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException {
		return getPersistence().findByLoCode_First(loCode, orderByComparator);
	}

	/**
	* Returns the first dm port in the ordered set where loCode = &#63;.
	*
	* @param loCode the lo code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port, or <code>null</code> if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPort fetchByLoCode_First(
		java.lang.String loCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByLoCode_First(loCode, orderByComparator);
	}

	/**
	* Returns the last dm port in the ordered set where loCode = &#63;.
	*
	* @param loCode the lo code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPort findByLoCode_Last(
		java.lang.String loCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException {
		return getPersistence().findByLoCode_Last(loCode, orderByComparator);
	}

	/**
	* Returns the last dm port in the ordered set where loCode = &#63;.
	*
	* @param loCode the lo code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port, or <code>null</code> if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPort fetchByLoCode_Last(
		java.lang.String loCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByLoCode_Last(loCode, orderByComparator);
	}

	/**
	* Returns the dm ports before and after the current dm port in the ordered set where loCode = &#63;.
	*
	* @param id the primary key of the current dm port
	* @param loCode the lo code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm port
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a dm port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPort[] findByLoCode_PrevAndNext(
		int id, java.lang.String loCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException {
		return getPersistence()
				   .findByLoCode_PrevAndNext(id, loCode, orderByComparator);
	}

	/**
	* Removes all the dm ports where loCode = &#63; from the database.
	*
	* @param loCode the lo code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByLoCode(java.lang.String loCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByLoCode(loCode);
	}

	/**
	* Returns the number of dm ports where loCode = &#63;.
	*
	* @param loCode the lo code
	* @return the number of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static int countByLoCode(java.lang.String loCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByLoCode(loCode);
	}

	/**
	* Caches the dm port in the entity cache if it is enabled.
	*
	* @param dmPort the dm port
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmPort dmPort) {
		getPersistence().cacheResult(dmPort);
	}

	/**
	* Caches the dm ports in the entity cache if it is enabled.
	*
	* @param dmPorts the dm ports
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPort> dmPorts) {
		getPersistence().cacheResult(dmPorts);
	}

	/**
	* Creates a new dm port with the primary key. Does not add the dm port to the database.
	*
	* @param id the primary key for the new dm port
	* @return the new dm port
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPort create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm port with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm port
	* @return the dm port that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a dm port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPort remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.DmPort updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmPort dmPort)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmPort);
	}

	/**
	* Returns the dm port with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException} if it could not be found.
	*
	* @param id the primary key of the dm port
	* @return the dm port
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a dm port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPort findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm port with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm port
	* @return the dm port, or <code>null</code> if a dm port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPort fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm ports.
	*
	* @return the dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPort> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm ports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm ports
	* @param end the upper bound of the range of dm ports (not inclusive)
	* @return the range of dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPort> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm ports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm ports
	* @param end the upper bound of the range of dm ports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPort> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm ports from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm ports.
	*
	* @return the number of dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmPortPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmPortPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					DmPortPersistence.class.getName());

			ReferenceRegistry.registerReference(DmPortUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmPortPersistence persistence) {
	}

	private static DmPortPersistence _persistence;
}