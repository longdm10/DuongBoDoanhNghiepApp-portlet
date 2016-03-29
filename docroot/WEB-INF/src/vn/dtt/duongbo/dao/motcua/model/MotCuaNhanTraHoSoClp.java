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

package vn.dtt.duongbo.dao.motcua.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.motcua.service.ClpSerializer;
import vn.dtt.duongbo.dao.motcua.service.MotCuaNhanTraHoSoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class MotCuaNhanTraHoSoClp extends BaseModelImpl<MotCuaNhanTraHoSo>
	implements MotCuaNhanTraHoSo {
	public MotCuaNhanTraHoSoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaNhanTraHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaNhanTraHoSo.class.getName();
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
		attributes.put("tenNguoiNop", getTenNguoiNop());
		attributes.put("cmndNguoiNop", getCmndNguoiNop());
		attributes.put("diaChiNguoiNop", getDiaChiNguoiNop());
		attributes.put("soDienThoaiNguoiNop", getSoDienThoaiNguoiNop());
		attributes.put("emailNguoiNop", getEmailNguoiNop());

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

		String tenNguoiNop = (String)attributes.get("tenNguoiNop");

		if (tenNguoiNop != null) {
			setTenNguoiNop(tenNguoiNop);
		}

		String cmndNguoiNop = (String)attributes.get("cmndNguoiNop");

		if (cmndNguoiNop != null) {
			setCmndNguoiNop(cmndNguoiNop);
		}

		String diaChiNguoiNop = (String)attributes.get("diaChiNguoiNop");

		if (diaChiNguoiNop != null) {
			setDiaChiNguoiNop(diaChiNguoiNop);
		}

		String soDienThoaiNguoiNop = (String)attributes.get(
				"soDienThoaiNguoiNop");

		if (soDienThoaiNguoiNop != null) {
			setSoDienThoaiNguoiNop(soDienThoaiNguoiNop);
		}

		String emailNguoiNop = (String)attributes.get("emailNguoiNop");

		if (emailNguoiNop != null) {
			setEmailNguoiNop(emailNguoiNop);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_motCuaNhanTraHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaNhanTraHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_motCuaNhanTraHoSoRemoteModel, id);
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

		if (_motCuaNhanTraHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaNhanTraHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_motCuaNhanTraHoSoRemoteModel, hoSoThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenNguoiNop() {
		return _tenNguoiNop;
	}

	@Override
	public void setTenNguoiNop(String tenNguoiNop) {
		_tenNguoiNop = tenNguoiNop;

		if (_motCuaNhanTraHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaNhanTraHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTenNguoiNop", String.class);

				method.invoke(_motCuaNhanTraHoSoRemoteModel, tenNguoiNop);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCmndNguoiNop() {
		return _cmndNguoiNop;
	}

	@Override
	public void setCmndNguoiNop(String cmndNguoiNop) {
		_cmndNguoiNop = cmndNguoiNop;

		if (_motCuaNhanTraHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaNhanTraHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setCmndNguoiNop", String.class);

				method.invoke(_motCuaNhanTraHoSoRemoteModel, cmndNguoiNop);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaChiNguoiNop() {
		return _diaChiNguoiNop;
	}

	@Override
	public void setDiaChiNguoiNop(String diaChiNguoiNop) {
		_diaChiNguoiNop = diaChiNguoiNop;

		if (_motCuaNhanTraHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaNhanTraHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiNguoiNop",
						String.class);

				method.invoke(_motCuaNhanTraHoSoRemoteModel, diaChiNguoiNop);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoDienThoaiNguoiNop() {
		return _soDienThoaiNguoiNop;
	}

	@Override
	public void setSoDienThoaiNguoiNop(String soDienThoaiNguoiNop) {
		_soDienThoaiNguoiNop = soDienThoaiNguoiNop;

		if (_motCuaNhanTraHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaNhanTraHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setSoDienThoaiNguoiNop",
						String.class);

				method.invoke(_motCuaNhanTraHoSoRemoteModel, soDienThoaiNguoiNop);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmailNguoiNop() {
		return _emailNguoiNop;
	}

	@Override
	public void setEmailNguoiNop(String emailNguoiNop) {
		_emailNguoiNop = emailNguoiNop;

		if (_motCuaNhanTraHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaNhanTraHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setEmailNguoiNop", String.class);

				method.invoke(_motCuaNhanTraHoSoRemoteModel, emailNguoiNop);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMotCuaNhanTraHoSoRemoteModel() {
		return _motCuaNhanTraHoSoRemoteModel;
	}

	public void setMotCuaNhanTraHoSoRemoteModel(
		BaseModel<?> motCuaNhanTraHoSoRemoteModel) {
		_motCuaNhanTraHoSoRemoteModel = motCuaNhanTraHoSoRemoteModel;
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

		Class<?> remoteModelClass = _motCuaNhanTraHoSoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_motCuaNhanTraHoSoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MotCuaNhanTraHoSoLocalServiceUtil.addMotCuaNhanTraHoSo(this);
		}
		else {
			MotCuaNhanTraHoSoLocalServiceUtil.updateMotCuaNhanTraHoSo(this);
		}
	}

	@Override
	public MotCuaNhanTraHoSo toEscapedModel() {
		return (MotCuaNhanTraHoSo)ProxyUtil.newProxyInstance(MotCuaNhanTraHoSo.class.getClassLoader(),
			new Class[] { MotCuaNhanTraHoSo.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MotCuaNhanTraHoSoClp clone = new MotCuaNhanTraHoSoClp();

		clone.setId(getId());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setTenNguoiNop(getTenNguoiNop());
		clone.setCmndNguoiNop(getCmndNguoiNop());
		clone.setDiaChiNguoiNop(getDiaChiNguoiNop());
		clone.setSoDienThoaiNguoiNop(getSoDienThoaiNguoiNop());
		clone.setEmailNguoiNop(getEmailNguoiNop());

		return clone;
	}

	@Override
	public int compareTo(MotCuaNhanTraHoSo motCuaNhanTraHoSo) {
		int value = 0;

		if (getId() < motCuaNhanTraHoSo.getId()) {
			value = -1;
		}
		else if (getId() > motCuaNhanTraHoSo.getId()) {
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

		if (!(obj instanceof MotCuaNhanTraHoSoClp)) {
			return false;
		}

		MotCuaNhanTraHoSoClp motCuaNhanTraHoSo = (MotCuaNhanTraHoSoClp)obj;

		long primaryKey = motCuaNhanTraHoSo.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", tenNguoiNop=");
		sb.append(getTenNguoiNop());
		sb.append(", cmndNguoiNop=");
		sb.append(getCmndNguoiNop());
		sb.append(", diaChiNguoiNop=");
		sb.append(getDiaChiNguoiNop());
		sb.append(", soDienThoaiNguoiNop=");
		sb.append(getSoDienThoaiNguoiNop());
		sb.append(", emailNguoiNop=");
		sb.append(getEmailNguoiNop());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo");
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
			"<column><column-name>tenNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getTenNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cmndNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getCmndNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diaChiNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getDiaChiNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soDienThoaiNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getSoDienThoaiNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getEmailNguoiNop());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _hoSoThuTucId;
	private String _tenNguoiNop;
	private String _cmndNguoiNop;
	private String _diaChiNguoiNop;
	private String _soDienThoaiNguoiNop;
	private String _emailNguoiNop;
	private BaseModel<?> _motCuaNhanTraHoSoRemoteModel;
}