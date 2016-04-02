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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryGoodsType in entity cache.
 *
 * @author longdm
 * @see DmHistoryGoodsType
 * @generated
 */
public class DmHistoryGoodsTypeCacheModel implements CacheModel<DmHistoryGoodsType>,
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
	public DmHistoryGoodsType toEntityModel() {
		DmHistoryGoodsTypeImpl dmHistoryGoodsTypeImpl = new DmHistoryGoodsTypeImpl();

		dmHistoryGoodsTypeImpl.setId(id);

		if (goodsTypeCode == null) {
			dmHistoryGoodsTypeImpl.setGoodsTypeCode(StringPool.BLANK);
		}
		else {
			dmHistoryGoodsTypeImpl.setGoodsTypeCode(goodsTypeCode);
		}

		if (goodsTypeName == null) {
			dmHistoryGoodsTypeImpl.setGoodsTypeName(StringPool.BLANK);
		}
		else {
			dmHistoryGoodsTypeImpl.setGoodsTypeName(goodsTypeName);
		}

		if (goodsTypeNameVN == null) {
			dmHistoryGoodsTypeImpl.setGoodsTypeNameVN(StringPool.BLANK);
		}
		else {
			dmHistoryGoodsTypeImpl.setGoodsTypeNameVN(goodsTypeNameVN);
		}

		dmHistoryGoodsTypeImpl.setGoodsTypeOrder(goodsTypeOrder);
		dmHistoryGoodsTypeImpl.setIsDelete(isDelete);
		dmHistoryGoodsTypeImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryGoodsTypeImpl.setModifiedDate(null);
		}
		else {
			dmHistoryGoodsTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryGoodsTypeImpl.setRequestedDate(null);
		}
		else {
			dmHistoryGoodsTypeImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryGoodsTypeImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryGoodsTypeImpl.setSyncVersion(syncVersion);
		}

		dmHistoryGoodsTypeImpl.resetOriginalValues();

		return dmHistoryGoodsTypeImpl;
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