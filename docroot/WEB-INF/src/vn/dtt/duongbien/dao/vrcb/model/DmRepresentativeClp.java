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
import vn.dtt.duongbien.dao.vrcb.service.DmRepresentativeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmRepresentativeClp extends BaseModelImpl<DmRepresentative>
	implements DmRepresentative {
	public DmRepresentativeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmRepresentative.class;
	}

	@Override
	public String getModelClassName() {
		return DmRepresentative.class.getName();
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
		attributes.put("repCode", getRepCode());
		attributes.put("repName", getRepName());
		attributes.put("repNameVN", getRepNameVN());
		attributes.put("repOrder", getRepOrder());
		attributes.put("maritimeCode", getMaritimeCode());
		attributes.put("isDelete", getIsDelete());
		attributes.put("markedAsDelete", getMarkedAsDelete());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("syncVersion", getSyncVersion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String repCode = (String)attributes.get("repCode");

		if (repCode != null) {
			setRepCode(repCode);
		}

		String repName = (String)attributes.get("repName");

		if (repName != null) {
			setRepName(repName);
		}

		String repNameVN = (String)attributes.get("repNameVN");

		if (repNameVN != null) {
			setRepNameVN(repNameVN);
		}

		Integer repOrder = (Integer)attributes.get("repOrder");

		if (repOrder != null) {
			setRepOrder(repOrder);
		}

		String maritimeCode = (String)attributes.get("maritimeCode");

		if (maritimeCode != null) {
			setMaritimeCode(maritimeCode);
		}

		Integer isDelete = (Integer)attributes.get("isDelete");

		if (isDelete != null) {
			setIsDelete(isDelete);
		}

		Integer markedAsDelete = (Integer)attributes.get("markedAsDelete");

		if (markedAsDelete != null) {
			setMarkedAsDelete(markedAsDelete);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Date requestedDate = (Date)attributes.get("requestedDate");

		if (requestedDate != null) {
			setRequestedDate(requestedDate);
		}

		String syncVersion = (String)attributes.get("syncVersion");

		if (syncVersion != null) {
			setSyncVersion(syncVersion);
		}
	}

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;

		if (_dmRepresentativeRemoteModel != null) {
			try {
				Class<?> clazz = _dmRepresentativeRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_dmRepresentativeRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRepCode() {
		return _repCode;
	}

	@Override
	public void setRepCode(String repCode) {
		_repCode = repCode;

		if (_dmRepresentativeRemoteModel != null) {
			try {
				Class<?> clazz = _dmRepresentativeRemoteModel.getClass();

				Method method = clazz.getMethod("setRepCode", String.class);

				method.invoke(_dmRepresentativeRemoteModel, repCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRepName() {
		return _repName;
	}

	@Override
	public void setRepName(String repName) {
		_repName = repName;

		if (_dmRepresentativeRemoteModel != null) {
			try {
				Class<?> clazz = _dmRepresentativeRemoteModel.getClass();

				Method method = clazz.getMethod("setRepName", String.class);

				method.invoke(_dmRepresentativeRemoteModel, repName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRepNameVN() {
		return _repNameVN;
	}

	@Override
	public void setRepNameVN(String repNameVN) {
		_repNameVN = repNameVN;

		if (_dmRepresentativeRemoteModel != null) {
			try {
				Class<?> clazz = _dmRepresentativeRemoteModel.getClass();

				Method method = clazz.getMethod("setRepNameVN", String.class);

				method.invoke(_dmRepresentativeRemoteModel, repNameVN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getRepOrder() {
		return _repOrder;
	}

	@Override
	public void setRepOrder(int repOrder) {
		_repOrder = repOrder;

		if (_dmRepresentativeRemoteModel != null) {
			try {
				Class<?> clazz = _dmRepresentativeRemoteModel.getClass();

				Method method = clazz.getMethod("setRepOrder", int.class);

				method.invoke(_dmRepresentativeRemoteModel, repOrder);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaritimeCode() {
		return _maritimeCode;
	}

	@Override
	public void setMaritimeCode(String maritimeCode) {
		_maritimeCode = maritimeCode;

		if (_dmRepresentativeRemoteModel != null) {
			try {
				Class<?> clazz = _dmRepresentativeRemoteModel.getClass();

				Method method = clazz.getMethod("setMaritimeCode", String.class);

				method.invoke(_dmRepresentativeRemoteModel, maritimeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsDelete() {
		return _isDelete;
	}

	@Override
	public void setIsDelete(int isDelete) {
		_isDelete = isDelete;

		if (_dmRepresentativeRemoteModel != null) {
			try {
				Class<?> clazz = _dmRepresentativeRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmRepresentativeRemoteModel, isDelete);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMarkedAsDelete() {
		return _markedAsDelete;
	}

	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_markedAsDelete = markedAsDelete;

		if (_dmRepresentativeRemoteModel != null) {
			try {
				Class<?> clazz = _dmRepresentativeRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmRepresentativeRemoteModel, markedAsDelete);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_dmRepresentativeRemoteModel != null) {
			try {
				Class<?> clazz = _dmRepresentativeRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmRepresentativeRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getRequestedDate() {
		return _requestedDate;
	}

	@Override
	public void setRequestedDate(Date requestedDate) {
		_requestedDate = requestedDate;

		if (_dmRepresentativeRemoteModel != null) {
			try {
				Class<?> clazz = _dmRepresentativeRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmRepresentativeRemoteModel, requestedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSyncVersion() {
		return _syncVersion;
	}

	@Override
	public void setSyncVersion(String syncVersion) {
		_syncVersion = syncVersion;

		if (_dmRepresentativeRemoteModel != null) {
			try {
				Class<?> clazz = _dmRepresentativeRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmRepresentativeRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmRepresentativeRemoteModel() {
		return _dmRepresentativeRemoteModel;
	}

	public void setDmRepresentativeRemoteModel(
		BaseModel<?> dmRepresentativeRemoteModel) {
		_dmRepresentativeRemoteModel = dmRepresentativeRemoteModel;
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

		Class<?> remoteModelClass = _dmRepresentativeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmRepresentativeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmRepresentativeLocalServiceUtil.addDmRepresentative(this);
		}
		else {
			DmRepresentativeLocalServiceUtil.updateDmRepresentative(this);
		}
	}

	@Override
	public DmRepresentative toEscapedModel() {
		return (DmRepresentative)ProxyUtil.newProxyInstance(DmRepresentative.class.getClassLoader(),
			new Class[] { DmRepresentative.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmRepresentativeClp clone = new DmRepresentativeClp();

		clone.setId(getId());
		clone.setRepCode(getRepCode());
		clone.setRepName(getRepName());
		clone.setRepNameVN(getRepNameVN());
		clone.setRepOrder(getRepOrder());
		clone.setMaritimeCode(getMaritimeCode());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmRepresentative dmRepresentative) {
		int value = 0;

		if (getId() < dmRepresentative.getId()) {
			value = -1;
		}
		else if (getId() > dmRepresentative.getId()) {
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

		if (!(obj instanceof DmRepresentativeClp)) {
			return false;
		}

		DmRepresentativeClp dmRepresentative = (DmRepresentativeClp)obj;

		int primaryKey = dmRepresentative.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", repCode=");
		sb.append(getRepCode());
		sb.append(", repName=");
		sb.append(getRepName());
		sb.append(", repNameVN=");
		sb.append(getRepNameVN());
		sb.append(", repOrder=");
		sb.append(getRepOrder());
		sb.append(", maritimeCode=");
		sb.append(getMaritimeCode());
		sb.append(", isDelete=");
		sb.append(getIsDelete());
		sb.append(", markedAsDelete=");
		sb.append(getMarkedAsDelete());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", requestedDate=");
		sb.append(getRequestedDate());
		sb.append(", syncVersion=");
		sb.append(getSyncVersion());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmRepresentative");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>repCode</column-name><column-value><![CDATA[");
		sb.append(getRepCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>repName</column-name><column-value><![CDATA[");
		sb.append(getRepName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>repNameVN</column-name><column-value><![CDATA[");
		sb.append(getRepNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>repOrder</column-name><column-value><![CDATA[");
		sb.append(getRepOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeCode</column-name><column-value><![CDATA[");
		sb.append(getMaritimeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isDelete</column-name><column-value><![CDATA[");
		sb.append(getIsDelete());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markedAsDelete</column-name><column-value><![CDATA[");
		sb.append(getMarkedAsDelete());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestedDate</column-name><column-value><![CDATA[");
		sb.append(getRequestedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncVersion</column-name><column-value><![CDATA[");
		sb.append(getSyncVersion());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private String _repCode;
	private String _repName;
	private String _repNameVN;
	private int _repOrder;
	private String _maritimeCode;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmRepresentativeRemoteModel;
}