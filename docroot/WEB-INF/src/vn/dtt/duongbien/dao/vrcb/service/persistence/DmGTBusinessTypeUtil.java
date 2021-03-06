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

package vn.dtt.duongbien.dao.vrcb.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType;

import java.util.List;

/**
 * The persistence utility for the dm g t business type service. This utility wraps {@link DmGTBusinessTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmGTBusinessTypePersistence
 * @see DmGTBusinessTypePersistenceImpl
 * @generated
 */
public class DmGTBusinessTypeUtil {
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
	public static void clearCache(DmGTBusinessType dmGTBusinessType) {
		getPersistence().clearCache(dmGTBusinessType);
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
	public static List<DmGTBusinessType> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmGTBusinessType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmGTBusinessType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmGTBusinessType update(DmGTBusinessType dmGTBusinessType)
		throws SystemException {
		return getPersistence().update(dmGTBusinessType);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmGTBusinessType update(DmGTBusinessType dmGTBusinessType,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmGTBusinessType, serviceContext);
	}

	/**
	* Returns the dm g t business type where businessTypeCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGTBusinessTypeException} if it could not be found.
	*
	* @param businessTypeCode the business type code
	* @return the matching dm g t business type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGTBusinessTypeException if a matching dm g t business type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType findByBusinessTypeCode(
		int businessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGTBusinessTypeException {
		return getPersistence().findByBusinessTypeCode(businessTypeCode);
	}

	/**
	* Returns the dm g t business type where businessTypeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param businessTypeCode the business type code
	* @return the matching dm g t business type, or <code>null</code> if a matching dm g t business type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType fetchByBusinessTypeCode(
		int businessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByBusinessTypeCode(businessTypeCode);
	}

	/**
	* Returns the dm g t business type where businessTypeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param businessTypeCode the business type code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm g t business type, or <code>null</code> if a matching dm g t business type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType fetchByBusinessTypeCode(
		int businessTypeCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByBusinessTypeCode(businessTypeCode, retrieveFromCache);
	}

	/**
	* Removes the dm g t business type where businessTypeCode = &#63; from the database.
	*
	* @param businessTypeCode the business type code
	* @return the dm g t business type that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType removeByBusinessTypeCode(
		int businessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGTBusinessTypeException {
		return getPersistence().removeByBusinessTypeCode(businessTypeCode);
	}

	/**
	* Returns the number of dm g t business types where businessTypeCode = &#63;.
	*
	* @param businessTypeCode the business type code
	* @return the number of matching dm g t business types
	* @throws SystemException if a system exception occurred
	*/
	public static int countByBusinessTypeCode(int businessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByBusinessTypeCode(businessTypeCode);
	}

	/**
	* Caches the dm g t business type in the entity cache if it is enabled.
	*
	* @param dmGTBusinessType the dm g t business type
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType dmGTBusinessType) {
		getPersistence().cacheResult(dmGTBusinessType);
	}

	/**
	* Caches the dm g t business types in the entity cache if it is enabled.
	*
	* @param dmGTBusinessTypes the dm g t business types
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType> dmGTBusinessTypes) {
		getPersistence().cacheResult(dmGTBusinessTypes);
	}

	/**
	* Creates a new dm g t business type with the primary key. Does not add the dm g t business type to the database.
	*
	* @param id the primary key for the new dm g t business type
	* @return the new dm g t business type
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm g t business type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm g t business type
	* @return the dm g t business type that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGTBusinessTypeException if a dm g t business type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGTBusinessTypeException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType dmGTBusinessType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmGTBusinessType);
	}

	/**
	* Returns the dm g t business type with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGTBusinessTypeException} if it could not be found.
	*
	* @param id the primary key of the dm g t business type
	* @return the dm g t business type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGTBusinessTypeException if a dm g t business type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGTBusinessTypeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm g t business type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm g t business type
	* @return the dm g t business type, or <code>null</code> if a dm g t business type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm g t business types.
	*
	* @return the dm g t business types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm g t business types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGTBusinessTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm g t business types
	* @param end the upper bound of the range of dm g t business types (not inclusive)
	* @return the range of dm g t business types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm g t business types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGTBusinessTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm g t business types
	* @param end the upper bound of the range of dm g t business types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm g t business types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm g t business types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm g t business types.
	*
	* @return the number of dm g t business types
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmGTBusinessTypePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmGTBusinessTypePersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					DmGTBusinessTypePersistence.class.getName());

			ReferenceRegistry.registerReference(DmGTBusinessTypeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmGTBusinessTypePersistence persistence) {
	}

	private static DmGTBusinessTypePersistence _persistence;
}