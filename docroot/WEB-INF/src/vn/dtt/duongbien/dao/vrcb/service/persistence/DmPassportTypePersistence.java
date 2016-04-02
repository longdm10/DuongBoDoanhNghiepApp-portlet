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

import vn.dtt.duongbien.dao.vrcb.model.DmPassportType;

/**
 * The persistence interface for the dm passport type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmPassportTypePersistenceImpl
 * @see DmPassportTypeUtil
 * @generated
 */
public interface DmPassportTypePersistence extends BasePersistence<DmPassportType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmPassportTypeUtil} to access the dm passport type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dm passport types where passportTypeCode = &#63;.
	*
	* @param passportTypeCode the passport type code
	* @return the matching dm passport types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPassportType> findByPassportTypeCode(
		java.lang.String passportTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm passport types where passportTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPassportTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param passportTypeCode the passport type code
	* @param start the lower bound of the range of dm passport types
	* @param end the upper bound of the range of dm passport types (not inclusive)
	* @return the range of matching dm passport types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPassportType> findByPassportTypeCode(
		java.lang.String passportTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm passport types where passportTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPassportTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param passportTypeCode the passport type code
	* @param start the lower bound of the range of dm passport types
	* @param end the upper bound of the range of dm passport types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm passport types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPassportType> findByPassportTypeCode(
		java.lang.String passportTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm passport type in the ordered set where passportTypeCode = &#63;.
	*
	* @param passportTypeCode the passport type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm passport type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException if a matching dm passport type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPassportType findByPassportTypeCode_First(
		java.lang.String passportTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException;

	/**
	* Returns the first dm passport type in the ordered set where passportTypeCode = &#63;.
	*
	* @param passportTypeCode the passport type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm passport type, or <code>null</code> if a matching dm passport type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPassportType fetchByPassportTypeCode_First(
		java.lang.String passportTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm passport type in the ordered set where passportTypeCode = &#63;.
	*
	* @param passportTypeCode the passport type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm passport type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException if a matching dm passport type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPassportType findByPassportTypeCode_Last(
		java.lang.String passportTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException;

	/**
	* Returns the last dm passport type in the ordered set where passportTypeCode = &#63;.
	*
	* @param passportTypeCode the passport type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm passport type, or <code>null</code> if a matching dm passport type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPassportType fetchByPassportTypeCode_Last(
		java.lang.String passportTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm passport types before and after the current dm passport type in the ordered set where passportTypeCode = &#63;.
	*
	* @param id the primary key of the current dm passport type
	* @param passportTypeCode the passport type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm passport type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException if a dm passport type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPassportType[] findByPassportTypeCode_PrevAndNext(
		int id, java.lang.String passportTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException;

	/**
	* Removes all the dm passport types where passportTypeCode = &#63; from the database.
	*
	* @param passportTypeCode the passport type code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPassportTypeCode(java.lang.String passportTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm passport types where passportTypeCode = &#63;.
	*
	* @param passportTypeCode the passport type code
	* @return the number of matching dm passport types
	* @throws SystemException if a system exception occurred
	*/
	public int countByPassportTypeCode(java.lang.String passportTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm passport type in the entity cache if it is enabled.
	*
	* @param dmPassportType the dm passport type
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmPassportType dmPassportType);

	/**
	* Caches the dm passport types in the entity cache if it is enabled.
	*
	* @param dmPassportTypes the dm passport types
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPassportType> dmPassportTypes);

	/**
	* Creates a new dm passport type with the primary key. Does not add the dm passport type to the database.
	*
	* @param id the primary key for the new dm passport type
	* @return the new dm passport type
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPassportType create(int id);

	/**
	* Removes the dm passport type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm passport type
	* @return the dm passport type that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException if a dm passport type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPassportType remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException;

	public vn.dtt.duongbien.dao.vrcb.model.DmPassportType updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmPassportType dmPassportType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm passport type with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException} if it could not be found.
	*
	* @param id the primary key of the dm passport type
	* @return the dm passport type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException if a dm passport type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPassportType findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException;

	/**
	* Returns the dm passport type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm passport type
	* @return the dm passport type, or <code>null</code> if a dm passport type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPassportType fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm passport types.
	*
	* @return the dm passport types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPassportType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm passport types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPassportTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm passport types
	* @param end the upper bound of the range of dm passport types (not inclusive)
	* @return the range of dm passport types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPassportType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm passport types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPassportTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm passport types
	* @param end the upper bound of the range of dm passport types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm passport types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPassportType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm passport types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm passport types.
	*
	* @return the number of dm passport types
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}