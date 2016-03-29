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

package vn.dtt.duongbo.dao.lienvan.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for QlvtThongTinHoSoGiayPhepVanTai. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoGiayPhepVanTaiLocalServiceUtil
 * @see vn.dtt.duongbo.dao.lienvan.service.base.QlvtThongTinHoSoGiayPhepVanTaiLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.lienvan.service.impl.QlvtThongTinHoSoGiayPhepVanTaiLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface QlvtThongTinHoSoGiayPhepVanTaiLocalService
	extends BaseLocalService, InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QlvtThongTinHoSoGiayPhepVanTaiLocalServiceUtil} to access the qlvt thong tin ho so giay phep van tai local service. Add custom service methods to {@link vn.dtt.duongbo.dao.lienvan.service.impl.QlvtThongTinHoSoGiayPhepVanTaiLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the qlvt thong tin ho so giay phep van tai to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtThongTinHoSoGiayPhepVanTai the qlvt thong tin ho so giay phep van tai
	* @return the qlvt thong tin ho so giay phep van tai that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai addQlvtThongTinHoSoGiayPhepVanTai(
		vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new qlvt thong tin ho so giay phep van tai with the primary key. Does not add the qlvt thong tin ho so giay phep van tai to the database.
	*
	* @param id the primary key for the new qlvt thong tin ho so giay phep van tai
	* @return the new qlvt thong tin ho so giay phep van tai
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai createQlvtThongTinHoSoGiayPhepVanTai(
		long id);

	/**
	* Deletes the qlvt thong tin ho so giay phep van tai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt thong tin ho so giay phep van tai
	* @return the qlvt thong tin ho so giay phep van tai that was removed
	* @throws PortalException if a qlvt thong tin ho so giay phep van tai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai deleteQlvtThongTinHoSoGiayPhepVanTai(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the qlvt thong tin ho so giay phep van tai from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtThongTinHoSoGiayPhepVanTai the qlvt thong tin ho so giay phep van tai
	* @return the qlvt thong tin ho so giay phep van tai that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai deleteQlvtThongTinHoSoGiayPhepVanTai(
		vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoGiayPhepVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai fetchQlvtThongTinHoSoGiayPhepVanTai(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt thong tin ho so giay phep van tai with the primary key.
	*
	* @param id the primary key of the qlvt thong tin ho so giay phep van tai
	* @return the qlvt thong tin ho so giay phep van tai
	* @throws PortalException if a qlvt thong tin ho so giay phep van tai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai getQlvtThongTinHoSoGiayPhepVanTai(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai> getQlvtThongTinHoSoGiayPhepVanTais(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt thong tin ho so giay phep van tais.
	*
	* @return the number of qlvt thong tin ho so giay phep van tais
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getQlvtThongTinHoSoGiayPhepVanTaisCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the qlvt thong tin ho so giay phep van tai in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtThongTinHoSoGiayPhepVanTai the qlvt thong tin ho so giay phep van tai
	* @return the qlvt thong tin ho so giay phep van tai that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai updateQlvtThongTinHoSoGiayPhepVanTai(
		vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai qlvtThongTinHoSoGiayPhepVanTai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;
}