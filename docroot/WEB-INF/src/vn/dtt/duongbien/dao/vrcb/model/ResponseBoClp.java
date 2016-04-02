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

package vn.dtt.duongbien.dao.vrcb.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbien.dao.vrcb.service.ClpSerializer;
import vn.dtt.duongbien.dao.vrcb.service.ResponseBoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class ResponseBoClp extends BaseModelImpl<ResponseBo>
	implements ResponseBo {
	public ResponseBoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ResponseBo.class;
	}

	@Override
	public String getModelClassName() {
		return ResponseBo.class.getName();
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
		attributes.put("isSuccess", getIsSuccess());
		attributes.put("errorMessage", getErrorMessage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer isSuccess = (Integer)attributes.get("isSuccess");

		if (isSuccess != null) {
			setIsSuccess(isSuccess);
		}

		String errorMessage = (String)attributes.get("errorMessage");

		if (errorMessage != null) {
			setErrorMessage(errorMessage);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_responseBoRemoteModel != null) {
			try {
				Class<?> clazz = _responseBoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_responseBoRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsSuccess() {
		return _isSuccess;
	}

	@Override
	public void setIsSuccess(int isSuccess) {
		_isSuccess = isSuccess;

		if (_responseBoRemoteModel != null) {
			try {
				Class<?> clazz = _responseBoRemoteModel.getClass();

				Method method = clazz.getMethod("setIsSuccess", int.class);

				method.invoke(_responseBoRemoteModel, isSuccess);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getErrorMessage() {
		return _errorMessage;
	}

	@Override
	public void setErrorMessage(String errorMessage) {
		_errorMessage = errorMessage;

		if (_responseBoRemoteModel != null) {
			try {
				Class<?> clazz = _responseBoRemoteModel.getClass();

				Method method = clazz.getMethod("setErrorMessage", String.class);

				method.invoke(_responseBoRemoteModel, errorMessage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getResponseBoRemoteModel() {
		return _responseBoRemoteModel;
	}

	public void setResponseBoRemoteModel(BaseModel<?> responseBoRemoteModel) {
		_responseBoRemoteModel = responseBoRemoteModel;
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

		Class<?> remoteModelClass = _responseBoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_responseBoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ResponseBoLocalServiceUtil.addResponseBo(this);
		}
		else {
			ResponseBoLocalServiceUtil.updateResponseBo(this);
		}
	}

	@Override
	public ResponseBo toEscapedModel() {
		return (ResponseBo)ProxyUtil.newProxyInstance(ResponseBo.class.getClassLoader(),
			new Class[] { ResponseBo.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ResponseBoClp clone = new ResponseBoClp();

		clone.setId(getId());
		clone.setIsSuccess(getIsSuccess());
		clone.setErrorMessage(getErrorMessage());

		return clone;
	}

	@Override
	public int compareTo(ResponseBo responseBo) {
		long primaryKey = responseBo.getPrimaryKey();

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

		if (!(obj instanceof ResponseBoClp)) {
			return false;
		}

		ResponseBoClp responseBo = (ResponseBoClp)obj;

		long primaryKey = responseBo.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", isSuccess=");
		sb.append(getIsSuccess());
		sb.append(", errorMessage=");
		sb.append(getErrorMessage());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.ResponseBo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isSuccess</column-name><column-value><![CDATA[");
		sb.append(getIsSuccess());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>errorMessage</column-name><column-value><![CDATA[");
		sb.append(getErrorMessage());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private int _isSuccess;
	private String _errorMessage;
	private BaseModel<?> _responseBoRemoteModel;
}