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

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra;

/**
 * The persistence interface for the qlvt t t h c ket qua tham tra service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtTTHCKetQuaThamTraPersistenceImpl
 * @see QlvtTTHCKetQuaThamTraUtil
 * @generated
 */
public interface QlvtTTHCKetQuaThamTraPersistence extends BasePersistence<QlvtTTHCKetQuaThamTra> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QlvtTTHCKetQuaThamTraUtil} to access the qlvt t t h c ket qua tham tra persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the qlvt t t h c ket qua tham tras where maTTHC = &#63; and buocXuLy = &#63; and toChucXuLy = &#63;.
	*
	* @param maTTHC the ma t t h c
	* @param buocXuLy the buoc xu ly
	* @param toChucXuLy the to chuc xu ly
	* @return the matching qlvt t t h c ket qua tham tras
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra> findByToChucIdAndMaTthc(
		java.lang.String maTTHC, int buocXuLy, int toChucXuLy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt t t h c ket qua tham tras where maTTHC = &#63; and buocXuLy = &#63; and toChucXuLy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCKetQuaThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTTHC the ma t t h c
	* @param buocXuLy the buoc xu ly
	* @param toChucXuLy the to chuc xu ly
	* @param start the lower bound of the range of qlvt t t h c ket qua tham tras
	* @param end the upper bound of the range of qlvt t t h c ket qua tham tras (not inclusive)
	* @return the range of matching qlvt t t h c ket qua tham tras
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra> findByToChucIdAndMaTthc(
		java.lang.String maTTHC, int buocXuLy, int toChucXuLy, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt t t h c ket qua tham tras where maTTHC = &#63; and buocXuLy = &#63; and toChucXuLy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCKetQuaThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTTHC the ma t t h c
	* @param buocXuLy the buoc xu ly
	* @param toChucXuLy the to chuc xu ly
	* @param start the lower bound of the range of qlvt t t h c ket qua tham tras
	* @param end the upper bound of the range of qlvt t t h c ket qua tham tras (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching qlvt t t h c ket qua tham tras
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra> findByToChucIdAndMaTthc(
		java.lang.String maTTHC, int buocXuLy, int toChucXuLy, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first qlvt t t h c ket qua tham tra in the ordered set where maTTHC = &#63; and buocXuLy = &#63; and toChucXuLy = &#63;.
	*
	* @param maTTHC the ma t t h c
	* @param buocXuLy the buoc xu ly
	* @param toChucXuLy the to chuc xu ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt t t h c ket qua tham tra
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException if a matching qlvt t t h c ket qua tham tra could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra findByToChucIdAndMaTthc_First(
		java.lang.String maTTHC, int buocXuLy, int toChucXuLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException;

	/**
	* Returns the first qlvt t t h c ket qua tham tra in the ordered set where maTTHC = &#63; and buocXuLy = &#63; and toChucXuLy = &#63;.
	*
	* @param maTTHC the ma t t h c
	* @param buocXuLy the buoc xu ly
	* @param toChucXuLy the to chuc xu ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt t t h c ket qua tham tra, or <code>null</code> if a matching qlvt t t h c ket qua tham tra could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra fetchByToChucIdAndMaTthc_First(
		java.lang.String maTTHC, int buocXuLy, int toChucXuLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last qlvt t t h c ket qua tham tra in the ordered set where maTTHC = &#63; and buocXuLy = &#63; and toChucXuLy = &#63;.
	*
	* @param maTTHC the ma t t h c
	* @param buocXuLy the buoc xu ly
	* @param toChucXuLy the to chuc xu ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt t t h c ket qua tham tra
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException if a matching qlvt t t h c ket qua tham tra could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra findByToChucIdAndMaTthc_Last(
		java.lang.String maTTHC, int buocXuLy, int toChucXuLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException;

	/**
	* Returns the last qlvt t t h c ket qua tham tra in the ordered set where maTTHC = &#63; and buocXuLy = &#63; and toChucXuLy = &#63;.
	*
	* @param maTTHC the ma t t h c
	* @param buocXuLy the buoc xu ly
	* @param toChucXuLy the to chuc xu ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt t t h c ket qua tham tra, or <code>null</code> if a matching qlvt t t h c ket qua tham tra could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra fetchByToChucIdAndMaTthc_Last(
		java.lang.String maTTHC, int buocXuLy, int toChucXuLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt t t h c ket qua tham tras before and after the current qlvt t t h c ket qua tham tra in the ordered set where maTTHC = &#63; and buocXuLy = &#63; and toChucXuLy = &#63;.
	*
	* @param id the primary key of the current qlvt t t h c ket qua tham tra
	* @param maTTHC the ma t t h c
	* @param buocXuLy the buoc xu ly
	* @param toChucXuLy the to chuc xu ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next qlvt t t h c ket qua tham tra
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException if a qlvt t t h c ket qua tham tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra[] findByToChucIdAndMaTthc_PrevAndNext(
		long id, java.lang.String maTTHC, int buocXuLy, int toChucXuLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException;

	/**
	* Removes all the qlvt t t h c ket qua tham tras where maTTHC = &#63; and buocXuLy = &#63; and toChucXuLy = &#63; from the database.
	*
	* @param maTTHC the ma t t h c
	* @param buocXuLy the buoc xu ly
	* @param toChucXuLy the to chuc xu ly
	* @throws SystemException if a system exception occurred
	*/
	public void removeByToChucIdAndMaTthc(java.lang.String maTTHC,
		int buocXuLy, int toChucXuLy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt t t h c ket qua tham tras where maTTHC = &#63; and buocXuLy = &#63; and toChucXuLy = &#63;.
	*
	* @param maTTHC the ma t t h c
	* @param buocXuLy the buoc xu ly
	* @param toChucXuLy the to chuc xu ly
	* @return the number of matching qlvt t t h c ket qua tham tras
	* @throws SystemException if a system exception occurred
	*/
	public int countByToChucIdAndMaTthc(java.lang.String maTTHC, int buocXuLy,
		int toChucXuLy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the qlvt t t h c ket qua tham tra in the entity cache if it is enabled.
	*
	* @param qlvtTTHCKetQuaThamTra the qlvt t t h c ket qua tham tra
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra);

	/**
	* Caches the qlvt t t h c ket qua tham tras in the entity cache if it is enabled.
	*
	* @param qlvtTTHCKetQuaThamTras the qlvt t t h c ket qua tham tras
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra> qlvtTTHCKetQuaThamTras);

	/**
	* Creates a new qlvt t t h c ket qua tham tra with the primary key. Does not add the qlvt t t h c ket qua tham tra to the database.
	*
	* @param id the primary key for the new qlvt t t h c ket qua tham tra
	* @return the new qlvt t t h c ket qua tham tra
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra create(
		long id);

	/**
	* Removes the qlvt t t h c ket qua tham tra with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt t t h c ket qua tham tra
	* @return the qlvt t t h c ket qua tham tra that was removed
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException if a qlvt t t h c ket qua tham tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException;

	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt t t h c ket qua tham tra with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException} if it could not be found.
	*
	* @param id the primary key of the qlvt t t h c ket qua tham tra
	* @return the qlvt t t h c ket qua tham tra
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException if a qlvt t t h c ket qua tham tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException;

	/**
	* Returns the qlvt t t h c ket qua tham tra with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt t t h c ket qua tham tra
	* @return the qlvt t t h c ket qua tham tra, or <code>null</code> if a qlvt t t h c ket qua tham tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the qlvt t t h c ket qua tham tras.
	*
	* @return the qlvt t t h c ket qua tham tras
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt t t h c ket qua tham tras.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCKetQuaThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt t t h c ket qua tham tras
	* @param end the upper bound of the range of qlvt t t h c ket qua tham tras (not inclusive)
	* @return the range of qlvt t t h c ket qua tham tras
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt t t h c ket qua tham tras.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCKetQuaThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt t t h c ket qua tham tras
	* @param end the upper bound of the range of qlvt t t h c ket qua tham tras (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt t t h c ket qua tham tras
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the qlvt t t h c ket qua tham tras from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt t t h c ket qua tham tras.
	*
	* @return the number of qlvt t t h c ket qua tham tras
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}