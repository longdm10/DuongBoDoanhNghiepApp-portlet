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

package vn.dtt.duongbo.dao.nghiepvu.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.nghiepvu.service.ClpSerializer;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author NhanNc
 */
public class QlvtThongTinXuLyClp extends BaseModelImpl<QlvtThongTinXuLy>
	implements QlvtThongTinXuLy {
	public QlvtThongTinXuLyClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QlvtThongTinXuLy.class;
	}

	@Override
	public String getModelClassName() {
		return QlvtThongTinXuLy.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("ketQuaXuLy", getKetQuaXuLy());
		attributes.put("thongTinHoSoId", getThongTinHoSoId());
		attributes.put("maSoHoSo", getMaSoHoSo());
		attributes.put("canBoXuLy", getCanBoXuLy());
		attributes.put("thoiGianXuLy", getThoiGianXuLy());
		attributes.put("yKienCanBoXuLy", getYKienCanBoXuLy());
		attributes.put("lanhDaoDuyet", getLanhDaoDuyet());
		attributes.put("yKienLanhDaoDuyet", getYKienLanhDaoDuyet());
		attributes.put("thoiGianDuyet", getThoiGianDuyet());
		attributes.put("ketQuaDuyet", getKetQuaDuyet());
		attributes.put("lanhDaoPheDuyet", getLanhDaoPheDuyet());
		attributes.put("thoiGianPheDuyet", getThoiGianPheDuyet());
		attributes.put("ketQuaPheDuyet", getKetQuaPheDuyet());
		attributes.put("yKienLanhDaoPheDuyet", getYKienLanhDaoPheDuyet());
		attributes.put("nguoiTraKetQua", getNguoiTraKetQua());
		attributes.put("thoiGianTraKetQua", getThoiGianTraKetQua());
		attributes.put("thoiGianCapPhep", getThoiGianCapPhep());
		attributes.put("ketQuaThamDinhXML", getKetQuaThamDinhXML());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String ketQuaXuLy = (String)attributes.get("ketQuaXuLy");

		if (ketQuaXuLy != null) {
			setKetQuaXuLy(ketQuaXuLy);
		}

		Long thongTinHoSoId = (Long)attributes.get("thongTinHoSoId");

		if (thongTinHoSoId != null) {
			setThongTinHoSoId(thongTinHoSoId);
		}

		String maSoHoSo = (String)attributes.get("maSoHoSo");

		if (maSoHoSo != null) {
			setMaSoHoSo(maSoHoSo);
		}

		Integer canBoXuLy = (Integer)attributes.get("canBoXuLy");

		if (canBoXuLy != null) {
			setCanBoXuLy(canBoXuLy);
		}

		Date thoiGianXuLy = (Date)attributes.get("thoiGianXuLy");

		if (thoiGianXuLy != null) {
			setThoiGianXuLy(thoiGianXuLy);
		}

		String yKienCanBoXuLy = (String)attributes.get("yKienCanBoXuLy");

		if (yKienCanBoXuLy != null) {
			setYKienCanBoXuLy(yKienCanBoXuLy);
		}

		Integer lanhDaoDuyet = (Integer)attributes.get("lanhDaoDuyet");

		if (lanhDaoDuyet != null) {
			setLanhDaoDuyet(lanhDaoDuyet);
		}

		String yKienLanhDaoDuyet = (String)attributes.get("yKienLanhDaoDuyet");

		if (yKienLanhDaoDuyet != null) {
			setYKienLanhDaoDuyet(yKienLanhDaoDuyet);
		}

		Date thoiGianDuyet = (Date)attributes.get("thoiGianDuyet");

		if (thoiGianDuyet != null) {
			setThoiGianDuyet(thoiGianDuyet);
		}

		Integer ketQuaDuyet = (Integer)attributes.get("ketQuaDuyet");

		if (ketQuaDuyet != null) {
			setKetQuaDuyet(ketQuaDuyet);
		}

		Integer lanhDaoPheDuyet = (Integer)attributes.get("lanhDaoPheDuyet");

		if (lanhDaoPheDuyet != null) {
			setLanhDaoPheDuyet(lanhDaoPheDuyet);
		}

		Date thoiGianPheDuyet = (Date)attributes.get("thoiGianPheDuyet");

		if (thoiGianPheDuyet != null) {
			setThoiGianPheDuyet(thoiGianPheDuyet);
		}

		Integer ketQuaPheDuyet = (Integer)attributes.get("ketQuaPheDuyet");

		if (ketQuaPheDuyet != null) {
			setKetQuaPheDuyet(ketQuaPheDuyet);
		}

		String yKienLanhDaoPheDuyet = (String)attributes.get(
				"yKienLanhDaoPheDuyet");

		if (yKienLanhDaoPheDuyet != null) {
			setYKienLanhDaoPheDuyet(yKienLanhDaoPheDuyet);
		}

		Integer nguoiTraKetQua = (Integer)attributes.get("nguoiTraKetQua");

		if (nguoiTraKetQua != null) {
			setNguoiTraKetQua(nguoiTraKetQua);
		}

		Date thoiGianTraKetQua = (Date)attributes.get("thoiGianTraKetQua");

		if (thoiGianTraKetQua != null) {
			setThoiGianTraKetQua(thoiGianTraKetQua);
		}

		Date thoiGianCapPhep = (Date)attributes.get("thoiGianCapPhep");

		if (thoiGianCapPhep != null) {
			setThoiGianCapPhep(thoiGianCapPhep);
		}

		String ketQuaThamDinhXML = (String)attributes.get("ketQuaThamDinhXML");

		if (ketQuaThamDinhXML != null) {
			setKetQuaThamDinhXML(ketQuaThamDinhXML);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_qlvtThongTinXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_qlvtThongTinXuLyRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKetQuaXuLy() {
		return _ketQuaXuLy;
	}

	@Override
	public void setKetQuaXuLy(String ketQuaXuLy) {
		_ketQuaXuLy = ketQuaXuLy;

		if (_qlvtThongTinXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setKetQuaXuLy", String.class);

				method.invoke(_qlvtThongTinXuLyRemoteModel, ketQuaXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getThongTinHoSoId() {
		return _thongTinHoSoId;
	}

	@Override
	public void setThongTinHoSoId(long thongTinHoSoId) {
		_thongTinHoSoId = thongTinHoSoId;

		if (_qlvtThongTinXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setThongTinHoSoId", long.class);

				method.invoke(_qlvtThongTinXuLyRemoteModel, thongTinHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaSoHoSo() {
		return _maSoHoSo;
	}

	@Override
	public void setMaSoHoSo(String maSoHoSo) {
		_maSoHoSo = maSoHoSo;

		if (_qlvtThongTinXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setMaSoHoSo", String.class);

				method.invoke(_qlvtThongTinXuLyRemoteModel, maSoHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCanBoXuLy() {
		return _canBoXuLy;
	}

	@Override
	public void setCanBoXuLy(int canBoXuLy) {
		_canBoXuLy = canBoXuLy;

		if (_qlvtThongTinXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setCanBoXuLy", int.class);

				method.invoke(_qlvtThongTinXuLyRemoteModel, canBoXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiGianXuLy() {
		return _thoiGianXuLy;
	}

	@Override
	public void setThoiGianXuLy(Date thoiGianXuLy) {
		_thoiGianXuLy = thoiGianXuLy;

		if (_qlvtThongTinXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiGianXuLy", Date.class);

				method.invoke(_qlvtThongTinXuLyRemoteModel, thoiGianXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getYKienCanBoXuLy() {
		return _yKienCanBoXuLy;
	}

	@Override
	public void setYKienCanBoXuLy(String yKienCanBoXuLy) {
		_yKienCanBoXuLy = yKienCanBoXuLy;

		if (_qlvtThongTinXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setYKienCanBoXuLy",
						String.class);

				method.invoke(_qlvtThongTinXuLyRemoteModel, yKienCanBoXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLanhDaoDuyet() {
		return _lanhDaoDuyet;
	}

	@Override
	public void setLanhDaoDuyet(int lanhDaoDuyet) {
		_lanhDaoDuyet = lanhDaoDuyet;

		if (_qlvtThongTinXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setLanhDaoDuyet", int.class);

				method.invoke(_qlvtThongTinXuLyRemoteModel, lanhDaoDuyet);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getYKienLanhDaoDuyet() {
		return _yKienLanhDaoDuyet;
	}

	@Override
	public void setYKienLanhDaoDuyet(String yKienLanhDaoDuyet) {
		_yKienLanhDaoDuyet = yKienLanhDaoDuyet;

		if (_qlvtThongTinXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setYKienLanhDaoDuyet",
						String.class);

				method.invoke(_qlvtThongTinXuLyRemoteModel, yKienLanhDaoDuyet);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiGianDuyet() {
		return _thoiGianDuyet;
	}

	@Override
	public void setThoiGianDuyet(Date thoiGianDuyet) {
		_thoiGianDuyet = thoiGianDuyet;

		if (_qlvtThongTinXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiGianDuyet", Date.class);

				method.invoke(_qlvtThongTinXuLyRemoteModel, thoiGianDuyet);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getKetQuaDuyet() {
		return _ketQuaDuyet;
	}

	@Override
	public void setKetQuaDuyet(int ketQuaDuyet) {
		_ketQuaDuyet = ketQuaDuyet;

		if (_qlvtThongTinXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setKetQuaDuyet", int.class);

				method.invoke(_qlvtThongTinXuLyRemoteModel, ketQuaDuyet);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLanhDaoPheDuyet() {
		return _lanhDaoPheDuyet;
	}

	@Override
	public void setLanhDaoPheDuyet(int lanhDaoPheDuyet) {
		_lanhDaoPheDuyet = lanhDaoPheDuyet;

		if (_qlvtThongTinXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setLanhDaoPheDuyet", int.class);

				method.invoke(_qlvtThongTinXuLyRemoteModel, lanhDaoPheDuyet);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiGianPheDuyet() {
		return _thoiGianPheDuyet;
	}

	@Override
	public void setThoiGianPheDuyet(Date thoiGianPheDuyet) {
		_thoiGianPheDuyet = thoiGianPheDuyet;

		if (_qlvtThongTinXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiGianPheDuyet",
						Date.class);

				method.invoke(_qlvtThongTinXuLyRemoteModel, thoiGianPheDuyet);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getKetQuaPheDuyet() {
		return _ketQuaPheDuyet;
	}

	@Override
	public void setKetQuaPheDuyet(int ketQuaPheDuyet) {
		_ketQuaPheDuyet = ketQuaPheDuyet;

		if (_qlvtThongTinXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setKetQuaPheDuyet", int.class);

				method.invoke(_qlvtThongTinXuLyRemoteModel, ketQuaPheDuyet);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getYKienLanhDaoPheDuyet() {
		return _yKienLanhDaoPheDuyet;
	}

	@Override
	public void setYKienLanhDaoPheDuyet(String yKienLanhDaoPheDuyet) {
		_yKienLanhDaoPheDuyet = yKienLanhDaoPheDuyet;

		if (_qlvtThongTinXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setYKienLanhDaoPheDuyet",
						String.class);

				method.invoke(_qlvtThongTinXuLyRemoteModel, yKienLanhDaoPheDuyet);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNguoiTraKetQua() {
		return _nguoiTraKetQua;
	}

	@Override
	public void setNguoiTraKetQua(int nguoiTraKetQua) {
		_nguoiTraKetQua = nguoiTraKetQua;

		if (_qlvtThongTinXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiTraKetQua", int.class);

				method.invoke(_qlvtThongTinXuLyRemoteModel, nguoiTraKetQua);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiGianTraKetQua() {
		return _thoiGianTraKetQua;
	}

	@Override
	public void setThoiGianTraKetQua(Date thoiGianTraKetQua) {
		_thoiGianTraKetQua = thoiGianTraKetQua;

		if (_qlvtThongTinXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiGianTraKetQua",
						Date.class);

				method.invoke(_qlvtThongTinXuLyRemoteModel, thoiGianTraKetQua);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getThoiGianCapPhep() {
		return _thoiGianCapPhep;
	}

	@Override
	public void setThoiGianCapPhep(Date thoiGianCapPhep) {
		_thoiGianCapPhep = thoiGianCapPhep;

		if (_qlvtThongTinXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setThoiGianCapPhep", Date.class);

				method.invoke(_qlvtThongTinXuLyRemoteModel, thoiGianCapPhep);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKetQuaThamDinhXML() {
		return _ketQuaThamDinhXML;
	}

	@Override
	public void setKetQuaThamDinhXML(String ketQuaThamDinhXML) {
		_ketQuaThamDinhXML = ketQuaThamDinhXML;

		if (_qlvtThongTinXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _qlvtThongTinXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setKetQuaThamDinhXML",
						String.class);

				method.invoke(_qlvtThongTinXuLyRemoteModel, ketQuaThamDinhXML);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQlvtThongTinXuLyRemoteModel() {
		return _qlvtThongTinXuLyRemoteModel;
	}

	public void setQlvtThongTinXuLyRemoteModel(
		BaseModel<?> qlvtThongTinXuLyRemoteModel) {
		_qlvtThongTinXuLyRemoteModel = qlvtThongTinXuLyRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _qlvtThongTinXuLyRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_qlvtThongTinXuLyRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtThongTinXuLyLocalServiceUtil.addQlvtThongTinXuLy(this);
		}
		else {
			QlvtThongTinXuLyLocalServiceUtil.updateQlvtThongTinXuLy(this);
		}
	}

	@Override
	public QlvtThongTinXuLy toEscapedModel() {
		return (QlvtThongTinXuLy)ProxyUtil.newProxyInstance(QlvtThongTinXuLy.class.getClassLoader(),
			new Class[] { QlvtThongTinXuLy.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QlvtThongTinXuLyClp clone = new QlvtThongTinXuLyClp();

		clone.setId(getId());
		clone.setKetQuaXuLy(getKetQuaXuLy());
		clone.setThongTinHoSoId(getThongTinHoSoId());
		clone.setMaSoHoSo(getMaSoHoSo());
		clone.setCanBoXuLy(getCanBoXuLy());
		clone.setThoiGianXuLy(getThoiGianXuLy());
		clone.setYKienCanBoXuLy(getYKienCanBoXuLy());
		clone.setLanhDaoDuyet(getLanhDaoDuyet());
		clone.setYKienLanhDaoDuyet(getYKienLanhDaoDuyet());
		clone.setThoiGianDuyet(getThoiGianDuyet());
		clone.setKetQuaDuyet(getKetQuaDuyet());
		clone.setLanhDaoPheDuyet(getLanhDaoPheDuyet());
		clone.setThoiGianPheDuyet(getThoiGianPheDuyet());
		clone.setKetQuaPheDuyet(getKetQuaPheDuyet());
		clone.setYKienLanhDaoPheDuyet(getYKienLanhDaoPheDuyet());
		clone.setNguoiTraKetQua(getNguoiTraKetQua());
		clone.setThoiGianTraKetQua(getThoiGianTraKetQua());
		clone.setThoiGianCapPhep(getThoiGianCapPhep());
		clone.setKetQuaThamDinhXML(getKetQuaThamDinhXML());

		return clone;
	}

	@Override
	public int compareTo(QlvtThongTinXuLy qlvtThongTinXuLy) {
		int value = 0;

		if (getId() < qlvtThongTinXuLy.getId()) {
			value = -1;
		}
		else if (getId() > qlvtThongTinXuLy.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QlvtThongTinXuLyClp)) {
			return false;
		}

		QlvtThongTinXuLyClp qlvtThongTinXuLy = (QlvtThongTinXuLyClp)obj;

		long primaryKey = qlvtThongTinXuLy.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", ketQuaXuLy=");
		sb.append(getKetQuaXuLy());
		sb.append(", thongTinHoSoId=");
		sb.append(getThongTinHoSoId());
		sb.append(", maSoHoSo=");
		sb.append(getMaSoHoSo());
		sb.append(", canBoXuLy=");
		sb.append(getCanBoXuLy());
		sb.append(", thoiGianXuLy=");
		sb.append(getThoiGianXuLy());
		sb.append(", yKienCanBoXuLy=");
		sb.append(getYKienCanBoXuLy());
		sb.append(", lanhDaoDuyet=");
		sb.append(getLanhDaoDuyet());
		sb.append(", yKienLanhDaoDuyet=");
		sb.append(getYKienLanhDaoDuyet());
		sb.append(", thoiGianDuyet=");
		sb.append(getThoiGianDuyet());
		sb.append(", ketQuaDuyet=");
		sb.append(getKetQuaDuyet());
		sb.append(", lanhDaoPheDuyet=");
		sb.append(getLanhDaoPheDuyet());
		sb.append(", thoiGianPheDuyet=");
		sb.append(getThoiGianPheDuyet());
		sb.append(", ketQuaPheDuyet=");
		sb.append(getKetQuaPheDuyet());
		sb.append(", yKienLanhDaoPheDuyet=");
		sb.append(getYKienLanhDaoPheDuyet());
		sb.append(", nguoiTraKetQua=");
		sb.append(getNguoiTraKetQua());
		sb.append(", thoiGianTraKetQua=");
		sb.append(getThoiGianTraKetQua());
		sb.append(", thoiGianCapPhep=");
		sb.append(getThoiGianCapPhep());
		sb.append(", ketQuaThamDinhXML=");
		sb.append(getKetQuaThamDinhXML());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ketQuaXuLy</column-name><column-value><![CDATA[");
		sb.append(getKetQuaXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongTinHoSoId</column-name><column-value><![CDATA[");
		sb.append(getThongTinHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maSoHoSo</column-name><column-value><![CDATA[");
		sb.append(getMaSoHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>canBoXuLy</column-name><column-value><![CDATA[");
		sb.append(getCanBoXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiGianXuLy</column-name><column-value><![CDATA[");
		sb.append(getThoiGianXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yKienCanBoXuLy</column-name><column-value><![CDATA[");
		sb.append(getYKienCanBoXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lanhDaoDuyet</column-name><column-value><![CDATA[");
		sb.append(getLanhDaoDuyet());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yKienLanhDaoDuyet</column-name><column-value><![CDATA[");
		sb.append(getYKienLanhDaoDuyet());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiGianDuyet</column-name><column-value><![CDATA[");
		sb.append(getThoiGianDuyet());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ketQuaDuyet</column-name><column-value><![CDATA[");
		sb.append(getKetQuaDuyet());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lanhDaoPheDuyet</column-name><column-value><![CDATA[");
		sb.append(getLanhDaoPheDuyet());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiGianPheDuyet</column-name><column-value><![CDATA[");
		sb.append(getThoiGianPheDuyet());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ketQuaPheDuyet</column-name><column-value><![CDATA[");
		sb.append(getKetQuaPheDuyet());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yKienLanhDaoPheDuyet</column-name><column-value><![CDATA[");
		sb.append(getYKienLanhDaoPheDuyet());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiTraKetQua</column-name><column-value><![CDATA[");
		sb.append(getNguoiTraKetQua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiGianTraKetQua</column-name><column-value><![CDATA[");
		sb.append(getThoiGianTraKetQua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thoiGianCapPhep</column-name><column-value><![CDATA[");
		sb.append(getThoiGianCapPhep());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ketQuaThamDinhXML</column-name><column-value><![CDATA[");
		sb.append(getKetQuaThamDinhXML());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _ketQuaXuLy;
	private long _thongTinHoSoId;
	private String _maSoHoSo;
	private int _canBoXuLy;
	private Date _thoiGianXuLy;
	private String _yKienCanBoXuLy;
	private int _lanhDaoDuyet;
	private String _yKienLanhDaoDuyet;
	private Date _thoiGianDuyet;
	private int _ketQuaDuyet;
	private int _lanhDaoPheDuyet;
	private Date _thoiGianPheDuyet;
	private int _ketQuaPheDuyet;
	private String _yKienLanhDaoPheDuyet;
	private int _nguoiTraKetQua;
	private Date _thoiGianTraKetQua;
	private Date _thoiGianCapPhep;
	private String _ketQuaThamDinhXML;
	private BaseModel<?> _qlvtThongTinXuLyRemoteModel;
}