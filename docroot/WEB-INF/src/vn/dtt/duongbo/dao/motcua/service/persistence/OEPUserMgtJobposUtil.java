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

package vn.dtt.duongbo.dao.motcua.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos;

import java.util.List;

/**
 * The persistence utility for the o e p user mgt jobpos service. This utility wraps {@link OEPUserMgtJobposPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtJobposPersistence
 * @see OEPUserMgtJobposPersistenceImpl
 * @generated
 */
public class OEPUserMgtJobposUtil {
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
	public static void clearCache(OEPUserMgtJobpos oepUserMgtJobpos) {
		getPersistence().clearCache(oepUserMgtJobpos);
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
	public static List<OEPUserMgtJobpos> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OEPUserMgtJobpos> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OEPUserMgtJobpos> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static OEPUserMgtJobpos update(OEPUserMgtJobpos oepUserMgtJobpos)
		throws SystemException {
		return getPersistence().update(oepUserMgtJobpos);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static OEPUserMgtJobpos update(OEPUserMgtJobpos oepUserMgtJobpos,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(oepUserMgtJobpos, serviceContext);
	}

	/**
	* Caches the o e p user mgt jobpos in the entity cache if it is enabled.
	*
	* @param oepUserMgtJobpos the o e p user mgt jobpos
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos oepUserMgtJobpos) {
		getPersistence().cacheResult(oepUserMgtJobpos);
	}

	/**
	* Caches the o e p user mgt jobposes in the entity cache if it is enabled.
	*
	* @param oepUserMgtJobposes the o e p user mgt jobposes
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos> oepUserMgtJobposes) {
		getPersistence().cacheResult(oepUserMgtJobposes);
	}

	/**
	* Creates a new o e p user mgt jobpos with the primary key. Does not add the o e p user mgt jobpos to the database.
	*
	* @param jobPosId the primary key for the new o e p user mgt jobpos
	* @return the new o e p user mgt jobpos
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos create(
		long jobPosId) {
		return getPersistence().create(jobPosId);
	}

	/**
	* Removes the o e p user mgt jobpos with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobPosId the primary key of the o e p user mgt jobpos
	* @return the o e p user mgt jobpos that was removed
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobposException if a o e p user mgt jobpos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos remove(
		long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobposException {
		return getPersistence().remove(jobPosId);
	}

	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos updateImpl(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos oepUserMgtJobpos)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(oepUserMgtJobpos);
	}

	/**
	* Returns the o e p user mgt jobpos with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobposException} if it could not be found.
	*
	* @param jobPosId the primary key of the o e p user mgt jobpos
	* @return the o e p user mgt jobpos
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobposException if a o e p user mgt jobpos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos findByPrimaryKey(
		long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobposException {
		return getPersistence().findByPrimaryKey(jobPosId);
	}

	/**
	* Returns the o e p user mgt jobpos with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jobPosId the primary key of the o e p user mgt jobpos
	* @return the o e p user mgt jobpos, or <code>null</code> if a o e p user mgt jobpos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos fetchByPrimaryKey(
		long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(jobPosId);
	}

	/**
	* Returns all the o e p user mgt jobposes.
	*
	* @return the o e p user mgt jobposes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the o e p user mgt jobposes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtJobposModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of o e p user mgt jobposes
	* @param end the upper bound of the range of o e p user mgt jobposes (not inclusive)
	* @return the range of o e p user mgt jobposes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the o e p user mgt jobposes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtJobposModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of o e p user mgt jobposes
	* @param end the upper bound of the range of o e p user mgt jobposes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of o e p user mgt jobposes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the o e p user mgt jobposes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of o e p user mgt jobposes.
	*
	* @return the number of o e p user mgt jobposes
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static OEPUserMgtJobposPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (OEPUserMgtJobposPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.motcua.service.ClpSerializer.getServletContextName(),
					OEPUserMgtJobposPersistence.class.getName());

			ReferenceRegistry.registerReference(OEPUserMgtJobposUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(OEPUserMgtJobposPersistence persistence) {
	}

	private static OEPUserMgtJobposPersistence _persistence;
}