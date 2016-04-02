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

import vn.dtt.duongbien.dao.vrcb.model.TempShipStoresItems;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TempShipStoresItems in entity cache.
 *
 * @author longdm
 * @see TempShipStoresItems
 * @generated
 */
public class TempShipStoresItemsCacheModel implements CacheModel<TempShipStoresItems>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", shipsstoreItemCode=");
		sb.append(shipsstoreItemCode);
		sb.append(", nameOfArticle=");
		sb.append(nameOfArticle);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append(", quantityUnit=");
		sb.append(quantityUnit);
		sb.append(", locationOnBoat=");
		sb.append(locationOnBoat);
		sb.append(", useInBoat=");
		sb.append(useInBoat);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TempShipStoresItems toEntityModel() {
		TempShipStoresItemsImpl tempShipStoresItemsImpl = new TempShipStoresItemsImpl();

		tempShipStoresItemsImpl.setId(id);

		if (requestCode == null) {
			tempShipStoresItemsImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempShipStoresItemsImpl.setRequestCode(requestCode);
		}

		if (shipsstoreItemCode == null) {
			tempShipStoresItemsImpl.setShipsstoreItemCode(StringPool.BLANK);
		}
		else {
			tempShipStoresItemsImpl.setShipsstoreItemCode(shipsstoreItemCode);
		}

		if (nameOfArticle == null) {
			tempShipStoresItemsImpl.setNameOfArticle(StringPool.BLANK);
		}
		else {
			tempShipStoresItemsImpl.setNameOfArticle(nameOfArticle);
		}

		if (quantity == null) {
			tempShipStoresItemsImpl.setQuantity(StringPool.BLANK);
		}
		else {
			tempShipStoresItemsImpl.setQuantity(quantity);
		}

		if (quantityUnit == null) {
			tempShipStoresItemsImpl.setQuantityUnit(StringPool.BLANK);
		}
		else {
			tempShipStoresItemsImpl.setQuantityUnit(quantityUnit);
		}

		if (locationOnBoat == null) {
			tempShipStoresItemsImpl.setLocationOnBoat(StringPool.BLANK);
		}
		else {
			tempShipStoresItemsImpl.setLocationOnBoat(locationOnBoat);
		}

		tempShipStoresItemsImpl.setUseInBoat(useInBoat);

		tempShipStoresItemsImpl.resetOriginalValues();

		return tempShipStoresItemsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		shipsstoreItemCode = objectInput.readUTF();
		nameOfArticle = objectInput.readUTF();
		quantity = objectInput.readUTF();
		quantityUnit = objectInput.readUTF();
		locationOnBoat = objectInput.readUTF();
		useInBoat = objectInput.readInt();
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

		if (shipsstoreItemCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipsstoreItemCode);
		}

		if (nameOfArticle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nameOfArticle);
		}

		if (quantity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(quantity);
		}

		if (quantityUnit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(quantityUnit);
		}

		if (locationOnBoat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(locationOnBoat);
		}

		objectOutput.writeInt(useInBoat);
	}

	public long id;
	public String requestCode;
	public String shipsstoreItemCode;
	public String nameOfArticle;
	public String quantity;
	public String quantityUnit;
	public String locationOnBoat;
	public int useInBoat;
}