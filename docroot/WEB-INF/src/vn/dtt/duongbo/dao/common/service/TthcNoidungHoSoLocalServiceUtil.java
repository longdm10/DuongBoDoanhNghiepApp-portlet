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

package vn.dtt.duongbo.dao.common.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for TthcNoidungHoSo. This utility wraps
 * {@link vn.dtt.duongbo.dao.common.service.impl.TthcNoidungHoSoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author win_64
 * @see TthcNoidungHoSoLocalService
 * @see vn.dtt.duongbo.dao.common.service.base.TthcNoidungHoSoLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.common.service.impl.TthcNoidungHoSoLocalServiceImpl
 * @generated
 */
public class TthcNoidungHoSoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.duongbo.dao.common.service.impl.TthcNoidungHoSoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the tthc noidung ho so to the database. Also notifies the appropriate model listeners.
	*
	* @param tthcNoidungHoSo the tthc noidung ho so
	* @return the tthc noidung ho so that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo addTthcNoidungHoSo(
		vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo tthcNoidungHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTthcNoidungHoSo(tthcNoidungHoSo);
	}

	/**
	* Creates a new tthc noidung ho so with the primary key. Does not add the tthc noidung ho so to the database.
	*
	* @param id the primary key for the new tthc noidung ho so
	* @return the new tthc noidung ho so
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo createTthcNoidungHoSo(
		long id) {
		return getService().createTthcNoidungHoSo(id);
	}

	/**
	* Deletes the tthc noidung ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc noidung ho so
	* @return the tthc noidung ho so that was removed
	* @throws PortalException if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo deleteTthcNoidungHoSo(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTthcNoidungHoSo(id);
	}

	/**
	* Deletes the tthc noidung ho so from the database. Also notifies the appropriate model listeners.
	*
	* @param tthcNoidungHoSo the tthc noidung ho so
	* @return the tthc noidung ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo deleteTthcNoidungHoSo(
		vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo tthcNoidungHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTthcNoidungHoSo(tthcNoidungHoSo);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchTthcNoidungHoSo(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTthcNoidungHoSo(id);
	}

	/**
	* Returns the tthc noidung ho so with the primary key.
	*
	* @param id the primary key of the tthc noidung ho so
	* @return the tthc noidung ho so
	* @throws PortalException if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo getTthcNoidungHoSo(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTthcNoidungHoSo(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tthc noidung ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @return the range of tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> getTthcNoidungHoSos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTthcNoidungHoSos(start, end);
	}

	/**
	* Returns the number of tthc noidung ho sos.
	*
	* @return the number of tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int getTthcNoidungHoSosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTthcNoidungHoSosCount();
	}

	/**
	* Updates the tthc noidung ho so in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tthcNoidungHoSo the tthc noidung ho so
	* @return the tthc noidung ho so that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo updateTthcNoidungHoSo(
		vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo tthcNoidungHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTthcNoidungHoSo(tthcNoidungHoSo);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo updateNoiDungHoSo(
		long userId, long hoSoThuTucId, long thanhPhanHoSoId,
		java.lang.String tenTaiLieu, long taiLieuDinhKem,
		java.lang.String noiDungXML, long loaiTaiLieu, int trangThai)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateNoiDungHoSo(userId, hoSoThuTucId, thanhPhanHoSoId,
			tenTaiLieu, taiLieuDinhKem, noiDungXML, loaiTaiLieu, trangThai);
	}

	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId) {
		return getService()
				   .findByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
			bieuMauHoSoId, thanhPhanHoSoId);
	}

	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai) {
		return getService()
				   .findByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(hoSoThuTucId,
			bieuMauHoSoId, thanhPhanHoSoId, trangThai);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId) {
		return getService()
				   .findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
			thanhPhanHoSoId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByHoSoThuTucId(
		long hoSoThuTucId) {
		return getService().findByHoSoThuTucId(hoSoThuTucId);
	}

	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByHoSoThuTucIdAndBieuMauHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId) {
		return getService()
				   .findByHoSoThuTucIdAndBieuMauHoSoId(hoSoThuTucId,
			bieuMauHoSoId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByHoSoThuTucIdThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId) {
		return getService()
				   .findByHoSoThuTucIdThanhPhanHoSoId(hoSoThuTucId,
			thanhPhanHoSoId);
	}

	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo getLastByHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId) {
		return getService()
				   .getLastByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
			thanhPhanHoSoId);
	}

	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findHoSoThuTucId_TaiLieuDinhKem(
		long hoSoThuTucId, long taiLieuDinhKem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findHoSoThuTucId_TaiLieuDinhKem(hoSoThuTucId, taiLieuDinhKem);
	}

	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucDonOnline(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchByHoSoThuTucDonOnline(hoSoThuTucId, thanhPhanHoSoId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByF_HS_DINH_KEM(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByF_HS_DINH_KEM(hoSoThuTucId);
	}

	public static void clearService() {
		_service = null;
	}

	public static TthcNoidungHoSoLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TthcNoidungHoSoLocalService.class.getName());

			if (invokableLocalService instanceof TthcNoidungHoSoLocalService) {
				_service = (TthcNoidungHoSoLocalService)invokableLocalService;
			}
			else {
				_service = new TthcNoidungHoSoLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(TthcNoidungHoSoLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(TthcNoidungHoSoLocalService service) {
	}

	private static TthcNoidungHoSoLocalService _service;
}