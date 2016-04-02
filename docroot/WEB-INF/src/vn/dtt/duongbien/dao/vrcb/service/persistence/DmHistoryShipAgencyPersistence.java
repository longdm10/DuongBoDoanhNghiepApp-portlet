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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency;

/**
 * The persistence interface for the dm history ship agency service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryShipAgencyPersistenceImpl
 * @see DmHistoryShipAgencyUtil
 * @generated
 */
public interface DmHistoryShipAgencyPersistence extends BasePersistence<DmHistoryShipAgency> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmHistoryShipAgencyUtil} to access the dm history ship agency persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dm history ship agencies where shipAgencyCode = &#63;.
	*
	* @param shipAgencyCode the ship agency code
	* @return the matching dm history ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency> findByShipAgencyCode(
		java.lang.String shipAgencyCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history ship agencies where shipAgencyCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryShipAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param shipAgencyCode the ship agency code
	* @param start the lower bound of the range of dm history ship agencies
	* @param end the upper bound of the range of dm history ship agencies (not inclusive)
	* @return the range of matching dm history ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency> findByShipAgencyCode(
		java.lang.String shipAgencyCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history ship agencies where shipAgencyCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryShipAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param shipAgencyCode the ship agency code
	* @param start the lower bound of the range of dm history ship agencies
	* @param end the upper bound of the range of dm history ship agencies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency> findByShipAgencyCode(
		java.lang.String shipAgencyCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm history ship agency in the ordered set where shipAgencyCode = &#63;.
	*
	* @param shipAgencyCode the ship agency code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history ship agency
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException if a matching dm history ship agency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency findByShipAgencyCode_First(
		java.lang.String shipAgencyCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException;

	/**
	* Returns the first dm history ship agency in the ordered set where shipAgencyCode = &#63;.
	*
	* @param shipAgencyCode the ship agency code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history ship agency, or <code>null</code> if a matching dm history ship agency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency fetchByShipAgencyCode_First(
		java.lang.String shipAgencyCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm history ship agency in the ordered set where shipAgencyCode = &#63;.
	*
	* @param shipAgencyCode the ship agency code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history ship agency
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException if a matching dm history ship agency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency findByShipAgencyCode_Last(
		java.lang.String shipAgencyCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException;

	/**
	* Returns the last dm history ship agency in the ordered set where shipAgencyCode = &#63;.
	*
	* @param shipAgencyCode the ship agency code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history ship agency, or <code>null</code> if a matching dm history ship agency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency fetchByShipAgencyCode_Last(
		java.lang.String shipAgencyCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history ship agencies before and after the current dm history ship agency in the ordered set where shipAgencyCode = &#63;.
	*
	* @param id the primary key of the current dm history ship agency
	* @param shipAgencyCode the ship agency code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history ship agency
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException if a dm history ship agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency[] findByShipAgencyCode_PrevAndNext(
		int id, java.lang.String shipAgencyCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException;

	/**
	* Removes all the dm history ship agencies where shipAgencyCode = &#63; from the database.
	*
	* @param shipAgencyCode the ship agency code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByShipAgencyCode(java.lang.String shipAgencyCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history ship agencies where shipAgencyCode = &#63;.
	*
	* @param shipAgencyCode the ship agency code
	* @return the number of matching dm history ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public int countByShipAgencyCode(java.lang.String shipAgencyCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history ship agency where shipAgencyCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException} if it could not be found.
	*
	* @param shipAgencyCode the ship agency code
	* @param syncVersion the sync version
	* @return the matching dm history ship agency
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException if a matching dm history ship agency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency findByShipAgencyCodeAndSyncVersion(
		java.lang.String shipAgencyCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException;

	/**
	* Returns the dm history ship agency where shipAgencyCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param shipAgencyCode the ship agency code
	* @param syncVersion the sync version
	* @return the matching dm history ship agency, or <code>null</code> if a matching dm history ship agency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency fetchByShipAgencyCodeAndSyncVersion(
		java.lang.String shipAgencyCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history ship agency where shipAgencyCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param shipAgencyCode the ship agency code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history ship agency, or <code>null</code> if a matching dm history ship agency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency fetchByShipAgencyCodeAndSyncVersion(
		java.lang.String shipAgencyCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm history ship agency where shipAgencyCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param shipAgencyCode the ship agency code
	* @param syncVersion the sync version
	* @return the dm history ship agency that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency removeByShipAgencyCodeAndSyncVersion(
		java.lang.String shipAgencyCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException;

	/**
	* Returns the number of dm history ship agencies where shipAgencyCode = &#63; and syncVersion = &#63;.
	*
	* @param shipAgencyCode the ship agency code
	* @param syncVersion the sync version
	* @return the number of matching dm history ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public int countByShipAgencyCodeAndSyncVersion(
		java.lang.String shipAgencyCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm history ship agency in the entity cache if it is enabled.
	*
	* @param dmHistoryShipAgency the dm history ship agency
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency dmHistoryShipAgency);

	/**
	* Caches the dm history ship agencies in the entity cache if it is enabled.
	*
	* @param dmHistoryShipAgencies the dm history ship agencies
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency> dmHistoryShipAgencies);

	/**
	* Creates a new dm history ship agency with the primary key. Does not add the dm history ship agency to the database.
	*
	* @param id the primary key for the new dm history ship agency
	* @return the new dm history ship agency
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency create(int id);

	/**
	* Removes the dm history ship agency with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history ship agency
	* @return the dm history ship agency that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException if a dm history ship agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException;

	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency dmHistoryShipAgency)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history ship agency with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException} if it could not be found.
	*
	* @param id the primary key of the dm history ship agency
	* @return the dm history ship agency
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException if a dm history ship agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException;

	/**
	* Returns the dm history ship agency with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history ship agency
	* @return the dm history ship agency, or <code>null</code> if a dm history ship agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history ship agencies.
	*
	* @return the dm history ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history ship agencies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryShipAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history ship agencies
	* @param end the upper bound of the range of dm history ship agencies (not inclusive)
	* @return the range of dm history ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history ship agencies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryShipAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history ship agencies
	* @param end the upper bound of the range of dm history ship agencies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm history ship agencies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history ship agencies.
	*
	* @return the number of dm history ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}