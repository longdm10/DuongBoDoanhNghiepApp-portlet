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

package vn.dtt.duongbo.dao.thanhtoan.service.base;

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

import vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo;
import vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanHoSoLocalService;
import vn.dtt.duongbo.dao.thanhtoan.service.persistence.ThanhToanKeyPayFinder;
import vn.dtt.duongbo.dao.thanhtoan.service.persistence.ThanhToanKeyPayPersistence;
import vn.dtt.duongbo.dao.thanhtoan.service.persistence.TthcHinhThucNopPhiPersistence;
import vn.dtt.duongbo.dao.thanhtoan.service.persistence.TthcXacNhanThanhToanFinder;
import vn.dtt.duongbo.dao.thanhtoan.service.persistence.TthcXacNhanThanhToanHoSoPersistence;
import vn.dtt.duongbo.dao.thanhtoan.service.persistence.TthcXacNhanThanhToanPersistence;
import vn.dtt.duongbo.dao.thanhtoan.service.persistence.TthcYeuCauThanhToanPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the tthc xac nhan thanh toan ho so local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link vn.dtt.duongbo.dao.thanhtoan.service.impl.TthcXacNhanThanhToanHoSoLocalServiceImpl}.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.thanhtoan.service.impl.TthcXacNhanThanhToanHoSoLocalServiceImpl
 * @see vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanHoSoLocalServiceUtil
 * @generated
 */
public abstract class TthcXacNhanThanhToanHoSoLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements TthcXacNhanThanhToanHoSoLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanHoSoLocalServiceUtil} to access the tthc xac nhan thanh toan ho so local service.
	 */

	/**
	 * Adds the tthc xac nhan thanh toan ho so to the database. Also notifies the appropriate model listeners.
	 *
	 * @param tthcXacNhanThanhToanHoSo the tthc xac nhan thanh toan ho so
	 * @return the tthc xac nhan thanh toan ho so that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public TthcXacNhanThanhToanHoSo addTthcXacNhanThanhToanHoSo(
		TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo)
		throws SystemException {
		tthcXacNhanThanhToanHoSo.setNew(true);

		return tthcXacNhanThanhToanHoSoPersistence.update(tthcXacNhanThanhToanHoSo);
	}

	/**
	 * Creates a new tthc xac nhan thanh toan ho so with the primary key. Does not add the tthc xac nhan thanh toan ho so to the database.
	 *
	 * @param id the primary key for the new tthc xac nhan thanh toan ho so
	 * @return the new tthc xac nhan thanh toan ho so
	 */
	@Override
	public TthcXacNhanThanhToanHoSo createTthcXacNhanThanhToanHoSo(long id) {
		return tthcXacNhanThanhToanHoSoPersistence.create(id);
	}

	/**
	 * Deletes the tthc xac nhan thanh toan ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tthc xac nhan thanh toan ho so
	 * @return the tthc xac nhan thanh toan ho so that was removed
	 * @throws PortalException if a tthc xac nhan thanh toan ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public TthcXacNhanThanhToanHoSo deleteTthcXacNhanThanhToanHoSo(long id)
		throws PortalException, SystemException {
		return tthcXacNhanThanhToanHoSoPersistence.remove(id);
	}

	/**
	 * Deletes the tthc xac nhan thanh toan ho so from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tthcXacNhanThanhToanHoSo the tthc xac nhan thanh toan ho so
	 * @return the tthc xac nhan thanh toan ho so that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public TthcXacNhanThanhToanHoSo deleteTthcXacNhanThanhToanHoSo(
		TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo)
		throws SystemException {
		return tthcXacNhanThanhToanHoSoPersistence.remove(tthcXacNhanThanhToanHoSo);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(TthcXacNhanThanhToanHoSo.class,
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
		return tthcXacNhanThanhToanHoSoPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return tthcXacNhanThanhToanHoSoPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return tthcXacNhanThanhToanHoSoPersistence.findWithDynamicQuery(dynamicQuery,
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
		return tthcXacNhanThanhToanHoSoPersistence.countWithDynamicQuery(dynamicQuery);
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
		return tthcXacNhanThanhToanHoSoPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public TthcXacNhanThanhToanHoSo fetchTthcXacNhanThanhToanHoSo(long id)
		throws SystemException {
		return tthcXacNhanThanhToanHoSoPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the tthc xac nhan thanh toan ho so with the primary key.
	 *
	 * @param id the primary key of the tthc xac nhan thanh toan ho so
	 * @return the tthc xac nhan thanh toan ho so
	 * @throws PortalException if a tthc xac nhan thanh toan ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToanHoSo getTthcXacNhanThanhToanHoSo(long id)
		throws PortalException, SystemException {
		return tthcXacNhanThanhToanHoSoPersistence.findByPrimaryKey(id);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return tthcXacNhanThanhToanHoSoPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the tthc xac nhan thanh toan ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc xac nhan thanh toan ho sos
	 * @param end the upper bound of the range of tthc xac nhan thanh toan ho sos (not inclusive)
	 * @return the range of tthc xac nhan thanh toan ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcXacNhanThanhToanHoSo> getTthcXacNhanThanhToanHoSos(
		int start, int end) throws SystemException {
		return tthcXacNhanThanhToanHoSoPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of tthc xac nhan thanh toan ho sos.
	 *
	 * @return the number of tthc xac nhan thanh toan ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getTthcXacNhanThanhToanHoSosCount() throws SystemException {
		return tthcXacNhanThanhToanHoSoPersistence.countAll();
	}

	/**
	 * Updates the tthc xac nhan thanh toan ho so in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param tthcXacNhanThanhToanHoSo the tthc xac nhan thanh toan ho so
	 * @return the tthc xac nhan thanh toan ho so that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public TthcXacNhanThanhToanHoSo updateTthcXacNhanThanhToanHoSo(
		TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo)
		throws SystemException {
		return tthcXacNhanThanhToanHoSoPersistence.update(tthcXacNhanThanhToanHoSo);
	}

	/**
	 * Returns the thanh toan key pay local service.
	 *
	 * @return the thanh toan key pay local service
	 */
	public vn.dtt.duongbo.dao.thanhtoan.service.ThanhToanKeyPayLocalService getThanhToanKeyPayLocalService() {
		return thanhToanKeyPayLocalService;
	}

	/**
	 * Sets the thanh toan key pay local service.
	 *
	 * @param thanhToanKeyPayLocalService the thanh toan key pay local service
	 */
	public void setThanhToanKeyPayLocalService(
		vn.dtt.duongbo.dao.thanhtoan.service.ThanhToanKeyPayLocalService thanhToanKeyPayLocalService) {
		this.thanhToanKeyPayLocalService = thanhToanKeyPayLocalService;
	}

	/**
	 * Returns the thanh toan key pay persistence.
	 *
	 * @return the thanh toan key pay persistence
	 */
	public ThanhToanKeyPayPersistence getThanhToanKeyPayPersistence() {
		return thanhToanKeyPayPersistence;
	}

	/**
	 * Sets the thanh toan key pay persistence.
	 *
	 * @param thanhToanKeyPayPersistence the thanh toan key pay persistence
	 */
	public void setThanhToanKeyPayPersistence(
		ThanhToanKeyPayPersistence thanhToanKeyPayPersistence) {
		this.thanhToanKeyPayPersistence = thanhToanKeyPayPersistence;
	}

	/**
	 * Returns the thanh toan key pay finder.
	 *
	 * @return the thanh toan key pay finder
	 */
	public ThanhToanKeyPayFinder getThanhToanKeyPayFinder() {
		return thanhToanKeyPayFinder;
	}

	/**
	 * Sets the thanh toan key pay finder.
	 *
	 * @param thanhToanKeyPayFinder the thanh toan key pay finder
	 */
	public void setThanhToanKeyPayFinder(
		ThanhToanKeyPayFinder thanhToanKeyPayFinder) {
		this.thanhToanKeyPayFinder = thanhToanKeyPayFinder;
	}

	/**
	 * Returns the tthc hinh thuc nop phi local service.
	 *
	 * @return the tthc hinh thuc nop phi local service
	 */
	public vn.dtt.duongbo.dao.thanhtoan.service.TthcHinhThucNopPhiLocalService getTthcHinhThucNopPhiLocalService() {
		return tthcHinhThucNopPhiLocalService;
	}

	/**
	 * Sets the tthc hinh thuc nop phi local service.
	 *
	 * @param tthcHinhThucNopPhiLocalService the tthc hinh thuc nop phi local service
	 */
	public void setTthcHinhThucNopPhiLocalService(
		vn.dtt.duongbo.dao.thanhtoan.service.TthcHinhThucNopPhiLocalService tthcHinhThucNopPhiLocalService) {
		this.tthcHinhThucNopPhiLocalService = tthcHinhThucNopPhiLocalService;
	}

	/**
	 * Returns the tthc hinh thuc nop phi persistence.
	 *
	 * @return the tthc hinh thuc nop phi persistence
	 */
	public TthcHinhThucNopPhiPersistence getTthcHinhThucNopPhiPersistence() {
		return tthcHinhThucNopPhiPersistence;
	}

	/**
	 * Sets the tthc hinh thuc nop phi persistence.
	 *
	 * @param tthcHinhThucNopPhiPersistence the tthc hinh thuc nop phi persistence
	 */
	public void setTthcHinhThucNopPhiPersistence(
		TthcHinhThucNopPhiPersistence tthcHinhThucNopPhiPersistence) {
		this.tthcHinhThucNopPhiPersistence = tthcHinhThucNopPhiPersistence;
	}

	/**
	 * Returns the tthc xac nhan thanh toan local service.
	 *
	 * @return the tthc xac nhan thanh toan local service
	 */
	public vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalService getTthcXacNhanThanhToanLocalService() {
		return tthcXacNhanThanhToanLocalService;
	}

	/**
	 * Sets the tthc xac nhan thanh toan local service.
	 *
	 * @param tthcXacNhanThanhToanLocalService the tthc xac nhan thanh toan local service
	 */
	public void setTthcXacNhanThanhToanLocalService(
		vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalService tthcXacNhanThanhToanLocalService) {
		this.tthcXacNhanThanhToanLocalService = tthcXacNhanThanhToanLocalService;
	}

	/**
	 * Returns the tthc xac nhan thanh toan persistence.
	 *
	 * @return the tthc xac nhan thanh toan persistence
	 */
	public TthcXacNhanThanhToanPersistence getTthcXacNhanThanhToanPersistence() {
		return tthcXacNhanThanhToanPersistence;
	}

	/**
	 * Sets the tthc xac nhan thanh toan persistence.
	 *
	 * @param tthcXacNhanThanhToanPersistence the tthc xac nhan thanh toan persistence
	 */
	public void setTthcXacNhanThanhToanPersistence(
		TthcXacNhanThanhToanPersistence tthcXacNhanThanhToanPersistence) {
		this.tthcXacNhanThanhToanPersistence = tthcXacNhanThanhToanPersistence;
	}

	/**
	 * Returns the tthc xac nhan thanh toan finder.
	 *
	 * @return the tthc xac nhan thanh toan finder
	 */
	public TthcXacNhanThanhToanFinder getTthcXacNhanThanhToanFinder() {
		return tthcXacNhanThanhToanFinder;
	}

	/**
	 * Sets the tthc xac nhan thanh toan finder.
	 *
	 * @param tthcXacNhanThanhToanFinder the tthc xac nhan thanh toan finder
	 */
	public void setTthcXacNhanThanhToanFinder(
		TthcXacNhanThanhToanFinder tthcXacNhanThanhToanFinder) {
		this.tthcXacNhanThanhToanFinder = tthcXacNhanThanhToanFinder;
	}

	/**
	 * Returns the tthc xac nhan thanh toan ho so local service.
	 *
	 * @return the tthc xac nhan thanh toan ho so local service
	 */
	public vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanHoSoLocalService getTthcXacNhanThanhToanHoSoLocalService() {
		return tthcXacNhanThanhToanHoSoLocalService;
	}

	/**
	 * Sets the tthc xac nhan thanh toan ho so local service.
	 *
	 * @param tthcXacNhanThanhToanHoSoLocalService the tthc xac nhan thanh toan ho so local service
	 */
	public void setTthcXacNhanThanhToanHoSoLocalService(
		vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanHoSoLocalService tthcXacNhanThanhToanHoSoLocalService) {
		this.tthcXacNhanThanhToanHoSoLocalService = tthcXacNhanThanhToanHoSoLocalService;
	}

	/**
	 * Returns the tthc xac nhan thanh toan ho so persistence.
	 *
	 * @return the tthc xac nhan thanh toan ho so persistence
	 */
	public TthcXacNhanThanhToanHoSoPersistence getTthcXacNhanThanhToanHoSoPersistence() {
		return tthcXacNhanThanhToanHoSoPersistence;
	}

	/**
	 * Sets the tthc xac nhan thanh toan ho so persistence.
	 *
	 * @param tthcXacNhanThanhToanHoSoPersistence the tthc xac nhan thanh toan ho so persistence
	 */
	public void setTthcXacNhanThanhToanHoSoPersistence(
		TthcXacNhanThanhToanHoSoPersistence tthcXacNhanThanhToanHoSoPersistence) {
		this.tthcXacNhanThanhToanHoSoPersistence = tthcXacNhanThanhToanHoSoPersistence;
	}

	/**
	 * Returns the tthc yeu cau thanh toan local service.
	 *
	 * @return the tthc yeu cau thanh toan local service
	 */
	public vn.dtt.duongbo.dao.thanhtoan.service.TthcYeuCauThanhToanLocalService getTthcYeuCauThanhToanLocalService() {
		return tthcYeuCauThanhToanLocalService;
	}

	/**
	 * Sets the tthc yeu cau thanh toan local service.
	 *
	 * @param tthcYeuCauThanhToanLocalService the tthc yeu cau thanh toan local service
	 */
	public void setTthcYeuCauThanhToanLocalService(
		vn.dtt.duongbo.dao.thanhtoan.service.TthcYeuCauThanhToanLocalService tthcYeuCauThanhToanLocalService) {
		this.tthcYeuCauThanhToanLocalService = tthcYeuCauThanhToanLocalService;
	}

	/**
	 * Returns the tthc yeu cau thanh toan persistence.
	 *
	 * @return the tthc yeu cau thanh toan persistence
	 */
	public TthcYeuCauThanhToanPersistence getTthcYeuCauThanhToanPersistence() {
		return tthcYeuCauThanhToanPersistence;
	}

	/**
	 * Sets the tthc yeu cau thanh toan persistence.
	 *
	 * @param tthcYeuCauThanhToanPersistence the tthc yeu cau thanh toan persistence
	 */
	public void setTthcYeuCauThanhToanPersistence(
		TthcYeuCauThanhToanPersistence tthcYeuCauThanhToanPersistence) {
		this.tthcYeuCauThanhToanPersistence = tthcYeuCauThanhToanPersistence;
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

		PersistedModelLocalServiceRegistryUtil.register("vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo",
			tthcXacNhanThanhToanHoSoLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo");
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
		return TthcXacNhanThanhToanHoSo.class;
	}

	protected String getModelClassName() {
		return TthcXacNhanThanhToanHoSo.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = tthcXacNhanThanhToanHoSoPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = vn.dtt.duongbo.dao.thanhtoan.service.ThanhToanKeyPayLocalService.class)
	protected vn.dtt.duongbo.dao.thanhtoan.service.ThanhToanKeyPayLocalService thanhToanKeyPayLocalService;
	@BeanReference(type = ThanhToanKeyPayPersistence.class)
	protected ThanhToanKeyPayPersistence thanhToanKeyPayPersistence;
	@BeanReference(type = ThanhToanKeyPayFinder.class)
	protected ThanhToanKeyPayFinder thanhToanKeyPayFinder;
	@BeanReference(type = vn.dtt.duongbo.dao.thanhtoan.service.TthcHinhThucNopPhiLocalService.class)
	protected vn.dtt.duongbo.dao.thanhtoan.service.TthcHinhThucNopPhiLocalService tthcHinhThucNopPhiLocalService;
	@BeanReference(type = TthcHinhThucNopPhiPersistence.class)
	protected TthcHinhThucNopPhiPersistence tthcHinhThucNopPhiPersistence;
	@BeanReference(type = vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalService.class)
	protected vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalService tthcXacNhanThanhToanLocalService;
	@BeanReference(type = TthcXacNhanThanhToanPersistence.class)
	protected TthcXacNhanThanhToanPersistence tthcXacNhanThanhToanPersistence;
	@BeanReference(type = TthcXacNhanThanhToanFinder.class)
	protected TthcXacNhanThanhToanFinder tthcXacNhanThanhToanFinder;
	@BeanReference(type = vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanHoSoLocalService.class)
	protected vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanHoSoLocalService tthcXacNhanThanhToanHoSoLocalService;
	@BeanReference(type = TthcXacNhanThanhToanHoSoPersistence.class)
	protected TthcXacNhanThanhToanHoSoPersistence tthcXacNhanThanhToanHoSoPersistence;
	@BeanReference(type = vn.dtt.duongbo.dao.thanhtoan.service.TthcYeuCauThanhToanLocalService.class)
	protected vn.dtt.duongbo.dao.thanhtoan.service.TthcYeuCauThanhToanLocalService tthcYeuCauThanhToanLocalService;
	@BeanReference(type = TthcYeuCauThanhToanPersistence.class)
	protected TthcYeuCauThanhToanPersistence tthcYeuCauThanhToanPersistence;
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
	private TthcXacNhanThanhToanHoSoLocalServiceClpInvoker _clpInvoker = new TthcXacNhanThanhToanHoSoLocalServiceClpInvoker();
}