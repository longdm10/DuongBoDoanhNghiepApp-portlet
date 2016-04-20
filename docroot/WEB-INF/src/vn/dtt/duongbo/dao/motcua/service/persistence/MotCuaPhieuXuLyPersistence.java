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

package vn.dtt.duongbo.dao.motcua.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy;

/**
 * The persistence interface for the mot cua phieu xu ly service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaPhieuXuLyPersistenceImpl
 * @see MotCuaPhieuXuLyUtil
 * @generated
 */
public interface MotCuaPhieuXuLyPersistence extends BasePersistence<MotCuaPhieuXuLy> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MotCuaPhieuXuLyUtil} to access the mot cua phieu xu ly persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the mot cua phieu xu ly where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @return the matching mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy findByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException;

	/**
	* Returns the mot cua phieu xu ly where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @return the matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy fetchByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua phieu xu ly where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy fetchByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the mot cua phieu xu ly where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @return the mot cua phieu xu ly that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy removeByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException;

	/**
	* Returns the number of mot cua phieu xu lies where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @return the number of matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoSoThuTucIdAndQuyTrinhThuTucId(long hoSoThuTucId,
		long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua phieu xu lies where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @return the matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByToChucQuanLyAndPhanNhomHoSo(
		long toChucQuanLy, long phanNhomHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua phieu xu lies where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @param start the lower bound of the range of mot cua phieu xu lies
	* @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	* @return the range of matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByToChucQuanLyAndPhanNhomHoSo(
		long toChucQuanLy, long phanNhomHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua phieu xu lies where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @param start the lower bound of the range of mot cua phieu xu lies
	* @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByToChucQuanLyAndPhanNhomHoSo(
		long toChucQuanLy, long phanNhomHoSoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy findByToChucQuanLyAndPhanNhomHoSo_First(
		long toChucQuanLy, long phanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException;

	/**
	* Returns the first mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy fetchByToChucQuanLyAndPhanNhomHoSo_First(
		long toChucQuanLy, long phanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy findByToChucQuanLyAndPhanNhomHoSo_Last(
		long toChucQuanLy, long phanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException;

	/**
	* Returns the last mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy fetchByToChucQuanLyAndPhanNhomHoSo_Last(
		long toChucQuanLy, long phanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua phieu xu lies before and after the current mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	*
	* @param id the primary key of the current mot cua phieu xu ly
	* @param toChucQuanLy the to chuc quan ly
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a mot cua phieu xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy[] findByToChucQuanLyAndPhanNhomHoSo_PrevAndNext(
		long id, long toChucQuanLy, long phanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException;

	/**
	* Removes all the mot cua phieu xu lies where toChucQuanLy = &#63; and phanNhomHoSoId = &#63; from the database.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByToChucQuanLyAndPhanNhomHoSo(long toChucQuanLy,
		long phanNhomHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua phieu xu lies where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @return the number of matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public int countByToChucQuanLyAndPhanNhomHoSo(long toChucQuanLy,
		long phanNhomHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua phieu xu lies where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @return the matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByToChucQuanLyId(
		long toChucQuanLy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua phieu xu lies where toChucQuanLy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param start the lower bound of the range of mot cua phieu xu lies
	* @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	* @return the range of matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByToChucQuanLyId(
		long toChucQuanLy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua phieu xu lies where toChucQuanLy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param start the lower bound of the range of mot cua phieu xu lies
	* @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByToChucQuanLyId(
		long toChucQuanLy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy findByToChucQuanLyId_First(
		long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException;

	/**
	* Returns the first mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy fetchByToChucQuanLyId_First(
		long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy findByToChucQuanLyId_Last(
		long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException;

	/**
	* Returns the last mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy fetchByToChucQuanLyId_Last(
		long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua phieu xu lies before and after the current mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63;.
	*
	* @param id the primary key of the current mot cua phieu xu ly
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a mot cua phieu xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy[] findByToChucQuanLyId_PrevAndNext(
		long id, long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException;

	/**
	* Removes all the mot cua phieu xu lies where toChucQuanLy = &#63; from the database.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @throws SystemException if a system exception occurred
	*/
	public void removeByToChucQuanLyId(long toChucQuanLy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua phieu xu lies where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @return the number of matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public int countByToChucQuanLyId(long toChucQuanLy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua phieu xu lies where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua phieu xu lies where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of mot cua phieu xu lies
	* @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	* @return the range of matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua phieu xu lies where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of mot cua phieu xu lies
	* @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua phieu xu ly in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy findByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException;

	/**
	* Returns the first mot cua phieu xu ly in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy fetchByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua phieu xu ly in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy findByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException;

	/**
	* Returns the last mot cua phieu xu ly in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy fetchByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua phieu xu lies before and after the current mot cua phieu xu ly in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param id the primary key of the current mot cua phieu xu ly
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a mot cua phieu xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy[] findByHoSoThuTucId_PrevAndNext(
		long id, long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException;

	/**
	* Removes all the mot cua phieu xu lies where hoSoThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua phieu xu lies where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the mot cua phieu xu ly in the entity cache if it is enabled.
	*
	* @param motCuaPhieuXuLy the mot cua phieu xu ly
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy motCuaPhieuXuLy);

	/**
	* Caches the mot cua phieu xu lies in the entity cache if it is enabled.
	*
	* @param motCuaPhieuXuLies the mot cua phieu xu lies
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> motCuaPhieuXuLies);

	/**
	* Creates a new mot cua phieu xu ly with the primary key. Does not add the mot cua phieu xu ly to the database.
	*
	* @param id the primary key for the new mot cua phieu xu ly
	* @return the new mot cua phieu xu ly
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy create(long id);

	/**
	* Removes the mot cua phieu xu ly with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua phieu xu ly
	* @return the mot cua phieu xu ly that was removed
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a mot cua phieu xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException;

	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy updateImpl(
		vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy motCuaPhieuXuLy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua phieu xu ly with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException} if it could not be found.
	*
	* @param id the primary key of the mot cua phieu xu ly
	* @return the mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a mot cua phieu xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException;

	/**
	* Returns the mot cua phieu xu ly with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua phieu xu ly
	* @return the mot cua phieu xu ly, or <code>null</code> if a mot cua phieu xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua phieu xu lies.
	*
	* @return the mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua phieu xu lies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua phieu xu lies
	* @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	* @return the range of mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua phieu xu lies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua phieu xu lies
	* @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the mot cua phieu xu lies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua phieu xu lies.
	*
	* @return the number of mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}