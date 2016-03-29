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

package vn.dtt.duongbo.dao.lienvan.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai;

/**
 * The persistence interface for the qlvt thong tin ho so giay phep van tai service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoGiayPhepVanTaiPersistenceImpl
 * @see QlvtThongTinHoSoGiayPhepVanTaiUtil
 * @generated
 */
public interface QlvtThongTinHoSoGiayPhepVanTaiPersistence
	extends BasePersistence<QlvtThongTinHoSoGiayPhepVanTai> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QlvtThongTinHoSoGiayPhepVanTaiUtil} to access the qlvt thong tin ho so giay phep van tai persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the qlvt thong tin ho so giay phep van tai in the entity cache if it is enabled.
	*
	* @param qlvtThongTinHoSoGiayPhepVanTai the qlvt thong tin ho so giay phep van tai
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai);

	/**
	* Caches the qlvt thong tin ho so giay phep van tais in the entity cache if it is enabled.
	*
	* @param qlvtThongTinHoSoGiayPhepVanTais the qlvt thong tin ho so giay phep van tais
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai> qlvtThongTinHoSoGiayPhepVanTais);

	/**
	* Creates a new qlvt thong tin ho so giay phep van tai with the primary key. Does not add the qlvt thong tin ho so giay phep van tai to the database.
	*
	* @param id the primary key for the new qlvt thong tin ho so giay phep van tai
	* @return the new qlvt thong tin ho so giay phep van tai
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai create(
		long id);

	/**
	* Removes the qlvt thong tin ho so giay phep van tai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt thong tin ho so giay phep van tai
	* @return the qlvt thong tin ho so giay phep van tai that was removed
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoGiayPhepVanTaiException if a qlvt thong tin ho so giay phep van tai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoGiayPhepVanTaiException;

	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai updateImpl(
		vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt thong tin ho so giay phep van tai with the primary key or throws a {@link vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoGiayPhepVanTaiException} if it could not be found.
	*
	* @param id the primary key of the qlvt thong tin ho so giay phep van tai
	* @return the qlvt thong tin ho so giay phep van tai
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoGiayPhepVanTaiException if a qlvt thong tin ho so giay phep van tai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoGiayPhepVanTaiException;

	/**
	* Returns the qlvt thong tin ho so giay phep van tai with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt thong tin ho so giay phep van tai
	* @return the qlvt thong tin ho so giay phep van tai, or <code>null</code> if a qlvt thong tin ho so giay phep van tai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the qlvt thong tin ho so giay phep van tais.
	*
	* @return the qlvt thong tin ho so giay phep van tais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt thong tin ho so giay phep van tais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt thong tin ho so giay phep van tais
	* @param end the upper bound of the range of qlvt thong tin ho so giay phep van tais (not inclusive)
	* @return the range of qlvt thong tin ho so giay phep van tais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt thong tin ho so giay phep van tais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt thong tin ho so giay phep van tais
	* @param end the upper bound of the range of qlvt thong tin ho so giay phep van tais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt thong tin ho so giay phep van tais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the qlvt thong tin ho so giay phep van tais from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt thong tin ho so giay phep van tais.
	*
	* @return the number of qlvt thong tin ho so giay phep van tais
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}