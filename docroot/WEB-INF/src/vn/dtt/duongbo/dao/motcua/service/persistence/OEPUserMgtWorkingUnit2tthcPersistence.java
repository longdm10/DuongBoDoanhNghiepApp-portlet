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

package vn.dtt.duongbo.dao.motcua.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc;

/**
 * The persistence interface for the o e p user mgt working unit2tthc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtWorkingUnit2tthcPersistenceImpl
 * @see OEPUserMgtWorkingUnit2tthcUtil
 * @generated
 */
public interface OEPUserMgtWorkingUnit2tthcPersistence extends BasePersistence<OEPUserMgtWorkingUnit2tthc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OEPUserMgtWorkingUnit2tthcUtil} to access the o e p user mgt working unit2tthc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the o e p user mgt working unit2tthcs where TTHCId = &#63;.
	*
	* @param TTHCId the t t h c ID
	* @return the matching o e p user mgt working unit2tthcs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc> findByF_TTHCId(
		long TTHCId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the o e p user mgt working unit2tthcs where TTHCId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnit2tthcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param TTHCId the t t h c ID
	* @param start the lower bound of the range of o e p user mgt working unit2tthcs
	* @param end the upper bound of the range of o e p user mgt working unit2tthcs (not inclusive)
	* @return the range of matching o e p user mgt working unit2tthcs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc> findByF_TTHCId(
		long TTHCId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the o e p user mgt working unit2tthcs where TTHCId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnit2tthcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param TTHCId the t t h c ID
	* @param start the lower bound of the range of o e p user mgt working unit2tthcs
	* @param end the upper bound of the range of o e p user mgt working unit2tthcs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching o e p user mgt working unit2tthcs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc> findByF_TTHCId(
		long TTHCId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first o e p user mgt working unit2tthc in the ordered set where TTHCId = &#63;.
	*
	* @param TTHCId the t t h c ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching o e p user mgt working unit2tthc
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException if a matching o e p user mgt working unit2tthc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc findByF_TTHCId_First(
		long TTHCId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException;

	/**
	* Returns the first o e p user mgt working unit2tthc in the ordered set where TTHCId = &#63;.
	*
	* @param TTHCId the t t h c ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching o e p user mgt working unit2tthc, or <code>null</code> if a matching o e p user mgt working unit2tthc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc fetchByF_TTHCId_First(
		long TTHCId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last o e p user mgt working unit2tthc in the ordered set where TTHCId = &#63;.
	*
	* @param TTHCId the t t h c ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching o e p user mgt working unit2tthc
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException if a matching o e p user mgt working unit2tthc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc findByF_TTHCId_Last(
		long TTHCId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException;

	/**
	* Returns the last o e p user mgt working unit2tthc in the ordered set where TTHCId = &#63;.
	*
	* @param TTHCId the t t h c ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching o e p user mgt working unit2tthc, or <code>null</code> if a matching o e p user mgt working unit2tthc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc fetchByF_TTHCId_Last(
		long TTHCId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the o e p user mgt working unit2tthcs before and after the current o e p user mgt working unit2tthc in the ordered set where TTHCId = &#63;.
	*
	* @param workingUnit2TTHCId the primary key of the current o e p user mgt working unit2tthc
	* @param TTHCId the t t h c ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next o e p user mgt working unit2tthc
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException if a o e p user mgt working unit2tthc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc[] findByF_TTHCId_PrevAndNext(
		long workingUnit2TTHCId, long TTHCId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException;

	/**
	* Removes all the o e p user mgt working unit2tthcs where TTHCId = &#63; from the database.
	*
	* @param TTHCId the t t h c ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByF_TTHCId(long TTHCId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of o e p user mgt working unit2tthcs where TTHCId = &#63;.
	*
	* @param TTHCId the t t h c ID
	* @return the number of matching o e p user mgt working unit2tthcs
	* @throws SystemException if a system exception occurred
	*/
	public int countByF_TTHCId(long TTHCId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the o e p user mgt working unit2tthc where TTHCId = &#63; and workingUnitId = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException} if it could not be found.
	*
	* @param TTHCId the t t h c ID
	* @param workingUnitId the working unit ID
	* @return the matching o e p user mgt working unit2tthc
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException if a matching o e p user mgt working unit2tthc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc findByF_TTHCId_workingUnitId(
		long TTHCId, long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException;

	/**
	* Returns the o e p user mgt working unit2tthc where TTHCId = &#63; and workingUnitId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param TTHCId the t t h c ID
	* @param workingUnitId the working unit ID
	* @return the matching o e p user mgt working unit2tthc, or <code>null</code> if a matching o e p user mgt working unit2tthc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc fetchByF_TTHCId_workingUnitId(
		long TTHCId, long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the o e p user mgt working unit2tthc where TTHCId = &#63; and workingUnitId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param TTHCId the t t h c ID
	* @param workingUnitId the working unit ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching o e p user mgt working unit2tthc, or <code>null</code> if a matching o e p user mgt working unit2tthc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc fetchByF_TTHCId_workingUnitId(
		long TTHCId, long workingUnitId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the o e p user mgt working unit2tthc where TTHCId = &#63; and workingUnitId = &#63; from the database.
	*
	* @param TTHCId the t t h c ID
	* @param workingUnitId the working unit ID
	* @return the o e p user mgt working unit2tthc that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc removeByF_TTHCId_workingUnitId(
		long TTHCId, long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException;

	/**
	* Returns the number of o e p user mgt working unit2tthcs where TTHCId = &#63; and workingUnitId = &#63;.
	*
	* @param TTHCId the t t h c ID
	* @param workingUnitId the working unit ID
	* @return the number of matching o e p user mgt working unit2tthcs
	* @throws SystemException if a system exception occurred
	*/
	public int countByF_TTHCId_workingUnitId(long TTHCId, long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the o e p user mgt working unit2tthc in the entity cache if it is enabled.
	*
	* @param oepUserMgtWorkingUnit2tthc the o e p user mgt working unit2tthc
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc);

	/**
	* Caches the o e p user mgt working unit2tthcs in the entity cache if it is enabled.
	*
	* @param oepUserMgtWorkingUnit2tthcs the o e p user mgt working unit2tthcs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc> oepUserMgtWorkingUnit2tthcs);

	/**
	* Creates a new o e p user mgt working unit2tthc with the primary key. Does not add the o e p user mgt working unit2tthc to the database.
	*
	* @param workingUnit2TTHCId the primary key for the new o e p user mgt working unit2tthc
	* @return the new o e p user mgt working unit2tthc
	*/
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc create(
		long workingUnit2TTHCId);

	/**
	* Removes the o e p user mgt working unit2tthc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param workingUnit2TTHCId the primary key of the o e p user mgt working unit2tthc
	* @return the o e p user mgt working unit2tthc that was removed
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException if a o e p user mgt working unit2tthc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc remove(
		long workingUnit2TTHCId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException;

	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc updateImpl(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the o e p user mgt working unit2tthc with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException} if it could not be found.
	*
	* @param workingUnit2TTHCId the primary key of the o e p user mgt working unit2tthc
	* @return the o e p user mgt working unit2tthc
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException if a o e p user mgt working unit2tthc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc findByPrimaryKey(
		long workingUnit2TTHCId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException;

	/**
	* Returns the o e p user mgt working unit2tthc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param workingUnit2TTHCId the primary key of the o e p user mgt working unit2tthc
	* @return the o e p user mgt working unit2tthc, or <code>null</code> if a o e p user mgt working unit2tthc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc fetchByPrimaryKey(
		long workingUnit2TTHCId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the o e p user mgt working unit2tthcs.
	*
	* @return the o e p user mgt working unit2tthcs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the o e p user mgt working unit2tthcs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnit2tthcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of o e p user mgt working unit2tthcs
	* @param end the upper bound of the range of o e p user mgt working unit2tthcs (not inclusive)
	* @return the range of o e p user mgt working unit2tthcs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the o e p user mgt working unit2tthcs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnit2tthcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of o e p user mgt working unit2tthcs
	* @param end the upper bound of the range of o e p user mgt working unit2tthcs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of o e p user mgt working unit2tthcs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the o e p user mgt working unit2tthcs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of o e p user mgt working unit2tthcs.
	*
	* @return the number of o e p user mgt working unit2tthcs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}