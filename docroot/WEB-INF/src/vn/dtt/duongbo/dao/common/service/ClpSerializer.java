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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import vn.dtt.duongbo.dao.common.model.DmDataGroupClp;
import vn.dtt.duongbo.dao.common.model.DmDataItemClp;
import vn.dtt.duongbo.dao.common.model.DmDataVersionClp;
import vn.dtt.duongbo.dao.common.model.DmMetaDataClp;
import vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCamClp;
import vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLaoClp;
import vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrungClp;
import vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDnClp;
import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapBienHieuClp;
import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieuClp;
import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCamClp;
import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLaoClp;
import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrungClp;
import vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSoClp;
import vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHienClp;
import vn.dtt.duongbo.dao.common.model.TthcDonViThucHienClp;
import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTucClp;
import vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTucClp;
import vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoClp;
import vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmpClp;
import vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoClp;
import vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoVaiTroClp;
import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMauClp;
import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoClp;
import vn.dtt.duongbo.dao.common.model.TthcThongBaoXuLyClp;
import vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinhClp;
import vn.dtt.duongbo.dao.common.model.TthcTrangThaiHoSoClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author win_64
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"DuongBoDoanhNghiepApp-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"DuongBoDoanhNghiepApp-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "DuongBoDoanhNghiepApp-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(DmDataGroupClp.class.getName())) {
			return translateInputDmDataGroup(oldModel);
		}

		if (oldModelClassName.equals(DmDataItemClp.class.getName())) {
			return translateInputDmDataItem(oldModel);
		}

		if (oldModelClassName.equals(DmDataVersionClp.class.getName())) {
			return translateInputDmDataVersion(oldModel);
		}

		if (oldModelClassName.equals(DmMetaDataClp.class.getName())) {
			return translateInputDmMetaData(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtDiemDungDangKyVietCamClp.class.getName())) {
			return translateInputQlvtDiemDungDangKyVietCam(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtDiemDungDangKyVietLaoClp.class.getName())) {
			return translateInputQlvtDiemDungDangKyVietLao(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtDiemDungDangKyVietTrungClp.class.getName())) {
			return translateInputQlvtDiemDungDangKyVietTrung(oldModel);
		}

		if (oldModelClassName.equals(QlvtLoaiHinhHoatDongDnClp.class.getName())) {
			return translateInputQlvtLoaiHinhHoatDongDn(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtPhuongTienCapBienHieuClp.class.getName())) {
			return translateInputQlvtPhuongTienCapBienHieu(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtPhuongTienCapPhuHieuClp.class.getName())) {
			return translateInputQlvtPhuongTienCapPhuHieu(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtPhuongTienDangKyVietCamClp.class.getName())) {
			return translateInputQlvtPhuongTienDangKyVietCam(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtPhuongTienDangKyVietLaoClp.class.getName())) {
			return translateInputQlvtPhuongTienDangKyVietLao(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtPhuongTienDangKyVietTrungClp.class.getName())) {
			return translateInputQlvtPhuongTienDangKyVietTrung(oldModel);
		}

		if (oldModelClassName.equals(TthcBieuMauHoSoClp.class.getName())) {
			return translateInputTthcBieuMauHoSo(oldModel);
		}

		if (oldModelClassName.equals(TthcDoiTuongThucHienClp.class.getName())) {
			return translateInputTthcDoiTuongThucHien(oldModel);
		}

		if (oldModelClassName.equals(TthcDonViThucHienClp.class.getName())) {
			return translateInputTthcDonViThucHien(oldModel);
		}

		if (oldModelClassName.equals(TthcHoSoThuTucClp.class.getName())) {
			return translateInputTthcHoSoThuTuc(oldModel);
		}

		if (oldModelClassName.equals(TthcLinhVucThuTucClp.class.getName())) {
			return translateInputTthcLinhVucThuTuc(oldModel);
		}

		if (oldModelClassName.equals(TthcNoidungHoSoClp.class.getName())) {
			return translateInputTthcNoidungHoSo(oldModel);
		}

		if (oldModelClassName.equals(TthcNoidungHoSoTmpClp.class.getName())) {
			return translateInputTthcNoidungHoSoTmp(oldModel);
		}

		if (oldModelClassName.equals(TthcPhanNhomHoSoClp.class.getName())) {
			return translateInputTthcPhanNhomHoSo(oldModel);
		}

		if (oldModelClassName.equals(TthcPhanNhomHoSoVaiTroClp.class.getName())) {
			return translateInputTthcPhanNhomHoSoVaiTro(oldModel);
		}

		if (oldModelClassName.equals(TthcThanhPhanHoSoClp.class.getName())) {
			return translateInputTthcThanhPhanHoSo(oldModel);
		}

		if (oldModelClassName.equals(
					TthcThanhPhanHoSoBieuMauClp.class.getName())) {
			return translateInputTthcThanhPhanHoSoBieuMau(oldModel);
		}

		if (oldModelClassName.equals(TthcThongBaoXuLyClp.class.getName())) {
			return translateInputTthcThongBaoXuLy(oldModel);
		}

		if (oldModelClassName.equals(TthcThuTucHanhChinhClp.class.getName())) {
			return translateInputTthcThuTucHanhChinh(oldModel);
		}

		if (oldModelClassName.equals(TthcTrangThaiHoSoClp.class.getName())) {
			return translateInputTthcTrangThaiHoSo(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputDmDataGroup(BaseModel<?> oldModel) {
		DmDataGroupClp oldClpModel = (DmDataGroupClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmDataGroupRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmDataItem(BaseModel<?> oldModel) {
		DmDataItemClp oldClpModel = (DmDataItemClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmDataItemRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmDataVersion(BaseModel<?> oldModel) {
		DmDataVersionClp oldClpModel = (DmDataVersionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmDataVersionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmMetaData(BaseModel<?> oldModel) {
		DmMetaDataClp oldClpModel = (DmMetaDataClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmMetaDataRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtDiemDungDangKyVietCam(
		BaseModel<?> oldModel) {
		QlvtDiemDungDangKyVietCamClp oldClpModel = (QlvtDiemDungDangKyVietCamClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtDiemDungDangKyVietCamRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtDiemDungDangKyVietLao(
		BaseModel<?> oldModel) {
		QlvtDiemDungDangKyVietLaoClp oldClpModel = (QlvtDiemDungDangKyVietLaoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtDiemDungDangKyVietLaoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtDiemDungDangKyVietTrung(
		BaseModel<?> oldModel) {
		QlvtDiemDungDangKyVietTrungClp oldClpModel = (QlvtDiemDungDangKyVietTrungClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtDiemDungDangKyVietTrungRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtLoaiHinhHoatDongDn(
		BaseModel<?> oldModel) {
		QlvtLoaiHinhHoatDongDnClp oldClpModel = (QlvtLoaiHinhHoatDongDnClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtLoaiHinhHoatDongDnRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtPhuongTienCapBienHieu(
		BaseModel<?> oldModel) {
		QlvtPhuongTienCapBienHieuClp oldClpModel = (QlvtPhuongTienCapBienHieuClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtPhuongTienCapBienHieuRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtPhuongTienCapPhuHieu(
		BaseModel<?> oldModel) {
		QlvtPhuongTienCapPhuHieuClp oldClpModel = (QlvtPhuongTienCapPhuHieuClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtPhuongTienCapPhuHieuRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtPhuongTienDangKyVietCam(
		BaseModel<?> oldModel) {
		QlvtPhuongTienDangKyVietCamClp oldClpModel = (QlvtPhuongTienDangKyVietCamClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtPhuongTienDangKyVietCamRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtPhuongTienDangKyVietLao(
		BaseModel<?> oldModel) {
		QlvtPhuongTienDangKyVietLaoClp oldClpModel = (QlvtPhuongTienDangKyVietLaoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtPhuongTienDangKyVietLaoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtPhuongTienDangKyVietTrung(
		BaseModel<?> oldModel) {
		QlvtPhuongTienDangKyVietTrungClp oldClpModel = (QlvtPhuongTienDangKyVietTrungClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtPhuongTienDangKyVietTrungRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcBieuMauHoSo(BaseModel<?> oldModel) {
		TthcBieuMauHoSoClp oldClpModel = (TthcBieuMauHoSoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcBieuMauHoSoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcDoiTuongThucHien(
		BaseModel<?> oldModel) {
		TthcDoiTuongThucHienClp oldClpModel = (TthcDoiTuongThucHienClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcDoiTuongThucHienRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcDonViThucHien(BaseModel<?> oldModel) {
		TthcDonViThucHienClp oldClpModel = (TthcDonViThucHienClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcDonViThucHienRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcHoSoThuTuc(BaseModel<?> oldModel) {
		TthcHoSoThuTucClp oldClpModel = (TthcHoSoThuTucClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcHoSoThuTucRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcLinhVucThuTuc(BaseModel<?> oldModel) {
		TthcLinhVucThuTucClp oldClpModel = (TthcLinhVucThuTucClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcLinhVucThuTucRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcNoidungHoSo(BaseModel<?> oldModel) {
		TthcNoidungHoSoClp oldClpModel = (TthcNoidungHoSoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcNoidungHoSoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcNoidungHoSoTmp(BaseModel<?> oldModel) {
		TthcNoidungHoSoTmpClp oldClpModel = (TthcNoidungHoSoTmpClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcNoidungHoSoTmpRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcPhanNhomHoSo(BaseModel<?> oldModel) {
		TthcPhanNhomHoSoClp oldClpModel = (TthcPhanNhomHoSoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcPhanNhomHoSoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcPhanNhomHoSoVaiTro(
		BaseModel<?> oldModel) {
		TthcPhanNhomHoSoVaiTroClp oldClpModel = (TthcPhanNhomHoSoVaiTroClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcPhanNhomHoSoVaiTroRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcThanhPhanHoSo(BaseModel<?> oldModel) {
		TthcThanhPhanHoSoClp oldClpModel = (TthcThanhPhanHoSoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcThanhPhanHoSoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcThanhPhanHoSoBieuMau(
		BaseModel<?> oldModel) {
		TthcThanhPhanHoSoBieuMauClp oldClpModel = (TthcThanhPhanHoSoBieuMauClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcThanhPhanHoSoBieuMauRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcThongBaoXuLy(BaseModel<?> oldModel) {
		TthcThongBaoXuLyClp oldClpModel = (TthcThongBaoXuLyClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcThongBaoXuLyRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcThuTucHanhChinh(
		BaseModel<?> oldModel) {
		TthcThuTucHanhChinhClp oldClpModel = (TthcThuTucHanhChinhClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcThuTucHanhChinhRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcTrangThaiHoSo(BaseModel<?> oldModel) {
		TthcTrangThaiHoSoClp oldClpModel = (TthcTrangThaiHoSoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcTrangThaiHoSoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.DmDataGroupImpl")) {
			return translateOutputDmDataGroup(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.DmDataItemImpl")) {
			return translateOutputDmDataItem(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.DmDataVersionImpl")) {
			return translateOutputDmDataVersion(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.DmMetaDataImpl")) {
			return translateOutputDmMetaData(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietCamImpl")) {
			return translateOutputQlvtDiemDungDangKyVietCam(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietLaoImpl")) {
			return translateOutputQlvtDiemDungDangKyVietLao(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietTrungImpl")) {
			return translateOutputQlvtDiemDungDangKyVietTrung(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.QlvtLoaiHinhHoatDongDnImpl")) {
			return translateOutputQlvtLoaiHinhHoatDongDn(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapBienHieuImpl")) {
			return translateOutputQlvtPhuongTienCapBienHieu(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapPhuHieuImpl")) {
			return translateOutputQlvtPhuongTienCapPhuHieu(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietCamImpl")) {
			return translateOutputQlvtPhuongTienDangKyVietCam(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietLaoImpl")) {
			return translateOutputQlvtPhuongTienDangKyVietLao(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietTrungImpl")) {
			return translateOutputQlvtPhuongTienDangKyVietTrung(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.TthcBieuMauHoSoImpl")) {
			return translateOutputTthcBieuMauHoSo(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.TthcDoiTuongThucHienImpl")) {
			return translateOutputTthcDoiTuongThucHien(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.TthcDonViThucHienImpl")) {
			return translateOutputTthcDonViThucHien(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucImpl")) {
			return translateOutputTthcHoSoThuTuc(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.TthcLinhVucThuTucImpl")) {
			return translateOutputTthcLinhVucThuTuc(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoImpl")) {
			return translateOutputTthcNoidungHoSo(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpImpl")) {
			return translateOutputTthcNoidungHoSoTmp(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.TthcPhanNhomHoSoImpl")) {
			return translateOutputTthcPhanNhomHoSo(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.TthcPhanNhomHoSoVaiTroImpl")) {
			return translateOutputTthcPhanNhomHoSoVaiTro(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoImpl")) {
			return translateOutputTthcThanhPhanHoSo(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoBieuMauImpl")) {
			return translateOutputTthcThanhPhanHoSoBieuMau(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.TthcThongBaoXuLyImpl")) {
			return translateOutputTthcThongBaoXuLy(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.TthcThuTucHanhChinhImpl")) {
			return translateOutputTthcThuTucHanhChinh(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.common.model.impl.TthcTrangThaiHoSoImpl")) {
			return translateOutputTthcTrangThaiHoSo(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchDmDataGroupException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchDmDataGroupException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchDmDataItemException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchDmDataItemException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchDmDataVersionException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchDmDataVersionException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchDmMetaDataException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchDmMetaDataException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietCamException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietCamException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietLaoException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietLaoException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietTrungException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietTrungException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapBienHieuException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapBienHieuException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietLaoException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietLaoException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchTthcBieuMauHoSoException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchTthcBieuMauHoSoException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchTthcLinhVucThuTucException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchTthcLinhVucThuTucException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchTthcThongBaoXuLyException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchTthcThongBaoXuLyException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchTthcThuTucHanhChinhException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchTthcThuTucHanhChinhException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException")) {
			return new vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException();
		}

		return throwable;
	}

	public static Object translateOutputDmDataGroup(BaseModel<?> oldModel) {
		DmDataGroupClp newModel = new DmDataGroupClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmDataGroupRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmDataItem(BaseModel<?> oldModel) {
		DmDataItemClp newModel = new DmDataItemClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmDataItemRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmDataVersion(BaseModel<?> oldModel) {
		DmDataVersionClp newModel = new DmDataVersionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmDataVersionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmMetaData(BaseModel<?> oldModel) {
		DmMetaDataClp newModel = new DmMetaDataClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmMetaDataRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtDiemDungDangKyVietCam(
		BaseModel<?> oldModel) {
		QlvtDiemDungDangKyVietCamClp newModel = new QlvtDiemDungDangKyVietCamClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtDiemDungDangKyVietCamRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtDiemDungDangKyVietLao(
		BaseModel<?> oldModel) {
		QlvtDiemDungDangKyVietLaoClp newModel = new QlvtDiemDungDangKyVietLaoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtDiemDungDangKyVietLaoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtDiemDungDangKyVietTrung(
		BaseModel<?> oldModel) {
		QlvtDiemDungDangKyVietTrungClp newModel = new QlvtDiemDungDangKyVietTrungClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtDiemDungDangKyVietTrungRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtLoaiHinhHoatDongDn(
		BaseModel<?> oldModel) {
		QlvtLoaiHinhHoatDongDnClp newModel = new QlvtLoaiHinhHoatDongDnClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtLoaiHinhHoatDongDnRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtPhuongTienCapBienHieu(
		BaseModel<?> oldModel) {
		QlvtPhuongTienCapBienHieuClp newModel = new QlvtPhuongTienCapBienHieuClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtPhuongTienCapBienHieuRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtPhuongTienCapPhuHieu(
		BaseModel<?> oldModel) {
		QlvtPhuongTienCapPhuHieuClp newModel = new QlvtPhuongTienCapPhuHieuClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtPhuongTienCapPhuHieuRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtPhuongTienDangKyVietCam(
		BaseModel<?> oldModel) {
		QlvtPhuongTienDangKyVietCamClp newModel = new QlvtPhuongTienDangKyVietCamClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtPhuongTienDangKyVietCamRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtPhuongTienDangKyVietLao(
		BaseModel<?> oldModel) {
		QlvtPhuongTienDangKyVietLaoClp newModel = new QlvtPhuongTienDangKyVietLaoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtPhuongTienDangKyVietLaoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtPhuongTienDangKyVietTrung(
		BaseModel<?> oldModel) {
		QlvtPhuongTienDangKyVietTrungClp newModel = new QlvtPhuongTienDangKyVietTrungClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtPhuongTienDangKyVietTrungRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcBieuMauHoSo(BaseModel<?> oldModel) {
		TthcBieuMauHoSoClp newModel = new TthcBieuMauHoSoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcBieuMauHoSoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcDoiTuongThucHien(
		BaseModel<?> oldModel) {
		TthcDoiTuongThucHienClp newModel = new TthcDoiTuongThucHienClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcDoiTuongThucHienRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcDonViThucHien(BaseModel<?> oldModel) {
		TthcDonViThucHienClp newModel = new TthcDonViThucHienClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcDonViThucHienRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcHoSoThuTuc(BaseModel<?> oldModel) {
		TthcHoSoThuTucClp newModel = new TthcHoSoThuTucClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcHoSoThuTucRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcLinhVucThuTuc(BaseModel<?> oldModel) {
		TthcLinhVucThuTucClp newModel = new TthcLinhVucThuTucClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcLinhVucThuTucRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcNoidungHoSo(BaseModel<?> oldModel) {
		TthcNoidungHoSoClp newModel = new TthcNoidungHoSoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcNoidungHoSoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcNoidungHoSoTmp(
		BaseModel<?> oldModel) {
		TthcNoidungHoSoTmpClp newModel = new TthcNoidungHoSoTmpClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcNoidungHoSoTmpRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcPhanNhomHoSo(BaseModel<?> oldModel) {
		TthcPhanNhomHoSoClp newModel = new TthcPhanNhomHoSoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcPhanNhomHoSoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcPhanNhomHoSoVaiTro(
		BaseModel<?> oldModel) {
		TthcPhanNhomHoSoVaiTroClp newModel = new TthcPhanNhomHoSoVaiTroClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcPhanNhomHoSoVaiTroRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcThanhPhanHoSo(BaseModel<?> oldModel) {
		TthcThanhPhanHoSoClp newModel = new TthcThanhPhanHoSoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcThanhPhanHoSoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcThanhPhanHoSoBieuMau(
		BaseModel<?> oldModel) {
		TthcThanhPhanHoSoBieuMauClp newModel = new TthcThanhPhanHoSoBieuMauClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcThanhPhanHoSoBieuMauRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcThongBaoXuLy(BaseModel<?> oldModel) {
		TthcThongBaoXuLyClp newModel = new TthcThongBaoXuLyClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcThongBaoXuLyRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcThuTucHanhChinh(
		BaseModel<?> oldModel) {
		TthcThuTucHanhChinhClp newModel = new TthcThuTucHanhChinhClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcThuTucHanhChinhRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcTrangThaiHoSo(BaseModel<?> oldModel) {
		TthcTrangThaiHoSoClp newModel = new TthcTrangThaiHoSoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcTrangThaiHoSoRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}