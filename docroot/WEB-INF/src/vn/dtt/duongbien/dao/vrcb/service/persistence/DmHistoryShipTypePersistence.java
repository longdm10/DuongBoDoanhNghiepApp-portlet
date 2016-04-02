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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType;

/**
 * The persistence interface for the dm history ship type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryShipTypePersistenceImpl
 * @see DmHistoryShipTypeUtil
 * @generated
 */
public interface DmHistoryShipTypePersistence extends BasePersistence<DmHistoryShipType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmHistoryShipTypeUtil} to access the dm history ship type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dm history ship types where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @return the matching dm history ship types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType> findByShipTypeCode(
		java.lang.String shipTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history ship types where shipTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryShipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param shipTypeCode the ship type code
	* @param start the lower bound of the range of dm history ship types
	* @param end the upper bound of the range of dm history ship types (not inclusive)
	* @return the range of matching dm history ship types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType> findByShipTypeCode(
		java.lang.String shipTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history ship types where shipTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryShipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param shipTypeCode the ship type code
	* @param start the lower bound of the range of dm history ship types
	* @param end the upper bound of the range of dm history ship types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history ship types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType> findByShipTypeCode(
		java.lang.String shipTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm history ship type in the ordered set where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history ship type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException if a matching dm history ship type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType findByShipTypeCode_First(
		java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException;

	/**
	* Returns the first dm history ship type in the ordered set where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history ship type, or <code>null</code> if a matching dm history ship type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType fetchByShipTypeCode_First(
		java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm history ship type in the ordered set where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history ship type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException if a matching dm history ship type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType findByShipTypeCode_Last(
		java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException;

	/**
	* Returns the last dm history ship type in the ordered set where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history ship type, or <code>null</code> if a matching dm history ship type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType fetchByShipTypeCode_Last(
		java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history ship types before and after the current dm history ship type in the ordered set where shipTypeCode = &#63;.
	*
	* @param id the primary key of the current dm history ship type
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history ship type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException if a dm history ship type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType[] findByShipTypeCode_PrevAndNext(
		int id, java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException;

	/**
	* Removes all the dm history ship types where shipTypeCode = &#63; from the database.
	*
	* @param shipTypeCode the ship type code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByShipTypeCode(java.lang.String shipTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history ship types where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @return the number of matching dm history ship types
	* @throws SystemException if a system exception occurred
	*/
	public int countByShipTypeCode(java.lang.String shipTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history ship type where shipTypeCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException} if it could not be found.
	*
	* @param shipTypeCode the ship type code
	* @param syncVersion the sync version
	* @return the matching dm history ship type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException if a matching dm history ship type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType findByShipTypeCodeAndSyncVersion(
		java.lang.String shipTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException;

	/**
	* Returns the dm history ship type where shipTypeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param shipTypeCode the ship type code
	* @param syncVersion the sync version
	* @return the matching dm history ship type, or <code>null</code> if a matching dm history ship type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType fetchByShipTypeCodeAndSyncVersion(
		java.lang.String shipTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history ship type where shipTypeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param shipTypeCode the ship type code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history ship type, or <code>null</code> if a matching dm history ship type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType fetchByShipTypeCodeAndSyncVersion(
		java.lang.String shipTypeCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm history ship type where shipTypeCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param shipTypeCode the ship type code
	* @param syncVersion the sync version
	* @return the dm history ship type that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType removeByShipTypeCodeAndSyncVersion(
		java.lang.String shipTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException;

	/**
	* Returns the number of dm history ship types where shipTypeCode = &#63; and syncVersion = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @param syncVersion the sync version
	* @return the number of matching dm history ship types
	* @throws SystemException if a system exception occurred
	*/
	public int countByShipTypeCodeAndSyncVersion(
		java.lang.String shipTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm history ship type in the entity cache if it is enabled.
	*
	* @param dmHistoryShipType the dm history ship type
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType dmHistoryShipType);

	/**
	* Caches the dm history ship types in the entity cache if it is enabled.
	*
	* @param dmHistoryShipTypes the dm history ship types
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType> dmHistoryShipTypes);

	/**
	* Creates a new dm history ship type with the primary key. Does not add the dm history ship type to the database.
	*
	* @param id the primary key for the new dm history ship type
	* @return the new dm history ship type
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType create(int id);

	/**
	* Removes the dm history ship type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history ship type
	* @return the dm history ship type that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException if a dm history ship type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException;

	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType dmHistoryShipType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history ship type with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException} if it could not be found.
	*
	* @param id the primary key of the dm history ship type
	* @return the dm history ship type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException if a dm history ship type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException;

	/**
	* Returns the dm history ship type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history ship type
	* @return the dm history ship type, or <code>null</code> if a dm history ship type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history ship types.
	*
	* @return the dm history ship types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history ship types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryShipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history ship types
	* @param end the upper bound of the range of dm history ship types (not inclusive)
	* @return the range of dm history ship types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history ship types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryShipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history ship types
	* @param end the upper bound of the range of dm history ship types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history ship types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm history ship types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history ship types.
	*
	* @return the number of dm history ship types
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}