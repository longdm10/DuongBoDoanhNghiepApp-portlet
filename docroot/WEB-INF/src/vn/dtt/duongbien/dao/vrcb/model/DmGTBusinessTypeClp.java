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
import vn.dtt.duongbien.dao.vrcb.service.DmGTBusinessTypeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmGTBusinessTypeClp extends BaseModelImpl<DmGTBusinessType>
	implements DmGTBusinessType {
	public DmGTBusinessTypeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmGTBusinessType.class;
	}

	@Override
	public String getModelClassName() {
		return DmGTBusinessType.class.getName();
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
		attributes.put("businessTypeCode", getBusinessTypeCode());
		attributes.put("businessTypeName", getBusinessTypeName());
		attributes.put("businessTypeNameVN", getBusinessTypeNameVN());
		attributes.put("businessTypeOrder", getBusinessTypeOrder());
		attributes.put("isDelete", getIsDelete());
		attributes.put("markedAsDelete", getMarkedAsDelete());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("syncVersion", getSyncVersion());
		attributes.put("remarks", getRemarks());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer businessTypeCode = (Integer)attributes.get("businessTypeCode");

		if (businessTypeCode != null) {
			setBusinessTypeCode(businessTypeCode);
		}

		String businessTypeName = (String)attributes.get("businessTypeName");

		if (businessTypeName != null) {
			setBusinessTypeName(businessTypeName);
		}

		String businessTypeNameVN = (String)attributes.get("businessTypeNameVN");

		if (businessTypeNameVN != null) {
			setBusinessTypeNameVN(businessTypeNameVN);
		}

		Integer businessTypeOrder = (Integer)attributes.get("businessTypeOrder");

		if (businessTypeOrder != null) {
			setBusinessTypeOrder(businessTypeOrder);
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

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_dmGTBusinessTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTBusinessTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dmGTBusinessTypeRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getBusinessTypeCode() {
		return _businessTypeCode;
	}

	@Override
	public void setBusinessTypeCode(int businessTypeCode) {
		_businessTypeCode = businessTypeCode;

		if (_dmGTBusinessTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTBusinessTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setBusinessTypeCode", int.class);

				method.invoke(_dmGTBusinessTypeRemoteModel, businessTypeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBusinessTypeName() {
		return _businessTypeName;
	}

	@Override
	public void setBusinessTypeName(String businessTypeName) {
		_businessTypeName = businessTypeName;

		if (_dmGTBusinessTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTBusinessTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setBusinessTypeName",
						String.class);

				method.invoke(_dmGTBusinessTypeRemoteModel, businessTypeName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBusinessTypeNameVN() {
		return _businessTypeNameVN;
	}

	@Override
	public void setBusinessTypeNameVN(String businessTypeNameVN) {
		_businessTypeNameVN = businessTypeNameVN;

		if (_dmGTBusinessTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTBusinessTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setBusinessTypeNameVN",
						String.class);

				method.invoke(_dmGTBusinessTypeRemoteModel, businessTypeNameVN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getBusinessTypeOrder() {
		return _businessTypeOrder;
	}

	@Override
	public void setBusinessTypeOrder(int businessTypeOrder) {
		_businessTypeOrder = businessTypeOrder;

		if (_dmGTBusinessTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTBusinessTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setBusinessTypeOrder",
						int.class);

				method.invoke(_dmGTBusinessTypeRemoteModel, businessTypeOrder);
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

		if (_dmGTBusinessTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTBusinessTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmGTBusinessTypeRemoteModel, isDelete);
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

		if (_dmGTBusinessTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTBusinessTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmGTBusinessTypeRemoteModel, markedAsDelete);
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

		if (_dmGTBusinessTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTBusinessTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmGTBusinessTypeRemoteModel, modifiedDate);
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

		if (_dmGTBusinessTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTBusinessTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmGTBusinessTypeRemoteModel, requestedDate);
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

		if (_dmGTBusinessTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTBusinessTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmGTBusinessTypeRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRemarks() {
		return _remarks;
	}

	@Override
	public void setRemarks(String remarks) {
		_remarks = remarks;

		if (_dmGTBusinessTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGTBusinessTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_dmGTBusinessTypeRemoteModel, remarks);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmGTBusinessTypeRemoteModel() {
		return _dmGTBusinessTypeRemoteModel;
	}

	public void setDmGTBusinessTypeRemoteModel(
		BaseModel<?> dmGTBusinessTypeRemoteModel) {
		_dmGTBusinessTypeRemoteModel = dmGTBusinessTypeRemoteModel;
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

		Class<?> remoteModelClass = _dmGTBusinessTypeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmGTBusinessTypeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmGTBusinessTypeLocalServiceUtil.addDmGTBusinessType(this);
		}
		else {
			DmGTBusinessTypeLocalServiceUtil.updateDmGTBusinessType(this);
		}
	}

	@Override
	public DmGTBusinessType toEscapedModel() {
		return (DmGTBusinessType)ProxyUtil.newProxyInstance(DmGTBusinessType.class.getClassLoader(),
			new Class[] { DmGTBusinessType.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmGTBusinessTypeClp clone = new DmGTBusinessTypeClp();

		clone.setId(getId());
		clone.setBusinessTypeCode(getBusinessTypeCode());
		clone.setBusinessTypeName(getBusinessTypeName());
		clone.setBusinessTypeNameVN(getBusinessTypeNameVN());
		clone.setBusinessTypeOrder(getBusinessTypeOrder());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());
		clone.setRemarks(getRemarks());

		return clone;
	}

	@Override
	public int compareTo(DmGTBusinessType dmGTBusinessType) {
		int value = 0;

		if (getId() < dmGTBusinessType.getId()) {
			value = -1;
		}
		else if (getId() > dmGTBusinessType.getId()) {
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

		if (!(obj instanceof DmGTBusinessTypeClp)) {
			return false;
		}

		DmGTBusinessTypeClp dmGTBusinessType = (DmGTBusinessTypeClp)obj;

		long primaryKey = dmGTBusinessType.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", businessTypeCode=");
		sb.append(getBusinessTypeCode());
		sb.append(", businessTypeName=");
		sb.append(getBusinessTypeName());
		sb.append(", businessTypeNameVN=");
		sb.append(getBusinessTypeNameVN());
		sb.append(", businessTypeOrder=");
		sb.append(getBusinessTypeOrder());
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
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessTypeCode</column-name><column-value><![CDATA[");
		sb.append(getBusinessTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessTypeName</column-name><column-value><![CDATA[");
		sb.append(getBusinessTypeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessTypeNameVN</column-name><column-value><![CDATA[");
		sb.append(getBusinessTypeNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessTypeOrder</column-name><column-value><![CDATA[");
		sb.append(getBusinessTypeOrder());
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
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private int _businessTypeCode;
	private String _businessTypeName;
	private String _businessTypeNameVN;
	private int _businessTypeOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private String _remarks;
	private BaseModel<?> _dmGTBusinessTypeRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}