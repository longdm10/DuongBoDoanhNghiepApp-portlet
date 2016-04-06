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
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryShipTypeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmHistoryShipTypeClp extends BaseModelImpl<DmHistoryShipType>
	implements DmHistoryShipType {
	public DmHistoryShipTypeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryShipType.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryShipType.class.getName();
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
		attributes.put("shipTypeCode", getShipTypeCode());
		attributes.put("shipTypeName", getShipTypeName());
		attributes.put("shipTypeNameVN", getShipTypeNameVN());
		attributes.put("shipTypeOrder", getShipTypeOrder());
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

		String shipTypeCode = (String)attributes.get("shipTypeCode");

		if (shipTypeCode != null) {
			setShipTypeCode(shipTypeCode);
		}

		String shipTypeName = (String)attributes.get("shipTypeName");

		if (shipTypeName != null) {
			setShipTypeName(shipTypeName);
		}

		String shipTypeNameVN = (String)attributes.get("shipTypeNameVN");

		if (shipTypeNameVN != null) {
			setShipTypeNameVN(shipTypeNameVN);
		}

		Integer shipTypeOrder = (Integer)attributes.get("shipTypeOrder");

		if (shipTypeOrder != null) {
			setShipTypeOrder(shipTypeOrder);
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

		if (_dmHistoryShipTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_dmHistoryShipTypeRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipTypeCode() {
		return _shipTypeCode;
	}

	@Override
	public void setShipTypeCode(String shipTypeCode) {
		_shipTypeCode = shipTypeCode;

		if (_dmHistoryShipTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setShipTypeCode", String.class);

				method.invoke(_dmHistoryShipTypeRemoteModel, shipTypeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipTypeName() {
		return _shipTypeName;
	}

	@Override
	public void setShipTypeName(String shipTypeName) {
		_shipTypeName = shipTypeName;

		if (_dmHistoryShipTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setShipTypeName", String.class);

				method.invoke(_dmHistoryShipTypeRemoteModel, shipTypeName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipTypeNameVN() {
		return _shipTypeNameVN;
	}

	@Override
	public void setShipTypeNameVN(String shipTypeNameVN) {
		_shipTypeNameVN = shipTypeNameVN;

		if (_dmHistoryShipTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setShipTypeNameVN",
						String.class);

				method.invoke(_dmHistoryShipTypeRemoteModel, shipTypeNameVN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getShipTypeOrder() {
		return _shipTypeOrder;
	}

	@Override
	public void setShipTypeOrder(int shipTypeOrder) {
		_shipTypeOrder = shipTypeOrder;

		if (_dmHistoryShipTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setShipTypeOrder", int.class);

				method.invoke(_dmHistoryShipTypeRemoteModel, shipTypeOrder);
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

		if (_dmHistoryShipTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmHistoryShipTypeRemoteModel, isDelete);
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

		if (_dmHistoryShipTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmHistoryShipTypeRemoteModel, markedAsDelete);
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

		if (_dmHistoryShipTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmHistoryShipTypeRemoteModel, modifiedDate);
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

		if (_dmHistoryShipTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmHistoryShipTypeRemoteModel, requestedDate);
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

		if (_dmHistoryShipTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmHistoryShipTypeRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmHistoryShipTypeRemoteModel() {
		return _dmHistoryShipTypeRemoteModel;
	}

	public void setDmHistoryShipTypeRemoteModel(
		BaseModel<?> dmHistoryShipTypeRemoteModel) {
		_dmHistoryShipTypeRemoteModel = dmHistoryShipTypeRemoteModel;
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

		Class<?> remoteModelClass = _dmHistoryShipTypeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmHistoryShipTypeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmHistoryShipTypeLocalServiceUtil.addDmHistoryShipType(this);
		}
		else {
			DmHistoryShipTypeLocalServiceUtil.updateDmHistoryShipType(this);
		}
	}

	@Override
	public DmHistoryShipType toEscapedModel() {
		return (DmHistoryShipType)ProxyUtil.newProxyInstance(DmHistoryShipType.class.getClassLoader(),
			new Class[] { DmHistoryShipType.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmHistoryShipTypeClp clone = new DmHistoryShipTypeClp();

		clone.setId(getId());
		clone.setShipTypeCode(getShipTypeCode());
		clone.setShipTypeName(getShipTypeName());
		clone.setShipTypeNameVN(getShipTypeNameVN());
		clone.setShipTypeOrder(getShipTypeOrder());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmHistoryShipType dmHistoryShipType) {
		int value = 0;

		if (getId() < dmHistoryShipType.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryShipType.getId()) {
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

		if (!(obj instanceof DmHistoryShipTypeClp)) {
			return false;
		}

		DmHistoryShipTypeClp dmHistoryShipType = (DmHistoryShipTypeClp)obj;

		int primaryKey = dmHistoryShipType.getPrimaryKey();

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
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", shipTypeCode=");
		sb.append(getShipTypeCode());
		sb.append(", shipTypeName=");
		sb.append(getShipTypeName());
		sb.append(", shipTypeNameVN=");
		sb.append(getShipTypeNameVN());
		sb.append(", shipTypeOrder=");
		sb.append(getShipTypeOrder());
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
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipTypeCode</column-name><column-value><![CDATA[");
		sb.append(getShipTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipTypeName</column-name><column-value><![CDATA[");
		sb.append(getShipTypeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipTypeNameVN</column-name><column-value><![CDATA[");
		sb.append(getShipTypeNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipTypeOrder</column-name><column-value><![CDATA[");
		sb.append(getShipTypeOrder());
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
	private String _shipTypeCode;
	private String _shipTypeName;
	private String _shipTypeNameVN;
	private int _shipTypeOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmHistoryShipTypeRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}