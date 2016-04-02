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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbien.dao.vrcb.model.TempGoodsItems;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TempGoodsItems in entity cache.
 *
 * @author longdm
 * @see TempGoodsItems
 * @generated
 */
public class TempGoodsItemsCacheModel implements CacheModel<TempGoodsItems>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", billOfLadingNo=");
		sb.append(billOfLadingNo);
		sb.append(", goodItemCode=");
		sb.append(goodItemCode);
		sb.append(", goodItemDescription=");
		sb.append(goodItemDescription);
		sb.append(", numberOfPackage=");
		sb.append(numberOfPackage);
		sb.append(", kindOfPackages=");
		sb.append(kindOfPackages);
		sb.append(", marksandNosofGoods=");
		sb.append(marksandNosofGoods);
		sb.append(", grossWeight=");
		sb.append(grossWeight);
		sb.append(", grossWeightUnit=");
		sb.append(grossWeightUnit);
		sb.append(", measurement=");
		sb.append(measurement);
		sb.append(", measurementUnit=");
		sb.append(measurementUnit);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TempGoodsItems toEntityModel() {
		TempGoodsItemsImpl tempGoodsItemsImpl = new TempGoodsItemsImpl();

		tempGoodsItemsImpl.setId(id);

		if (requestCode == null) {
			tempGoodsItemsImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempGoodsItemsImpl.setRequestCode(requestCode);
		}

		if (billOfLadingNo == null) {
			tempGoodsItemsImpl.setBillOfLadingNo(StringPool.BLANK);
		}
		else {
			tempGoodsItemsImpl.setBillOfLadingNo(billOfLadingNo);
		}

		if (goodItemCode == null) {
			tempGoodsItemsImpl.setGoodItemCode(StringPool.BLANK);
		}
		else {
			tempGoodsItemsImpl.setGoodItemCode(goodItemCode);
		}

		if (goodItemDescription == null) {
			tempGoodsItemsImpl.setGoodItemDescription(StringPool.BLANK);
		}
		else {
			tempGoodsItemsImpl.setGoodItemDescription(goodItemDescription);
		}

		tempGoodsItemsImpl.setNumberOfPackage(numberOfPackage);

		if (kindOfPackages == null) {
			tempGoodsItemsImpl.setKindOfPackages(StringPool.BLANK);
		}
		else {
			tempGoodsItemsImpl.setKindOfPackages(kindOfPackages);
		}

		if (marksandNosofGoods == null) {
			tempGoodsItemsImpl.setMarksandNosofGoods(StringPool.BLANK);
		}
		else {
			tempGoodsItemsImpl.setMarksandNosofGoods(marksandNosofGoods);
		}

		tempGoodsItemsImpl.setGrossWeight(grossWeight);

		if (grossWeightUnit == null) {
			tempGoodsItemsImpl.setGrossWeightUnit(StringPool.BLANK);
		}
		else {
			tempGoodsItemsImpl.setGrossWeightUnit(grossWeightUnit);
		}

		tempGoodsItemsImpl.setMeasurement(measurement);

		if (measurementUnit == null) {
			tempGoodsItemsImpl.setMeasurementUnit(StringPool.BLANK);
		}
		else {
			tempGoodsItemsImpl.setMeasurementUnit(measurementUnit);
		}

		tempGoodsItemsImpl.resetOriginalValues();

		return tempGoodsItemsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		billOfLadingNo = objectInput.readUTF();
		goodItemCode = objectInput.readUTF();
		goodItemDescription = objectInput.readUTF();
		numberOfPackage = objectInput.readLong();
		kindOfPackages = objectInput.readUTF();
		marksandNosofGoods = objectInput.readUTF();
		grossWeight = objectInput.readDouble();
		grossWeightUnit = objectInput.readUTF();
		measurement = objectInput.readDouble();
		measurementUnit = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (requestCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(requestCode);
		}

		if (billOfLadingNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(billOfLadingNo);
		}

		if (goodItemCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(goodItemCode);
		}

		if (goodItemDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(goodItemDescription);
		}

		objectOutput.writeLong(numberOfPackage);

		if (kindOfPackages == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kindOfPackages);
		}

		if (marksandNosofGoods == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(marksandNosofGoods);
		}

		objectOutput.writeDouble(grossWeight);

		if (grossWeightUnit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(grossWeightUnit);
		}

		objectOutput.writeDouble(measurement);

		if (measurementUnit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(measurementUnit);
		}
	}

	public long id;
	public String requestCode;
	public String billOfLadingNo;
	public String goodItemCode;
	public String goodItemDescription;
	public long numberOfPackage;
	public String kindOfPackages;
	public String marksandNosofGoods;
	public double grossWeight;
	public String grossWeightUnit;
	public double measurement;
	public String measurementUnit;
}