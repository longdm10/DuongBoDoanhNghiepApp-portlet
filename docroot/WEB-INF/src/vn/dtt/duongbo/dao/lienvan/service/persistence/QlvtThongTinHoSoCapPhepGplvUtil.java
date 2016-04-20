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

package vn.dtt.duongbo.dao.lienvan.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv;

import java.util.List;

/**
 * The persistence utility for the qlvt thong tin ho so cap phep gplv service. This utility wraps {@link QlvtThongTinHoSoCapPhepGplvPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoCapPhepGplvPersistence
 * @see QlvtThongTinHoSoCapPhepGplvPersistenceImpl
 * @generated
 */
public class QlvtThongTinHoSoCapPhepGplvUtil {
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
	public static void clearCache(
		QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv) {
		getPersistence().clearCache(qlvtThongTinHoSoCapPhepGplv);
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
	public static List<QlvtThongTinHoSoCapPhepGplv> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QlvtThongTinHoSoCapPhepGplv> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QlvtThongTinHoSoCapPhepGplv> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QlvtThongTinHoSoCapPhepGplv update(
		QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv)
		throws SystemException {
		return getPersistence().update(qlvtThongTinHoSoCapPhepGplv);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QlvtThongTinHoSoCapPhepGplv update(
		QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(qlvtThongTinHoSoCapPhepGplv, serviceContext);
	}

	/**
	* Caches the qlvt thong tin ho so cap phep gplv in the entity cache if it is enabled.
	*
	* @param qlvtThongTinHoSoCapPhepGplv the qlvt thong tin ho so cap phep gplv
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv) {
		getPersistence().cacheResult(qlvtThongTinHoSoCapPhepGplv);
	}

	/**
	* Caches the qlvt thong tin ho so cap phep gplvs in the entity cache if it is enabled.
	*
	* @param qlvtThongTinHoSoCapPhepGplvs the qlvt thong tin ho so cap phep gplvs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv> qlvtThongTinHoSoCapPhepGplvs) {
		getPersistence().cacheResult(qlvtThongTinHoSoCapPhepGplvs);
	}

	/**
	* Creates a new qlvt thong tin ho so cap phep gplv with the primary key. Does not add the qlvt thong tin ho so cap phep gplv to the database.
	*
	* @param id the primary key for the new qlvt thong tin ho so cap phep gplv
	* @return the new qlvt thong tin ho so cap phep gplv
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the qlvt thong tin ho so cap phep gplv with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt thong tin ho so cap phep gplv
	* @return the qlvt thong tin ho so cap phep gplv that was removed
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoCapPhepGplvException if a qlvt thong tin ho so cap phep gplv with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoCapPhepGplvException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv updateImpl(
		vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(qlvtThongTinHoSoCapPhepGplv);
	}

	/**
	* Returns the qlvt thong tin ho so cap phep gplv with the primary key or throws a {@link vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoCapPhepGplvException} if it could not be found.
	*
	* @param id the primary key of the qlvt thong tin ho so cap phep gplv
	* @return the qlvt thong tin ho so cap phep gplv
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoCapPhepGplvException if a qlvt thong tin ho so cap phep gplv with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoCapPhepGplvException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the qlvt thong tin ho so cap phep gplv with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt thong tin ho so cap phep gplv
	* @return the qlvt thong tin ho so cap phep gplv, or <code>null</code> if a qlvt thong tin ho so cap phep gplv with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the qlvt thong tin ho so cap phep gplvs.
	*
	* @return the qlvt thong tin ho so cap phep gplvs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the qlvt thong tin ho so cap phep gplvs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoCapPhepGplvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt thong tin ho so cap phep gplvs
	* @param end the upper bound of the range of qlvt thong tin ho so cap phep gplvs (not inclusive)
	* @return the range of qlvt thong tin ho so cap phep gplvs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the qlvt thong tin ho so cap phep gplvs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoCapPhepGplvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt thong tin ho so cap phep gplvs
	* @param end the upper bound of the range of qlvt thong tin ho so cap phep gplvs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt thong tin ho so cap phep gplvs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the qlvt thong tin ho so cap phep gplvs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of qlvt thong tin ho so cap phep gplvs.
	*
	* @return the number of qlvt thong tin ho so cap phep gplvs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QlvtThongTinHoSoCapPhepGplvPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QlvtThongTinHoSoCapPhepGplvPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.lienvan.service.ClpSerializer.getServletContextName(),
					QlvtThongTinHoSoCapPhepGplvPersistence.class.getName());

			ReferenceRegistry.registerReference(QlvtThongTinHoSoCapPhepGplvUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(
		QlvtThongTinHoSoCapPhepGplvPersistence persistence) {
	}

	private static QlvtThongTinHoSoCapPhepGplvPersistence _persistence;
}