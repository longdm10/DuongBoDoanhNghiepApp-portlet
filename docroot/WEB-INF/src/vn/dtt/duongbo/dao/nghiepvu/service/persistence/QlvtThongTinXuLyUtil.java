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

package vn.dtt.duongbo.dao.nghiepvu.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy;

import java.util.List;

/**
 * The persistence utility for the qlvt thong tin xu ly service. This utility wraps {@link QlvtThongTinXuLyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinXuLyPersistence
 * @see QlvtThongTinXuLyPersistenceImpl
 * @generated
 */
public class QlvtThongTinXuLyUtil {
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
	public static void clearCache(QlvtThongTinXuLy qlvtThongTinXuLy) {
		getPersistence().clearCache(qlvtThongTinXuLy);
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
	public static List<QlvtThongTinXuLy> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QlvtThongTinXuLy> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QlvtThongTinXuLy> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QlvtThongTinXuLy update(QlvtThongTinXuLy qlvtThongTinXuLy)
		throws SystemException {
		return getPersistence().update(qlvtThongTinXuLy);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QlvtThongTinXuLy update(QlvtThongTinXuLy qlvtThongTinXuLy,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(qlvtThongTinXuLy, serviceContext);
	}

	/**
	* Returns the qlvt thong tin xu ly where thongTinHoSoId = &#63; or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinXuLyException} if it could not be found.
	*
	* @param thongTinHoSoId the thong tin ho so ID
	* @return the matching qlvt thong tin xu ly
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinXuLyException if a matching qlvt thong tin xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy findBythongTinHoSoId(
		long thongTinHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinXuLyException {
		return getPersistence().findBythongTinHoSoId(thongTinHoSoId);
	}

	/**
	* Returns the qlvt thong tin xu ly where thongTinHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param thongTinHoSoId the thong tin ho so ID
	* @return the matching qlvt thong tin xu ly, or <code>null</code> if a matching qlvt thong tin xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy fetchBythongTinHoSoId(
		long thongTinHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBythongTinHoSoId(thongTinHoSoId);
	}

	/**
	* Returns the qlvt thong tin xu ly where thongTinHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param thongTinHoSoId the thong tin ho so ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching qlvt thong tin xu ly, or <code>null</code> if a matching qlvt thong tin xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy fetchBythongTinHoSoId(
		long thongTinHoSoId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBythongTinHoSoId(thongTinHoSoId, retrieveFromCache);
	}

	/**
	* Removes the qlvt thong tin xu ly where thongTinHoSoId = &#63; from the database.
	*
	* @param thongTinHoSoId the thong tin ho so ID
	* @return the qlvt thong tin xu ly that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy removeBythongTinHoSoId(
		long thongTinHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinXuLyException {
		return getPersistence().removeBythongTinHoSoId(thongTinHoSoId);
	}

	/**
	* Returns the number of qlvt thong tin xu lies where thongTinHoSoId = &#63;.
	*
	* @param thongTinHoSoId the thong tin ho so ID
	* @return the number of matching qlvt thong tin xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static int countBythongTinHoSoId(long thongTinHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBythongTinHoSoId(thongTinHoSoId);
	}

	/**
	* Caches the qlvt thong tin xu ly in the entity cache if it is enabled.
	*
	* @param qlvtThongTinXuLy the qlvt thong tin xu ly
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy qlvtThongTinXuLy) {
		getPersistence().cacheResult(qlvtThongTinXuLy);
	}

	/**
	* Caches the qlvt thong tin xu lies in the entity cache if it is enabled.
	*
	* @param qlvtThongTinXuLies the qlvt thong tin xu lies
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy> qlvtThongTinXuLies) {
		getPersistence().cacheResult(qlvtThongTinXuLies);
	}

	/**
	* Creates a new qlvt thong tin xu ly with the primary key. Does not add the qlvt thong tin xu ly to the database.
	*
	* @param id the primary key for the new qlvt thong tin xu ly
	* @return the new qlvt thong tin xu ly
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the qlvt thong tin xu ly with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt thong tin xu ly
	* @return the qlvt thong tin xu ly that was removed
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinXuLyException if a qlvt thong tin xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinXuLyException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy qlvtThongTinXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(qlvtThongTinXuLy);
	}

	/**
	* Returns the qlvt thong tin xu ly with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinXuLyException} if it could not be found.
	*
	* @param id the primary key of the qlvt thong tin xu ly
	* @return the qlvt thong tin xu ly
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinXuLyException if a qlvt thong tin xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinXuLyException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the qlvt thong tin xu ly with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt thong tin xu ly
	* @return the qlvt thong tin xu ly, or <code>null</code> if a qlvt thong tin xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the qlvt thong tin xu lies.
	*
	* @return the qlvt thong tin xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the qlvt thong tin xu lies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt thong tin xu lies
	* @param end the upper bound of the range of qlvt thong tin xu lies (not inclusive)
	* @return the range of qlvt thong tin xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the qlvt thong tin xu lies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt thong tin xu lies
	* @param end the upper bound of the range of qlvt thong tin xu lies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt thong tin xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the qlvt thong tin xu lies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of qlvt thong tin xu lies.
	*
	* @return the number of qlvt thong tin xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QlvtThongTinXuLyPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QlvtThongTinXuLyPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					QlvtThongTinXuLyPersistence.class.getName());

			ReferenceRegistry.registerReference(QlvtThongTinXuLyUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(QlvtThongTinXuLyPersistence persistence) {
	}

	private static QlvtThongTinXuLyPersistence _persistence;
}