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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig;

/**
 * The persistence interface for the dm gt route config service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmGtRouteConfigPersistenceImpl
 * @see DmGtRouteConfigUtil
 * @generated
 */
public interface DmGtRouteConfigPersistence extends BasePersistence<DmGtRouteConfig> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmGtRouteConfigUtil} to access the dm gt route config persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the dm gt route config where routeCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException} if it could not be found.
	*
	* @param routeCode the route code
	* @return the matching dm gt route config
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException if a matching dm gt route config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig findByRouteCode(
		java.lang.String routeCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException;

	/**
	* Returns the dm gt route config where routeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param routeCode the route code
	* @return the matching dm gt route config, or <code>null</code> if a matching dm gt route config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig fetchByRouteCode(
		java.lang.String routeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm gt route config where routeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param routeCode the route code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm gt route config, or <code>null</code> if a matching dm gt route config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig fetchByRouteCode(
		java.lang.String routeCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm gt route config where routeCode = &#63; from the database.
	*
	* @param routeCode the route code
	* @return the dm gt route config that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig removeByRouteCode(
		java.lang.String routeCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException;

	/**
	* Returns the number of dm gt route configs where routeCode = &#63;.
	*
	* @param routeCode the route code
	* @return the number of matching dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public int countByRouteCode(java.lang.String routeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm gt route configs where isDelete = &#63;.
	*
	* @param isDelete the is delete
	* @return the matching dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig> findByIsDelete(
		int isDelete)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm gt route configs where isDelete = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtRouteConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isDelete the is delete
	* @param start the lower bound of the range of dm gt route configs
	* @param end the upper bound of the range of dm gt route configs (not inclusive)
	* @return the range of matching dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig> findByIsDelete(
		int isDelete, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm gt route configs where isDelete = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtRouteConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isDelete the is delete
	* @param start the lower bound of the range of dm gt route configs
	* @param end the upper bound of the range of dm gt route configs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig> findByIsDelete(
		int isDelete, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm gt route config in the ordered set where isDelete = &#63;.
	*
	* @param isDelete the is delete
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm gt route config
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException if a matching dm gt route config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig findByIsDelete_First(
		int isDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException;

	/**
	* Returns the first dm gt route config in the ordered set where isDelete = &#63;.
	*
	* @param isDelete the is delete
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm gt route config, or <code>null</code> if a matching dm gt route config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig fetchByIsDelete_First(
		int isDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm gt route config in the ordered set where isDelete = &#63;.
	*
	* @param isDelete the is delete
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm gt route config
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException if a matching dm gt route config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig findByIsDelete_Last(
		int isDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException;

	/**
	* Returns the last dm gt route config in the ordered set where isDelete = &#63;.
	*
	* @param isDelete the is delete
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm gt route config, or <code>null</code> if a matching dm gt route config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig fetchByIsDelete_Last(
		int isDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm gt route configs before and after the current dm gt route config in the ordered set where isDelete = &#63;.
	*
	* @param id the primary key of the current dm gt route config
	* @param isDelete the is delete
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm gt route config
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException if a dm gt route config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig[] findByIsDelete_PrevAndNext(
		long id, int isDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException;

	/**
	* Removes all the dm gt route configs where isDelete = &#63; from the database.
	*
	* @param isDelete the is delete
	* @throws SystemException if a system exception occurred
	*/
	public void removeByIsDelete(int isDelete)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm gt route configs where isDelete = &#63;.
	*
	* @param isDelete the is delete
	* @return the number of matching dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public int countByIsDelete(int isDelete)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm gt route config in the entity cache if it is enabled.
	*
	* @param dmGtRouteConfig the dm gt route config
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig dmGtRouteConfig);

	/**
	* Caches the dm gt route configs in the entity cache if it is enabled.
	*
	* @param dmGtRouteConfigs the dm gt route configs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig> dmGtRouteConfigs);

	/**
	* Creates a new dm gt route config with the primary key. Does not add the dm gt route config to the database.
	*
	* @param id the primary key for the new dm gt route config
	* @return the new dm gt route config
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig create(long id);

	/**
	* Removes the dm gt route config with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm gt route config
	* @return the dm gt route config that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException if a dm gt route config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException;

	public vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig dmGtRouteConfig)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm gt route config with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException} if it could not be found.
	*
	* @param id the primary key of the dm gt route config
	* @return the dm gt route config
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException if a dm gt route config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException;

	/**
	* Returns the dm gt route config with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm gt route config
	* @return the dm gt route config, or <code>null</code> if a dm gt route config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm gt route configs.
	*
	* @return the dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm gt route configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtRouteConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm gt route configs
	* @param end the upper bound of the range of dm gt route configs (not inclusive)
	* @return the range of dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm gt route configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtRouteConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm gt route configs
	* @param end the upper bound of the range of dm gt route configs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfig> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm gt route configs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm gt route configs.
	*
	* @return the number of dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}