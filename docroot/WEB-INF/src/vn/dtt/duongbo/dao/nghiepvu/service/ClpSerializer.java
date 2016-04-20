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

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSoClp;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTthsClp;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTraClp;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFileClp;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTraClp;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTraClp;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoClp;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoLienVanClp;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoNoiDiaClp;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTeClp;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLyClp;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXungClp;

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

		if (oldModelClassName.equals(QlvtKiemTraHoSoClp.class.getName())) {
			return translateInputQlvtKiemTraHoSo(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtLoaiHinhHoatDongTthsClp.class.getName())) {
			return translateInputQlvtLoaiHinhHoatDongTths(oldModel);
		}

		if (oldModelClassName.equals(QlvtNoiDungThamTraClp.class.getName())) {
			return translateInputQlvtNoiDungThamTra(oldModel);
		}

		if (oldModelClassName.equals(QlvtQuanLyFileClp.class.getName())) {
			return translateInputQlvtQuanLyFile(oldModel);
		}

		if (oldModelClassName.equals(QlvtThongTinHoSoClp.class.getName())) {
			return translateInputQlvtThongTinHoSo(oldModel);
		}

		if (oldModelClassName.equals(QlvtThongTinHoSoLienVanClp.class.getName())) {
			return translateInputQlvtThongTinHoSoLienVan(oldModel);
		}

		if (oldModelClassName.equals(QlvtThongTinHoSoNoiDiaClp.class.getName())) {
			return translateInputQlvtThongTinHoSoNoiDia(oldModel);
		}

		if (oldModelClassName.equals(QlvtThongTinHoSoQuocTeClp.class.getName())) {
			return translateInputQlvtThongTinHoSoQuocTe(oldModel);
		}

		if (oldModelClassName.equals(QlvtThongTinXuLyClp.class.getName())) {
			return translateInputQlvtThongTinXuLy(oldModel);
		}

		if (oldModelClassName.equals(QlvtTTHCKetQuaThamTraClp.class.getName())) {
			return translateInputQlvtTTHCKetQuaThamTra(oldModel);
		}

		if (oldModelClassName.equals(QlvtTTHCNoiDungThamTraClp.class.getName())) {
			return translateInputQlvtTTHCNoiDungThamTra(oldModel);
		}

		if (oldModelClassName.equals(QlvtYeuCauBoXungClp.class.getName())) {
			return translateInputQlvtYeuCauBoXung(oldModel);
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

	public static Object translateInputQlvtKiemTraHoSo(BaseModel<?> oldModel) {
		QlvtKiemTraHoSoClp oldClpModel = (QlvtKiemTraHoSoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtKiemTraHoSoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtLoaiHinhHoatDongTths(
		BaseModel<?> oldModel) {
		QlvtLoaiHinhHoatDongTthsClp oldClpModel = (QlvtLoaiHinhHoatDongTthsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtLoaiHinhHoatDongTthsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtNoiDungThamTra(BaseModel<?> oldModel) {
		QlvtNoiDungThamTraClp oldClpModel = (QlvtNoiDungThamTraClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtNoiDungThamTraRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtQuanLyFile(BaseModel<?> oldModel) {
		QlvtQuanLyFileClp oldClpModel = (QlvtQuanLyFileClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtQuanLyFileRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtThongTinHoSo(BaseModel<?> oldModel) {
		QlvtThongTinHoSoClp oldClpModel = (QlvtThongTinHoSoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtThongTinHoSoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtThongTinHoSoLienVan(
		BaseModel<?> oldModel) {
		QlvtThongTinHoSoLienVanClp oldClpModel = (QlvtThongTinHoSoLienVanClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtThongTinHoSoLienVanRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtThongTinHoSoNoiDia(
		BaseModel<?> oldModel) {
		QlvtThongTinHoSoNoiDiaClp oldClpModel = (QlvtThongTinHoSoNoiDiaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtThongTinHoSoNoiDiaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtThongTinHoSoQuocTe(
		BaseModel<?> oldModel) {
		QlvtThongTinHoSoQuocTeClp oldClpModel = (QlvtThongTinHoSoQuocTeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtThongTinHoSoQuocTeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtThongTinXuLy(BaseModel<?> oldModel) {
		QlvtThongTinXuLyClp oldClpModel = (QlvtThongTinXuLyClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtThongTinXuLyRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtTTHCKetQuaThamTra(
		BaseModel<?> oldModel) {
		QlvtTTHCKetQuaThamTraClp oldClpModel = (QlvtTTHCKetQuaThamTraClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtTTHCKetQuaThamTraRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtTTHCNoiDungThamTra(
		BaseModel<?> oldModel) {
		QlvtTTHCNoiDungThamTraClp oldClpModel = (QlvtTTHCNoiDungThamTraClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtTTHCNoiDungThamTraRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtYeuCauBoXung(BaseModel<?> oldModel) {
		QlvtYeuCauBoXungClp oldClpModel = (QlvtYeuCauBoXungClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtYeuCauBoXungRemoteModel();

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
					"vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtKiemTraHoSoImpl")) {
			return translateOutputQlvtKiemTraHoSo(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtLoaiHinhHoatDongTthsImpl")) {
			return translateOutputQlvtLoaiHinhHoatDongTths(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtNoiDungThamTraImpl")) {
			return translateOutputQlvtNoiDungThamTra(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtQuanLyFileImpl")) {
			return translateOutputQlvtQuanLyFile(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoImpl")) {
			return translateOutputQlvtThongTinHoSo(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoLienVanImpl")) {
			return translateOutputQlvtThongTinHoSoLienVan(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoNoiDiaImpl")) {
			return translateOutputQlvtThongTinHoSoNoiDia(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoQuocTeImpl")) {
			return translateOutputQlvtThongTinHoSoQuocTe(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinXuLyImpl")) {
			return translateOutputQlvtThongTinXuLy(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCKetQuaThamTraImpl")) {
			return translateOutputQlvtTTHCKetQuaThamTra(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCNoiDungThamTraImpl")) {
			return translateOutputQlvtTTHCNoiDungThamTra(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtYeuCauBoXungImpl")) {
			return translateOutputQlvtYeuCauBoXung(oldModel);
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
					"vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtKiemTraHoSoException")) {
			return new vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtKiemTraHoSoException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException")) {
			return new vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException")) {
			return new vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException")) {
			return new vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException")) {
			return new vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoLienVanException")) {
			return new vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoLienVanException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoNoiDiaException")) {
			return new vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoNoiDiaException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoQuocTeException")) {
			return new vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinHoSoQuocTeException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinXuLyException")) {
			return new vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtThongTinXuLyException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException")) {
			return new vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException")) {
			return new vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCNoiDungThamTraException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtYeuCauBoXungException")) {
			return new vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtYeuCauBoXungException();
		}

		return throwable;
	}

	public static Object translateOutputQlvtKiemTraHoSo(BaseModel<?> oldModel) {
		QlvtKiemTraHoSoClp newModel = new QlvtKiemTraHoSoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtKiemTraHoSoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtLoaiHinhHoatDongTths(
		BaseModel<?> oldModel) {
		QlvtLoaiHinhHoatDongTthsClp newModel = new QlvtLoaiHinhHoatDongTthsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtLoaiHinhHoatDongTthsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtNoiDungThamTra(
		BaseModel<?> oldModel) {
		QlvtNoiDungThamTraClp newModel = new QlvtNoiDungThamTraClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtNoiDungThamTraRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtQuanLyFile(BaseModel<?> oldModel) {
		QlvtQuanLyFileClp newModel = new QlvtQuanLyFileClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtQuanLyFileRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtThongTinHoSo(BaseModel<?> oldModel) {
		QlvtThongTinHoSoClp newModel = new QlvtThongTinHoSoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtThongTinHoSoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtThongTinHoSoLienVan(
		BaseModel<?> oldModel) {
		QlvtThongTinHoSoLienVanClp newModel = new QlvtThongTinHoSoLienVanClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtThongTinHoSoLienVanRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtThongTinHoSoNoiDia(
		BaseModel<?> oldModel) {
		QlvtThongTinHoSoNoiDiaClp newModel = new QlvtThongTinHoSoNoiDiaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtThongTinHoSoNoiDiaRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtThongTinHoSoQuocTe(
		BaseModel<?> oldModel) {
		QlvtThongTinHoSoQuocTeClp newModel = new QlvtThongTinHoSoQuocTeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtThongTinHoSoQuocTeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtThongTinXuLy(BaseModel<?> oldModel) {
		QlvtThongTinXuLyClp newModel = new QlvtThongTinXuLyClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtThongTinXuLyRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtTTHCKetQuaThamTra(
		BaseModel<?> oldModel) {
		QlvtTTHCKetQuaThamTraClp newModel = new QlvtTTHCKetQuaThamTraClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtTTHCKetQuaThamTraRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtTTHCNoiDungThamTra(
		BaseModel<?> oldModel) {
		QlvtTTHCNoiDungThamTraClp newModel = new QlvtTTHCNoiDungThamTraClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtTTHCNoiDungThamTraRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtYeuCauBoXung(BaseModel<?> oldModel) {
		QlvtYeuCauBoXungClp newModel = new QlvtYeuCauBoXungClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtYeuCauBoXungRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}