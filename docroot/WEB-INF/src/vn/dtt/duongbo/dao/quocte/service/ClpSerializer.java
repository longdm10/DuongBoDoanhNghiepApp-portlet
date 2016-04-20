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

package vn.dtt.duongbo.dao.quocte.service;

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

import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeClp;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiClp;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenClp;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXeClp;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeClp;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghiClp;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTienClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NoiPham
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

		if (oldModelClassName.equals(QlvtXuLyGpkdvtQuocTeClp.class.getName())) {
			return translateInputQlvtXuLyGpkdvtQuocTe(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiClp.class.getName())) {
			return translateInputQlvtXuLyGpkdvtQuocTeLoaiHinhVanTai(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenClp.class.getName())) {
			return translateInputQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen(oldModel);
		}

		if (oldModelClassName.equals(QlvtXuLyKTTQuocTeClp.class.getName())) {
			return translateInputQlvtXuLyKTTQuocTe(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtXuLyKTTQuocTeBieuDoXeClp.class.getName())) {
			return translateInputQlvtXuLyKTTQuocTeBieuDoXe(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtXuLyKTTQuocTeDiemDungNghiClp.class.getName())) {
			return translateInputQlvtXuLyKTTQuocTeDiemDungNghi(oldModel);
		}

		if (oldModelClassName.equals(
					QlvtXuLyKTTQuocTePhuongTienClp.class.getName())) {
			return translateInputQlvtXuLyKTTQuocTePhuongTien(oldModel);
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

	public static Object translateInputQlvtXuLyGpkdvtQuocTe(
		BaseModel<?> oldModel) {
		QlvtXuLyGpkdvtQuocTeClp oldClpModel = (QlvtXuLyGpkdvtQuocTeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtXuLyGpkdvtQuocTeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtXuLyGpkdvtQuocTeLoaiHinhVanTai(
		BaseModel<?> oldModel) {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiClp oldClpModel = (QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen(
		BaseModel<?> oldModel) {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenClp oldClpModel = (QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtXuLyKTTQuocTe(BaseModel<?> oldModel) {
		QlvtXuLyKTTQuocTeClp oldClpModel = (QlvtXuLyKTTQuocTeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtXuLyKTTQuocTeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtXuLyKTTQuocTeBieuDoXe(
		BaseModel<?> oldModel) {
		QlvtXuLyKTTQuocTeBieuDoXeClp oldClpModel = (QlvtXuLyKTTQuocTeBieuDoXeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtXuLyKTTQuocTeBieuDoXeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtXuLyKTTQuocTeDiemDungNghi(
		BaseModel<?> oldModel) {
		QlvtXuLyKTTQuocTeDiemDungNghiClp oldClpModel = (QlvtXuLyKTTQuocTeDiemDungNghiClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtXuLyKTTQuocTeDiemDungNghiRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQlvtXuLyKTTQuocTePhuongTien(
		BaseModel<?> oldModel) {
		QlvtXuLyKTTQuocTePhuongTienClp oldClpModel = (QlvtXuLyKTTQuocTePhuongTienClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQlvtXuLyKTTQuocTePhuongTienRemoteModel();

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
					"vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeImpl")) {
			return translateOutputQlvtXuLyGpkdvtQuocTe(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiImpl")) {
			return translateOutputQlvtXuLyGpkdvtQuocTeLoaiHinhVanTai(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl")) {
			return translateOutputQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeImpl")) {
			return translateOutputQlvtXuLyKTTQuocTe(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeBieuDoXeImpl")) {
			return translateOutputQlvtXuLyKTTQuocTeBieuDoXe(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeDiemDungNghiImpl")) {
			return translateOutputQlvtXuLyKTTQuocTeDiemDungNghi(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTePhuongTienImpl")) {
			return translateOutputQlvtXuLyKTTQuocTePhuongTien(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
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
					"vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeException")) {
			return new vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiException")) {
			return new vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException")) {
			return new vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeException")) {
			return new vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeBieuDoXeException")) {
			return new vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeBieuDoXeException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeDiemDungNghiException")) {
			return new vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeDiemDungNghiException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException")) {
			return new vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException();
		}

		return throwable;
	}

	public static Object translateOutputQlvtXuLyGpkdvtQuocTe(
		BaseModel<?> oldModel) {
		QlvtXuLyGpkdvtQuocTeClp newModel = new QlvtXuLyGpkdvtQuocTeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtXuLyGpkdvtQuocTeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtXuLyGpkdvtQuocTeLoaiHinhVanTai(
		BaseModel<?> oldModel) {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiClp newModel = new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen(
		BaseModel<?> oldModel) {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenClp newModel = new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtXuLyKTTQuocTe(BaseModel<?> oldModel) {
		QlvtXuLyKTTQuocTeClp newModel = new QlvtXuLyKTTQuocTeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtXuLyKTTQuocTeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtXuLyKTTQuocTeBieuDoXe(
		BaseModel<?> oldModel) {
		QlvtXuLyKTTQuocTeBieuDoXeClp newModel = new QlvtXuLyKTTQuocTeBieuDoXeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtXuLyKTTQuocTeBieuDoXeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtXuLyKTTQuocTeDiemDungNghi(
		BaseModel<?> oldModel) {
		QlvtXuLyKTTQuocTeDiemDungNghiClp newModel = new QlvtXuLyKTTQuocTeDiemDungNghiClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtXuLyKTTQuocTeDiemDungNghiRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQlvtXuLyKTTQuocTePhuongTien(
		BaseModel<?> oldModel) {
		QlvtXuLyKTTQuocTePhuongTienClp newModel = new QlvtXuLyKTTQuocTePhuongTienClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQlvtXuLyKTTQuocTePhuongTienRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}