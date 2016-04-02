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
import vn.dtt.duongbien.dao.vrcb.service.DmGoodsTypeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmGoodsTypeClp extends BaseModelImpl<DmGoodsType>
	implements DmGoodsType {
	public DmGoodsTypeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmGoodsType.class;
	}

	@Override
	public String getModelClassName() {
		return DmGoodsType.class.getName();
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
		attributes.put("goodsTypeCode", getGoodsTypeCode());
		attributes.put("goodsTypeName", getGoodsTypeName());
		attributes.put("goodsTypeNameVN", getGoodsTypeNameVN());
		attributes.put("goodsTypeOrder", getGoodsTypeOrder());
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

		String goodsTypeCode = (String)attributes.get("goodsTypeCode");

		if (goodsTypeCode != null) {
			setGoodsTypeCode(goodsTypeCode);
		}

		String goodsTypeName = (String)attributes.get("goodsTypeName");

		if (goodsTypeName != null) {
			setGoodsTypeName(goodsTypeName);
		}

		String goodsTypeNameVN = (String)attributes.get("goodsTypeNameVN");

		if (goodsTypeNameVN != null) {
			setGoodsTypeNameVN(goodsTypeNameVN);
		}

		Integer goodsTypeOrder = (Integer)attributes.get("goodsTypeOrder");

		if (goodsTypeOrder != null) {
			setGoodsTypeOrder(goodsTypeOrder);
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

		if (_dmGoodsTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGoodsTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_dmGoodsTypeRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGoodsTypeCode() {
		return _goodsTypeCode;
	}

	@Override
	public void setGoodsTypeCode(String goodsTypeCode) {
		_goodsTypeCode = goodsTypeCode;

		if (_dmGoodsTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGoodsTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setGoodsTypeCode", String.class);

				method.invoke(_dmGoodsTypeRemoteModel, goodsTypeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGoodsTypeName() {
		return _goodsTypeName;
	}

	@Override
	public void setGoodsTypeName(String goodsTypeName) {
		_goodsTypeName = goodsTypeName;

		if (_dmGoodsTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGoodsTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setGoodsTypeName", String.class);

				method.invoke(_dmGoodsTypeRemoteModel, goodsTypeName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGoodsTypeNameVN() {
		return _goodsTypeNameVN;
	}

	@Override
	public void setGoodsTypeNameVN(String goodsTypeNameVN) {
		_goodsTypeNameVN = goodsTypeNameVN;

		if (_dmGoodsTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGoodsTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setGoodsTypeNameVN",
						String.class);

				method.invoke(_dmGoodsTypeRemoteModel, goodsTypeNameVN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGoodsTypeOrder() {
		return _goodsTypeOrder;
	}

	@Override
	public void setGoodsTypeOrder(int goodsTypeOrder) {
		_goodsTypeOrder = goodsTypeOrder;

		if (_dmGoodsTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGoodsTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setGoodsTypeOrder", int.class);

				method.invoke(_dmGoodsTypeRemoteModel, goodsTypeOrder);
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

		if (_dmGoodsTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGoodsTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmGoodsTypeRemoteModel, isDelete);
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

		if (_dmGoodsTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGoodsTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmGoodsTypeRemoteModel, markedAsDelete);
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

		if (_dmGoodsTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGoodsTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmGoodsTypeRemoteModel, modifiedDate);
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

		if (_dmGoodsTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGoodsTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmGoodsTypeRemoteModel, requestedDate);
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

		if (_dmGoodsTypeRemoteModel != null) {
			try {
				Class<?> clazz = _dmGoodsTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmGoodsTypeRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmGoodsTypeRemoteModel() {
		return _dmGoodsTypeRemoteModel;
	}

	public void setDmGoodsTypeRemoteModel(BaseModel<?> dmGoodsTypeRemoteModel) {
		_dmGoodsTypeRemoteModel = dmGoodsTypeRemoteModel;
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

		Class<?> remoteModelClass = _dmGoodsTypeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmGoodsTypeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmGoodsTypeLocalServiceUtil.addDmGoodsType(this);
		}
		else {
			DmGoodsTypeLocalServiceUtil.updateDmGoodsType(this);
		}
	}

	@Override
	public DmGoodsType toEscapedModel() {
		return (DmGoodsType)ProxyUtil.newProxyInstance(DmGoodsType.class.getClassLoader(),
			new Class[] { DmGoodsType.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmGoodsTypeClp clone = new DmGoodsTypeClp();

		clone.setId(getId());
		clone.setGoodsTypeCode(getGoodsTypeCode());
		clone.setGoodsTypeName(getGoodsTypeName());
		clone.setGoodsTypeNameVN(getGoodsTypeNameVN());
		clone.setGoodsTypeOrder(getGoodsTypeOrder());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmGoodsType dmGoodsType) {
		int value = 0;

		if (getId() < dmGoodsType.getId()) {
			value = -1;
		}
		else if (getId() > dmGoodsType.getId()) {
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

		if (!(obj instanceof DmGoodsTypeClp)) {
			return false;
		}

		DmGoodsTypeClp dmGoodsType = (DmGoodsTypeClp)obj;

		int primaryKey = dmGoodsType.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
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
		sb.append(", goodsTypeCode=");
		sb.append(getGoodsTypeCode());
		sb.append(", goodsTypeName=");
		sb.append(getGoodsTypeName());
		sb.append(", goodsTypeNameVN=");
		sb.append(getGoodsTypeNameVN());
		sb.append(", goodsTypeOrder=");
		sb.append(getGoodsTypeOrder());
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
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmGoodsType");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodsTypeCode</column-name><column-value><![CDATA[");
		sb.append(getGoodsTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodsTypeName</column-name><column-value><![CDATA[");
		sb.append(getGoodsTypeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodsTypeNameVN</column-name><column-value><![CDATA[");
		sb.append(getGoodsTypeNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodsTypeOrder</column-name><column-value><![CDATA[");
		sb.append(getGoodsTypeOrder());
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
	private String _goodsTypeCode;
	private String _goodsTypeName;
	private String _goodsTypeNameVN;
	private int _goodsTypeOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmGoodsTypeRemoteModel;
}