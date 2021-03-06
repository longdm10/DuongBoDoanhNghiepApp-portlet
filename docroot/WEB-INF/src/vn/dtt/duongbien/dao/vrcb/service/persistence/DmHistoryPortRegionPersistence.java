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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion;

/**
 * The persistence interface for the dm history port region service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryPortRegionPersistenceImpl
 * @see DmHistoryPortRegionUtil
 * @generated
 */
public interface DmHistoryPortRegionPersistence extends BasePersistence<DmHistoryPortRegion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmHistoryPortRegionUtil} to access the dm history port region persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dm history port regions where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @return the matching dm history port regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion> findByPortRegionCode(
		java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history port regions where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortRegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param start the lower bound of the range of dm history port regions
	* @param end the upper bound of the range of dm history port regions (not inclusive)
	* @return the range of matching dm history port regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion> findByPortRegionCode(
		java.lang.String portRegionCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history port regions where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortRegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param start the lower bound of the range of dm history port regions
	* @param end the upper bound of the range of dm history port regions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history port regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion> findByPortRegionCode(
		java.lang.String portRegionCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm history port region in the ordered set where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history port region
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortRegionException if a matching dm history port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion findByPortRegionCode_First(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortRegionException;

	/**
	* Returns the first dm history port region in the ordered set where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history port region, or <code>null</code> if a matching dm history port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion fetchByPortRegionCode_First(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm history port region in the ordered set where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history port region
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortRegionException if a matching dm history port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion findByPortRegionCode_Last(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortRegionException;

	/**
	* Returns the last dm history port region in the ordered set where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history port region, or <code>null</code> if a matching dm history port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion fetchByPortRegionCode_Last(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history port regions before and after the current dm history port region in the ordered set where portRegionCode = &#63;.
	*
	* @param id the primary key of the current dm history port region
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history port region
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortRegionException if a dm history port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion[] findByPortRegionCode_PrevAndNext(
		int id, java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortRegionException;

	/**
	* Removes all the dm history port regions where portRegionCode = &#63; from the database.
	*
	* @param portRegionCode the port region code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPortRegionCode(java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history port regions where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @return the number of matching dm history port regions
	* @throws SystemException if a system exception occurred
	*/
	public int countByPortRegionCode(java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history port region where portRegionCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortRegionException} if it could not be found.
	*
	* @param portRegionCode the port region code
	* @param syncVersion the sync version
	* @return the matching dm history port region
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortRegionException if a matching dm history port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion findByPortRegionCodeAndSyncVersion(
		java.lang.String portRegionCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortRegionException;

	/**
	* Returns the dm history port region where portRegionCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param portRegionCode the port region code
	* @param syncVersion the sync version
	* @return the matching dm history port region, or <code>null</code> if a matching dm history port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion fetchByPortRegionCodeAndSyncVersion(
		java.lang.String portRegionCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history port region where portRegionCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param portRegionCode the port region code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history port region, or <code>null</code> if a matching dm history port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion fetchByPortRegionCodeAndSyncVersion(
		java.lang.String portRegionCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm history port region where portRegionCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param portRegionCode the port region code
	* @param syncVersion the sync version
	* @return the dm history port region that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion removeByPortRegionCodeAndSyncVersion(
		java.lang.String portRegionCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortRegionException;

	/**
	* Returns the number of dm history port regions where portRegionCode = &#63; and syncVersion = &#63;.
	*
	* @param portRegionCode the port region code
	* @param syncVersion the sync version
	* @return the number of matching dm history port regions
	* @throws SystemException if a system exception occurred
	*/
	public int countByPortRegionCodeAndSyncVersion(
		java.lang.String portRegionCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm history port region in the entity cache if it is enabled.
	*
	* @param dmHistoryPortRegion the dm history port region
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion dmHistoryPortRegion);

	/**
	* Caches the dm history port regions in the entity cache if it is enabled.
	*
	* @param dmHistoryPortRegions the dm history port regions
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion> dmHistoryPortRegions);

	/**
	* Creates a new dm history port region with the primary key. Does not add the dm history port region to the database.
	*
	* @param id the primary key for the new dm history port region
	* @return the new dm history port region
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion create(int id);

	/**
	* Removes the dm history port region with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history port region
	* @return the dm history port region that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortRegionException if a dm history port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortRegionException;

	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion dmHistoryPortRegion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history port region with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortRegionException} if it could not be found.
	*
	* @param id the primary key of the dm history port region
	* @return the dm history port region
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortRegionException if a dm history port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortRegionException;

	/**
	* Returns the dm history port region with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history port region
	* @return the dm history port region, or <code>null</code> if a dm history port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history port regions.
	*
	* @return the dm history port regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history port regions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortRegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history port regions
	* @param end the upper bound of the range of dm history port regions (not inclusive)
	* @return the range of dm history port regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history port regions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortRegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history port regions
	* @param end the upper bound of the range of dm history port regions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history port regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm history port regions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history port regions.
	*
	* @return the number of dm history port regions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}