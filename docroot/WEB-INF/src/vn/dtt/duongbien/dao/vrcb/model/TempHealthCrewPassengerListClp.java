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
import vn.dtt.duongbien.dao.vrcb.service.TempHealthCrewPassengerListLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class TempHealthCrewPassengerListClp extends BaseModelImpl<TempHealthCrewPassengerList>
	implements TempHealthCrewPassengerList {
	public TempHealthCrewPassengerListClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TempHealthCrewPassengerList.class;
	}

	@Override
	public String getModelClassName() {
		return TempHealthCrewPassengerList.class.getName();
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
		attributes.put("healthCrewPassengerCode", getHealthCrewPassengerCode());
		attributes.put("passengerOrCrewCode", getPassengerOrCrewCode());
		attributes.put("passengerOrCrewName", getPassengerOrCrewName());
		attributes.put("classOrRating", getClassOrRating());
		attributes.put("stateVisitedCode", getStateVisitedCode());
		attributes.put("portVisitedCode", getPortVisitedCode());
		attributes.put("fromDate", getFromDate());
		attributes.put("toDate", getToDate());

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

		String healthCrewPassengerCode = (String)attributes.get(
				"healthCrewPassengerCode");

		if (healthCrewPassengerCode != null) {
			setHealthCrewPassengerCode(healthCrewPassengerCode);
		}

		String passengerOrCrewCode = (String)attributes.get(
				"passengerOrCrewCode");

		if (passengerOrCrewCode != null) {
			setPassengerOrCrewCode(passengerOrCrewCode);
		}

		String passengerOrCrewName = (String)attributes.get(
				"passengerOrCrewName");

		if (passengerOrCrewName != null) {
			setPassengerOrCrewName(passengerOrCrewName);
		}

		Integer classOrRating = (Integer)attributes.get("classOrRating");

		if (classOrRating != null) {
			setClassOrRating(classOrRating);
		}

		String stateVisitedCode = (String)attributes.get("stateVisitedCode");

		if (stateVisitedCode != null) {
			setStateVisitedCode(stateVisitedCode);
		}

		String portVisitedCode = (String)attributes.get("portVisitedCode");

		if (portVisitedCode != null) {
			setPortVisitedCode(portVisitedCode);
		}

		Date fromDate = (Date)attributes.get("fromDate");

		if (fromDate != null) {
			setFromDate(fromDate);
		}

		Date toDate = (Date)attributes.get("toDate");

		if (toDate != null) {
			setToDate(toDate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tempHealthCrewPassengerListRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthCrewPassengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tempHealthCrewPassengerListRemoteModel, id);
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

		if (_tempHealthCrewPassengerListRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthCrewPassengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_tempHealthCrewPassengerListRemoteModel,
					requestCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHealthCrewPassengerCode() {
		return _healthCrewPassengerCode;
	}

	@Override
	public void setHealthCrewPassengerCode(String healthCrewPassengerCode) {
		_healthCrewPassengerCode = healthCrewPassengerCode;

		if (_tempHealthCrewPassengerListRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthCrewPassengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setHealthCrewPassengerCode",
						String.class);

				method.invoke(_tempHealthCrewPassengerListRemoteModel,
					healthCrewPassengerCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPassengerOrCrewCode() {
		return _passengerOrCrewCode;
	}

	@Override
	public void setPassengerOrCrewCode(String passengerOrCrewCode) {
		_passengerOrCrewCode = passengerOrCrewCode;

		if (_tempHealthCrewPassengerListRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthCrewPassengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setPassengerOrCrewCode",
						String.class);

				method.invoke(_tempHealthCrewPassengerListRemoteModel,
					passengerOrCrewCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPassengerOrCrewName() {
		return _passengerOrCrewName;
	}

	@Override
	public void setPassengerOrCrewName(String passengerOrCrewName) {
		_passengerOrCrewName = passengerOrCrewName;

		if (_tempHealthCrewPassengerListRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthCrewPassengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setPassengerOrCrewName",
						String.class);

				method.invoke(_tempHealthCrewPassengerListRemoteModel,
					passengerOrCrewName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getClassOrRating() {
		return _classOrRating;
	}

	@Override
	public void setClassOrRating(int classOrRating) {
		_classOrRating = classOrRating;

		if (_tempHealthCrewPassengerListRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthCrewPassengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setClassOrRating", int.class);

				method.invoke(_tempHealthCrewPassengerListRemoteModel,
					classOrRating);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStateVisitedCode() {
		return _stateVisitedCode;
	}

	@Override
	public void setStateVisitedCode(String stateVisitedCode) {
		_stateVisitedCode = stateVisitedCode;

		if (_tempHealthCrewPassengerListRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthCrewPassengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setStateVisitedCode",
						String.class);

				method.invoke(_tempHealthCrewPassengerListRemoteModel,
					stateVisitedCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortVisitedCode() {
		return _portVisitedCode;
	}

	@Override
	public void setPortVisitedCode(String portVisitedCode) {
		_portVisitedCode = portVisitedCode;

		if (_tempHealthCrewPassengerListRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthCrewPassengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setPortVisitedCode",
						String.class);

				method.invoke(_tempHealthCrewPassengerListRemoteModel,
					portVisitedCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFromDate() {
		return _fromDate;
	}

	@Override
	public void setFromDate(Date fromDate) {
		_fromDate = fromDate;

		if (_tempHealthCrewPassengerListRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthCrewPassengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setFromDate", Date.class);

				method.invoke(_tempHealthCrewPassengerListRemoteModel, fromDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getToDate() {
		return _toDate;
	}

	@Override
	public void setToDate(Date toDate) {
		_toDate = toDate;

		if (_tempHealthCrewPassengerListRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthCrewPassengerListRemoteModel.getClass();

				Method method = clazz.getMethod("setToDate", Date.class);

				method.invoke(_tempHealthCrewPassengerListRemoteModel, toDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempHealthCrewPassengerListRemoteModel() {
		return _tempHealthCrewPassengerListRemoteModel;
	}

	public void setTempHealthCrewPassengerListRemoteModel(
		BaseModel<?> tempHealthCrewPassengerListRemoteModel) {
		_tempHealthCrewPassengerListRemoteModel = tempHealthCrewPassengerListRemoteModel;
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

		Class<?> remoteModelClass = _tempHealthCrewPassengerListRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempHealthCrewPassengerListRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempHealthCrewPassengerListLocalServiceUtil.addTempHealthCrewPassengerList(this);
		}
		else {
			TempHealthCrewPassengerListLocalServiceUtil.updateTempHealthCrewPassengerList(this);
		}
	}

	@Override
	public TempHealthCrewPassengerList toEscapedModel() {
		return (TempHealthCrewPassengerList)ProxyUtil.newProxyInstance(TempHealthCrewPassengerList.class.getClassLoader(),
			new Class[] { TempHealthCrewPassengerList.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempHealthCrewPassengerListClp clone = new TempHealthCrewPassengerListClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setHealthCrewPassengerCode(getHealthCrewPassengerCode());
		clone.setPassengerOrCrewCode(getPassengerOrCrewCode());
		clone.setPassengerOrCrewName(getPassengerOrCrewName());
		clone.setClassOrRating(getClassOrRating());
		clone.setStateVisitedCode(getStateVisitedCode());
		clone.setPortVisitedCode(getPortVisitedCode());
		clone.setFromDate(getFromDate());
		clone.setToDate(getToDate());

		return clone;
	}

	@Override
	public int compareTo(
		TempHealthCrewPassengerList tempHealthCrewPassengerList) {
		int value = 0;

		if (getId() < tempHealthCrewPassengerList.getId()) {
			value = -1;
		}
		else if (getId() > tempHealthCrewPassengerList.getId()) {
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

		if (!(obj instanceof TempHealthCrewPassengerListClp)) {
			return false;
		}

		TempHealthCrewPassengerListClp tempHealthCrewPassengerList = (TempHealthCrewPassengerListClp)obj;

		long primaryKey = tempHealthCrewPassengerList.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", healthCrewPassengerCode=");
		sb.append(getHealthCrewPassengerCode());
		sb.append(", passengerOrCrewCode=");
		sb.append(getPassengerOrCrewCode());
		sb.append(", passengerOrCrewName=");
		sb.append(getPassengerOrCrewName());
		sb.append(", classOrRating=");
		sb.append(getClassOrRating());
		sb.append(", stateVisitedCode=");
		sb.append(getStateVisitedCode());
		sb.append(", portVisitedCode=");
		sb.append(getPortVisitedCode());
		sb.append(", fromDate=");
		sb.append(getFromDate());
		sb.append(", toDate=");
		sb.append(getToDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempHealthCrewPassengerList");
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
			"<column><column-name>healthCrewPassengerCode</column-name><column-value><![CDATA[");
		sb.append(getHealthCrewPassengerCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passengerOrCrewCode</column-name><column-value><![CDATA[");
		sb.append(getPassengerOrCrewCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passengerOrCrewName</column-name><column-value><![CDATA[");
		sb.append(getPassengerOrCrewName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classOrRating</column-name><column-value><![CDATA[");
		sb.append(getClassOrRating());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateVisitedCode</column-name><column-value><![CDATA[");
		sb.append(getStateVisitedCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portVisitedCode</column-name><column-value><![CDATA[");
		sb.append(getPortVisitedCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fromDate</column-name><column-value><![CDATA[");
		sb.append(getFromDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toDate</column-name><column-value><![CDATA[");
		sb.append(getToDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _healthCrewPassengerCode;
	private String _passengerOrCrewCode;
	private String _passengerOrCrewName;
	private int _classOrRating;
	private String _stateVisitedCode;
	private String _portVisitedCode;
	private Date _fromDate;
	private Date _toDate;
	private BaseModel<?> _tempHealthCrewPassengerListRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}