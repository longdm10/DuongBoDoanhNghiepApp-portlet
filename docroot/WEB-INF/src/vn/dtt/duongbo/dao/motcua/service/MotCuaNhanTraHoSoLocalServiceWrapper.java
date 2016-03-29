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

package vn.dtt.duongbo.dao.motcua.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MotCuaNhanTraHoSoLocalService}.
 *
 * @author win_64
 * @see MotCuaNhanTraHoSoLocalService
 * @generated
 */
public class MotCuaNhanTraHoSoLocalServiceWrapper
	implements MotCuaNhanTraHoSoLocalService,
		ServiceWrapper<MotCuaNhanTraHoSoLocalService> {
	public MotCuaNhanTraHoSoLocalServiceWrapper(
		MotCuaNhanTraHoSoLocalService motCuaNhanTraHoSoLocalService) {
		_motCuaNhanTraHoSoLocalService = motCuaNhanTraHoSoLocalService;
	}

	/**
	* Adds the mot cua nhan tra ho so to the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaNhanTraHoSo the mot cua nhan tra ho so
	* @return the mot cua nhan tra ho so that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo addMotCuaNhanTraHoSo(
		vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo motCuaNhanTraHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaNhanTraHoSoLocalService.addMotCuaNhanTraHoSo(motCuaNhanTraHoSo);
	}

	/**
	* Creates a new mot cua nhan tra ho so with the primary key. Does not add the mot cua nhan tra ho so to the database.
	*
	* @param id the primary key for the new mot cua nhan tra ho so
	* @return the new mot cua nhan tra ho so
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo createMotCuaNhanTraHoSo(
		long id) {
		return _motCuaNhanTraHoSoLocalService.createMotCuaNhanTraHoSo(id);
	}

	/**
	* Deletes the mot cua nhan tra ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua nhan tra ho so
	* @return the mot cua nhan tra ho so that was removed
	* @throws PortalException if a mot cua nhan tra ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo deleteMotCuaNhanTraHoSo(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _motCuaNhanTraHoSoLocalService.deleteMotCuaNhanTraHoSo(id);
	}

	/**
	* Deletes the mot cua nhan tra ho so from the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaNhanTraHoSo the mot cua nhan tra ho so
	* @return the mot cua nhan tra ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo deleteMotCuaNhanTraHoSo(
		vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo motCuaNhanTraHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaNhanTraHoSoLocalService.deleteMotCuaNhanTraHoSo(motCuaNhanTraHoSo);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _motCuaNhanTraHoSoLocalService.dynamicQuery();
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
		return _motCuaNhanTraHoSoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaNhanTraHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _motCuaNhanTraHoSoLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaNhanTraHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _motCuaNhanTraHoSoLocalService.dynamicQuery(dynamicQuery, start,
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
		return _motCuaNhanTraHoSoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _motCuaNhanTraHoSoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo fetchMotCuaNhanTraHoSo(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaNhanTraHoSoLocalService.fetchMotCuaNhanTraHoSo(id);
	}

	/**
	* Returns the mot cua nhan tra ho so with the primary key.
	*
	* @param id the primary key of the mot cua nhan tra ho so
	* @return the mot cua nhan tra ho so
	* @throws PortalException if a mot cua nhan tra ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo getMotCuaNhanTraHoSo(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _motCuaNhanTraHoSoLocalService.getMotCuaNhanTraHoSo(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _motCuaNhanTraHoSoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the mot cua nhan tra ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaNhanTraHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua nhan tra ho sos
	* @param end the upper bound of the range of mot cua nhan tra ho sos (not inclusive)
	* @return the range of mot cua nhan tra ho sos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo> getMotCuaNhanTraHoSos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaNhanTraHoSoLocalService.getMotCuaNhanTraHoSos(start, end);
	}

	/**
	* Returns the number of mot cua nhan tra ho sos.
	*
	* @return the number of mot cua nhan tra ho sos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getMotCuaNhanTraHoSosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaNhanTraHoSoLocalService.getMotCuaNhanTraHoSosCount();
	}

	/**
	* Updates the mot cua nhan tra ho so in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param motCuaNhanTraHoSo the mot cua nhan tra ho so
	* @return the mot cua nhan tra ho so that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo updateMotCuaNhanTraHoSo(
		vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo motCuaNhanTraHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaNhanTraHoSoLocalService.updateMotCuaNhanTraHoSo(motCuaNhanTraHoSo);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _motCuaNhanTraHoSoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_motCuaNhanTraHoSoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _motCuaNhanTraHoSoLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MotCuaNhanTraHoSoLocalService getWrappedMotCuaNhanTraHoSoLocalService() {
		return _motCuaNhanTraHoSoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMotCuaNhanTraHoSoLocalService(
		MotCuaNhanTraHoSoLocalService motCuaNhanTraHoSoLocalService) {
		_motCuaNhanTraHoSoLocalService = motCuaNhanTraHoSoLocalService;
	}

	@Override
	public MotCuaNhanTraHoSoLocalService getWrappedService() {
		return _motCuaNhanTraHoSoLocalService;
	}

	@Override
	public void setWrappedService(
		MotCuaNhanTraHoSoLocalService motCuaNhanTraHoSoLocalService) {
		_motCuaNhanTraHoSoLocalService = motCuaNhanTraHoSoLocalService;
	}

	private MotCuaNhanTraHoSoLocalService _motCuaNhanTraHoSoLocalService;
}