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

import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2role;

import java.util.List;

/**
 * The persistence utility for the o e p user mgt jobpos2role service. This utility wraps {@link OEPUserMgtJobpos2rolePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtJobpos2rolePersistence
 * @see OEPUserMgtJobpos2rolePersistenceImpl
 * @generated
 */
public class OEPUserMgtJobpos2roleUtil {
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
	public static void clearCache(OEPUserMgtJobpos2role oepUserMgtJobpos2role) {
		getPersistence().clearCache(oepUserMgtJobpos2role);
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
	public static List<OEPUserMgtJobpos2role> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OEPUserMgtJobpos2role> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OEPUserMgtJobpos2role> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static OEPUserMgtJobpos2role update(
		OEPUserMgtJobpos2role oepUserMgtJobpos2role) throws SystemException {
		return getPersistence().update(oepUserMgtJobpos2role);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static OEPUserMgtJobpos2role update(
		OEPUserMgtJobpos2role oepUserMgtJobpos2role,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(oepUserMgtJobpos2role, serviceContext);
	}

	/**
	* Caches the o e p user mgt jobpos2role in the entity cache if it is enabled.
	*
	* @param oepUserMgtJobpos2role the o e p user mgt jobpos2role
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2role oepUserMgtJobpos2role) {
		getPersistence().cacheResult(oepUserMgtJobpos2role);
	}

	/**
	* Caches the o e p user mgt jobpos2roles in the entity cache if it is enabled.
	*
	* @param oepUserMgtJobpos2roles the o e p user mgt jobpos2roles
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2role> oepUserMgtJobpos2roles) {
		getPersistence().cacheResult(oepUserMgtJobpos2roles);
	}

	/**
	* Creates a new o e p user mgt jobpos2role with the primary key. Does not add the o e p user mgt jobpos2role to the database.
	*
	* @param oepUserMgtJobpos2rolePK the primary key for the new o e p user mgt jobpos2role
	* @return the new o e p user mgt jobpos2role
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2role create(
		vn.dtt.duongbo.dao.motcua.service.persistence.OEPUserMgtJobpos2rolePK oepUserMgtJobpos2rolePK) {
		return getPersistence().create(oepUserMgtJobpos2rolePK);
	}

	/**
	* Removes the o e p user mgt jobpos2role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param oepUserMgtJobpos2rolePK the primary key of the o e p user mgt jobpos2role
	* @return the o e p user mgt jobpos2role that was removed
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobpos2roleException if a o e p user mgt jobpos2role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2role remove(
		vn.dtt.duongbo.dao.motcua.service.persistence.OEPUserMgtJobpos2rolePK oepUserMgtJobpos2rolePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobpos2roleException {
		return getPersistence().remove(oepUserMgtJobpos2rolePK);
	}

	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2role updateImpl(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2role oepUserMgtJobpos2role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(oepUserMgtJobpos2role);
	}

	/**
	* Returns the o e p user mgt jobpos2role with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobpos2roleException} if it could not be found.
	*
	* @param oepUserMgtJobpos2rolePK the primary key of the o e p user mgt jobpos2role
	* @return the o e p user mgt jobpos2role
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobpos2roleException if a o e p user mgt jobpos2role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2role findByPrimaryKey(
		vn.dtt.duongbo.dao.motcua.service.persistence.OEPUserMgtJobpos2rolePK oepUserMgtJobpos2rolePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobpos2roleException {
		return getPersistence().findByPrimaryKey(oepUserMgtJobpos2rolePK);
	}

	/**
	* Returns the o e p user mgt jobpos2role with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param oepUserMgtJobpos2rolePK the primary key of the o e p user mgt jobpos2role
	* @return the o e p user mgt jobpos2role, or <code>null</code> if a o e p user mgt jobpos2role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2role fetchByPrimaryKey(
		vn.dtt.duongbo.dao.motcua.service.persistence.OEPUserMgtJobpos2rolePK oepUserMgtJobpos2rolePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(oepUserMgtJobpos2rolePK);
	}

	/**
	* Returns all the o e p user mgt jobpos2roles.
	*
	* @return the o e p user mgt jobpos2roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2role> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the o e p user mgt jobpos2roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtJobpos2roleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of o e p user mgt jobpos2roles
	* @param end the upper bound of the range of o e p user mgt jobpos2roles (not inclusive)
	* @return the range of o e p user mgt jobpos2roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2role> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the o e p user mgt jobpos2roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtJobpos2roleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of o e p user mgt jobpos2roles
	* @param end the upper bound of the range of o e p user mgt jobpos2roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of o e p user mgt jobpos2roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2role> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the o e p user mgt jobpos2roles from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of o e p user mgt jobpos2roles.
	*
	* @return the number of o e p user mgt jobpos2roles
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static OEPUserMgtJobpos2rolePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (OEPUserMgtJobpos2rolePersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.motcua.service.ClpSerializer.getServletContextName(),
					OEPUserMgtJobpos2rolePersistence.class.getName());

			ReferenceRegistry.registerReference(OEPUserMgtJobpos2roleUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(OEPUserMgtJobpos2rolePersistence persistence) {
	}

	private static OEPUserMgtJobpos2rolePersistence _persistence;
}