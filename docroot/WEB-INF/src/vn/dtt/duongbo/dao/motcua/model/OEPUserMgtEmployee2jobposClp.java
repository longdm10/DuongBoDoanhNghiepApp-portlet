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
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtEmployee2jobposLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.persistence.OEPUserMgtEmployee2jobposPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class OEPUserMgtEmployee2jobposClp extends BaseModelImpl<OEPUserMgtEmployee2jobpos>
	implements OEPUserMgtEmployee2jobpos {
	public OEPUserMgtEmployee2jobposClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return OEPUserMgtEmployee2jobpos.class;
	}

	@Override
	public String getModelClassName() {
		return OEPUserMgtEmployee2jobpos.class.getName();
	}

	@Override
	public OEPUserMgtEmployee2jobposPK getPrimaryKey() {
		return new OEPUserMgtEmployee2jobposPK(_employeeId, _jobPosId);
	}

	@Override
	public void setPrimaryKey(OEPUserMgtEmployee2jobposPK primaryKey) {
		setEmployeeId(primaryKey.employeeId);
		setJobPosId(primaryKey.jobPosId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new OEPUserMgtEmployee2jobposPK(_employeeId, _jobPosId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((OEPUserMgtEmployee2jobposPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeId", getEmployeeId());
		attributes.put("jobPosId", getJobPosId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer employeeId = (Integer)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Integer jobPosId = (Integer)attributes.get("jobPosId");

		if (jobPosId != null) {
			setJobPosId(jobPosId);
		}
	}

	@Override
	public int getEmployeeId() {
		return _employeeId;
	}

	@Override
	public void setEmployeeId(int employeeId) {
		_employeeId = employeeId;

		if (_oepUserMgtEmployee2jobposRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtEmployee2jobposRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeId", int.class);

				method.invoke(_oepUserMgtEmployee2jobposRemoteModel, employeeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getJobPosId() {
		return _jobPosId;
	}

	@Override
	public void setJobPosId(int jobPosId) {
		_jobPosId = jobPosId;

		if (_oepUserMgtEmployee2jobposRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtEmployee2jobposRemoteModel.getClass();

				Method method = clazz.getMethod("setJobPosId", int.class);

				method.invoke(_oepUserMgtEmployee2jobposRemoteModel, jobPosId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getOEPUserMgtEmployee2jobposRemoteModel() {
		return _oepUserMgtEmployee2jobposRemoteModel;
	}

	public void setOEPUserMgtEmployee2jobposRemoteModel(
		BaseModel<?> oepUserMgtEmployee2jobposRemoteModel) {
		_oepUserMgtEmployee2jobposRemoteModel = oepUserMgtEmployee2jobposRemoteModel;
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

		Class<?> remoteModelClass = _oepUserMgtEmployee2jobposRemoteModel.getClass();

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

		Object returnValue = method.invoke(_oepUserMgtEmployee2jobposRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			OEPUserMgtEmployee2jobposLocalServiceUtil.addOEPUserMgtEmployee2jobpos(this);
		}
		else {
			OEPUserMgtEmployee2jobposLocalServiceUtil.updateOEPUserMgtEmployee2jobpos(this);
		}
	}

	@Override
	public OEPUserMgtEmployee2jobpos toEscapedModel() {
		return (OEPUserMgtEmployee2jobpos)ProxyUtil.newProxyInstance(OEPUserMgtEmployee2jobpos.class.getClassLoader(),
			new Class[] { OEPUserMgtEmployee2jobpos.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		OEPUserMgtEmployee2jobposClp clone = new OEPUserMgtEmployee2jobposClp();

		clone.setEmployeeId(getEmployeeId());
		clone.setJobPosId(getJobPosId());

		return clone;
	}

	@Override
	public int compareTo(OEPUserMgtEmployee2jobpos oepUserMgtEmployee2jobpos) {
		OEPUserMgtEmployee2jobposPK primaryKey = oepUserMgtEmployee2jobpos.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OEPUserMgtEmployee2jobposClp)) {
			return false;
		}

		OEPUserMgtEmployee2jobposClp oepUserMgtEmployee2jobpos = (OEPUserMgtEmployee2jobposClp)obj;

		OEPUserMgtEmployee2jobposPK primaryKey = oepUserMgtEmployee2jobpos.getPrimaryKey();

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

		sb.append("{employeeId=");
		sb.append(getEmployeeId());
		sb.append(", jobPosId=");
		sb.append(getJobPosId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee2jobpos");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jobPosId</column-name><column-value><![CDATA[");
		sb.append(getJobPosId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _employeeId;
	private int _jobPosId;
	private BaseModel<?> _oepUserMgtEmployee2jobposRemoteModel;
}