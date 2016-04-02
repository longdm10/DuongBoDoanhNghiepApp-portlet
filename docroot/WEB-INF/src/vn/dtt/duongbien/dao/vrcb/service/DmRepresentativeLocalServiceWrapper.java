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
 * Provides a wrapper for {@link DmRepresentativeLocalService}.
 *
 * @author longdm
 * @see DmRepresentativeLocalService
 * @generated
 */
public class DmRepresentativeLocalServiceWrapper
	implements DmRepresentativeLocalService,
		ServiceWrapper<DmRepresentativeLocalService> {
	public DmRepresentativeLocalServiceWrapper(
		DmRepresentativeLocalService dmRepresentativeLocalService) {
		_dmRepresentativeLocalService = dmRepresentativeLocalService;
	}

	/**
	* Adds the dm representative to the database. Also notifies the appropriate model listeners.
	*
	* @param dmRepresentative the dm representative
	* @return the dm representative that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmRepresentative addDmRepresentative(
		vn.dtt.duongbien.dao.vrcb.model.DmRepresentative dmRepresentative)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmRepresentativeLocalService.addDmRepresentative(dmRepresentative);
	}

	/**
	* Creates a new dm representative with the primary key. Does not add the dm representative to the database.
	*
	* @param id the primary key for the new dm representative
	* @return the new dm representative
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmRepresentative createDmRepresentative(
		int id) {
		return _dmRepresentativeLocalService.createDmRepresentative(id);
	}

	/**
	* Deletes the dm representative with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm representative
	* @return the dm representative that was removed
	* @throws PortalException if a dm representative with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmRepresentative deleteDmRepresentative(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmRepresentativeLocalService.deleteDmRepresentative(id);
	}

	/**
	* Deletes the dm representative from the database. Also notifies the appropriate model listeners.
	*
	* @param dmRepresentative the dm representative
	* @return the dm representative that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmRepresentative deleteDmRepresentative(
		vn.dtt.duongbien.dao.vrcb.model.DmRepresentative dmRepresentative)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmRepresentativeLocalService.deleteDmRepresentative(dmRepresentative);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dmRepresentativeLocalService.dynamicQuery();
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
		return _dmRepresentativeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmRepresentativeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmRepresentativeLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmRepresentativeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmRepresentativeLocalService.dynamicQuery(dynamicQuery, start,
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
		return _dmRepresentativeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dmRepresentativeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmRepresentative fetchDmRepresentative(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmRepresentativeLocalService.fetchDmRepresentative(id);
	}

	/**
	* Returns the dm representative with the primary key.
	*
	* @param id the primary key of the dm representative
	* @return the dm representative
	* @throws PortalException if a dm representative with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmRepresentative getDmRepresentative(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmRepresentativeLocalService.getDmRepresentative(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmRepresentativeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm representatives.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmRepresentativeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm representatives
	* @param end the upper bound of the range of dm representatives (not inclusive)
	* @return the range of dm representatives
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmRepresentative> getDmRepresentatives(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmRepresentativeLocalService.getDmRepresentatives(start, end);
	}

	/**
	* Returns the number of dm representatives.
	*
	* @return the number of dm representatives
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDmRepresentativesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmRepresentativeLocalService.getDmRepresentativesCount();
	}

	/**
	* Updates the dm representative in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmRepresentative the dm representative
	* @return the dm representative that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmRepresentative updateDmRepresentative(
		vn.dtt.duongbien.dao.vrcb.model.DmRepresentative dmRepresentative)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmRepresentativeLocalService.updateDmRepresentative(dmRepresentative);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmRepresentativeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmRepresentativeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmRepresentativeLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmRepresentativeLocalService getWrappedDmRepresentativeLocalService() {
		return _dmRepresentativeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmRepresentativeLocalService(
		DmRepresentativeLocalService dmRepresentativeLocalService) {
		_dmRepresentativeLocalService = dmRepresentativeLocalService;
	}

	@Override
	public DmRepresentativeLocalService getWrappedService() {
		return _dmRepresentativeLocalService;
	}

	@Override
	public void setWrappedService(
		DmRepresentativeLocalService dmRepresentativeLocalService) {
		_dmRepresentativeLocalService = dmRepresentativeLocalService;
	}

	private DmRepresentativeLocalService _dmRepresentativeLocalService;
}