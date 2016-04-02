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
 * Provides a wrapper for {@link TempDangerousGoodsNanifestLocalService}.
 *
 * @author longdm
 * @see TempDangerousGoodsNanifestLocalService
 * @generated
 */
public class TempDangerousGoodsNanifestLocalServiceWrapper
	implements TempDangerousGoodsNanifestLocalService,
		ServiceWrapper<TempDangerousGoodsNanifestLocalService> {
	public TempDangerousGoodsNanifestLocalServiceWrapper(
		TempDangerousGoodsNanifestLocalService tempDangerousGoodsNanifestLocalService) {
		_tempDangerousGoodsNanifestLocalService = tempDangerousGoodsNanifestLocalService;
	}

	/**
	* Adds the temp dangerous goods nanifest to the database. Also notifies the appropriate model listeners.
	*
	* @param tempDangerousGoodsNanifest the temp dangerous goods nanifest
	* @return the temp dangerous goods nanifest that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsNanifest addTempDangerousGoodsNanifest(
		vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsNanifest tempDangerousGoodsNanifest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDangerousGoodsNanifestLocalService.addTempDangerousGoodsNanifest(tempDangerousGoodsNanifest);
	}

	/**
	* Creates a new temp dangerous goods nanifest with the primary key. Does not add the temp dangerous goods nanifest to the database.
	*
	* @param id the primary key for the new temp dangerous goods nanifest
	* @return the new temp dangerous goods nanifest
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsNanifest createTempDangerousGoodsNanifest(
		long id) {
		return _tempDangerousGoodsNanifestLocalService.createTempDangerousGoodsNanifest(id);
	}

	/**
	* Deletes the temp dangerous goods nanifest with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp dangerous goods nanifest
	* @return the temp dangerous goods nanifest that was removed
	* @throws PortalException if a temp dangerous goods nanifest with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsNanifest deleteTempDangerousGoodsNanifest(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempDangerousGoodsNanifestLocalService.deleteTempDangerousGoodsNanifest(id);
	}

	/**
	* Deletes the temp dangerous goods nanifest from the database. Also notifies the appropriate model listeners.
	*
	* @param tempDangerousGoodsNanifest the temp dangerous goods nanifest
	* @return the temp dangerous goods nanifest that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsNanifest deleteTempDangerousGoodsNanifest(
		vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsNanifest tempDangerousGoodsNanifest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDangerousGoodsNanifestLocalService.deleteTempDangerousGoodsNanifest(tempDangerousGoodsNanifest);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tempDangerousGoodsNanifestLocalService.dynamicQuery();
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
		return _tempDangerousGoodsNanifestLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDangerousGoodsNanifestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tempDangerousGoodsNanifestLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDangerousGoodsNanifestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tempDangerousGoodsNanifestLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _tempDangerousGoodsNanifestLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tempDangerousGoodsNanifestLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsNanifest fetchTempDangerousGoodsNanifest(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDangerousGoodsNanifestLocalService.fetchTempDangerousGoodsNanifest(id);
	}

	/**
	* Returns the temp dangerous goods nanifest with the primary key.
	*
	* @param id the primary key of the temp dangerous goods nanifest
	* @return the temp dangerous goods nanifest
	* @throws PortalException if a temp dangerous goods nanifest with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsNanifest getTempDangerousGoodsNanifest(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempDangerousGoodsNanifestLocalService.getTempDangerousGoodsNanifest(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempDangerousGoodsNanifestLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp dangerous goods nanifests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDangerousGoodsNanifestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp dangerous goods nanifests
	* @param end the upper bound of the range of temp dangerous goods nanifests (not inclusive)
	* @return the range of temp dangerous goods nanifests
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsNanifest> getTempDangerousGoodsNanifests(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDangerousGoodsNanifestLocalService.getTempDangerousGoodsNanifests(start,
			end);
	}

	/**
	* Returns the number of temp dangerous goods nanifests.
	*
	* @return the number of temp dangerous goods nanifests
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTempDangerousGoodsNanifestsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDangerousGoodsNanifestLocalService.getTempDangerousGoodsNanifestsCount();
	}

	/**
	* Updates the temp dangerous goods nanifest in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempDangerousGoodsNanifest the temp dangerous goods nanifest
	* @return the temp dangerous goods nanifest that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsNanifest updateTempDangerousGoodsNanifest(
		vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsNanifest tempDangerousGoodsNanifest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDangerousGoodsNanifestLocalService.updateTempDangerousGoodsNanifest(tempDangerousGoodsNanifest);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tempDangerousGoodsNanifestLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempDangerousGoodsNanifestLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tempDangerousGoodsNanifestLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TempDangerousGoodsNanifestLocalService getWrappedTempDangerousGoodsNanifestLocalService() {
		return _tempDangerousGoodsNanifestLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTempDangerousGoodsNanifestLocalService(
		TempDangerousGoodsNanifestLocalService tempDangerousGoodsNanifestLocalService) {
		_tempDangerousGoodsNanifestLocalService = tempDangerousGoodsNanifestLocalService;
	}

	@Override
	public TempDangerousGoodsNanifestLocalService getWrappedService() {
		return _tempDangerousGoodsNanifestLocalService;
	}

	@Override
	public void setWrappedService(
		TempDangerousGoodsNanifestLocalService tempDangerousGoodsNanifestLocalService) {
		_tempDangerousGoodsNanifestLocalService = tempDangerousGoodsNanifestLocalService;
	}

	private TempDangerousGoodsNanifestLocalService _tempDangerousGoodsNanifestLocalService;
}