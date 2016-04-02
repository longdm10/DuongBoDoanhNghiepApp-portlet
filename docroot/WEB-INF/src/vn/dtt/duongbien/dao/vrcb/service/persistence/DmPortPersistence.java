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

import vn.dtt.duongbien.dao.vrcb.model.DmPort;

/**
 * The persistence interface for the dm port service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmPortPersistenceImpl
 * @see DmPortUtil
 * @generated
 */
public interface DmPortPersistence extends BasePersistence<DmPort> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmPortUtil} to access the dm port persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dm ports where portCode = &#63;.
	*
	* @param portCode the port code
	* @return the matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPort> findByPortCode(
		java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm ports where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portCode the port code
	* @param start the lower bound of the range of dm ports
	* @param end the upper bound of the range of dm ports (not inclusive)
	* @return the range of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPort> findByPortCode(
		java.lang.String portCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm ports where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portCode the port code
	* @param start the lower bound of the range of dm ports
	* @param end the upper bound of the range of dm ports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPort> findByPortCode(
		java.lang.String portCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm port in the ordered set where portCode = &#63;.
	*
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPort findByPortCode_First(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException;

	/**
	* Returns the first dm port in the ordered set where portCode = &#63;.
	*
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port, or <code>null</code> if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPort fetchByPortCode_First(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm port in the ordered set where portCode = &#63;.
	*
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPort findByPortCode_Last(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException;

	/**
	* Returns the last dm port in the ordered set where portCode = &#63;.
	*
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port, or <code>null</code> if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPort fetchByPortCode_Last(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm ports before and after the current dm port in the ordered set where portCode = &#63;.
	*
	* @param id the primary key of the current dm port
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm port
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a dm port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPort[] findByPortCode_PrevAndNext(
		int id, java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException;

	/**
	* Removes all the dm ports where portCode = &#63; from the database.
	*
	* @param portCode the port code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPortCode(java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm ports where portCode = &#63;.
	*
	* @param portCode the port code
	* @return the number of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public int countByPortCode(java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm ports where loCode = &#63;.
	*
	* @param loCode the lo code
	* @return the matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPort> findByLoCode(
		java.lang.String loCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm ports where loCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param loCode the lo code
	* @param start the lower bound of the range of dm ports
	* @param end the upper bound of the range of dm ports (not inclusive)
	* @return the range of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPort> findByLoCode(
		java.lang.String loCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm ports where loCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param loCode the lo code
	* @param start the lower bound of the range of dm ports
	* @param end the upper bound of the range of dm ports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPort> findByLoCode(
		java.lang.String loCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm port in the ordered set where loCode = &#63;.
	*
	* @param loCode the lo code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPort findByLoCode_First(
		java.lang.String loCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException;

	/**
	* Returns the first dm port in the ordered set where loCode = &#63;.
	*
	* @param loCode the lo code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port, or <code>null</code> if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPort fetchByLoCode_First(
		java.lang.String loCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm port in the ordered set where loCode = &#63;.
	*
	* @param loCode the lo code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPort findByLoCode_Last(
		java.lang.String loCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException;

	/**
	* Returns the last dm port in the ordered set where loCode = &#63;.
	*
	* @param loCode the lo code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port, or <code>null</code> if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPort fetchByLoCode_Last(
		java.lang.String loCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm ports before and after the current dm port in the ordered set where loCode = &#63;.
	*
	* @param id the primary key of the current dm port
	* @param loCode the lo code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm port
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a dm port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPort[] findByLoCode_PrevAndNext(
		int id, java.lang.String loCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException;

	/**
	* Removes all the dm ports where loCode = &#63; from the database.
	*
	* @param loCode the lo code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByLoCode(java.lang.String loCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm ports where loCode = &#63;.
	*
	* @param loCode the lo code
	* @return the number of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public int countByLoCode(java.lang.String loCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm port in the entity cache if it is enabled.
	*
	* @param dmPort the dm port
	*/
	public void cacheResult(vn.dtt.duongbien.dao.vrcb.model.DmPort dmPort);

	/**
	* Caches the dm ports in the entity cache if it is enabled.
	*
	* @param dmPorts the dm ports
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPort> dmPorts);

	/**
	* Creates a new dm port with the primary key. Does not add the dm port to the database.
	*
	* @param id the primary key for the new dm port
	* @return the new dm port
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPort create(int id);

	/**
	* Removes the dm port with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm port
	* @return the dm port that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a dm port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPort remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException;

	public vn.dtt.duongbien.dao.vrcb.model.DmPort updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmPort dmPort)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm port with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException} if it could not be found.
	*
	* @param id the primary key of the dm port
	* @return the dm port
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException if a dm port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPort findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException;

	/**
	* Returns the dm port with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm port
	* @return the dm port, or <code>null</code> if a dm port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmPort fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm ports.
	*
	* @return the dm ports
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPort> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm ports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm ports
	* @param end the upper bound of the range of dm ports (not inclusive)
	* @return the range of dm ports
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPort> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm ports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm ports
	* @param end the upper bound of the range of dm ports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm ports
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPort> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm ports from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm ports.
	*
	* @return the number of dm ports
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}