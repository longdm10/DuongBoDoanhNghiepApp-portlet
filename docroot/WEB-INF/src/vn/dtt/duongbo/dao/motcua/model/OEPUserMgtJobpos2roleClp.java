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
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtJobpos2roleLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.persistence.OEPUserMgtJobpos2rolePK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class OEPUserMgtJobpos2roleClp extends BaseModelImpl<OEPUserMgtJobpos2role>
	implements OEPUserMgtJobpos2role {
	public OEPUserMgtJobpos2roleClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return OEPUserMgtJobpos2role.class;
	}

	@Override
	public String getModelClassName() {
		return OEPUserMgtJobpos2role.class.getName();
	}

	@Override
	public OEPUserMgtJobpos2rolePK getPrimaryKey() {
		return new OEPUserMgtJobpos2rolePK(_jobPosId, _roleId);
	}

	@Override
	public void setPrimaryKey(OEPUserMgtJobpos2rolePK primaryKey) {
		setJobPosId(primaryKey.jobPosId);
		setRoleId(primaryKey.roleId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new OEPUserMgtJobpos2rolePK(_jobPosId, _roleId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((OEPUserMgtJobpos2rolePK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jobPosId", getJobPosId());
		attributes.put("roleId", getRoleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer jobPosId = (Integer)attributes.get("jobPosId");

		if (jobPosId != null) {
			setJobPosId(jobPosId);
		}

		Integer roleId = (Integer)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}
	}

	@Override
	public int getJobPosId() {
		return _jobPosId;
	}

	@Override
	public void setJobPosId(int jobPosId) {
		_jobPosId = jobPosId;

		if (_oepUserMgtJobpos2roleRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtJobpos2roleRemoteModel.getClass();

				Method method = clazz.getMethod("setJobPosId", int.class);

				method.invoke(_oepUserMgtJobpos2roleRemoteModel, jobPosId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getRoleId() {
		return _roleId;
	}

	@Override
	public void setRoleId(int roleId) {
		_roleId = roleId;

		if (_oepUserMgtJobpos2roleRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtJobpos2roleRemoteModel.getClass();

				Method method = clazz.getMethod("setRoleId", int.class);

				method.invoke(_oepUserMgtJobpos2roleRemoteModel, roleId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getOEPUserMgtJobpos2roleRemoteModel() {
		return _oepUserMgtJobpos2roleRemoteModel;
	}

	public void setOEPUserMgtJobpos2roleRemoteModel(
		BaseModel<?> oepUserMgtJobpos2roleRemoteModel) {
		_oepUserMgtJobpos2roleRemoteModel = oepUserMgtJobpos2roleRemoteModel;
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

		Class<?> remoteModelClass = _oepUserMgtJobpos2roleRemoteModel.getClass();

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

		Object returnValue = method.invoke(_oepUserMgtJobpos2roleRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			OEPUserMgtJobpos2roleLocalServiceUtil.addOEPUserMgtJobpos2role(this);
		}
		else {
			OEPUserMgtJobpos2roleLocalServiceUtil.updateOEPUserMgtJobpos2role(this);
		}
	}

	@Override
	public OEPUserMgtJobpos2role toEscapedModel() {
		return (OEPUserMgtJobpos2role)ProxyUtil.newProxyInstance(OEPUserMgtJobpos2role.class.getClassLoader(),
			new Class[] { OEPUserMgtJobpos2role.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		OEPUserMgtJobpos2roleClp clone = new OEPUserMgtJobpos2roleClp();

		clone.setJobPosId(getJobPosId());
		clone.setRoleId(getRoleId());

		return clone;
	}

	@Override
	public int compareTo(OEPUserMgtJobpos2role oepUserMgtJobpos2role) {
		OEPUserMgtJobpos2rolePK primaryKey = oepUserMgtJobpos2role.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OEPUserMgtJobpos2roleClp)) {
			return false;
		}

		OEPUserMgtJobpos2roleClp oepUserMgtJobpos2role = (OEPUserMgtJobpos2roleClp)obj;

		OEPUserMgtJobpos2rolePK primaryKey = oepUserMgtJobpos2role.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{jobPosId=");
		sb.append(getJobPosId());
		sb.append(", roleId=");
		sb.append(getRoleId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2role");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>jobPosId</column-name><column-value><![CDATA[");
		sb.append(getJobPosId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleId</column-name><column-value><![CDATA[");
		sb.append(getRoleId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _jobPosId;
	private int _roleId;
	private BaseModel<?> _oepUserMgtJobpos2roleRemoteModel;
}