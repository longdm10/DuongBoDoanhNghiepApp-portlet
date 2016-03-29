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

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe;

/**
 * The persistence interface for the qlvt thong tin ho so quoc te service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoQuocTePersistenceImpl
 * @see QlvtThongTinHoSoQuocTeUtil
 * @generated
 */
public interface QlvtThongTinHoSoQuocTePersistence extends BasePersistence<QlvtThongTinHoSoQuocTe> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QlvtThongTinHoSoQuocTeUtil} to access the qlvt thong tin ho so quoc te persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the qlvt thong tin ho so quoc te in the entity cache if it is enabled.
	*
	* @param qlvtThongTinHoSoQuocTe the qlvt thong tin ho so quoc te
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe qlvtThongTinHoSoQuocTe);

	/**
	* Caches the qlvt thong tin ho so quoc tes in the entity cache if it is enabled.
	*
	* @param qlvtThongTinHoSoQuocTes the qlvt thong tin ho so quoc tes
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe> qlvtThongTinHoSoQuocTes);

	/**
	* Creates a new qlvt thong tin ho so quoc te with the primary key. Does not add the qlvt thong tin ho so quoc te to the database.
	*
	* @param id the primary key for the new qlvt thong tin ho so quoc te
	* @return the new qlvt thong tin ho so quoc te
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe create(
		long id);

	/**
	* Removes the qlvt thong tin ho so quoc te with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt thong tin ho so quoc te
	* @return the qlvt thong tin ho so quoc te that was removed
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoQuocTeException if a qlvt thong tin ho so quoc te with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoQuocTeException;

	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe qlvtThongTinHoSoQuocTe)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt thong tin ho so quoc te with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoQuocTeException} if it could not be found.
	*
	* @param id the primary key of the qlvt thong tin ho so quoc te
	* @return the qlvt thong tin ho so quoc te
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoQuocTeException if a qlvt thong tin ho so quoc te with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoQuocTeException;

	/**
	* Returns the qlvt thong tin ho so quoc te with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt thong tin ho so quoc te
	* @return the qlvt thong tin ho so quoc te, or <code>null</code> if a qlvt thong tin ho so quoc te with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the qlvt thong tin ho so quoc tes.
	*
	* @return the qlvt thong tin ho so quoc tes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt thong tin ho so quoc tes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoQuocTeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt thong tin ho so quoc tes
	* @param end the upper bound of the range of qlvt thong tin ho so quoc tes (not inclusive)
	* @return the range of qlvt thong tin ho so quoc tes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt thong tin ho so quoc tes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoQuocTeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt thong tin ho so quoc tes
	* @param end the upper bound of the range of qlvt thong tin ho so quoc tes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt thong tin ho so quoc tes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the qlvt thong tin ho so quoc tes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt thong tin ho so quoc tes.
	*
	* @return the number of qlvt thong tin ho so quoc tes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}