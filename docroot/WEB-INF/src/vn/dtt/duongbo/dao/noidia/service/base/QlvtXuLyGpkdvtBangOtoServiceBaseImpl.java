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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto;
import vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoService;
import vn.dtt.duongbo.dao.noidia.service.persistence.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence;
import vn.dtt.duongbo.dao.noidia.service.persistence.QlvtXuLyGpkdvtBangOtoPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the qlvt xu ly gpkdvt bang oto remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link vn.dtt.duongbo.dao.noidia.service.impl.QlvtXuLyGpkdvtBangOtoServiceImpl}.
 * </p>
 *
 * @author NoiPham
 * @see vn.dtt.duongbo.dao.noidia.service.impl.QlvtXuLyGpkdvtBangOtoServiceImpl
 * @see vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoServiceUtil
 * @generated
 */
public abstract class QlvtXuLyGpkdvtBangOtoServiceBaseImpl
	extends BaseServiceImpl implements QlvtXuLyGpkdvtBangOtoService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoServiceUtil} to access the qlvt xu ly gpkdvt bang oto remote service.
	 */

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
	}

	public void destroy() {
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
	private QlvtXuLyGpkdvtBangOtoServiceClpInvoker _clpInvoker = new QlvtXuLyGpkdvtBangOtoServiceClpInvoker();
}