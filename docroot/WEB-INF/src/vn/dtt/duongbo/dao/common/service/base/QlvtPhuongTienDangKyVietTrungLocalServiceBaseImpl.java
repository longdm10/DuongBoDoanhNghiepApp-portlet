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

package vn.dtt.duongbo.dao.common.service.base;

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

import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung;
import vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietTrungLocalService;
import vn.dtt.duongbo.dao.common.service.persistence.DmDataGroupPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.DmDataItemFinder;
import vn.dtt.duongbo.dao.common.service.persistence.DmDataItemPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.DmDataVersionPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.DmMetaDataPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.QlvtDiemDungDangKyVietCamFinder;
import vn.dtt.duongbo.dao.common.service.persistence.QlvtDiemDungDangKyVietCamPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.QlvtDiemDungDangKyVietLaoFinder;
import vn.dtt.duongbo.dao.common.service.persistence.QlvtDiemDungDangKyVietLaoPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.QlvtDiemDungDangKyVietTrungFinder;
import vn.dtt.duongbo.dao.common.service.persistence.QlvtDiemDungDangKyVietTrungPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.QlvtLoaiHinhHoatDongDnFinder;
import vn.dtt.duongbo.dao.common.service.persistence.QlvtLoaiHinhHoatDongDnPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.QlvtPhuongTienCapBienHieuFinder;
import vn.dtt.duongbo.dao.common.service.persistence.QlvtPhuongTienCapBienHieuPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.QlvtPhuongTienCapPhuHieuFinder;
import vn.dtt.duongbo.dao.common.service.persistence.QlvtPhuongTienCapPhuHieuPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.QlvtPhuongTienDangKyVietCamFinder;
import vn.dtt.duongbo.dao.common.service.persistence.QlvtPhuongTienDangKyVietCamPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.QlvtPhuongTienDangKyVietLaoFinder;
import vn.dtt.duongbo.dao.common.service.persistence.QlvtPhuongTienDangKyVietLaoPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.QlvtPhuongTienDangKyVietTrungFinder;
import vn.dtt.duongbo.dao.common.service.persistence.QlvtPhuongTienDangKyVietTrungPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.TthcBieuMauHoSoPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.TthcDoiTuongThucHienPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.TthcDonViThucHienFinder;
import vn.dtt.duongbo.dao.common.service.persistence.TthcDonViThucHienPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.TthcHoSoThuTucFinder;
import vn.dtt.duongbo.dao.common.service.persistence.TthcHoSoThuTucPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.TthcLinhVucThuTucPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.TthcNoidungHoSoFinder;
import vn.dtt.duongbo.dao.common.service.persistence.TthcNoidungHoSoPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.TthcNoidungHoSoTmpPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.TthcPhanNhomHoSoFinder;
import vn.dtt.duongbo.dao.common.service.persistence.TthcPhanNhomHoSoPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.TthcPhanNhomHoSoVaiTroPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.TthcThanhPhanHoSoBieuMauPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.TthcThanhPhanHoSoFinder;
import vn.dtt.duongbo.dao.common.service.persistence.TthcThanhPhanHoSoPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.TthcThongBaoXuLyPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.TthcThuTucHanhChinhPersistence;
import vn.dtt.duongbo.dao.common.service.persistence.TthcTrangThaiHoSoFinder;
import vn.dtt.duongbo.dao.common.service.persistence.TthcTrangThaiHoSoPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the qlvt phuong tien dang ky viet trung local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link vn.dtt.duongbo.dao.common.service.impl.QlvtPhuongTienDangKyVietTrungLocalServiceImpl}.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.common.service.impl.QlvtPhuongTienDangKyVietTrungLocalServiceImpl
 * @see vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietTrungLocalServiceUtil
 * @generated
 */
public abstract class QlvtPhuongTienDangKyVietTrungLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements QlvtPhuongTienDangKyVietTrungLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietTrungLocalServiceUtil} to access the qlvt phuong tien dang ky viet trung local service.
	 */

	/**
	 * Adds the qlvt phuong tien dang ky viet trung to the database. Also notifies the appropriate model listeners.
	 *
	 * @param qlvtPhuongTienDangKyVietTrung the qlvt phuong tien dang ky viet trung
	 * @return the qlvt phuong tien dang ky viet trung that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public QlvtPhuongTienDangKyVietTrung addQlvtPhuongTienDangKyVietTrung(
		QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung)
		throws SystemException {
		qlvtPhuongTienDangKyVietTrung.setNew(true);

		return qlvtPhuongTienDangKyVietTrungPersistence.update(qlvtPhuongTienDangKyVietTrung);
	}

	/**
	 * Creates a new qlvt phuong tien dang ky viet trung with the primary key. Does not add the qlvt phuong tien dang ky viet trung to the database.
	 *
	 * @param id the primary key for the new qlvt phuong tien dang ky viet trung
	 * @return the new qlvt phuong tien dang ky viet trung
	 */
	@Override
	public QlvtPhuongTienDangKyVietTrung createQlvtPhuongTienDangKyVietTrung(
		long id) {
		return qlvtPhuongTienDangKyVietTrungPersistence.create(id);
	}

	/**
	 * Deletes the qlvt phuong tien dang ky viet trung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt phuong tien dang ky viet trung
	 * @return the qlvt phuong tien dang ky viet trung that was removed
	 * @throws PortalException if a qlvt phuong tien dang ky viet trung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public QlvtPhuongTienDangKyVietTrung deleteQlvtPhuongTienDangKyVietTrung(
		long id) throws PortalException, SystemException {
		return qlvtPhuongTienDangKyVietTrungPersistence.remove(id);
	}

	/**
	 * Deletes the qlvt phuong tien dang ky viet trung from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qlvtPhuongTienDangKyVietTrung the qlvt phuong tien dang ky viet trung
	 * @return the qlvt phuong tien dang ky viet trung that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public QlvtPhuongTienDangKyVietTrung deleteQlvtPhuongTienDangKyVietTrung(
		QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung)
		throws SystemException {
		return qlvtPhuongTienDangKyVietTrungPersistence.remove(qlvtPhuongTienDangKyVietTrung);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(QlvtPhuongTienDangKyVietTrung.class,
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
		return qlvtPhuongTienDangKyVietTrungPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietTrungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return qlvtPhuongTienDangKyVietTrungPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietTrungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return qlvtPhuongTienDangKyVietTrungPersistence.findWithDynamicQuery(dynamicQuery,
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
		return qlvtPhuongTienDangKyVietTrungPersistence.countWithDynamicQuery(dynamicQuery);
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
		return qlvtPhuongTienDangKyVietTrungPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public QlvtPhuongTienDangKyVietTrung fetchQlvtPhuongTienDangKyVietTrung(
		long id) throws SystemException {
		return qlvtPhuongTienDangKyVietTrungPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet trung with the primary key.
	 *
	 * @param id the primary key of the qlvt phuong tien dang ky viet trung
	 * @return the qlvt phuong tien dang ky viet trung
	 * @throws PortalException if a qlvt phuong tien dang ky viet trung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietTrung getQlvtPhuongTienDangKyVietTrung(
		long id) throws PortalException, SystemException {
		return qlvtPhuongTienDangKyVietTrungPersistence.findByPrimaryKey(id);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return qlvtPhuongTienDangKyVietTrungPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the qlvt phuong tien dang ky viet trungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietTrungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt phuong tien dang ky viet trungs
	 * @param end the upper bound of the range of qlvt phuong tien dang ky viet trungs (not inclusive)
	 * @return the range of qlvt phuong tien dang ky viet trungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienDangKyVietTrung> getQlvtPhuongTienDangKyVietTrungs(
		int start, int end) throws SystemException {
		return qlvtPhuongTienDangKyVietTrungPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of qlvt phuong tien dang ky viet trungs.
	 *
	 * @return the number of qlvt phuong tien dang ky viet trungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getQlvtPhuongTienDangKyVietTrungsCount()
		throws SystemException {
		return qlvtPhuongTienDangKyVietTrungPersistence.countAll();
	}

	/**
	 * Updates the qlvt phuong tien dang ky viet trung in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param qlvtPhuongTienDangKyVietTrung the qlvt phuong tien dang ky viet trung
	 * @return the qlvt phuong tien dang ky viet trung that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public QlvtPhuongTienDangKyVietTrung updateQlvtPhuongTienDangKyVietTrung(
		QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung)
		throws SystemException {
		return qlvtPhuongTienDangKyVietTrungPersistence.update(qlvtPhuongTienDangKyVietTrung);
	}

	/**
	 * Returns the dm data group local service.
	 *
	 * @return the dm data group local service
	 */
	public vn.dtt.duongbo.dao.common.service.DmDataGroupLocalService getDmDataGroupLocalService() {
		return dmDataGroupLocalService;
	}

	/**
	 * Sets the dm data group local service.
	 *
	 * @param dmDataGroupLocalService the dm data group local service
	 */
	public void setDmDataGroupLocalService(
		vn.dtt.duongbo.dao.common.service.DmDataGroupLocalService dmDataGroupLocalService) {
		this.dmDataGroupLocalService = dmDataGroupLocalService;
	}

	/**
	 * Returns the dm data group persistence.
	 *
	 * @return the dm data group persistence
	 */
	public DmDataGroupPersistence getDmDataGroupPersistence() {
		return dmDataGroupPersistence;
	}

	/**
	 * Sets the dm data group persistence.
	 *
	 * @param dmDataGroupPersistence the dm data group persistence
	 */
	public void setDmDataGroupPersistence(
		DmDataGroupPersistence dmDataGroupPersistence) {
		this.dmDataGroupPersistence = dmDataGroupPersistence;
	}

	/**
	 * Returns the dm data item local service.
	 *
	 * @return the dm data item local service
	 */
	public vn.dtt.duongbo.dao.common.service.DmDataItemLocalService getDmDataItemLocalService() {
		return dmDataItemLocalService;
	}

	/**
	 * Sets the dm data item local service.
	 *
	 * @param dmDataItemLocalService the dm data item local service
	 */
	public void setDmDataItemLocalService(
		vn.dtt.duongbo.dao.common.service.DmDataItemLocalService dmDataItemLocalService) {
		this.dmDataItemLocalService = dmDataItemLocalService;
	}

	/**
	 * Returns the dm data item persistence.
	 *
	 * @return the dm data item persistence
	 */
	public DmDataItemPersistence getDmDataItemPersistence() {
		return dmDataItemPersistence;
	}

	/**
	 * Sets the dm data item persistence.
	 *
	 * @param dmDataItemPersistence the dm data item persistence
	 */
	public void setDmDataItemPersistence(
		DmDataItemPersistence dmDataItemPersistence) {
		this.dmDataItemPersistence = dmDataItemPersistence;
	}

	/**
	 * Returns the dm data item finder.
	 *
	 * @return the dm data item finder
	 */
	public DmDataItemFinder getDmDataItemFinder() {
		return dmDataItemFinder;
	}

	/**
	 * Sets the dm data item finder.
	 *
	 * @param dmDataItemFinder the dm data item finder
	 */
	public void setDmDataItemFinder(DmDataItemFinder dmDataItemFinder) {
		this.dmDataItemFinder = dmDataItemFinder;
	}

	/**
	 * Returns the dm data version local service.
	 *
	 * @return the dm data version local service
	 */
	public vn.dtt.duongbo.dao.common.service.DmDataVersionLocalService getDmDataVersionLocalService() {
		return dmDataVersionLocalService;
	}

	/**
	 * Sets the dm data version local service.
	 *
	 * @param dmDataVersionLocalService the dm data version local service
	 */
	public void setDmDataVersionLocalService(
		vn.dtt.duongbo.dao.common.service.DmDataVersionLocalService dmDataVersionLocalService) {
		this.dmDataVersionLocalService = dmDataVersionLocalService;
	}

	/**
	 * Returns the dm data version persistence.
	 *
	 * @return the dm data version persistence
	 */
	public DmDataVersionPersistence getDmDataVersionPersistence() {
		return dmDataVersionPersistence;
	}

	/**
	 * Sets the dm data version persistence.
	 *
	 * @param dmDataVersionPersistence the dm data version persistence
	 */
	public void setDmDataVersionPersistence(
		DmDataVersionPersistence dmDataVersionPersistence) {
		this.dmDataVersionPersistence = dmDataVersionPersistence;
	}

	/**
	 * Returns the dm meta data local service.
	 *
	 * @return the dm meta data local service
	 */
	public vn.dtt.duongbo.dao.common.service.DmMetaDataLocalService getDmMetaDataLocalService() {
		return dmMetaDataLocalService;
	}

	/**
	 * Sets the dm meta data local service.
	 *
	 * @param dmMetaDataLocalService the dm meta data local service
	 */
	public void setDmMetaDataLocalService(
		vn.dtt.duongbo.dao.common.service.DmMetaDataLocalService dmMetaDataLocalService) {
		this.dmMetaDataLocalService = dmMetaDataLocalService;
	}

	/**
	 * Returns the dm meta data persistence.
	 *
	 * @return the dm meta data persistence
	 */
	public DmMetaDataPersistence getDmMetaDataPersistence() {
		return dmMetaDataPersistence;
	}

	/**
	 * Sets the dm meta data persistence.
	 *
	 * @param dmMetaDataPersistence the dm meta data persistence
	 */
	public void setDmMetaDataPersistence(
		DmMetaDataPersistence dmMetaDataPersistence) {
		this.dmMetaDataPersistence = dmMetaDataPersistence;
	}

	/**
	 * Returns the qlvt diem dung dang ky viet cam local service.
	 *
	 * @return the qlvt diem dung dang ky viet cam local service
	 */
	public vn.dtt.duongbo.dao.common.service.QlvtDiemDungDangKyVietCamLocalService getQlvtDiemDungDangKyVietCamLocalService() {
		return qlvtDiemDungDangKyVietCamLocalService;
	}

	/**
	 * Sets the qlvt diem dung dang ky viet cam local service.
	 *
	 * @param qlvtDiemDungDangKyVietCamLocalService the qlvt diem dung dang ky viet cam local service
	 */
	public void setQlvtDiemDungDangKyVietCamLocalService(
		vn.dtt.duongbo.dao.common.service.QlvtDiemDungDangKyVietCamLocalService qlvtDiemDungDangKyVietCamLocalService) {
		this.qlvtDiemDungDangKyVietCamLocalService = qlvtDiemDungDangKyVietCamLocalService;
	}

	/**
	 * Returns the qlvt diem dung dang ky viet cam persistence.
	 *
	 * @return the qlvt diem dung dang ky viet cam persistence
	 */
	public QlvtDiemDungDangKyVietCamPersistence getQlvtDiemDungDangKyVietCamPersistence() {
		return qlvtDiemDungDangKyVietCamPersistence;
	}

	/**
	 * Sets the qlvt diem dung dang ky viet cam persistence.
	 *
	 * @param qlvtDiemDungDangKyVietCamPersistence the qlvt diem dung dang ky viet cam persistence
	 */
	public void setQlvtDiemDungDangKyVietCamPersistence(
		QlvtDiemDungDangKyVietCamPersistence qlvtDiemDungDangKyVietCamPersistence) {
		this.qlvtDiemDungDangKyVietCamPersistence = qlvtDiemDungDangKyVietCamPersistence;
	}

	/**
	 * Returns the qlvt diem dung dang ky viet cam finder.
	 *
	 * @return the qlvt diem dung dang ky viet cam finder
	 */
	public QlvtDiemDungDangKyVietCamFinder getQlvtDiemDungDangKyVietCamFinder() {
		return qlvtDiemDungDangKyVietCamFinder;
	}

	/**
	 * Sets the qlvt diem dung dang ky viet cam finder.
	 *
	 * @param qlvtDiemDungDangKyVietCamFinder the qlvt diem dung dang ky viet cam finder
	 */
	public void setQlvtDiemDungDangKyVietCamFinder(
		QlvtDiemDungDangKyVietCamFinder qlvtDiemDungDangKyVietCamFinder) {
		this.qlvtDiemDungDangKyVietCamFinder = qlvtDiemDungDangKyVietCamFinder;
	}

	/**
	 * Returns the qlvt diem dung dang ky viet lao local service.
	 *
	 * @return the qlvt diem dung dang ky viet lao local service
	 */
	public vn.dtt.duongbo.dao.common.service.QlvtDiemDungDangKyVietLaoLocalService getQlvtDiemDungDangKyVietLaoLocalService() {
		return qlvtDiemDungDangKyVietLaoLocalService;
	}

	/**
	 * Sets the qlvt diem dung dang ky viet lao local service.
	 *
	 * @param qlvtDiemDungDangKyVietLaoLocalService the qlvt diem dung dang ky viet lao local service
	 */
	public void setQlvtDiemDungDangKyVietLaoLocalService(
		vn.dtt.duongbo.dao.common.service.QlvtDiemDungDangKyVietLaoLocalService qlvtDiemDungDangKyVietLaoLocalService) {
		this.qlvtDiemDungDangKyVietLaoLocalService = qlvtDiemDungDangKyVietLaoLocalService;
	}

	/**
	 * Returns the qlvt diem dung dang ky viet lao persistence.
	 *
	 * @return the qlvt diem dung dang ky viet lao persistence
	 */
	public QlvtDiemDungDangKyVietLaoPersistence getQlvtDiemDungDangKyVietLaoPersistence() {
		return qlvtDiemDungDangKyVietLaoPersistence;
	}

	/**
	 * Sets the qlvt diem dung dang ky viet lao persistence.
	 *
	 * @param qlvtDiemDungDangKyVietLaoPersistence the qlvt diem dung dang ky viet lao persistence
	 */
	public void setQlvtDiemDungDangKyVietLaoPersistence(
		QlvtDiemDungDangKyVietLaoPersistence qlvtDiemDungDangKyVietLaoPersistence) {
		this.qlvtDiemDungDangKyVietLaoPersistence = qlvtDiemDungDangKyVietLaoPersistence;
	}

	/**
	 * Returns the qlvt diem dung dang ky viet lao finder.
	 *
	 * @return the qlvt diem dung dang ky viet lao finder
	 */
	public QlvtDiemDungDangKyVietLaoFinder getQlvtDiemDungDangKyVietLaoFinder() {
		return qlvtDiemDungDangKyVietLaoFinder;
	}

	/**
	 * Sets the qlvt diem dung dang ky viet lao finder.
	 *
	 * @param qlvtDiemDungDangKyVietLaoFinder the qlvt diem dung dang ky viet lao finder
	 */
	public void setQlvtDiemDungDangKyVietLaoFinder(
		QlvtDiemDungDangKyVietLaoFinder qlvtDiemDungDangKyVietLaoFinder) {
		this.qlvtDiemDungDangKyVietLaoFinder = qlvtDiemDungDangKyVietLaoFinder;
	}

	/**
	 * Returns the qlvt diem dung dang ky viet trung local service.
	 *
	 * @return the qlvt diem dung dang ky viet trung local service
	 */
	public vn.dtt.duongbo.dao.common.service.QlvtDiemDungDangKyVietTrungLocalService getQlvtDiemDungDangKyVietTrungLocalService() {
		return qlvtDiemDungDangKyVietTrungLocalService;
	}

	/**
	 * Sets the qlvt diem dung dang ky viet trung local service.
	 *
	 * @param qlvtDiemDungDangKyVietTrungLocalService the qlvt diem dung dang ky viet trung local service
	 */
	public void setQlvtDiemDungDangKyVietTrungLocalService(
		vn.dtt.duongbo.dao.common.service.QlvtDiemDungDangKyVietTrungLocalService qlvtDiemDungDangKyVietTrungLocalService) {
		this.qlvtDiemDungDangKyVietTrungLocalService = qlvtDiemDungDangKyVietTrungLocalService;
	}

	/**
	 * Returns the qlvt diem dung dang ky viet trung persistence.
	 *
	 * @return the qlvt diem dung dang ky viet trung persistence
	 */
	public QlvtDiemDungDangKyVietTrungPersistence getQlvtDiemDungDangKyVietTrungPersistence() {
		return qlvtDiemDungDangKyVietTrungPersistence;
	}

	/**
	 * Sets the qlvt diem dung dang ky viet trung persistence.
	 *
	 * @param qlvtDiemDungDangKyVietTrungPersistence the qlvt diem dung dang ky viet trung persistence
	 */
	public void setQlvtDiemDungDangKyVietTrungPersistence(
		QlvtDiemDungDangKyVietTrungPersistence qlvtDiemDungDangKyVietTrungPersistence) {
		this.qlvtDiemDungDangKyVietTrungPersistence = qlvtDiemDungDangKyVietTrungPersistence;
	}

	/**
	 * Returns the qlvt diem dung dang ky viet trung finder.
	 *
	 * @return the qlvt diem dung dang ky viet trung finder
	 */
	public QlvtDiemDungDangKyVietTrungFinder getQlvtDiemDungDangKyVietTrungFinder() {
		return qlvtDiemDungDangKyVietTrungFinder;
	}

	/**
	 * Sets the qlvt diem dung dang ky viet trung finder.
	 *
	 * @param qlvtDiemDungDangKyVietTrungFinder the qlvt diem dung dang ky viet trung finder
	 */
	public void setQlvtDiemDungDangKyVietTrungFinder(
		QlvtDiemDungDangKyVietTrungFinder qlvtDiemDungDangKyVietTrungFinder) {
		this.qlvtDiemDungDangKyVietTrungFinder = qlvtDiemDungDangKyVietTrungFinder;
	}

	/**
	 * Returns the qlvt loai hinh hoat dong dn local service.
	 *
	 * @return the qlvt loai hinh hoat dong dn local service
	 */
	public vn.dtt.duongbo.dao.common.service.QlvtLoaiHinhHoatDongDnLocalService getQlvtLoaiHinhHoatDongDnLocalService() {
		return qlvtLoaiHinhHoatDongDnLocalService;
	}

	/**
	 * Sets the qlvt loai hinh hoat dong dn local service.
	 *
	 * @param qlvtLoaiHinhHoatDongDnLocalService the qlvt loai hinh hoat dong dn local service
	 */
	public void setQlvtLoaiHinhHoatDongDnLocalService(
		vn.dtt.duongbo.dao.common.service.QlvtLoaiHinhHoatDongDnLocalService qlvtLoaiHinhHoatDongDnLocalService) {
		this.qlvtLoaiHinhHoatDongDnLocalService = qlvtLoaiHinhHoatDongDnLocalService;
	}

	/**
	 * Returns the qlvt loai hinh hoat dong dn persistence.
	 *
	 * @return the qlvt loai hinh hoat dong dn persistence
	 */
	public QlvtLoaiHinhHoatDongDnPersistence getQlvtLoaiHinhHoatDongDnPersistence() {
		return qlvtLoaiHinhHoatDongDnPersistence;
	}

	/**
	 * Sets the qlvt loai hinh hoat dong dn persistence.
	 *
	 * @param qlvtLoaiHinhHoatDongDnPersistence the qlvt loai hinh hoat dong dn persistence
	 */
	public void setQlvtLoaiHinhHoatDongDnPersistence(
		QlvtLoaiHinhHoatDongDnPersistence qlvtLoaiHinhHoatDongDnPersistence) {
		this.qlvtLoaiHinhHoatDongDnPersistence = qlvtLoaiHinhHoatDongDnPersistence;
	}

	/**
	 * Returns the qlvt loai hinh hoat dong dn finder.
	 *
	 * @return the qlvt loai hinh hoat dong dn finder
	 */
	public QlvtLoaiHinhHoatDongDnFinder getQlvtLoaiHinhHoatDongDnFinder() {
		return qlvtLoaiHinhHoatDongDnFinder;
	}

	/**
	 * Sets the qlvt loai hinh hoat dong dn finder.
	 *
	 * @param qlvtLoaiHinhHoatDongDnFinder the qlvt loai hinh hoat dong dn finder
	 */
	public void setQlvtLoaiHinhHoatDongDnFinder(
		QlvtLoaiHinhHoatDongDnFinder qlvtLoaiHinhHoatDongDnFinder) {
		this.qlvtLoaiHinhHoatDongDnFinder = qlvtLoaiHinhHoatDongDnFinder;
	}

	/**
	 * Returns the qlvt phuong tien cap bien hieu local service.
	 *
	 * @return the qlvt phuong tien cap bien hieu local service
	 */
	public vn.dtt.duongbo.dao.common.service.QlvtPhuongTienCapBienHieuLocalService getQlvtPhuongTienCapBienHieuLocalService() {
		return qlvtPhuongTienCapBienHieuLocalService;
	}

	/**
	 * Sets the qlvt phuong tien cap bien hieu local service.
	 *
	 * @param qlvtPhuongTienCapBienHieuLocalService the qlvt phuong tien cap bien hieu local service
	 */
	public void setQlvtPhuongTienCapBienHieuLocalService(
		vn.dtt.duongbo.dao.common.service.QlvtPhuongTienCapBienHieuLocalService qlvtPhuongTienCapBienHieuLocalService) {
		this.qlvtPhuongTienCapBienHieuLocalService = qlvtPhuongTienCapBienHieuLocalService;
	}

	/**
	 * Returns the qlvt phuong tien cap bien hieu persistence.
	 *
	 * @return the qlvt phuong tien cap bien hieu persistence
	 */
	public QlvtPhuongTienCapBienHieuPersistence getQlvtPhuongTienCapBienHieuPersistence() {
		return qlvtPhuongTienCapBienHieuPersistence;
	}

	/**
	 * Sets the qlvt phuong tien cap bien hieu persistence.
	 *
	 * @param qlvtPhuongTienCapBienHieuPersistence the qlvt phuong tien cap bien hieu persistence
	 */
	public void setQlvtPhuongTienCapBienHieuPersistence(
		QlvtPhuongTienCapBienHieuPersistence qlvtPhuongTienCapBienHieuPersistence) {
		this.qlvtPhuongTienCapBienHieuPersistence = qlvtPhuongTienCapBienHieuPersistence;
	}

	/**
	 * Returns the qlvt phuong tien cap bien hieu finder.
	 *
	 * @return the qlvt phuong tien cap bien hieu finder
	 */
	public QlvtPhuongTienCapBienHieuFinder getQlvtPhuongTienCapBienHieuFinder() {
		return qlvtPhuongTienCapBienHieuFinder;
	}

	/**
	 * Sets the qlvt phuong tien cap bien hieu finder.
	 *
	 * @param qlvtPhuongTienCapBienHieuFinder the qlvt phuong tien cap bien hieu finder
	 */
	public void setQlvtPhuongTienCapBienHieuFinder(
		QlvtPhuongTienCapBienHieuFinder qlvtPhuongTienCapBienHieuFinder) {
		this.qlvtPhuongTienCapBienHieuFinder = qlvtPhuongTienCapBienHieuFinder;
	}

	/**
	 * Returns the qlvt phuong tien cap phu hieu local service.
	 *
	 * @return the qlvt phuong tien cap phu hieu local service
	 */
	public vn.dtt.duongbo.dao.common.service.QlvtPhuongTienCapPhuHieuLocalService getQlvtPhuongTienCapPhuHieuLocalService() {
		return qlvtPhuongTienCapPhuHieuLocalService;
	}

	/**
	 * Sets the qlvt phuong tien cap phu hieu local service.
	 *
	 * @param qlvtPhuongTienCapPhuHieuLocalService the qlvt phuong tien cap phu hieu local service
	 */
	public void setQlvtPhuongTienCapPhuHieuLocalService(
		vn.dtt.duongbo.dao.common.service.QlvtPhuongTienCapPhuHieuLocalService qlvtPhuongTienCapPhuHieuLocalService) {
		this.qlvtPhuongTienCapPhuHieuLocalService = qlvtPhuongTienCapPhuHieuLocalService;
	}

	/**
	 * Returns the qlvt phuong tien cap phu hieu persistence.
	 *
	 * @return the qlvt phuong tien cap phu hieu persistence
	 */
	public QlvtPhuongTienCapPhuHieuPersistence getQlvtPhuongTienCapPhuHieuPersistence() {
		return qlvtPhuongTienCapPhuHieuPersistence;
	}

	/**
	 * Sets the qlvt phuong tien cap phu hieu persistence.
	 *
	 * @param qlvtPhuongTienCapPhuHieuPersistence the qlvt phuong tien cap phu hieu persistence
	 */
	public void setQlvtPhuongTienCapPhuHieuPersistence(
		QlvtPhuongTienCapPhuHieuPersistence qlvtPhuongTienCapPhuHieuPersistence) {
		this.qlvtPhuongTienCapPhuHieuPersistence = qlvtPhuongTienCapPhuHieuPersistence;
	}

	/**
	 * Returns the qlvt phuong tien cap phu hieu finder.
	 *
	 * @return the qlvt phuong tien cap phu hieu finder
	 */
	public QlvtPhuongTienCapPhuHieuFinder getQlvtPhuongTienCapPhuHieuFinder() {
		return qlvtPhuongTienCapPhuHieuFinder;
	}

	/**
	 * Sets the qlvt phuong tien cap phu hieu finder.
	 *
	 * @param qlvtPhuongTienCapPhuHieuFinder the qlvt phuong tien cap phu hieu finder
	 */
	public void setQlvtPhuongTienCapPhuHieuFinder(
		QlvtPhuongTienCapPhuHieuFinder qlvtPhuongTienCapPhuHieuFinder) {
		this.qlvtPhuongTienCapPhuHieuFinder = qlvtPhuongTienCapPhuHieuFinder;
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet cam local service.
	 *
	 * @return the qlvt phuong tien dang ky viet cam local service
	 */
	public vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietCamLocalService getQlvtPhuongTienDangKyVietCamLocalService() {
		return qlvtPhuongTienDangKyVietCamLocalService;
	}

	/**
	 * Sets the qlvt phuong tien dang ky viet cam local service.
	 *
	 * @param qlvtPhuongTienDangKyVietCamLocalService the qlvt phuong tien dang ky viet cam local service
	 */
	public void setQlvtPhuongTienDangKyVietCamLocalService(
		vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietCamLocalService qlvtPhuongTienDangKyVietCamLocalService) {
		this.qlvtPhuongTienDangKyVietCamLocalService = qlvtPhuongTienDangKyVietCamLocalService;
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet cam persistence.
	 *
	 * @return the qlvt phuong tien dang ky viet cam persistence
	 */
	public QlvtPhuongTienDangKyVietCamPersistence getQlvtPhuongTienDangKyVietCamPersistence() {
		return qlvtPhuongTienDangKyVietCamPersistence;
	}

	/**
	 * Sets the qlvt phuong tien dang ky viet cam persistence.
	 *
	 * @param qlvtPhuongTienDangKyVietCamPersistence the qlvt phuong tien dang ky viet cam persistence
	 */
	public void setQlvtPhuongTienDangKyVietCamPersistence(
		QlvtPhuongTienDangKyVietCamPersistence qlvtPhuongTienDangKyVietCamPersistence) {
		this.qlvtPhuongTienDangKyVietCamPersistence = qlvtPhuongTienDangKyVietCamPersistence;
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet cam finder.
	 *
	 * @return the qlvt phuong tien dang ky viet cam finder
	 */
	public QlvtPhuongTienDangKyVietCamFinder getQlvtPhuongTienDangKyVietCamFinder() {
		return qlvtPhuongTienDangKyVietCamFinder;
	}

	/**
	 * Sets the qlvt phuong tien dang ky viet cam finder.
	 *
	 * @param qlvtPhuongTienDangKyVietCamFinder the qlvt phuong tien dang ky viet cam finder
	 */
	public void setQlvtPhuongTienDangKyVietCamFinder(
		QlvtPhuongTienDangKyVietCamFinder qlvtPhuongTienDangKyVietCamFinder) {
		this.qlvtPhuongTienDangKyVietCamFinder = qlvtPhuongTienDangKyVietCamFinder;
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet lao local service.
	 *
	 * @return the qlvt phuong tien dang ky viet lao local service
	 */
	public vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietLaoLocalService getQlvtPhuongTienDangKyVietLaoLocalService() {
		return qlvtPhuongTienDangKyVietLaoLocalService;
	}

	/**
	 * Sets the qlvt phuong tien dang ky viet lao local service.
	 *
	 * @param qlvtPhuongTienDangKyVietLaoLocalService the qlvt phuong tien dang ky viet lao local service
	 */
	public void setQlvtPhuongTienDangKyVietLaoLocalService(
		vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietLaoLocalService qlvtPhuongTienDangKyVietLaoLocalService) {
		this.qlvtPhuongTienDangKyVietLaoLocalService = qlvtPhuongTienDangKyVietLaoLocalService;
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet lao persistence.
	 *
	 * @return the qlvt phuong tien dang ky viet lao persistence
	 */
	public QlvtPhuongTienDangKyVietLaoPersistence getQlvtPhuongTienDangKyVietLaoPersistence() {
		return qlvtPhuongTienDangKyVietLaoPersistence;
	}

	/**
	 * Sets the qlvt phuong tien dang ky viet lao persistence.
	 *
	 * @param qlvtPhuongTienDangKyVietLaoPersistence the qlvt phuong tien dang ky viet lao persistence
	 */
	public void setQlvtPhuongTienDangKyVietLaoPersistence(
		QlvtPhuongTienDangKyVietLaoPersistence qlvtPhuongTienDangKyVietLaoPersistence) {
		this.qlvtPhuongTienDangKyVietLaoPersistence = qlvtPhuongTienDangKyVietLaoPersistence;
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet lao finder.
	 *
	 * @return the qlvt phuong tien dang ky viet lao finder
	 */
	public QlvtPhuongTienDangKyVietLaoFinder getQlvtPhuongTienDangKyVietLaoFinder() {
		return qlvtPhuongTienDangKyVietLaoFinder;
	}

	/**
	 * Sets the qlvt phuong tien dang ky viet lao finder.
	 *
	 * @param qlvtPhuongTienDangKyVietLaoFinder the qlvt phuong tien dang ky viet lao finder
	 */
	public void setQlvtPhuongTienDangKyVietLaoFinder(
		QlvtPhuongTienDangKyVietLaoFinder qlvtPhuongTienDangKyVietLaoFinder) {
		this.qlvtPhuongTienDangKyVietLaoFinder = qlvtPhuongTienDangKyVietLaoFinder;
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet trung local service.
	 *
	 * @return the qlvt phuong tien dang ky viet trung local service
	 */
	public vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietTrungLocalService getQlvtPhuongTienDangKyVietTrungLocalService() {
		return qlvtPhuongTienDangKyVietTrungLocalService;
	}

	/**
	 * Sets the qlvt phuong tien dang ky viet trung local service.
	 *
	 * @param qlvtPhuongTienDangKyVietTrungLocalService the qlvt phuong tien dang ky viet trung local service
	 */
	public void setQlvtPhuongTienDangKyVietTrungLocalService(
		vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietTrungLocalService qlvtPhuongTienDangKyVietTrungLocalService) {
		this.qlvtPhuongTienDangKyVietTrungLocalService = qlvtPhuongTienDangKyVietTrungLocalService;
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet trung persistence.
	 *
	 * @return the qlvt phuong tien dang ky viet trung persistence
	 */
	public QlvtPhuongTienDangKyVietTrungPersistence getQlvtPhuongTienDangKyVietTrungPersistence() {
		return qlvtPhuongTienDangKyVietTrungPersistence;
	}

	/**
	 * Sets the qlvt phuong tien dang ky viet trung persistence.
	 *
	 * @param qlvtPhuongTienDangKyVietTrungPersistence the qlvt phuong tien dang ky viet trung persistence
	 */
	public void setQlvtPhuongTienDangKyVietTrungPersistence(
		QlvtPhuongTienDangKyVietTrungPersistence qlvtPhuongTienDangKyVietTrungPersistence) {
		this.qlvtPhuongTienDangKyVietTrungPersistence = qlvtPhuongTienDangKyVietTrungPersistence;
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet trung finder.
	 *
	 * @return the qlvt phuong tien dang ky viet trung finder
	 */
	public QlvtPhuongTienDangKyVietTrungFinder getQlvtPhuongTienDangKyVietTrungFinder() {
		return qlvtPhuongTienDangKyVietTrungFinder;
	}

	/**
	 * Sets the qlvt phuong tien dang ky viet trung finder.
	 *
	 * @param qlvtPhuongTienDangKyVietTrungFinder the qlvt phuong tien dang ky viet trung finder
	 */
	public void setQlvtPhuongTienDangKyVietTrungFinder(
		QlvtPhuongTienDangKyVietTrungFinder qlvtPhuongTienDangKyVietTrungFinder) {
		this.qlvtPhuongTienDangKyVietTrungFinder = qlvtPhuongTienDangKyVietTrungFinder;
	}

	/**
	 * Returns the tthc bieu mau ho so local service.
	 *
	 * @return the tthc bieu mau ho so local service
	 */
	public vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalService getTthcBieuMauHoSoLocalService() {
		return tthcBieuMauHoSoLocalService;
	}

	/**
	 * Sets the tthc bieu mau ho so local service.
	 *
	 * @param tthcBieuMauHoSoLocalService the tthc bieu mau ho so local service
	 */
	public void setTthcBieuMauHoSoLocalService(
		vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalService tthcBieuMauHoSoLocalService) {
		this.tthcBieuMauHoSoLocalService = tthcBieuMauHoSoLocalService;
	}

	/**
	 * Returns the tthc bieu mau ho so persistence.
	 *
	 * @return the tthc bieu mau ho so persistence
	 */
	public TthcBieuMauHoSoPersistence getTthcBieuMauHoSoPersistence() {
		return tthcBieuMauHoSoPersistence;
	}

	/**
	 * Sets the tthc bieu mau ho so persistence.
	 *
	 * @param tthcBieuMauHoSoPersistence the tthc bieu mau ho so persistence
	 */
	public void setTthcBieuMauHoSoPersistence(
		TthcBieuMauHoSoPersistence tthcBieuMauHoSoPersistence) {
		this.tthcBieuMauHoSoPersistence = tthcBieuMauHoSoPersistence;
	}

	/**
	 * Returns the tthc doi tuong thuc hien local service.
	 *
	 * @return the tthc doi tuong thuc hien local service
	 */
	public vn.dtt.duongbo.dao.common.service.TthcDoiTuongThucHienLocalService getTthcDoiTuongThucHienLocalService() {
		return tthcDoiTuongThucHienLocalService;
	}

	/**
	 * Sets the tthc doi tuong thuc hien local service.
	 *
	 * @param tthcDoiTuongThucHienLocalService the tthc doi tuong thuc hien local service
	 */
	public void setTthcDoiTuongThucHienLocalService(
		vn.dtt.duongbo.dao.common.service.TthcDoiTuongThucHienLocalService tthcDoiTuongThucHienLocalService) {
		this.tthcDoiTuongThucHienLocalService = tthcDoiTuongThucHienLocalService;
	}

	/**
	 * Returns the tthc doi tuong thuc hien persistence.
	 *
	 * @return the tthc doi tuong thuc hien persistence
	 */
	public TthcDoiTuongThucHienPersistence getTthcDoiTuongThucHienPersistence() {
		return tthcDoiTuongThucHienPersistence;
	}

	/**
	 * Sets the tthc doi tuong thuc hien persistence.
	 *
	 * @param tthcDoiTuongThucHienPersistence the tthc doi tuong thuc hien persistence
	 */
	public void setTthcDoiTuongThucHienPersistence(
		TthcDoiTuongThucHienPersistence tthcDoiTuongThucHienPersistence) {
		this.tthcDoiTuongThucHienPersistence = tthcDoiTuongThucHienPersistence;
	}

	/**
	 * Returns the tthc don vi thuc hien local service.
	 *
	 * @return the tthc don vi thuc hien local service
	 */
	public vn.dtt.duongbo.dao.common.service.TthcDonViThucHienLocalService getTthcDonViThucHienLocalService() {
		return tthcDonViThucHienLocalService;
	}

	/**
	 * Sets the tthc don vi thuc hien local service.
	 *
	 * @param tthcDonViThucHienLocalService the tthc don vi thuc hien local service
	 */
	public void setTthcDonViThucHienLocalService(
		vn.dtt.duongbo.dao.common.service.TthcDonViThucHienLocalService tthcDonViThucHienLocalService) {
		this.tthcDonViThucHienLocalService = tthcDonViThucHienLocalService;
	}

	/**
	 * Returns the tthc don vi thuc hien persistence.
	 *
	 * @return the tthc don vi thuc hien persistence
	 */
	public TthcDonViThucHienPersistence getTthcDonViThucHienPersistence() {
		return tthcDonViThucHienPersistence;
	}

	/**
	 * Sets the tthc don vi thuc hien persistence.
	 *
	 * @param tthcDonViThucHienPersistence the tthc don vi thuc hien persistence
	 */
	public void setTthcDonViThucHienPersistence(
		TthcDonViThucHienPersistence tthcDonViThucHienPersistence) {
		this.tthcDonViThucHienPersistence = tthcDonViThucHienPersistence;
	}

	/**
	 * Returns the tthc don vi thuc hien finder.
	 *
	 * @return the tthc don vi thuc hien finder
	 */
	public TthcDonViThucHienFinder getTthcDonViThucHienFinder() {
		return tthcDonViThucHienFinder;
	}

	/**
	 * Sets the tthc don vi thuc hien finder.
	 *
	 * @param tthcDonViThucHienFinder the tthc don vi thuc hien finder
	 */
	public void setTthcDonViThucHienFinder(
		TthcDonViThucHienFinder tthcDonViThucHienFinder) {
		this.tthcDonViThucHienFinder = tthcDonViThucHienFinder;
	}

	/**
	 * Returns the tthc ho so thu tuc local service.
	 *
	 * @return the tthc ho so thu tuc local service
	 */
	public vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalService getTthcHoSoThuTucLocalService() {
		return tthcHoSoThuTucLocalService;
	}

	/**
	 * Sets the tthc ho so thu tuc local service.
	 *
	 * @param tthcHoSoThuTucLocalService the tthc ho so thu tuc local service
	 */
	public void setTthcHoSoThuTucLocalService(
		vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalService tthcHoSoThuTucLocalService) {
		this.tthcHoSoThuTucLocalService = tthcHoSoThuTucLocalService;
	}

	/**
	 * Returns the tthc ho so thu tuc persistence.
	 *
	 * @return the tthc ho so thu tuc persistence
	 */
	public TthcHoSoThuTucPersistence getTthcHoSoThuTucPersistence() {
		return tthcHoSoThuTucPersistence;
	}

	/**
	 * Sets the tthc ho so thu tuc persistence.
	 *
	 * @param tthcHoSoThuTucPersistence the tthc ho so thu tuc persistence
	 */
	public void setTthcHoSoThuTucPersistence(
		TthcHoSoThuTucPersistence tthcHoSoThuTucPersistence) {
		this.tthcHoSoThuTucPersistence = tthcHoSoThuTucPersistence;
	}

	/**
	 * Returns the tthc ho so thu tuc finder.
	 *
	 * @return the tthc ho so thu tuc finder
	 */
	public TthcHoSoThuTucFinder getTthcHoSoThuTucFinder() {
		return tthcHoSoThuTucFinder;
	}

	/**
	 * Sets the tthc ho so thu tuc finder.
	 *
	 * @param tthcHoSoThuTucFinder the tthc ho so thu tuc finder
	 */
	public void setTthcHoSoThuTucFinder(
		TthcHoSoThuTucFinder tthcHoSoThuTucFinder) {
		this.tthcHoSoThuTucFinder = tthcHoSoThuTucFinder;
	}

	/**
	 * Returns the tthc linh vuc thu tuc local service.
	 *
	 * @return the tthc linh vuc thu tuc local service
	 */
	public vn.dtt.duongbo.dao.common.service.TthcLinhVucThuTucLocalService getTthcLinhVucThuTucLocalService() {
		return tthcLinhVucThuTucLocalService;
	}

	/**
	 * Sets the tthc linh vuc thu tuc local service.
	 *
	 * @param tthcLinhVucThuTucLocalService the tthc linh vuc thu tuc local service
	 */
	public void setTthcLinhVucThuTucLocalService(
		vn.dtt.duongbo.dao.common.service.TthcLinhVucThuTucLocalService tthcLinhVucThuTucLocalService) {
		this.tthcLinhVucThuTucLocalService = tthcLinhVucThuTucLocalService;
	}

	/**
	 * Returns the tthc linh vuc thu tuc persistence.
	 *
	 * @return the tthc linh vuc thu tuc persistence
	 */
	public TthcLinhVucThuTucPersistence getTthcLinhVucThuTucPersistence() {
		return tthcLinhVucThuTucPersistence;
	}

	/**
	 * Sets the tthc linh vuc thu tuc persistence.
	 *
	 * @param tthcLinhVucThuTucPersistence the tthc linh vuc thu tuc persistence
	 */
	public void setTthcLinhVucThuTucPersistence(
		TthcLinhVucThuTucPersistence tthcLinhVucThuTucPersistence) {
		this.tthcLinhVucThuTucPersistence = tthcLinhVucThuTucPersistence;
	}

	/**
	 * Returns the tthc noidung ho so local service.
	 *
	 * @return the tthc noidung ho so local service
	 */
	public vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalService getTthcNoidungHoSoLocalService() {
		return tthcNoidungHoSoLocalService;
	}

	/**
	 * Sets the tthc noidung ho so local service.
	 *
	 * @param tthcNoidungHoSoLocalService the tthc noidung ho so local service
	 */
	public void setTthcNoidungHoSoLocalService(
		vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalService tthcNoidungHoSoLocalService) {
		this.tthcNoidungHoSoLocalService = tthcNoidungHoSoLocalService;
	}

	/**
	 * Returns the tthc noidung ho so persistence.
	 *
	 * @return the tthc noidung ho so persistence
	 */
	public TthcNoidungHoSoPersistence getTthcNoidungHoSoPersistence() {
		return tthcNoidungHoSoPersistence;
	}

	/**
	 * Sets the tthc noidung ho so persistence.
	 *
	 * @param tthcNoidungHoSoPersistence the tthc noidung ho so persistence
	 */
	public void setTthcNoidungHoSoPersistence(
		TthcNoidungHoSoPersistence tthcNoidungHoSoPersistence) {
		this.tthcNoidungHoSoPersistence = tthcNoidungHoSoPersistence;
	}

	/**
	 * Returns the tthc noidung ho so finder.
	 *
	 * @return the tthc noidung ho so finder
	 */
	public TthcNoidungHoSoFinder getTthcNoidungHoSoFinder() {
		return tthcNoidungHoSoFinder;
	}

	/**
	 * Sets the tthc noidung ho so finder.
	 *
	 * @param tthcNoidungHoSoFinder the tthc noidung ho so finder
	 */
	public void setTthcNoidungHoSoFinder(
		TthcNoidungHoSoFinder tthcNoidungHoSoFinder) {
		this.tthcNoidungHoSoFinder = tthcNoidungHoSoFinder;
	}

	/**
	 * Returns the tthc noidung ho so tmp local service.
	 *
	 * @return the tthc noidung ho so tmp local service
	 */
	public vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoTmpLocalService getTthcNoidungHoSoTmpLocalService() {
		return tthcNoidungHoSoTmpLocalService;
	}

	/**
	 * Sets the tthc noidung ho so tmp local service.
	 *
	 * @param tthcNoidungHoSoTmpLocalService the tthc noidung ho so tmp local service
	 */
	public void setTthcNoidungHoSoTmpLocalService(
		vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoTmpLocalService tthcNoidungHoSoTmpLocalService) {
		this.tthcNoidungHoSoTmpLocalService = tthcNoidungHoSoTmpLocalService;
	}

	/**
	 * Returns the tthc noidung ho so tmp persistence.
	 *
	 * @return the tthc noidung ho so tmp persistence
	 */
	public TthcNoidungHoSoTmpPersistence getTthcNoidungHoSoTmpPersistence() {
		return tthcNoidungHoSoTmpPersistence;
	}

	/**
	 * Sets the tthc noidung ho so tmp persistence.
	 *
	 * @param tthcNoidungHoSoTmpPersistence the tthc noidung ho so tmp persistence
	 */
	public void setTthcNoidungHoSoTmpPersistence(
		TthcNoidungHoSoTmpPersistence tthcNoidungHoSoTmpPersistence) {
		this.tthcNoidungHoSoTmpPersistence = tthcNoidungHoSoTmpPersistence;
	}

	/**
	 * Returns the tthc phan nhom ho so local service.
	 *
	 * @return the tthc phan nhom ho so local service
	 */
	public vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoLocalService getTthcPhanNhomHoSoLocalService() {
		return tthcPhanNhomHoSoLocalService;
	}

	/**
	 * Sets the tthc phan nhom ho so local service.
	 *
	 * @param tthcPhanNhomHoSoLocalService the tthc phan nhom ho so local service
	 */
	public void setTthcPhanNhomHoSoLocalService(
		vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoLocalService tthcPhanNhomHoSoLocalService) {
		this.tthcPhanNhomHoSoLocalService = tthcPhanNhomHoSoLocalService;
	}

	/**
	 * Returns the tthc phan nhom ho so persistence.
	 *
	 * @return the tthc phan nhom ho so persistence
	 */
	public TthcPhanNhomHoSoPersistence getTthcPhanNhomHoSoPersistence() {
		return tthcPhanNhomHoSoPersistence;
	}

	/**
	 * Sets the tthc phan nhom ho so persistence.
	 *
	 * @param tthcPhanNhomHoSoPersistence the tthc phan nhom ho so persistence
	 */
	public void setTthcPhanNhomHoSoPersistence(
		TthcPhanNhomHoSoPersistence tthcPhanNhomHoSoPersistence) {
		this.tthcPhanNhomHoSoPersistence = tthcPhanNhomHoSoPersistence;
	}

	/**
	 * Returns the tthc phan nhom ho so finder.
	 *
	 * @return the tthc phan nhom ho so finder
	 */
	public TthcPhanNhomHoSoFinder getTthcPhanNhomHoSoFinder() {
		return tthcPhanNhomHoSoFinder;
	}

	/**
	 * Sets the tthc phan nhom ho so finder.
	 *
	 * @param tthcPhanNhomHoSoFinder the tthc phan nhom ho so finder
	 */
	public void setTthcPhanNhomHoSoFinder(
		TthcPhanNhomHoSoFinder tthcPhanNhomHoSoFinder) {
		this.tthcPhanNhomHoSoFinder = tthcPhanNhomHoSoFinder;
	}

	/**
	 * Returns the tthc phan nhom ho so vai tro local service.
	 *
	 * @return the tthc phan nhom ho so vai tro local service
	 */
	public vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoVaiTroLocalService getTthcPhanNhomHoSoVaiTroLocalService() {
		return tthcPhanNhomHoSoVaiTroLocalService;
	}

	/**
	 * Sets the tthc phan nhom ho so vai tro local service.
	 *
	 * @param tthcPhanNhomHoSoVaiTroLocalService the tthc phan nhom ho so vai tro local service
	 */
	public void setTthcPhanNhomHoSoVaiTroLocalService(
		vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoVaiTroLocalService tthcPhanNhomHoSoVaiTroLocalService) {
		this.tthcPhanNhomHoSoVaiTroLocalService = tthcPhanNhomHoSoVaiTroLocalService;
	}

	/**
	 * Returns the tthc phan nhom ho so vai tro persistence.
	 *
	 * @return the tthc phan nhom ho so vai tro persistence
	 */
	public TthcPhanNhomHoSoVaiTroPersistence getTthcPhanNhomHoSoVaiTroPersistence() {
		return tthcPhanNhomHoSoVaiTroPersistence;
	}

	/**
	 * Sets the tthc phan nhom ho so vai tro persistence.
	 *
	 * @param tthcPhanNhomHoSoVaiTroPersistence the tthc phan nhom ho so vai tro persistence
	 */
	public void setTthcPhanNhomHoSoVaiTroPersistence(
		TthcPhanNhomHoSoVaiTroPersistence tthcPhanNhomHoSoVaiTroPersistence) {
		this.tthcPhanNhomHoSoVaiTroPersistence = tthcPhanNhomHoSoVaiTroPersistence;
	}

	/**
	 * Returns the tthc thanh phan ho so local service.
	 *
	 * @return the tthc thanh phan ho so local service
	 */
	public vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalService getTthcThanhPhanHoSoLocalService() {
		return tthcThanhPhanHoSoLocalService;
	}

	/**
	 * Sets the tthc thanh phan ho so local service.
	 *
	 * @param tthcThanhPhanHoSoLocalService the tthc thanh phan ho so local service
	 */
	public void setTthcThanhPhanHoSoLocalService(
		vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalService tthcThanhPhanHoSoLocalService) {
		this.tthcThanhPhanHoSoLocalService = tthcThanhPhanHoSoLocalService;
	}

	/**
	 * Returns the tthc thanh phan ho so persistence.
	 *
	 * @return the tthc thanh phan ho so persistence
	 */
	public TthcThanhPhanHoSoPersistence getTthcThanhPhanHoSoPersistence() {
		return tthcThanhPhanHoSoPersistence;
	}

	/**
	 * Sets the tthc thanh phan ho so persistence.
	 *
	 * @param tthcThanhPhanHoSoPersistence the tthc thanh phan ho so persistence
	 */
	public void setTthcThanhPhanHoSoPersistence(
		TthcThanhPhanHoSoPersistence tthcThanhPhanHoSoPersistence) {
		this.tthcThanhPhanHoSoPersistence = tthcThanhPhanHoSoPersistence;
	}

	/**
	 * Returns the tthc thanh phan ho so finder.
	 *
	 * @return the tthc thanh phan ho so finder
	 */
	public TthcThanhPhanHoSoFinder getTthcThanhPhanHoSoFinder() {
		return tthcThanhPhanHoSoFinder;
	}

	/**
	 * Sets the tthc thanh phan ho so finder.
	 *
	 * @param tthcThanhPhanHoSoFinder the tthc thanh phan ho so finder
	 */
	public void setTthcThanhPhanHoSoFinder(
		TthcThanhPhanHoSoFinder tthcThanhPhanHoSoFinder) {
		this.tthcThanhPhanHoSoFinder = tthcThanhPhanHoSoFinder;
	}

	/**
	 * Returns the tthc thanh phan ho so bieu mau local service.
	 *
	 * @return the tthc thanh phan ho so bieu mau local service
	 */
	public vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalService getTthcThanhPhanHoSoBieuMauLocalService() {
		return tthcThanhPhanHoSoBieuMauLocalService;
	}

	/**
	 * Sets the tthc thanh phan ho so bieu mau local service.
	 *
	 * @param tthcThanhPhanHoSoBieuMauLocalService the tthc thanh phan ho so bieu mau local service
	 */
	public void setTthcThanhPhanHoSoBieuMauLocalService(
		vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalService tthcThanhPhanHoSoBieuMauLocalService) {
		this.tthcThanhPhanHoSoBieuMauLocalService = tthcThanhPhanHoSoBieuMauLocalService;
	}

	/**
	 * Returns the tthc thanh phan ho so bieu mau persistence.
	 *
	 * @return the tthc thanh phan ho so bieu mau persistence
	 */
	public TthcThanhPhanHoSoBieuMauPersistence getTthcThanhPhanHoSoBieuMauPersistence() {
		return tthcThanhPhanHoSoBieuMauPersistence;
	}

	/**
	 * Sets the tthc thanh phan ho so bieu mau persistence.
	 *
	 * @param tthcThanhPhanHoSoBieuMauPersistence the tthc thanh phan ho so bieu mau persistence
	 */
	public void setTthcThanhPhanHoSoBieuMauPersistence(
		TthcThanhPhanHoSoBieuMauPersistence tthcThanhPhanHoSoBieuMauPersistence) {
		this.tthcThanhPhanHoSoBieuMauPersistence = tthcThanhPhanHoSoBieuMauPersistence;
	}

	/**
	 * Returns the tthc thong bao xu ly local service.
	 *
	 * @return the tthc thong bao xu ly local service
	 */
	public vn.dtt.duongbo.dao.common.service.TthcThongBaoXuLyLocalService getTthcThongBaoXuLyLocalService() {
		return tthcThongBaoXuLyLocalService;
	}

	/**
	 * Sets the tthc thong bao xu ly local service.
	 *
	 * @param tthcThongBaoXuLyLocalService the tthc thong bao xu ly local service
	 */
	public void setTthcThongBaoXuLyLocalService(
		vn.dtt.duongbo.dao.common.service.TthcThongBaoXuLyLocalService tthcThongBaoXuLyLocalService) {
		this.tthcThongBaoXuLyLocalService = tthcThongBaoXuLyLocalService;
	}

	/**
	 * Returns the tthc thong bao xu ly persistence.
	 *
	 * @return the tthc thong bao xu ly persistence
	 */
	public TthcThongBaoXuLyPersistence getTthcThongBaoXuLyPersistence() {
		return tthcThongBaoXuLyPersistence;
	}

	/**
	 * Sets the tthc thong bao xu ly persistence.
	 *
	 * @param tthcThongBaoXuLyPersistence the tthc thong bao xu ly persistence
	 */
	public void setTthcThongBaoXuLyPersistence(
		TthcThongBaoXuLyPersistence tthcThongBaoXuLyPersistence) {
		this.tthcThongBaoXuLyPersistence = tthcThongBaoXuLyPersistence;
	}

	/**
	 * Returns the tthc thu tuc hanh chinh local service.
	 *
	 * @return the tthc thu tuc hanh chinh local service
	 */
	public vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalService getTthcThuTucHanhChinhLocalService() {
		return tthcThuTucHanhChinhLocalService;
	}

	/**
	 * Sets the tthc thu tuc hanh chinh local service.
	 *
	 * @param tthcThuTucHanhChinhLocalService the tthc thu tuc hanh chinh local service
	 */
	public void setTthcThuTucHanhChinhLocalService(
		vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalService tthcThuTucHanhChinhLocalService) {
		this.tthcThuTucHanhChinhLocalService = tthcThuTucHanhChinhLocalService;
	}

	/**
	 * Returns the tthc thu tuc hanh chinh persistence.
	 *
	 * @return the tthc thu tuc hanh chinh persistence
	 */
	public TthcThuTucHanhChinhPersistence getTthcThuTucHanhChinhPersistence() {
		return tthcThuTucHanhChinhPersistence;
	}

	/**
	 * Sets the tthc thu tuc hanh chinh persistence.
	 *
	 * @param tthcThuTucHanhChinhPersistence the tthc thu tuc hanh chinh persistence
	 */
	public void setTthcThuTucHanhChinhPersistence(
		TthcThuTucHanhChinhPersistence tthcThuTucHanhChinhPersistence) {
		this.tthcThuTucHanhChinhPersistence = tthcThuTucHanhChinhPersistence;
	}

	/**
	 * Returns the tthc trang thai ho so local service.
	 *
	 * @return the tthc trang thai ho so local service
	 */
	public vn.dtt.duongbo.dao.common.service.TthcTrangThaiHoSoLocalService getTthcTrangThaiHoSoLocalService() {
		return tthcTrangThaiHoSoLocalService;
	}

	/**
	 * Sets the tthc trang thai ho so local service.
	 *
	 * @param tthcTrangThaiHoSoLocalService the tthc trang thai ho so local service
	 */
	public void setTthcTrangThaiHoSoLocalService(
		vn.dtt.duongbo.dao.common.service.TthcTrangThaiHoSoLocalService tthcTrangThaiHoSoLocalService) {
		this.tthcTrangThaiHoSoLocalService = tthcTrangThaiHoSoLocalService;
	}

	/**
	 * Returns the tthc trang thai ho so remote service.
	 *
	 * @return the tthc trang thai ho so remote service
	 */
	public vn.dtt.duongbo.dao.common.service.TthcTrangThaiHoSoService getTthcTrangThaiHoSoService() {
		return tthcTrangThaiHoSoService;
	}

	/**
	 * Sets the tthc trang thai ho so remote service.
	 *
	 * @param tthcTrangThaiHoSoService the tthc trang thai ho so remote service
	 */
	public void setTthcTrangThaiHoSoService(
		vn.dtt.duongbo.dao.common.service.TthcTrangThaiHoSoService tthcTrangThaiHoSoService) {
		this.tthcTrangThaiHoSoService = tthcTrangThaiHoSoService;
	}

	/**
	 * Returns the tthc trang thai ho so persistence.
	 *
	 * @return the tthc trang thai ho so persistence
	 */
	public TthcTrangThaiHoSoPersistence getTthcTrangThaiHoSoPersistence() {
		return tthcTrangThaiHoSoPersistence;
	}

	/**
	 * Sets the tthc trang thai ho so persistence.
	 *
	 * @param tthcTrangThaiHoSoPersistence the tthc trang thai ho so persistence
	 */
	public void setTthcTrangThaiHoSoPersistence(
		TthcTrangThaiHoSoPersistence tthcTrangThaiHoSoPersistence) {
		this.tthcTrangThaiHoSoPersistence = tthcTrangThaiHoSoPersistence;
	}

	/**
	 * Returns the tthc trang thai ho so finder.
	 *
	 * @return the tthc trang thai ho so finder
	 */
	public TthcTrangThaiHoSoFinder getTthcTrangThaiHoSoFinder() {
		return tthcTrangThaiHoSoFinder;
	}

	/**
	 * Sets the tthc trang thai ho so finder.
	 *
	 * @param tthcTrangThaiHoSoFinder the tthc trang thai ho so finder
	 */
	public void setTthcTrangThaiHoSoFinder(
		TthcTrangThaiHoSoFinder tthcTrangThaiHoSoFinder) {
		this.tthcTrangThaiHoSoFinder = tthcTrangThaiHoSoFinder;
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

		PersistedModelLocalServiceRegistryUtil.register("vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung",
			qlvtPhuongTienDangKyVietTrungLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung");
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
		return QlvtPhuongTienDangKyVietTrung.class;
	}

	protected String getModelClassName() {
		return QlvtPhuongTienDangKyVietTrung.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = qlvtPhuongTienDangKyVietTrungPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = vn.dtt.duongbo.dao.common.service.DmDataGroupLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.DmDataGroupLocalService dmDataGroupLocalService;
	@BeanReference(type = DmDataGroupPersistence.class)
	protected DmDataGroupPersistence dmDataGroupPersistence;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.DmDataItemLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.DmDataItemLocalService dmDataItemLocalService;
	@BeanReference(type = DmDataItemPersistence.class)
	protected DmDataItemPersistence dmDataItemPersistence;
	@BeanReference(type = DmDataItemFinder.class)
	protected DmDataItemFinder dmDataItemFinder;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.DmDataVersionLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.DmDataVersionLocalService dmDataVersionLocalService;
	@BeanReference(type = DmDataVersionPersistence.class)
	protected DmDataVersionPersistence dmDataVersionPersistence;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.DmMetaDataLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.DmMetaDataLocalService dmMetaDataLocalService;
	@BeanReference(type = DmMetaDataPersistence.class)
	protected DmMetaDataPersistence dmMetaDataPersistence;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.QlvtDiemDungDangKyVietCamLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.QlvtDiemDungDangKyVietCamLocalService qlvtDiemDungDangKyVietCamLocalService;
	@BeanReference(type = QlvtDiemDungDangKyVietCamPersistence.class)
	protected QlvtDiemDungDangKyVietCamPersistence qlvtDiemDungDangKyVietCamPersistence;
	@BeanReference(type = QlvtDiemDungDangKyVietCamFinder.class)
	protected QlvtDiemDungDangKyVietCamFinder qlvtDiemDungDangKyVietCamFinder;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.QlvtDiemDungDangKyVietLaoLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.QlvtDiemDungDangKyVietLaoLocalService qlvtDiemDungDangKyVietLaoLocalService;
	@BeanReference(type = QlvtDiemDungDangKyVietLaoPersistence.class)
	protected QlvtDiemDungDangKyVietLaoPersistence qlvtDiemDungDangKyVietLaoPersistence;
	@BeanReference(type = QlvtDiemDungDangKyVietLaoFinder.class)
	protected QlvtDiemDungDangKyVietLaoFinder qlvtDiemDungDangKyVietLaoFinder;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.QlvtDiemDungDangKyVietTrungLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.QlvtDiemDungDangKyVietTrungLocalService qlvtDiemDungDangKyVietTrungLocalService;
	@BeanReference(type = QlvtDiemDungDangKyVietTrungPersistence.class)
	protected QlvtDiemDungDangKyVietTrungPersistence qlvtDiemDungDangKyVietTrungPersistence;
	@BeanReference(type = QlvtDiemDungDangKyVietTrungFinder.class)
	protected QlvtDiemDungDangKyVietTrungFinder qlvtDiemDungDangKyVietTrungFinder;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.QlvtLoaiHinhHoatDongDnLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.QlvtLoaiHinhHoatDongDnLocalService qlvtLoaiHinhHoatDongDnLocalService;
	@BeanReference(type = QlvtLoaiHinhHoatDongDnPersistence.class)
	protected QlvtLoaiHinhHoatDongDnPersistence qlvtLoaiHinhHoatDongDnPersistence;
	@BeanReference(type = QlvtLoaiHinhHoatDongDnFinder.class)
	protected QlvtLoaiHinhHoatDongDnFinder qlvtLoaiHinhHoatDongDnFinder;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.QlvtPhuongTienCapBienHieuLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.QlvtPhuongTienCapBienHieuLocalService qlvtPhuongTienCapBienHieuLocalService;
	@BeanReference(type = QlvtPhuongTienCapBienHieuPersistence.class)
	protected QlvtPhuongTienCapBienHieuPersistence qlvtPhuongTienCapBienHieuPersistence;
	@BeanReference(type = QlvtPhuongTienCapBienHieuFinder.class)
	protected QlvtPhuongTienCapBienHieuFinder qlvtPhuongTienCapBienHieuFinder;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.QlvtPhuongTienCapPhuHieuLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.QlvtPhuongTienCapPhuHieuLocalService qlvtPhuongTienCapPhuHieuLocalService;
	@BeanReference(type = QlvtPhuongTienCapPhuHieuPersistence.class)
	protected QlvtPhuongTienCapPhuHieuPersistence qlvtPhuongTienCapPhuHieuPersistence;
	@BeanReference(type = QlvtPhuongTienCapPhuHieuFinder.class)
	protected QlvtPhuongTienCapPhuHieuFinder qlvtPhuongTienCapPhuHieuFinder;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietCamLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietCamLocalService qlvtPhuongTienDangKyVietCamLocalService;
	@BeanReference(type = QlvtPhuongTienDangKyVietCamPersistence.class)
	protected QlvtPhuongTienDangKyVietCamPersistence qlvtPhuongTienDangKyVietCamPersistence;
	@BeanReference(type = QlvtPhuongTienDangKyVietCamFinder.class)
	protected QlvtPhuongTienDangKyVietCamFinder qlvtPhuongTienDangKyVietCamFinder;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietLaoLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietLaoLocalService qlvtPhuongTienDangKyVietLaoLocalService;
	@BeanReference(type = QlvtPhuongTienDangKyVietLaoPersistence.class)
	protected QlvtPhuongTienDangKyVietLaoPersistence qlvtPhuongTienDangKyVietLaoPersistence;
	@BeanReference(type = QlvtPhuongTienDangKyVietLaoFinder.class)
	protected QlvtPhuongTienDangKyVietLaoFinder qlvtPhuongTienDangKyVietLaoFinder;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietTrungLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietTrungLocalService qlvtPhuongTienDangKyVietTrungLocalService;
	@BeanReference(type = QlvtPhuongTienDangKyVietTrungPersistence.class)
	protected QlvtPhuongTienDangKyVietTrungPersistence qlvtPhuongTienDangKyVietTrungPersistence;
	@BeanReference(type = QlvtPhuongTienDangKyVietTrungFinder.class)
	protected QlvtPhuongTienDangKyVietTrungFinder qlvtPhuongTienDangKyVietTrungFinder;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalService tthcBieuMauHoSoLocalService;
	@BeanReference(type = TthcBieuMauHoSoPersistence.class)
	protected TthcBieuMauHoSoPersistence tthcBieuMauHoSoPersistence;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.TthcDoiTuongThucHienLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.TthcDoiTuongThucHienLocalService tthcDoiTuongThucHienLocalService;
	@BeanReference(type = TthcDoiTuongThucHienPersistence.class)
	protected TthcDoiTuongThucHienPersistence tthcDoiTuongThucHienPersistence;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.TthcDonViThucHienLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.TthcDonViThucHienLocalService tthcDonViThucHienLocalService;
	@BeanReference(type = TthcDonViThucHienPersistence.class)
	protected TthcDonViThucHienPersistence tthcDonViThucHienPersistence;
	@BeanReference(type = TthcDonViThucHienFinder.class)
	protected TthcDonViThucHienFinder tthcDonViThucHienFinder;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalService tthcHoSoThuTucLocalService;
	@BeanReference(type = TthcHoSoThuTucPersistence.class)
	protected TthcHoSoThuTucPersistence tthcHoSoThuTucPersistence;
	@BeanReference(type = TthcHoSoThuTucFinder.class)
	protected TthcHoSoThuTucFinder tthcHoSoThuTucFinder;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.TthcLinhVucThuTucLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.TthcLinhVucThuTucLocalService tthcLinhVucThuTucLocalService;
	@BeanReference(type = TthcLinhVucThuTucPersistence.class)
	protected TthcLinhVucThuTucPersistence tthcLinhVucThuTucPersistence;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalService tthcNoidungHoSoLocalService;
	@BeanReference(type = TthcNoidungHoSoPersistence.class)
	protected TthcNoidungHoSoPersistence tthcNoidungHoSoPersistence;
	@BeanReference(type = TthcNoidungHoSoFinder.class)
	protected TthcNoidungHoSoFinder tthcNoidungHoSoFinder;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoTmpLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoTmpLocalService tthcNoidungHoSoTmpLocalService;
	@BeanReference(type = TthcNoidungHoSoTmpPersistence.class)
	protected TthcNoidungHoSoTmpPersistence tthcNoidungHoSoTmpPersistence;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoLocalService tthcPhanNhomHoSoLocalService;
	@BeanReference(type = TthcPhanNhomHoSoPersistence.class)
	protected TthcPhanNhomHoSoPersistence tthcPhanNhomHoSoPersistence;
	@BeanReference(type = TthcPhanNhomHoSoFinder.class)
	protected TthcPhanNhomHoSoFinder tthcPhanNhomHoSoFinder;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoVaiTroLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoVaiTroLocalService tthcPhanNhomHoSoVaiTroLocalService;
	@BeanReference(type = TthcPhanNhomHoSoVaiTroPersistence.class)
	protected TthcPhanNhomHoSoVaiTroPersistence tthcPhanNhomHoSoVaiTroPersistence;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalService tthcThanhPhanHoSoLocalService;
	@BeanReference(type = TthcThanhPhanHoSoPersistence.class)
	protected TthcThanhPhanHoSoPersistence tthcThanhPhanHoSoPersistence;
	@BeanReference(type = TthcThanhPhanHoSoFinder.class)
	protected TthcThanhPhanHoSoFinder tthcThanhPhanHoSoFinder;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalService tthcThanhPhanHoSoBieuMauLocalService;
	@BeanReference(type = TthcThanhPhanHoSoBieuMauPersistence.class)
	protected TthcThanhPhanHoSoBieuMauPersistence tthcThanhPhanHoSoBieuMauPersistence;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.TthcThongBaoXuLyLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.TthcThongBaoXuLyLocalService tthcThongBaoXuLyLocalService;
	@BeanReference(type = TthcThongBaoXuLyPersistence.class)
	protected TthcThongBaoXuLyPersistence tthcThongBaoXuLyPersistence;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalService tthcThuTucHanhChinhLocalService;
	@BeanReference(type = TthcThuTucHanhChinhPersistence.class)
	protected TthcThuTucHanhChinhPersistence tthcThuTucHanhChinhPersistence;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.TthcTrangThaiHoSoLocalService.class)
	protected vn.dtt.duongbo.dao.common.service.TthcTrangThaiHoSoLocalService tthcTrangThaiHoSoLocalService;
	@BeanReference(type = vn.dtt.duongbo.dao.common.service.TthcTrangThaiHoSoService.class)
	protected vn.dtt.duongbo.dao.common.service.TthcTrangThaiHoSoService tthcTrangThaiHoSoService;
	@BeanReference(type = TthcTrangThaiHoSoPersistence.class)
	protected TthcTrangThaiHoSoPersistence tthcTrangThaiHoSoPersistence;
	@BeanReference(type = TthcTrangThaiHoSoFinder.class)
	protected TthcTrangThaiHoSoFinder tthcTrangThaiHoSoFinder;
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
	private QlvtPhuongTienDangKyVietTrungLocalServiceClpInvoker _clpInvoker = new QlvtPhuongTienDangKyVietTrungLocalServiceClpInvoker();
}