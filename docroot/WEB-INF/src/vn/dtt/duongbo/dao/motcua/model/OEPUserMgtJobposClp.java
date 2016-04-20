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
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtJobposLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class OEPUserMgtJobposClp extends BaseModelImpl<OEPUserMgtJobpos>
	implements OEPUserMgtJobpos {
	public OEPUserMgtJobposClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return OEPUserMgtJobpos.class;
	}

	@Override
	public String getModelClassName() {
		return OEPUserMgtJobpos.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _jobPosId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setJobPosId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _jobPosId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jobPosId", getJobPosId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("title", getTitle());
		attributes.put("positionCatNo", getPositionCatNo());
		attributes.put("workingUnitId", getWorkingUnitId());
		attributes.put("leader", getLeader());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jobPosId = (Long)attributes.get("jobPosId");

		if (jobPosId != null) {
			setJobPosId(jobPosId);
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

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String positionCatNo = (String)attributes.get("positionCatNo");

		if (positionCatNo != null) {
			setPositionCatNo(positionCatNo);
		}

		Long workingUnitId = (Long)attributes.get("workingUnitId");

		if (workingUnitId != null) {
			setWorkingUnitId(workingUnitId);
		}

		Integer leader = (Integer)attributes.get("leader");

		if (leader != null) {
			setLeader(leader);
		}
	}

	@Override
	public long getJobPosId() {
		return _jobPosId;
	}

	@Override
	public void setJobPosId(long jobPosId) {
		_jobPosId = jobPosId;

		if (_oepUserMgtJobposRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtJobposRemoteModel.getClass();

				Method method = clazz.getMethod("setJobPosId", long.class);

				method.invoke(_oepUserMgtJobposRemoteModel, jobPosId);
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

		if (_oepUserMgtJobposRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtJobposRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_oepUserMgtJobposRemoteModel, userId);
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

		if (_oepUserMgtJobposRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtJobposRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_oepUserMgtJobposRemoteModel, groupId);
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

		if (_oepUserMgtJobposRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtJobposRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_oepUserMgtJobposRemoteModel, companyId);
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

		if (_oepUserMgtJobposRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtJobposRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_oepUserMgtJobposRemoteModel, createDate);
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

		if (_oepUserMgtJobposRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtJobposRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_oepUserMgtJobposRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTitle() {
		return _title;
	}

	@Override
	public void setTitle(String title) {
		_title = title;

		if (_oepUserMgtJobposRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtJobposRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_oepUserMgtJobposRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPositionCatNo() {
		return _positionCatNo;
	}

	@Override
	public void setPositionCatNo(String positionCatNo) {
		_positionCatNo = positionCatNo;

		if (_oepUserMgtJobposRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtJobposRemoteModel.getClass();

				Method method = clazz.getMethod("setPositionCatNo", String.class);

				method.invoke(_oepUserMgtJobposRemoteModel, positionCatNo);
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

		if (_oepUserMgtJobposRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtJobposRemoteModel.getClass();

				Method method = clazz.getMethod("setWorkingUnitId", long.class);

				method.invoke(_oepUserMgtJobposRemoteModel, workingUnitId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLeader() {
		return _leader;
	}

	@Override
	public void setLeader(int leader) {
		_leader = leader;

		if (_oepUserMgtJobposRemoteModel != null) {
			try {
				Class<?> clazz = _oepUserMgtJobposRemoteModel.getClass();

				Method method = clazz.getMethod("setLeader", int.class);

				method.invoke(_oepUserMgtJobposRemoteModel, leader);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getOEPUserMgtJobposRemoteModel() {
		return _oepUserMgtJobposRemoteModel;
	}

	public void setOEPUserMgtJobposRemoteModel(
		BaseModel<?> oepUserMgtJobposRemoteModel) {
		_oepUserMgtJobposRemoteModel = oepUserMgtJobposRemoteModel;
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

		Class<?> remoteModelClass = _oepUserMgtJobposRemoteModel.getClass();

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

		Object returnValue = method.invoke(_oepUserMgtJobposRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			OEPUserMgtJobposLocalServiceUtil.addOEPUserMgtJobpos(this);
		}
		else {
			OEPUserMgtJobposLocalServiceUtil.updateOEPUserMgtJobpos(this);
		}
	}

	@Override
	public OEPUserMgtJobpos toEscapedModel() {
		return (OEPUserMgtJobpos)ProxyUtil.newProxyInstance(OEPUserMgtJobpos.class.getClassLoader(),
			new Class[] { OEPUserMgtJobpos.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		OEPUserMgtJobposClp clone = new OEPUserMgtJobposClp();

		clone.setJobPosId(getJobPosId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTitle(getTitle());
		clone.setPositionCatNo(getPositionCatNo());
		clone.setWorkingUnitId(getWorkingUnitId());
		clone.setLeader(getLeader());

		return clone;
	}

	@Override
	public int compareTo(OEPUserMgtJobpos oepUserMgtJobpos) {
		long primaryKey = oepUserMgtJobpos.getPrimaryKey();

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

		if (!(obj instanceof OEPUserMgtJobposClp)) {
			return false;
		}

		OEPUserMgtJobposClp oepUserMgtJobpos = (OEPUserMgtJobposClp)obj;

		long primaryKey = oepUserMgtJobpos.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{jobPosId=");
		sb.append(getJobPosId());
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
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", positionCatNo=");
		sb.append(getPositionCatNo());
		sb.append(", workingUnitId=");
		sb.append(getWorkingUnitId());
		sb.append(", leader=");
		sb.append(getLeader());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>jobPosId</column-name><column-value><![CDATA[");
		sb.append(getJobPosId());
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
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>positionCatNo</column-name><column-value><![CDATA[");
		sb.append(getPositionCatNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>workingUnitId</column-name><column-value><![CDATA[");
		sb.append(getWorkingUnitId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>leader</column-name><column-value><![CDATA[");
		sb.append(getLeader());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _jobPosId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _title;
	private String _positionCatNo;
	private long _workingUnitId;
	private int _leader;
	private BaseModel<?> _oepUserMgtJobposRemoteModel;
}