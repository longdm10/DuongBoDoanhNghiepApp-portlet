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
import vn.dtt.duongbo.dao.common.service.TthcThongBaoXuLyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcThongBaoXuLyClp extends BaseModelImpl<TthcThongBaoXuLy>
	implements TthcThongBaoXuLy {
	public TthcThongBaoXuLyClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcThongBaoXuLy.class;
	}

	@Override
	public String getModelClassName() {
		return TthcThongBaoXuLy.class.getName();
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
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("maThongBao", getMaThongBao());
		attributes.put("noiDungThongBao", getNoiDungThongBao());
		attributes.put("duLieuThongBao", getDuLieuThongBao());
		attributes.put("ngayGio", getNgayGio());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		String maThongBao = (String)attributes.get("maThongBao");

		if (maThongBao != null) {
			setMaThongBao(maThongBao);
		}

		String noiDungThongBao = (String)attributes.get("noiDungThongBao");

		if (noiDungThongBao != null) {
			setNoiDungThongBao(noiDungThongBao);
		}

		String duLieuThongBao = (String)attributes.get("duLieuThongBao");

		if (duLieuThongBao != null) {
			setDuLieuThongBao(duLieuThongBao);
		}

		Date ngayGio = (Date)attributes.get("ngayGio");

		if (ngayGio != null) {
			setNgayGio(ngayGio);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tthcThongBaoXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThongBaoXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcThongBaoXuLyRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;

		if (_tthcThongBaoXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThongBaoXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_tthcThongBaoXuLyRemoteModel, hoSoThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaThongBao() {
		return _maThongBao;
	}

	@Override
	public void setMaThongBao(String maThongBao) {
		_maThongBao = maThongBao;

		if (_tthcThongBaoXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThongBaoXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setMaThongBao", String.class);

				method.invoke(_tthcThongBaoXuLyRemoteModel, maThongBao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoiDungThongBao() {
		return _noiDungThongBao;
	}

	@Override
	public void setNoiDungThongBao(String noiDungThongBao) {
		_noiDungThongBao = noiDungThongBao;

		if (_tthcThongBaoXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThongBaoXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiDungThongBao",
						String.class);

				method.invoke(_tthcThongBaoXuLyRemoteModel, noiDungThongBao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDuLieuThongBao() {
		return _duLieuThongBao;
	}

	@Override
	public void setDuLieuThongBao(String duLieuThongBao) {
		_duLieuThongBao = duLieuThongBao;

		if (_tthcThongBaoXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThongBaoXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setDuLieuThongBao",
						String.class);

				method.invoke(_tthcThongBaoXuLyRemoteModel, duLieuThongBao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayGio() {
		return _ngayGio;
	}

	@Override
	public void setNgayGio(Date ngayGio) {
		_ngayGio = ngayGio;

		if (_tthcThongBaoXuLyRemoteModel != null) {
			try {
				Class<?> clazz = _tthcThongBaoXuLyRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayGio", Date.class);

				method.invoke(_tthcThongBaoXuLyRemoteModel, ngayGio);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcThongBaoXuLyRemoteModel() {
		return _tthcThongBaoXuLyRemoteModel;
	}

	public void setTthcThongBaoXuLyRemoteModel(
		BaseModel<?> tthcThongBaoXuLyRemoteModel) {
		_tthcThongBaoXuLyRemoteModel = tthcThongBaoXuLyRemoteModel;
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

		Class<?> remoteModelClass = _tthcThongBaoXuLyRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcThongBaoXuLyRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcThongBaoXuLyLocalServiceUtil.addTthcThongBaoXuLy(this);
		}
		else {
			TthcThongBaoXuLyLocalServiceUtil.updateTthcThongBaoXuLy(this);
		}
	}

	@Override
	public TthcThongBaoXuLy toEscapedModel() {
		return (TthcThongBaoXuLy)ProxyUtil.newProxyInstance(TthcThongBaoXuLy.class.getClassLoader(),
			new Class[] { TthcThongBaoXuLy.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcThongBaoXuLyClp clone = new TthcThongBaoXuLyClp();

		clone.setId(getId());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setMaThongBao(getMaThongBao());
		clone.setNoiDungThongBao(getNoiDungThongBao());
		clone.setDuLieuThongBao(getDuLieuThongBao());
		clone.setNgayGio(getNgayGio());

		return clone;
	}

	@Override
	public int compareTo(TthcThongBaoXuLy tthcThongBaoXuLy) {
		int value = 0;

		if (getId() < tthcThongBaoXuLy.getId()) {
			value = -1;
		}
		else if (getId() > tthcThongBaoXuLy.getId()) {
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

		if (!(obj instanceof TthcThongBaoXuLyClp)) {
			return false;
		}

		TthcThongBaoXuLyClp tthcThongBaoXuLy = (TthcThongBaoXuLyClp)obj;

		long primaryKey = tthcThongBaoXuLy.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", maThongBao=");
		sb.append(getMaThongBao());
		sb.append(", noiDungThongBao=");
		sb.append(getNoiDungThongBao());
		sb.append(", duLieuThongBao=");
		sb.append(getDuLieuThongBao());
		sb.append(", ngayGio=");
		sb.append(getNgayGio());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.TthcThongBaoXuLy");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maThongBao</column-name><column-value><![CDATA[");
		sb.append(getMaThongBao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noiDungThongBao</column-name><column-value><![CDATA[");
		sb.append(getNoiDungThongBao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>duLieuThongBao</column-name><column-value><![CDATA[");
		sb.append(getDuLieuThongBao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayGio</column-name><column-value><![CDATA[");
		sb.append(getNgayGio());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _hoSoThuTucId;
	private String _maThongBao;
	private String _noiDungThongBao;
	private String _duLieuThongBao;
	private Date _ngayGio;
	private BaseModel<?> _tthcThongBaoXuLyRemoteModel;
}