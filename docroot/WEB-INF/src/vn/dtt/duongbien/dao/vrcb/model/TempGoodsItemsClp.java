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
import vn.dtt.duongbien.dao.vrcb.service.TempGoodsItemsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class TempGoodsItemsClp extends BaseModelImpl<TempGoodsItems>
	implements TempGoodsItems {
	public TempGoodsItemsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TempGoodsItems.class;
	}

	@Override
	public String getModelClassName() {
		return TempGoodsItems.class.getName();
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
		attributes.put("billOfLadingNo", getBillOfLadingNo());
		attributes.put("goodItemCode", getGoodItemCode());
		attributes.put("goodItemDescription", getGoodItemDescription());
		attributes.put("numberOfPackage", getNumberOfPackage());
		attributes.put("kindOfPackages", getKindOfPackages());
		attributes.put("marksandNosofGoods", getMarksandNosofGoods());
		attributes.put("grossWeight", getGrossWeight());
		attributes.put("grossWeightUnit", getGrossWeightUnit());
		attributes.put("measurement", getMeasurement());
		attributes.put("measurementUnit", getMeasurementUnit());

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

		String billOfLadingNo = (String)attributes.get("billOfLadingNo");

		if (billOfLadingNo != null) {
			setBillOfLadingNo(billOfLadingNo);
		}

		String goodItemCode = (String)attributes.get("goodItemCode");

		if (goodItemCode != null) {
			setGoodItemCode(goodItemCode);
		}

		String goodItemDescription = (String)attributes.get(
				"goodItemDescription");

		if (goodItemDescription != null) {
			setGoodItemDescription(goodItemDescription);
		}

		Long numberOfPackage = (Long)attributes.get("numberOfPackage");

		if (numberOfPackage != null) {
			setNumberOfPackage(numberOfPackage);
		}

		String kindOfPackages = (String)attributes.get("kindOfPackages");

		if (kindOfPackages != null) {
			setKindOfPackages(kindOfPackages);
		}

		String marksandNosofGoods = (String)attributes.get("marksandNosofGoods");

		if (marksandNosofGoods != null) {
			setMarksandNosofGoods(marksandNosofGoods);
		}

		Double grossWeight = (Double)attributes.get("grossWeight");

		if (grossWeight != null) {
			setGrossWeight(grossWeight);
		}

		String grossWeightUnit = (String)attributes.get("grossWeightUnit");

		if (grossWeightUnit != null) {
			setGrossWeightUnit(grossWeightUnit);
		}

		Double measurement = (Double)attributes.get("measurement");

		if (measurement != null) {
			setMeasurement(measurement);
		}

		String measurementUnit = (String)attributes.get("measurementUnit");

		if (measurementUnit != null) {
			setMeasurementUnit(measurementUnit);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tempGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tempGoodsItemsRemoteModel, id);
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

		if (_tempGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_tempGoodsItemsRemoteModel, requestCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBillOfLadingNo() {
		return _billOfLadingNo;
	}

	@Override
	public void setBillOfLadingNo(String billOfLadingNo) {
		_billOfLadingNo = billOfLadingNo;

		if (_tempGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setBillOfLadingNo",
						String.class);

				method.invoke(_tempGoodsItemsRemoteModel, billOfLadingNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGoodItemCode() {
		return _goodItemCode;
	}

	@Override
	public void setGoodItemCode(String goodItemCode) {
		_goodItemCode = goodItemCode;

		if (_tempGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setGoodItemCode", String.class);

				method.invoke(_tempGoodsItemsRemoteModel, goodItemCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGoodItemDescription() {
		return _goodItemDescription;
	}

	@Override
	public void setGoodItemDescription(String goodItemDescription) {
		_goodItemDescription = goodItemDescription;

		if (_tempGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setGoodItemDescription",
						String.class);

				method.invoke(_tempGoodsItemsRemoteModel, goodItemDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNumberOfPackage() {
		return _numberOfPackage;
	}

	@Override
	public void setNumberOfPackage(long numberOfPackage) {
		_numberOfPackage = numberOfPackage;

		if (_tempGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberOfPackage", long.class);

				method.invoke(_tempGoodsItemsRemoteModel, numberOfPackage);
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

		if (_tempGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setKindOfPackages",
						String.class);

				method.invoke(_tempGoodsItemsRemoteModel, kindOfPackages);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMarksandNosofGoods() {
		return _marksandNosofGoods;
	}

	@Override
	public void setMarksandNosofGoods(String marksandNosofGoods) {
		_marksandNosofGoods = marksandNosofGoods;

		if (_tempGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setMarksandNosofGoods",
						String.class);

				method.invoke(_tempGoodsItemsRemoteModel, marksandNosofGoods);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getGrossWeight() {
		return _grossWeight;
	}

	@Override
	public void setGrossWeight(double grossWeight) {
		_grossWeight = grossWeight;

		if (_tempGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setGrossWeight", double.class);

				method.invoke(_tempGoodsItemsRemoteModel, grossWeight);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGrossWeightUnit() {
		return _grossWeightUnit;
	}

	@Override
	public void setGrossWeightUnit(String grossWeightUnit) {
		_grossWeightUnit = grossWeightUnit;

		if (_tempGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setGrossWeightUnit",
						String.class);

				method.invoke(_tempGoodsItemsRemoteModel, grossWeightUnit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getMeasurement() {
		return _measurement;
	}

	@Override
	public void setMeasurement(double measurement) {
		_measurement = measurement;

		if (_tempGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setMeasurement", double.class);

				method.invoke(_tempGoodsItemsRemoteModel, measurement);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMeasurementUnit() {
		return _measurementUnit;
	}

	@Override
	public void setMeasurementUnit(String measurementUnit) {
		_measurementUnit = measurementUnit;

		if (_tempGoodsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempGoodsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setMeasurementUnit",
						String.class);

				method.invoke(_tempGoodsItemsRemoteModel, measurementUnit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempGoodsItemsRemoteModel() {
		return _tempGoodsItemsRemoteModel;
	}

	public void setTempGoodsItemsRemoteModel(
		BaseModel<?> tempGoodsItemsRemoteModel) {
		_tempGoodsItemsRemoteModel = tempGoodsItemsRemoteModel;
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

		Class<?> remoteModelClass = _tempGoodsItemsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempGoodsItemsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempGoodsItemsLocalServiceUtil.addTempGoodsItems(this);
		}
		else {
			TempGoodsItemsLocalServiceUtil.updateTempGoodsItems(this);
		}
	}

	@Override
	public TempGoodsItems toEscapedModel() {
		return (TempGoodsItems)ProxyUtil.newProxyInstance(TempGoodsItems.class.getClassLoader(),
			new Class[] { TempGoodsItems.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempGoodsItemsClp clone = new TempGoodsItemsClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setBillOfLadingNo(getBillOfLadingNo());
		clone.setGoodItemCode(getGoodItemCode());
		clone.setGoodItemDescription(getGoodItemDescription());
		clone.setNumberOfPackage(getNumberOfPackage());
		clone.setKindOfPackages(getKindOfPackages());
		clone.setMarksandNosofGoods(getMarksandNosofGoods());
		clone.setGrossWeight(getGrossWeight());
		clone.setGrossWeightUnit(getGrossWeightUnit());
		clone.setMeasurement(getMeasurement());
		clone.setMeasurementUnit(getMeasurementUnit());

		return clone;
	}

	@Override
	public int compareTo(TempGoodsItems tempGoodsItems) {
		int value = 0;

		if (getId() < tempGoodsItems.getId()) {
			value = -1;
		}
		else if (getId() > tempGoodsItems.getId()) {
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

		if (!(obj instanceof TempGoodsItemsClp)) {
			return false;
		}

		TempGoodsItemsClp tempGoodsItems = (TempGoodsItemsClp)obj;

		long primaryKey = tempGoodsItems.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", billOfLadingNo=");
		sb.append(getBillOfLadingNo());
		sb.append(", goodItemCode=");
		sb.append(getGoodItemCode());
		sb.append(", goodItemDescription=");
		sb.append(getGoodItemDescription());
		sb.append(", numberOfPackage=");
		sb.append(getNumberOfPackage());
		sb.append(", kindOfPackages=");
		sb.append(getKindOfPackages());
		sb.append(", marksandNosofGoods=");
		sb.append(getMarksandNosofGoods());
		sb.append(", grossWeight=");
		sb.append(getGrossWeight());
		sb.append(", grossWeightUnit=");
		sb.append(getGrossWeightUnit());
		sb.append(", measurement=");
		sb.append(getMeasurement());
		sb.append(", measurementUnit=");
		sb.append(getMeasurementUnit());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempGoodsItems");
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
			"<column><column-name>billOfLadingNo</column-name><column-value><![CDATA[");
		sb.append(getBillOfLadingNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodItemCode</column-name><column-value><![CDATA[");
		sb.append(getGoodItemCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodItemDescription</column-name><column-value><![CDATA[");
		sb.append(getGoodItemDescription());
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
			"<column><column-name>marksandNosofGoods</column-name><column-value><![CDATA[");
		sb.append(getMarksandNosofGoods());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grossWeight</column-name><column-value><![CDATA[");
		sb.append(getGrossWeight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grossWeightUnit</column-name><column-value><![CDATA[");
		sb.append(getGrossWeightUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>measurement</column-name><column-value><![CDATA[");
		sb.append(getMeasurement());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>measurementUnit</column-name><column-value><![CDATA[");
		sb.append(getMeasurementUnit());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _billOfLadingNo;
	private String _goodItemCode;
	private String _goodItemDescription;
	private long _numberOfPackage;
	private String _kindOfPackages;
	private String _marksandNosofGoods;
	private double _grossWeight;
	private String _grossWeightUnit;
	private double _measurement;
	private String _measurementUnit;
	private BaseModel<?> _tempGoodsItemsRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}