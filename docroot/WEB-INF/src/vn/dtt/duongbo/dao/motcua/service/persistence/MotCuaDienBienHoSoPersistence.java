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

import vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo;

/**
 * The persistence interface for the mot cua dien bien ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaDienBienHoSoPersistenceImpl
 * @see MotCuaDienBienHoSoUtil
 * @generated
 */
public interface MotCuaDienBienHoSoPersistence extends BasePersistence<MotCuaDienBienHoSo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MotCuaDienBienHoSoUtil} to access the mot cua dien bien ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the mot cua dien bien ho sos where trangThaiTruocId = &#63;.
	*
	* @param trangThaiTruocId the trang thai truoc ID
	* @return the matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo> findByTrangThaiTruocId(
		long trangThaiTruocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua dien bien ho sos where trangThaiTruocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param trangThaiTruocId the trang thai truoc ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @return the range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo> findByTrangThaiTruocId(
		long trangThaiTruocId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua dien bien ho sos where trangThaiTruocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param trangThaiTruocId the trang thai truoc ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo> findByTrangThaiTruocId(
		long trangThaiTruocId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where trangThaiTruocId = &#63;.
	*
	* @param trangThaiTruocId the trang thai truoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo findByTrangThaiTruocId_First(
		long trangThaiTruocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where trangThaiTruocId = &#63;.
	*
	* @param trangThaiTruocId the trang thai truoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo fetchByTrangThaiTruocId_First(
		long trangThaiTruocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where trangThaiTruocId = &#63;.
	*
	* @param trangThaiTruocId the trang thai truoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo findByTrangThaiTruocId_Last(
		long trangThaiTruocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where trangThaiTruocId = &#63;.
	*
	* @param trangThaiTruocId the trang thai truoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo fetchByTrangThaiTruocId_Last(
		long trangThaiTruocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua dien bien ho sos before and after the current mot cua dien bien ho so in the ordered set where trangThaiTruocId = &#63;.
	*
	* @param id the primary key of the current mot cua dien bien ho so
	* @param trangThaiTruocId the trang thai truoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua dien bien ho so
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo[] findByTrangThaiTruocId_PrevAndNext(
		long id, long trangThaiTruocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Removes all the mot cua dien bien ho sos where trangThaiTruocId = &#63; from the database.
	*
	* @param trangThaiTruocId the trang thai truoc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTrangThaiTruocId(long trangThaiTruocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua dien bien ho sos where trangThaiTruocId = &#63;.
	*
	* @param trangThaiTruocId the trang thai truoc ID
	* @return the number of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByTrangThaiTruocId(long trangThaiTruocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua dien bien ho sos where trangThaiSauId = &#63;.
	*
	* @param trangThaiSauId the trang thai sau ID
	* @return the matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo> findByTrangThaiSauId(
		long trangThaiSauId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua dien bien ho sos where trangThaiSauId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param trangThaiSauId the trang thai sau ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @return the range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo> findByTrangThaiSauId(
		long trangThaiSauId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua dien bien ho sos where trangThaiSauId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param trangThaiSauId the trang thai sau ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo> findByTrangThaiSauId(
		long trangThaiSauId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where trangThaiSauId = &#63;.
	*
	* @param trangThaiSauId the trang thai sau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo findByTrangThaiSauId_First(
		long trangThaiSauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where trangThaiSauId = &#63;.
	*
	* @param trangThaiSauId the trang thai sau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo fetchByTrangThaiSauId_First(
		long trangThaiSauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where trangThaiSauId = &#63;.
	*
	* @param trangThaiSauId the trang thai sau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo findByTrangThaiSauId_Last(
		long trangThaiSauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where trangThaiSauId = &#63;.
	*
	* @param trangThaiSauId the trang thai sau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo fetchByTrangThaiSauId_Last(
		long trangThaiSauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua dien bien ho sos before and after the current mot cua dien bien ho so in the ordered set where trangThaiSauId = &#63;.
	*
	* @param id the primary key of the current mot cua dien bien ho so
	* @param trangThaiSauId the trang thai sau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua dien bien ho so
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo[] findByTrangThaiSauId_PrevAndNext(
		long id, long trangThaiSauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Removes all the mot cua dien bien ho sos where trangThaiSauId = &#63; from the database.
	*
	* @param trangThaiSauId the trang thai sau ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTrangThaiSauId(long trangThaiSauId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua dien bien ho sos where trangThaiSauId = &#63;.
	*
	* @param trangThaiSauId the trang thai sau ID
	* @return the number of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByTrangThaiSauId(long trangThaiSauId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua dien bien ho sos where phieuXuLyId = &#63; and trangThaiTruocId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @return the matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyIdTrangThaiTruocId(
		long phieuXuLyId, long trangThaiTruocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua dien bien ho sos where phieuXuLyId = &#63; and trangThaiTruocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @return the range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyIdTrangThaiTruocId(
		long phieuXuLyId, long trangThaiTruocId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua dien bien ho sos where phieuXuLyId = &#63; and trangThaiTruocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyIdTrangThaiTruocId(
		long phieuXuLyId, long trangThaiTruocId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63; and trangThaiTruocId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo findByPhieuXuLyIdTrangThaiTruocId_First(
		long phieuXuLyId, long trangThaiTruocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63; and trangThaiTruocId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo fetchByPhieuXuLyIdTrangThaiTruocId_First(
		long phieuXuLyId, long trangThaiTruocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63; and trangThaiTruocId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo findByPhieuXuLyIdTrangThaiTruocId_Last(
		long phieuXuLyId, long trangThaiTruocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63; and trangThaiTruocId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo fetchByPhieuXuLyIdTrangThaiTruocId_Last(
		long phieuXuLyId, long trangThaiTruocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua dien bien ho sos before and after the current mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63; and trangThaiTruocId = &#63;.
	*
	* @param id the primary key of the current mot cua dien bien ho so
	* @param phieuXuLyId the phieu xu ly ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua dien bien ho so
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo[] findByPhieuXuLyIdTrangThaiTruocId_PrevAndNext(
		long id, long phieuXuLyId, long trangThaiTruocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Removes all the mot cua dien bien ho sos where phieuXuLyId = &#63; and trangThaiTruocId = &#63; from the database.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPhieuXuLyIdTrangThaiTruocId(long phieuXuLyId,
		long trangThaiTruocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua dien bien ho sos where phieuXuLyId = &#63; and trangThaiTruocId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @return the number of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByPhieuXuLyIdTrangThaiTruocId(long phieuXuLyId,
		long trangThaiTruocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua dien bien ho sos where phieuXuLyId = &#63; and trangThaiSauId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param trangThaiSauId the trang thai sau ID
	* @return the matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyIdTrangThaiSauId(
		long phieuXuLyId, long trangThaiSauId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua dien bien ho sos where phieuXuLyId = &#63; and trangThaiSauId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param trangThaiSauId the trang thai sau ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @return the range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyIdTrangThaiSauId(
		long phieuXuLyId, long trangThaiSauId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua dien bien ho sos where phieuXuLyId = &#63; and trangThaiSauId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param trangThaiSauId the trang thai sau ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyIdTrangThaiSauId(
		long phieuXuLyId, long trangThaiSauId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63; and trangThaiSauId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param trangThaiSauId the trang thai sau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo findByPhieuXuLyIdTrangThaiSauId_First(
		long phieuXuLyId, long trangThaiSauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63; and trangThaiSauId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param trangThaiSauId the trang thai sau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo fetchByPhieuXuLyIdTrangThaiSauId_First(
		long phieuXuLyId, long trangThaiSauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63; and trangThaiSauId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param trangThaiSauId the trang thai sau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo findByPhieuXuLyIdTrangThaiSauId_Last(
		long phieuXuLyId, long trangThaiSauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63; and trangThaiSauId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param trangThaiSauId the trang thai sau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo fetchByPhieuXuLyIdTrangThaiSauId_Last(
		long phieuXuLyId, long trangThaiSauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua dien bien ho sos before and after the current mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63; and trangThaiSauId = &#63;.
	*
	* @param id the primary key of the current mot cua dien bien ho so
	* @param phieuXuLyId the phieu xu ly ID
	* @param trangThaiSauId the trang thai sau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua dien bien ho so
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo[] findByPhieuXuLyIdTrangThaiSauId_PrevAndNext(
		long id, long phieuXuLyId, long trangThaiSauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Removes all the mot cua dien bien ho sos where phieuXuLyId = &#63; and trangThaiSauId = &#63; from the database.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param trangThaiSauId the trang thai sau ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPhieuXuLyIdTrangThaiSauId(long phieuXuLyId,
		long trangThaiSauId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua dien bien ho sos where phieuXuLyId = &#63; and trangThaiSauId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param trangThaiSauId the trang thai sau ID
	* @return the number of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByPhieuXuLyIdTrangThaiSauId(long phieuXuLyId,
		long trangThaiSauId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua dien bien ho sos where phieuXuLyId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @return the matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo> findByphieuXuLyId(
		long phieuXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua dien bien ho sos where phieuXuLyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @return the range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo> findByphieuXuLyId(
		long phieuXuLyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua dien bien ho sos where phieuXuLyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo> findByphieuXuLyId(
		long phieuXuLyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo findByphieuXuLyId_First(
		long phieuXuLyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo fetchByphieuXuLyId_First(
		long phieuXuLyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo findByphieuXuLyId_Last(
		long phieuXuLyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo fetchByphieuXuLyId_Last(
		long phieuXuLyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua dien bien ho sos before and after the current mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63;.
	*
	* @param id the primary key of the current mot cua dien bien ho so
	* @param phieuXuLyId the phieu xu ly ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua dien bien ho so
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo[] findByphieuXuLyId_PrevAndNext(
		long id, long phieuXuLyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Removes all the mot cua dien bien ho sos where phieuXuLyId = &#63; from the database.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByphieuXuLyId(long phieuXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua dien bien ho sos where phieuXuLyId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @return the number of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByphieuXuLyId(long phieuXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua dien bien ho so where hoSoThuTucId = &#63; and trangThaiTruocId = &#63; and trangThaiSauId = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @param trangThaiSauId the trang thai sau ID
	* @return the matching mot cua dien bien ho so
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo findByhoSoThuTucIdAndTrangThaiTruocIdAndTrangThaiSauId(
		long hoSoThuTucId, long trangThaiTruocId, long trangThaiSauId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the mot cua dien bien ho so where hoSoThuTucId = &#63; and trangThaiTruocId = &#63; and trangThaiSauId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @param trangThaiSauId the trang thai sau ID
	* @return the matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo fetchByhoSoThuTucIdAndTrangThaiTruocIdAndTrangThaiSauId(
		long hoSoThuTucId, long trangThaiTruocId, long trangThaiSauId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua dien bien ho so where hoSoThuTucId = &#63; and trangThaiTruocId = &#63; and trangThaiSauId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @param trangThaiSauId the trang thai sau ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo fetchByhoSoThuTucIdAndTrangThaiTruocIdAndTrangThaiSauId(
		long hoSoThuTucId, long trangThaiTruocId, long trangThaiSauId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the mot cua dien bien ho so where hoSoThuTucId = &#63; and trangThaiTruocId = &#63; and trangThaiSauId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @param trangThaiSauId the trang thai sau ID
	* @return the mot cua dien bien ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo removeByhoSoThuTucIdAndTrangThaiTruocIdAndTrangThaiSauId(
		long hoSoThuTucId, long trangThaiTruocId, long trangThaiSauId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the number of mot cua dien bien ho sos where hoSoThuTucId = &#63; and trangThaiTruocId = &#63; and trangThaiSauId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @param trangThaiSauId the trang thai sau ID
	* @return the number of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByhoSoThuTucIdAndTrangThaiTruocIdAndTrangThaiSauId(
		long hoSoThuTucId, long trangThaiTruocId, long trangThaiSauId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the mot cua dien bien ho so in the entity cache if it is enabled.
	*
	* @param motCuaDienBienHoSo the mot cua dien bien ho so
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo motCuaDienBienHoSo);

	/**
	* Caches the mot cua dien bien ho sos in the entity cache if it is enabled.
	*
	* @param motCuaDienBienHoSos the mot cua dien bien ho sos
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo> motCuaDienBienHoSos);

	/**
	* Creates a new mot cua dien bien ho so with the primary key. Does not add the mot cua dien bien ho so to the database.
	*
	* @param id the primary key for the new mot cua dien bien ho so
	* @return the new mot cua dien bien ho so
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo create(long id);

	/**
	* Removes the mot cua dien bien ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua dien bien ho so
	* @return the mot cua dien bien ho so that was removed
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo updateImpl(
		vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo motCuaDienBienHoSo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua dien bien ho so with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException} if it could not be found.
	*
	* @param id the primary key of the mot cua dien bien ho so
	* @return the mot cua dien bien ho so
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the mot cua dien bien ho so with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua dien bien ho so
	* @return the mot cua dien bien ho so, or <code>null</code> if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua dien bien ho sos.
	*
	* @return the mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua dien bien ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @return the range of mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua dien bien ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the mot cua dien bien ho sos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua dien bien ho sos.
	*
	* @return the number of mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}