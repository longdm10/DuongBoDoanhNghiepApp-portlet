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

import vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory;

/**
 * The persistence interface for the dm gt report category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmGtReportCategoryPersistenceImpl
 * @see DmGtReportCategoryUtil
 * @generated
 */
public interface DmGtReportCategoryPersistence extends BasePersistence<DmGtReportCategory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmGtReportCategoryUtil} to access the dm gt report category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm gt report category in the entity cache if it is enabled.
	*
	* @param dmGtReportCategory the dm gt report category
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory dmGtReportCategory);

	/**
	* Caches the dm gt report categories in the entity cache if it is enabled.
	*
	* @param dmGtReportCategories the dm gt report categories
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory> dmGtReportCategories);

	/**
	* Creates a new dm gt report category with the primary key. Does not add the dm gt report category to the database.
	*
	* @param id the primary key for the new dm gt report category
	* @return the new dm gt report category
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory create(long id);

	/**
	* Removes the dm gt report category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm gt report category
	* @return the dm gt report category that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportCategoryException if a dm gt report category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportCategoryException;

	public vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory dmGtReportCategory)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm gt report category with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportCategoryException} if it could not be found.
	*
	* @param id the primary key of the dm gt report category
	* @return the dm gt report category
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportCategoryException if a dm gt report category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportCategoryException;

	/**
	* Returns the dm gt report category with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm gt report category
	* @return the dm gt report category, or <code>null</code> if a dm gt report category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm gt report categories.
	*
	* @return the dm gt report categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm gt report categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm gt report categories
	* @param end the upper bound of the range of dm gt report categories (not inclusive)
	* @return the range of dm gt report categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm gt report categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm gt report categories
	* @param end the upper bound of the range of dm gt report categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm gt report categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm gt report categories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm gt report categories.
	*
	* @return the number of dm gt report categories
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}