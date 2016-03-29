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

package vn.dtt.duongbo.dao.nghiepvu.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QlvtNoiDungThamTraLocalService}.
 *
 * @author NhanNc
 * @see QlvtNoiDungThamTraLocalService
 * @generated
 */
public class QlvtNoiDungThamTraLocalServiceWrapper
	implements QlvtNoiDungThamTraLocalService,
		ServiceWrapper<QlvtNoiDungThamTraLocalService> {
	public QlvtNoiDungThamTraLocalServiceWrapper(
		QlvtNoiDungThamTraLocalService qlvtNoiDungThamTraLocalService) {
		_qlvtNoiDungThamTraLocalService = qlvtNoiDungThamTraLocalService;
	}

	/**
	* Adds the qlvt noi dung tham tra to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtNoiDungThamTra the qlvt noi dung tham tra
	* @return the qlvt noi dung tham tra that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra addQlvtNoiDungThamTra(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra qlvtNoiDungThamTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtNoiDungThamTraLocalService.addQlvtNoiDungThamTra(qlvtNoiDungThamTra);
	}

	/**
	* Creates a new qlvt noi dung tham tra with the primary key. Does not add the qlvt noi dung tham tra to the database.
	*
	* @param id the primary key for the new qlvt noi dung tham tra
	* @return the new qlvt noi dung tham tra
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra createQlvtNoiDungThamTra(
		long id) {
		return _qlvtNoiDungThamTraLocalService.createQlvtNoiDungThamTra(id);
	}

	/**
	* Deletes the qlvt noi dung tham tra with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt noi dung tham tra
	* @return the qlvt noi dung tham tra that was removed
	* @throws PortalException if a qlvt noi dung tham tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra deleteQlvtNoiDungThamTra(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtNoiDungThamTraLocalService.deleteQlvtNoiDungThamTra(id);
	}

	/**
	* Deletes the qlvt noi dung tham tra from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtNoiDungThamTra the qlvt noi dung tham tra
	* @return the qlvt noi dung tham tra that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra deleteQlvtNoiDungThamTra(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra qlvtNoiDungThamTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtNoiDungThamTraLocalService.deleteQlvtNoiDungThamTra(qlvtNoiDungThamTra);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtNoiDungThamTraLocalService.dynamicQuery();
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
		return _qlvtNoiDungThamTraLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtNoiDungThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtNoiDungThamTraLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtNoiDungThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtNoiDungThamTraLocalService.dynamicQuery(dynamicQuery,
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
		return _qlvtNoiDungThamTraLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtNoiDungThamTraLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra fetchQlvtNoiDungThamTra(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtNoiDungThamTraLocalService.fetchQlvtNoiDungThamTra(id);
	}

	/**
	* Returns the qlvt noi dung tham tra with the primary key.
	*
	* @param id the primary key of the qlvt noi dung tham tra
	* @return the qlvt noi dung tham tra
	* @throws PortalException if a qlvt noi dung tham tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra getQlvtNoiDungThamTra(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtNoiDungThamTraLocalService.getQlvtNoiDungThamTra(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtNoiDungThamTraLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt noi dung tham tras.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtNoiDungThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt noi dung tham tras
	* @param end the upper bound of the range of qlvt noi dung tham tras (not inclusive)
	* @return the range of qlvt noi dung tham tras
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra> getQlvtNoiDungThamTras(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtNoiDungThamTraLocalService.getQlvtNoiDungThamTras(start, end);
	}

	/**
	* Returns the number of qlvt noi dung tham tras.
	*
	* @return the number of qlvt noi dung tham tras
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtNoiDungThamTrasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtNoiDungThamTraLocalService.getQlvtNoiDungThamTrasCount();
	}

	/**
	* Updates the qlvt noi dung tham tra in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtNoiDungThamTra the qlvt noi dung tham tra
	* @return the qlvt noi dung tham tra that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra updateQlvtNoiDungThamTra(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra qlvtNoiDungThamTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtNoiDungThamTraLocalService.updateQlvtNoiDungThamTra(qlvtNoiDungThamTra);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtNoiDungThamTraLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtNoiDungThamTraLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtNoiDungThamTraLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra> findByF_tthcNoiDungThamTraId(
		int tthcNoiDungThamTraId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtNoiDungThamTraLocalService.findByF_tthcNoiDungThamTraId(tthcNoiDungThamTraId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtNoiDungThamTraLocalService getWrappedQlvtNoiDungThamTraLocalService() {
		return _qlvtNoiDungThamTraLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtNoiDungThamTraLocalService(
		QlvtNoiDungThamTraLocalService qlvtNoiDungThamTraLocalService) {
		_qlvtNoiDungThamTraLocalService = qlvtNoiDungThamTraLocalService;
	}

	@Override
	public QlvtNoiDungThamTraLocalService getWrappedService() {
		return _qlvtNoiDungThamTraLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtNoiDungThamTraLocalService qlvtNoiDungThamTraLocalService) {
		_qlvtNoiDungThamTraLocalService = qlvtNoiDungThamTraLocalService;
	}

	private QlvtNoiDungThamTraLocalService _qlvtNoiDungThamTraLocalService;
}