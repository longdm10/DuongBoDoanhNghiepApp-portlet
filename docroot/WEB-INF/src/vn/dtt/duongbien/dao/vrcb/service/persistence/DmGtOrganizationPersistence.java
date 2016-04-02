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

import vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization;

/**
 * The persistence interface for the dm gt organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmGtOrganizationPersistenceImpl
 * @see DmGtOrganizationUtil
 * @generated
 */
public interface DmGtOrganizationPersistence extends BasePersistence<DmGtOrganization> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmGtOrganizationUtil} to access the dm gt organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the dm gt organization where organizationCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGtOrganizationException} if it could not be found.
	*
	* @param organizationCode the organization code
	* @return the matching dm gt organization
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtOrganizationException if a matching dm gt organization could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization findByOrganizationCode(
		java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGtOrganizationException;

	/**
	* Returns the dm gt organization where organizationCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param organizationCode the organization code
	* @return the matching dm gt organization, or <code>null</code> if a matching dm gt organization could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization fetchByOrganizationCode(
		java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm gt organization where organizationCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param organizationCode the organization code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm gt organization, or <code>null</code> if a matching dm gt organization could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization fetchByOrganizationCode(
		java.lang.String organizationCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm gt organization where organizationCode = &#63; from the database.
	*
	* @param organizationCode the organization code
	* @return the dm gt organization that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization removeByOrganizationCode(
		java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGtOrganizationException;

	/**
	* Returns the number of dm gt organizations where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @return the number of matching dm gt organizations
	* @throws SystemException if a system exception occurred
	*/
	public int countByOrganizationCode(java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm gt organization in the entity cache if it is enabled.
	*
	* @param dmGtOrganization the dm gt organization
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization dmGtOrganization);

	/**
	* Caches the dm gt organizations in the entity cache if it is enabled.
	*
	* @param dmGtOrganizations the dm gt organizations
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization> dmGtOrganizations);

	/**
	* Creates a new dm gt organization with the primary key. Does not add the dm gt organization to the database.
	*
	* @param id the primary key for the new dm gt organization
	* @return the new dm gt organization
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization create(long id);

	/**
	* Removes the dm gt organization with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm gt organization
	* @return the dm gt organization that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtOrganizationException if a dm gt organization with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGtOrganizationException;

	public vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization dmGtOrganization)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm gt organization with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGtOrganizationException} if it could not be found.
	*
	* @param id the primary key of the dm gt organization
	* @return the dm gt organization
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtOrganizationException if a dm gt organization with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGtOrganizationException;

	/**
	* Returns the dm gt organization with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm gt organization
	* @return the dm gt organization, or <code>null</code> if a dm gt organization with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm gt organizations.
	*
	* @return the dm gt organizations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm gt organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm gt organizations
	* @param end the upper bound of the range of dm gt organizations (not inclusive)
	* @return the range of dm gt organizations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm gt organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm gt organizations
	* @param end the upper bound of the range of dm gt organizations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm gt organizations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtOrganization> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm gt organizations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm gt organizations.
	*
	* @return the number of dm gt organizations
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}