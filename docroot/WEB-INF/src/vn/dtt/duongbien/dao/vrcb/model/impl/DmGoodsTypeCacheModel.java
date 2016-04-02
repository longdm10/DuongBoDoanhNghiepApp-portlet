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

import vn.dtt.duongbien.dao.vrcb.model.DmGoodsType;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmGoodsType in entity cache.
 *
 * @author longdm
 * @see DmGoodsType
 * @generated
 */
public class DmGoodsTypeCacheModel implements CacheModel<DmGoodsType>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", goodsTypeCode=");
		sb.append(goodsTypeCode);
		sb.append(", goodsTypeName=");
		sb.append(goodsTypeName);
		sb.append(", goodsTypeNameVN=");
		sb.append(goodsTypeNameVN);
		sb.append(", goodsTypeOrder=");
		sb.append(goodsTypeOrder);
		sb.append(", isDelete=");
		sb.append(isDelete);
		sb.append(", markedAsDelete=");
		sb.append(markedAsDelete);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", requestedDate=");
		sb.append(requestedDate);
		sb.append(", syncVersion=");
		sb.append(syncVersion);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DmGoodsType toEntityModel() {
		DmGoodsTypeImpl dmGoodsTypeImpl = new DmGoodsTypeImpl();

		dmGoodsTypeImpl.setId(id);

		if (goodsTypeCode == null) {
			dmGoodsTypeImpl.setGoodsTypeCode(StringPool.BLANK);
		}
		else {
			dmGoodsTypeImpl.setGoodsTypeCode(goodsTypeCode);
		}

		if (goodsTypeName == null) {
			dmGoodsTypeImpl.setGoodsTypeName(StringPool.BLANK);
		}
		else {
			dmGoodsTypeImpl.setGoodsTypeName(goodsTypeName);
		}

		if (goodsTypeNameVN == null) {
			dmGoodsTypeImpl.setGoodsTypeNameVN(StringPool.BLANK);
		}
		else {
			dmGoodsTypeImpl.setGoodsTypeNameVN(goodsTypeNameVN);
		}

		dmGoodsTypeImpl.setGoodsTypeOrder(goodsTypeOrder);
		dmGoodsTypeImpl.setIsDelete(isDelete);
		dmGoodsTypeImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmGoodsTypeImpl.setModifiedDate(null);
		}
		else {
			dmGoodsTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmGoodsTypeImpl.setRequestedDate(null);
		}
		else {
			dmGoodsTypeImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmGoodsTypeImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmGoodsTypeImpl.setSyncVersion(syncVersion);
		}

		dmGoodsTypeImpl.resetOriginalValues();

		return dmGoodsTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		goodsTypeCode = objectInput.readUTF();
		goodsTypeName = objectInput.readUTF();
		goodsTypeNameVN = objectInput.readUTF();
		goodsTypeOrder = objectInput.readInt();
		isDelete = objectInput.readInt();
		markedAsDelete = objectInput.readInt();
		modifiedDate = objectInput.readLong();
		requestedDate = objectInput.readLong();
		syncVersion = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);

		if (goodsTypeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(goodsTypeCode);
		}

		if (goodsTypeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(goodsTypeName);
		}

		if (goodsTypeNameVN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(goodsTypeNameVN);
		}

		objectOutput.writeInt(goodsTypeOrder);
		objectOutput.writeInt(isDelete);
		objectOutput.writeInt(markedAsDelete);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(requestedDate);

		if (syncVersion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(syncVersion);
		}
	}

	public int id;
	public String goodsTypeCode;
	public String goodsTypeName;
	public String goodsTypeNameVN;
	public int goodsTypeOrder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}