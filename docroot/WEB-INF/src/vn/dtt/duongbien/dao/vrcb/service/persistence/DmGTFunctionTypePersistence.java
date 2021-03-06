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

import vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType;

/**
 * The persistence interface for the dm g t function type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmGTFunctionTypePersistenceImpl
 * @see DmGTFunctionTypeUtil
 * @generated
 */
public interface DmGTFunctionTypePersistence extends BasePersistence<DmGTFunctionType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmGTFunctionTypeUtil} to access the dm g t function type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the dm g t function type where functionTypeCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGTFunctionTypeException} if it could not be found.
	*
	* @param functionTypeCode the function type code
	* @return the matching dm g t function type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGTFunctionTypeException if a matching dm g t function type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType findByFunctionTypeCode(
		java.lang.String functionTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGTFunctionTypeException;

	/**
	* Returns the dm g t function type where functionTypeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param functionTypeCode the function type code
	* @return the matching dm g t function type, or <code>null</code> if a matching dm g t function type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType fetchByFunctionTypeCode(
		java.lang.String functionTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm g t function type where functionTypeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param functionTypeCode the function type code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm g t function type, or <code>null</code> if a matching dm g t function type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType fetchByFunctionTypeCode(
		java.lang.String functionTypeCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm g t function type where functionTypeCode = &#63; from the database.
	*
	* @param functionTypeCode the function type code
	* @return the dm g t function type that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType removeByFunctionTypeCode(
		java.lang.String functionTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGTFunctionTypeException;

	/**
	* Returns the number of dm g t function types where functionTypeCode = &#63;.
	*
	* @param functionTypeCode the function type code
	* @return the number of matching dm g t function types
	* @throws SystemException if a system exception occurred
	*/
	public int countByFunctionTypeCode(java.lang.String functionTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm g t function type in the entity cache if it is enabled.
	*
	* @param dmGTFunctionType the dm g t function type
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType dmGTFunctionType);

	/**
	* Caches the dm g t function types in the entity cache if it is enabled.
	*
	* @param dmGTFunctionTypes the dm g t function types
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType> dmGTFunctionTypes);

	/**
	* Creates a new dm g t function type with the primary key. Does not add the dm g t function type to the database.
	*
	* @param id the primary key for the new dm g t function type
	* @return the new dm g t function type
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType create(long id);

	/**
	* Removes the dm g t function type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm g t function type
	* @return the dm g t function type that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGTFunctionTypeException if a dm g t function type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGTFunctionTypeException;

	public vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType dmGTFunctionType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm g t function type with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGTFunctionTypeException} if it could not be found.
	*
	* @param id the primary key of the dm g t function type
	* @return the dm g t function type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGTFunctionTypeException if a dm g t function type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGTFunctionTypeException;

	/**
	* Returns the dm g t function type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm g t function type
	* @return the dm g t function type, or <code>null</code> if a dm g t function type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm g t function types.
	*
	* @return the dm g t function types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm g t function types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGTFunctionTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm g t function types
	* @param end the upper bound of the range of dm g t function types (not inclusive)
	* @return the range of dm g t function types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm g t function types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGTFunctionTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm g t function types
	* @param end the upper bound of the range of dm g t function types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm g t function types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm g t function types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm g t function types.
	*
	* @return the number of dm g t function types
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}