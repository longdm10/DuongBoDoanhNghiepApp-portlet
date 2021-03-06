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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods;

import java.util.List;

/**
 * The persistence utility for the dm history goods service. This utility wraps {@link DmHistoryGoodsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryGoodsPersistence
 * @see DmHistoryGoodsPersistenceImpl
 * @generated
 */
public class DmHistoryGoodsUtil {
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
	public static void clearCache(DmHistoryGoods dmHistoryGoods) {
		getPersistence().clearCache(dmHistoryGoods);
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
	public static List<DmHistoryGoods> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmHistoryGoods> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmHistoryGoods> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmHistoryGoods update(DmHistoryGoods dmHistoryGoods)
		throws SystemException {
		return getPersistence().update(dmHistoryGoods);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmHistoryGoods update(DmHistoryGoods dmHistoryGoods,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmHistoryGoods, serviceContext);
	}

	/**
	* Returns all the dm history goodses where goodsItemCode = &#63;.
	*
	* @param goodsItemCode the goods item code
	* @return the matching dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods> findByGoodsItemCode(
		java.lang.String goodsItemCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGoodsItemCode(goodsItemCode);
	}

	/**
	* Returns a range of all the dm history goodses where goodsItemCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param goodsItemCode the goods item code
	* @param start the lower bound of the range of dm history goodses
	* @param end the upper bound of the range of dm history goodses (not inclusive)
	* @return the range of matching dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods> findByGoodsItemCode(
		java.lang.String goodsItemCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGoodsItemCode(goodsItemCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm history goodses where goodsItemCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param goodsItemCode the goods item code
	* @param start the lower bound of the range of dm history goodses
	* @param end the upper bound of the range of dm history goodses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods> findByGoodsItemCode(
		java.lang.String goodsItemCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGoodsItemCode(goodsItemCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm history goods in the ordered set where goodsItemCode = &#63;.
	*
	* @param goodsItemCode the goods item code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history goods
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException if a matching dm history goods could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods findByGoodsItemCode_First(
		java.lang.String goodsItemCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException {
		return getPersistence()
				   .findByGoodsItemCode_First(goodsItemCode, orderByComparator);
	}

	/**
	* Returns the first dm history goods in the ordered set where goodsItemCode = &#63;.
	*
	* @param goodsItemCode the goods item code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history goods, or <code>null</code> if a matching dm history goods could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods fetchByGoodsItemCode_First(
		java.lang.String goodsItemCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGoodsItemCode_First(goodsItemCode, orderByComparator);
	}

	/**
	* Returns the last dm history goods in the ordered set where goodsItemCode = &#63;.
	*
	* @param goodsItemCode the goods item code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history goods
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException if a matching dm history goods could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods findByGoodsItemCode_Last(
		java.lang.String goodsItemCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException {
		return getPersistence()
				   .findByGoodsItemCode_Last(goodsItemCode, orderByComparator);
	}

	/**
	* Returns the last dm history goods in the ordered set where goodsItemCode = &#63;.
	*
	* @param goodsItemCode the goods item code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history goods, or <code>null</code> if a matching dm history goods could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods fetchByGoodsItemCode_Last(
		java.lang.String goodsItemCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGoodsItemCode_Last(goodsItemCode, orderByComparator);
	}

	/**
	* Returns the dm history goodses before and after the current dm history goods in the ordered set where goodsItemCode = &#63;.
	*
	* @param id the primary key of the current dm history goods
	* @param goodsItemCode the goods item code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history goods
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException if a dm history goods with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods[] findByGoodsItemCode_PrevAndNext(
		int id, java.lang.String goodsItemCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException {
		return getPersistence()
				   .findByGoodsItemCode_PrevAndNext(id, goodsItemCode,
			orderByComparator);
	}

	/**
	* Removes all the dm history goodses where goodsItemCode = &#63; from the database.
	*
	* @param goodsItemCode the goods item code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGoodsItemCode(java.lang.String goodsItemCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGoodsItemCode(goodsItemCode);
	}

	/**
	* Returns the number of dm history goodses where goodsItemCode = &#63;.
	*
	* @param goodsItemCode the goods item code
	* @return the number of matching dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGoodsItemCode(java.lang.String goodsItemCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGoodsItemCode(goodsItemCode);
	}

	/**
	* Returns the dm history goods where goodsItemCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException} if it could not be found.
	*
	* @param goodsItemCode the goods item code
	* @param syncVersion the sync version
	* @return the matching dm history goods
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException if a matching dm history goods could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods findByGoodsItemCodeAndSyncVersion(
		java.lang.String goodsItemCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException {
		return getPersistence()
				   .findByGoodsItemCodeAndSyncVersion(goodsItemCode, syncVersion);
	}

	/**
	* Returns the dm history goods where goodsItemCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param goodsItemCode the goods item code
	* @param syncVersion the sync version
	* @return the matching dm history goods, or <code>null</code> if a matching dm history goods could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods fetchByGoodsItemCodeAndSyncVersion(
		java.lang.String goodsItemCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGoodsItemCodeAndSyncVersion(goodsItemCode,
			syncVersion);
	}

	/**
	* Returns the dm history goods where goodsItemCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param goodsItemCode the goods item code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history goods, or <code>null</code> if a matching dm history goods could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods fetchByGoodsItemCodeAndSyncVersion(
		java.lang.String goodsItemCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGoodsItemCodeAndSyncVersion(goodsItemCode,
			syncVersion, retrieveFromCache);
	}

	/**
	* Removes the dm history goods where goodsItemCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param goodsItemCode the goods item code
	* @param syncVersion the sync version
	* @return the dm history goods that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods removeByGoodsItemCodeAndSyncVersion(
		java.lang.String goodsItemCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException {
		return getPersistence()
				   .removeByGoodsItemCodeAndSyncVersion(goodsItemCode,
			syncVersion);
	}

	/**
	* Returns the number of dm history goodses where goodsItemCode = &#63; and syncVersion = &#63;.
	*
	* @param goodsItemCode the goods item code
	* @param syncVersion the sync version
	* @return the number of matching dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGoodsItemCodeAndSyncVersion(
		java.lang.String goodsItemCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByGoodsItemCodeAndSyncVersion(goodsItemCode,
			syncVersion);
	}

	/**
	* Caches the dm history goods in the entity cache if it is enabled.
	*
	* @param dmHistoryGoods the dm history goods
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods dmHistoryGoods) {
		getPersistence().cacheResult(dmHistoryGoods);
	}

	/**
	* Caches the dm history goodses in the entity cache if it is enabled.
	*
	* @param dmHistoryGoodses the dm history goodses
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods> dmHistoryGoodses) {
		getPersistence().cacheResult(dmHistoryGoodses);
	}

	/**
	* Creates a new dm history goods with the primary key. Does not add the dm history goods to the database.
	*
	* @param id the primary key for the new dm history goods
	* @return the new dm history goods
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm history goods with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history goods
	* @return the dm history goods that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException if a dm history goods with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods dmHistoryGoods)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmHistoryGoods);
	}

	/**
	* Returns the dm history goods with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException} if it could not be found.
	*
	* @param id the primary key of the dm history goods
	* @return the dm history goods
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException if a dm history goods with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm history goods with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history goods
	* @return the dm history goods, or <code>null</code> if a dm history goods with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm history goodses.
	*
	* @return the dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm history goodses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history goodses
	* @param end the upper bound of the range of dm history goodses (not inclusive)
	* @return the range of dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm history goodses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history goodses
	* @param end the upper bound of the range of dm history goodses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm history goodses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm history goodses.
	*
	* @return the number of dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmHistoryGoodsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmHistoryGoodsPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					DmHistoryGoodsPersistence.class.getName());

			ReferenceRegistry.registerReference(DmHistoryGoodsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmHistoryGoodsPersistence persistence) {
	}

	private static DmHistoryGoodsPersistence _persistence;
}