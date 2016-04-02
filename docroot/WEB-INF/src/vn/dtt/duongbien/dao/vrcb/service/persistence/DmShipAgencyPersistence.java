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

import vn.dtt.duongbien.dao.vrcb.model.DmShipAgency;

/**
 * The persistence interface for the dm ship agency service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmShipAgencyPersistenceImpl
 * @see DmShipAgencyUtil
 * @generated
 */
public interface DmShipAgencyPersistence extends BasePersistence<DmShipAgency> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmShipAgencyUtil} to access the dm ship agency persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dm ship agencies where shipAgencyCode = &#63;.
	*
	* @param shipAgencyCode the ship agency code
	* @return the matching dm ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmShipAgency> findByShipAgencyCode(
		java.lang.String shipAgencyCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm ship agencies where shipAgencyCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmShipAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param shipAgencyCode the ship agency code
	* @param start the lower bound of the range of dm ship agencies
	* @param end the upper bound of the range of dm ship agencies (not inclusive)
	* @return the range of matching dm ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmShipAgency> findByShipAgencyCode(
		java.lang.String shipAgencyCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm ship agencies where shipAgencyCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmShipAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param shipAgencyCode the ship agency code
	* @param start the lower bound of the range of dm ship agencies
	* @param end the upper bound of the range of dm ship agencies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmShipAgency> findByShipAgencyCode(
		java.lang.String shipAgencyCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm ship agency in the ordered set where shipAgencyCode = &#63;.
	*
	* @param shipAgencyCode the ship agency code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm ship agency
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmShipAgencyException if a matching dm ship agency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmShipAgency findByShipAgencyCode_First(
		java.lang.String shipAgencyCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmShipAgencyException;

	/**
	* Returns the first dm ship agency in the ordered set where shipAgencyCode = &#63;.
	*
	* @param shipAgencyCode the ship agency code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm ship agency, or <code>null</code> if a matching dm ship agency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmShipAgency fetchByShipAgencyCode_First(
		java.lang.String shipAgencyCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm ship agency in the ordered set where shipAgencyCode = &#63;.
	*
	* @param shipAgencyCode the ship agency code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm ship agency
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmShipAgencyException if a matching dm ship agency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmShipAgency findByShipAgencyCode_Last(
		java.lang.String shipAgencyCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmShipAgencyException;

	/**
	* Returns the last dm ship agency in the ordered set where shipAgencyCode = &#63;.
	*
	* @param shipAgencyCode the ship agency code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm ship agency, or <code>null</code> if a matching dm ship agency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmShipAgency fetchByShipAgencyCode_Last(
		java.lang.String shipAgencyCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm ship agencies before and after the current dm ship agency in the ordered set where shipAgencyCode = &#63;.
	*
	* @param id the primary key of the current dm ship agency
	* @param shipAgencyCode the ship agency code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm ship agency
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmShipAgencyException if a dm ship agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmShipAgency[] findByShipAgencyCode_PrevAndNext(
		int id, java.lang.String shipAgencyCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmShipAgencyException;

	/**
	* Removes all the dm ship agencies where shipAgencyCode = &#63; from the database.
	*
	* @param shipAgencyCode the ship agency code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByShipAgencyCode(java.lang.String shipAgencyCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm ship agencies where shipAgencyCode = &#63;.
	*
	* @param shipAgencyCode the ship agency code
	* @return the number of matching dm ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public int countByShipAgencyCode(java.lang.String shipAgencyCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm ship agency in the entity cache if it is enabled.
	*
	* @param dmShipAgency the dm ship agency
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmShipAgency dmShipAgency);

	/**
	* Caches the dm ship agencies in the entity cache if it is enabled.
	*
	* @param dmShipAgencies the dm ship agencies
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmShipAgency> dmShipAgencies);

	/**
	* Creates a new dm ship agency with the primary key. Does not add the dm ship agency to the database.
	*
	* @param id the primary key for the new dm ship agency
	* @return the new dm ship agency
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmShipAgency create(int id);

	/**
	* Removes the dm ship agency with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm ship agency
	* @return the dm ship agency that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmShipAgencyException if a dm ship agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmShipAgency remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmShipAgencyException;

	public vn.dtt.duongbien.dao.vrcb.model.DmShipAgency updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmShipAgency dmShipAgency)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm ship agency with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmShipAgencyException} if it could not be found.
	*
	* @param id the primary key of the dm ship agency
	* @return the dm ship agency
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmShipAgencyException if a dm ship agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmShipAgency findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmShipAgencyException;

	/**
	* Returns the dm ship agency with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm ship agency
	* @return the dm ship agency, or <code>null</code> if a dm ship agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmShipAgency fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm ship agencies.
	*
	* @return the dm ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmShipAgency> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm ship agencies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmShipAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm ship agencies
	* @param end the upper bound of the range of dm ship agencies (not inclusive)
	* @return the range of dm ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmShipAgency> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm ship agencies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmShipAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm ship agencies
	* @param end the upper bound of the range of dm ship agencies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmShipAgency> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm ship agencies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm ship agencies.
	*
	* @return the number of dm ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}