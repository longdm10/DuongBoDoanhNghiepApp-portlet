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
 * Provides a wrapper for {@link QlvtTTHCKetQuaThamTraLocalService}.
 *
 * @author NhanNc
 * @see QlvtTTHCKetQuaThamTraLocalService
 * @generated
 */
public class QlvtTTHCKetQuaThamTraLocalServiceWrapper
	implements QlvtTTHCKetQuaThamTraLocalService,
		ServiceWrapper<QlvtTTHCKetQuaThamTraLocalService> {
	public QlvtTTHCKetQuaThamTraLocalServiceWrapper(
		QlvtTTHCKetQuaThamTraLocalService qlvtTTHCKetQuaThamTraLocalService) {
		_qlvtTTHCKetQuaThamTraLocalService = qlvtTTHCKetQuaThamTraLocalService;
	}

	/**
	* Adds the qlvt t t h c ket qua tham tra to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtTTHCKetQuaThamTra the qlvt t t h c ket qua tham tra
	* @return the qlvt t t h c ket qua tham tra that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra addQlvtTTHCKetQuaThamTra(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtTTHCKetQuaThamTraLocalService.addQlvtTTHCKetQuaThamTra(qlvtTTHCKetQuaThamTra);
	}

	/**
	* Creates a new qlvt t t h c ket qua tham tra with the primary key. Does not add the qlvt t t h c ket qua tham tra to the database.
	*
	* @param id the primary key for the new qlvt t t h c ket qua tham tra
	* @return the new qlvt t t h c ket qua tham tra
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra createQlvtTTHCKetQuaThamTra(
		long id) {
		return _qlvtTTHCKetQuaThamTraLocalService.createQlvtTTHCKetQuaThamTra(id);
	}

	/**
	* Deletes the qlvt t t h c ket qua tham tra with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt t t h c ket qua tham tra
	* @return the qlvt t t h c ket qua tham tra that was removed
	* @throws PortalException if a qlvt t t h c ket qua tham tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra deleteQlvtTTHCKetQuaThamTra(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtTTHCKetQuaThamTraLocalService.deleteQlvtTTHCKetQuaThamTra(id);
	}

	/**
	* Deletes the qlvt t t h c ket qua tham tra from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtTTHCKetQuaThamTra the qlvt t t h c ket qua tham tra
	* @return the qlvt t t h c ket qua tham tra that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra deleteQlvtTTHCKetQuaThamTra(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtTTHCKetQuaThamTraLocalService.deleteQlvtTTHCKetQuaThamTra(qlvtTTHCKetQuaThamTra);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtTTHCKetQuaThamTraLocalService.dynamicQuery();
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
		return _qlvtTTHCKetQuaThamTraLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCKetQuaThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtTTHCKetQuaThamTraLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCKetQuaThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtTTHCKetQuaThamTraLocalService.dynamicQuery(dynamicQuery,
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
		return _qlvtTTHCKetQuaThamTraLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtTTHCKetQuaThamTraLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra fetchQlvtTTHCKetQuaThamTra(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtTTHCKetQuaThamTraLocalService.fetchQlvtTTHCKetQuaThamTra(id);
	}

	/**
	* Returns the qlvt t t h c ket qua tham tra with the primary key.
	*
	* @param id the primary key of the qlvt t t h c ket qua tham tra
	* @return the qlvt t t h c ket qua tham tra
	* @throws PortalException if a qlvt t t h c ket qua tham tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra getQlvtTTHCKetQuaThamTra(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtTTHCKetQuaThamTraLocalService.getQlvtTTHCKetQuaThamTra(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtTTHCKetQuaThamTraLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt t t h c ket qua tham tras.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCKetQuaThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt t t h c ket qua tham tras
	* @param end the upper bound of the range of qlvt t t h c ket qua tham tras (not inclusive)
	* @return the range of qlvt t t h c ket qua tham tras
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra> getQlvtTTHCKetQuaThamTras(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtTTHCKetQuaThamTraLocalService.getQlvtTTHCKetQuaThamTras(start,
			end);
	}

	/**
	* Returns the number of qlvt t t h c ket qua tham tras.
	*
	* @return the number of qlvt t t h c ket qua tham tras
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtTTHCKetQuaThamTrasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtTTHCKetQuaThamTraLocalService.getQlvtTTHCKetQuaThamTrasCount();
	}

	/**
	* Updates the qlvt t t h c ket qua tham tra in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtTTHCKetQuaThamTra the qlvt t t h c ket qua tham tra
	* @return the qlvt t t h c ket qua tham tra that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra updateQlvtTTHCKetQuaThamTra(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtTTHCKetQuaThamTraLocalService.updateQlvtTTHCKetQuaThamTra(qlvtTTHCKetQuaThamTra);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtTTHCKetQuaThamTraLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtTTHCKetQuaThamTraLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtTTHCKetQuaThamTraLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra> findByToChucIdAndMaTthc(
		java.lang.String maTthc, int buocXuLy, int toChucId) {
		return _qlvtTTHCKetQuaThamTraLocalService.findByToChucIdAndMaTthc(maTthc,
			buocXuLy, toChucId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtTTHCKetQuaThamTraLocalService getWrappedQlvtTTHCKetQuaThamTraLocalService() {
		return _qlvtTTHCKetQuaThamTraLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtTTHCKetQuaThamTraLocalService(
		QlvtTTHCKetQuaThamTraLocalService qlvtTTHCKetQuaThamTraLocalService) {
		_qlvtTTHCKetQuaThamTraLocalService = qlvtTTHCKetQuaThamTraLocalService;
	}

	@Override
	public QlvtTTHCKetQuaThamTraLocalService getWrappedService() {
		return _qlvtTTHCKetQuaThamTraLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtTTHCKetQuaThamTraLocalService qlvtTTHCKetQuaThamTraLocalService) {
		_qlvtTTHCKetQuaThamTraLocalService = qlvtTTHCKetQuaThamTraLocalService;
	}

	private QlvtTTHCKetQuaThamTraLocalService _qlvtTTHCKetQuaThamTraLocalService;
}