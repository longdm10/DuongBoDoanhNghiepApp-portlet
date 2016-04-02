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

import vn.dtt.duongbien.dao.vrcb.model.DmPortWharf;

import java.util.List;

/**
 * The persistence utility for the dm port wharf service. This utility wraps {@link DmPortWharfPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmPortWharfPersistence
 * @see DmPortWharfPersistenceImpl
 * @generated
 */
public class DmPortWharfUtil {
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
	public static void clearCache(DmPortWharf dmPortWharf) {
		getPersistence().clearCache(dmPortWharf);
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
	public static List<DmPortWharf> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmPortWharf> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmPortWharf> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmPortWharf update(DmPortWharf dmPortWharf)
		throws SystemException {
		return getPersistence().update(dmPortWharf);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmPortWharf update(DmPortWharf dmPortWharf,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmPortWharf, serviceContext);
	}

	/**
	* Returns all the dm port wharfs where portWharfCode = &#63;.
	*
	* @param portWharfCode the port wharf code
	* @return the matching dm port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortWharf> findByPortWharfCode(
		java.lang.String portWharfCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortWharfCode(portWharfCode);
	}

	/**
	* Returns a range of all the dm port wharfs where portWharfCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portWharfCode the port wharf code
	* @param start the lower bound of the range of dm port wharfs
	* @param end the upper bound of the range of dm port wharfs (not inclusive)
	* @return the range of matching dm port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortWharf> findByPortWharfCode(
		java.lang.String portWharfCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortWharfCode(portWharfCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm port wharfs where portWharfCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portWharfCode the port wharf code
	* @param start the lower bound of the range of dm port wharfs
	* @param end the upper bound of the range of dm port wharfs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortWharf> findByPortWharfCode(
		java.lang.String portWharfCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortWharfCode(portWharfCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm port wharf in the ordered set where portWharfCode = &#63;.
	*
	* @param portWharfCode the port wharf code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port wharf
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a matching dm port wharf could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPortWharf findByPortWharfCode_First(
		java.lang.String portWharfCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException {
		return getPersistence()
				   .findByPortWharfCode_First(portWharfCode, orderByComparator);
	}

	/**
	* Returns the first dm port wharf in the ordered set where portWharfCode = &#63;.
	*
	* @param portWharfCode the port wharf code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port wharf, or <code>null</code> if a matching dm port wharf could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPortWharf fetchByPortWharfCode_First(
		java.lang.String portWharfCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortWharfCode_First(portWharfCode, orderByComparator);
	}

	/**
	* Returns the last dm port wharf in the ordered set where portWharfCode = &#63;.
	*
	* @param portWharfCode the port wharf code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port wharf
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a matching dm port wharf could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPortWharf findByPortWharfCode_Last(
		java.lang.String portWharfCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException {
		return getPersistence()
				   .findByPortWharfCode_Last(portWharfCode, orderByComparator);
	}

	/**
	* Returns the last dm port wharf in the ordered set where portWharfCode = &#63;.
	*
	* @param portWharfCode the port wharf code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port wharf, or <code>null</code> if a matching dm port wharf could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPortWharf fetchByPortWharfCode_Last(
		java.lang.String portWharfCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortWharfCode_Last(portWharfCode, orderByComparator);
	}

	/**
	* Returns the dm port wharfs before and after the current dm port wharf in the ordered set where portWharfCode = &#63;.
	*
	* @param id the primary key of the current dm port wharf
	* @param portWharfCode the port wharf code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm port wharf
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a dm port wharf with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPortWharf[] findByPortWharfCode_PrevAndNext(
		int id, java.lang.String portWharfCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException {
		return getPersistence()
				   .findByPortWharfCode_PrevAndNext(id, portWharfCode,
			orderByComparator);
	}

	/**
	* Removes all the dm port wharfs where portWharfCode = &#63; from the database.
	*
	* @param portWharfCode the port wharf code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPortWharfCode(java.lang.String portWharfCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPortWharfCode(portWharfCode);
	}

	/**
	* Returns the number of dm port wharfs where portWharfCode = &#63;.
	*
	* @param portWharfCode the port wharf code
	* @return the number of matching dm port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortWharfCode(java.lang.String portWharfCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPortWharfCode(portWharfCode);
	}

	/**
	* Returns all the dm port wharfs where portWharfCode = &#63; and syncVersion = &#63;.
	*
	* @param portWharfCode the port wharf code
	* @param syncVersion the sync version
	* @return the matching dm port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortWharf> findByPortWharfCodeAndSyncVersion(
		java.lang.String portWharfCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortWharfCodeAndSyncVersion(portWharfCode, syncVersion);
	}

	/**
	* Returns a range of all the dm port wharfs where portWharfCode = &#63; and syncVersion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portWharfCode the port wharf code
	* @param syncVersion the sync version
	* @param start the lower bound of the range of dm port wharfs
	* @param end the upper bound of the range of dm port wharfs (not inclusive)
	* @return the range of matching dm port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortWharf> findByPortWharfCodeAndSyncVersion(
		java.lang.String portWharfCode, java.lang.String syncVersion,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortWharfCodeAndSyncVersion(portWharfCode,
			syncVersion, start, end);
	}

	/**
	* Returns an ordered range of all the dm port wharfs where portWharfCode = &#63; and syncVersion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portWharfCode the port wharf code
	* @param syncVersion the sync version
	* @param start the lower bound of the range of dm port wharfs
	* @param end the upper bound of the range of dm port wharfs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortWharf> findByPortWharfCodeAndSyncVersion(
		java.lang.String portWharfCode, java.lang.String syncVersion,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortWharfCodeAndSyncVersion(portWharfCode,
			syncVersion, start, end, orderByComparator);
	}

	/**
	* Returns the first dm port wharf in the ordered set where portWharfCode = &#63; and syncVersion = &#63;.
	*
	* @param portWharfCode the port wharf code
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port wharf
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a matching dm port wharf could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPortWharf findByPortWharfCodeAndSyncVersion_First(
		java.lang.String portWharfCode, java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException {
		return getPersistence()
				   .findByPortWharfCodeAndSyncVersion_First(portWharfCode,
			syncVersion, orderByComparator);
	}

	/**
	* Returns the first dm port wharf in the ordered set where portWharfCode = &#63; and syncVersion = &#63;.
	*
	* @param portWharfCode the port wharf code
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port wharf, or <code>null</code> if a matching dm port wharf could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPortWharf fetchByPortWharfCodeAndSyncVersion_First(
		java.lang.String portWharfCode, java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortWharfCodeAndSyncVersion_First(portWharfCode,
			syncVersion, orderByComparator);
	}

	/**
	* Returns the last dm port wharf in the ordered set where portWharfCode = &#63; and syncVersion = &#63;.
	*
	* @param portWharfCode the port wharf code
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port wharf
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a matching dm port wharf could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPortWharf findByPortWharfCodeAndSyncVersion_Last(
		java.lang.String portWharfCode, java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException {
		return getPersistence()
				   .findByPortWharfCodeAndSyncVersion_Last(portWharfCode,
			syncVersion, orderByComparator);
	}

	/**
	* Returns the last dm port wharf in the ordered set where portWharfCode = &#63; and syncVersion = &#63;.
	*
	* @param portWharfCode the port wharf code
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port wharf, or <code>null</code> if a matching dm port wharf could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPortWharf fetchByPortWharfCodeAndSyncVersion_Last(
		java.lang.String portWharfCode, java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortWharfCodeAndSyncVersion_Last(portWharfCode,
			syncVersion, orderByComparator);
	}

	/**
	* Returns the dm port wharfs before and after the current dm port wharf in the ordered set where portWharfCode = &#63; and syncVersion = &#63;.
	*
	* @param id the primary key of the current dm port wharf
	* @param portWharfCode the port wharf code
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm port wharf
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a dm port wharf with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPortWharf[] findByPortWharfCodeAndSyncVersion_PrevAndNext(
		int id, java.lang.String portWharfCode, java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException {
		return getPersistence()
				   .findByPortWharfCodeAndSyncVersion_PrevAndNext(id,
			portWharfCode, syncVersion, orderByComparator);
	}

	/**
	* Removes all the dm port wharfs where portWharfCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param portWharfCode the port wharf code
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPortWharfCodeAndSyncVersion(
		java.lang.String portWharfCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByPortWharfCodeAndSyncVersion(portWharfCode, syncVersion);
	}

	/**
	* Returns the number of dm port wharfs where portWharfCode = &#63; and syncVersion = &#63;.
	*
	* @param portWharfCode the port wharf code
	* @param syncVersion the sync version
	* @return the number of matching dm port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortWharfCodeAndSyncVersion(
		java.lang.String portWharfCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByPortWharfCodeAndSyncVersion(portWharfCode,
			syncVersion);
	}

	/**
	* Returns all the dm port wharfs where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @return the matching dm port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortWharf> findByPortRegionCode(
		java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortRegionCode(portRegionCode);
	}

	/**
	* Returns a range of all the dm port wharfs where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param start the lower bound of the range of dm port wharfs
	* @param end the upper bound of the range of dm port wharfs (not inclusive)
	* @return the range of matching dm port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortWharf> findByPortRegionCode(
		java.lang.String portRegionCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortRegionCode(portRegionCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm port wharfs where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param start the lower bound of the range of dm port wharfs
	* @param end the upper bound of the range of dm port wharfs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortWharf> findByPortRegionCode(
		java.lang.String portRegionCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortRegionCode(portRegionCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm port wharf in the ordered set where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port wharf
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a matching dm port wharf could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPortWharf findByPortRegionCode_First(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException {
		return getPersistence()
				   .findByPortRegionCode_First(portRegionCode, orderByComparator);
	}

	/**
	* Returns the first dm port wharf in the ordered set where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port wharf, or <code>null</code> if a matching dm port wharf could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPortWharf fetchByPortRegionCode_First(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortRegionCode_First(portRegionCode,
			orderByComparator);
	}

	/**
	* Returns the last dm port wharf in the ordered set where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port wharf
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a matching dm port wharf could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPortWharf findByPortRegionCode_Last(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException {
		return getPersistence()
				   .findByPortRegionCode_Last(portRegionCode, orderByComparator);
	}

	/**
	* Returns the last dm port wharf in the ordered set where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port wharf, or <code>null</code> if a matching dm port wharf could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPortWharf fetchByPortRegionCode_Last(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortRegionCode_Last(portRegionCode, orderByComparator);
	}

	/**
	* Returns the dm port wharfs before and after the current dm port wharf in the ordered set where portRegionCode = &#63;.
	*
	* @param id the primary key of the current dm port wharf
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm port wharf
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a dm port wharf with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPortWharf[] findByPortRegionCode_PrevAndNext(
		int id, java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException {
		return getPersistence()
				   .findByPortRegionCode_PrevAndNext(id, portRegionCode,
			orderByComparator);
	}

	/**
	* Removes all the dm port wharfs where portRegionCode = &#63; from the database.
	*
	* @param portRegionCode the port region code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPortRegionCode(java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPortRegionCode(portRegionCode);
	}

	/**
	* Returns the number of dm port wharfs where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @return the number of matching dm port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortRegionCode(java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPortRegionCode(portRegionCode);
	}

	/**
	* Caches the dm port wharf in the entity cache if it is enabled.
	*
	* @param dmPortWharf the dm port wharf
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmPortWharf dmPortWharf) {
		getPersistence().cacheResult(dmPortWharf);
	}

	/**
	* Caches the dm port wharfs in the entity cache if it is enabled.
	*
	* @param dmPortWharfs the dm port wharfs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortWharf> dmPortWharfs) {
		getPersistence().cacheResult(dmPortWharfs);
	}

	/**
	* Creates a new dm port wharf with the primary key. Does not add the dm port wharf to the database.
	*
	* @param id the primary key for the new dm port wharf
	* @return the new dm port wharf
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPortWharf create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm port wharf with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm port wharf
	* @return the dm port wharf that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a dm port wharf with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPortWharf remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.DmPortWharf updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmPortWharf dmPortWharf)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmPortWharf);
	}

	/**
	* Returns the dm port wharf with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException} if it could not be found.
	*
	* @param id the primary key of the dm port wharf
	* @return the dm port wharf
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a dm port wharf with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPortWharf findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm port wharf with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm port wharf
	* @return the dm port wharf, or <code>null</code> if a dm port wharf with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPortWharf fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm port wharfs.
	*
	* @return the dm port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortWharf> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm port wharfs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm port wharfs
	* @param end the upper bound of the range of dm port wharfs (not inclusive)
	* @return the range of dm port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortWharf> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm port wharfs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm port wharfs
	* @param end the upper bound of the range of dm port wharfs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortWharf> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm port wharfs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm port wharfs.
	*
	* @return the number of dm port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmPortWharfPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmPortWharfPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					DmPortWharfPersistence.class.getName());

			ReferenceRegistry.registerReference(DmPortWharfUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmPortWharfPersistence persistence) {
	}

	private static DmPortWharfPersistence _persistence;
}