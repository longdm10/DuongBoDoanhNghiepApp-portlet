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
 * Provides a wrapper for {@link LogMessageValidationLocalService}.
 *
 * @author longdm
 * @see LogMessageValidationLocalService
 * @generated
 */
public class LogMessageValidationLocalServiceWrapper
	implements LogMessageValidationLocalService,
		ServiceWrapper<LogMessageValidationLocalService> {
	public LogMessageValidationLocalServiceWrapper(
		LogMessageValidationLocalService logMessageValidationLocalService) {
		_logMessageValidationLocalService = logMessageValidationLocalService;
	}

	/**
	* Adds the log message validation to the database. Also notifies the appropriate model listeners.
	*
	* @param logMessageValidation the log message validation
	* @return the log message validation that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation addLogMessageValidation(
		vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation logMessageValidation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _logMessageValidationLocalService.addLogMessageValidation(logMessageValidation);
	}

	/**
	* Creates a new log message validation with the primary key. Does not add the log message validation to the database.
	*
	* @param id the primary key for the new log message validation
	* @return the new log message validation
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation createLogMessageValidation(
		long id) {
		return _logMessageValidationLocalService.createLogMessageValidation(id);
	}

	/**
	* Deletes the log message validation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the log message validation
	* @return the log message validation that was removed
	* @throws PortalException if a log message validation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation deleteLogMessageValidation(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _logMessageValidationLocalService.deleteLogMessageValidation(id);
	}

	/**
	* Deletes the log message validation from the database. Also notifies the appropriate model listeners.
	*
	* @param logMessageValidation the log message validation
	* @return the log message validation that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation deleteLogMessageValidation(
		vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation logMessageValidation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _logMessageValidationLocalService.deleteLogMessageValidation(logMessageValidation);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _logMessageValidationLocalService.dynamicQuery();
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
		return _logMessageValidationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.LogMessageValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _logMessageValidationLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.LogMessageValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _logMessageValidationLocalService.dynamicQuery(dynamicQuery,
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
		return _logMessageValidationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _logMessageValidationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation fetchLogMessageValidation(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _logMessageValidationLocalService.fetchLogMessageValidation(id);
	}

	/**
	* Returns the log message validation with the primary key.
	*
	* @param id the primary key of the log message validation
	* @return the log message validation
	* @throws PortalException if a log message validation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation getLogMessageValidation(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _logMessageValidationLocalService.getLogMessageValidation(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _logMessageValidationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the log message validations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.LogMessageValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of log message validations
	* @param end the upper bound of the range of log message validations (not inclusive)
	* @return the range of log message validations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation> getLogMessageValidations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _logMessageValidationLocalService.getLogMessageValidations(start,
			end);
	}

	/**
	* Returns the number of log message validations.
	*
	* @return the number of log message validations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLogMessageValidationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _logMessageValidationLocalService.getLogMessageValidationsCount();
	}

	/**
	* Updates the log message validation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param logMessageValidation the log message validation
	* @return the log message validation that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation updateLogMessageValidation(
		vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation logMessageValidation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _logMessageValidationLocalService.updateLogMessageValidation(logMessageValidation);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _logMessageValidationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_logMessageValidationLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _logMessageValidationLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LogMessageValidationLocalService getWrappedLogMessageValidationLocalService() {
		return _logMessageValidationLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLogMessageValidationLocalService(
		LogMessageValidationLocalService logMessageValidationLocalService) {
		_logMessageValidationLocalService = logMessageValidationLocalService;
	}

	@Override
	public LogMessageValidationLocalService getWrappedService() {
		return _logMessageValidationLocalService;
	}

	@Override
	public void setWrappedService(
		LogMessageValidationLocalService logMessageValidationLocalService) {
		_logMessageValidationLocalService = logMessageValidationLocalService;
	}

	private LogMessageValidationLocalService _logMessageValidationLocalService;
}