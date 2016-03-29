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

package vn.dtt.duongbo.dao.thanhtoan.service;

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

import vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPayClp;
import vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhiClp;
import vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanClp;
import vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSoClp;
import vn.dtt.duongbo.dao.thanhtoan.model.TthcYeuCauThanhToanClp;

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

		if (oldModelClassName.equals(ThanhToanKeyPayClp.class.getName())) {
			return translateInputThanhToanKeyPay(oldModel);
		}

		if (oldModelClassName.equals(TthcHinhThucNopPhiClp.class.getName())) {
			return translateInputTthcHinhThucNopPhi(oldModel);
		}

		if (oldModelClassName.equals(TthcXacNhanThanhToanClp.class.getName())) {
			return translateInputTthcXacNhanThanhToan(oldModel);
		}

		if (oldModelClassName.equals(
					TthcXacNhanThanhToanHoSoClp.class.getName())) {
			return translateInputTthcXacNhanThanhToanHoSo(oldModel);
		}

		if (oldModelClassName.equals(TthcYeuCauThanhToanClp.class.getName())) {
			return translateInputTthcYeuCauThanhToan(oldModel);
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

	public static Object translateInputThanhToanKeyPay(BaseModel<?> oldModel) {
		ThanhToanKeyPayClp oldClpModel = (ThanhToanKeyPayClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getThanhToanKeyPayRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcHinhThucNopPhi(BaseModel<?> oldModel) {
		TthcHinhThucNopPhiClp oldClpModel = (TthcHinhThucNopPhiClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcHinhThucNopPhiRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcXacNhanThanhToan(
		BaseModel<?> oldModel) {
		TthcXacNhanThanhToanClp oldClpModel = (TthcXacNhanThanhToanClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcXacNhanThanhToanRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcXacNhanThanhToanHoSo(
		BaseModel<?> oldModel) {
		TthcXacNhanThanhToanHoSoClp oldClpModel = (TthcXacNhanThanhToanHoSoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcXacNhanThanhToanHoSoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcYeuCauThanhToan(
		BaseModel<?> oldModel) {
		TthcYeuCauThanhToanClp oldClpModel = (TthcYeuCauThanhToanClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcYeuCauThanhToanRemoteModel();

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
					"vn.dtt.duongbo.dao.thanhtoan.model.impl.ThanhToanKeyPayImpl")) {
			return translateOutputThanhToanKeyPay(oldModel);
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
					"vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcHinhThucNopPhiImpl")) {
			return translateOutputTthcHinhThucNopPhi(oldModel);
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
					"vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanImpl")) {
			return translateOutputTthcXacNhanThanhToan(oldModel);
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
					"vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanHoSoImpl")) {
			return translateOutputTthcXacNhanThanhToanHoSo(oldModel);
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
					"vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcYeuCauThanhToanImpl")) {
			return translateOutputTthcYeuCauThanhToan(oldModel);
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
					"vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException")) {
			return new vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException")) {
			return new vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException")) {
			return new vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException")) {
			return new vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcYeuCauThanhToanException")) {
			return new vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcYeuCauThanhToanException();
		}

		return throwable;
	}

	public static Object translateOutputThanhToanKeyPay(BaseModel<?> oldModel) {
		ThanhToanKeyPayClp newModel = new ThanhToanKeyPayClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setThanhToanKeyPayRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcHinhThucNopPhi(
		BaseModel<?> oldModel) {
		TthcHinhThucNopPhiClp newModel = new TthcHinhThucNopPhiClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcHinhThucNopPhiRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcXacNhanThanhToan(
		BaseModel<?> oldModel) {
		TthcXacNhanThanhToanClp newModel = new TthcXacNhanThanhToanClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcXacNhanThanhToanRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcXacNhanThanhToanHoSo(
		BaseModel<?> oldModel) {
		TthcXacNhanThanhToanHoSoClp newModel = new TthcXacNhanThanhToanHoSoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcXacNhanThanhToanHoSoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcYeuCauThanhToan(
		BaseModel<?> oldModel) {
		TthcYeuCauThanhToanClp newModel = new TthcYeuCauThanhToanClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcYeuCauThanhToanRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}