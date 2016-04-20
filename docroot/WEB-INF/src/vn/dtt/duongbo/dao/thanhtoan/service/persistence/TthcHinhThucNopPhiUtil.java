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

package vn.dtt.duongbo.dao.thanhtoan.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi;

import java.util.List;

/**
 * The persistence utility for the tthc hinh thuc nop phi service. This utility wraps {@link TthcHinhThucNopPhiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcHinhThucNopPhiPersistence
 * @see TthcHinhThucNopPhiPersistenceImpl
 * @generated
 */
public class TthcHinhThucNopPhiUtil {
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
	public static void clearCache(TthcHinhThucNopPhi tthcHinhThucNopPhi) {
		getPersistence().clearCache(tthcHinhThucNopPhi);
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
	public static List<TthcHinhThucNopPhi> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TthcHinhThucNopPhi> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TthcHinhThucNopPhi> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TthcHinhThucNopPhi update(
		TthcHinhThucNopPhi tthcHinhThucNopPhi) throws SystemException {
		return getPersistence().update(tthcHinhThucNopPhi);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TthcHinhThucNopPhi update(
		TthcHinhThucNopPhi tthcHinhThucNopPhi, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(tthcHinhThucNopPhi, serviceContext);
	}

	/**
	* Returns the tthc hinh thuc nop phi where thuTucHanhChinhId = &#63; or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException} if it could not be found.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the matching tthc hinh thuc nop phi
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException if a matching tthc hinh thuc nop phi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi findByThuTucHanhChinhId(
		long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException {
		return getPersistence().findByThuTucHanhChinhId(thuTucHanhChinhId);
	}

	/**
	* Returns the tthc hinh thuc nop phi where thuTucHanhChinhId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the matching tthc hinh thuc nop phi, or <code>null</code> if a matching tthc hinh thuc nop phi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi fetchByThuTucHanhChinhId(
		long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByThuTucHanhChinhId(thuTucHanhChinhId);
	}

	/**
	* Returns the tthc hinh thuc nop phi where thuTucHanhChinhId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc hinh thuc nop phi, or <code>null</code> if a matching tthc hinh thuc nop phi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi fetchByThuTucHanhChinhId(
		long thuTucHanhChinhId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByThuTucHanhChinhId(thuTucHanhChinhId,
			retrieveFromCache);
	}

	/**
	* Removes the tthc hinh thuc nop phi where thuTucHanhChinhId = &#63; from the database.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the tthc hinh thuc nop phi that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi removeByThuTucHanhChinhId(
		long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException {
		return getPersistence().removeByThuTucHanhChinhId(thuTucHanhChinhId);
	}

	/**
	* Returns the number of tthc hinh thuc nop phis where thuTucHanhChinhId = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the number of matching tthc hinh thuc nop phis
	* @throws SystemException if a system exception occurred
	*/
	public static int countByThuTucHanhChinhId(long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByThuTucHanhChinhId(thuTucHanhChinhId);
	}

	/**
	* Caches the tthc hinh thuc nop phi in the entity cache if it is enabled.
	*
	* @param tthcHinhThucNopPhi the tthc hinh thuc nop phi
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi tthcHinhThucNopPhi) {
		getPersistence().cacheResult(tthcHinhThucNopPhi);
	}

	/**
	* Caches the tthc hinh thuc nop phis in the entity cache if it is enabled.
	*
	* @param tthcHinhThucNopPhis the tthc hinh thuc nop phis
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi> tthcHinhThucNopPhis) {
		getPersistence().cacheResult(tthcHinhThucNopPhis);
	}

	/**
	* Creates a new tthc hinh thuc nop phi with the primary key. Does not add the tthc hinh thuc nop phi to the database.
	*
	* @param id the primary key for the new tthc hinh thuc nop phi
	* @return the new tthc hinh thuc nop phi
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the tthc hinh thuc nop phi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc hinh thuc nop phi
	* @return the tthc hinh thuc nop phi that was removed
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException if a tthc hinh thuc nop phi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi updateImpl(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi tthcHinhThucNopPhi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tthcHinhThucNopPhi);
	}

	/**
	* Returns the tthc hinh thuc nop phi with the primary key or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException} if it could not be found.
	*
	* @param id the primary key of the tthc hinh thuc nop phi
	* @return the tthc hinh thuc nop phi
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException if a tthc hinh thuc nop phi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the tthc hinh thuc nop phi with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tthc hinh thuc nop phi
	* @return the tthc hinh thuc nop phi, or <code>null</code> if a tthc hinh thuc nop phi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the tthc hinh thuc nop phis.
	*
	* @return the tthc hinh thuc nop phis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tthc hinh thuc nop phis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcHinhThucNopPhiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc hinh thuc nop phis
	* @param end the upper bound of the range of tthc hinh thuc nop phis (not inclusive)
	* @return the range of tthc hinh thuc nop phis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tthc hinh thuc nop phis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcHinhThucNopPhiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc hinh thuc nop phis
	* @param end the upper bound of the range of tthc hinh thuc nop phis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc hinh thuc nop phis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tthc hinh thuc nop phis from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tthc hinh thuc nop phis.
	*
	* @return the number of tthc hinh thuc nop phis
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TthcHinhThucNopPhiPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TthcHinhThucNopPhiPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.thanhtoan.service.ClpSerializer.getServletContextName(),
					TthcHinhThucNopPhiPersistence.class.getName());

			ReferenceRegistry.registerReference(TthcHinhThucNopPhiUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TthcHinhThucNopPhiPersistence persistence) {
	}

	private static TthcHinhThucNopPhiPersistence _persistence;
}