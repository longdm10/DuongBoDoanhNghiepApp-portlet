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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.service;

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

import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieuClp;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieuPhuongTienClp;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieuClp;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieuPhuongTienClp;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieuTuyenClp;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTaiClp;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuClp;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTienClp;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuClp;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienClp;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyenClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author binhta
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

		if (oldModelClassName.equals(QLVTCapPhepBienHieuClp.class.getName())) {
			return translateInputQLVTCapPhepBienHieu(oldModel);
		}

		if (oldModelClassName.equals(
					QLVTCapPhepBienHieuPhuongTienClp.class.getName())) {
			return translateInputQLVTCapPhepBienHieuPhuongTien(oldModel);
		}

		if (oldModelClassName.equals(QLVTCapPhepPhuHieuClp.class.getName())) {
			return translateInputQLVTCapPhepPhuHieu(oldModel);
		}

		if (oldModelClassName.equals(
					QLVTCapPhepPhuHieuPhuongTienClp.class.getName())) {
			return translateInputQLVTCapPhepPhuHieuPhuongTien(oldModel);
		}

		if (oldModelClassName.equals(QLVTCapPhepPhuHieuTuyenClp.class.getName())) {
			return translateInputQLVTCapPhepPhuHieuTuyen(oldModel);
		}

		if (oldModelClassName.equals(QLVTPhuongTienVanTaiClp.class.getName())) {
			return translateInputQLVTPhuongTienVanTai(oldModel);
		}

		if (oldModelClassName.equals(QLVTXuLyBienHieuClp.class.getName())) {
			return translateInputQLVTXuLyBienHieu(oldModel);
		}

		if (oldModelClassName.equals(
					QLVTXuLyBienHieuPhuongTienClp.class.getName())) {
			return translateInputQLVTXuLyBienHieuPhuongTien(oldModel);
		}

		if (oldModelClassName.equals(QLVTXuLyPhuHieuClp.class.getName())) {
			return translateInputQLVTXuLyPhuHieu(oldModel);
		}

		if (oldModelClassName.equals(
					QLVTXuLyPhuHieuPhuongTienClp.class.getName())) {
			return translateInputQLVTXuLyPhuHieuPhuongTien(oldModel);
		}

		if (oldModelClassName.equals(
					QLVTXuLyPhuHieuPhuongTienTuyenClp.class.getName())) {
			return translateInputQLVTXuLyPhuHieuPhuongTienTuyen(oldModel);
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

	public static Object translateInputQLVTCapPhepBienHieu(
		BaseModel<?> oldModel) {
		QLVTCapPhepBienHieuClp oldClpModel = (QLVTCapPhepBienHieuClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQLVTCapPhepBienHieuRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQLVTCapPhepBienHieuPhuongTien(
		BaseModel<?> oldModel) {
		QLVTCapPhepBienHieuPhuongTienClp oldClpModel = (QLVTCapPhepBienHieuPhuongTienClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQLVTCapPhepBienHieuPhuongTienRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQLVTCapPhepPhuHieu(BaseModel<?> oldModel) {
		QLVTCapPhepPhuHieuClp oldClpModel = (QLVTCapPhepPhuHieuClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQLVTCapPhepPhuHieuRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQLVTCapPhepPhuHieuPhuongTien(
		BaseModel<?> oldModel) {
		QLVTCapPhepPhuHieuPhuongTienClp oldClpModel = (QLVTCapPhepPhuHieuPhuongTienClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQLVTCapPhepPhuHieuPhuongTienRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQLVTCapPhepPhuHieuTuyen(
		BaseModel<?> oldModel) {
		QLVTCapPhepPhuHieuTuyenClp oldClpModel = (QLVTCapPhepPhuHieuTuyenClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQLVTCapPhepPhuHieuTuyenRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQLVTPhuongTienVanTai(
		BaseModel<?> oldModel) {
		QLVTPhuongTienVanTaiClp oldClpModel = (QLVTPhuongTienVanTaiClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQLVTPhuongTienVanTaiRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQLVTXuLyBienHieu(BaseModel<?> oldModel) {
		QLVTXuLyBienHieuClp oldClpModel = (QLVTXuLyBienHieuClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQLVTXuLyBienHieuRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQLVTXuLyBienHieuPhuongTien(
		BaseModel<?> oldModel) {
		QLVTXuLyBienHieuPhuongTienClp oldClpModel = (QLVTXuLyBienHieuPhuongTienClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQLVTXuLyBienHieuPhuongTienRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQLVTXuLyPhuHieu(BaseModel<?> oldModel) {
		QLVTXuLyPhuHieuClp oldClpModel = (QLVTXuLyPhuHieuClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQLVTXuLyPhuHieuRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQLVTXuLyPhuHieuPhuongTien(
		BaseModel<?> oldModel) {
		QLVTXuLyPhuHieuPhuongTienClp oldClpModel = (QLVTXuLyPhuHieuPhuongTienClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQLVTXuLyPhuHieuPhuongTienRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputQLVTXuLyPhuHieuPhuongTienTuyen(
		BaseModel<?> oldModel) {
		QLVTXuLyPhuHieuPhuongTienTuyenClp oldClpModel = (QLVTXuLyPhuHieuPhuongTienTuyenClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getQLVTXuLyPhuHieuPhuongTienTuyenRemoteModel();

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
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepBienHieuImpl")) {
			return translateOutputQLVTCapPhepBienHieu(oldModel);
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
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepBienHieuPhuongTienImpl")) {
			return translateOutputQLVTCapPhepBienHieuPhuongTien(oldModel);
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
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepPhuHieuImpl")) {
			return translateOutputQLVTCapPhepPhuHieu(oldModel);
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
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepPhuHieuPhuongTienImpl")) {
			return translateOutputQLVTCapPhepPhuHieuPhuongTien(oldModel);
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
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepPhuHieuTuyenImpl")) {
			return translateOutputQLVTCapPhepPhuHieuTuyen(oldModel);
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
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTPhuongTienVanTaiImpl")) {
			return translateOutputQLVTPhuongTienVanTai(oldModel);
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
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyBienHieuImpl")) {
			return translateOutputQLVTXuLyBienHieu(oldModel);
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
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyBienHieuPhuongTienImpl")) {
			return translateOutputQLVTXuLyBienHieuPhuongTien(oldModel);
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
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuImpl")) {
			return translateOutputQLVTXuLyPhuHieu(oldModel);
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
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuPhuongTienImpl")) {
			return translateOutputQLVTXuLyPhuHieuPhuongTien(oldModel);
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
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuPhuongTienTuyenImpl")) {
			return translateOutputQLVTXuLyPhuHieuPhuongTienTuyen(oldModel);
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
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepBienHieuException")) {
			return new vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepBienHieuException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepBienHieuPhuongTienException")) {
			return new vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepBienHieuPhuongTienException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuException")) {
			return new vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuPhuongTienException")) {
			return new vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuPhuongTienException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuTuyenException")) {
			return new vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepPhuHieuTuyenException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTPhuongTienVanTaiException")) {
			return new vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTPhuongTienVanTaiException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuException")) {
			return new vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException")) {
			return new vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException")) {
			return new vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException")) {
			return new vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienTuyenException")) {
			return new vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienTuyenException();
		}

		return throwable;
	}

	public static Object translateOutputQLVTCapPhepBienHieu(
		BaseModel<?> oldModel) {
		QLVTCapPhepBienHieuClp newModel = new QLVTCapPhepBienHieuClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQLVTCapPhepBienHieuRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQLVTCapPhepBienHieuPhuongTien(
		BaseModel<?> oldModel) {
		QLVTCapPhepBienHieuPhuongTienClp newModel = new QLVTCapPhepBienHieuPhuongTienClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQLVTCapPhepBienHieuPhuongTienRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQLVTCapPhepPhuHieu(
		BaseModel<?> oldModel) {
		QLVTCapPhepPhuHieuClp newModel = new QLVTCapPhepPhuHieuClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQLVTCapPhepPhuHieuRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQLVTCapPhepPhuHieuPhuongTien(
		BaseModel<?> oldModel) {
		QLVTCapPhepPhuHieuPhuongTienClp newModel = new QLVTCapPhepPhuHieuPhuongTienClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQLVTCapPhepPhuHieuPhuongTienRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQLVTCapPhepPhuHieuTuyen(
		BaseModel<?> oldModel) {
		QLVTCapPhepPhuHieuTuyenClp newModel = new QLVTCapPhepPhuHieuTuyenClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQLVTCapPhepPhuHieuTuyenRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQLVTPhuongTienVanTai(
		BaseModel<?> oldModel) {
		QLVTPhuongTienVanTaiClp newModel = new QLVTPhuongTienVanTaiClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQLVTPhuongTienVanTaiRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQLVTXuLyBienHieu(BaseModel<?> oldModel) {
		QLVTXuLyBienHieuClp newModel = new QLVTXuLyBienHieuClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQLVTXuLyBienHieuRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQLVTXuLyBienHieuPhuongTien(
		BaseModel<?> oldModel) {
		QLVTXuLyBienHieuPhuongTienClp newModel = new QLVTXuLyBienHieuPhuongTienClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQLVTXuLyBienHieuPhuongTienRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQLVTXuLyPhuHieu(BaseModel<?> oldModel) {
		QLVTXuLyPhuHieuClp newModel = new QLVTXuLyPhuHieuClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQLVTXuLyPhuHieuRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQLVTXuLyPhuHieuPhuongTien(
		BaseModel<?> oldModel) {
		QLVTXuLyPhuHieuPhuongTienClp newModel = new QLVTXuLyPhuHieuPhuongTienClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQLVTXuLyPhuHieuPhuongTienRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputQLVTXuLyPhuHieuPhuongTienTuyen(
		BaseModel<?> oldModel) {
		QLVTXuLyPhuHieuPhuongTienTuyenClp newModel = new QLVTXuLyPhuHieuPhuongTienTuyenClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setQLVTXuLyPhuHieuPhuongTienTuyenRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}