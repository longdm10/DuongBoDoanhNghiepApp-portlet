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

package vn.dtt.duongbien.dao.vrcb.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.duongbien.dao.vrcb.model.TempGoodsItems;
import vn.dtt.duongbien.dao.vrcb.model.TempGoodsItemsModel;
import vn.dtt.duongbien.dao.vrcb.model.TempGoodsItemsSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the TempGoodsItems service. Represents a row in the &quot;TEMP_GOODS_ITEMS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.TempGoodsItemsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TempGoodsItemsImpl}.
 * </p>
 *
 * @author longdm
 * @see TempGoodsItemsImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.TempGoodsItems
 * @see vn.dtt.duongbien.dao.vrcb.model.TempGoodsItemsModel
 * @generated
 */
@JSON(strict = true)
public class TempGoodsItemsModelImpl extends BaseModelImpl<TempGoodsItems>
	implements TempGoodsItemsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a temp goods items model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.TempGoodsItems} interface instead.
	 */
	public static final String TABLE_NAME = "TEMP_GOODS_ITEMS";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "RequestCode", Types.VARCHAR },
			{ "BillOfLadingNo", Types.VARCHAR },
			{ "GoodItemCode", Types.VARCHAR },
			{ "GoodItemDescription", Types.VARCHAR },
			{ "NumberOfPackage", Types.BIGINT },
			{ "KindOfPackages", Types.VARCHAR },
			{ "MarksandNosofGoods", Types.VARCHAR },
			{ "GrossWeight", Types.DOUBLE },
			{ "GrossWeightUnit", Types.VARCHAR },
			{ "Measurement", Types.DOUBLE },
			{ "MeasurementUnit", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table TEMP_GOODS_ITEMS (ID LONG not null primary key,RequestCode VARCHAR(75) null,BillOfLadingNo VARCHAR(75) null,GoodItemCode VARCHAR(75) null,GoodItemDescription VARCHAR(75) null,NumberOfPackage LONG,KindOfPackages VARCHAR(75) null,MarksandNosofGoods VARCHAR(75) null,GrossWeight DOUBLE,GrossWeightUnit VARCHAR(75) null,Measurement DOUBLE,MeasurementUnit VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table TEMP_GOODS_ITEMS";
	public static final String ORDER_BY_JPQL = " ORDER BY tempGoodsItems.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY TEMP_GOODS_ITEMS.ID ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.TempGoodsItems"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.TempGoodsItems"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.TempGoodsItems"),
			true);
	public static long REQUESTCODE_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static TempGoodsItems toModel(TempGoodsItemsSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		TempGoodsItems model = new TempGoodsItemsImpl();

		model.setId(soapModel.getId());
		model.setRequestCode(soapModel.getRequestCode());
		model.setBillOfLadingNo(soapModel.getBillOfLadingNo());
		model.setGoodItemCode(soapModel.getGoodItemCode());
		model.setGoodItemDescription(soapModel.getGoodItemDescription());
		model.setNumberOfPackage(soapModel.getNumberOfPackage());
		model.setKindOfPackages(soapModel.getKindOfPackages());
		model.setMarksandNosofGoods(soapModel.getMarksandNosofGoods());
		model.setGrossWeight(soapModel.getGrossWeight());
		model.setGrossWeightUnit(soapModel.getGrossWeightUnit());
		model.setMeasurement(soapModel.getMeasurement());
		model.setMeasurementUnit(soapModel.getMeasurementUnit());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<TempGoodsItems> toModels(TempGoodsItemsSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<TempGoodsItems> models = new ArrayList<TempGoodsItems>(soapModels.length);

		for (TempGoodsItemsSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.TempGoodsItems"));

	public TempGoodsItemsModelImpl() {
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
	public Class<?> getModelClass() {
		return TempGoodsItems.class;
	}

	@Override
	public String getModelClassName() {
		return TempGoodsItems.class.getName();
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

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
	}

	@JSON
	@Override
	public String getRequestCode() {
		if (_requestCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _requestCode;
		}
	}

	@Override
	public void setRequestCode(String requestCode) {
		_columnBitmask |= REQUESTCODE_COLUMN_BITMASK;

		if (_originalRequestCode == null) {
			_originalRequestCode = _requestCode;
		}

		_requestCode = requestCode;
	}

	public String getOriginalRequestCode() {
		return GetterUtil.getString(_originalRequestCode);
	}

	@JSON
	@Override
	public String getBillOfLadingNo() {
		if (_billOfLadingNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _billOfLadingNo;
		}
	}

	@Override
	public void setBillOfLadingNo(String billOfLadingNo) {
		_billOfLadingNo = billOfLadingNo;
	}

	@JSON
	@Override
	public String getGoodItemCode() {
		if (_goodItemCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _goodItemCode;
		}
	}

	@Override
	public void setGoodItemCode(String goodItemCode) {
		_goodItemCode = goodItemCode;
	}

	@JSON
	@Override
	public String getGoodItemDescription() {
		if (_goodItemDescription == null) {
			return StringPool.BLANK;
		}
		else {
			return _goodItemDescription;
		}
	}

	@Override
	public void setGoodItemDescription(String goodItemDescription) {
		_goodItemDescription = goodItemDescription;
	}

	@JSON
	@Override
	public long getNumberOfPackage() {
		return _numberOfPackage;
	}

	@Override
	public void setNumberOfPackage(long numberOfPackage) {
		_numberOfPackage = numberOfPackage;
	}

	@JSON
	@Override
	public String getKindOfPackages() {
		if (_kindOfPackages == null) {
			return StringPool.BLANK;
		}
		else {
			return _kindOfPackages;
		}
	}

	@Override
	public void setKindOfPackages(String kindOfPackages) {
		_kindOfPackages = kindOfPackages;
	}

	@JSON
	@Override
	public String getMarksandNosofGoods() {
		if (_marksandNosofGoods == null) {
			return StringPool.BLANK;
		}
		else {
			return _marksandNosofGoods;
		}
	}

	@Override
	public void setMarksandNosofGoods(String marksandNosofGoods) {
		_marksandNosofGoods = marksandNosofGoods;
	}

	@JSON
	@Override
	public double getGrossWeight() {
		return _grossWeight;
	}

	@Override
	public void setGrossWeight(double grossWeight) {
		_grossWeight = grossWeight;
	}

	@JSON
	@Override
	public String getGrossWeightUnit() {
		if (_grossWeightUnit == null) {
			return StringPool.BLANK;
		}
		else {
			return _grossWeightUnit;
		}
	}

	@Override
	public void setGrossWeightUnit(String grossWeightUnit) {
		_grossWeightUnit = grossWeightUnit;
	}

	@JSON
	@Override
	public double getMeasurement() {
		return _measurement;
	}

	@Override
	public void setMeasurement(double measurement) {
		_measurement = measurement;
	}

	@JSON
	@Override
	public String getMeasurementUnit() {
		if (_measurementUnit == null) {
			return StringPool.BLANK;
		}
		else {
			return _measurementUnit;
		}
	}

	@Override
	public void setMeasurementUnit(String measurementUnit) {
		_measurementUnit = measurementUnit;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TempGoodsItems.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TempGoodsItems toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TempGoodsItems)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TempGoodsItemsImpl tempGoodsItemsImpl = new TempGoodsItemsImpl();

		tempGoodsItemsImpl.setId(getId());
		tempGoodsItemsImpl.setRequestCode(getRequestCode());
		tempGoodsItemsImpl.setBillOfLadingNo(getBillOfLadingNo());
		tempGoodsItemsImpl.setGoodItemCode(getGoodItemCode());
		tempGoodsItemsImpl.setGoodItemDescription(getGoodItemDescription());
		tempGoodsItemsImpl.setNumberOfPackage(getNumberOfPackage());
		tempGoodsItemsImpl.setKindOfPackages(getKindOfPackages());
		tempGoodsItemsImpl.setMarksandNosofGoods(getMarksandNosofGoods());
		tempGoodsItemsImpl.setGrossWeight(getGrossWeight());
		tempGoodsItemsImpl.setGrossWeightUnit(getGrossWeightUnit());
		tempGoodsItemsImpl.setMeasurement(getMeasurement());
		tempGoodsItemsImpl.setMeasurementUnit(getMeasurementUnit());

		tempGoodsItemsImpl.resetOriginalValues();

		return tempGoodsItemsImpl;
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

		if (!(obj instanceof TempGoodsItems)) {
			return false;
		}

		TempGoodsItems tempGoodsItems = (TempGoodsItems)obj;

		long primaryKey = tempGoodsItems.getPrimaryKey();

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
	public void resetOriginalValues() {
		TempGoodsItemsModelImpl tempGoodsItemsModelImpl = this;

		tempGoodsItemsModelImpl._originalRequestCode = tempGoodsItemsModelImpl._requestCode;

		tempGoodsItemsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TempGoodsItems> toCacheModel() {
		TempGoodsItemsCacheModel tempGoodsItemsCacheModel = new TempGoodsItemsCacheModel();

		tempGoodsItemsCacheModel.id = getId();

		tempGoodsItemsCacheModel.requestCode = getRequestCode();

		String requestCode = tempGoodsItemsCacheModel.requestCode;

		if ((requestCode != null) && (requestCode.length() == 0)) {
			tempGoodsItemsCacheModel.requestCode = null;
		}

		tempGoodsItemsCacheModel.billOfLadingNo = getBillOfLadingNo();

		String billOfLadingNo = tempGoodsItemsCacheModel.billOfLadingNo;

		if ((billOfLadingNo != null) && (billOfLadingNo.length() == 0)) {
			tempGoodsItemsCacheModel.billOfLadingNo = null;
		}

		tempGoodsItemsCacheModel.goodItemCode = getGoodItemCode();

		String goodItemCode = tempGoodsItemsCacheModel.goodItemCode;

		if ((goodItemCode != null) && (goodItemCode.length() == 0)) {
			tempGoodsItemsCacheModel.goodItemCode = null;
		}

		tempGoodsItemsCacheModel.goodItemDescription = getGoodItemDescription();

		String goodItemDescription = tempGoodsItemsCacheModel.goodItemDescription;

		if ((goodItemDescription != null) &&
				(goodItemDescription.length() == 0)) {
			tempGoodsItemsCacheModel.goodItemDescription = null;
		}

		tempGoodsItemsCacheModel.numberOfPackage = getNumberOfPackage();

		tempGoodsItemsCacheModel.kindOfPackages = getKindOfPackages();

		String kindOfPackages = tempGoodsItemsCacheModel.kindOfPackages;

		if ((kindOfPackages != null) && (kindOfPackages.length() == 0)) {
			tempGoodsItemsCacheModel.kindOfPackages = null;
		}

		tempGoodsItemsCacheModel.marksandNosofGoods = getMarksandNosofGoods();

		String marksandNosofGoods = tempGoodsItemsCacheModel.marksandNosofGoods;

		if ((marksandNosofGoods != null) && (marksandNosofGoods.length() == 0)) {
			tempGoodsItemsCacheModel.marksandNosofGoods = null;
		}

		tempGoodsItemsCacheModel.grossWeight = getGrossWeight();

		tempGoodsItemsCacheModel.grossWeightUnit = getGrossWeightUnit();

		String grossWeightUnit = tempGoodsItemsCacheModel.grossWeightUnit;

		if ((grossWeightUnit != null) && (grossWeightUnit.length() == 0)) {
			tempGoodsItemsCacheModel.grossWeightUnit = null;
		}

		tempGoodsItemsCacheModel.measurement = getMeasurement();

		tempGoodsItemsCacheModel.measurementUnit = getMeasurementUnit();

		String measurementUnit = tempGoodsItemsCacheModel.measurementUnit;

		if ((measurementUnit != null) && (measurementUnit.length() == 0)) {
			tempGoodsItemsCacheModel.measurementUnit = null;
		}

		return tempGoodsItemsCacheModel;
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

	private static ClassLoader _classLoader = TempGoodsItems.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TempGoodsItems.class
		};
	private long _id;
	private String _requestCode;
	private String _originalRequestCode;
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
	private long _columnBitmask;
	private TempGoodsItems _escapedModel;
}