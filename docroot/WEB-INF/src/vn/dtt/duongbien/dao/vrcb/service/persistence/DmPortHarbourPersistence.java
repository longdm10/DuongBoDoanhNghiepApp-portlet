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

import vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour;

/**
 * The persistence interface for the dm port harbour service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmPortHarbourPersistenceImpl
 * @see DmPortHarbourUtil
 * @generated
 */
public interface DmPortHarbourPersistence extends BasePersistence<DmPortHarbour> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmPortHarbourUtil} to access the dm port harbour persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dm port harbours where portHarbourCode = &#63;.
	*
	* @param portHarbourCode the port harbour code
	* @return the matching dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour> findByPortHarbourCode(
		java.lang.String portHarbourCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm port harbours where portHarbourCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portHarbourCode the port harbour code
	* @param start the lower bound of the range of dm port harbours
	* @param end the upper bound of the range of dm port harbours (not inclusive)
	* @return the range of matching dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour> findByPortHarbourCode(
		java.lang.String portHarbourCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm port harbours where portHarbourCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portHarbourCode the port harbour code
	* @param start the lower bound of the range of dm port harbours
	* @param end the upper bound of the range of dm port harbours (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour> findByPortHarbourCode(
		java.lang.String portHarbourCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm port harbour in the ordered set where portHarbourCode = &#63;.
	*
	* @param portHarbourCode the port harbour code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port harbour
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException if a matching dm port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour findByPortHarbourCode_First(
		java.lang.String portHarbourCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException;

	/**
	* Returns the first dm port harbour in the ordered set where portHarbourCode = &#63;.
	*
	* @param portHarbourCode the port harbour code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port harbour, or <code>null</code> if a matching dm port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour fetchByPortHarbourCode_First(
		java.lang.String portHarbourCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm port harbour in the ordered set where portHarbourCode = &#63;.
	*
	* @param portHarbourCode the port harbour code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port harbour
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException if a matching dm port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour findByPortHarbourCode_Last(
		java.lang.String portHarbourCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException;

	/**
	* Returns the last dm port harbour in the ordered set where portHarbourCode = &#63;.
	*
	* @param portHarbourCode the port harbour code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port harbour, or <code>null</code> if a matching dm port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour fetchByPortHarbourCode_Last(
		java.lang.String portHarbourCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm port harbours before and after the current dm port harbour in the ordered set where portHarbourCode = &#63;.
	*
	* @param id the primary key of the current dm port harbour
	* @param portHarbourCode the port harbour code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm port harbour
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException if a dm port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour[] findByPortHarbourCode_PrevAndNext(
		int id, java.lang.String portHarbourCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException;

	/**
	* Removes all the dm port harbours where portHarbourCode = &#63; from the database.
	*
	* @param portHarbourCode the port harbour code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPortHarbourCode(java.lang.String portHarbourCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm port harbours where portHarbourCode = &#63;.
	*
	* @param portHarbourCode the port harbour code
	* @return the number of matching dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public int countByPortHarbourCode(java.lang.String portHarbourCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm port harbours where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @return the matching dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour> findByPortRegionCode(
		java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm port harbours where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param start the lower bound of the range of dm port harbours
	* @param end the upper bound of the range of dm port harbours (not inclusive)
	* @return the range of matching dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour> findByPortRegionCode(
		java.lang.String portRegionCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm port harbours where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param start the lower bound of the range of dm port harbours
	* @param end the upper bound of the range of dm port harbours (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour> findByPortRegionCode(
		java.lang.String portRegionCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm port harbour in the ordered set where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port harbour
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException if a matching dm port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour findByPortRegionCode_First(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException;

	/**
	* Returns the first dm port harbour in the ordered set where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port harbour, or <code>null</code> if a matching dm port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour fetchByPortRegionCode_First(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm port harbour in the ordered set where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port harbour
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException if a matching dm port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour findByPortRegionCode_Last(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException;

	/**
	* Returns the last dm port harbour in the ordered set where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port harbour, or <code>null</code> if a matching dm port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour fetchByPortRegionCode_Last(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm port harbours before and after the current dm port harbour in the ordered set where portRegionCode = &#63;.
	*
	* @param id the primary key of the current dm port harbour
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm port harbour
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException if a dm port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour[] findByPortRegionCode_PrevAndNext(
		int id, java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException;

	/**
	* Removes all the dm port harbours where portRegionCode = &#63; from the database.
	*
	* @param portRegionCode the port region code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPortRegionCode(java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm port harbours where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @return the number of matching dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public int countByPortRegionCode(java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm port harbour in the entity cache if it is enabled.
	*
	* @param dmPortHarbour the dm port harbour
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour dmPortHarbour);

	/**
	* Caches the dm port harbours in the entity cache if it is enabled.
	*
	* @param dmPortHarbours the dm port harbours
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour> dmPortHarbours);

	/**
	* Creates a new dm port harbour with the primary key. Does not add the dm port harbour to the database.
	*
	* @param id the primary key for the new dm port harbour
	* @return the new dm port harbour
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour create(int id);

	/**
	* Removes the dm port harbour with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm port harbour
	* @return the dm port harbour that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException if a dm port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException;

	public vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour dmPortHarbour)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm port harbour with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException} if it could not be found.
	*
	* @param id the primary key of the dm port harbour
	* @return the dm port harbour
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException if a dm port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException;

	/**
	* Returns the dm port harbour with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm port harbour
	* @return the dm port harbour, or <code>null</code> if a dm port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm port harbours.
	*
	* @return the dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm port harbours.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm port harbours
	* @param end the upper bound of the range of dm port harbours (not inclusive)
	* @return the range of dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm port harbours.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm port harbours
	* @param end the upper bound of the range of dm port harbours (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm port harbours from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm port harbours.
	*
	* @return the number of dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}