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
import vn.dtt.duongbien.dao.vrcb.service.DmRankRatingLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmRankRatingClp extends BaseModelImpl<DmRankRating>
	implements DmRankRating {
	public DmRankRatingClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmRankRating.class;
	}

	@Override
	public String getModelClassName() {
		return DmRankRating.class.getName();
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
		attributes.put("rankCode", getRankCode());
		attributes.put("rankName", getRankName());
		attributes.put("rankNameVN", getRankNameVN());
		attributes.put("rankOrder", getRankOrder());
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

		String rankCode = (String)attributes.get("rankCode");

		if (rankCode != null) {
			setRankCode(rankCode);
		}

		String rankName = (String)attributes.get("rankName");

		if (rankName != null) {
			setRankName(rankName);
		}

		String rankNameVN = (String)attributes.get("rankNameVN");

		if (rankNameVN != null) {
			setRankNameVN(rankNameVN);
		}

		Integer rankOrder = (Integer)attributes.get("rankOrder");

		if (rankOrder != null) {
			setRankOrder(rankOrder);
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

		if (_dmRankRatingRemoteModel != null) {
			try {
				Class<?> clazz = _dmRankRatingRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_dmRankRatingRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRankCode() {
		return _rankCode;
	}

	@Override
	public void setRankCode(String rankCode) {
		_rankCode = rankCode;

		if (_dmRankRatingRemoteModel != null) {
			try {
				Class<?> clazz = _dmRankRatingRemoteModel.getClass();

				Method method = clazz.getMethod("setRankCode", String.class);

				method.invoke(_dmRankRatingRemoteModel, rankCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRankName() {
		return _rankName;
	}

	@Override
	public void setRankName(String rankName) {
		_rankName = rankName;

		if (_dmRankRatingRemoteModel != null) {
			try {
				Class<?> clazz = _dmRankRatingRemoteModel.getClass();

				Method method = clazz.getMethod("setRankName", String.class);

				method.invoke(_dmRankRatingRemoteModel, rankName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRankNameVN() {
		return _rankNameVN;
	}

	@Override
	public void setRankNameVN(String rankNameVN) {
		_rankNameVN = rankNameVN;

		if (_dmRankRatingRemoteModel != null) {
			try {
				Class<?> clazz = _dmRankRatingRemoteModel.getClass();

				Method method = clazz.getMethod("setRankNameVN", String.class);

				method.invoke(_dmRankRatingRemoteModel, rankNameVN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getRankOrder() {
		return _rankOrder;
	}

	@Override
	public void setRankOrder(int rankOrder) {
		_rankOrder = rankOrder;

		if (_dmRankRatingRemoteModel != null) {
			try {
				Class<?> clazz = _dmRankRatingRemoteModel.getClass();

				Method method = clazz.getMethod("setRankOrder", int.class);

				method.invoke(_dmRankRatingRemoteModel, rankOrder);
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

		if (_dmRankRatingRemoteModel != null) {
			try {
				Class<?> clazz = _dmRankRatingRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmRankRatingRemoteModel, isDelete);
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

		if (_dmRankRatingRemoteModel != null) {
			try {
				Class<?> clazz = _dmRankRatingRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmRankRatingRemoteModel, markedAsDelete);
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

		if (_dmRankRatingRemoteModel != null) {
			try {
				Class<?> clazz = _dmRankRatingRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmRankRatingRemoteModel, modifiedDate);
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

		if (_dmRankRatingRemoteModel != null) {
			try {
				Class<?> clazz = _dmRankRatingRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmRankRatingRemoteModel, requestedDate);
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

		if (_dmRankRatingRemoteModel != null) {
			try {
				Class<?> clazz = _dmRankRatingRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmRankRatingRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmRankRatingRemoteModel() {
		return _dmRankRatingRemoteModel;
	}

	public void setDmRankRatingRemoteModel(BaseModel<?> dmRankRatingRemoteModel) {
		_dmRankRatingRemoteModel = dmRankRatingRemoteModel;
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

		Class<?> remoteModelClass = _dmRankRatingRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmRankRatingRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmRankRatingLocalServiceUtil.addDmRankRating(this);
		}
		else {
			DmRankRatingLocalServiceUtil.updateDmRankRating(this);
		}
	}

	@Override
	public DmRankRating toEscapedModel() {
		return (DmRankRating)ProxyUtil.newProxyInstance(DmRankRating.class.getClassLoader(),
			new Class[] { DmRankRating.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmRankRatingClp clone = new DmRankRatingClp();

		clone.setId(getId());
		clone.setRankCode(getRankCode());
		clone.setRankName(getRankName());
		clone.setRankNameVN(getRankNameVN());
		clone.setRankOrder(getRankOrder());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmRankRating dmRankRating) {
		int value = 0;

		if (getId() < dmRankRating.getId()) {
			value = -1;
		}
		else if (getId() > dmRankRating.getId()) {
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

		if (!(obj instanceof DmRankRatingClp)) {
			return false;
		}

		DmRankRatingClp dmRankRating = (DmRankRatingClp)obj;

		int primaryKey = dmRankRating.getPrimaryKey();

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
		sb.append(", rankCode=");
		sb.append(getRankCode());
		sb.append(", rankName=");
		sb.append(getRankName());
		sb.append(", rankNameVN=");
		sb.append(getRankNameVN());
		sb.append(", rankOrder=");
		sb.append(getRankOrder());
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
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmRankRating");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rankCode</column-name><column-value><![CDATA[");
		sb.append(getRankCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rankName</column-name><column-value><![CDATA[");
		sb.append(getRankName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rankNameVN</column-name><column-value><![CDATA[");
		sb.append(getRankNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rankOrder</column-name><column-value><![CDATA[");
		sb.append(getRankOrder());
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
	private String _rankCode;
	private String _rankName;
	private String _rankNameVN;
	private int _rankOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmRankRatingRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}