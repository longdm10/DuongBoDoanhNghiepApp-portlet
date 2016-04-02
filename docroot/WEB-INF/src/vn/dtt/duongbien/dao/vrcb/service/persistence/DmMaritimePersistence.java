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

import vn.dtt.duongbien.dao.vrcb.model.DmMaritime;

/**
 * The persistence interface for the dm maritime service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmMaritimePersistenceImpl
 * @see DmMaritimeUtil
 * @generated
 */
public interface DmMaritimePersistence extends BasePersistence<DmMaritime> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmMaritimeUtil} to access the dm maritime persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dm maritimes where maritimeCode = &#63;.
	*
	* @param maritimeCode the maritime code
	* @return the matching dm maritimes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmMaritime> findByMaritimeCode(
		java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm maritimes where maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmMaritimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maritimeCode the maritime code
	* @param start the lower bound of the range of dm maritimes
	* @param end the upper bound of the range of dm maritimes (not inclusive)
	* @return the range of matching dm maritimes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmMaritime> findByMaritimeCode(
		java.lang.String maritimeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm maritimes where maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmMaritimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maritimeCode the maritime code
	* @param start the lower bound of the range of dm maritimes
	* @param end the upper bound of the range of dm maritimes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm maritimes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmMaritime> findByMaritimeCode(
		java.lang.String maritimeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm maritime in the ordered set where maritimeCode = &#63;.
	*
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm maritime
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException if a matching dm maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmMaritime findByMaritimeCode_First(
		java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException;

	/**
	* Returns the first dm maritime in the ordered set where maritimeCode = &#63;.
	*
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm maritime, or <code>null</code> if a matching dm maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmMaritime fetchByMaritimeCode_First(
		java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm maritime in the ordered set where maritimeCode = &#63;.
	*
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm maritime
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException if a matching dm maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmMaritime findByMaritimeCode_Last(
		java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException;

	/**
	* Returns the last dm maritime in the ordered set where maritimeCode = &#63;.
	*
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm maritime, or <code>null</code> if a matching dm maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmMaritime fetchByMaritimeCode_Last(
		java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm maritimes before and after the current dm maritime in the ordered set where maritimeCode = &#63;.
	*
	* @param id the primary key of the current dm maritime
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm maritime
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException if a dm maritime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmMaritime[] findByMaritimeCode_PrevAndNext(
		int id, java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException;

	/**
	* Removes all the dm maritimes where maritimeCode = &#63; from the database.
	*
	* @param maritimeCode the maritime code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByMaritimeCode(java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm maritimes where maritimeCode = &#63;.
	*
	* @param maritimeCode the maritime code
	* @return the number of matching dm maritimes
	* @throws SystemException if a system exception occurred
	*/
	public int countByMaritimeCode(java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm maritime in the entity cache if it is enabled.
	*
	* @param dmMaritime the dm maritime
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmMaritime dmMaritime);

	/**
	* Caches the dm maritimes in the entity cache if it is enabled.
	*
	* @param dmMaritimes the dm maritimes
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmMaritime> dmMaritimes);

	/**
	* Creates a new dm maritime with the primary key. Does not add the dm maritime to the database.
	*
	* @param id the primary key for the new dm maritime
	* @return the new dm maritime
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmMaritime create(int id);

	/**
	* Removes the dm maritime with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm maritime
	* @return the dm maritime that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException if a dm maritime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmMaritime remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException;

	public vn.dtt.duongbien.dao.vrcb.model.DmMaritime updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmMaritime dmMaritime)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm maritime with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException} if it could not be found.
	*
	* @param id the primary key of the dm maritime
	* @return the dm maritime
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException if a dm maritime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmMaritime findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException;

	/**
	* Returns the dm maritime with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm maritime
	* @return the dm maritime, or <code>null</code> if a dm maritime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmMaritime fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm maritimes.
	*
	* @return the dm maritimes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmMaritime> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm maritimes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmMaritimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm maritimes
	* @param end the upper bound of the range of dm maritimes (not inclusive)
	* @return the range of dm maritimes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmMaritime> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm maritimes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmMaritimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm maritimes
	* @param end the upper bound of the range of dm maritimes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm maritimes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmMaritime> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm maritimes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm maritimes.
	*
	* @return the number of dm maritimes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}