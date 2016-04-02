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
 * Provides a wrapper for {@link NoticeShipMessageLocalService}.
 *
 * @author longdm
 * @see NoticeShipMessageLocalService
 * @generated
 */
public class NoticeShipMessageLocalServiceWrapper
	implements NoticeShipMessageLocalService,
		ServiceWrapper<NoticeShipMessageLocalService> {
	public NoticeShipMessageLocalServiceWrapper(
		NoticeShipMessageLocalService noticeShipMessageLocalService) {
		_noticeShipMessageLocalService = noticeShipMessageLocalService;
	}

	/**
	* Adds the notice ship message to the database. Also notifies the appropriate model listeners.
	*
	* @param noticeShipMessage the notice ship message
	* @return the notice ship message that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.NoticeShipMessage addNoticeShipMessage(
		vn.dtt.duongbien.dao.vrcb.model.NoticeShipMessage noticeShipMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _noticeShipMessageLocalService.addNoticeShipMessage(noticeShipMessage);
	}

	/**
	* Creates a new notice ship message with the primary key. Does not add the notice ship message to the database.
	*
	* @param id the primary key for the new notice ship message
	* @return the new notice ship message
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.NoticeShipMessage createNoticeShipMessage(
		long id) {
		return _noticeShipMessageLocalService.createNoticeShipMessage(id);
	}

	/**
	* Deletes the notice ship message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the notice ship message
	* @return the notice ship message that was removed
	* @throws PortalException if a notice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.NoticeShipMessage deleteNoticeShipMessage(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _noticeShipMessageLocalService.deleteNoticeShipMessage(id);
	}

	/**
	* Deletes the notice ship message from the database. Also notifies the appropriate model listeners.
	*
	* @param noticeShipMessage the notice ship message
	* @return the notice ship message that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.NoticeShipMessage deleteNoticeShipMessage(
		vn.dtt.duongbien.dao.vrcb.model.NoticeShipMessage noticeShipMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _noticeShipMessageLocalService.deleteNoticeShipMessage(noticeShipMessage);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _noticeShipMessageLocalService.dynamicQuery();
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
		return _noticeShipMessageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.NoticeShipMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _noticeShipMessageLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.NoticeShipMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _noticeShipMessageLocalService.dynamicQuery(dynamicQuery, start,
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
		return _noticeShipMessageLocalService.dynamicQueryCount(dynamicQuery);
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
		return _noticeShipMessageLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.NoticeShipMessage fetchNoticeShipMessage(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _noticeShipMessageLocalService.fetchNoticeShipMessage(id);
	}

	/**
	* Returns the notice ship message with the primary key.
	*
	* @param id the primary key of the notice ship message
	* @return the notice ship message
	* @throws PortalException if a notice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.NoticeShipMessage getNoticeShipMessage(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _noticeShipMessageLocalService.getNoticeShipMessage(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _noticeShipMessageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the notice ship messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.NoticeShipMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of notice ship messages
	* @param end the upper bound of the range of notice ship messages (not inclusive)
	* @return the range of notice ship messages
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.NoticeShipMessage> getNoticeShipMessages(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _noticeShipMessageLocalService.getNoticeShipMessages(start, end);
	}

	/**
	* Returns the number of notice ship messages.
	*
	* @return the number of notice ship messages
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getNoticeShipMessagesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _noticeShipMessageLocalService.getNoticeShipMessagesCount();
	}

	/**
	* Updates the notice ship message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param noticeShipMessage the notice ship message
	* @return the notice ship message that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.NoticeShipMessage updateNoticeShipMessage(
		vn.dtt.duongbien.dao.vrcb.model.NoticeShipMessage noticeShipMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _noticeShipMessageLocalService.updateNoticeShipMessage(noticeShipMessage);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _noticeShipMessageLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_noticeShipMessageLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _noticeShipMessageLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public NoticeShipMessageLocalService getWrappedNoticeShipMessageLocalService() {
		return _noticeShipMessageLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedNoticeShipMessageLocalService(
		NoticeShipMessageLocalService noticeShipMessageLocalService) {
		_noticeShipMessageLocalService = noticeShipMessageLocalService;
	}

	@Override
	public NoticeShipMessageLocalService getWrappedService() {
		return _noticeShipMessageLocalService;
	}

	@Override
	public void setWrappedService(
		NoticeShipMessageLocalService noticeShipMessageLocalService) {
		_noticeShipMessageLocalService = noticeShipMessageLocalService;
	}

	private NoticeShipMessageLocalService _noticeShipMessageLocalService;
}