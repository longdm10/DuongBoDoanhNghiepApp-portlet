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

import vn.dtt.duongbien.dao.vrcb.model.DmPortRegion;

/**
 * The persistence interface for the dm port region service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmPortRegionPersistenceImpl
 * @see DmPortRegionUtil
 * @generated
 */
public interface DmPortRegionPersistence extends BasePersistence<DmPortRegion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmPortRegionUtil} to access the dm port region persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dm port regions where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @return the matching dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortRegion> findByPortRegionCode(
		java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm port regions where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortRegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param start the lower bound of the range of dm port regions
	* @param end the upper bound of the range of dm port regions (not inclusive)
	* @return the range of matching dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortRegion> findByPortRegionCode(
		java.lang.String portRegionCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm port regions where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortRegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param start the lower bound of the range of dm port regions
	* @param end the upper bound of the range of dm port regions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortRegion> findByPortRegionCode(
		java.lang.String portRegionCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm port region in the ordered set where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port region
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortRegionException if a matching dm port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortRegion findByPortRegionCode_First(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortRegionException;

	/**
	* Returns the first dm port region in the ordered set where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port region, or <code>null</code> if a matching dm port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortRegion fetchByPortRegionCode_First(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm port region in the ordered set where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port region
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortRegionException if a matching dm port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortRegion findByPortRegionCode_Last(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortRegionException;

	/**
	* Returns the last dm port region in the ordered set where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port region, or <code>null</code> if a matching dm port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortRegion fetchByPortRegionCode_Last(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm port regions before and after the current dm port region in the ordered set where portRegionCode = &#63;.
	*
	* @param id the primary key of the current dm port region
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm port region
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortRegionException if a dm port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortRegion[] findByPortRegionCode_PrevAndNext(
		int id, java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortRegionException;

	/**
	* Removes all the dm port regions where portRegionCode = &#63; from the database.
	*
	* @param portRegionCode the port region code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPortRegionCode(java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm port regions where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @return the number of matching dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public int countByPortRegionCode(java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm port regions where portRegionRef = &#63;.
	*
	* @param portRegionRef the port region ref
	* @return the matching dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortRegion> findByPortRegionRef(
		java.lang.String portRegionRef)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm port regions where portRegionRef = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortRegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portRegionRef the port region ref
	* @param start the lower bound of the range of dm port regions
	* @param end the upper bound of the range of dm port regions (not inclusive)
	* @return the range of matching dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortRegion> findByPortRegionRef(
		java.lang.String portRegionRef, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm port regions where portRegionRef = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortRegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portRegionRef the port region ref
	* @param start the lower bound of the range of dm port regions
	* @param end the upper bound of the range of dm port regions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortRegion> findByPortRegionRef(
		java.lang.String portRegionRef, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm port region in the ordered set where portRegionRef = &#63;.
	*
	* @param portRegionRef the port region ref
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port region
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortRegionException if a matching dm port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortRegion findByPortRegionRef_First(
		java.lang.String portRegionRef,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortRegionException;

	/**
	* Returns the first dm port region in the ordered set where portRegionRef = &#63;.
	*
	* @param portRegionRef the port region ref
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port region, or <code>null</code> if a matching dm port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortRegion fetchByPortRegionRef_First(
		java.lang.String portRegionRef,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm port region in the ordered set where portRegionRef = &#63;.
	*
	* @param portRegionRef the port region ref
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port region
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortRegionException if a matching dm port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortRegion findByPortRegionRef_Last(
		java.lang.String portRegionRef,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortRegionException;

	/**
	* Returns the last dm port region in the ordered set where portRegionRef = &#63;.
	*
	* @param portRegionRef the port region ref
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port region, or <code>null</code> if a matching dm port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortRegion fetchByPortRegionRef_Last(
		java.lang.String portRegionRef,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm port regions before and after the current dm port region in the ordered set where portRegionRef = &#63;.
	*
	* @param id the primary key of the current dm port region
	* @param portRegionRef the port region ref
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm port region
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortRegionException if a dm port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortRegion[] findByPortRegionRef_PrevAndNext(
		int id, java.lang.String portRegionRef,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortRegionException;

	/**
	* Removes all the dm port regions where portRegionRef = &#63; from the database.
	*
	* @param portRegionRef the port region ref
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPortRegionRef(java.lang.String portRegionRef)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm port regions where portRegionRef = &#63;.
	*
	* @param portRegionRef the port region ref
	* @return the number of matching dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public int countByPortRegionRef(java.lang.String portRegionRef)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm port region in the entity cache if it is enabled.
	*
	* @param dmPortRegion the dm port region
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmPortRegion dmPortRegion);

	/**
	* Caches the dm port regions in the entity cache if it is enabled.
	*
	* @param dmPortRegions the dm port regions
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortRegion> dmPortRegions);

	/**
	* Creates a new dm port region with the primary key. Does not add the dm port region to the database.
	*
	* @param id the primary key for the new dm port region
	* @return the new dm port region
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortRegion create(int id);

	/**
	* Removes the dm port region with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm port region
	* @return the dm port region that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortRegionException if a dm port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortRegion remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortRegionException;

	public vn.dtt.duongbien.dao.vrcb.model.DmPortRegion updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmPortRegion dmPortRegion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm port region with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmPortRegionException} if it could not be found.
	*
	* @param id the primary key of the dm port region
	* @return the dm port region
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortRegionException if a dm port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortRegion findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortRegionException;

	/**
	* Returns the dm port region with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm port region
	* @return the dm port region, or <code>null</code> if a dm port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortRegion fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm port regions.
	*
	* @return the dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortRegion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm port regions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortRegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm port regions
	* @param end the upper bound of the range of dm port regions (not inclusive)
	* @return the range of dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortRegion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm port regions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortRegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm port regions
	* @param end the upper bound of the range of dm port regions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortRegion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm port regions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm port regions.
	*
	* @return the number of dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}