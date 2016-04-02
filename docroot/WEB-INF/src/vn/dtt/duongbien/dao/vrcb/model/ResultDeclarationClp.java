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
import vn.dtt.duongbien.dao.vrcb.service.ResultDeclarationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class ResultDeclarationClp extends BaseModelImpl<ResultDeclaration>
	implements ResultDeclaration {
	public ResultDeclarationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ResultDeclaration.class;
	}

	@Override
	public String getModelClassName() {
		return ResultDeclaration.class.getName();
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
		attributes.put("requestState", getRequestState());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("businessOrder", getBusinessOrder());
		attributes.put("businessTypeCode", getBusinessTypeCode());
		attributes.put("latestSend", getLatestSend());
		attributes.put("declarationTime", getDeclarationTime());
		attributes.put("arrivalDepartureTime", getArrivalDepartureTime());
		attributes.put("remainingTime", getRemainingTime());
		attributes.put("remarks", getRemarks());

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

		Integer requestState = (Integer)attributes.get("requestState");

		if (requestState != null) {
			setRequestState(requestState);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}

		Integer businessOrder = (Integer)attributes.get("businessOrder");

		if (businessOrder != null) {
			setBusinessOrder(businessOrder);
		}

		Integer businessTypeCode = (Integer)attributes.get("businessTypeCode");

		if (businessTypeCode != null) {
			setBusinessTypeCode(businessTypeCode);
		}

		Integer latestSend = (Integer)attributes.get("latestSend");

		if (latestSend != null) {
			setLatestSend(latestSend);
		}

		Date declarationTime = (Date)attributes.get("declarationTime");

		if (declarationTime != null) {
			setDeclarationTime(declarationTime);
		}

		Date arrivalDepartureTime = (Date)attributes.get("arrivalDepartureTime");

		if (arrivalDepartureTime != null) {
			setArrivalDepartureTime(arrivalDepartureTime);
		}

		String remainingTime = (String)attributes.get("remainingTime");

		if (remainingTime != null) {
			setRemainingTime(remainingTime);
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

		if (_resultDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _resultDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_resultDeclarationRemoteModel, id);
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

		if (_resultDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _resultDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_resultDeclarationRemoteModel, requestCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getRequestState() {
		return _requestState;
	}

	@Override
	public void setRequestState(int requestState) {
		_requestState = requestState;

		if (_resultDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _resultDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestState", int.class);

				method.invoke(_resultDeclarationRemoteModel, requestState);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDocumentName() {
		return _documentName;
	}

	@Override
	public void setDocumentName(long documentName) {
		_documentName = documentName;

		if (_resultDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _resultDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_resultDeclarationRemoteModel, documentName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDocumentYear() {
		return _documentYear;
	}

	@Override
	public void setDocumentYear(int documentYear) {
		_documentYear = documentYear;

		if (_resultDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _resultDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_resultDeclarationRemoteModel, documentYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getBusinessOrder() {
		return _businessOrder;
	}

	@Override
	public void setBusinessOrder(int businessOrder) {
		_businessOrder = businessOrder;

		if (_resultDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _resultDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setBusinessOrder", int.class);

				method.invoke(_resultDeclarationRemoteModel, businessOrder);
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

		if (_resultDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _resultDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setBusinessTypeCode", int.class);

				method.invoke(_resultDeclarationRemoteModel, businessTypeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLatestSend() {
		return _latestSend;
	}

	@Override
	public void setLatestSend(int latestSend) {
		_latestSend = latestSend;

		if (_resultDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _resultDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setLatestSend", int.class);

				method.invoke(_resultDeclarationRemoteModel, latestSend);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDeclarationTime() {
		return _declarationTime;
	}

	@Override
	public void setDeclarationTime(Date declarationTime) {
		_declarationTime = declarationTime;

		if (_resultDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _resultDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setDeclarationTime", Date.class);

				method.invoke(_resultDeclarationRemoteModel, declarationTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getArrivalDepartureTime() {
		return _arrivalDepartureTime;
	}

	@Override
	public void setArrivalDepartureTime(Date arrivalDepartureTime) {
		_arrivalDepartureTime = arrivalDepartureTime;

		if (_resultDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _resultDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setArrivalDepartureTime",
						Date.class);

				method.invoke(_resultDeclarationRemoteModel,
					arrivalDepartureTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRemainingTime() {
		return _remainingTime;
	}

	@Override
	public void setRemainingTime(String remainingTime) {
		_remainingTime = remainingTime;

		if (_resultDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _resultDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setRemainingTime", String.class);

				method.invoke(_resultDeclarationRemoteModel, remainingTime);
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

		if (_resultDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _resultDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_resultDeclarationRemoteModel, remarks);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getResultDeclarationRemoteModel() {
		return _resultDeclarationRemoteModel;
	}

	public void setResultDeclarationRemoteModel(
		BaseModel<?> resultDeclarationRemoteModel) {
		_resultDeclarationRemoteModel = resultDeclarationRemoteModel;
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

		Class<?> remoteModelClass = _resultDeclarationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_resultDeclarationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ResultDeclarationLocalServiceUtil.addResultDeclaration(this);
		}
		else {
			ResultDeclarationLocalServiceUtil.updateResultDeclaration(this);
		}
	}

	@Override
	public ResultDeclaration toEscapedModel() {
		return (ResultDeclaration)ProxyUtil.newProxyInstance(ResultDeclaration.class.getClassLoader(),
			new Class[] { ResultDeclaration.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ResultDeclarationClp clone = new ResultDeclarationClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setBusinessOrder(getBusinessOrder());
		clone.setBusinessTypeCode(getBusinessTypeCode());
		clone.setLatestSend(getLatestSend());
		clone.setDeclarationTime(getDeclarationTime());
		clone.setArrivalDepartureTime(getArrivalDepartureTime());
		clone.setRemainingTime(getRemainingTime());
		clone.setRemarks(getRemarks());

		return clone;
	}

	@Override
	public int compareTo(ResultDeclaration resultDeclaration) {
		int value = 0;

		if (getId() < resultDeclaration.getId()) {
			value = -1;
		}
		else if (getId() > resultDeclaration.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

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

		if (!(obj instanceof ResultDeclarationClp)) {
			return false;
		}

		ResultDeclarationClp resultDeclaration = (ResultDeclarationClp)obj;

		long primaryKey = resultDeclaration.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", businessOrder=");
		sb.append(getBusinessOrder());
		sb.append(", businessTypeCode=");
		sb.append(getBusinessTypeCode());
		sb.append(", latestSend=");
		sb.append(getLatestSend());
		sb.append(", declarationTime=");
		sb.append(getDeclarationTime());
		sb.append(", arrivalDepartureTime=");
		sb.append(getArrivalDepartureTime());
		sb.append(", remainingTime=");
		sb.append(getRemainingTime());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration");
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
			"<column><column-name>requestState</column-name><column-value><![CDATA[");
		sb.append(getRequestState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessOrder</column-name><column-value><![CDATA[");
		sb.append(getBusinessOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessTypeCode</column-name><column-value><![CDATA[");
		sb.append(getBusinessTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>latestSend</column-name><column-value><![CDATA[");
		sb.append(getLatestSend());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>declarationTime</column-name><column-value><![CDATA[");
		sb.append(getDeclarationTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>arrivalDepartureTime</column-name><column-value><![CDATA[");
		sb.append(getArrivalDepartureTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remainingTime</column-name><column-value><![CDATA[");
		sb.append(getRemainingTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private int _requestState;
	private long _documentName;
	private int _documentYear;
	private int _businessOrder;
	private int _businessTypeCode;
	private int _latestSend;
	private Date _declarationTime;
	private Date _arrivalDepartureTime;
	private String _remainingTime;
	private String _remarks;
	private BaseModel<?> _resultDeclarationRemoteModel;
}