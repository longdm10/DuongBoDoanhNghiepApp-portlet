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

package vn.dtt.duongbo.dao.common.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.common.service.ClpSerializer;
import vn.dtt.duongbo.dao.common.service.TthcTrangThaiHoSoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcTrangThaiHoSoClp extends BaseModelImpl<TthcTrangThaiHoSo>
	implements TthcTrangThaiHoSo {
	public TthcTrangThaiHoSoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcTrangThaiHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcTrangThaiHoSo.class.getName();
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
		attributes.put("quyTrinhThuTucId", getQuyTrinhThuTucId());
		attributes.put("maTrangThai", getMaTrangThai());
		attributes.put("tenTrangThai", getTenTrangThai());
		attributes.put("tenTiengAnh", getTenTiengAnh());
		attributes.put("soThuTu", getSoThuTu());
		attributes.put("trangThaiKetThuc", getTrangThaiKetThuc());
		attributes.put("moTaTrangThai", getMoTaTrangThai());
		attributes.put("vaiTroXuLy1", getVaiTroXuLy1());
		attributes.put("vaiTroXuLy2", getVaiTroXuLy2());
		attributes.put("vaiTroXuLy3", getVaiTroXuLy3());
		attributes.put("formXuLy", getFormXuLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long quyTrinhThuTucId = (Long)attributes.get("quyTrinhThuTucId");

		if (quyTrinhThuTucId != null) {
			setQuyTrinhThuTucId(quyTrinhThuTucId);
		}

		String maTrangThai = (String)attributes.get("maTrangThai");

		if (maTrangThai != null) {
			setMaTrangThai(maTrangThai);
		}

		String tenTrangThai = (String)attributes.get("tenTrangThai");

		if (tenTrangThai != null) {
			setTenTrangThai(tenTrangThai);
		}

		String tenTiengAnh = (String)attributes.get("tenTiengAnh");

		if (tenTiengAnh != null) {
			setTenTiengAnh(tenTiengAnh);
		}

		Integer soThuTu = (Integer)attributes.get("soThuTu");

		if (soThuTu != null) {
			setSoThuTu(soThuTu);
		}

		Integer trangThaiKetThuc = (Integer)attributes.get("trangThaiKetThuc");

		if (trangThaiKetThuc != null) {
			setTrangThaiKetThuc(trangThaiKetThuc);
		}

		String moTaTrangThai = (String)attributes.get("moTaTrangThai");

		if (moTaTrangThai != null) {
			setMoTaTrangThai(moTaTrangThai);
		}

		Long vaiTroXuLy1 = (Long)attributes.get("vaiTroXuLy1");

		if (vaiTroXuLy1 != null) {
			setVaiTroXuLy1(vaiTroXuLy1);
		}

		Long vaiTroXuLy2 = (Long)attributes.get("vaiTroXuLy2");

		if (vaiTroXuLy2 != null) {
			setVaiTroXuLy2(vaiTroXuLy2);
		}

		Long vaiTroXuLy3 = (Long)attributes.get("vaiTroXuLy3");

		if (vaiTroXuLy3 != null) {
			setVaiTroXuLy3(vaiTroXuLy3);
		}

		String formXuLy = (String)attributes.get("formXuLy");

		if (formXuLy != null) {
			setFormXuLy(formXuLy);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tthcTrangThaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcTrangThaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcTrangThaiHoSoRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getQuyTrinhThuTucId() {
		return _quyTrinhThuTucId;
	}

	@Override
	public void setQuyTrinhThuTucId(long quyTrinhThuTucId) {
		_quyTrinhThuTucId = quyTrinhThuTucId;

		if (_tthcTrangThaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcTrangThaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setQuyTrinhThuTucId",
						long.class);

				method.invoke(_tthcTrangThaiHoSoRemoteModel, quyTrinhThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTrangThai() {
		return _maTrangThai;
	}

	@Override
	public void setMaTrangThai(String maTrangThai) {
		_maTrangThai = maTrangThai;

		if (_tthcTrangThaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcTrangThaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTrangThai", String.class);

				method.invoke(_tthcTrangThaiHoSoRemoteModel, maTrangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenTrangThai() {
		return _tenTrangThai;
	}

	@Override
	public void setTenTrangThai(String tenTrangThai) {
		_tenTrangThai = tenTrangThai;

		if (_tthcTrangThaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcTrangThaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTenTrangThai", String.class);

				method.invoke(_tthcTrangThaiHoSoRemoteModel, tenTrangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenTiengAnh() {
		return _tenTiengAnh;
	}

	@Override
	public void setTenTiengAnh(String tenTiengAnh) {
		_tenTiengAnh = tenTiengAnh;

		if (_tthcTrangThaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcTrangThaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTenTiengAnh", String.class);

				method.invoke(_tthcTrangThaiHoSoRemoteModel, tenTiengAnh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoThuTu() {
		return _soThuTu;
	}

	@Override
	public void setSoThuTu(int soThuTu) {
		_soThuTu = soThuTu;

		if (_tthcTrangThaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcTrangThaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setSoThuTu", int.class);

				method.invoke(_tthcTrangThaiHoSoRemoteModel, soThuTu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTrangThaiKetThuc() {
		return _trangThaiKetThuc;
	}

	@Override
	public void setTrangThaiKetThuc(int trangThaiKetThuc) {
		_trangThaiKetThuc = trangThaiKetThuc;

		if (_tthcTrangThaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcTrangThaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiKetThuc", int.class);

				method.invoke(_tthcTrangThaiHoSoRemoteModel, trangThaiKetThuc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMoTaTrangThai() {
		return _moTaTrangThai;
	}

	@Override
	public void setMoTaTrangThai(String moTaTrangThai) {
		_moTaTrangThai = moTaTrangThai;

		if (_tthcTrangThaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcTrangThaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setMoTaTrangThai", String.class);

				method.invoke(_tthcTrangThaiHoSoRemoteModel, moTaTrangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVaiTroXuLy1() {
		return _vaiTroXuLy1;
	}

	@Override
	public void setVaiTroXuLy1(long vaiTroXuLy1) {
		_vaiTroXuLy1 = vaiTroXuLy1;

		if (_tthcTrangThaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcTrangThaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setVaiTroXuLy1", long.class);

				method.invoke(_tthcTrangThaiHoSoRemoteModel, vaiTroXuLy1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVaiTroXuLy2() {
		return _vaiTroXuLy2;
	}

	@Override
	public void setVaiTroXuLy2(long vaiTroXuLy2) {
		_vaiTroXuLy2 = vaiTroXuLy2;

		if (_tthcTrangThaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcTrangThaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setVaiTroXuLy2", long.class);

				method.invoke(_tthcTrangThaiHoSoRemoteModel, vaiTroXuLy2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVaiTroXuLy3() {
		return _vaiTroXuLy3;
	}

	@Override
	public void setVaiTroXuLy3(long vaiTroXuLy3) {
		_vaiTroXuLy3 = vaiTroXuLy3;

		if (_tthcTrangThaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcTrangThaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setVaiTroXuLy3", long.class);

				method.invoke(_tthcTrangThaiHoSoRemoteModel, vaiTroXuLy3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFormXuLy() {
		return _formXuLy;
	}

	@Override
	public void setFormXuLy(String formXuLy) {
		_formXuLy = formXuLy;

		if (_tthcTrangThaiHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcTrangThaiHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setFormXuLy", String.class);

				method.invoke(_tthcTrangThaiHoSoRemoteModel, formXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcTrangThaiHoSoRemoteModel() {
		return _tthcTrangThaiHoSoRemoteModel;
	}

	public void setTthcTrangThaiHoSoRemoteModel(
		BaseModel<?> tthcTrangThaiHoSoRemoteModel) {
		_tthcTrangThaiHoSoRemoteModel = tthcTrangThaiHoSoRemoteModel;
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

		Class<?> remoteModelClass = _tthcTrangThaiHoSoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcTrangThaiHoSoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcTrangThaiHoSoLocalServiceUtil.addTthcTrangThaiHoSo(this);
		}
		else {
			TthcTrangThaiHoSoLocalServiceUtil.updateTthcTrangThaiHoSo(this);
		}
	}

	@Override
	public TthcTrangThaiHoSo toEscapedModel() {
		return (TthcTrangThaiHoSo)ProxyUtil.newProxyInstance(TthcTrangThaiHoSo.class.getClassLoader(),
			new Class[] { TthcTrangThaiHoSo.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcTrangThaiHoSoClp clone = new TthcTrangThaiHoSoClp();

		clone.setId(getId());
		clone.setQuyTrinhThuTucId(getQuyTrinhThuTucId());
		clone.setMaTrangThai(getMaTrangThai());
		clone.setTenTrangThai(getTenTrangThai());
		clone.setTenTiengAnh(getTenTiengAnh());
		clone.setSoThuTu(getSoThuTu());
		clone.setTrangThaiKetThuc(getTrangThaiKetThuc());
		clone.setMoTaTrangThai(getMoTaTrangThai());
		clone.setVaiTroXuLy1(getVaiTroXuLy1());
		clone.setVaiTroXuLy2(getVaiTroXuLy2());
		clone.setVaiTroXuLy3(getVaiTroXuLy3());
		clone.setFormXuLy(getFormXuLy());

		return clone;
	}

	@Override
	public int compareTo(TthcTrangThaiHoSo tthcTrangThaiHoSo) {
		int value = 0;

		if (getId() < tthcTrangThaiHoSo.getId()) {
			value = -1;
		}
		else if (getId() > tthcTrangThaiHoSo.getId()) {
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

		if (!(obj instanceof TthcTrangThaiHoSoClp)) {
			return false;
		}

		TthcTrangThaiHoSoClp tthcTrangThaiHoSo = (TthcTrangThaiHoSoClp)obj;

		long primaryKey = tthcTrangThaiHoSo.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", quyTrinhThuTucId=");
		sb.append(getQuyTrinhThuTucId());
		sb.append(", maTrangThai=");
		sb.append(getMaTrangThai());
		sb.append(", tenTrangThai=");
		sb.append(getTenTrangThai());
		sb.append(", tenTiengAnh=");
		sb.append(getTenTiengAnh());
		sb.append(", soThuTu=");
		sb.append(getSoThuTu());
		sb.append(", trangThaiKetThuc=");
		sb.append(getTrangThaiKetThuc());
		sb.append(", moTaTrangThai=");
		sb.append(getMoTaTrangThai());
		sb.append(", vaiTroXuLy1=");
		sb.append(getVaiTroXuLy1());
		sb.append(", vaiTroXuLy2=");
		sb.append(getVaiTroXuLy2());
		sb.append(", vaiTroXuLy3=");
		sb.append(getVaiTroXuLy3());
		sb.append(", formXuLy=");
		sb.append(getFormXuLy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.TthcTrangThaiHoSo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quyTrinhThuTucId</column-name><column-value><![CDATA[");
		sb.append(getQuyTrinhThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTrangThai</column-name><column-value><![CDATA[");
		sb.append(getMaTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenTrangThai</column-name><column-value><![CDATA[");
		sb.append(getTenTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenTiengAnh</column-name><column-value><![CDATA[");
		sb.append(getTenTiengAnh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soThuTu</column-name><column-value><![CDATA[");
		sb.append(getSoThuTu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThaiKetThuc</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiKetThuc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>moTaTrangThai</column-name><column-value><![CDATA[");
		sb.append(getMoTaTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vaiTroXuLy1</column-name><column-value><![CDATA[");
		sb.append(getVaiTroXuLy1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vaiTroXuLy2</column-name><column-value><![CDATA[");
		sb.append(getVaiTroXuLy2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vaiTroXuLy3</column-name><column-value><![CDATA[");
		sb.append(getVaiTroXuLy3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>formXuLy</column-name><column-value><![CDATA[");
		sb.append(getFormXuLy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _quyTrinhThuTucId;
	private String _maTrangThai;
	private String _tenTrangThai;
	private String _tenTiengAnh;
	private int _soThuTu;
	private int _trangThaiKetThuc;
	private String _moTaTrangThai;
	private long _vaiTroXuLy1;
	private long _vaiTroXuLy2;
	private long _vaiTroXuLy3;
	private String _formXuLy;
	private BaseModel<?> _tthcTrangThaiHoSoRemoteModel;
}