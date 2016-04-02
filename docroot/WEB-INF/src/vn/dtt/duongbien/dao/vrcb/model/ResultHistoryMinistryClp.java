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
import vn.dtt.duongbien.dao.vrcb.service.ResultHistoryMinistryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class ResultHistoryMinistryClp extends BaseModelImpl<ResultHistoryMinistry>
	implements ResultHistoryMinistry {
	public ResultHistoryMinistryClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ResultHistoryMinistry.class;
	}

	@Override
	public String getModelClassName() {
		return ResultHistoryMinistry.class.getName();
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
		attributes.put("ministryCode", getMinistryCode());
		attributes.put("organization", getOrganization());
		attributes.put("division", getDivision());
		attributes.put("officerName", getOfficerName());
		attributes.put("latestDate", getLatestDate());
		attributes.put("businessTypeCode", getBusinessTypeCode());
		attributes.put("response", getResponse());
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

		String ministryCode = (String)attributes.get("ministryCode");

		if (ministryCode != null) {
			setMinistryCode(ministryCode);
		}

		String organization = (String)attributes.get("organization");

		if (organization != null) {
			setOrganization(organization);
		}

		String division = (String)attributes.get("division");

		if (division != null) {
			setDivision(division);
		}

		String officerName = (String)attributes.get("officerName");

		if (officerName != null) {
			setOfficerName(officerName);
		}

		Date latestDate = (Date)attributes.get("latestDate");

		if (latestDate != null) {
			setLatestDate(latestDate);
		}

		Integer businessTypeCode = (Integer)attributes.get("businessTypeCode");

		if (businessTypeCode != null) {
			setBusinessTypeCode(businessTypeCode);
		}

		String response = (String)attributes.get("response");

		if (response != null) {
			setResponse(response);
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

		if (_resultHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _resultHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_resultHistoryMinistryRemoteModel, id);
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

		if (_resultHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _resultHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_resultHistoryMinistryRemoteModel, requestCode);
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

		if (_resultHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _resultHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestState", int.class);

				method.invoke(_resultHistoryMinistryRemoteModel, requestState);
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

		if (_resultHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _resultHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_resultHistoryMinistryRemoteModel, documentName);
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

		if (_resultHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _resultHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_resultHistoryMinistryRemoteModel, documentYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMinistryCode() {
		return _ministryCode;
	}

	@Override
	public void setMinistryCode(String ministryCode) {
		_ministryCode = ministryCode;

		if (_resultHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _resultHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setMinistryCode", String.class);

				method.invoke(_resultHistoryMinistryRemoteModel, ministryCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOrganization() {
		return _organization;
	}

	@Override
	public void setOrganization(String organization) {
		_organization = organization;

		if (_resultHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _resultHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganization", String.class);

				method.invoke(_resultHistoryMinistryRemoteModel, organization);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDivision() {
		return _division;
	}

	@Override
	public void setDivision(String division) {
		_division = division;

		if (_resultHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _resultHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setDivision", String.class);

				method.invoke(_resultHistoryMinistryRemoteModel, division);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOfficerName() {
		return _officerName;
	}

	@Override
	public void setOfficerName(String officerName) {
		_officerName = officerName;

		if (_resultHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _resultHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setOfficerName", String.class);

				method.invoke(_resultHistoryMinistryRemoteModel, officerName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getLatestDate() {
		return _latestDate;
	}

	@Override
	public void setLatestDate(Date latestDate) {
		_latestDate = latestDate;

		if (_resultHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _resultHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setLatestDate", Date.class);

				method.invoke(_resultHistoryMinistryRemoteModel, latestDate);
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

		if (_resultHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _resultHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setBusinessTypeCode", int.class);

				method.invoke(_resultHistoryMinistryRemoteModel,
					businessTypeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getResponse() {
		return _response;
	}

	@Override
	public void setResponse(String response) {
		_response = response;

		if (_resultHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _resultHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setResponse", String.class);

				method.invoke(_resultHistoryMinistryRemoteModel, response);
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

		if (_resultHistoryMinistryRemoteModel != null) {
			try {
				Class<?> clazz = _resultHistoryMinistryRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_resultHistoryMinistryRemoteModel, remarks);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getResultHistoryMinistryRemoteModel() {
		return _resultHistoryMinistryRemoteModel;
	}

	public void setResultHistoryMinistryRemoteModel(
		BaseModel<?> resultHistoryMinistryRemoteModel) {
		_resultHistoryMinistryRemoteModel = resultHistoryMinistryRemoteModel;
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

		Class<?> remoteModelClass = _resultHistoryMinistryRemoteModel.getClass();

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

		Object returnValue = method.invoke(_resultHistoryMinistryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ResultHistoryMinistryLocalServiceUtil.addResultHistoryMinistry(this);
		}
		else {
			ResultHistoryMinistryLocalServiceUtil.updateResultHistoryMinistry(this);
		}
	}

	@Override
	public ResultHistoryMinistry toEscapedModel() {
		return (ResultHistoryMinistry)ProxyUtil.newProxyInstance(ResultHistoryMinistry.class.getClassLoader(),
			new Class[] { ResultHistoryMinistry.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ResultHistoryMinistryClp clone = new ResultHistoryMinistryClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setMinistryCode(getMinistryCode());
		clone.setOrganization(getOrganization());
		clone.setDivision(getDivision());
		clone.setOfficerName(getOfficerName());
		clone.setLatestDate(getLatestDate());
		clone.setBusinessTypeCode(getBusinessTypeCode());
		clone.setResponse(getResponse());
		clone.setRemarks(getRemarks());

		return clone;
	}

	@Override
	public int compareTo(ResultHistoryMinistry resultHistoryMinistry) {
		int value = 0;

		if (getId() < resultHistoryMinistry.getId()) {
			value = -1;
		}
		else if (getId() > resultHistoryMinistry.getId()) {
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

		if (!(obj instanceof ResultHistoryMinistryClp)) {
			return false;
		}

		ResultHistoryMinistryClp resultHistoryMinistry = (ResultHistoryMinistryClp)obj;

		long primaryKey = resultHistoryMinistry.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

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
		sb.append(", ministryCode=");
		sb.append(getMinistryCode());
		sb.append(", organization=");
		sb.append(getOrganization());
		sb.append(", division=");
		sb.append(getDivision());
		sb.append(", officerName=");
		sb.append(getOfficerName());
		sb.append(", latestDate=");
		sb.append(getLatestDate());
		sb.append(", businessTypeCode=");
		sb.append(getBusinessTypeCode());
		sb.append(", response=");
		sb.append(getResponse());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry");
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
			"<column><column-name>ministryCode</column-name><column-value><![CDATA[");
		sb.append(getMinistryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organization</column-name><column-value><![CDATA[");
		sb.append(getOrganization());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>division</column-name><column-value><![CDATA[");
		sb.append(getDivision());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>officerName</column-name><column-value><![CDATA[");
		sb.append(getOfficerName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>latestDate</column-name><column-value><![CDATA[");
		sb.append(getLatestDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessTypeCode</column-name><column-value><![CDATA[");
		sb.append(getBusinessTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>response</column-name><column-value><![CDATA[");
		sb.append(getResponse());
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
	private String _ministryCode;
	private String _organization;
	private String _division;
	private String _officerName;
	private Date _latestDate;
	private int _businessTypeCode;
	private String _response;
	private String _remarks;
	private BaseModel<?> _resultHistoryMinistryRemoteModel;
}