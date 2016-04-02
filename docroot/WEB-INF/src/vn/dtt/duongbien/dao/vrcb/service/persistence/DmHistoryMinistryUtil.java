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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry;

import java.util.List;

/**
 * The persistence utility for the dm history ministry service. This utility wraps {@link DmHistoryMinistryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryMinistryPersistence
 * @see DmHistoryMinistryPersistenceImpl
 * @generated
 */
public class DmHistoryMinistryUtil {
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
	public static void clearCache(DmHistoryMinistry dmHistoryMinistry) {
		getPersistence().clearCache(dmHistoryMinistry);
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
	public static List<DmHistoryMinistry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmHistoryMinistry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmHistoryMinistry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmHistoryMinistry update(DmHistoryMinistry dmHistoryMinistry)
		throws SystemException {
		return getPersistence().update(dmHistoryMinistry);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmHistoryMinistry update(
		DmHistoryMinistry dmHistoryMinistry, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(dmHistoryMinistry, serviceContext);
	}

	/**
	* Returns the dm history ministry where ministryCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMinistryException} if it could not be found.
	*
	* @param ministryCode the ministry code
	* @return the matching dm history ministry
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMinistryException if a matching dm history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry findByMinistryCode(
		java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMinistryException {
		return getPersistence().findByMinistryCode(ministryCode);
	}

	/**
	* Returns the dm history ministry where ministryCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param ministryCode the ministry code
	* @return the matching dm history ministry, or <code>null</code> if a matching dm history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry fetchByMinistryCode(
		java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMinistryCode(ministryCode);
	}

	/**
	* Returns the dm history ministry where ministryCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param ministryCode the ministry code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history ministry, or <code>null</code> if a matching dm history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry fetchByMinistryCode(
		java.lang.String ministryCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMinistryCode(ministryCode, retrieveFromCache);
	}

	/**
	* Removes the dm history ministry where ministryCode = &#63; from the database.
	*
	* @param ministryCode the ministry code
	* @return the dm history ministry that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry removeByMinistryCode(
		java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMinistryException {
		return getPersistence().removeByMinistryCode(ministryCode);
	}

	/**
	* Returns the number of dm history ministries where ministryCode = &#63;.
	*
	* @param ministryCode the ministry code
	* @return the number of matching dm history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMinistryCode(java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMinistryCode(ministryCode);
	}

	/**
	* Caches the dm history ministry in the entity cache if it is enabled.
	*
	* @param dmHistoryMinistry the dm history ministry
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry dmHistoryMinistry) {
		getPersistence().cacheResult(dmHistoryMinistry);
	}

	/**
	* Caches the dm history ministries in the entity cache if it is enabled.
	*
	* @param dmHistoryMinistries the dm history ministries
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry> dmHistoryMinistries) {
		getPersistence().cacheResult(dmHistoryMinistries);
	}

	/**
	* Creates a new dm history ministry with the primary key. Does not add the dm history ministry to the database.
	*
	* @param id the primary key for the new dm history ministry
	* @return the new dm history ministry
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm history ministry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history ministry
	* @return the dm history ministry that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMinistryException if a dm history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMinistryException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry dmHistoryMinistry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmHistoryMinistry);
	}

	/**
	* Returns the dm history ministry with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMinistryException} if it could not be found.
	*
	* @param id the primary key of the dm history ministry
	* @return the dm history ministry
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMinistryException if a dm history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMinistryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm history ministry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history ministry
	* @return the dm history ministry, or <code>null</code> if a dm history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm history ministries.
	*
	* @return the dm history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm history ministries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryMinistryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history ministries
	* @param end the upper bound of the range of dm history ministries (not inclusive)
	* @return the range of dm history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm history ministries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryMinistryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history ministries
	* @param end the upper bound of the range of dm history ministries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm history ministries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm history ministries.
	*
	* @return the number of dm history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmHistoryMinistryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmHistoryMinistryPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					DmHistoryMinistryPersistence.class.getName());

			ReferenceRegistry.registerReference(DmHistoryMinistryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmHistoryMinistryPersistence persistence) {
	}

	private static DmHistoryMinistryPersistence _persistence;
}