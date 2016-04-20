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

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo;

/**
 * The persistence interface for the qlvt thong tin ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoPersistenceImpl
 * @see QlvtThongTinHoSoUtil
 * @generated
 */
public interface QlvtThongTinHoSoPersistence extends BasePersistence<QlvtThongTinHoSo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QlvtThongTinHoSoUtil} to access the qlvt thong tin ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the qlvt thong tin ho so where maSoHoSo = &#63; or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException} if it could not be found.
	*
	* @param maSoHoSo the ma so ho so
	* @return the matching qlvt thong tin ho so
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException if a matching qlvt thong tin ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo findByMaSoHoSo(
		java.lang.String maSoHoSo)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException;

	/**
	* Returns the qlvt thong tin ho so where maSoHoSo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maSoHoSo the ma so ho so
	* @return the matching qlvt thong tin ho so, or <code>null</code> if a matching qlvt thong tin ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo fetchByMaSoHoSo(
		java.lang.String maSoHoSo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt thong tin ho so where maSoHoSo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maSoHoSo the ma so ho so
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching qlvt thong tin ho so, or <code>null</code> if a matching qlvt thong tin ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo fetchByMaSoHoSo(
		java.lang.String maSoHoSo, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the qlvt thong tin ho so where maSoHoSo = &#63; from the database.
	*
	* @param maSoHoSo the ma so ho so
	* @return the qlvt thong tin ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo removeByMaSoHoSo(
		java.lang.String maSoHoSo)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException;

	/**
	* Returns the number of qlvt thong tin ho sos where maSoHoSo = &#63;.
	*
	* @param maSoHoSo the ma so ho so
	* @return the number of matching qlvt thong tin ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByMaSoHoSo(java.lang.String maSoHoSo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt thong tin ho so where phieuXuLyId = &#63; or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException} if it could not be found.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @return the matching qlvt thong tin ho so
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException if a matching qlvt thong tin ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo findByphieuXuLyId(
		long phieuXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException;

	/**
	* Returns the qlvt thong tin ho so where phieuXuLyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @return the matching qlvt thong tin ho so, or <code>null</code> if a matching qlvt thong tin ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo fetchByphieuXuLyId(
		long phieuXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt thong tin ho so where phieuXuLyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching qlvt thong tin ho so, or <code>null</code> if a matching qlvt thong tin ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo fetchByphieuXuLyId(
		long phieuXuLyId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the qlvt thong tin ho so where phieuXuLyId = &#63; from the database.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @return the qlvt thong tin ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo removeByphieuXuLyId(
		long phieuXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException;

	/**
	* Returns the number of qlvt thong tin ho sos where phieuXuLyId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @return the number of matching qlvt thong tin ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByphieuXuLyId(long phieuXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the qlvt thong tin ho so in the entity cache if it is enabled.
	*
	* @param qlvtThongTinHoSo the qlvt thong tin ho so
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo qlvtThongTinHoSo);

	/**
	* Caches the qlvt thong tin ho sos in the entity cache if it is enabled.
	*
	* @param qlvtThongTinHoSos the qlvt thong tin ho sos
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo> qlvtThongTinHoSos);

	/**
	* Creates a new qlvt thong tin ho so with the primary key. Does not add the qlvt thong tin ho so to the database.
	*
	* @param id the primary key for the new qlvt thong tin ho so
	* @return the new qlvt thong tin ho so
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo create(long id);

	/**
	* Removes the qlvt thong tin ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt thong tin ho so
	* @return the qlvt thong tin ho so that was removed
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException if a qlvt thong tin ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException;

	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo qlvtThongTinHoSo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt thong tin ho so with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException} if it could not be found.
	*
	* @param id the primary key of the qlvt thong tin ho so
	* @return the qlvt thong tin ho so
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException if a qlvt thong tin ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException;

	/**
	* Returns the qlvt thong tin ho so with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt thong tin ho so
	* @return the qlvt thong tin ho so, or <code>null</code> if a qlvt thong tin ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the qlvt thong tin ho sos.
	*
	* @return the qlvt thong tin ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt thong tin ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt thong tin ho sos
	* @param end the upper bound of the range of qlvt thong tin ho sos (not inclusive)
	* @return the range of qlvt thong tin ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt thong tin ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt thong tin ho sos
	* @param end the upper bound of the range of qlvt thong tin ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt thong tin ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the qlvt thong tin ho sos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt thong tin ho sos.
	*
	* @return the number of qlvt thong tin ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}