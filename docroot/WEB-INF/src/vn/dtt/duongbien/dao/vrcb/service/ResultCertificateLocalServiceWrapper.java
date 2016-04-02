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
 * Provides a wrapper for {@link ResultCertificateLocalService}.
 *
 * @author longdm
 * @see ResultCertificateLocalService
 * @generated
 */
public class ResultCertificateLocalServiceWrapper
	implements ResultCertificateLocalService,
		ServiceWrapper<ResultCertificateLocalService> {
	public ResultCertificateLocalServiceWrapper(
		ResultCertificateLocalService resultCertificateLocalService) {
		_resultCertificateLocalService = resultCertificateLocalService;
	}

	/**
	* Adds the result certificate to the database. Also notifies the appropriate model listeners.
	*
	* @param resultCertificate the result certificate
	* @return the result certificate that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultCertificate addResultCertificate(
		vn.dtt.duongbien.dao.vrcb.model.ResultCertificate resultCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultCertificateLocalService.addResultCertificate(resultCertificate);
	}

	/**
	* Creates a new result certificate with the primary key. Does not add the result certificate to the database.
	*
	* @param id the primary key for the new result certificate
	* @return the new result certificate
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultCertificate createResultCertificate(
		long id) {
		return _resultCertificateLocalService.createResultCertificate(id);
	}

	/**
	* Deletes the result certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the result certificate
	* @return the result certificate that was removed
	* @throws PortalException if a result certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultCertificate deleteResultCertificate(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resultCertificateLocalService.deleteResultCertificate(id);
	}

	/**
	* Deletes the result certificate from the database. Also notifies the appropriate model listeners.
	*
	* @param resultCertificate the result certificate
	* @return the result certificate that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultCertificate deleteResultCertificate(
		vn.dtt.duongbien.dao.vrcb.model.ResultCertificate resultCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultCertificateLocalService.deleteResultCertificate(resultCertificate);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _resultCertificateLocalService.dynamicQuery();
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
		return _resultCertificateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _resultCertificateLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _resultCertificateLocalService.dynamicQuery(dynamicQuery, start,
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
		return _resultCertificateLocalService.dynamicQueryCount(dynamicQuery);
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
		return _resultCertificateLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultCertificate fetchResultCertificate(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _resultCertificateLocalService.fetchResultCertificate(id);
	}

	/**
	* Returns the result certificate with the primary key.
	*
	* @param id the primary key of the result certificate
	* @return the result certificate
	* @throws PortalException if a result certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultCertificate getResultCertificate(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resultCertificateLocalService.getResultCertificate(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resultCertificateLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the result certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of result certificates
	* @param end the upper bound of the range of result certificates (not inclusive)
	* @return the range of result certificates
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultCertificate> getResultCertificates(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultCertificateLocalService.getResultCertificates(start, end);
	}

	/**
	* Returns the number of result certificates.
	*
	* @return the number of result certificates
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getResultCertificatesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultCertificateLocalService.getResultCertificatesCount();
	}

	/**
	* Updates the result certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resultCertificate the result certificate
	* @return the result certificate that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultCertificate updateResultCertificate(
		vn.dtt.duongbien.dao.vrcb.model.ResultCertificate resultCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultCertificateLocalService.updateResultCertificate(resultCertificate);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _resultCertificateLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_resultCertificateLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _resultCertificateLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ResultCertificateLocalService getWrappedResultCertificateLocalService() {
		return _resultCertificateLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedResultCertificateLocalService(
		ResultCertificateLocalService resultCertificateLocalService) {
		_resultCertificateLocalService = resultCertificateLocalService;
	}

	@Override
	public ResultCertificateLocalService getWrappedService() {
		return _resultCertificateLocalService;
	}

	@Override
	public void setWrappedService(
		ResultCertificateLocalService resultCertificateLocalService) {
		_resultCertificateLocalService = resultCertificateLocalService;
	}

	private ResultCertificateLocalService _resultCertificateLocalService;
}