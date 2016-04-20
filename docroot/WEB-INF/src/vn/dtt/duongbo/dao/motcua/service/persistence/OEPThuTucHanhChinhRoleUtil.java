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

import vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole;

import java.util.List;

/**
 * The persistence utility for the o e p thu tuc hanh chinh role service. This utility wraps {@link OEPThuTucHanhChinhRolePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see OEPThuTucHanhChinhRolePersistence
 * @see OEPThuTucHanhChinhRolePersistenceImpl
 * @generated
 */
public class OEPThuTucHanhChinhRoleUtil {
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
	public static void clearCache(OEPThuTucHanhChinhRole oepThuTucHanhChinhRole) {
		getPersistence().clearCache(oepThuTucHanhChinhRole);
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
	public static List<OEPThuTucHanhChinhRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OEPThuTucHanhChinhRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OEPThuTucHanhChinhRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static OEPThuTucHanhChinhRole update(
		OEPThuTucHanhChinhRole oepThuTucHanhChinhRole)
		throws SystemException {
		return getPersistence().update(oepThuTucHanhChinhRole);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static OEPThuTucHanhChinhRole update(
		OEPThuTucHanhChinhRole oepThuTucHanhChinhRole,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(oepThuTucHanhChinhRole, serviceContext);
	}

	/**
	* Caches the o e p thu tuc hanh chinh role in the entity cache if it is enabled.
	*
	* @param oepThuTucHanhChinhRole the o e p thu tuc hanh chinh role
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole oepThuTucHanhChinhRole) {
		getPersistence().cacheResult(oepThuTucHanhChinhRole);
	}

	/**
	* Caches the o e p thu tuc hanh chinh roles in the entity cache if it is enabled.
	*
	* @param oepThuTucHanhChinhRoles the o e p thu tuc hanh chinh roles
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole> oepThuTucHanhChinhRoles) {
		getPersistence().cacheResult(oepThuTucHanhChinhRoles);
	}

	/**
	* Creates a new o e p thu tuc hanh chinh role with the primary key. Does not add the o e p thu tuc hanh chinh role to the database.
	*
	* @param id the primary key for the new o e p thu tuc hanh chinh role
	* @return the new o e p thu tuc hanh chinh role
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole create(
		int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the o e p thu tuc hanh chinh role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the o e p thu tuc hanh chinh role
	* @return the o e p thu tuc hanh chinh role that was removed
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPThuTucHanhChinhRoleException if a o e p thu tuc hanh chinh role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPThuTucHanhChinhRoleException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole updateImpl(
		vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole oepThuTucHanhChinhRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(oepThuTucHanhChinhRole);
	}

	/**
	* Returns the o e p thu tuc hanh chinh role with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPThuTucHanhChinhRoleException} if it could not be found.
	*
	* @param id the primary key of the o e p thu tuc hanh chinh role
	* @return the o e p thu tuc hanh chinh role
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPThuTucHanhChinhRoleException if a o e p thu tuc hanh chinh role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPThuTucHanhChinhRoleException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the o e p thu tuc hanh chinh role with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the o e p thu tuc hanh chinh role
	* @return the o e p thu tuc hanh chinh role, or <code>null</code> if a o e p thu tuc hanh chinh role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the o e p thu tuc hanh chinh roles.
	*
	* @return the o e p thu tuc hanh chinh roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the o e p thu tuc hanh chinh roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPThuTucHanhChinhRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of o e p thu tuc hanh chinh roles
	* @param end the upper bound of the range of o e p thu tuc hanh chinh roles (not inclusive)
	* @return the range of o e p thu tuc hanh chinh roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the o e p thu tuc hanh chinh roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPThuTucHanhChinhRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of o e p thu tuc hanh chinh roles
	* @param end the upper bound of the range of o e p thu tuc hanh chinh roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of o e p thu tuc hanh chinh roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the o e p thu tuc hanh chinh roles from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of o e p thu tuc hanh chinh roles.
	*
	* @return the number of o e p thu tuc hanh chinh roles
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static OEPThuTucHanhChinhRolePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (OEPThuTucHanhChinhRolePersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.motcua.service.ClpSerializer.getServletContextName(),
					OEPThuTucHanhChinhRolePersistence.class.getName());

			ReferenceRegistry.registerReference(OEPThuTucHanhChinhRoleUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(OEPThuTucHanhChinhRolePersistence persistence) {
	}

	private static OEPThuTucHanhChinhRolePersistence _persistence;
}