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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType;

import java.util.List;

/**
 * The persistence utility for the dm history goods type service. This utility wraps {@link DmHistoryGoodsTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryGoodsTypePersistence
 * @see DmHistoryGoodsTypePersistenceImpl
 * @generated
 */
public class DmHistoryGoodsTypeUtil {
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
	public static void clearCache(DmHistoryGoodsType dmHistoryGoodsType) {
		getPersistence().clearCache(dmHistoryGoodsType);
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
	public static List<DmHistoryGoodsType> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmHistoryGoodsType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmHistoryGoodsType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmHistoryGoodsType update(
		DmHistoryGoodsType dmHistoryGoodsType) throws SystemException {
		return getPersistence().update(dmHistoryGoodsType);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmHistoryGoodsType update(
		DmHistoryGoodsType dmHistoryGoodsType, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(dmHistoryGoodsType, serviceContext);
	}

	/**
	* Returns all the dm history goods types where goodsTypeCode = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @return the matching dm history goods types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType> findByGoodsTypeCode(
		java.lang.String goodsTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGoodsTypeCode(goodsTypeCode);
	}

	/**
	* Returns a range of all the dm history goods types where goodsTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param goodsTypeCode the goods type code
	* @param start the lower bound of the range of dm history goods types
	* @param end the upper bound of the range of dm history goods types (not inclusive)
	* @return the range of matching dm history goods types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType> findByGoodsTypeCode(
		java.lang.String goodsTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGoodsTypeCode(goodsTypeCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm history goods types where goodsTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param goodsTypeCode the goods type code
	* @param start the lower bound of the range of dm history goods types
	* @param end the upper bound of the range of dm history goods types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history goods types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType> findByGoodsTypeCode(
		java.lang.String goodsTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGoodsTypeCode(goodsTypeCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm history goods type in the ordered set where goodsTypeCode = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history goods type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException if a matching dm history goods type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType findByGoodsTypeCode_First(
		java.lang.String goodsTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException {
		return getPersistence()
				   .findByGoodsTypeCode_First(goodsTypeCode, orderByComparator);
	}

	/**
	* Returns the first dm history goods type in the ordered set where goodsTypeCode = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history goods type, or <code>null</code> if a matching dm history goods type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType fetchByGoodsTypeCode_First(
		java.lang.String goodsTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGoodsTypeCode_First(goodsTypeCode, orderByComparator);
	}

	/**
	* Returns the last dm history goods type in the ordered set where goodsTypeCode = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history goods type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException if a matching dm history goods type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType findByGoodsTypeCode_Last(
		java.lang.String goodsTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException {
		return getPersistence()
				   .findByGoodsTypeCode_Last(goodsTypeCode, orderByComparator);
	}

	/**
	* Returns the last dm history goods type in the ordered set where goodsTypeCode = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history goods type, or <code>null</code> if a matching dm history goods type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType fetchByGoodsTypeCode_Last(
		java.lang.String goodsTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGoodsTypeCode_Last(goodsTypeCode, orderByComparator);
	}

	/**
	* Returns the dm history goods types before and after the current dm history goods type in the ordered set where goodsTypeCode = &#63;.
	*
	* @param id the primary key of the current dm history goods type
	* @param goodsTypeCode the goods type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history goods type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException if a dm history goods type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType[] findByGoodsTypeCode_PrevAndNext(
		int id, java.lang.String goodsTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException {
		return getPersistence()
				   .findByGoodsTypeCode_PrevAndNext(id, goodsTypeCode,
			orderByComparator);
	}

	/**
	* Removes all the dm history goods types where goodsTypeCode = &#63; from the database.
	*
	* @param goodsTypeCode the goods type code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGoodsTypeCode(java.lang.String goodsTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGoodsTypeCode(goodsTypeCode);
	}

	/**
	* Returns the number of dm history goods types where goodsTypeCode = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @return the number of matching dm history goods types
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGoodsTypeCode(java.lang.String goodsTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGoodsTypeCode(goodsTypeCode);
	}

	/**
	* Returns the dm history goods type where goodsTypeCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException} if it could not be found.
	*
	* @param goodsTypeCode the goods type code
	* @param syncVersion the sync version
	* @return the matching dm history goods type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException if a matching dm history goods type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType findByGoodsTypeCodeAndSyncVersion(
		java.lang.String goodsTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException {
		return getPersistence()
				   .findByGoodsTypeCodeAndSyncVersion(goodsTypeCode, syncVersion);
	}

	/**
	* Returns the dm history goods type where goodsTypeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param goodsTypeCode the goods type code
	* @param syncVersion the sync version
	* @return the matching dm history goods type, or <code>null</code> if a matching dm history goods type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType fetchByGoodsTypeCodeAndSyncVersion(
		java.lang.String goodsTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGoodsTypeCodeAndSyncVersion(goodsTypeCode,
			syncVersion);
	}

	/**
	* Returns the dm history goods type where goodsTypeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param goodsTypeCode the goods type code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history goods type, or <code>null</code> if a matching dm history goods type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType fetchByGoodsTypeCodeAndSyncVersion(
		java.lang.String goodsTypeCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGoodsTypeCodeAndSyncVersion(goodsTypeCode,
			syncVersion, retrieveFromCache);
	}

	/**
	* Removes the dm history goods type where goodsTypeCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param goodsTypeCode the goods type code
	* @param syncVersion the sync version
	* @return the dm history goods type that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType removeByGoodsTypeCodeAndSyncVersion(
		java.lang.String goodsTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException {
		return getPersistence()
				   .removeByGoodsTypeCodeAndSyncVersion(goodsTypeCode,
			syncVersion);
	}

	/**
	* Returns the number of dm history goods types where goodsTypeCode = &#63; and syncVersion = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @param syncVersion the sync version
	* @return the number of matching dm history goods types
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGoodsTypeCodeAndSyncVersion(
		java.lang.String goodsTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByGoodsTypeCodeAndSyncVersion(goodsTypeCode,
			syncVersion);
	}

	/**
	* Caches the dm history goods type in the entity cache if it is enabled.
	*
	* @param dmHistoryGoodsType the dm history goods type
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType dmHistoryGoodsType) {
		getPersistence().cacheResult(dmHistoryGoodsType);
	}

	/**
	* Caches the dm history goods types in the entity cache if it is enabled.
	*
	* @param dmHistoryGoodsTypes the dm history goods types
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType> dmHistoryGoodsTypes) {
		getPersistence().cacheResult(dmHistoryGoodsTypes);
	}

	/**
	* Creates a new dm history goods type with the primary key. Does not add the dm history goods type to the database.
	*
	* @param id the primary key for the new dm history goods type
	* @return the new dm history goods type
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType create(
		int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm history goods type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history goods type
	* @return the dm history goods type that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException if a dm history goods type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType dmHistoryGoodsType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmHistoryGoodsType);
	}

	/**
	* Returns the dm history goods type with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException} if it could not be found.
	*
	* @param id the primary key of the dm history goods type
	* @return the dm history goods type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException if a dm history goods type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm history goods type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history goods type
	* @return the dm history goods type, or <code>null</code> if a dm history goods type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm history goods types.
	*
	* @return the dm history goods types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm history goods types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history goods types
	* @param end the upper bound of the range of dm history goods types (not inclusive)
	* @return the range of dm history goods types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm history goods types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history goods types
	* @param end the upper bound of the range of dm history goods types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history goods types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm history goods types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm history goods types.
	*
	* @return the number of dm history goods types
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmHistoryGoodsTypePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmHistoryGoodsTypePersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					DmHistoryGoodsTypePersistence.class.getName());

			ReferenceRegistry.registerReference(DmHistoryGoodsTypeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmHistoryGoodsTypePersistence persistence) {
	}

	private static DmHistoryGoodsTypePersistence _persistence;
}