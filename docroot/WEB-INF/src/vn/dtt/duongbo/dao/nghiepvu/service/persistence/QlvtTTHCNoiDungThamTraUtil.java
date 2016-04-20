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

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra;

import java.util.List;

/**
 * The persistence utility for the qlvt t t h c noi dung tham tra service. This utility wraps {@link QlvtTTHCNoiDungThamTraPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtTTHCNoiDungThamTraPersistence
 * @see QlvtTTHCNoiDungThamTraPersistenceImpl
 * @generated
 */
public class QlvtTTHCNoiDungThamTraUtil {
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
	public static void clearCache(QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra) {
		getPersistence().clearCache(qlvtTTHCNoiDungThamTra);
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
	public static List<QlvtTTHCNoiDungThamTra> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QlvtTTHCNoiDungThamTra> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QlvtTTHCNoiDungThamTra> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QlvtTTHCNoiDungThamTra update(
		QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra)
		throws SystemException {
		return getPersistence().update(qlvtTTHCNoiDungThamTra);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QlvtTTHCNoiDungThamTra update(
		QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(qlvtTTHCNoiDungThamTra, serviceContext);
	}

	/**
	* Returns the qlvt t t h c noi dung tham tra where maTTHC = &#63; or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException} if it could not be found.
	*
	* @param maTTHC the ma t t h c
	* @return the matching qlvt t t h c noi dung tham tra
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException if a matching qlvt t t h c noi dung tham tra could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra findByF_MaTTHC(
		java.lang.String maTTHC)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException {
		return getPersistence().findByF_MaTTHC(maTTHC);
	}

	/**
	* Returns the qlvt t t h c noi dung tham tra where maTTHC = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maTTHC the ma t t h c
	* @return the matching qlvt t t h c noi dung tham tra, or <code>null</code> if a matching qlvt t t h c noi dung tham tra could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra fetchByF_MaTTHC(
		java.lang.String maTTHC)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByF_MaTTHC(maTTHC);
	}

	/**
	* Returns the qlvt t t h c noi dung tham tra where maTTHC = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maTTHC the ma t t h c
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching qlvt t t h c noi dung tham tra, or <code>null</code> if a matching qlvt t t h c noi dung tham tra could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra fetchByF_MaTTHC(
		java.lang.String maTTHC, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByF_MaTTHC(maTTHC, retrieveFromCache);
	}

	/**
	* Removes the qlvt t t h c noi dung tham tra where maTTHC = &#63; from the database.
	*
	* @param maTTHC the ma t t h c
	* @return the qlvt t t h c noi dung tham tra that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra removeByF_MaTTHC(
		java.lang.String maTTHC)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException {
		return getPersistence().removeByF_MaTTHC(maTTHC);
	}

	/**
	* Returns the number of qlvt t t h c noi dung tham tras where maTTHC = &#63;.
	*
	* @param maTTHC the ma t t h c
	* @return the number of matching qlvt t t h c noi dung tham tras
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_MaTTHC(java.lang.String maTTHC)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByF_MaTTHC(maTTHC);
	}

	/**
	* Caches the qlvt t t h c noi dung tham tra in the entity cache if it is enabled.
	*
	* @param qlvtTTHCNoiDungThamTra the qlvt t t h c noi dung tham tra
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra) {
		getPersistence().cacheResult(qlvtTTHCNoiDungThamTra);
	}

	/**
	* Caches the qlvt t t h c noi dung tham tras in the entity cache if it is enabled.
	*
	* @param qlvtTTHCNoiDungThamTras the qlvt t t h c noi dung tham tras
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra> qlvtTTHCNoiDungThamTras) {
		getPersistence().cacheResult(qlvtTTHCNoiDungThamTras);
	}

	/**
	* Creates a new qlvt t t h c noi dung tham tra with the primary key. Does not add the qlvt t t h c noi dung tham tra to the database.
	*
	* @param id the primary key for the new qlvt t t h c noi dung tham tra
	* @return the new qlvt t t h c noi dung tham tra
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the qlvt t t h c noi dung tham tra with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt t t h c noi dung tham tra
	* @return the qlvt t t h c noi dung tham tra that was removed
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException if a qlvt t t h c noi dung tham tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(qlvtTTHCNoiDungThamTra);
	}

	/**
	* Returns the qlvt t t h c noi dung tham tra with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException} if it could not be found.
	*
	* @param id the primary key of the qlvt t t h c noi dung tham tra
	* @return the qlvt t t h c noi dung tham tra
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException if a qlvt t t h c noi dung tham tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the qlvt t t h c noi dung tham tra with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt t t h c noi dung tham tra
	* @return the qlvt t t h c noi dung tham tra, or <code>null</code> if a qlvt t t h c noi dung tham tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the qlvt t t h c noi dung tham tras.
	*
	* @return the qlvt t t h c noi dung tham tras
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the qlvt t t h c noi dung tham tras.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCNoiDungThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt t t h c noi dung tham tras
	* @param end the upper bound of the range of qlvt t t h c noi dung tham tras (not inclusive)
	* @return the range of qlvt t t h c noi dung tham tras
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the qlvt t t h c noi dung tham tras.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCNoiDungThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt t t h c noi dung tham tras
	* @param end the upper bound of the range of qlvt t t h c noi dung tham tras (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt t t h c noi dung tham tras
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the qlvt t t h c noi dung tham tras from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of qlvt t t h c noi dung tham tras.
	*
	* @return the number of qlvt t t h c noi dung tham tras
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QlvtTTHCNoiDungThamTraPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QlvtTTHCNoiDungThamTraPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					QlvtTTHCNoiDungThamTraPersistence.class.getName());

			ReferenceRegistry.registerReference(QlvtTTHCNoiDungThamTraUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(QlvtTTHCNoiDungThamTraPersistence persistence) {
	}

	private static QlvtTTHCNoiDungThamTraPersistence _persistence;
}