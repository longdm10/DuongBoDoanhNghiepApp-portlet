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
import vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityPortItemsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class TempShipSecurityPortItemsClp extends BaseModelImpl<TempShipSecurityPortItems>
	implements TempShipSecurityPortItems {
	public TempShipSecurityPortItemsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TempShipSecurityPortItems.class;
	}

	@Override
	public String getModelClassName() {
		return TempShipSecurityPortItems.class.getName();
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
		attributes.put("requestCode", getRequestCode());
		attributes.put("shipSecurityPortItemCode", getShipSecurityPortItemCode());
		attributes.put("portCode", getPortCode());
		attributes.put("dateArrival", getDateArrival());
		attributes.put("dateDeparture", getDateDeparture());
		attributes.put("securityLevelCode", getSecurityLevelCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String requestCode = (String)attributes.get("requestCode");

		if (requestCode != null) {
			setRequestCode(requestCode);
		}

		String shipSecurityPortItemCode = (String)attributes.get(
				"shipSecurityPortItemCode");

		if (shipSecurityPortItemCode != null) {
			setShipSecurityPortItemCode(shipSecurityPortItemCode);
		}

		String portCode = (String)attributes.get("portCode");

		if (portCode != null) {
			setPortCode(portCode);
		}

		Date dateArrival = (Date)attributes.get("dateArrival");

		if (dateArrival != null) {
			setDateArrival(dateArrival);
		}

		Date dateDeparture = (Date)attributes.get("dateDeparture");

		if (dateDeparture != null) {
			setDateDeparture(dateDeparture);
		}

		String securityLevelCode = (String)attributes.get("securityLevelCode");

		if (securityLevelCode != null) {
			setSecurityLevelCode(securityLevelCode);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tempShipSecurityPortItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityPortItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tempShipSecurityPortItemsRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRequestCode() {
		return _requestCode;
	}

	@Override
	public void setRequestCode(String requestCode) {
		_requestCode = requestCode;

		if (_tempShipSecurityPortItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityPortItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_tempShipSecurityPortItemsRemoteModel, requestCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipSecurityPortItemCode() {
		return _shipSecurityPortItemCode;
	}

	@Override
	public void setShipSecurityPortItemCode(String shipSecurityPortItemCode) {
		_shipSecurityPortItemCode = shipSecurityPortItemCode;

		if (_tempShipSecurityPortItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityPortItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setShipSecurityPortItemCode",
						String.class);

				method.invoke(_tempShipSecurityPortItemsRemoteModel,
					shipSecurityPortItemCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortCode() {
		return _portCode;
	}

	@Override
	public void setPortCode(String portCode) {
		_portCode = portCode;

		if (_tempShipSecurityPortItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityPortItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setPortCode", String.class);

				method.invoke(_tempShipSecurityPortItemsRemoteModel, portCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDateArrival() {
		return _dateArrival;
	}

	@Override
	public void setDateArrival(Date dateArrival) {
		_dateArrival = dateArrival;

		if (_tempShipSecurityPortItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityPortItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setDateArrival", Date.class);

				method.invoke(_tempShipSecurityPortItemsRemoteModel, dateArrival);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDateDeparture() {
		return _dateDeparture;
	}

	@Override
	public void setDateDeparture(Date dateDeparture) {
		_dateDeparture = dateDeparture;

		if (_tempShipSecurityPortItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityPortItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setDateDeparture", Date.class);

				method.invoke(_tempShipSecurityPortItemsRemoteModel,
					dateDeparture);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSecurityLevelCode() {
		return _securityLevelCode;
	}

	@Override
	public void setSecurityLevelCode(String securityLevelCode) {
		_securityLevelCode = securityLevelCode;

		if (_tempShipSecurityPortItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityPortItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setSecurityLevelCode",
						String.class);

				method.invoke(_tempShipSecurityPortItemsRemoteModel,
					securityLevelCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempShipSecurityPortItemsRemoteModel() {
		return _tempShipSecurityPortItemsRemoteModel;
	}

	public void setTempShipSecurityPortItemsRemoteModel(
		BaseModel<?> tempShipSecurityPortItemsRemoteModel) {
		_tempShipSecurityPortItemsRemoteModel = tempShipSecurityPortItemsRemoteModel;
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

		Class<?> remoteModelClass = _tempShipSecurityPortItemsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempShipSecurityPortItemsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempShipSecurityPortItemsLocalServiceUtil.addTempShipSecurityPortItems(this);
		}
		else {
			TempShipSecurityPortItemsLocalServiceUtil.updateTempShipSecurityPortItems(this);
		}
	}

	@Override
	public TempShipSecurityPortItems toEscapedModel() {
		return (TempShipSecurityPortItems)ProxyUtil.newProxyInstance(TempShipSecurityPortItems.class.getClassLoader(),
			new Class[] { TempShipSecurityPortItems.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempShipSecurityPortItemsClp clone = new TempShipSecurityPortItemsClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setShipSecurityPortItemCode(getShipSecurityPortItemCode());
		clone.setPortCode(getPortCode());
		clone.setDateArrival(getDateArrival());
		clone.setDateDeparture(getDateDeparture());
		clone.setSecurityLevelCode(getSecurityLevelCode());

		return clone;
	}

	@Override
	public int compareTo(TempShipSecurityPortItems tempShipSecurityPortItems) {
		int value = 0;

		if (getId() < tempShipSecurityPortItems.getId()) {
			value = -1;
		}
		else if (getId() > tempShipSecurityPortItems.getId()) {
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

		if (!(obj instanceof TempShipSecurityPortItemsClp)) {
			return false;
		}

		TempShipSecurityPortItemsClp tempShipSecurityPortItems = (TempShipSecurityPortItemsClp)obj;

		long primaryKey = tempShipSecurityPortItems.getPrimaryKey();

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
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", shipSecurityPortItemCode=");
		sb.append(getShipSecurityPortItemCode());
		sb.append(", portCode=");
		sb.append(getPortCode());
		sb.append(", dateArrival=");
		sb.append(getDateArrival());
		sb.append(", dateDeparture=");
		sb.append(getDateDeparture());
		sb.append(", securityLevelCode=");
		sb.append(getSecurityLevelCode());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestCode</column-name><column-value><![CDATA[");
		sb.append(getRequestCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipSecurityPortItemCode</column-name><column-value><![CDATA[");
		sb.append(getShipSecurityPortItemCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portCode</column-name><column-value><![CDATA[");
		sb.append(getPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateArrival</column-name><column-value><![CDATA[");
		sb.append(getDateArrival());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateDeparture</column-name><column-value><![CDATA[");
		sb.append(getDateDeparture());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>securityLevelCode</column-name><column-value><![CDATA[");
		sb.append(getSecurityLevelCode());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _shipSecurityPortItemCode;
	private String _portCode;
	private Date _dateArrival;
	private Date _dateDeparture;
	private String _securityLevelCode;
	private BaseModel<?> _tempShipSecurityPortItemsRemoteModel;
}