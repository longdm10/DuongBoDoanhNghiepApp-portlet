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
import vn.dtt.duongbien.dao.vrcb.service.DmCertificateLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmCertificateClp extends BaseModelImpl<DmCertificate>
	implements DmCertificate {
	public DmCertificateClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmCertificate.class;
	}

	@Override
	public String getModelClassName() {
		return DmCertificate.class.getName();
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
		attributes.put("certificateCode", getCertificateCode());
		attributes.put("certificateName", getCertificateName());
		attributes.put("certificateNameVN", getCertificateNameVN());
		attributes.put("certificateOrder", getCertificateOrder());
		attributes.put("isDelete", getIsDelete());
		attributes.put("markedAsDelete", getMarkedAsDelete());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("syncVersion", getSyncVersion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String certificateCode = (String)attributes.get("certificateCode");

		if (certificateCode != null) {
			setCertificateCode(certificateCode);
		}

		String certificateName = (String)attributes.get("certificateName");

		if (certificateName != null) {
			setCertificateName(certificateName);
		}

		String certificateNameVN = (String)attributes.get("certificateNameVN");

		if (certificateNameVN != null) {
			setCertificateNameVN(certificateNameVN);
		}

		Integer certificateOrder = (Integer)attributes.get("certificateOrder");

		if (certificateOrder != null) {
			setCertificateOrder(certificateOrder);
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
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_dmCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _dmCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dmCertificateRemoteModel, id);
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

		if (_dmCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _dmCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateCode",
						String.class);

				method.invoke(_dmCertificateRemoteModel, certificateCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCertificateName() {
		return _certificateName;
	}

	@Override
	public void setCertificateName(String certificateName) {
		_certificateName = certificateName;

		if (_dmCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _dmCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateName",
						String.class);

				method.invoke(_dmCertificateRemoteModel, certificateName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCertificateNameVN() {
		return _certificateNameVN;
	}

	@Override
	public void setCertificateNameVN(String certificateNameVN) {
		_certificateNameVN = certificateNameVN;

		if (_dmCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _dmCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateNameVN",
						String.class);

				method.invoke(_dmCertificateRemoteModel, certificateNameVN);
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

		if (_dmCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _dmCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateOrder", int.class);

				method.invoke(_dmCertificateRemoteModel, certificateOrder);
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

		if (_dmCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _dmCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmCertificateRemoteModel, isDelete);
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

		if (_dmCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _dmCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmCertificateRemoteModel, markedAsDelete);
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

		if (_dmCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _dmCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmCertificateRemoteModel, modifiedDate);
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

		if (_dmCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _dmCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmCertificateRemoteModel, requestedDate);
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

		if (_dmCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _dmCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmCertificateRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmCertificateRemoteModel() {
		return _dmCertificateRemoteModel;
	}

	public void setDmCertificateRemoteModel(
		BaseModel<?> dmCertificateRemoteModel) {
		_dmCertificateRemoteModel = dmCertificateRemoteModel;
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

		Class<?> remoteModelClass = _dmCertificateRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmCertificateRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmCertificateLocalServiceUtil.addDmCertificate(this);
		}
		else {
			DmCertificateLocalServiceUtil.updateDmCertificate(this);
		}
	}

	@Override
	public DmCertificate toEscapedModel() {
		return (DmCertificate)ProxyUtil.newProxyInstance(DmCertificate.class.getClassLoader(),
			new Class[] { DmCertificate.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmCertificateClp clone = new DmCertificateClp();

		clone.setId(getId());
		clone.setCertificateCode(getCertificateCode());
		clone.setCertificateName(getCertificateName());
		clone.setCertificateNameVN(getCertificateNameVN());
		clone.setCertificateOrder(getCertificateOrder());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmCertificate dmCertificate) {
		int value = 0;

		if (getId() < dmCertificate.getId()) {
			value = -1;
		}
		else if (getId() > dmCertificate.getId()) {
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

		if (!(obj instanceof DmCertificateClp)) {
			return false;
		}

		DmCertificateClp dmCertificate = (DmCertificateClp)obj;

		long primaryKey = dmCertificate.getPrimaryKey();

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
		sb.append(", certificateCode=");
		sb.append(getCertificateCode());
		sb.append(", certificateName=");
		sb.append(getCertificateName());
		sb.append(", certificateNameVN=");
		sb.append(getCertificateNameVN());
		sb.append(", certificateOrder=");
		sb.append(getCertificateOrder());
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
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmCertificate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateCode</column-name><column-value><![CDATA[");
		sb.append(getCertificateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateName</column-name><column-value><![CDATA[");
		sb.append(getCertificateName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateNameVN</column-name><column-value><![CDATA[");
		sb.append(getCertificateNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateOrder</column-name><column-value><![CDATA[");
		sb.append(getCertificateOrder());
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

	private long _id;
	private String _certificateCode;
	private String _certificateName;
	private String _certificateNameVN;
	private int _certificateOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmCertificateRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}