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

package vn.dtt.duongbo.dao.motcua.service;

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

import vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThaiClp;
import vn.dtt.duongbo.dao.motcua.model.MotCuaChuyenDichTrangThaiClp;
import vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSoClp;
import vn.dtt.duongbo.dao.motcua.model.MotCuaKetQuaDienBienClp;
import vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSoClp;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLyClp;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLyClp;
import vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucClp;
import vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHCClp;
import vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSoClp;
import vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRoleClp;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee2jobposClp;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployeeClp;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2roleClp;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobposClp;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthcClp;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnitClp;
import vn.dtt.duongbo.dao.motcua.model.ThamSoHeThongClp;

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

		if (oldModelClassName.equals(MotCuaAnhXaTrangThaiClp.class.getName())) {
			return translateInputMotCuaAnhXaTrangThai(oldModel);
		}

		if (oldModelClassName.equals(
					MotCuaChuyenDichTrangThaiClp.class.getName())) {
			return translateInputMotCuaChuyenDichTrangThai(oldModel);
		}

		if (oldModelClassName.equals(MotCuaDienBienHoSoClp.class.getName())) {
			return translateInputMotCuaDienBienHoSo(oldModel);
		}

		if (oldModelClassName.equals(MotCuaKetQuaDienBienClp.class.getName())) {
			return translateInputMotCuaKetQuaDienBien(oldModel);
		}

		if (oldModelClassName.equals(MotCuaNhanTraHoSoClp.class.getName())) {
			return translateInputMotCuaNhanTraHoSo(oldModel);
		}

		if (oldModelClassName.equals(MotCuaPhanCongXuLyClp.class.getName())) {
			return translateInputMotCuaPhanCongXuLy(oldModel);
		}

		if (oldModelClassName.equals(MotCuaPhieuXuLyClp.class.getName())) {
			return translateInputMotCuaPhieuXuLy(oldModel);
		}

		if (oldModelClassName.equals(MotCuaQuyTrinhThuTucClp.class.getName())) {
			return translateInputMotCuaQuyTrinhThuTuc(oldModel);
		}

		if (oldModelClassName.equals(
					MotCuaQuyTrinhThuTucTTHCClp.class.getName())) {
			return translateInputMotCuaQuyTrinhThuTucTTHC(oldModel);
		}

		if (oldModelClassName.equals(MotCuaTrangThaiHoSoClp.class.getName())) {
			return translateInputMotCuaTrangThaiHoSo(oldModel);
		}

		if (oldModelClassName.equals(OEPThuTucHanhChinhRoleClp.class.getName())) {
			return translateInputOEPThuTucHanhChinhRole(oldModel);
		}

		if (oldModelClassName.equals(OEPUserMgtEmployeeClp.class.getName())) {
			return translateInputOEPUserMgtEmployee(oldModel);
		}

		if (oldModelClassName.equals(
					OEPUserMgtEmployee2jobposClp.class.getName())) {
			return translateInputOEPUserMgtEmployee2jobpos(oldModel);
		}

		if (oldModelClassName.equals(OEPUserMgtJobposClp.class.getName())) {
			return translateInputOEPUserMgtJobpos(oldModel);
		}

		if (oldModelClassName.equals(OEPUserMgtJobpos2roleClp.class.getName())) {
			return translateInputOEPUserMgtJobpos2role(oldModel);
		}

		if (oldModelClassName.equals(OEPUserMgtWorkingUnitClp.class.getName())) {
			return translateInputOEPUserMgtWorkingUnit(oldModel);
		}

		if (oldModelClassName.equals(
					OEPUserMgtWorkingUnit2tthcClp.class.getName())) {
			return translateInputOEPUserMgtWorkingUnit2tthc(oldModel);
		}

		if (oldModelClassName.equals(ThamSoHeThongClp.class.getName())) {
			return translateInputThamSoHeThong(oldModel);
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

	public static Object translateInputMotCuaAnhXaTrangThai(
		BaseModel<?> oldModel) {
		MotCuaAnhXaTrangThaiClp oldClpModel = (MotCuaAnhXaTrangThaiClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMotCuaAnhXaTrangThaiRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMotCuaChuyenDichTrangThai(
		BaseModel<?> oldModel) {
		MotCuaChuyenDichTrangThaiClp oldClpModel = (MotCuaChuyenDichTrangThaiClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMotCuaChuyenDichTrangThaiRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMotCuaDienBienHoSo(BaseModel<?> oldModel) {
		MotCuaDienBienHoSoClp oldClpModel = (MotCuaDienBienHoSoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMotCuaDienBienHoSoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMotCuaKetQuaDienBien(
		BaseModel<?> oldModel) {
		MotCuaKetQuaDienBienClp oldClpModel = (MotCuaKetQuaDienBienClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMotCuaKetQuaDienBienRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMotCuaNhanTraHoSo(BaseModel<?> oldModel) {
		MotCuaNhanTraHoSoClp oldClpModel = (MotCuaNhanTraHoSoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMotCuaNhanTraHoSoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMotCuaPhanCongXuLy(BaseModel<?> oldModel) {
		MotCuaPhanCongXuLyClp oldClpModel = (MotCuaPhanCongXuLyClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMotCuaPhanCongXuLyRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMotCuaPhieuXuLy(BaseModel<?> oldModel) {
		MotCuaPhieuXuLyClp oldClpModel = (MotCuaPhieuXuLyClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMotCuaPhieuXuLyRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMotCuaQuyTrinhThuTuc(
		BaseModel<?> oldModel) {
		MotCuaQuyTrinhThuTucClp oldClpModel = (MotCuaQuyTrinhThuTucClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMotCuaQuyTrinhThuTucRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMotCuaQuyTrinhThuTucTTHC(
		BaseModel<?> oldModel) {
		MotCuaQuyTrinhThuTucTTHCClp oldClpModel = (MotCuaQuyTrinhThuTucTTHCClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMotCuaQuyTrinhThuTucTTHCRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMotCuaTrangThaiHoSo(
		BaseModel<?> oldModel) {
		MotCuaTrangThaiHoSoClp oldClpModel = (MotCuaTrangThaiHoSoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMotCuaTrangThaiHoSoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputOEPThuTucHanhChinhRole(
		BaseModel<?> oldModel) {
		OEPThuTucHanhChinhRoleClp oldClpModel = (OEPThuTucHanhChinhRoleClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getOEPThuTucHanhChinhRoleRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputOEPUserMgtEmployee(BaseModel<?> oldModel) {
		OEPUserMgtEmployeeClp oldClpModel = (OEPUserMgtEmployeeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getOEPUserMgtEmployeeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputOEPUserMgtEmployee2jobpos(
		BaseModel<?> oldModel) {
		OEPUserMgtEmployee2jobposClp oldClpModel = (OEPUserMgtEmployee2jobposClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getOEPUserMgtEmployee2jobposRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputOEPUserMgtJobpos(BaseModel<?> oldModel) {
		OEPUserMgtJobposClp oldClpModel = (OEPUserMgtJobposClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getOEPUserMgtJobposRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputOEPUserMgtJobpos2role(
		BaseModel<?> oldModel) {
		OEPUserMgtJobpos2roleClp oldClpModel = (OEPUserMgtJobpos2roleClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getOEPUserMgtJobpos2roleRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputOEPUserMgtWorkingUnit(
		BaseModel<?> oldModel) {
		OEPUserMgtWorkingUnitClp oldClpModel = (OEPUserMgtWorkingUnitClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getOEPUserMgtWorkingUnitRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputOEPUserMgtWorkingUnit2tthc(
		BaseModel<?> oldModel) {
		OEPUserMgtWorkingUnit2tthcClp oldClpModel = (OEPUserMgtWorkingUnit2tthcClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getOEPUserMgtWorkingUnit2tthcRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputThamSoHeThong(BaseModel<?> oldModel) {
		ThamSoHeThongClp oldClpModel = (ThamSoHeThongClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getThamSoHeThongRemoteModel();

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
					"vn.dtt.duongbo.dao.motcua.model.impl.MotCuaAnhXaTrangThaiImpl")) {
			return translateOutputMotCuaAnhXaTrangThai(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiImpl")) {
			return translateOutputMotCuaChuyenDichTrangThai(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoImpl")) {
			return translateOutputMotCuaDienBienHoSo(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.motcua.model.impl.MotCuaKetQuaDienBienImpl")) {
			return translateOutputMotCuaKetQuaDienBien(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.motcua.model.impl.MotCuaNhanTraHoSoImpl")) {
			return translateOutputMotCuaNhanTraHoSo(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhanCongXuLyImpl")) {
			return translateOutputMotCuaPhanCongXuLy(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyImpl")) {
			return translateOutputMotCuaPhieuXuLy(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucImpl")) {
			return translateOutputMotCuaQuyTrinhThuTuc(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCImpl")) {
			return translateOutputMotCuaQuyTrinhThuTucTTHC(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.motcua.model.impl.MotCuaTrangThaiHoSoImpl")) {
			return translateOutputMotCuaTrangThaiHoSo(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.motcua.model.impl.OEPThuTucHanhChinhRoleImpl")) {
			return translateOutputOEPThuTucHanhChinhRole(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeImpl")) {
			return translateOutputOEPUserMgtEmployee(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployee2jobposImpl")) {
			return translateOutputOEPUserMgtEmployee2jobpos(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtJobposImpl")) {
			return translateOutputOEPUserMgtJobpos(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtJobpos2roleImpl")) {
			return translateOutputOEPUserMgtJobpos2role(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnitImpl")) {
			return translateOutputOEPUserMgtWorkingUnit(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnit2tthcImpl")) {
			return translateOutputOEPUserMgtWorkingUnit2tthc(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbo.dao.motcua.model.impl.ThamSoHeThongImpl")) {
			return translateOutputThamSoHeThong(oldModel);
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
					"vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException")) {
			return new vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException")) {
			return new vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException")) {
			return new vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.motcua.NoSuchMotCuaKetQuaDienBienException")) {
			return new vn.dtt.duongbo.dao.motcua.NoSuchMotCuaKetQuaDienBienException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.motcua.NoSuchMotCuaNhanTraHoSoException")) {
			return new vn.dtt.duongbo.dao.motcua.NoSuchMotCuaNhanTraHoSoException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhanCongXuLyException")) {
			return new vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhanCongXuLyException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException")) {
			return new vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException")) {
			return new vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException")) {
			return new vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException")) {
			return new vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.motcua.NoSuchOEPThuTucHanhChinhRoleException")) {
			return new vn.dtt.duongbo.dao.motcua.NoSuchOEPThuTucHanhChinhRoleException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException")) {
			return new vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployee2jobposException")) {
			return new vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployee2jobposException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobposException")) {
			return new vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobposException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobpos2roleException")) {
			return new vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtJobpos2roleException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException")) {
			return new vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException")) {
			return new vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException();
		}

		if (className.equals(
					"vn.dtt.duongbo.dao.motcua.NoSuchThamSoHeThongException")) {
			return new vn.dtt.duongbo.dao.motcua.NoSuchThamSoHeThongException();
		}

		return throwable;
	}

	public static Object translateOutputMotCuaAnhXaTrangThai(
		BaseModel<?> oldModel) {
		MotCuaAnhXaTrangThaiClp newModel = new MotCuaAnhXaTrangThaiClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMotCuaAnhXaTrangThaiRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMotCuaChuyenDichTrangThai(
		BaseModel<?> oldModel) {
		MotCuaChuyenDichTrangThaiClp newModel = new MotCuaChuyenDichTrangThaiClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMotCuaChuyenDichTrangThaiRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMotCuaDienBienHoSo(
		BaseModel<?> oldModel) {
		MotCuaDienBienHoSoClp newModel = new MotCuaDienBienHoSoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMotCuaDienBienHoSoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMotCuaKetQuaDienBien(
		BaseModel<?> oldModel) {
		MotCuaKetQuaDienBienClp newModel = new MotCuaKetQuaDienBienClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMotCuaKetQuaDienBienRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMotCuaNhanTraHoSo(BaseModel<?> oldModel) {
		MotCuaNhanTraHoSoClp newModel = new MotCuaNhanTraHoSoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMotCuaNhanTraHoSoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMotCuaPhanCongXuLy(
		BaseModel<?> oldModel) {
		MotCuaPhanCongXuLyClp newModel = new MotCuaPhanCongXuLyClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMotCuaPhanCongXuLyRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMotCuaPhieuXuLy(BaseModel<?> oldModel) {
		MotCuaPhieuXuLyClp newModel = new MotCuaPhieuXuLyClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMotCuaPhieuXuLyRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMotCuaQuyTrinhThuTuc(
		BaseModel<?> oldModel) {
		MotCuaQuyTrinhThuTucClp newModel = new MotCuaQuyTrinhThuTucClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMotCuaQuyTrinhThuTucRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMotCuaQuyTrinhThuTucTTHC(
		BaseModel<?> oldModel) {
		MotCuaQuyTrinhThuTucTTHCClp newModel = new MotCuaQuyTrinhThuTucTTHCClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMotCuaQuyTrinhThuTucTTHCRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMotCuaTrangThaiHoSo(
		BaseModel<?> oldModel) {
		MotCuaTrangThaiHoSoClp newModel = new MotCuaTrangThaiHoSoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMotCuaTrangThaiHoSoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputOEPThuTucHanhChinhRole(
		BaseModel<?> oldModel) {
		OEPThuTucHanhChinhRoleClp newModel = new OEPThuTucHanhChinhRoleClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setOEPThuTucHanhChinhRoleRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputOEPUserMgtEmployee(
		BaseModel<?> oldModel) {
		OEPUserMgtEmployeeClp newModel = new OEPUserMgtEmployeeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setOEPUserMgtEmployeeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputOEPUserMgtEmployee2jobpos(
		BaseModel<?> oldModel) {
		OEPUserMgtEmployee2jobposClp newModel = new OEPUserMgtEmployee2jobposClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setOEPUserMgtEmployee2jobposRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputOEPUserMgtJobpos(BaseModel<?> oldModel) {
		OEPUserMgtJobposClp newModel = new OEPUserMgtJobposClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setOEPUserMgtJobposRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputOEPUserMgtJobpos2role(
		BaseModel<?> oldModel) {
		OEPUserMgtJobpos2roleClp newModel = new OEPUserMgtJobpos2roleClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setOEPUserMgtJobpos2roleRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputOEPUserMgtWorkingUnit(
		BaseModel<?> oldModel) {
		OEPUserMgtWorkingUnitClp newModel = new OEPUserMgtWorkingUnitClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setOEPUserMgtWorkingUnitRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputOEPUserMgtWorkingUnit2tthc(
		BaseModel<?> oldModel) {
		OEPUserMgtWorkingUnit2tthcClp newModel = new OEPUserMgtWorkingUnit2tthcClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setOEPUserMgtWorkingUnit2tthcRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputThamSoHeThong(BaseModel<?> oldModel) {
		ThamSoHeThongClp newModel = new ThamSoHeThongClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setThamSoHeThongRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}