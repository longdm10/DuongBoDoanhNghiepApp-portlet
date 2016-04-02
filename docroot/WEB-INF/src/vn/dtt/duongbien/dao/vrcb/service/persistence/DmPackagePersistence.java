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

import vn.dtt.duongbien.dao.vrcb.model.DmPackage;

/**
 * The persistence interface for the dm package service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmPackagePersistenceImpl
 * @see DmPackageUtil
 * @generated
 */
public interface DmPackagePersistence extends BasePersistence<DmPackage> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmPackageUtil} to access the dm package persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dm packages where packageCode = &#63;.
	*
	* @param packageCode the package code
	* @return the matching dm packages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPackage> findByPackageCode(
		java.lang.String packageCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm packages where packageCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param packageCode the package code
	* @param start the lower bound of the range of dm packages
	* @param end the upper bound of the range of dm packages (not inclusive)
	* @return the range of matching dm packages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPackage> findByPackageCode(
		java.lang.String packageCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm packages where packageCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param packageCode the package code
	* @param start the lower bound of the range of dm packages
	* @param end the upper bound of the range of dm packages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm packages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPackage> findByPackageCode(
		java.lang.String packageCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm package in the ordered set where packageCode = &#63;.
	*
	* @param packageCode the package code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm package
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException if a matching dm package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPackage findByPackageCode_First(
		java.lang.String packageCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException;

	/**
	* Returns the first dm package in the ordered set where packageCode = &#63;.
	*
	* @param packageCode the package code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm package, or <code>null</code> if a matching dm package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPackage fetchByPackageCode_First(
		java.lang.String packageCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm package in the ordered set where packageCode = &#63;.
	*
	* @param packageCode the package code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm package
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException if a matching dm package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPackage findByPackageCode_Last(
		java.lang.String packageCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException;

	/**
	* Returns the last dm package in the ordered set where packageCode = &#63;.
	*
	* @param packageCode the package code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm package, or <code>null</code> if a matching dm package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPackage fetchByPackageCode_Last(
		java.lang.String packageCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm packages before and after the current dm package in the ordered set where packageCode = &#63;.
	*
	* @param id the primary key of the current dm package
	* @param packageCode the package code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm package
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException if a dm package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPackage[] findByPackageCode_PrevAndNext(
		int id, java.lang.String packageCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException;

	/**
	* Removes all the dm packages where packageCode = &#63; from the database.
	*
	* @param packageCode the package code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPackageCode(java.lang.String packageCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm packages where packageCode = &#63;.
	*
	* @param packageCode the package code
	* @return the number of matching dm packages
	* @throws SystemException if a system exception occurred
	*/
	public int countByPackageCode(java.lang.String packageCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm package in the entity cache if it is enabled.
	*
	* @param dmPackage the dm package
	*/
	public void cacheResult(vn.dtt.duongbien.dao.vrcb.model.DmPackage dmPackage);

	/**
	* Caches the dm packages in the entity cache if it is enabled.
	*
	* @param dmPackages the dm packages
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPackage> dmPackages);

	/**
	* Creates a new dm package with the primary key. Does not add the dm package to the database.
	*
	* @param id the primary key for the new dm package
	* @return the new dm package
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPackage create(int id);

	/**
	* Removes the dm package with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm package
	* @return the dm package that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException if a dm package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPackage remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException;

	public vn.dtt.duongbien.dao.vrcb.model.DmPackage updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmPackage dmPackage)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm package with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException} if it could not be found.
	*
	* @param id the primary key of the dm package
	* @return the dm package
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException if a dm package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPackage findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException;

	/**
	* Returns the dm package with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm package
	* @return the dm package, or <code>null</code> if a dm package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPackage fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm packages.
	*
	* @return the dm packages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPackage> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm packages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm packages
	* @param end the upper bound of the range of dm packages (not inclusive)
	* @return the range of dm packages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPackage> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm packages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm packages
	* @param end the upper bound of the range of dm packages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm packages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPackage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm packages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm packages.
	*
	* @return the number of dm packages
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}