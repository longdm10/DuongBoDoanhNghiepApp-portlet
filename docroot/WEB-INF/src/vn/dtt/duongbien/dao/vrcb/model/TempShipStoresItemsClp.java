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
import vn.dtt.duongbien.dao.vrcb.service.TempShipStoresItemsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class TempShipStoresItemsClp extends BaseModelImpl<TempShipStoresItems>
	implements TempShipStoresItems {
	public TempShipStoresItemsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TempShipStoresItems.class;
	}

	@Override
	public String getModelClassName() {
		return TempShipStoresItems.class.getName();
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
		attributes.put("shipsstoreItemCode", getShipsstoreItemCode());
		attributes.put("nameOfArticle", getNameOfArticle());
		attributes.put("quantity", getQuantity());
		attributes.put("quantityUnit", getQuantityUnit());
		attributes.put("locationOnBoat", getLocationOnBoat());
		attributes.put("useInBoat", getUseInBoat());

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

		String shipsstoreItemCode = (String)attributes.get("shipsstoreItemCode");

		if (shipsstoreItemCode != null) {
			setShipsstoreItemCode(shipsstoreItemCode);
		}

		String nameOfArticle = (String)attributes.get("nameOfArticle");

		if (nameOfArticle != null) {
			setNameOfArticle(nameOfArticle);
		}

		String quantity = (String)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		String quantityUnit = (String)attributes.get("quantityUnit");

		if (quantityUnit != null) {
			setQuantityUnit(quantityUnit);
		}

		String locationOnBoat = (String)attributes.get("locationOnBoat");

		if (locationOnBoat != null) {
			setLocationOnBoat(locationOnBoat);
		}

		Integer useInBoat = (Integer)attributes.get("useInBoat");

		if (useInBoat != null) {
			setUseInBoat(useInBoat);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tempShipStoresItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tempShipStoresItemsRemoteModel, id);
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

		if (_tempShipStoresItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_tempShipStoresItemsRemoteModel, requestCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipsstoreItemCode() {
		return _shipsstoreItemCode;
	}

	@Override
	public void setShipsstoreItemCode(String shipsstoreItemCode) {
		_shipsstoreItemCode = shipsstoreItemCode;

		if (_tempShipStoresItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setShipsstoreItemCode",
						String.class);

				method.invoke(_tempShipStoresItemsRemoteModel,
					shipsstoreItemCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNameOfArticle() {
		return _nameOfArticle;
	}

	@Override
	public void setNameOfArticle(String nameOfArticle) {
		_nameOfArticle = nameOfArticle;

		if (_tempShipStoresItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfArticle", String.class);

				method.invoke(_tempShipStoresItemsRemoteModel, nameOfArticle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQuantity() {
		return _quantity;
	}

	@Override
	public void setQuantity(String quantity) {
		_quantity = quantity;

		if (_tempShipStoresItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setQuantity", String.class);

				method.invoke(_tempShipStoresItemsRemoteModel, quantity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQuantityUnit() {
		return _quantityUnit;
	}

	@Override
	public void setQuantityUnit(String quantityUnit) {
		_quantityUnit = quantityUnit;

		if (_tempShipStoresItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setQuantityUnit", String.class);

				method.invoke(_tempShipStoresItemsRemoteModel, quantityUnit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLocationOnBoat() {
		return _locationOnBoat;
	}

	@Override
	public void setLocationOnBoat(String locationOnBoat) {
		_locationOnBoat = locationOnBoat;

		if (_tempShipStoresItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setLocationOnBoat",
						String.class);

				method.invoke(_tempShipStoresItemsRemoteModel, locationOnBoat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getUseInBoat() {
		return _useInBoat;
	}

	@Override
	public void setUseInBoat(int useInBoat) {
		_useInBoat = useInBoat;

		if (_tempShipStoresItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipStoresItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setUseInBoat", int.class);

				method.invoke(_tempShipStoresItemsRemoteModel, useInBoat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempShipStoresItemsRemoteModel() {
		return _tempShipStoresItemsRemoteModel;
	}

	public void setTempShipStoresItemsRemoteModel(
		BaseModel<?> tempShipStoresItemsRemoteModel) {
		_tempShipStoresItemsRemoteModel = tempShipStoresItemsRemoteModel;
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

		Class<?> remoteModelClass = _tempShipStoresItemsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempShipStoresItemsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempShipStoresItemsLocalServiceUtil.addTempShipStoresItems(this);
		}
		else {
			TempShipStoresItemsLocalServiceUtil.updateTempShipStoresItems(this);
		}
	}

	@Override
	public TempShipStoresItems toEscapedModel() {
		return (TempShipStoresItems)ProxyUtil.newProxyInstance(TempShipStoresItems.class.getClassLoader(),
			new Class[] { TempShipStoresItems.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempShipStoresItemsClp clone = new TempShipStoresItemsClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setShipsstoreItemCode(getShipsstoreItemCode());
		clone.setNameOfArticle(getNameOfArticle());
		clone.setQuantity(getQuantity());
		clone.setQuantityUnit(getQuantityUnit());
		clone.setLocationOnBoat(getLocationOnBoat());
		clone.setUseInBoat(getUseInBoat());

		return clone;
	}

	@Override
	public int compareTo(TempShipStoresItems tempShipStoresItems) {
		int value = 0;

		if (getId() < tempShipStoresItems.getId()) {
			value = -1;
		}
		else if (getId() > tempShipStoresItems.getId()) {
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

		if (!(obj instanceof TempShipStoresItemsClp)) {
			return false;
		}

		TempShipStoresItemsClp tempShipStoresItems = (TempShipStoresItemsClp)obj;

		long primaryKey = tempShipStoresItems.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", shipsstoreItemCode=");
		sb.append(getShipsstoreItemCode());
		sb.append(", nameOfArticle=");
		sb.append(getNameOfArticle());
		sb.append(", quantity=");
		sb.append(getQuantity());
		sb.append(", quantityUnit=");
		sb.append(getQuantityUnit());
		sb.append(", locationOnBoat=");
		sb.append(getLocationOnBoat());
		sb.append(", useInBoat=");
		sb.append(getUseInBoat());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempShipStoresItems");
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
			"<column><column-name>shipsstoreItemCode</column-name><column-value><![CDATA[");
		sb.append(getShipsstoreItemCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfArticle</column-name><column-value><![CDATA[");
		sb.append(getNameOfArticle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quantity</column-name><column-value><![CDATA[");
		sb.append(getQuantity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quantityUnit</column-name><column-value><![CDATA[");
		sb.append(getQuantityUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>locationOnBoat</column-name><column-value><![CDATA[");
		sb.append(getLocationOnBoat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>useInBoat</column-name><column-value><![CDATA[");
		sb.append(getUseInBoat());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _shipsstoreItemCode;
	private String _nameOfArticle;
	private String _quantity;
	private String _quantityUnit;
	private String _locationOnBoat;
	private int _useInBoat;
	private BaseModel<?> _tempShipStoresItemsRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}