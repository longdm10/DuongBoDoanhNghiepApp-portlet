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

package vn.dtt.duongbo.dao.lienvan.service;

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

import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpLienVanClp;
import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTeClp;
import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTaiClp;
import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTienClp;
import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTienVanTaiClp;
import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiClp;
import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepPhuongTienVanTaiClp;
import vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplvClp;
import vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTaiClp;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanClp;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTaiClp;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienClp;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghiClp;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyenClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NhanNc
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

		if (oldModelClassName.equals(
					QlvtCapPhepGpkdvtDuongboQuocTeClp.class.getName())) {
			return translateInputQlvtCapPhepGpkdvtDuongboQuocTe(oldModel);
		}

		if (oldModelClassName.equals(QlvtCapPhepGpLienVanClp.class.getName())) {
			return translateInputQlvtCapPhepGpLienVan(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtCapPhepGplvLoaiHinhVanTaiClp.class.getName())) {
			return translateInputQlvtCapPhepGplvLoaiHinhVanTai(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtCapPhepGplvPhuongTienClp.class.getName())) {
			return translateInputQlvtCapPhepGplvPhuongTien(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtCapPhepGplvPhuongTienVanTaiClp.class.getName())) {
			return translateInputQlvtCapPhepGplvPhuongTienVanTai(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiClp.class.getName())) {
			return translateInputQlvtCapPhepGplvPhuongTienVanTaiTramdungnghi(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtCapPhepPhuongTienVanTaiClp.class.getName())) {
			return translateInputQlvtCapPhepPhuongTienVanTai(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtThongTinHoSoCapPhepGplvClp.class.getName())) {
			return translateInputQlvtThongTinHoSoCapPhepGplv(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtThongTinHoSoGiayPhepVanTaiClp.class.getName())) {
			return translateInputQlvtThongTinHoSoGiayPhepVanTai(oldModel);
		}

		if (oldModelClassName.equals(QlvtXuLyGpLienVanClp.class.getName())) {
			return translateInputQlvtXuLyGpLienVan(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtXuLyGpLienVanLoaiHinhVanTaiClp.class.getName())) {
			return translateInputQlvtXuLyGpLienVanLoaiHinhVanTai(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtXuLyGpLienVanPhuongTienClp.class.getName())) {
			return translateInputQlvtXuLyGpLienVanPhuongTien(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtXuLyGpLienVanPhuongTienTramDungNghiClp.class.getName())) {
			return translateInputQlvtXuLyGpLienVanPhuongTienTramDungNghi(oldModel);
		}

		if (oldModelClassName.equals(QlvtXuLyGpLienVanTuyenClp.class.getName())) {
			return translateInputQlvtXuLyGpLienVanTuyen(oldModel);
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

	public static Object translateInputQlvtCapPhepGpkdvtDuongboQuocTe(
		BaseModel<?> oldModel) {
		QlvtCapPhepGpkdvtDuongboQuocTeClp oldClpModel = (QlvtCapPhepGpkdvtDuongboQuocTeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtCapPhepGpkdvtDuongboQuocTeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtCapPhepGpLienVan(
		BaseModel<?> oldModel) {
		QlvtCapPhepGpLienVanClp oldClpModel = (QlvtCapPhepGpLienVanClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtCapPhepGpLienVanRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtCapPhepGplvLoaiHinhVanTai(
		BaseModel<?> oldModel) {
		QlvtCapPhepGplvLoaiHinhVanTaiClp oldClpModel = (QlvtCapPhepGplvLoaiHinhVanTaiClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtCapPhepGplvLoaiHinhVanTaiRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtCapPhepGplvPhuongTien(
		BaseModel<?> oldModel) {
		QlvtCapPhepGplvPhuongTienClp oldClpModel = (QlvtCapPhepGplvPhuongTienClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtCapPhepGplvPhuongTienRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtCapPhepGplvPhuongTienVanTai(
		BaseModel<?> oldModel) {
		QlvtCapPhepGplvPhuongTienVanTaiClp oldClpModel = (QlvtCapPhepGplvPhuongTienVanTaiClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtCapPhepGplvPhuongTienVanTaiRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtCapPhepGplvPhuongTienVanTaiTramdungnghi(
		BaseModel<?> oldModel) {
		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiClp oldClpModel = (QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtCapPhepGplvPhuongTienVanTaiTramdungnghiRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtCapPhepPhuongTienVanTai(
		BaseModel<?> oldModel) {
		QlvtCapPhepPhuongTienVanTaiClp oldClpModel = (QlvtCapPhepPhuongTienVanTaiClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtCapPhepPhuongTienVanTaiRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtThongTinHoSoCapPhepGplv(
		BaseModel<?> oldModel) {
		QlvtThongTinHoSoCapPhepGplvClp oldClpModel = (QlvtThongTinHoSoCapPhepGplvClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtThongTinHoSoCapPhepGplvRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtThongTinHoSoGiayPhepVanTai(
		BaseModel<?> oldModel) {
		QlvtThongTinHoSoGiayPhepVanTaiClp oldClpModel = (QlvtThongTinHoSoGiayPhepVanTaiClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtThongTinHoSoGiayPhepVanTaiRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtXuLyGpLienVan(BaseModel<?> oldModel) {
		QlvtXuLyGpLienVanClp oldClpModel = (QlvtXuLyGpLienVanClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtXuLyGpLienVanRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtXuLyGpLienVanLoaiHinhVanTai(
		BaseModel<?> oldModel) {
		QlvtXuLyGpLienVanLoaiHinhVanTaiClp oldClpModel = (QlvtXuLyGpLienVanLoaiHinhVanTaiClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtXuLyGpLienVanLoaiHinhVanTaiRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtXuLyGpLienVanPhuongTien(
		BaseModel<?> oldModel) {
		QlvtXuLyGpLienVanPhuongTienClp oldClpModel = (QlvtXuLyGpLienVanPhuongTienClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtXuLyGpLienVanPhuongTienRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtXuLyGpLienVanPhuongTienTramDungNghi(
		BaseModel<?> oldModel) {
		QlvtXuLyGpLienVanPhuongTienTramDungNghiClp oldClpModel = (QlvtXuLyGpLienVanPhuongTienTramDungNghiClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtXuLyGpLienVanPhuongTienTramDungNghiRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtXuLyGpLienVanTuyen(
		BaseModel<?> oldModel) {
		QlvtXuLyGpLienVanTuyenClp oldClpModel = (QlvtXuLyGpLienVanTuyenClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtXuLyGpLienVanTuyenRemoteModel();

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
					"vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGpkdvtDuongboQuocTeImpl")) {
			return translateOutputQlvtCapPhepGpkdvtDuongboQuocTe(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGpLienVanImpl")) {
			return translateOutputQlvtCapPhepGpLienVan(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvLoaiHinhVanTaiImpl")) {
			return translateOutputQlvtCapPhepGplvLoaiHinhVanTai(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienImpl")) {
			return translateOutputQlvtCapPhepGplvPhuongTien(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienVanTaiImpl")) {
			return translateOutputQlvtCapPhepGplvPhuongTienVanTai(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiImpl")) {
			return translateOutputQlvtCapPhepGplvPhuongTienVanTaiTramdungnghi(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepPhuongTienVanTaiImpl")) {
			return translateOutputQlvtCapPhepPhuongTienVanTai(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoCapPhepGplvImpl")) {
			return translateOutputQlvtThongTinHoSoCapPhepGplv(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoGiayPhepVanTaiImpl")) {
			return translateOutputQlvtThongTinHoSoGiayPhepVanTai(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanImpl")) {
			return translateOutputQlvtXuLyGpLienVan(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanLoaiHinhVanTaiImpl")) {
			return translateOutputQlvtXuLyGpLienVanLoaiHinhVanTai(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienImpl")) {
			return translateOutputQlvtXuLyGpLienVanPhuongTien(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl")) {
			return translateOutputQlvtXuLyGpLienVanPhuongTienTramDungNghi(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanTuyenImpl")) {
			return translateOutputQlvtXuLyGpLienVanTuyen(oldModel);
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
					"vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGpkdvtDuongboQuocTeException")) {
			return new vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGpkdvtDuongboQuocTeException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGpLienVanException")) {
			return new vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGpLienVanException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvLoaiHinhVanTaiException")) {
			return new vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvLoaiHinhVanTaiException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienException")) {
			return new vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienVanTaiException")) {
			return new vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienVanTaiException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienVanTaiTramdungnghiException")) {
			return new vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepGplvPhuongTienVanTaiTramdungnghiException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepPhuongTienVanTaiException")) {
			return new vn.dtt.duongbo.dao.lienvan.NoSuchQlvtCapPhepPhuongTienVanTaiException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoCapPhepGplvException")) {
			return new vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoCapPhepGplvException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoGiayPhepVanTaiException")) {
			return new vn.dtt.duongbo.dao.lienvan.NoSuchQlvtThongTinHoSoGiayPhepVanTaiException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanException")) {
			return new vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException")) {
			return new vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException")) {
			return new vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException")) {
			return new vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException")) {
			return new vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException();
		}

		return throwable;
	}

	public static Object translateOutputQlvtCapPhepGpkdvtDuongboQuocTe(
		BaseModel<?> oldModel) {
		QlvtCapPhepGpkdvtDuongboQuocTeClp newModel = new QlvtCapPhepGpkdvtDuongboQuocTeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtCapPhepGpkdvtDuongboQuocTeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtCapPhepGpLienVan(
		BaseModel<?> oldModel) {
		QlvtCapPhepGpLienVanClp newModel = new QlvtCapPhepGpLienVanClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtCapPhepGpLienVanRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtCapPhepGplvLoaiHinhVanTai(
		BaseModel<?> oldModel) {
		QlvtCapPhepGplvLoaiHinhVanTaiClp newModel = new QlvtCapPhepGplvLoaiHinhVanTaiClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtCapPhepGplvLoaiHinhVanTaiRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtCapPhepGplvPhuongTien(
		BaseModel<?> oldModel) {
		QlvtCapPhepGplvPhuongTienClp newModel = new QlvtCapPhepGplvPhuongTienClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtCapPhepGplvPhuongTienRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtCapPhepGplvPhuongTienVanTai(
		BaseModel<?> oldModel) {
		QlvtCapPhepGplvPhuongTienVanTaiClp newModel = new QlvtCapPhepGplvPhuongTienVanTaiClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtCapPhepGplvPhuongTienVanTaiRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtCapPhepGplvPhuongTienVanTaiTramdungnghi(
		BaseModel<?> oldModel) {
		QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiClp newModel = new QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtCapPhepGplvPhuongTienVanTaiTramdungnghiRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtCapPhepPhuongTienVanTai(
		BaseModel<?> oldModel) {
		QlvtCapPhepPhuongTienVanTaiClp newModel = new QlvtCapPhepPhuongTienVanTaiClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtCapPhepPhuongTienVanTaiRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtThongTinHoSoCapPhepGplv(
		BaseModel<?> oldModel) {
		QlvtThongTinHoSoCapPhepGplvClp newModel = new QlvtThongTinHoSoCapPhepGplvClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtThongTinHoSoCapPhepGplvRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtThongTinHoSoGiayPhepVanTai(
		BaseModel<?> oldModel) {
		QlvtThongTinHoSoGiayPhepVanTaiClp newModel = new QlvtThongTinHoSoGiayPhepVanTaiClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtThongTinHoSoGiayPhepVanTaiRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtXuLyGpLienVan(BaseModel<?> oldModel) {
		QlvtXuLyGpLienVanClp newModel = new QlvtXuLyGpLienVanClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtXuLyGpLienVanRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtXuLyGpLienVanLoaiHinhVanTai(
		BaseModel<?> oldModel) {
		QlvtXuLyGpLienVanLoaiHinhVanTaiClp newModel = new QlvtXuLyGpLienVanLoaiHinhVanTaiClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtXuLyGpLienVanLoaiHinhVanTaiRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtXuLyGpLienVanPhuongTien(
		BaseModel<?> oldModel) {
		QlvtXuLyGpLienVanPhuongTienClp newModel = new QlvtXuLyGpLienVanPhuongTienClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtXuLyGpLienVanPhuongTienRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtXuLyGpLienVanPhuongTienTramDungNghi(
		BaseModel<?> oldModel) {
		QlvtXuLyGpLienVanPhuongTienTramDungNghiClp newModel = new QlvtXuLyGpLienVanPhuongTienTramDungNghiClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtXuLyGpLienVanPhuongTienTramDungNghiRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtXuLyGpLienVanTuyen(
		BaseModel<?> oldModel) {
		QlvtXuLyGpLienVanTuyenClp newModel = new QlvtXuLyGpLienVanTuyenClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtXuLyGpLienVanTuyenRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}