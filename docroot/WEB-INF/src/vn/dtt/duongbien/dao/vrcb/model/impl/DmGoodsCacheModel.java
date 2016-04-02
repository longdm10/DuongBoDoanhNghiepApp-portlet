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

import vn.dtt.duongbien.dao.vrcb.model.DmGoods;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmGoods in entity cache.
 *
 * @author longdm
 * @see DmGoods
 * @generated
 */
public class DmGoodsCacheModel implements CacheModel<DmGoods>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", goodsItemCode=");
		sb.append(goodsItemCode);
		sb.append(", goodsItemName=");
		sb.append(goodsItemName);
		sb.append(", goodsItemNameVN=");
		sb.append(goodsItemNameVN);
		sb.append(", goodsItemOrder=");
		sb.append(goodsItemOrder);
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
	public DmGoods toEntityModel() {
		DmGoodsImpl dmGoodsImpl = new DmGoodsImpl();

		dmGoodsImpl.setId(id);

		if (goodsItemCode == null) {
			dmGoodsImpl.setGoodsItemCode(StringPool.BLANK);
		}
		else {
			dmGoodsImpl.setGoodsItemCode(goodsItemCode);
		}

		if (goodsItemName == null) {
			dmGoodsImpl.setGoodsItemName(StringPool.BLANK);
		}
		else {
			dmGoodsImpl.setGoodsItemName(goodsItemName);
		}

		if (goodsItemNameVN == null) {
			dmGoodsImpl.setGoodsItemNameVN(StringPool.BLANK);
		}
		else {
			dmGoodsImpl.setGoodsItemNameVN(goodsItemNameVN);
		}

		dmGoodsImpl.setGoodsItemOrder(goodsItemOrder);
		dmGoodsImpl.setIsDelete(isDelete);
		dmGoodsImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmGoodsImpl.setModifiedDate(null);
		}
		else {
			dmGoodsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmGoodsImpl.setRequestedDate(null);
		}
		else {
			dmGoodsImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmGoodsImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmGoodsImpl.setSyncVersion(syncVersion);
		}

		dmGoodsImpl.resetOriginalValues();

		return dmGoodsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		goodsItemCode = objectInput.readUTF();
		goodsItemName = objectInput.readUTF();
		goodsItemNameVN = objectInput.readUTF();
		goodsItemOrder = objectInput.readInt();
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

		if (goodsItemCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(goodsItemCode);
		}

		if (goodsItemName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(goodsItemName);
		}

		if (goodsItemNameVN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(goodsItemNameVN);
		}

		objectOutput.writeInt(goodsItemOrder);
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
	public String goodsItemCode;
	public String goodsItemName;
	public String goodsItemNameVN;
	public int goodsItemOrder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}