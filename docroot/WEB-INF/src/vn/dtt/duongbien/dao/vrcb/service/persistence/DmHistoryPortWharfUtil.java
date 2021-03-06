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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf;

import java.util.List;

/**
 * The persistence utility for the dm history port wharf service. This utility wraps {@link DmHistoryPortWharfPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryPortWharfPersistence
 * @see DmHistoryPortWharfPersistenceImpl
 * @generated
 */
public class DmHistoryPortWharfUtil {
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
	public static void clearCache(DmHistoryPortWharf dmHistoryPortWharf) {
		getPersistence().clearCache(dmHistoryPortWharf);
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
	public static List<DmHistoryPortWharf> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmHistoryPortWharf> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmHistoryPortWharf> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmHistoryPortWharf update(
		DmHistoryPortWharf dmHistoryPortWharf) throws SystemException {
		return getPersistence().update(dmHistoryPortWharf);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmHistoryPortWharf update(
		DmHistoryPortWharf dmHistoryPortWharf, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(dmHistoryPortWharf, serviceContext);
	}

	/**
	* Returns all the dm history port wharfs where portWharfCode = &#63;.
	*
	* @param portWharfCode the port wharf code
	* @return the matching dm history port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf> findByPortWharfCode(
		java.lang.String portWharfCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortWharfCode(portWharfCode);
	}

	/**
	* Returns a range of all the dm history port wharfs where portWharfCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portWharfCode the port wharf code
	* @param start the lower bound of the range of dm history port wharfs
	* @param end the upper bound of the range of dm history port wharfs (not inclusive)
	* @return the range of matching dm history port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf> findByPortWharfCode(
		java.lang.String portWharfCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortWharfCode(portWharfCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm history port wharfs where portWharfCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portWharfCode the port wharf code
	* @param start the lower bound of the range of dm history port wharfs
	* @param end the upper bound of the range of dm history port wharfs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf> findByPortWharfCode(
		java.lang.String portWharfCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortWharfCode(portWharfCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm history port wharf in the ordered set where portWharfCode = &#63;.
	*
	* @param portWharfCode the port wharf code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history port wharf
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortWharfException if a matching dm history port wharf could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf findByPortWharfCode_First(
		java.lang.String portWharfCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortWharfException {
		return getPersistence()
				   .findByPortWharfCode_First(portWharfCode, orderByComparator);
	}

	/**
	* Returns the first dm history port wharf in the ordered set where portWharfCode = &#63;.
	*
	* @param portWharfCode the port wharf code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history port wharf, or <code>null</code> if a matching dm history port wharf could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf fetchByPortWharfCode_First(
		java.lang.String portWharfCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortWharfCode_First(portWharfCode, orderByComparator);
	}

	/**
	* Returns the last dm history port wharf in the ordered set where portWharfCode = &#63;.
	*
	* @param portWharfCode the port wharf code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history port wharf
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortWharfException if a matching dm history port wharf could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf findByPortWharfCode_Last(
		java.lang.String portWharfCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortWharfException {
		return getPersistence()
				   .findByPortWharfCode_Last(portWharfCode, orderByComparator);
	}

	/**
	* Returns the last dm history port wharf in the ordered set where portWharfCode = &#63;.
	*
	* @param portWharfCode the port wharf code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history port wharf, or <code>null</code> if a matching dm history port wharf could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf fetchByPortWharfCode_Last(
		java.lang.String portWharfCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortWharfCode_Last(portWharfCode, orderByComparator);
	}

	/**
	* Returns the dm history port wharfs before and after the current dm history port wharf in the ordered set where portWharfCode = &#63;.
	*
	* @param id the primary key of the current dm history port wharf
	* @param portWharfCode the port wharf code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history port wharf
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortWharfException if a dm history port wharf with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf[] findByPortWharfCode_PrevAndNext(
		int id, java.lang.String portWharfCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortWharfException {
		return getPersistence()
				   .findByPortWharfCode_PrevAndNext(id, portWharfCode,
			orderByComparator);
	}

	/**
	* Removes all the dm history port wharfs where portWharfCode = &#63; from the database.
	*
	* @param portWharfCode the port wharf code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPortWharfCode(java.lang.String portWharfCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPortWharfCode(portWharfCode);
	}

	/**
	* Returns the number of dm history port wharfs where portWharfCode = &#63;.
	*
	* @param portWharfCode the port wharf code
	* @return the number of matching dm history port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortWharfCode(java.lang.String portWharfCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPortWharfCode(portWharfCode);
	}

	/**
	* Returns the dm history port wharf where portWharfCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortWharfException} if it could not be found.
	*
	* @param portWharfCode the port wharf code
	* @param syncVersion the sync version
	* @return the matching dm history port wharf
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortWharfException if a matching dm history port wharf could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf findByPortWharfCodeAndSyncVersion(
		java.lang.String portWharfCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortWharfException {
		return getPersistence()
				   .findByPortWharfCodeAndSyncVersion(portWharfCode, syncVersion);
	}

	/**
	* Returns the dm history port wharf where portWharfCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param portWharfCode the port wharf code
	* @param syncVersion the sync version
	* @return the matching dm history port wharf, or <code>null</code> if a matching dm history port wharf could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf fetchByPortWharfCodeAndSyncVersion(
		java.lang.String portWharfCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortWharfCodeAndSyncVersion(portWharfCode,
			syncVersion);
	}

	/**
	* Returns the dm history port wharf where portWharfCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param portWharfCode the port wharf code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history port wharf, or <code>null</code> if a matching dm history port wharf could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf fetchByPortWharfCodeAndSyncVersion(
		java.lang.String portWharfCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortWharfCodeAndSyncVersion(portWharfCode,
			syncVersion, retrieveFromCache);
	}

	/**
	* Removes the dm history port wharf where portWharfCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param portWharfCode the port wharf code
	* @param syncVersion the sync version
	* @return the dm history port wharf that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf removeByPortWharfCodeAndSyncVersion(
		java.lang.String portWharfCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortWharfException {
		return getPersistence()
				   .removeByPortWharfCodeAndSyncVersion(portWharfCode,
			syncVersion);
	}

	/**
	* Returns the number of dm history port wharfs where portWharfCode = &#63; and syncVersion = &#63;.
	*
	* @param portWharfCode the port wharf code
	* @param syncVersion the sync version
	* @return the number of matching dm history port wharfs
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
	* Caches the dm history port wharf in the entity cache if it is enabled.
	*
	* @param dmHistoryPortWharf the dm history port wharf
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf dmHistoryPortWharf) {
		getPersistence().cacheResult(dmHistoryPortWharf);
	}

	/**
	* Caches the dm history port wharfs in the entity cache if it is enabled.
	*
	* @param dmHistoryPortWharfs the dm history port wharfs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf> dmHistoryPortWharfs) {
		getPersistence().cacheResult(dmHistoryPortWharfs);
	}

	/**
	* Creates a new dm history port wharf with the primary key. Does not add the dm history port wharf to the database.
	*
	* @param id the primary key for the new dm history port wharf
	* @return the new dm history port wharf
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf create(
		int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm history port wharf with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history port wharf
	* @return the dm history port wharf that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortWharfException if a dm history port wharf with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortWharfException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf dmHistoryPortWharf)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmHistoryPortWharf);
	}

	/**
	* Returns the dm history port wharf with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortWharfException} if it could not be found.
	*
	* @param id the primary key of the dm history port wharf
	* @return the dm history port wharf
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortWharfException if a dm history port wharf with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortWharfException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm history port wharf with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history port wharf
	* @return the dm history port wharf, or <code>null</code> if a dm history port wharf with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm history port wharfs.
	*
	* @return the dm history port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm history port wharfs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history port wharfs
	* @param end the upper bound of the range of dm history port wharfs (not inclusive)
	* @return the range of dm history port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm history port wharfs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history port wharfs
	* @param end the upper bound of the range of dm history port wharfs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm history port wharfs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm history port wharfs.
	*
	* @return the number of dm history port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmHistoryPortWharfPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmHistoryPortWharfPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					DmHistoryPortWharfPersistence.class.getName());

			ReferenceRegistry.registerReference(DmHistoryPortWharfUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmHistoryPortWharfPersistence persistence) {
	}

	private static DmHistoryPortWharfPersistence _persistence;
}