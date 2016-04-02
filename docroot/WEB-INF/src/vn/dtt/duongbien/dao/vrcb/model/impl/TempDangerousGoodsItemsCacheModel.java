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

import vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsItems;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TempDangerousGoodsItems in entity cache.
 *
 * @author longdm
 * @see TempDangerousGoodsItems
 * @generated
 */
public class TempDangerousGoodsItemsCacheModel implements CacheModel<TempDangerousGoodsItems>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", dangerousGoodItemCode=");
		sb.append(dangerousGoodItemCode);
		sb.append(", refNumber=");
		sb.append(refNumber);
		sb.append(", marksContainer=");
		sb.append(marksContainer);
		sb.append(", numberContainer=");
		sb.append(numberContainer);
		sb.append(", numberOfPackage=");
		sb.append(numberOfPackage);
		sb.append(", kindOfPackages=");
		sb.append(kindOfPackages);
		sb.append(", properShippingName=");
		sb.append(properShippingName);
		sb.append(", goodClass=");
		sb.append(goodClass);
		sb.append(", unNumber=");
		sb.append(unNumber);
		sb.append(", packingGroup=");
		sb.append(packingGroup);
		sb.append(", subsidiaryRisk=");
		sb.append(subsidiaryRisk);
		sb.append(", flashPoint=");
		sb.append(flashPoint);
		sb.append(", marinePollutant=");
		sb.append(marinePollutant);
		sb.append(", grossWeight=");
		sb.append(grossWeight);
		sb.append(", ems=");
		sb.append(ems);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TempDangerousGoodsItems toEntityModel() {
		TempDangerousGoodsItemsImpl tempDangerousGoodsItemsImpl = new TempDangerousGoodsItemsImpl();

		tempDangerousGoodsItemsImpl.setId(id);

		if (requestCode == null) {
			tempDangerousGoodsItemsImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsItemsImpl.setRequestCode(requestCode);
		}

		if (dangerousGoodItemCode == null) {
			tempDangerousGoodsItemsImpl.setDangerousGoodItemCode(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsItemsImpl.setDangerousGoodItemCode(dangerousGoodItemCode);
		}

		if (refNumber == null) {
			tempDangerousGoodsItemsImpl.setRefNumber(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsItemsImpl.setRefNumber(refNumber);
		}

		if (marksContainer == null) {
			tempDangerousGoodsItemsImpl.setMarksContainer(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsItemsImpl.setMarksContainer(marksContainer);
		}

		if (numberContainer == null) {
			tempDangerousGoodsItemsImpl.setNumberContainer(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsItemsImpl.setNumberContainer(numberContainer);
		}

		if (numberOfPackage == null) {
			tempDangerousGoodsItemsImpl.setNumberOfPackage(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsItemsImpl.setNumberOfPackage(numberOfPackage);
		}

		if (kindOfPackages == null) {
			tempDangerousGoodsItemsImpl.setKindOfPackages(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsItemsImpl.setKindOfPackages(kindOfPackages);
		}

		if (properShippingName == null) {
			tempDangerousGoodsItemsImpl.setProperShippingName(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsItemsImpl.setProperShippingName(properShippingName);
		}

		if (goodClass == null) {
			tempDangerousGoodsItemsImpl.setGoodClass(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsItemsImpl.setGoodClass(goodClass);
		}

		if (unNumber == null) {
			tempDangerousGoodsItemsImpl.setUnNumber(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsItemsImpl.setUnNumber(unNumber);
		}

		if (packingGroup == null) {
			tempDangerousGoodsItemsImpl.setPackingGroup(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsItemsImpl.setPackingGroup(packingGroup);
		}

		if (subsidiaryRisk == null) {
			tempDangerousGoodsItemsImpl.setSubsidiaryRisk(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsItemsImpl.setSubsidiaryRisk(subsidiaryRisk);
		}

		if (flashPoint == null) {
			tempDangerousGoodsItemsImpl.setFlashPoint(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsItemsImpl.setFlashPoint(flashPoint);
		}

		if (marinePollutant == null) {
			tempDangerousGoodsItemsImpl.setMarinePollutant(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsItemsImpl.setMarinePollutant(marinePollutant);
		}

		tempDangerousGoodsItemsImpl.setGrossWeight(grossWeight);

		if (ems == null) {
			tempDangerousGoodsItemsImpl.setEms(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsItemsImpl.setEms(ems);
		}

		tempDangerousGoodsItemsImpl.resetOriginalValues();

		return tempDangerousGoodsItemsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		dangerousGoodItemCode = objectInput.readUTF();
		refNumber = objectInput.readUTF();
		marksContainer = objectInput.readUTF();
		numberContainer = objectInput.readUTF();
		numberOfPackage = objectInput.readUTF();
		kindOfPackages = objectInput.readUTF();
		properShippingName = objectInput.readUTF();
		goodClass = objectInput.readUTF();
		unNumber = objectInput.readUTF();
		packingGroup = objectInput.readUTF();
		subsidiaryRisk = objectInput.readUTF();
		flashPoint = objectInput.readUTF();
		marinePollutant = objectInput.readUTF();
		grossWeight = objectInput.readLong();
		ems = objectInput.readUTF();
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

		if (dangerousGoodItemCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dangerousGoodItemCode);
		}

		if (refNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(refNumber);
		}

		if (marksContainer == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(marksContainer);
		}

		if (numberContainer == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(numberContainer);
		}

		if (numberOfPackage == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(numberOfPackage);
		}

		if (kindOfPackages == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kindOfPackages);
		}

		if (properShippingName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(properShippingName);
		}

		if (goodClass == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(goodClass);
		}

		if (unNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unNumber);
		}

		if (packingGroup == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(packingGroup);
		}

		if (subsidiaryRisk == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subsidiaryRisk);
		}

		if (flashPoint == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(flashPoint);
		}

		if (marinePollutant == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(marinePollutant);
		}

		objectOutput.writeLong(grossWeight);

		if (ems == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ems);
		}
	}

	public long id;
	public String requestCode;
	public String dangerousGoodItemCode;
	public String refNumber;
	public String marksContainer;
	public String numberContainer;
	public String numberOfPackage;
	public String kindOfPackages;
	public String properShippingName;
	public String goodClass;
	public String unNumber;
	public String packingGroup;
	public String subsidiaryRisk;
	public String flashPoint;
	public String marinePollutant;
	public long grossWeight;
	public String ems;
}