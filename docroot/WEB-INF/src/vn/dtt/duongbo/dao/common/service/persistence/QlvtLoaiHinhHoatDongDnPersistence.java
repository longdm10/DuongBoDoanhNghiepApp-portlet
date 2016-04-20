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

package vn.dtt.duongbo.dao.common.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn;

/**
 * The persistence interface for the qlvt loai hinh hoat dong dn service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see QlvtLoaiHinhHoatDongDnPersistenceImpl
 * @see QlvtLoaiHinhHoatDongDnUtil
 * @generated
 */
public interface QlvtLoaiHinhHoatDongDnPersistence extends BasePersistence<QlvtLoaiHinhHoatDongDn> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QlvtLoaiHinhHoatDongDnUtil} to access the qlvt loai hinh hoat dong dn persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the qlvt loai hinh hoat dong dn where hoSoThuTucId = &#63; and maLoaiHinhHoatDong = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param maLoaiHinhHoatDong the ma loai hinh hoat dong
	* @return the matching qlvt loai hinh hoat dong dn
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException if a matching qlvt loai hinh hoat dong dn could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn findByHoSoThuTucIdAndMaLhhd(
		long hoSoThuTucId, java.lang.String maLoaiHinhHoatDong)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException;

	/**
	* Returns the qlvt loai hinh hoat dong dn where hoSoThuTucId = &#63; and maLoaiHinhHoatDong = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param maLoaiHinhHoatDong the ma loai hinh hoat dong
	* @return the matching qlvt loai hinh hoat dong dn, or <code>null</code> if a matching qlvt loai hinh hoat dong dn could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn fetchByHoSoThuTucIdAndMaLhhd(
		long hoSoThuTucId, java.lang.String maLoaiHinhHoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt loai hinh hoat dong dn where hoSoThuTucId = &#63; and maLoaiHinhHoatDong = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param maLoaiHinhHoatDong the ma loai hinh hoat dong
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching qlvt loai hinh hoat dong dn, or <code>null</code> if a matching qlvt loai hinh hoat dong dn could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn fetchByHoSoThuTucIdAndMaLhhd(
		long hoSoThuTucId, java.lang.String maLoaiHinhHoatDong,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the qlvt loai hinh hoat dong dn where hoSoThuTucId = &#63; and maLoaiHinhHoatDong = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param maLoaiHinhHoatDong the ma loai hinh hoat dong
	* @return the qlvt loai hinh hoat dong dn that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn removeByHoSoThuTucIdAndMaLhhd(
		long hoSoThuTucId, java.lang.String maLoaiHinhHoatDong)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException;

	/**
	* Returns the number of qlvt loai hinh hoat dong dns where hoSoThuTucId = &#63; and maLoaiHinhHoatDong = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param maLoaiHinhHoatDong the ma loai hinh hoat dong
	* @return the number of matching qlvt loai hinh hoat dong dns
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoSoThuTucIdAndMaLhhd(long hoSoThuTucId,
		java.lang.String maLoaiHinhHoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the qlvt loai hinh hoat dong dns where noiDungHoSoId = &#63;.
	*
	* @param noiDungHoSoId the noi dung ho so ID
	* @return the matching qlvt loai hinh hoat dong dns
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn> findByNoiDungHoSoId(
		long noiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt loai hinh hoat dong dns where noiDungHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtLoaiHinhHoatDongDnModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param noiDungHoSoId the noi dung ho so ID
	* @param start the lower bound of the range of qlvt loai hinh hoat dong dns
	* @param end the upper bound of the range of qlvt loai hinh hoat dong dns (not inclusive)
	* @return the range of matching qlvt loai hinh hoat dong dns
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn> findByNoiDungHoSoId(
		long noiDungHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt loai hinh hoat dong dns where noiDungHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtLoaiHinhHoatDongDnModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param noiDungHoSoId the noi dung ho so ID
	* @param start the lower bound of the range of qlvt loai hinh hoat dong dns
	* @param end the upper bound of the range of qlvt loai hinh hoat dong dns (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching qlvt loai hinh hoat dong dns
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn> findByNoiDungHoSoId(
		long noiDungHoSoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first qlvt loai hinh hoat dong dn in the ordered set where noiDungHoSoId = &#63;.
	*
	* @param noiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt loai hinh hoat dong dn
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException if a matching qlvt loai hinh hoat dong dn could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn findByNoiDungHoSoId_First(
		long noiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException;

	/**
	* Returns the first qlvt loai hinh hoat dong dn in the ordered set where noiDungHoSoId = &#63;.
	*
	* @param noiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt loai hinh hoat dong dn, or <code>null</code> if a matching qlvt loai hinh hoat dong dn could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn fetchByNoiDungHoSoId_First(
		long noiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last qlvt loai hinh hoat dong dn in the ordered set where noiDungHoSoId = &#63;.
	*
	* @param noiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt loai hinh hoat dong dn
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException if a matching qlvt loai hinh hoat dong dn could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn findByNoiDungHoSoId_Last(
		long noiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException;

	/**
	* Returns the last qlvt loai hinh hoat dong dn in the ordered set where noiDungHoSoId = &#63;.
	*
	* @param noiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt loai hinh hoat dong dn, or <code>null</code> if a matching qlvt loai hinh hoat dong dn could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn fetchByNoiDungHoSoId_Last(
		long noiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt loai hinh hoat dong dns before and after the current qlvt loai hinh hoat dong dn in the ordered set where noiDungHoSoId = &#63;.
	*
	* @param id the primary key of the current qlvt loai hinh hoat dong dn
	* @param noiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next qlvt loai hinh hoat dong dn
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException if a qlvt loai hinh hoat dong dn with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn[] findByNoiDungHoSoId_PrevAndNext(
		long id, long noiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException;

	/**
	* Removes all the qlvt loai hinh hoat dong dns where noiDungHoSoId = &#63; from the database.
	*
	* @param noiDungHoSoId the noi dung ho so ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNoiDungHoSoId(long noiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt loai hinh hoat dong dns where noiDungHoSoId = &#63;.
	*
	* @param noiDungHoSoId the noi dung ho so ID
	* @return the number of matching qlvt loai hinh hoat dong dns
	* @throws SystemException if a system exception occurred
	*/
	public int countByNoiDungHoSoId(long noiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the qlvt loai hinh hoat dong dn in the entity cache if it is enabled.
	*
	* @param qlvtLoaiHinhHoatDongDn the qlvt loai hinh hoat dong dn
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn);

	/**
	* Caches the qlvt loai hinh hoat dong dns in the entity cache if it is enabled.
	*
	* @param qlvtLoaiHinhHoatDongDns the qlvt loai hinh hoat dong dns
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn> qlvtLoaiHinhHoatDongDns);

	/**
	* Creates a new qlvt loai hinh hoat dong dn with the primary key. Does not add the qlvt loai hinh hoat dong dn to the database.
	*
	* @param id the primary key for the new qlvt loai hinh hoat dong dn
	* @return the new qlvt loai hinh hoat dong dn
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn create(
		long id);

	/**
	* Removes the qlvt loai hinh hoat dong dn with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt loai hinh hoat dong dn
	* @return the qlvt loai hinh hoat dong dn that was removed
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException if a qlvt loai hinh hoat dong dn with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException;

	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn updateImpl(
		vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt loai hinh hoat dong dn with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException} if it could not be found.
	*
	* @param id the primary key of the qlvt loai hinh hoat dong dn
	* @return the qlvt loai hinh hoat dong dn
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException if a qlvt loai hinh hoat dong dn with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException;

	/**
	* Returns the qlvt loai hinh hoat dong dn with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt loai hinh hoat dong dn
	* @return the qlvt loai hinh hoat dong dn, or <code>null</code> if a qlvt loai hinh hoat dong dn with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the qlvt loai hinh hoat dong dns.
	*
	* @return the qlvt loai hinh hoat dong dns
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt loai hinh hoat dong dns.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtLoaiHinhHoatDongDnModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt loai hinh hoat dong dns
	* @param end the upper bound of the range of qlvt loai hinh hoat dong dns (not inclusive)
	* @return the range of qlvt loai hinh hoat dong dns
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt loai hinh hoat dong dns.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtLoaiHinhHoatDongDnModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt loai hinh hoat dong dns
	* @param end the upper bound of the range of qlvt loai hinh hoat dong dns (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt loai hinh hoat dong dns
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the qlvt loai hinh hoat dong dns from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt loai hinh hoat dong dns.
	*
	* @return the number of qlvt loai hinh hoat dong dns
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}