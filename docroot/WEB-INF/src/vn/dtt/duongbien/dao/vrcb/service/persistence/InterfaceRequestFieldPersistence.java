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

import vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField;

/**
 * The persistence interface for the interface request field service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see InterfaceRequestFieldPersistenceImpl
 * @see InterfaceRequestFieldUtil
 * @generated
 */
public interface InterfaceRequestFieldPersistence extends BasePersistence<InterfaceRequestField> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InterfaceRequestFieldUtil} to access the interface request field persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the interface request field where requestCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException} if it could not be found.
	*
	* @param requestCode the request code
	* @return the matching interface request field
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException if a matching interface request field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException;

	/**
	* Returns the interface request field where requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param requestCode the request code
	* @return the matching interface request field, or <code>null</code> if a matching interface request field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField fetchByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the interface request field where requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param requestCode the request code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching interface request field, or <code>null</code> if a matching interface request field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField fetchByRequestCode(
		java.lang.String requestCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the interface request field where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @return the interface request field that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField removeByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException;

	/**
	* Returns the number of interface request fields where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the interface request fields where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @return the matching interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField> findByOrganizationCode(
		java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the interface request fields where organizationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationCode the organization code
	* @param start the lower bound of the range of interface request fields
	* @param end the upper bound of the range of interface request fields (not inclusive)
	* @return the range of matching interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField> findByOrganizationCode(
		java.lang.String organizationCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the interface request fields where organizationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationCode the organization code
	* @param start the lower bound of the range of interface request fields
	* @param end the upper bound of the range of interface request fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField> findByOrganizationCode(
		java.lang.String organizationCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first interface request field in the ordered set where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching interface request field
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException if a matching interface request field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField findByOrganizationCode_First(
		java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException;

	/**
	* Returns the first interface request field in the ordered set where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching interface request field, or <code>null</code> if a matching interface request field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField fetchByOrganizationCode_First(
		java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last interface request field in the ordered set where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching interface request field
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException if a matching interface request field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField findByOrganizationCode_Last(
		java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException;

	/**
	* Returns the last interface request field in the ordered set where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching interface request field, or <code>null</code> if a matching interface request field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField fetchByOrganizationCode_Last(
		java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the interface request fields before and after the current interface request field in the ordered set where organizationCode = &#63;.
	*
	* @param id the primary key of the current interface request field
	* @param organizationCode the organization code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next interface request field
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException if a interface request field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField[] findByOrganizationCode_PrevAndNext(
		long id, java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException;

	/**
	* Removes all the interface request fields where organizationCode = &#63; from the database.
	*
	* @param organizationCode the organization code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByOrganizationCode(java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of interface request fields where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @return the number of matching interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public int countByOrganizationCode(java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the interface request fields where locCode = &#63;.
	*
	* @param locCode the loc code
	* @return the matching interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField> findByLocCode(
		java.lang.String locCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the interface request fields where locCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param locCode the loc code
	* @param start the lower bound of the range of interface request fields
	* @param end the upper bound of the range of interface request fields (not inclusive)
	* @return the range of matching interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField> findByLocCode(
		java.lang.String locCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the interface request fields where locCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param locCode the loc code
	* @param start the lower bound of the range of interface request fields
	* @param end the upper bound of the range of interface request fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField> findByLocCode(
		java.lang.String locCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first interface request field in the ordered set where locCode = &#63;.
	*
	* @param locCode the loc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching interface request field
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException if a matching interface request field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField findByLocCode_First(
		java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException;

	/**
	* Returns the first interface request field in the ordered set where locCode = &#63;.
	*
	* @param locCode the loc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching interface request field, or <code>null</code> if a matching interface request field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField fetchByLocCode_First(
		java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last interface request field in the ordered set where locCode = &#63;.
	*
	* @param locCode the loc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching interface request field
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException if a matching interface request field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField findByLocCode_Last(
		java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException;

	/**
	* Returns the last interface request field in the ordered set where locCode = &#63;.
	*
	* @param locCode the loc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching interface request field, or <code>null</code> if a matching interface request field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField fetchByLocCode_Last(
		java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the interface request fields before and after the current interface request field in the ordered set where locCode = &#63;.
	*
	* @param id the primary key of the current interface request field
	* @param locCode the loc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next interface request field
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException if a interface request field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField[] findByLocCode_PrevAndNext(
		long id, java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException;

	/**
	* Removes all the interface request fields where locCode = &#63; from the database.
	*
	* @param locCode the loc code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByLocCode(java.lang.String locCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of interface request fields where locCode = &#63;.
	*
	* @param locCode the loc code
	* @return the number of matching interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public int countByLocCode(java.lang.String locCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the interface request field in the entity cache if it is enabled.
	*
	* @param interfaceRequestField the interface request field
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField interfaceRequestField);

	/**
	* Caches the interface request fields in the entity cache if it is enabled.
	*
	* @param interfaceRequestFields the interface request fields
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField> interfaceRequestFields);

	/**
	* Creates a new interface request field with the primary key. Does not add the interface request field to the database.
	*
	* @param id the primary key for the new interface request field
	* @return the new interface request field
	*/
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField create(long id);

	/**
	* Removes the interface request field with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the interface request field
	* @return the interface request field that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException if a interface request field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException;

	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField interfaceRequestField)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the interface request field with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException} if it could not be found.
	*
	* @param id the primary key of the interface request field
	* @return the interface request field
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException if a interface request field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException;

	/**
	* Returns the interface request field with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the interface request field
	* @return the interface request field, or <code>null</code> if a interface request field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the interface request fields.
	*
	* @return the interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the interface request fields.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of interface request fields
	* @param end the upper bound of the range of interface request fields (not inclusive)
	* @return the range of interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the interface request fields.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of interface request fields
	* @param end the upper bound of the range of interface request fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the interface request fields from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of interface request fields.
	*
	* @return the number of interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}