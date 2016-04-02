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

import vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition;

/**
 * The persistence interface for the dm g t ship position service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmGTShipPositionPersistenceImpl
 * @see DmGTShipPositionUtil
 * @generated
 */
public interface DmGTShipPositionPersistence extends BasePersistence<DmGTShipPosition> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmGTShipPositionUtil} to access the dm g t ship position persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dm g t ship positions where positionCode = &#63;.
	*
	* @param positionCode the position code
	* @return the matching dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition> findByPositionCode(
		java.lang.String positionCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm g t ship positions where positionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGTShipPositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param positionCode the position code
	* @param start the lower bound of the range of dm g t ship positions
	* @param end the upper bound of the range of dm g t ship positions (not inclusive)
	* @return the range of matching dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition> findByPositionCode(
		java.lang.String positionCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm g t ship positions where positionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGTShipPositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param positionCode the position code
	* @param start the lower bound of the range of dm g t ship positions
	* @param end the upper bound of the range of dm g t ship positions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition> findByPositionCode(
		java.lang.String positionCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm g t ship position in the ordered set where positionCode = &#63;.
	*
	* @param positionCode the position code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm g t ship position
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGTShipPositionException if a matching dm g t ship position could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition findByPositionCode_First(
		java.lang.String positionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGTShipPositionException;

	/**
	* Returns the first dm g t ship position in the ordered set where positionCode = &#63;.
	*
	* @param positionCode the position code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm g t ship position, or <code>null</code> if a matching dm g t ship position could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition fetchByPositionCode_First(
		java.lang.String positionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm g t ship position in the ordered set where positionCode = &#63;.
	*
	* @param positionCode the position code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm g t ship position
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGTShipPositionException if a matching dm g t ship position could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition findByPositionCode_Last(
		java.lang.String positionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGTShipPositionException;

	/**
	* Returns the last dm g t ship position in the ordered set where positionCode = &#63;.
	*
	* @param positionCode the position code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm g t ship position, or <code>null</code> if a matching dm g t ship position could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition fetchByPositionCode_Last(
		java.lang.String positionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm g t ship positions before and after the current dm g t ship position in the ordered set where positionCode = &#63;.
	*
	* @param id the primary key of the current dm g t ship position
	* @param positionCode the position code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm g t ship position
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGTShipPositionException if a dm g t ship position with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition[] findByPositionCode_PrevAndNext(
		long id, java.lang.String positionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGTShipPositionException;

	/**
	* Removes all the dm g t ship positions where positionCode = &#63; from the database.
	*
	* @param positionCode the position code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPositionCode(java.lang.String positionCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm g t ship positions where positionCode = &#63;.
	*
	* @param positionCode the position code
	* @return the number of matching dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public int countByPositionCode(java.lang.String positionCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm g t ship position in the entity cache if it is enabled.
	*
	* @param dmGTShipPosition the dm g t ship position
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition dmGTShipPosition);

	/**
	* Caches the dm g t ship positions in the entity cache if it is enabled.
	*
	* @param dmGTShipPositions the dm g t ship positions
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition> dmGTShipPositions);

	/**
	* Creates a new dm g t ship position with the primary key. Does not add the dm g t ship position to the database.
	*
	* @param id the primary key for the new dm g t ship position
	* @return the new dm g t ship position
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition create(long id);

	/**
	* Removes the dm g t ship position with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm g t ship position
	* @return the dm g t ship position that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGTShipPositionException if a dm g t ship position with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGTShipPositionException;

	public vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition dmGTShipPosition)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm g t ship position with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGTShipPositionException} if it could not be found.
	*
	* @param id the primary key of the dm g t ship position
	* @return the dm g t ship position
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGTShipPositionException if a dm g t ship position with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGTShipPositionException;

	/**
	* Returns the dm g t ship position with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm g t ship position
	* @return the dm g t ship position, or <code>null</code> if a dm g t ship position with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm g t ship positions.
	*
	* @return the dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm g t ship positions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGTShipPositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm g t ship positions
	* @param end the upper bound of the range of dm g t ship positions (not inclusive)
	* @return the range of dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm g t ship positions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGTShipPositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm g t ship positions
	* @param end the upper bound of the range of dm g t ship positions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGTShipPosition> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm g t ship positions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm g t ship positions.
	*
	* @return the number of dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}