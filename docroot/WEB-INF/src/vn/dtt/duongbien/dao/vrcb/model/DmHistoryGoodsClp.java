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
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryGoodsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmHistoryGoodsClp extends BaseModelImpl<DmHistoryGoods>
	implements DmHistoryGoods {
	public DmHistoryGoodsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryGoods.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryGoods.class.getName();
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
		attributes.put("goodsItemCode", getGoodsItemCode());
		attributes.put("goodsItemName", getGoodsItemName());
		attributes.put("goodsItemNameVN", getGoodsItemNameVN());
		attributes.put("goodsItemOrder", getGoodsItemOrder());
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

		String goodsItemCode = (String)attributes.get("goodsItemCode");

		if (goodsItemCode != null) {
			setGoodsItemCode(goodsItemCode);
		}

		String goodsItemName = (String)attributes.get("goodsItemName");

		if (goodsItemName != null) {
			setGoodsItemName(goodsItemName);
		}

		String goodsItemNameVN = (String)attributes.get("goodsItemNameVN");

		if (goodsItemNameVN != null) {
			setGoodsItemNameVN(goodsItemNameVN);
		}

		Integer goodsItemOrder = (Integer)attributes.get("goodsItemOrder");

		if (goodsItemOrder != null) {
			setGoodsItemOrder(goodsItemOrder);
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

		if (_dmHistoryGoodsRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryGoodsRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_dmHistoryGoodsRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGoodsItemCode() {
		return _goodsItemCode;
	}

	@Override
	public void setGoodsItemCode(String goodsItemCode) {
		_goodsItemCode = goodsItemCode;

		if (_dmHistoryGoodsRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryGoodsRemoteModel.getClass();

				Method method = clazz.getMethod("setGoodsItemCode", String.class);

				method.invoke(_dmHistoryGoodsRemoteModel, goodsItemCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGoodsItemName() {
		return _goodsItemName;
	}

	@Override
	public void setGoodsItemName(String goodsItemName) {
		_goodsItemName = goodsItemName;

		if (_dmHistoryGoodsRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryGoodsRemoteModel.getClass();

				Method method = clazz.getMethod("setGoodsItemName", String.class);

				method.invoke(_dmHistoryGoodsRemoteModel, goodsItemName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGoodsItemNameVN() {
		return _goodsItemNameVN;
	}

	@Override
	public void setGoodsItemNameVN(String goodsItemNameVN) {
		_goodsItemNameVN = goodsItemNameVN;

		if (_dmHistoryGoodsRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryGoodsRemoteModel.getClass();

				Method method = clazz.getMethod("setGoodsItemNameVN",
						String.class);

				method.invoke(_dmHistoryGoodsRemoteModel, goodsItemNameVN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGoodsItemOrder() {
		return _goodsItemOrder;
	}

	@Override
	public void setGoodsItemOrder(int goodsItemOrder) {
		_goodsItemOrder = goodsItemOrder;

		if (_dmHistoryGoodsRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryGoodsRemoteModel.getClass();

				Method method = clazz.getMethod("setGoodsItemOrder", int.class);

				method.invoke(_dmHistoryGoodsRemoteModel, goodsItemOrder);
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

		if (_dmHistoryGoodsRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryGoodsRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmHistoryGoodsRemoteModel, isDelete);
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

		if (_dmHistoryGoodsRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryGoodsRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmHistoryGoodsRemoteModel, markedAsDelete);
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

		if (_dmHistoryGoodsRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryGoodsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmHistoryGoodsRemoteModel, modifiedDate);
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

		if (_dmHistoryGoodsRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryGoodsRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmHistoryGoodsRemoteModel, requestedDate);
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

		if (_dmHistoryGoodsRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryGoodsRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmHistoryGoodsRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmHistoryGoodsRemoteModel() {
		return _dmHistoryGoodsRemoteModel;
	}

	public void setDmHistoryGoodsRemoteModel(
		BaseModel<?> dmHistoryGoodsRemoteModel) {
		_dmHistoryGoodsRemoteModel = dmHistoryGoodsRemoteModel;
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

		Class<?> remoteModelClass = _dmHistoryGoodsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmHistoryGoodsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmHistoryGoodsLocalServiceUtil.addDmHistoryGoods(this);
		}
		else {
			DmHistoryGoodsLocalServiceUtil.updateDmHistoryGoods(this);
		}
	}

	@Override
	public DmHistoryGoods toEscapedModel() {
		return (DmHistoryGoods)ProxyUtil.newProxyInstance(DmHistoryGoods.class.getClassLoader(),
			new Class[] { DmHistoryGoods.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmHistoryGoodsClp clone = new DmHistoryGoodsClp();

		clone.setId(getId());
		clone.setGoodsItemCode(getGoodsItemCode());
		clone.setGoodsItemName(getGoodsItemName());
		clone.setGoodsItemNameVN(getGoodsItemNameVN());
		clone.setGoodsItemOrder(getGoodsItemOrder());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmHistoryGoods dmHistoryGoods) {
		int value = 0;

		if (getId() < dmHistoryGoods.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryGoods.getId()) {
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

		if (!(obj instanceof DmHistoryGoodsClp)) {
			return false;
		}

		DmHistoryGoodsClp dmHistoryGoods = (DmHistoryGoodsClp)obj;

		int primaryKey = dmHistoryGoods.getPrimaryKey();

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
		sb.append(", goodsItemCode=");
		sb.append(getGoodsItemCode());
		sb.append(", goodsItemName=");
		sb.append(getGoodsItemName());
		sb.append(", goodsItemNameVN=");
		sb.append(getGoodsItemNameVN());
		sb.append(", goodsItemOrder=");
		sb.append(getGoodsItemOrder());
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
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodsItemCode</column-name><column-value><![CDATA[");
		sb.append(getGoodsItemCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodsItemName</column-name><column-value><![CDATA[");
		sb.append(getGoodsItemName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodsItemNameVN</column-name><column-value><![CDATA[");
		sb.append(getGoodsItemNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodsItemOrder</column-name><column-value><![CDATA[");
		sb.append(getGoodsItemOrder());
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
	private String _goodsItemCode;
	private String _goodsItemName;
	private String _goodsItemNameVN;
	private int _goodsItemOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmHistoryGoodsRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}