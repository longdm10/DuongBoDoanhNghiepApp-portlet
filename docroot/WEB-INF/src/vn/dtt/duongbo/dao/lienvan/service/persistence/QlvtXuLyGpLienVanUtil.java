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

import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan;

import java.util.List;

/**
 * The persistence utility for the qlvt xu ly gp lien van service. This utility wraps {@link QlvtXuLyGpLienVanPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanPersistence
 * @see QlvtXuLyGpLienVanPersistenceImpl
 * @generated
 */
public class QlvtXuLyGpLienVanUtil {
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
	public static void clearCache(QlvtXuLyGpLienVan qlvtXuLyGpLienVan) {
		getPersistence().clearCache(qlvtXuLyGpLienVan);
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
	public static List<QlvtXuLyGpLienVan> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QlvtXuLyGpLienVan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QlvtXuLyGpLienVan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QlvtXuLyGpLienVan update(QlvtXuLyGpLienVan qlvtXuLyGpLienVan)
		throws SystemException {
		return getPersistence().update(qlvtXuLyGpLienVan);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QlvtXuLyGpLienVan update(
		QlvtXuLyGpLienVan qlvtXuLyGpLienVan, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(qlvtXuLyGpLienVan, serviceContext);
	}

	/**
	* Returns the qlvt xu ly gp lien van where thongTinXuLyId = &#63; or throws a {@link vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanException} if it could not be found.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the matching qlvt xu ly gp lien van
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanException if a matching qlvt xu ly gp lien van could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan findBythongTinXuLyId(
		long thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanException {
		return getPersistence().findBythongTinXuLyId(thongTinXuLyId);
	}

	/**
	* Returns the qlvt xu ly gp lien van where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the matching qlvt xu ly gp lien van, or <code>null</code> if a matching qlvt xu ly gp lien van could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan fetchBythongTinXuLyId(
		long thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBythongTinXuLyId(thongTinXuLyId);
	}

	/**
	* Returns the qlvt xu ly gp lien van where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching qlvt xu ly gp lien van, or <code>null</code> if a matching qlvt xu ly gp lien van could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan fetchBythongTinXuLyId(
		long thongTinXuLyId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBythongTinXuLyId(thongTinXuLyId, retrieveFromCache);
	}

	/**
	* Removes the qlvt xu ly gp lien van where thongTinXuLyId = &#63; from the database.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the qlvt xu ly gp lien van that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan removeBythongTinXuLyId(
		long thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanException {
		return getPersistence().removeBythongTinXuLyId(thongTinXuLyId);
	}

	/**
	* Returns the number of qlvt xu ly gp lien vans where thongTinXuLyId = &#63;.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the number of matching qlvt xu ly gp lien vans
	* @throws SystemException if a system exception occurred
	*/
	public static int countBythongTinXuLyId(long thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBythongTinXuLyId(thongTinXuLyId);
	}

	/**
	* Caches the qlvt xu ly gp lien van in the entity cache if it is enabled.
	*
	* @param qlvtXuLyGpLienVan the qlvt xu ly gp lien van
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan qlvtXuLyGpLienVan) {
		getPersistence().cacheResult(qlvtXuLyGpLienVan);
	}

	/**
	* Caches the qlvt xu ly gp lien vans in the entity cache if it is enabled.
	*
	* @param qlvtXuLyGpLienVans the qlvt xu ly gp lien vans
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan> qlvtXuLyGpLienVans) {
		getPersistence().cacheResult(qlvtXuLyGpLienVans);
	}

	/**
	* Creates a new qlvt xu ly gp lien van with the primary key. Does not add the qlvt xu ly gp lien van to the database.
	*
	* @param id the primary key for the new qlvt xu ly gp lien van
	* @return the new qlvt xu ly gp lien van
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the qlvt xu ly gp lien van with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt xu ly gp lien van
	* @return the qlvt xu ly gp lien van that was removed
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanException if a qlvt xu ly gp lien van with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan updateImpl(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan qlvtXuLyGpLienVan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(qlvtXuLyGpLienVan);
	}

	/**
	* Returns the qlvt xu ly gp lien van with the primary key or throws a {@link vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanException} if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly gp lien van
	* @return the qlvt xu ly gp lien van
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanException if a qlvt xu ly gp lien van with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the qlvt xu ly gp lien van with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly gp lien van
	* @return the qlvt xu ly gp lien van, or <code>null</code> if a qlvt xu ly gp lien van with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the qlvt xu ly gp lien vans.
	*
	* @return the qlvt xu ly gp lien vans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the qlvt xu ly gp lien vans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly gp lien vans
	* @param end the upper bound of the range of qlvt xu ly gp lien vans (not inclusive)
	* @return the range of qlvt xu ly gp lien vans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the qlvt xu ly gp lien vans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly gp lien vans
	* @param end the upper bound of the range of qlvt xu ly gp lien vans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt xu ly gp lien vans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the qlvt xu ly gp lien vans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of qlvt xu ly gp lien vans.
	*
	* @return the number of qlvt xu ly gp lien vans
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QlvtXuLyGpLienVanPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QlvtXuLyGpLienVanPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.lienvan.service.ClpSerializer.getServletContextName(),
					QlvtXuLyGpLienVanPersistence.class.getName());

			ReferenceRegistry.registerReference(QlvtXuLyGpLienVanUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(QlvtXuLyGpLienVanPersistence persistence) {
	}

	private static QlvtXuLyGpLienVanPersistence _persistence;
}