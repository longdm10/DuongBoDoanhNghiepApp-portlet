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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage;

import java.util.List;

/**
 * The persistence utility for the dm history package service. This utility wraps {@link DmHistoryPackagePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryPackagePersistence
 * @see DmHistoryPackagePersistenceImpl
 * @generated
 */
public class DmHistoryPackageUtil {
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
	public static void clearCache(DmHistoryPackage dmHistoryPackage) {
		getPersistence().clearCache(dmHistoryPackage);
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
	public static List<DmHistoryPackage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmHistoryPackage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmHistoryPackage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmHistoryPackage update(DmHistoryPackage dmHistoryPackage)
		throws SystemException {
		return getPersistence().update(dmHistoryPackage);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmHistoryPackage update(DmHistoryPackage dmHistoryPackage,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmHistoryPackage, serviceContext);
	}

	/**
	* Returns all the dm history packages where packageCode = &#63;.
	*
	* @param packageCode the package code
	* @return the matching dm history packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage> findByPackageCode(
		java.lang.String packageCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPackageCode(packageCode);
	}

	/**
	* Returns a range of all the dm history packages where packageCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param packageCode the package code
	* @param start the lower bound of the range of dm history packages
	* @param end the upper bound of the range of dm history packages (not inclusive)
	* @return the range of matching dm history packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage> findByPackageCode(
		java.lang.String packageCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPackageCode(packageCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm history packages where packageCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param packageCode the package code
	* @param start the lower bound of the range of dm history packages
	* @param end the upper bound of the range of dm history packages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage> findByPackageCode(
		java.lang.String packageCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPackageCode(packageCode, start, end, orderByComparator);
	}

	/**
	* Returns the first dm history package in the ordered set where packageCode = &#63;.
	*
	* @param packageCode the package code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history package
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException if a matching dm history package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage findByPackageCode_First(
		java.lang.String packageCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException {
		return getPersistence()
				   .findByPackageCode_First(packageCode, orderByComparator);
	}

	/**
	* Returns the first dm history package in the ordered set where packageCode = &#63;.
	*
	* @param packageCode the package code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history package, or <code>null</code> if a matching dm history package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage fetchByPackageCode_First(
		java.lang.String packageCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPackageCode_First(packageCode, orderByComparator);
	}

	/**
	* Returns the last dm history package in the ordered set where packageCode = &#63;.
	*
	* @param packageCode the package code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history package
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException if a matching dm history package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage findByPackageCode_Last(
		java.lang.String packageCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException {
		return getPersistence()
				   .findByPackageCode_Last(packageCode, orderByComparator);
	}

	/**
	* Returns the last dm history package in the ordered set where packageCode = &#63;.
	*
	* @param packageCode the package code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history package, or <code>null</code> if a matching dm history package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage fetchByPackageCode_Last(
		java.lang.String packageCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPackageCode_Last(packageCode, orderByComparator);
	}

	/**
	* Returns the dm history packages before and after the current dm history package in the ordered set where packageCode = &#63;.
	*
	* @param id the primary key of the current dm history package
	* @param packageCode the package code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history package
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException if a dm history package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage[] findByPackageCode_PrevAndNext(
		int id, java.lang.String packageCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException {
		return getPersistence()
				   .findByPackageCode_PrevAndNext(id, packageCode,
			orderByComparator);
	}

	/**
	* Removes all the dm history packages where packageCode = &#63; from the database.
	*
	* @param packageCode the package code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPackageCode(java.lang.String packageCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPackageCode(packageCode);
	}

	/**
	* Returns the number of dm history packages where packageCode = &#63;.
	*
	* @param packageCode the package code
	* @return the number of matching dm history packages
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPackageCode(java.lang.String packageCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPackageCode(packageCode);
	}

	/**
	* Returns the dm history package where packageCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException} if it could not be found.
	*
	* @param packageCode the package code
	* @param syncVersion the sync version
	* @return the matching dm history package
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException if a matching dm history package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage findByPackageCodeAndSyncVersion(
		java.lang.String packageCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException {
		return getPersistence()
				   .findByPackageCodeAndSyncVersion(packageCode, syncVersion);
	}

	/**
	* Returns the dm history package where packageCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param packageCode the package code
	* @param syncVersion the sync version
	* @return the matching dm history package, or <code>null</code> if a matching dm history package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage fetchByPackageCodeAndSyncVersion(
		java.lang.String packageCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPackageCodeAndSyncVersion(packageCode, syncVersion);
	}

	/**
	* Returns the dm history package where packageCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param packageCode the package code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history package, or <code>null</code> if a matching dm history package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage fetchByPackageCodeAndSyncVersion(
		java.lang.String packageCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPackageCodeAndSyncVersion(packageCode, syncVersion,
			retrieveFromCache);
	}

	/**
	* Removes the dm history package where packageCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param packageCode the package code
	* @param syncVersion the sync version
	* @return the dm history package that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage removeByPackageCodeAndSyncVersion(
		java.lang.String packageCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException {
		return getPersistence()
				   .removeByPackageCodeAndSyncVersion(packageCode, syncVersion);
	}

	/**
	* Returns the number of dm history packages where packageCode = &#63; and syncVersion = &#63;.
	*
	* @param packageCode the package code
	* @param syncVersion the sync version
	* @return the number of matching dm history packages
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPackageCodeAndSyncVersion(
		java.lang.String packageCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByPackageCodeAndSyncVersion(packageCode, syncVersion);
	}

	/**
	* Caches the dm history package in the entity cache if it is enabled.
	*
	* @param dmHistoryPackage the dm history package
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage dmHistoryPackage) {
		getPersistence().cacheResult(dmHistoryPackage);
	}

	/**
	* Caches the dm history packages in the entity cache if it is enabled.
	*
	* @param dmHistoryPackages the dm history packages
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage> dmHistoryPackages) {
		getPersistence().cacheResult(dmHistoryPackages);
	}

	/**
	* Creates a new dm history package with the primary key. Does not add the dm history package to the database.
	*
	* @param id the primary key for the new dm history package
	* @return the new dm history package
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage create(
		int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm history package with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history package
	* @return the dm history package that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException if a dm history package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage dmHistoryPackage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmHistoryPackage);
	}

	/**
	* Returns the dm history package with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException} if it could not be found.
	*
	* @param id the primary key of the dm history package
	* @return the dm history package
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException if a dm history package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm history package with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history package
	* @return the dm history package, or <code>null</code> if a dm history package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm history packages.
	*
	* @return the dm history packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm history packages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history packages
	* @param end the upper bound of the range of dm history packages (not inclusive)
	* @return the range of dm history packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm history packages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history packages
	* @param end the upper bound of the range of dm history packages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm history packages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm history packages.
	*
	* @return the number of dm history packages
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmHistoryPackagePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmHistoryPackagePersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					DmHistoryPackagePersistence.class.getName());

			ReferenceRegistry.registerReference(DmHistoryPackageUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmHistoryPackagePersistence persistence) {
	}

	private static DmHistoryPackagePersistence _persistence;
}