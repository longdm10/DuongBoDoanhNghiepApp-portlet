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

package vn.dtt.duongbo.dao.common.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc;

import java.util.List;

/**
 * The persistence utility for the tthc linh vuc thu tuc service. This utility wraps {@link TthcLinhVucThuTucPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcLinhVucThuTucPersistence
 * @see TthcLinhVucThuTucPersistenceImpl
 * @generated
 */
public class TthcLinhVucThuTucUtil {
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
	public static void clearCache(TthcLinhVucThuTuc tthcLinhVucThuTuc) {
		getPersistence().clearCache(tthcLinhVucThuTuc);
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
	public static List<TthcLinhVucThuTuc> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TthcLinhVucThuTuc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TthcLinhVucThuTuc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TthcLinhVucThuTuc update(TthcLinhVucThuTuc tthcLinhVucThuTuc)
		throws SystemException {
		return getPersistence().update(tthcLinhVucThuTuc);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TthcLinhVucThuTuc update(
		TthcLinhVucThuTuc tthcLinhVucThuTuc, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(tthcLinhVucThuTuc, serviceContext);
	}

	/**
	* Caches the tthc linh vuc thu tuc in the entity cache if it is enabled.
	*
	* @param tthcLinhVucThuTuc the tthc linh vuc thu tuc
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc tthcLinhVucThuTuc) {
		getPersistence().cacheResult(tthcLinhVucThuTuc);
	}

	/**
	* Caches the tthc linh vuc thu tucs in the entity cache if it is enabled.
	*
	* @param tthcLinhVucThuTucs the tthc linh vuc thu tucs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc> tthcLinhVucThuTucs) {
		getPersistence().cacheResult(tthcLinhVucThuTucs);
	}

	/**
	* Creates a new tthc linh vuc thu tuc with the primary key. Does not add the tthc linh vuc thu tuc to the database.
	*
	* @param id the primary key for the new tthc linh vuc thu tuc
	* @return the new tthc linh vuc thu tuc
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the tthc linh vuc thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc linh vuc thu tuc
	* @return the tthc linh vuc thu tuc that was removed
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcLinhVucThuTucException if a tthc linh vuc thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcLinhVucThuTucException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc tthcLinhVucThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tthcLinhVucThuTuc);
	}

	/**
	* Returns the tthc linh vuc thu tuc with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcLinhVucThuTucException} if it could not be found.
	*
	* @param id the primary key of the tthc linh vuc thu tuc
	* @return the tthc linh vuc thu tuc
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcLinhVucThuTucException if a tthc linh vuc thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcLinhVucThuTucException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the tthc linh vuc thu tuc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tthc linh vuc thu tuc
	* @return the tthc linh vuc thu tuc, or <code>null</code> if a tthc linh vuc thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the tthc linh vuc thu tucs.
	*
	* @return the tthc linh vuc thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tthc linh vuc thu tucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcLinhVucThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc linh vuc thu tucs
	* @param end the upper bound of the range of tthc linh vuc thu tucs (not inclusive)
	* @return the range of tthc linh vuc thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tthc linh vuc thu tucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcLinhVucThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc linh vuc thu tucs
	* @param end the upper bound of the range of tthc linh vuc thu tucs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc linh vuc thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tthc linh vuc thu tucs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tthc linh vuc thu tucs.
	*
	* @return the number of tthc linh vuc thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TthcLinhVucThuTucPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TthcLinhVucThuTucPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.common.service.ClpSerializer.getServletContextName(),
					TthcLinhVucThuTucPersistence.class.getName());

			ReferenceRegistry.registerReference(TthcLinhVucThuTucUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TthcLinhVucThuTucPersistence persistence) {
	}

	private static TthcLinhVucThuTucPersistence _persistence;
}