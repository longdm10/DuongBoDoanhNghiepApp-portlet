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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai;

import java.util.List;

/**
 * The persistence utility for the q l v t phuong tien van tai service. This utility wraps {@link QLVTPhuongTienVanTaiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author binhta
 * @see QLVTPhuongTienVanTaiPersistence
 * @see QLVTPhuongTienVanTaiPersistenceImpl
 * @generated
 */
public class QLVTPhuongTienVanTaiUtil {
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
	public static void clearCache(QLVTPhuongTienVanTai qlvtPhuongTienVanTai) {
		getPersistence().clearCache(qlvtPhuongTienVanTai);
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
	public static List<QLVTPhuongTienVanTai> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QLVTPhuongTienVanTai> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QLVTPhuongTienVanTai> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QLVTPhuongTienVanTai update(
		QLVTPhuongTienVanTai qlvtPhuongTienVanTai) throws SystemException {
		return getPersistence().update(qlvtPhuongTienVanTai);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QLVTPhuongTienVanTai update(
		QLVTPhuongTienVanTai qlvtPhuongTienVanTai, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(qlvtPhuongTienVanTai, serviceContext);
	}

	/**
	* Caches the q l v t phuong tien van tai in the entity cache if it is enabled.
	*
	* @param qlvtPhuongTienVanTai the q l v t phuong tien van tai
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai qlvtPhuongTienVanTai) {
		getPersistence().cacheResult(qlvtPhuongTienVanTai);
	}

	/**
	* Caches the q l v t phuong tien van tais in the entity cache if it is enabled.
	*
	* @param qlvtPhuongTienVanTais the q l v t phuong tien van tais
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai> qlvtPhuongTienVanTais) {
		getPersistence().cacheResult(qlvtPhuongTienVanTais);
	}

	/**
	* Creates a new q l v t phuong tien van tai with the primary key. Does not add the q l v t phuong tien van tai to the database.
	*
	* @param id the primary key for the new q l v t phuong tien van tai
	* @return the new q l v t phuong tien van tai
	*/
	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai create(
		int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the q l v t phuong tien van tai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the q l v t phuong tien van tai
	* @return the q l v t phuong tien van tai that was removed
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTPhuongTienVanTaiException if a q l v t phuong tien van tai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTPhuongTienVanTaiException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai updateImpl(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai qlvtPhuongTienVanTai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(qlvtPhuongTienVanTai);
	}

	/**
	* Returns the q l v t phuong tien van tai with the primary key or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTPhuongTienVanTaiException} if it could not be found.
	*
	* @param id the primary key of the q l v t phuong tien van tai
	* @return the q l v t phuong tien van tai
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTPhuongTienVanTaiException if a q l v t phuong tien van tai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTPhuongTienVanTaiException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the q l v t phuong tien van tai with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the q l v t phuong tien van tai
	* @return the q l v t phuong tien van tai, or <code>null</code> if a q l v t phuong tien van tai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the q l v t phuong tien van tais.
	*
	* @return the q l v t phuong tien van tais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the q l v t phuong tien van tais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTPhuongTienVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q l v t phuong tien van tais
	* @param end the upper bound of the range of q l v t phuong tien van tais (not inclusive)
	* @return the range of q l v t phuong tien van tais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the q l v t phuong tien van tais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTPhuongTienVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q l v t phuong tien van tais
	* @param end the upper bound of the range of q l v t phuong tien van tais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of q l v t phuong tien van tais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the q l v t phuong tien van tais from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of q l v t phuong tien van tais.
	*
	* @return the number of q l v t phuong tien van tais
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QLVTPhuongTienVanTaiPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QLVTPhuongTienVanTaiPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.capbienhieuphuhieu.service.ClpSerializer.getServletContextName(),
					QLVTPhuongTienVanTaiPersistence.class.getName());

			ReferenceRegistry.registerReference(QLVTPhuongTienVanTaiUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(QLVTPhuongTienVanTaiPersistence persistence) {
	}

	private static QLVTPhuongTienVanTaiPersistence _persistence;
}