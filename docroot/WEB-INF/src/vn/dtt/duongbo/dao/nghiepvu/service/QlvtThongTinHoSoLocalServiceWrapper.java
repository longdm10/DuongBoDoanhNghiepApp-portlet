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
 * Provides a wrapper for {@link QlvtThongTinHoSoLocalService}.
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoLocalService
 * @generated
 */
public class QlvtThongTinHoSoLocalServiceWrapper
	implements QlvtThongTinHoSoLocalService,
		ServiceWrapper<QlvtThongTinHoSoLocalService> {
	public QlvtThongTinHoSoLocalServiceWrapper(
		QlvtThongTinHoSoLocalService qlvtThongTinHoSoLocalService) {
		_qlvtThongTinHoSoLocalService = qlvtThongTinHoSoLocalService;
	}

	/**
	* Adds the qlvt thong tin ho so to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtThongTinHoSo the qlvt thong tin ho so
	* @return the qlvt thong tin ho so that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo addQlvtThongTinHoSo(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo qlvtThongTinHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoLocalService.addQlvtThongTinHoSo(qlvtThongTinHoSo);
	}

	/**
	* Creates a new qlvt thong tin ho so with the primary key. Does not add the qlvt thong tin ho so to the database.
	*
	* @param id the primary key for the new qlvt thong tin ho so
	* @return the new qlvt thong tin ho so
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo createQlvtThongTinHoSo(
		long id) {
		return _qlvtThongTinHoSoLocalService.createQlvtThongTinHoSo(id);
	}

	/**
	* Deletes the qlvt thong tin ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt thong tin ho so
	* @return the qlvt thong tin ho so that was removed
	* @throws PortalException if a qlvt thong tin ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo deleteQlvtThongTinHoSo(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoLocalService.deleteQlvtThongTinHoSo(id);
	}

	/**
	* Deletes the qlvt thong tin ho so from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtThongTinHoSo the qlvt thong tin ho so
	* @return the qlvt thong tin ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo deleteQlvtThongTinHoSo(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo qlvtThongTinHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoLocalService.deleteQlvtThongTinHoSo(qlvtThongTinHoSo);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtThongTinHoSoLocalService.dynamicQuery();
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
		return _qlvtThongTinHoSoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtThongTinHoSoLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtThongTinHoSoLocalService.dynamicQuery(dynamicQuery, start,
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
		return _qlvtThongTinHoSoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtThongTinHoSoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo fetchQlvtThongTinHoSo(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoLocalService.fetchQlvtThongTinHoSo(id);
	}

	/**
	* Returns the qlvt thong tin ho so with the primary key.
	*
	* @param id the primary key of the qlvt thong tin ho so
	* @return the qlvt thong tin ho so
	* @throws PortalException if a qlvt thong tin ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo getQlvtThongTinHoSo(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoLocalService.getQlvtThongTinHoSo(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt thong tin ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt thong tin ho sos
	* @param end the upper bound of the range of qlvt thong tin ho sos (not inclusive)
	* @return the range of qlvt thong tin ho sos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo> getQlvtThongTinHoSos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoLocalService.getQlvtThongTinHoSos(start, end);
	}

	/**
	* Returns the number of qlvt thong tin ho sos.
	*
	* @return the number of qlvt thong tin ho sos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtThongTinHoSosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoLocalService.getQlvtThongTinHoSosCount();
	}

	/**
	* Updates the qlvt thong tin ho so in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtThongTinHoSo the qlvt thong tin ho so
	* @return the qlvt thong tin ho so that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo updateQlvtThongTinHoSo(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo qlvtThongTinHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoLocalService.updateQlvtThongTinHoSo(qlvtThongTinHoSo);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtThongTinHoSoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtThongTinHoSoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtThongTinHoSoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo getMaSoHoSo(
		java.lang.String maSoHoSo) {
		return _qlvtThongTinHoSoLocalService.getMaSoHoSo(maSoHoSo);
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo fetchByphieuXuLyId(
		long phieuXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoLocalService.fetchByphieuXuLyId(phieuXuLyId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtThongTinHoSoLocalService getWrappedQlvtThongTinHoSoLocalService() {
		return _qlvtThongTinHoSoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtThongTinHoSoLocalService(
		QlvtThongTinHoSoLocalService qlvtThongTinHoSoLocalService) {
		_qlvtThongTinHoSoLocalService = qlvtThongTinHoSoLocalService;
	}

	@Override
	public QlvtThongTinHoSoLocalService getWrappedService() {
		return _qlvtThongTinHoSoLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtThongTinHoSoLocalService qlvtThongTinHoSoLocalService) {
		_qlvtThongTinHoSoLocalService = qlvtThongTinHoSoLocalService;
	}

	private QlvtThongTinHoSoLocalService _qlvtThongTinHoSoLocalService;
}