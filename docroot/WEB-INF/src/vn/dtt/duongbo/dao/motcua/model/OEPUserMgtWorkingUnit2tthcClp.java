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

package vn.dtt.duongbo.dao.motcua.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import vn.dtt.duongbo.dao.motcua.service.ClpSerializer;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnit2tthcLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class OEPUserMgtWorkingUnit2tthcClp extends BaseModelImpl<OEPUserMgtWorkingUnit2tthc>
	implements OEPUserMgtWorkingUnit2tthc {
	public OEPUserMgtWorkingUnit2tthcClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return OEPUserMgtWorkingUnit2tthc.class;
	}

	@Override
	public String getModelClassName() {
		return OEPUserMgtWorkingUnit2tthc.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _workingUnit2TTHCId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setWorkingUnit2TTHCId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _workingUnit2TTHCId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("workingUnit2TTHCId", getWorkingUnit2TTHCId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("workingUnitId", getWorkingUnitId());
		attributes.put("TTHCId", getTTHCId());
		attributes.put("laDonViTiepNhanBanDau", getLaDonViTiepNhanBanDau());
		attributes.put("parentWorkingUnitID", getParentWorkingUnitID());
		attributes.put("tiepNhanTrucTiep", getTiepNhanTrucTiep());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long workingUnit2TTHCId = (Long)attributes.get("workingUnit2TTHCId");

		if (workingUnit2TTHCId != null) {
			setWorkingUnit2TTHCId(workingUnit2TTHCId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long workingUnitId = (Long)attributes.get("workingUnitId");

		if (workingUnitId != null) {
			setWorkingUnitId(workingUnitId);
		}

		Long TTHCId = (Long)attributes.get("TTHCId");

		if (TTHCId != null) {
			setTTHCId(TTHCId);
		}

		Integer laDonViTiepNhanBanDau = (Integer)attributes.get(
				"laDonViTiepNhanBanDau");

		if (laDonViTiepNhanBanDau != null) {
			setLaDonViTiepNhanBanDau(laDonViTiepNhanBanDau);
		}

		Long parentWorkingUnitID = (Long)attributes.get("parentWorkingUnitID");

		if (parentWorkingUnitID != null) {
			setParentWorkingUnitID(parentWorkingUnitID);
		}

		Integer tiepNhanTrucTiep = (Integer)attributes.get("tiepNhanTrucTiep");

		if (tiepNhanTrucTiep != null) {
			setTiepNhanTrucTiep(tiepNhanTrucTiep);
		}
	}

	@Override
	public long getWorkingUnit2TTHCId() {
		return _workingUnit2TTHCId;
	}

	@Override
	public void setWorkingUnit2TTHCId(long workingUnit2TTHCId) {
		_workingUnit2TTHCId = workingUnit2TTHCId;

		if (_oepUserMgtWorkingUnit2tthcRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnit2tthcRemoteModel.getClass();

				Method method = clazz.getMethod("setWorkingUnit2TTHCId",
						long.class);

				method.invoke(_oepUserMgtWorkingUnit2tthcRemoteModel,
					workingUnit2TTHCId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_oepUserMgtWorkingUnit2tthcRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnit2tthcRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_oepUserMgtWorkingUnit2tthcRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_oepUserMgtWorkingUnit2tthcRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnit2tthcRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_oepUserMgtWorkingUnit2tthcRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_oepUserMgtWorkingUnit2tthcRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnit2tthcRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_oepUserMgtWorkingUnit2tthcRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_oepUserMgtWorkingUnit2tthcRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnit2tthcRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_oepUserMgtWorkingUnit2tthcRemoteModel, createDate);
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

		if (_oepUserMgtWorkingUnit2tthcRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnit2tthcRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_oepUserMgtWorkingUnit2tthcRemoteModel,
					modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getWorkingUnitId() {
		return _workingUnitId;
	}

	@Override
	public void setWorkingUnitId(long workingUnitId) {
		_workingUnitId = workingUnitId;

		if (_oepUserMgtWorkingUnit2tthcRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnit2tthcRemoteModel.getClass();

				Method method = clazz.getMethod("setWorkingUnitId", long.class);

				method.invoke(_oepUserMgtWorkingUnit2tthcRemoteModel,
					workingUnitId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTTHCId() {
		return _TTHCId;
	}

	@Override
	public void setTTHCId(long TTHCId) {
		_TTHCId = TTHCId;

		if (_oepUserMgtWorkingUnit2tthcRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnit2tthcRemoteModel.getClass();

				Method method = clazz.getMethod("setTTHCId", long.class);

				method.invoke(_oepUserMgtWorkingUnit2tthcRemoteModel, TTHCId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLaDonViTiepNhanBanDau() {
		return _laDonViTiepNhanBanDau;
	}

	@Override
	public void setLaDonViTiepNhanBanDau(int laDonViTiepNhanBanDau) {
		_laDonViTiepNhanBanDau = laDonViTiepNhanBanDau;

		if (_oepUserMgtWorkingUnit2tthcRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnit2tthcRemoteModel.getClass();

				Method method = clazz.getMethod("setLaDonViTiepNhanBanDau",
						int.class);

				method.invoke(_oepUserMgtWorkingUnit2tthcRemoteModel,
					laDonViTiepNhanBanDau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getParentWorkingUnitID() {
		return _parentWorkingUnitID;
	}

	@Override
	public void setParentWorkingUnitID(long parentWorkingUnitID) {
		_parentWorkingUnitID = parentWorkingUnitID;

		if (_oepUserMgtWorkingUnit2tthcRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnit2tthcRemoteModel.getClass();

				Method method = clazz.getMethod("setParentWorkingUnitID",
						long.class);

				method.invoke(_oepUserMgtWorkingUnit2tthcRemoteModel,
					parentWorkingUnitID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTiepNhanTrucTiep() {
		return _tiepNhanTrucTiep;
	}

	@Override
	public void setTiepNhanTrucTiep(int tiepNhanTrucTiep) {
		_tiepNhanTrucTiep = tiepNhanTrucTiep;

		if (_oepUserMgtWorkingUnit2tthcRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtWorkingUnit2tthcRemoteModel.getClass();

				Method method = clazz.getMethod("setTiepNhanTrucTiep", int.class);

				method.invoke(_oepUserMgtWorkingUnit2tthcRemoteModel,
					tiepNhanTrucTiep);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getOEPUserMgtWorkingUnit2tthcRemoteModel() {
		return _oepUserMgtWorkingUnit2tthcRemoteModel;
	}

	public void setOEPUserMgtWorkingUnit2tthcRemoteModel(
		BaseModel<?> oepUserMgtWorkingUnit2tthcRemoteModel) {
		_oepUserMgtWorkingUnit2tthcRemoteModel = oepUserMgtWorkingUnit2tthcRemoteModel;
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

		Class<?> remoteModelClass = _oepUserMgtWorkingUnit2tthcRemoteModel.getClass();

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

		Object returnValue = method.invoke(_oepUserMgtWorkingUnit2tthcRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			OEPUserMgtWorkingUnit2tthcLocalServiceUtil.addOEPUserMgtWorkingUnit2tthc(this);
		}
		else {
			OEPUserMgtWorkingUnit2tthcLocalServiceUtil.updateOEPUserMgtWorkingUnit2tthc(this);
		}
	}

	@Override
	public OEPUserMgtWorkingUnit2tthc toEscapedModel() {
		return (OEPUserMgtWorkingUnit2tthc)ProxyUtil.newProxyInstance(OEPUserMgtWorkingUnit2tthc.class.getClassLoader(),
			new Class[] { OEPUserMgtWorkingUnit2tthc.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		OEPUserMgtWorkingUnit2tthcClp clone = new OEPUserMgtWorkingUnit2tthcClp();

		clone.setWorkingUnit2TTHCId(getWorkingUnit2TTHCId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setWorkingUnitId(getWorkingUnitId());
		clone.setTTHCId(getTTHCId());
		clone.setLaDonViTiepNhanBanDau(getLaDonViTiepNhanBanDau());
		clone.setParentWorkingUnitID(getParentWorkingUnitID());
		clone.setTiepNhanTrucTiep(getTiepNhanTrucTiep());

		return clone;
	}

	@Override
	public int compareTo(OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc) {
		long primaryKey = oepUserMgtWorkingUnit2tthc.getPrimaryKey();

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

		if (!(obj instanceof OEPUserMgtWorkingUnit2tthcClp)) {
			return false;
		}

		OEPUserMgtWorkingUnit2tthcClp oepUserMgtWorkingUnit2tthc = (OEPUserMgtWorkingUnit2tthcClp)obj;

		long primaryKey = oepUserMgtWorkingUnit2tthc.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{workingUnit2TTHCId=");
		sb.append(getWorkingUnit2TTHCId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", workingUnitId=");
		sb.append(getWorkingUnitId());
		sb.append(", TTHCId=");
		sb.append(getTTHCId());
		sb.append(", laDonViTiepNhanBanDau=");
		sb.append(getLaDonViTiepNhanBanDau());
		sb.append(", parentWorkingUnitID=");
		sb.append(getParentWorkingUnitID());
		sb.append(", tiepNhanTrucTiep=");
		sb.append(getTiepNhanTrucTiep());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>workingUnit2TTHCId</column-name><column-value><![CDATA[");
		sb.append(getWorkingUnit2TTHCId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>workingUnitId</column-name><column-value><![CDATA[");
		sb.append(getWorkingUnitId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TTHCId</column-name><column-value><![CDATA[");
		sb.append(getTTHCId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>laDonViTiepNhanBanDau</column-name><column-value><![CDATA[");
		sb.append(getLaDonViTiepNhanBanDau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentWorkingUnitID</column-name><column-value><![CDATA[");
		sb.append(getParentWorkingUnitID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiepNhanTrucTiep</column-name><column-value><![CDATA[");
		sb.append(getTiepNhanTrucTiep());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _workingUnit2TTHCId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _workingUnitId;
	private long _TTHCId;
	private int _laDonViTiepNhanBanDau;
	private long _parentWorkingUnitID;
	private int _tiepNhanTrucTiep;
	private BaseModel<?> _oepUserMgtWorkingUnit2tthcRemoteModel;
}