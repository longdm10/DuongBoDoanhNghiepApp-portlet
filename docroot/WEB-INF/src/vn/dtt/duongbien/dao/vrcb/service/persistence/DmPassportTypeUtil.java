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

import vn.dtt.duongbien.dao.vrcb.model.DmPassportType;

import java.util.List;

/**
 * The persistence utility for the dm passport type service. This utility wraps {@link DmPassportTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmPassportTypePersistence
 * @see DmPassportTypePersistenceImpl
 * @generated
 */
public class DmPassportTypeUtil {
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
	public static void clearCache(DmPassportType dmPassportType) {
		getPersistence().clearCache(dmPassportType);
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
	public static List<DmPassportType> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmPassportType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmPassportType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmPassportType update(DmPassportType dmPassportType)
		throws SystemException {
		return getPersistence().update(dmPassportType);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmPassportType update(DmPassportType dmPassportType,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmPassportType, serviceContext);
	}

	/**
	* Returns all the dm passport types where passportTypeCode = &#63;.
	*
	* @param passportTypeCode the passport type code
	* @return the matching dm passport types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPassportType> findByPassportTypeCode(
		java.lang.String passportTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPassportTypeCode(passportTypeCode);
	}

	/**
	* Returns a range of all the dm passport types where passportTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPassportTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param passportTypeCode the passport type code
	* @param start the lower bound of the range of dm passport types
	* @param end the upper bound of the range of dm passport types (not inclusive)
	* @return the range of matching dm passport types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPassportType> findByPassportTypeCode(
		java.lang.String passportTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPassportTypeCode(passportTypeCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm passport types where passportTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPassportTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param passportTypeCode the passport type code
	* @param start the lower bound of the range of dm passport types
	* @param end the upper bound of the range of dm passport types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm passport types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPassportType> findByPassportTypeCode(
		java.lang.String passportTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPassportTypeCode(passportTypeCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm passport type in the ordered set where passportTypeCode = &#63;.
	*
	* @param passportTypeCode the passport type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm passport type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException if a matching dm passport type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPassportType findByPassportTypeCode_First(
		java.lang.String passportTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException {
		return getPersistence()
				   .findByPassportTypeCode_First(passportTypeCode,
			orderByComparator);
	}

	/**
	* Returns the first dm passport type in the ordered set where passportTypeCode = &#63;.
	*
	* @param passportTypeCode the passport type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm passport type, or <code>null</code> if a matching dm passport type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPassportType fetchByPassportTypeCode_First(
		java.lang.String passportTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPassportTypeCode_First(passportTypeCode,
			orderByComparator);
	}

	/**
	* Returns the last dm passport type in the ordered set where passportTypeCode = &#63;.
	*
	* @param passportTypeCode the passport type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm passport type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException if a matching dm passport type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPassportType findByPassportTypeCode_Last(
		java.lang.String passportTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException {
		return getPersistence()
				   .findByPassportTypeCode_Last(passportTypeCode,
			orderByComparator);
	}

	/**
	* Returns the last dm passport type in the ordered set where passportTypeCode = &#63;.
	*
	* @param passportTypeCode the passport type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm passport type, or <code>null</code> if a matching dm passport type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPassportType fetchByPassportTypeCode_Last(
		java.lang.String passportTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPassportTypeCode_Last(passportTypeCode,
			orderByComparator);
	}

	/**
	* Returns the dm passport types before and after the current dm passport type in the ordered set where passportTypeCode = &#63;.
	*
	* @param id the primary key of the current dm passport type
	* @param passportTypeCode the passport type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm passport type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException if a dm passport type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPassportType[] findByPassportTypeCode_PrevAndNext(
		int id, java.lang.String passportTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException {
		return getPersistence()
				   .findByPassportTypeCode_PrevAndNext(id, passportTypeCode,
			orderByComparator);
	}

	/**
	* Removes all the dm passport types where passportTypeCode = &#63; from the database.
	*
	* @param passportTypeCode the passport type code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPassportTypeCode(
		java.lang.String passportTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPassportTypeCode(passportTypeCode);
	}

	/**
	* Returns the number of dm passport types where passportTypeCode = &#63;.
	*
	* @param passportTypeCode the passport type code
	* @return the number of matching dm passport types
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPassportTypeCode(java.lang.String passportTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPassportTypeCode(passportTypeCode);
	}

	/**
	* Caches the dm passport type in the entity cache if it is enabled.
	*
	* @param dmPassportType the dm passport type
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmPassportType dmPassportType) {
		getPersistence().cacheResult(dmPassportType);
	}

	/**
	* Caches the dm passport types in the entity cache if it is enabled.
	*
	* @param dmPassportTypes the dm passport types
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPassportType> dmPassportTypes) {
		getPersistence().cacheResult(dmPassportTypes);
	}

	/**
	* Creates a new dm passport type with the primary key. Does not add the dm passport type to the database.
	*
	* @param id the primary key for the new dm passport type
	* @return the new dm passport type
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPassportType create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm passport type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm passport type
	* @return the dm passport type that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException if a dm passport type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPassportType remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.DmPassportType updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmPassportType dmPassportType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmPassportType);
	}

	/**
	* Returns the dm passport type with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException} if it could not be found.
	*
	* @param id the primary key of the dm passport type
	* @return the dm passport type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException if a dm passport type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPassportType findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm passport type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm passport type
	* @return the dm passport type, or <code>null</code> if a dm passport type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmPassportType fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm passport types.
	*
	* @return the dm passport types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPassportType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm passport types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPassportTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm passport types
	* @param end the upper bound of the range of dm passport types (not inclusive)
	* @return the range of dm passport types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPassportType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm passport types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPassportTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm passport types
	* @param end the upper bound of the range of dm passport types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm passport types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPassportType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm passport types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm passport types.
	*
	* @return the number of dm passport types
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmPassportTypePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmPassportTypePersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					DmPassportTypePersistence.class.getName());

			ReferenceRegistry.registerReference(DmPassportTypeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmPassportTypePersistence persistence) {
	}

	private static DmPassportTypePersistence _persistence;
}