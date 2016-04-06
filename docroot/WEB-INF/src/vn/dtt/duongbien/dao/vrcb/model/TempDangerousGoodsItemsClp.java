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
import vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsItemsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class TempDangerousGoodsItemsClp extends BaseModelImpl<TempDangerousGoodsItems>
	implements TempDangerousGoodsItems {
	public TempDangerousGoodsItemsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TempDangerousGoodsItems.class;
	}

	@Override
	public String getModelClassName() {
		return TempDangerousGoodsItems.class.getName();
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
		attributes.put("dangerousGoodItemCode", getDangerousGoodItemCode());
		attributes.put("refNumber", getRefNumber());
		attributes.put("marksContainer", getMarksContainer());
		attributes.put("numberContainer", getNumberContainer());
		attributes.put("numberOfPackage", getNumberOfPackage());
		attributes.put("kindOfPackages", getKindOfPackages());
		attributes.put("properShippingName", getProperShippingName());
		attributes.put("goodClass", getGoodClass());
		attributes.put("unNumber", getUnNumber());
		attributes.put("packingGroup", getPackingGroup());
		attributes.put("subsidiaryRisk", getSubsidiaryRisk());
		attributes.put("flashPoint", getFlashPoint());
		attributes.put("marinePollutant", getMarinePollutant());
		attributes.put("grossWeight", getGrossWeight());
		attributes.put("ems", getEms());

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

		String dangerousGoodItemCode = (String)attributes.get(
				"dangerousGoodItemCode");

		if (dangerousGoodItemCode != null) {
			setDangerousGoodItemCode(dangerousGoodItemCode);
		}

		String refNumber = (String)attributes.get("refNumber");

		if (refNumber != null) {
			setRefNumber(refNumber);
		}

		String marksContainer = (String)attributes.get("marksContainer");

		if (marksContainer != null) {
			setMarksContainer(marksContainer);
		}

		String numberContainer = (String)attributes.get("numberContainer");

		if (numberContainer != null) {
			setNumberContainer(numberContainer);
		}

		String numberOfPackage = (String)attributes.get("numberOfPackage");

		if (numberOfPackage != null) {
			setNumberOfPackage(numberOfPackage);
		}

		String kindOfPackages = (String)attributes.get("kindOfPackages");

		if (kindOfPackages != null) {
			setKindOfPackages(kindOfPackages);
		}

		String properShippingName = (String)attributes.get("properShippingName");

		if (properShippingName != null) {
			setProperShippingName(properShippingName);
		}

		String goodClass = (String)attributes.get("goodClass");

		if (goodClass != null) {
			setGoodClass(goodClass);
		}

		String unNumber = (String)attributes.get("unNumber");

		if (unNumber != null) {
			setUnNumber(unNumber);
		}

		String packingGroup = (String)attributes.get("packingGroup");

		if (packingGroup != null) {
			setPackingGroup(packingGroup);
		}

		String subsidiaryRisk = (String)attributes.get("subsidiaryRisk");

		if (subsidiaryRisk != null) {
			setSubsidiaryRisk(subsidiaryRisk);
		}

		String flashPoint = (String)attributes.get("flashPoint");

		if (flashPoint != null) {
			setFlashPoint(flashPoint);
		}

		String marinePollutant = (String)attributes.get("marinePollutant");

		if (marinePollutant != null) {
			setMarinePollutant(marinePollutant);
		}

		Long grossWeight = (Long)attributes.get("grossWeight");

		if (grossWeight != null) {
			setGrossWeight(grossWeight);
		}

		String ems = (String)attributes.get("ems");

		if (ems != null) {
			setEms(ems);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tempDangerousGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tempDangerousGoodsItemsRemoteModel, id);
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

		if (_tempDangerousGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_tempDangerousGoodsItemsRemoteModel, requestCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDangerousGoodItemCode() {
		return _dangerousGoodItemCode;
	}

	@Override
	public void setDangerousGoodItemCode(String dangerousGoodItemCode) {
		_dangerousGoodItemCode = dangerousGoodItemCode;

		if (_tempDangerousGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setDangerousGoodItemCode",
						String.class);

				method.invoke(_tempDangerousGoodsItemsRemoteModel,
					dangerousGoodItemCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRefNumber() {
		return _refNumber;
	}

	@Override
	public void setRefNumber(String refNumber) {
		_refNumber = refNumber;

		if (_tempDangerousGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setRefNumber", String.class);

				method.invoke(_tempDangerousGoodsItemsRemoteModel, refNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMarksContainer() {
		return _marksContainer;
	}

	@Override
	public void setMarksContainer(String marksContainer) {
		_marksContainer = marksContainer;

		if (_tempDangerousGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setMarksContainer",
						String.class);

				method.invoke(_tempDangerousGoodsItemsRemoteModel,
					marksContainer);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNumberContainer() {
		return _numberContainer;
	}

	@Override
	public void setNumberContainer(String numberContainer) {
		_numberContainer = numberContainer;

		if (_tempDangerousGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberContainer",
						String.class);

				method.invoke(_tempDangerousGoodsItemsRemoteModel,
					numberContainer);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNumberOfPackage() {
		return _numberOfPackage;
	}

	@Override
	public void setNumberOfPackage(String numberOfPackage) {
		_numberOfPackage = numberOfPackage;

		if (_tempDangerousGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberOfPackage",
						String.class);

				method.invoke(_tempDangerousGoodsItemsRemoteModel,
					numberOfPackage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKindOfPackages() {
		return _kindOfPackages;
	}

	@Override
	public void setKindOfPackages(String kindOfPackages) {
		_kindOfPackages = kindOfPackages;

		if (_tempDangerousGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setKindOfPackages",
						String.class);

				method.invoke(_tempDangerousGoodsItemsRemoteModel,
					kindOfPackages);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProperShippingName() {
		return _properShippingName;
	}

	@Override
	public void setProperShippingName(String properShippingName) {
		_properShippingName = properShippingName;

		if (_tempDangerousGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setProperShippingName",
						String.class);

				method.invoke(_tempDangerousGoodsItemsRemoteModel,
					properShippingName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGoodClass() {
		return _goodClass;
	}

	@Override
	public void setGoodClass(String goodClass) {
		_goodClass = goodClass;

		if (_tempDangerousGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setGoodClass", String.class);

				method.invoke(_tempDangerousGoodsItemsRemoteModel, goodClass);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnNumber() {
		return _unNumber;
	}

	@Override
	public void setUnNumber(String unNumber) {
		_unNumber = unNumber;

		if (_tempDangerousGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setUnNumber", String.class);

				method.invoke(_tempDangerousGoodsItemsRemoteModel, unNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPackingGroup() {
		return _packingGroup;
	}

	@Override
	public void setPackingGroup(String packingGroup) {
		_packingGroup = packingGroup;

		if (_tempDangerousGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setPackingGroup", String.class);

				method.invoke(_tempDangerousGoodsItemsRemoteModel, packingGroup);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSubsidiaryRisk() {
		return _subsidiaryRisk;
	}

	@Override
	public void setSubsidiaryRisk(String subsidiaryRisk) {
		_subsidiaryRisk = subsidiaryRisk;

		if (_tempDangerousGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setSubsidiaryRisk",
						String.class);

				method.invoke(_tempDangerousGoodsItemsRemoteModel,
					subsidiaryRisk);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFlashPoint() {
		return _flashPoint;
	}

	@Override
	public void setFlashPoint(String flashPoint) {
		_flashPoint = flashPoint;

		if (_tempDangerousGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setFlashPoint", String.class);

				method.invoke(_tempDangerousGoodsItemsRemoteModel, flashPoint);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMarinePollutant() {
		return _marinePollutant;
	}

	@Override
	public void setMarinePollutant(String marinePollutant) {
		_marinePollutant = marinePollutant;

		if (_tempDangerousGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setMarinePollutant",
						String.class);

				method.invoke(_tempDangerousGoodsItemsRemoteModel,
					marinePollutant);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGrossWeight() {
		return _grossWeight;
	}

	@Override
	public void setGrossWeight(long grossWeight) {
		_grossWeight = grossWeight;

		if (_tempDangerousGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setGrossWeight", long.class);

				method.invoke(_tempDangerousGoodsItemsRemoteModel, grossWeight);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEms() {
		return _ems;
	}

	@Override
	public void setEms(String ems) {
		_ems = ems;

		if (_tempDangerousGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempDangerousGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setEms", String.class);

				method.invoke(_tempDangerousGoodsItemsRemoteModel, ems);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempDangerousGoodsItemsRemoteModel() {
		return _tempDangerousGoodsItemsRemoteModel;
	}

	public void setTempDangerousGoodsItemsRemoteModel(
		BaseModel<?> tempDangerousGoodsItemsRemoteModel) {
		_tempDangerousGoodsItemsRemoteModel = tempDangerousGoodsItemsRemoteModel;
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

		Class<?> remoteModelClass = _tempDangerousGoodsItemsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempDangerousGoodsItemsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempDangerousGoodsItemsLocalServiceUtil.addTempDangerousGoodsItems(this);
		}
		else {
			TempDangerousGoodsItemsLocalServiceUtil.updateTempDangerousGoodsItems(this);
		}
	}

	@Override
	public TempDangerousGoodsItems toEscapedModel() {
		return (TempDangerousGoodsItems)ProxyUtil.newProxyInstance(TempDangerousGoodsItems.class.getClassLoader(),
			new Class[] { TempDangerousGoodsItems.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempDangerousGoodsItemsClp clone = new TempDangerousGoodsItemsClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setDangerousGoodItemCode(getDangerousGoodItemCode());
		clone.setRefNumber(getRefNumber());
		clone.setMarksContainer(getMarksContainer());
		clone.setNumberContainer(getNumberContainer());
		clone.setNumberOfPackage(getNumberOfPackage());
		clone.setKindOfPackages(getKindOfPackages());
		clone.setProperShippingName(getProperShippingName());
		clone.setGoodClass(getGoodClass());
		clone.setUnNumber(getUnNumber());
		clone.setPackingGroup(getPackingGroup());
		clone.setSubsidiaryRisk(getSubsidiaryRisk());
		clone.setFlashPoint(getFlashPoint());
		clone.setMarinePollutant(getMarinePollutant());
		clone.setGrossWeight(getGrossWeight());
		clone.setEms(getEms());

		return clone;
	}

	@Override
	public int compareTo(TempDangerousGoodsItems tempDangerousGoodsItems) {
		int value = 0;

		if (getId() < tempDangerousGoodsItems.getId()) {
			value = -1;
		}
		else if (getId() > tempDangerousGoodsItems.getId()) {
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

		if (!(obj instanceof TempDangerousGoodsItemsClp)) {
			return false;
		}

		TempDangerousGoodsItemsClp tempDangerousGoodsItems = (TempDangerousGoodsItemsClp)obj;

		long primaryKey = tempDangerousGoodsItems.getPrimaryKey();

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
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", dangerousGoodItemCode=");
		sb.append(getDangerousGoodItemCode());
		sb.append(", refNumber=");
		sb.append(getRefNumber());
		sb.append(", marksContainer=");
		sb.append(getMarksContainer());
		sb.append(", numberContainer=");
		sb.append(getNumberContainer());
		sb.append(", numberOfPackage=");
		sb.append(getNumberOfPackage());
		sb.append(", kindOfPackages=");
		sb.append(getKindOfPackages());
		sb.append(", properShippingName=");
		sb.append(getProperShippingName());
		sb.append(", goodClass=");
		sb.append(getGoodClass());
		sb.append(", unNumber=");
		sb.append(getUnNumber());
		sb.append(", packingGroup=");
		sb.append(getPackingGroup());
		sb.append(", subsidiaryRisk=");
		sb.append(getSubsidiaryRisk());
		sb.append(", flashPoint=");
		sb.append(getFlashPoint());
		sb.append(", marinePollutant=");
		sb.append(getMarinePollutant());
		sb.append(", grossWeight=");
		sb.append(getGrossWeight());
		sb.append(", ems=");
		sb.append(getEms());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsItems");
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
			"<column><column-name>dangerousGoodItemCode</column-name><column-value><![CDATA[");
		sb.append(getDangerousGoodItemCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>refNumber</column-name><column-value><![CDATA[");
		sb.append(getRefNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>marksContainer</column-name><column-value><![CDATA[");
		sb.append(getMarksContainer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberContainer</column-name><column-value><![CDATA[");
		sb.append(getNumberContainer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberOfPackage</column-name><column-value><![CDATA[");
		sb.append(getNumberOfPackage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kindOfPackages</column-name><column-value><![CDATA[");
		sb.append(getKindOfPackages());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>properShippingName</column-name><column-value><![CDATA[");
		sb.append(getProperShippingName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodClass</column-name><column-value><![CDATA[");
		sb.append(getGoodClass());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unNumber</column-name><column-value><![CDATA[");
		sb.append(getUnNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>packingGroup</column-name><column-value><![CDATA[");
		sb.append(getPackingGroup());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subsidiaryRisk</column-name><column-value><![CDATA[");
		sb.append(getSubsidiaryRisk());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flashPoint</column-name><column-value><![CDATA[");
		sb.append(getFlashPoint());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>marinePollutant</column-name><column-value><![CDATA[");
		sb.append(getMarinePollutant());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grossWeight</column-name><column-value><![CDATA[");
		sb.append(getGrossWeight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ems</column-name><column-value><![CDATA[");
		sb.append(getEms());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _dangerousGoodItemCode;
	private String _refNumber;
	private String _marksContainer;
	private String _numberContainer;
	private String _numberOfPackage;
	private String _kindOfPackages;
	private String _properShippingName;
	private String _goodClass;
	private String _unNumber;
	private String _packingGroup;
	private String _subsidiaryRisk;
	private String _flashPoint;
	private String _marinePollutant;
	private long _grossWeight;
	private String _ems;
	private BaseModel<?> _tempDangerousGoodsItemsRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}