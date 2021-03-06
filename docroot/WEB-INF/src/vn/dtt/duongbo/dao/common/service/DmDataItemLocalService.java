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
 * Provides the local service interface for DmDataItem. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author win_64
 * @see DmDataItemLocalServiceUtil
 * @see vn.dtt.duongbo.dao.common.service.base.DmDataItemLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.common.service.impl.DmDataItemLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DmDataItemLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmDataItemLocalServiceUtil} to access the dm data item local service. Add custom service methods to {@link vn.dtt.duongbo.dao.common.service.impl.DmDataItemLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the dm data item to the database. Also notifies the appropriate model listeners.
	*
	* @param dmDataItem the dm data item
	* @return the dm data item that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem addDmDataItem(
		vn.dtt.duongbo.dao.common.model.DmDataItem dmDataItem)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new dm data item with the primary key. Does not add the dm data item to the database.
	*
	* @param id the primary key for the new dm data item
	* @return the new dm data item
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem createDmDataItem(long id);

	/**
	* Deletes the dm data item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm data item
	* @return the dm data item that was removed
	* @throws PortalException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem deleteDmDataItem(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the dm data item from the database. Also notifies the appropriate model listeners.
	*
	* @param dmDataItem the dm data item
	* @return the dm data item that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem deleteDmDataItem(
		vn.dtt.duongbo.dao.common.model.DmDataItem dmDataItem)
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public vn.dtt.duongbo.dao.common.model.DmDataItem fetchDmDataItem(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm data item with the primary key.
	*
	* @param id the primary key of the dm data item
	* @return the dm data item
	* @throws PortalException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.duongbo.dao.common.model.DmDataItem getDmDataItem(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm data items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of dm data items
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> getDmDataItems(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm data items.
	*
	* @return the number of dm data items
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDmDataItemsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the dm data item in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmDataItem the dm data item
	* @return the dm data item that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem updateDmDataItem(
		vn.dtt.duongbo.dao.common.model.DmDataItem dmDataItem)
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

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupIdAndLevel(
		long groupId, int level);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupIdAndChaCode(
		long groupId, java.lang.String chaCode);

	public vn.dtt.duongbo.dao.common.model.DmDataItem findByGroupIdAndCode(
		long groupId, java.lang.String code);

	public vn.dtt.duongbo.dao.common.model.DmDataItem findByGroupIdAndCodeStatus(
		long groupId, java.lang.String code);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findTinhThanh();

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findQuanHuyenByMaTinhThanh(
		java.lang.String maTinhThanh);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findPhuongXaByMaTinhThanMaQuanHuyen(
		java.lang.String maTinhThanh, java.lang.String maQuanHuyen);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupCodeAndItemCode0(
		java.lang.String groupName, java.lang.String code_0);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupCode(
		java.lang.String dmDataGroupCode);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupCodeIdTTHC(
		java.lang.String dmDataGroupCode, java.lang.String idTTHC);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupCodeAndNode1(
		java.lang.String dmDataGroupCode, java.lang.String node1);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupId(
		long dataGroupId);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupCodeAndLevel(
		java.lang.String dmDataGroupCode, int level);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByCodeAndStatus(
		java.lang.String code, int status);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupIdAndStatus(
		long dataGroupId, int status);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByArrayId(
		java.lang.String arrayId);

	public vn.dtt.duongbo.dao.common.model.DmDataItem findByGroupIdAndItemCode(
		long groupId, java.lang.String code);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.duongbo.dao.common.model.DmDataItem getByGroupCodeAndItemCode0(
		java.lang.String groupName, java.lang.String code_0);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.duongbo.dao.common.model.DmDataItem getByCode(
		java.lang.String code);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> getByCodeAndLevel(
		java.lang.String code, int level)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> getByCodeAndNode1(
		java.lang.String code, java.lang.String node_1)
		throws com.liferay.portal.kernel.exception.SystemException;
}