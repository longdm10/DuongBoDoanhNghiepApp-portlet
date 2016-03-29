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
import vn.dtt.duongbo.dao.motcua.service.OEPThuTucHanhChinhRoleLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class OEPThuTucHanhChinhRoleClp extends BaseModelImpl<OEPThuTucHanhChinhRole>
	implements OEPThuTucHanhChinhRole {
	public OEPThuTucHanhChinhRoleClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return OEPThuTucHanhChinhRole.class;
	}

	@Override
	public String getModelClassName() {
		return OEPThuTucHanhChinhRole.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thuTucHinhChinhId", getThuTucHinhChinhId());
		attributes.put("vaiTroThucHien", getVaiTroThucHien());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer thuTucHinhChinhId = (Integer)attributes.get("thuTucHinhChinhId");

		if (thuTucHinhChinhId != null) {
			setThuTucHinhChinhId(thuTucHinhChinhId);
		}

		Integer vaiTroThucHien = (Integer)attributes.get("vaiTroThucHien");

		if (vaiTroThucHien != null) {
			setVaiTroThucHien(vaiTroThucHien);
		}
	}

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;

		if (_oepThuTucHanhChinhRoleRemoteModel != null) {
			try {
				Class<?> clazz = _oepThuTucHanhChinhRoleRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_oepThuTucHanhChinhRoleRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThuTucHinhChinhId() {
		return _thuTucHinhChinhId;
	}

	@Override
	public void setThuTucHinhChinhId(int thuTucHinhChinhId) {
		_thuTucHinhChinhId = thuTucHinhChinhId;

		if (_oepThuTucHanhChinhRoleRemoteModel != null) {
			try {
				Class<?> clazz = _oepThuTucHanhChinhRoleRemoteModel.getClass();

				Method method = clazz.getMethod("setThuTucHinhChinhId",
						int.class);

				method.invoke(_oepThuTucHanhChinhRoleRemoteModel,
					thuTucHinhChinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getVaiTroThucHien() {
		return _vaiTroThucHien;
	}

	@Override
	public void setVaiTroThucHien(int vaiTroThucHien) {
		_vaiTroThucHien = vaiTroThucHien;

		if (_oepThuTucHanhChinhRoleRemoteModel != null) {
			try {
				Class<?> clazz = _oepThuTucHanhChinhRoleRemoteModel.getClass();

				Method method = clazz.getMethod("setVaiTroThucHien", int.class);

				method.invoke(_oepThuTucHanhChinhRoleRemoteModel, vaiTroThucHien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getOEPThuTucHanhChinhRoleRemoteModel() {
		return _oepThuTucHanhChinhRoleRemoteModel;
	}

	public void setOEPThuTucHanhChinhRoleRemoteModel(
		BaseModel<?> oepThuTucHanhChinhRoleRemoteModel) {
		_oepThuTucHanhChinhRoleRemoteModel = oepThuTucHanhChinhRoleRemoteModel;
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

		Class<?> remoteModelClass = _oepThuTucHanhChinhRoleRemoteModel.getClass();

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

		Object returnValue = method.invoke(_oepThuTucHanhChinhRoleRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			OEPThuTucHanhChinhRoleLocalServiceUtil.addOEPThuTucHanhChinhRole(this);
		}
		else {
			OEPThuTucHanhChinhRoleLocalServiceUtil.updateOEPThuTucHanhChinhRole(this);
		}
	}

	@Override
	public OEPThuTucHanhChinhRole toEscapedModel() {
		return (OEPThuTucHanhChinhRole)ProxyUtil.newProxyInstance(OEPThuTucHanhChinhRole.class.getClassLoader(),
			new Class[] { OEPThuTucHanhChinhRole.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		OEPThuTucHanhChinhRoleClp clone = new OEPThuTucHanhChinhRoleClp();

		clone.setId(getId());
		clone.setThuTucHinhChinhId(getThuTucHinhChinhId());
		clone.setVaiTroThucHien(getVaiTroThucHien());

		return clone;
	}

	@Override
	public int compareTo(OEPThuTucHanhChinhRole oepThuTucHanhChinhRole) {
		int primaryKey = oepThuTucHanhChinhRole.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OEPThuTucHanhChinhRoleClp)) {
			return false;
		}

		OEPThuTucHanhChinhRoleClp oepThuTucHanhChinhRole = (OEPThuTucHanhChinhRoleClp)obj;

		int primaryKey = oepThuTucHanhChinhRole.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", thuTucHinhChinhId=");
		sb.append(getThuTucHinhChinhId());
		sb.append(", vaiTroThucHien=");
		sb.append(getVaiTroThucHien());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.motcua.model.OEPThuTucHanhChinhRole");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thuTucHinhChinhId</column-name><column-value><![CDATA[");
		sb.append(getThuTucHinhChinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vaiTroThucHien</column-name><column-value><![CDATA[");
		sb.append(getVaiTroThucHien());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private int _thuTucHinhChinhId;
	private int _vaiTroThucHien;
	private BaseModel<?> _oepThuTucHanhChinhRoleRemoteModel;
}