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

package vn.dtt.duongbo.dao.noidia.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto;
import vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLocalService;
import vn.dtt.duongbo.dao.noidia.service.persistence.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence;
import vn.dtt.duongbo.dao.noidia.service.persistence.QlvtXuLyGpkdvtBangOtoPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the qlvt xu ly gpkdvt bang oto local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link vn.dtt.duongbo.dao.noidia.service.impl.QlvtXuLyGpkdvtBangOtoLocalServiceImpl}.
 * </p>
 *
 * @author NoiPham
 * @see vn.dtt.duongbo.dao.noidia.service.impl.QlvtXuLyGpkdvtBangOtoLocalServiceImpl
 * @see vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLocalServiceUtil
 * @generated
 */
public abstract class QlvtXuLyGpkdvtBangOtoLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements QlvtXuLyGpkdvtBangOtoLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLocalServiceUtil} to access the qlvt xu ly gpkdvt bang oto local service.
	 */

	/**
	 * Adds the qlvt xu ly gpkdvt bang oto to the database. Also notifies the appropriate model listeners.
	 *
	 * @param qlvtXuLyGpkdvtBangOto the qlvt xu ly gpkdvt bang oto
	 * @return the qlvt xu ly gpkdvt bang oto that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public QlvtXuLyGpkdvtBangOto addQlvtXuLyGpkdvtBangOto(
		QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto) throws SystemException {
		qlvtXuLyGpkdvtBangOto.setNew(true);

		return qlvtXuLyGpkdvtBangOtoPersistence.update(qlvtXuLyGpkdvtBangOto);
	}

	/**
	 * Creates a new qlvt xu ly gpkdvt bang oto with the primary key. Does not add the qlvt xu ly gpkdvt bang oto to the database.
	 *
	 * @param id the primary key for the new qlvt xu ly gpkdvt bang oto
	 * @return the new qlvt xu ly gpkdvt bang oto
	 */
	@Override
	public QlvtXuLyGpkdvtBangOto createQlvtXuLyGpkdvtBangOto(long id) {
		return qlvtXuLyGpkdvtBangOtoPersistence.create(id);
	}

	/**
	 * Deletes the qlvt xu ly gpkdvt bang oto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt xu ly gpkdvt bang oto
	 * @return the qlvt xu ly gpkdvt bang oto that was removed
	 * @throws PortalException if a qlvt xu ly gpkdvt bang oto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public QlvtXuLyGpkdvtBangOto deleteQlvtXuLyGpkdvtBangOto(long id)
		throws PortalException, SystemException {
		return qlvtXuLyGpkdvtBangOtoPersistence.remove(id);
	}

	/**
	 * Deletes the qlvt xu ly gpkdvt bang oto from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qlvtXuLyGpkdvtBangOto the qlvt xu ly gpkdvt bang oto
	 * @return the qlvt xu ly gpkdvt bang oto that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public QlvtXuLyGpkdvtBangOto deleteQlvtXuLyGpkdvtBangOto(
		QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto) throws SystemException {
		return qlvtXuLyGpkdvtBangOtoPersistence.remove(qlvtXuLyGpkdvtBangOto);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(QlvtXuLyGpkdvtBangOto.class,
			clazz.getClassLoader());
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
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return qlvtXuLyGpkdvtBangOtoPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return qlvtXuLyGpkdvtBangOtoPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return qlvtXuLyGpkdvtBangOtoPersistence.findWithDynamicQuery(dynamicQuery,
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return qlvtXuLyGpkdvtBangOtoPersistence.countWithDynamicQuery(dynamicQuery);
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return qlvtXuLyGpkdvtBangOtoPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public QlvtXuLyGpkdvtBangOto fetchQlvtXuLyGpkdvtBangOto(long id)
		throws SystemException {
		return qlvtXuLyGpkdvtBangOtoPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the qlvt xu ly gpkdvt bang oto with the primary key.
	 *
	 * @param id the primary key of the qlvt xu ly gpkdvt bang oto
	 * @return the qlvt xu ly gpkdvt bang oto
	 * @throws PortalException if a qlvt xu ly gpkdvt bang oto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOto getQlvtXuLyGpkdvtBangOto(long id)
		throws PortalException, SystemException {
		return qlvtXuLyGpkdvtBangOtoPersistence.findByPrimaryKey(id);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return qlvtXuLyGpkdvtBangOtoPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the qlvt xu ly gpkdvt bang otos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly gpkdvt bang otos
	 * @param end the upper bound of the range of qlvt xu ly gpkdvt bang otos (not inclusive)
	 * @return the range of qlvt xu ly gpkdvt bang otos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpkdvtBangOto> getQlvtXuLyGpkdvtBangOtos(int start,
		int end) throws SystemException {
		return qlvtXuLyGpkdvtBangOtoPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of qlvt xu ly gpkdvt bang otos.
	 *
	 * @return the number of qlvt xu ly gpkdvt bang otos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getQlvtXuLyGpkdvtBangOtosCount() throws SystemException {
		return qlvtXuLyGpkdvtBangOtoPersistence.countAll();
	}

	/**
	 * Updates the qlvt xu ly gpkdvt bang oto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param qlvtXuLyGpkdvtBangOto the qlvt xu ly gpkdvt bang oto
	 * @return the qlvt xu ly gpkdvt bang oto that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public QlvtXuLyGpkdvtBangOto updateQlvtXuLyGpkdvtBangOto(
		QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto) throws SystemException {
		return qlvtXuLyGpkdvtBangOtoPersistence.update(qlvtXuLyGpkdvtBangOto);
	}

	/**
	 * Returns the qlvt xu ly gpkdvt bang oto local service.
	 *
	 * @return the qlvt xu ly gpkdvt bang oto local service
	 */
	public vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLocalService getQlvtXuLyGpkdvtBangOtoLocalService() {
		return qlvtXuLyGpkdvtBangOtoLocalService;
	}

	/**
	 * Sets the qlvt xu ly gpkdvt bang oto local service.
	 *
	 * @param qlvtXuLyGpkdvtBangOtoLocalService the qlvt xu ly gpkdvt bang oto local service
	 */
	public void setQlvtXuLyGpkdvtBangOtoLocalService(
		vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLocalService qlvtXuLyGpkdvtBangOtoLocalService) {
		this.qlvtXuLyGpkdvtBangOtoLocalService = qlvtXuLyGpkdvtBangOtoLocalService;
	}

	/**
	 * Returns the qlvt xu ly gpkdvt bang oto remote service.
	 *
	 * @return the qlvt xu ly gpkdvt bang oto remote service
	 */
	public vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoService getQlvtXuLyGpkdvtBangOtoService() {
		return qlvtXuLyGpkdvtBangOtoService;
	}

	/**
	 * Sets the qlvt xu ly gpkdvt bang oto remote service.
	 *
	 * @param qlvtXuLyGpkdvtBangOtoService the qlvt xu ly gpkdvt bang oto remote service
	 */
	public void setQlvtXuLyGpkdvtBangOtoService(
		vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoService qlvtXuLyGpkdvtBangOtoService) {
		this.qlvtXuLyGpkdvtBangOtoService = qlvtXuLyGpkdvtBangOtoService;
	}

	/**
	 * Returns the qlvt xu ly gpkdvt bang oto persistence.
	 *
	 * @return the qlvt xu ly gpkdvt bang oto persistence
	 */
	public QlvtXuLyGpkdvtBangOtoPersistence getQlvtXuLyGpkdvtBangOtoPersistence() {
		return qlvtXuLyGpkdvtBangOtoPersistence;
	}

	/**
	 * Sets the qlvt xu ly gpkdvt bang oto persistence.
	 *
	 * @param qlvtXuLyGpkdvtBangOtoPersistence the qlvt xu ly gpkdvt bang oto persistence
	 */
	public void setQlvtXuLyGpkdvtBangOtoPersistence(
		QlvtXuLyGpkdvtBangOtoPersistence qlvtXuLyGpkdvtBangOtoPersistence) {
		this.qlvtXuLyGpkdvtBangOtoPersistence = qlvtXuLyGpkdvtBangOtoPersistence;
	}

	/**
	 * Returns the qlvt xu ly gpkdvt bang oto loai hinh van tai local service.
	 *
	 * @return the qlvt xu ly gpkdvt bang oto loai hinh van tai local service
	 */
	public vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService getQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService() {
		return qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService;
	}

	/**
	 * Sets the qlvt xu ly gpkdvt bang oto loai hinh van tai local service.
	 *
	 * @param qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService the qlvt xu ly gpkdvt bang oto loai hinh van tai local service
	 */
	public void setQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService(
		vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService) {
		this.qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService = qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService;
	}

	/**
	 * Returns the qlvt xu ly gpkdvt bang oto loai hinh van tai remote service.
	 *
	 * @return the qlvt xu ly gpkdvt bang oto loai hinh van tai remote service
	 */
	public vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiService getQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiService() {
		return qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiService;
	}

	/**
	 * Sets the qlvt xu ly gpkdvt bang oto loai hinh van tai remote service.
	 *
	 * @param qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiService the qlvt xu ly gpkdvt bang oto loai hinh van tai remote service
	 */
	public void setQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiService(
		vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiService qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiService) {
		this.qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiService = qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiService;
	}

	/**
	 * Returns the qlvt xu ly gpkdvt bang oto loai hinh van tai persistence.
	 *
	 * @return the qlvt xu ly gpkdvt bang oto loai hinh van tai persistence
	 */
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence getQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence() {
		return qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence;
	}

	/**
	 * Sets the qlvt xu ly gpkdvt bang oto loai hinh van tai persistence.
	 *
	 * @param qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence the qlvt xu ly gpkdvt bang oto loai hinh van tai persistence
	 */
	public void setQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence(
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence) {
		this.qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence = qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto",
			qlvtXuLyGpkdvtBangOtoLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return QlvtXuLyGpkdvtBangOto.class;
	}

	protected String getModelClassName() {
		return QlvtXuLyGpkdvtBangOto.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = qlvtXuLyGpkdvtBangOtoPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLocalService.class)
	protected vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLocalService qlvtXuLyGpkdvtBangOtoLocalService;
	@BeanReference(type = vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoService.class)
	protected vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoService qlvtXuLyGpkdvtBangOtoService;
	@BeanReference(type = QlvtXuLyGpkdvtBangOtoPersistence.class)
	protected QlvtXuLyGpkdvtBangOtoPersistence qlvtXuLyGpkdvtBangOtoPersistence;
	@BeanReference(type = vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService.class)
	protected vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService;
	@BeanReference(type = vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiService.class)
	protected vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiService qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiService;
	@BeanReference(type = QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence.class)
	protected QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private QlvtXuLyGpkdvtBangOtoLocalServiceClpInvoker _clpInvoker = new QlvtXuLyGpkdvtBangOtoLocalServiceClpInvoker();
}