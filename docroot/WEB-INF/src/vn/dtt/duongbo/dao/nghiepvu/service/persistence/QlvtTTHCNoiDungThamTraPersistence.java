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

package vn.dtt.duongbo.dao.nghiepvu.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra;

/**
 * The persistence interface for the qlvt t t h c noi dung tham tra service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtTTHCNoiDungThamTraPersistenceImpl
 * @see QlvtTTHCNoiDungThamTraUtil
 * @generated
 */
public interface QlvtTTHCNoiDungThamTraPersistence extends BasePersistence<QlvtTTHCNoiDungThamTra> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QlvtTTHCNoiDungThamTraUtil} to access the qlvt t t h c noi dung tham tra persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the qlvt t t h c noi dung tham tra where maTTHC = &#63; or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException} if it could not be found.
	*
	* @param maTTHC the ma t t h c
	* @return the matching qlvt t t h c noi dung tham tra
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException if a matching qlvt t t h c noi dung tham tra could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra findByF_MaTTHC(
		java.lang.String maTTHC)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException;

	/**
	* Returns the qlvt t t h c noi dung tham tra where maTTHC = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maTTHC the ma t t h c
	* @return the matching qlvt t t h c noi dung tham tra, or <code>null</code> if a matching qlvt t t h c noi dung tham tra could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra fetchByF_MaTTHC(
		java.lang.String maTTHC)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt t t h c noi dung tham tra where maTTHC = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maTTHC the ma t t h c
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching qlvt t t h c noi dung tham tra, or <code>null</code> if a matching qlvt t t h c noi dung tham tra could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra fetchByF_MaTTHC(
		java.lang.String maTTHC, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the qlvt t t h c noi dung tham tra where maTTHC = &#63; from the database.
	*
	* @param maTTHC the ma t t h c
	* @return the qlvt t t h c noi dung tham tra that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra removeByF_MaTTHC(
		java.lang.String maTTHC)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException;

	/**
	* Returns the number of qlvt t t h c noi dung tham tras where maTTHC = &#63;.
	*
	* @param maTTHC the ma t t h c
	* @return the number of matching qlvt t t h c noi dung tham tras
	* @throws SystemException if a system exception occurred
	*/
	public int countByF_MaTTHC(java.lang.String maTTHC)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the qlvt t t h c noi dung tham tra in the entity cache if it is enabled.
	*
	* @param qlvtTTHCNoiDungThamTra the qlvt t t h c noi dung tham tra
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra);

	/**
	* Caches the qlvt t t h c noi dung tham tras in the entity cache if it is enabled.
	*
	* @param qlvtTTHCNoiDungThamTras the qlvt t t h c noi dung tham tras
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra> qlvtTTHCNoiDungThamTras);

	/**
	* Creates a new qlvt t t h c noi dung tham tra with the primary key. Does not add the qlvt t t h c noi dung tham tra to the database.
	*
	* @param id the primary key for the new qlvt t t h c noi dung tham tra
	* @return the new qlvt t t h c noi dung tham tra
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra create(
		long id);

	/**
	* Removes the qlvt t t h c noi dung tham tra with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt t t h c noi dung tham tra
	* @return the qlvt t t h c noi dung tham tra that was removed
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException if a qlvt t t h c noi dung tham tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException;

	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt t t h c noi dung tham tra with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException} if it could not be found.
	*
	* @param id the primary key of the qlvt t t h c noi dung tham tra
	* @return the qlvt t t h c noi dung tham tra
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException if a qlvt t t h c noi dung tham tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException;

	/**
	* Returns the qlvt t t h c noi dung tham tra with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt t t h c noi dung tham tra
	* @return the qlvt t t h c noi dung tham tra, or <code>null</code> if a qlvt t t h c noi dung tham tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the qlvt t t h c noi dung tham tras.
	*
	* @return the qlvt t t h c noi dung tham tras
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt t t h c noi dung tham tras.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCNoiDungThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt t t h c noi dung tham tras
	* @param end the upper bound of the range of qlvt t t h c noi dung tham tras (not inclusive)
	* @return the range of qlvt t t h c noi dung tham tras
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt t t h c noi dung tham tras.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCNoiDungThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt t t h c noi dung tham tras
	* @param end the upper bound of the range of qlvt t t h c noi dung tham tras (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt t t h c noi dung tham tras
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the qlvt t t h c noi dung tham tras from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt t t h c noi dung tham tras.
	*
	* @return the number of qlvt t t h c noi dung tham tras
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}