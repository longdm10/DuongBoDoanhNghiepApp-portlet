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
import vn.dtt.duongbien.dao.vrcb.service.ResultCertificateLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class ResultCertificateClp extends BaseModelImpl<ResultCertificate>
	implements ResultCertificate {
	public ResultCertificateClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ResultCertificate.class;
	}

	@Override
	public String getModelClassName() {
		return ResultCertificate.class.getName();
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
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("maritimeCode", getMaritimeCode());
		attributes.put("certificateCode", getCertificateCode());
		attributes.put("certificateOrder", getCertificateOrder());
		attributes.put("certificateNo", getCertificateNo());
		attributes.put("certificateIssueDate", getCertificateIssueDate());
		attributes.put("certificateExpiredDate", getCertificateExpiredDate());
		attributes.put("examinationDate", getExaminationDate());
		attributes.put("approvalName", getApprovalName());
		attributes.put("isExamined", getIsExamined());
		attributes.put("mandatory", getMandatory());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}

		String maritimeCode = (String)attributes.get("maritimeCode");

		if (maritimeCode != null) {
			setMaritimeCode(maritimeCode);
		}

		String certificateCode = (String)attributes.get("certificateCode");

		if (certificateCode != null) {
			setCertificateCode(certificateCode);
		}

		Integer certificateOrder = (Integer)attributes.get("certificateOrder");

		if (certificateOrder != null) {
			setCertificateOrder(certificateOrder);
		}

		String certificateNo = (String)attributes.get("certificateNo");

		if (certificateNo != null) {
			setCertificateNo(certificateNo);
		}

		Date certificateIssueDate = (Date)attributes.get("certificateIssueDate");

		if (certificateIssueDate != null) {
			setCertificateIssueDate(certificateIssueDate);
		}

		Date certificateExpiredDate = (Date)attributes.get(
				"certificateExpiredDate");

		if (certificateExpiredDate != null) {
			setCertificateExpiredDate(certificateExpiredDate);
		}

		Date examinationDate = (Date)attributes.get("examinationDate");

		if (examinationDate != null) {
			setExaminationDate(examinationDate);
		}

		String approvalName = (String)attributes.get("approvalName");

		if (approvalName != null) {
			setApprovalName(approvalName);
		}

		Integer isExamined = (Integer)attributes.get("isExamined");

		if (isExamined != null) {
			setIsExamined(isExamined);
		}

		Integer mandatory = (Integer)attributes.get("mandatory");

		if (mandatory != null) {
			setMandatory(mandatory);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_resultCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _resultCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_resultCertificateRemoteModel, id);
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

		if (_resultCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _resultCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_resultCertificateRemoteModel, documentName);
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

		if (_resultCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _resultCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_resultCertificateRemoteModel, documentYear);
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

		if (_resultCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _resultCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setMaritimeCode", String.class);

				method.invoke(_resultCertificateRemoteModel, maritimeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCertificateCode() {
		return _certificateCode;
	}

	@Override
	public void setCertificateCode(String certificateCode) {
		_certificateCode = certificateCode;

		if (_resultCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _resultCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateCode",
						String.class);

				method.invoke(_resultCertificateRemoteModel, certificateCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCertificateOrder() {
		return _certificateOrder;
	}

	@Override
	public void setCertificateOrder(int certificateOrder) {
		_certificateOrder = certificateOrder;

		if (_resultCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _resultCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateOrder", int.class);

				method.invoke(_resultCertificateRemoteModel, certificateOrder);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCertificateNo() {
		return _certificateNo;
	}

	@Override
	public void setCertificateNo(String certificateNo) {
		_certificateNo = certificateNo;

		if (_resultCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _resultCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateNo", String.class);

				method.invoke(_resultCertificateRemoteModel, certificateNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCertificateIssueDate() {
		return _certificateIssueDate;
	}

	@Override
	public void setCertificateIssueDate(Date certificateIssueDate) {
		_certificateIssueDate = certificateIssueDate;

		if (_resultCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _resultCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateIssueDate",
						Date.class);

				method.invoke(_resultCertificateRemoteModel,
					certificateIssueDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCertificateExpiredDate() {
		return _certificateExpiredDate;
	}

	@Override
	public void setCertificateExpiredDate(Date certificateExpiredDate) {
		_certificateExpiredDate = certificateExpiredDate;

		if (_resultCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _resultCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateExpiredDate",
						Date.class);

				method.invoke(_resultCertificateRemoteModel,
					certificateExpiredDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getExaminationDate() {
		return _examinationDate;
	}

	@Override
	public void setExaminationDate(Date examinationDate) {
		_examinationDate = examinationDate;

		if (_resultCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _resultCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setExaminationDate", Date.class);

				method.invoke(_resultCertificateRemoteModel, examinationDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApprovalName() {
		return _approvalName;
	}

	@Override
	public void setApprovalName(String approvalName) {
		_approvalName = approvalName;

		if (_resultCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _resultCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovalName", String.class);

				method.invoke(_resultCertificateRemoteModel, approvalName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsExamined() {
		return _isExamined;
	}

	@Override
	public void setIsExamined(int isExamined) {
		_isExamined = isExamined;

		if (_resultCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _resultCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setIsExamined", int.class);

				method.invoke(_resultCertificateRemoteModel, isExamined);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMandatory() {
		return _mandatory;
	}

	@Override
	public void setMandatory(int mandatory) {
		_mandatory = mandatory;

		if (_resultCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _resultCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setMandatory", int.class);

				method.invoke(_resultCertificateRemoteModel, mandatory);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getResultCertificateRemoteModel() {
		return _resultCertificateRemoteModel;
	}

	public void setResultCertificateRemoteModel(
		BaseModel<?> resultCertificateRemoteModel) {
		_resultCertificateRemoteModel = resultCertificateRemoteModel;
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

		Class<?> remoteModelClass = _resultCertificateRemoteModel.getClass();

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

		Object returnValue = method.invoke(_resultCertificateRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ResultCertificateLocalServiceUtil.addResultCertificate(this);
		}
		else {
			ResultCertificateLocalServiceUtil.updateResultCertificate(this);
		}
	}

	@Override
	public ResultCertificate toEscapedModel() {
		return (ResultCertificate)ProxyUtil.newProxyInstance(ResultCertificate.class.getClassLoader(),
			new Class[] { ResultCertificate.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ResultCertificateClp clone = new ResultCertificateClp();

		clone.setId(getId());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setMaritimeCode(getMaritimeCode());
		clone.setCertificateCode(getCertificateCode());
		clone.setCertificateOrder(getCertificateOrder());
		clone.setCertificateNo(getCertificateNo());
		clone.setCertificateIssueDate(getCertificateIssueDate());
		clone.setCertificateExpiredDate(getCertificateExpiredDate());
		clone.setExaminationDate(getExaminationDate());
		clone.setApprovalName(getApprovalName());
		clone.setIsExamined(getIsExamined());
		clone.setMandatory(getMandatory());

		return clone;
	}

	@Override
	public int compareTo(ResultCertificate resultCertificate) {
		int value = 0;

		if (getId() < resultCertificate.getId()) {
			value = -1;
		}
		else if (getId() > resultCertificate.getId()) {
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

		if (!(obj instanceof ResultCertificateClp)) {
			return false;
		}

		ResultCertificateClp resultCertificate = (ResultCertificateClp)obj;

		long primaryKey = resultCertificate.getPrimaryKey();

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
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", maritimeCode=");
		sb.append(getMaritimeCode());
		sb.append(", certificateCode=");
		sb.append(getCertificateCode());
		sb.append(", certificateOrder=");
		sb.append(getCertificateOrder());
		sb.append(", certificateNo=");
		sb.append(getCertificateNo());
		sb.append(", certificateIssueDate=");
		sb.append(getCertificateIssueDate());
		sb.append(", certificateExpiredDate=");
		sb.append(getCertificateExpiredDate());
		sb.append(", examinationDate=");
		sb.append(getExaminationDate());
		sb.append(", approvalName=");
		sb.append(getApprovalName());
		sb.append(", isExamined=");
		sb.append(getIsExamined());
		sb.append(", mandatory=");
		sb.append(getMandatory());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.ResultCertificate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
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
			"<column><column-name>maritimeCode</column-name><column-value><![CDATA[");
		sb.append(getMaritimeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateCode</column-name><column-value><![CDATA[");
		sb.append(getCertificateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateOrder</column-name><column-value><![CDATA[");
		sb.append(getCertificateOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateNo</column-name><column-value><![CDATA[");
		sb.append(getCertificateNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateIssueDate</column-name><column-value><![CDATA[");
		sb.append(getCertificateIssueDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateExpiredDate</column-name><column-value><![CDATA[");
		sb.append(getCertificateExpiredDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>examinationDate</column-name><column-value><![CDATA[");
		sb.append(getExaminationDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvalName</column-name><column-value><![CDATA[");
		sb.append(getApprovalName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isExamined</column-name><column-value><![CDATA[");
		sb.append(getIsExamined());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mandatory</column-name><column-value><![CDATA[");
		sb.append(getMandatory());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _documentName;
	private int _documentYear;
	private String _maritimeCode;
	private String _certificateCode;
	private int _certificateOrder;
	private String _certificateNo;
	private Date _certificateIssueDate;
	private Date _certificateExpiredDate;
	private Date _examinationDate;
	private String _approvalName;
	private int _isExamined;
	private int _mandatory;
	private BaseModel<?> _resultCertificateRemoteModel;
}