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

import vn.dtt.duongbien.dao.vrcb.model.RmdcShip;

/**
 * The persistence interface for the rmdc ship service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see RmdcShipPersistenceImpl
 * @see RmdcShipUtil
 * @generated
 */
public interface RmdcShipPersistence extends BasePersistence<RmdcShip> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RmdcShipUtil} to access the rmdc ship persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the rmdc ships where shipId = &#63;.
	*
	* @param shipId the ship ID
	* @return the matching rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.RmdcShip> findByShipId(
		int shipId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the rmdc ships where shipId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.RmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param shipId the ship ID
	* @param start the lower bound of the range of rmdc ships
	* @param end the upper bound of the range of rmdc ships (not inclusive)
	* @return the range of matching rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.RmdcShip> findByShipId(
		int shipId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the rmdc ships where shipId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.RmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param shipId the ship ID
	* @param start the lower bound of the range of rmdc ships
	* @param end the upper bound of the range of rmdc ships (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.RmdcShip> findByShipId(
		int shipId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first rmdc ship in the ordered set where shipId = &#63;.
	*
	* @param shipId the ship ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rmdc ship
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchRmdcShipException if a matching rmdc ship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip findByShipId_First(
		int shipId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchRmdcShipException;

	/**
	* Returns the first rmdc ship in the ordered set where shipId = &#63;.
	*
	* @param shipId the ship ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rmdc ship, or <code>null</code> if a matching rmdc ship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip fetchByShipId_First(
		int shipId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last rmdc ship in the ordered set where shipId = &#63;.
	*
	* @param shipId the ship ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rmdc ship
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchRmdcShipException if a matching rmdc ship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip findByShipId_Last(
		int shipId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchRmdcShipException;

	/**
	* Returns the last rmdc ship in the ordered set where shipId = &#63;.
	*
	* @param shipId the ship ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rmdc ship, or <code>null</code> if a matching rmdc ship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip fetchByShipId_Last(
		int shipId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the rmdc ships before and after the current rmdc ship in the ordered set where shipId = &#63;.
	*
	* @param id the primary key of the current rmdc ship
	* @param shipId the ship ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next rmdc ship
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchRmdcShipException if a rmdc ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip[] findByShipId_PrevAndNext(
		long id, int shipId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchRmdcShipException;

	/**
	* Removes all the rmdc ships where shipId = &#63; from the database.
	*
	* @param shipId the ship ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByShipId(int shipId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rmdc ships where shipId = &#63;.
	*
	* @param shipId the ship ID
	* @return the number of matching rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public int countByShipId(int shipId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the rmdc ships where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @return the matching rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.RmdcShip> findByShipTypeCode(
		java.lang.String shipTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the rmdc ships where shipTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.RmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param shipTypeCode the ship type code
	* @param start the lower bound of the range of rmdc ships
	* @param end the upper bound of the range of rmdc ships (not inclusive)
	* @return the range of matching rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.RmdcShip> findByShipTypeCode(
		java.lang.String shipTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the rmdc ships where shipTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.RmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param shipTypeCode the ship type code
	* @param start the lower bound of the range of rmdc ships
	* @param end the upper bound of the range of rmdc ships (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.RmdcShip> findByShipTypeCode(
		java.lang.String shipTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first rmdc ship in the ordered set where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rmdc ship
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchRmdcShipException if a matching rmdc ship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip findByShipTypeCode_First(
		java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchRmdcShipException;

	/**
	* Returns the first rmdc ship in the ordered set where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rmdc ship, or <code>null</code> if a matching rmdc ship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip fetchByShipTypeCode_First(
		java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last rmdc ship in the ordered set where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rmdc ship
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchRmdcShipException if a matching rmdc ship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip findByShipTypeCode_Last(
		java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchRmdcShipException;

	/**
	* Returns the last rmdc ship in the ordered set where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rmdc ship, or <code>null</code> if a matching rmdc ship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip fetchByShipTypeCode_Last(
		java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the rmdc ships before and after the current rmdc ship in the ordered set where shipTypeCode = &#63;.
	*
	* @param id the primary key of the current rmdc ship
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next rmdc ship
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchRmdcShipException if a rmdc ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip[] findByShipTypeCode_PrevAndNext(
		long id, java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchRmdcShipException;

	/**
	* Removes all the rmdc ships where shipTypeCode = &#63; from the database.
	*
	* @param shipTypeCode the ship type code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByShipTypeCode(java.lang.String shipTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rmdc ships where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @return the number of matching rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public int countByShipTypeCode(java.lang.String shipTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the rmdc ship in the entity cache if it is enabled.
	*
	* @param rmdcShip the rmdc ship
	*/
	public void cacheResult(vn.dtt.duongbien.dao.vrcb.model.RmdcShip rmdcShip);

	/**
	* Caches the rmdc ships in the entity cache if it is enabled.
	*
	* @param rmdcShips the rmdc ships
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.RmdcShip> rmdcShips);

	/**
	* Creates a new rmdc ship with the primary key. Does not add the rmdc ship to the database.
	*
	* @param id the primary key for the new rmdc ship
	* @return the new rmdc ship
	*/
	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip create(long id);

	/**
	* Removes the rmdc ship with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the rmdc ship
	* @return the rmdc ship that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchRmdcShipException if a rmdc ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchRmdcShipException;

	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.RmdcShip rmdcShip)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the rmdc ship with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchRmdcShipException} if it could not be found.
	*
	* @param id the primary key of the rmdc ship
	* @return the rmdc ship
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchRmdcShipException if a rmdc ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchRmdcShipException;

	/**
	* Returns the rmdc ship with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the rmdc ship
	* @return the rmdc ship, or <code>null</code> if a rmdc ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the rmdc ships.
	*
	* @return the rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.RmdcShip> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the rmdc ships.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.RmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rmdc ships
	* @param end the upper bound of the range of rmdc ships (not inclusive)
	* @return the range of rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.RmdcShip> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the rmdc ships.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.RmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rmdc ships
	* @param end the upper bound of the range of rmdc ships (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.RmdcShip> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the rmdc ships from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rmdc ships.
	*
	* @return the number of rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}