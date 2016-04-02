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
 * Provides a wrapper for {@link HistoryInterfaceRequestFieldLocalService}.
 *
 * @author longdm
 * @see HistoryInterfaceRequestFieldLocalService
 * @generated
 */
public class HistoryInterfaceRequestFieldLocalServiceWrapper
	implements HistoryInterfaceRequestFieldLocalService,
		ServiceWrapper<HistoryInterfaceRequestFieldLocalService> {
	public HistoryInterfaceRequestFieldLocalServiceWrapper(
		HistoryInterfaceRequestFieldLocalService historyInterfaceRequestFieldLocalService) {
		_historyInterfaceRequestFieldLocalService = historyInterfaceRequestFieldLocalService;
	}

	/**
	* Adds the history interface request field to the database. Also notifies the appropriate model listeners.
	*
	* @param historyInterfaceRequestField the history interface request field
	* @return the history interface request field that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestField addHistoryInterfaceRequestField(
		vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestField historyInterfaceRequestField)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historyInterfaceRequestFieldLocalService.addHistoryInterfaceRequestField(historyInterfaceRequestField);
	}

	/**
	* Creates a new history interface request field with the primary key. Does not add the history interface request field to the database.
	*
	* @param id the primary key for the new history interface request field
	* @return the new history interface request field
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestField createHistoryInterfaceRequestField(
		long id) {
		return _historyInterfaceRequestFieldLocalService.createHistoryInterfaceRequestField(id);
	}

	/**
	* Deletes the history interface request field with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the history interface request field
	* @return the history interface request field that was removed
	* @throws PortalException if a history interface request field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestField deleteHistoryInterfaceRequestField(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _historyInterfaceRequestFieldLocalService.deleteHistoryInterfaceRequestField(id);
	}

	/**
	* Deletes the history interface request field from the database. Also notifies the appropriate model listeners.
	*
	* @param historyInterfaceRequestField the history interface request field
	* @return the history interface request field that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestField deleteHistoryInterfaceRequestField(
		vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestField historyInterfaceRequestField)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historyInterfaceRequestFieldLocalService.deleteHistoryInterfaceRequestField(historyInterfaceRequestField);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _historyInterfaceRequestFieldLocalService.dynamicQuery();
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
		return _historyInterfaceRequestFieldLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _historyInterfaceRequestFieldLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _historyInterfaceRequestFieldLocalService.dynamicQuery(dynamicQuery,
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
		return _historyInterfaceRequestFieldLocalService.dynamicQueryCount(dynamicQuery);
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
		return _historyInterfaceRequestFieldLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestField fetchHistoryInterfaceRequestField(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _historyInterfaceRequestFieldLocalService.fetchHistoryInterfaceRequestField(id);
	}

	/**
	* Returns the history interface request field with the primary key.
	*
	* @param id the primary key of the history interface request field
	* @return the history interface request field
	* @throws PortalException if a history interface request field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestField getHistoryInterfaceRequestField(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _historyInterfaceRequestFieldLocalService.getHistoryInterfaceRequestField(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _historyInterfaceRequestFieldLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the history interface request fields.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of history interface request fields
	* @param end the upper bound of the range of history interface request fields (not inclusive)
	* @return the range of history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestField> getHistoryInterfaceRequestFields(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historyInterfaceRequestFieldLocalService.getHistoryInterfaceRequestFields(start,
			end);
	}

	/**
	* Returns the number of history interface request fields.
	*
	* @return the number of history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getHistoryInterfaceRequestFieldsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historyInterfaceRequestFieldLocalService.getHistoryInterfaceRequestFieldsCount();
	}

	/**
	* Updates the history interface request field in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param historyInterfaceRequestField the history interface request field
	* @return the history interface request field that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestField updateHistoryInterfaceRequestField(
		vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestField historyInterfaceRequestField)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historyInterfaceRequestFieldLocalService.updateHistoryInterfaceRequestField(historyInterfaceRequestField);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _historyInterfaceRequestFieldLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_historyInterfaceRequestFieldLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _historyInterfaceRequestFieldLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public HistoryInterfaceRequestFieldLocalService getWrappedHistoryInterfaceRequestFieldLocalService() {
		return _historyInterfaceRequestFieldLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedHistoryInterfaceRequestFieldLocalService(
		HistoryInterfaceRequestFieldLocalService historyInterfaceRequestFieldLocalService) {
		_historyInterfaceRequestFieldLocalService = historyInterfaceRequestFieldLocalService;
	}

	@Override
	public HistoryInterfaceRequestFieldLocalService getWrappedService() {
		return _historyInterfaceRequestFieldLocalService;
	}

	@Override
	public void setWrappedService(
		HistoryInterfaceRequestFieldLocalService historyInterfaceRequestFieldLocalService) {
		_historyInterfaceRequestFieldLocalService = historyInterfaceRequestFieldLocalService;
	}

	private HistoryInterfaceRequestFieldLocalService _historyInterfaceRequestFieldLocalService;
}