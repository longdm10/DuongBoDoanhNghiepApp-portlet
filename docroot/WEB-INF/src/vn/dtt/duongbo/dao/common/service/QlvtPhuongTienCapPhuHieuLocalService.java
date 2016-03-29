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

package vn.dtt.duongbo.dao.common.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for QlvtPhuongTienCapPhuHieu. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author win_64
 * @see QlvtPhuongTienCapPhuHieuLocalServiceUtil
 * @see vn.dtt.duongbo.dao.common.service.base.QlvtPhuongTienCapPhuHieuLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.common.service.impl.QlvtPhuongTienCapPhuHieuLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface QlvtPhuongTienCapPhuHieuLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QlvtPhuongTienCapPhuHieuLocalServiceUtil} to access the qlvt phuong tien cap phu hieu local service. Add custom service methods to {@link vn.dtt.duongbo.dao.common.service.impl.QlvtPhuongTienCapPhuHieuLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the qlvt phuong tien cap phu hieu to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtPhuongTienCapPhuHieu the qlvt phuong tien cap phu hieu
	* @return the qlvt phuong tien cap phu hieu that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu addQlvtPhuongTienCapPhuHieu(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new qlvt phuong tien cap phu hieu with the primary key. Does not add the qlvt phuong tien cap phu hieu to the database.
	*
	* @param id the primary key for the new qlvt phuong tien cap phu hieu
	* @return the new qlvt phuong tien cap phu hieu
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu createQlvtPhuongTienCapPhuHieu(
		long id);

	/**
	* Deletes the qlvt phuong tien cap phu hieu with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt phuong tien cap phu hieu
	* @return the qlvt phuong tien cap phu hieu that was removed
	* @throws PortalException if a qlvt phuong tien cap phu hieu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu deleteQlvtPhuongTienCapPhuHieu(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the qlvt phuong tien cap phu hieu from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtPhuongTienCapPhuHieu the qlvt phuong tien cap phu hieu
	* @return the qlvt phuong tien cap phu hieu that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu deleteQlvtPhuongTienCapPhuHieu(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu)
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapPhuHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapPhuHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu fetchQlvtPhuongTienCapPhuHieu(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt phuong tien cap phu hieu with the primary key.
	*
	* @param id the primary key of the qlvt phuong tien cap phu hieu
	* @return the qlvt phuong tien cap phu hieu
	* @throws PortalException if a qlvt phuong tien cap phu hieu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu getQlvtPhuongTienCapPhuHieu(
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
	* Returns a range of all the qlvt phuong tien cap phu hieus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapPhuHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt phuong tien cap phu hieus
	* @param end the upper bound of the range of qlvt phuong tien cap phu hieus (not inclusive)
	* @return the range of qlvt phuong tien cap phu hieus
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu> getQlvtPhuongTienCapPhuHieus(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt phuong tien cap phu hieus.
	*
	* @return the number of qlvt phuong tien cap phu hieus
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getQlvtPhuongTienCapPhuHieusCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the qlvt phuong tien cap phu hieu in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtPhuongTienCapPhuHieu the qlvt phuong tien cap phu hieu
	* @return the qlvt phuong tien cap phu hieu that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu updateQlvtPhuongTienCapPhuHieu(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu)
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

	public java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu> findByNoiDungHoSoId(
		long idNoiDungHoSo);

	public java.util.List<java.lang.Long> findIdNoiDungHoSoId(long noiDungHoSoI);
}