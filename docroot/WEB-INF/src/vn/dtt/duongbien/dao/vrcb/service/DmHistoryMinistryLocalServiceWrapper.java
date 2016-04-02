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

package vn.dtt.duongbien.dao.vrcb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DmHistoryMinistryLocalService}.
 *
 * @author longdm
 * @see DmHistoryMinistryLocalService
 * @generated
 */
public class DmHistoryMinistryLocalServiceWrapper
	implements DmHistoryMinistryLocalService,
		ServiceWrapper<DmHistoryMinistryLocalService> {
	public DmHistoryMinistryLocalServiceWrapper(
		DmHistoryMinistryLocalService dmHistoryMinistryLocalService) {
		_dmHistoryMinistryLocalService = dmHistoryMinistryLocalService;
	}

	/**
	* Adds the dm history ministry to the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryMinistry the dm history ministry
	* @return the dm history ministry that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry addDmHistoryMinistry(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry dmHistoryMinistry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMinistryLocalService.addDmHistoryMinistry(dmHistoryMinistry);
	}

	/**
	* Creates a new dm history ministry with the primary key. Does not add the dm history ministry to the database.
	*
	* @param id the primary key for the new dm history ministry
	* @return the new dm history ministry
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry createDmHistoryMinistry(
		long id) {
		return _dmHistoryMinistryLocalService.createDmHistoryMinistry(id);
	}

	/**
	* Deletes the dm history ministry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history ministry
	* @return the dm history ministry that was removed
	* @throws PortalException if a dm history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry deleteDmHistoryMinistry(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMinistryLocalService.deleteDmHistoryMinistry(id);
	}

	/**
	* Deletes the dm history ministry from the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryMinistry the dm history ministry
	* @return the dm history ministry that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry deleteDmHistoryMinistry(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry dmHistoryMinistry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMinistryLocalService.deleteDmHistoryMinistry(dmHistoryMinistry);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dmHistoryMinistryLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMinistryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryMinistryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMinistryLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryMinistryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMinistryLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMinistryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMinistryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry fetchDmHistoryMinistry(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMinistryLocalService.fetchDmHistoryMinistry(id);
	}

	/**
	* Returns the dm history ministry with the primary key.
	*
	* @param id the primary key of the dm history ministry
	* @return the dm history ministry
	* @throws PortalException if a dm history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry getDmHistoryMinistry(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMinistryLocalService.getDmHistoryMinistry(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMinistryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm history ministries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryMinistryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history ministries
	* @param end the upper bound of the range of dm history ministries (not inclusive)
	* @return the range of dm history ministries
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry> getDmHistoryMinistries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMinistryLocalService.getDmHistoryMinistries(start, end);
	}

	/**
	* Returns the number of dm history ministries.
	*
	* @return the number of dm history ministries
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDmHistoryMinistriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMinistryLocalService.getDmHistoryMinistriesCount();
	}

	/**
	* Updates the dm history ministry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryMinistry the dm history ministry
	* @return the dm history ministry that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry updateDmHistoryMinistry(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistry dmHistoryMinistry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMinistryLocalService.updateDmHistoryMinistry(dmHistoryMinistry);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmHistoryMinistryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmHistoryMinistryLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmHistoryMinistryLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmHistoryMinistryLocalService getWrappedDmHistoryMinistryLocalService() {
		return _dmHistoryMinistryLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmHistoryMinistryLocalService(
		DmHistoryMinistryLocalService dmHistoryMinistryLocalService) {
		_dmHistoryMinistryLocalService = dmHistoryMinistryLocalService;
	}

	@Override
	public DmHistoryMinistryLocalService getWrappedService() {
		return _dmHistoryMinistryLocalService;
	}

	@Override
	public void setWrappedService(
		DmHistoryMinistryLocalService dmHistoryMinistryLocalService) {
		_dmHistoryMinistryLocalService = dmHistoryMinistryLocalService;
	}

	private DmHistoryMinistryLocalService _dmHistoryMinistryLocalService;
}