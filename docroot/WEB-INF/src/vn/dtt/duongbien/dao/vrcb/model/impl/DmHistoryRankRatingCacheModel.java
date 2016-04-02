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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryRankRating;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryRankRating in entity cache.
 *
 * @author longdm
 * @see DmHistoryRankRating
 * @generated
 */
public class DmHistoryRankRatingCacheModel implements CacheModel<DmHistoryRankRating>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", rankCode=");
		sb.append(rankCode);
		sb.append(", rankName=");
		sb.append(rankName);
		sb.append(", rankNameVN=");
		sb.append(rankNameVN);
		sb.append(", rankOrder=");
		sb.append(rankOrder);
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
	public DmHistoryRankRating toEntityModel() {
		DmHistoryRankRatingImpl dmHistoryRankRatingImpl = new DmHistoryRankRatingImpl();

		dmHistoryRankRatingImpl.setId(id);

		if (rankCode == null) {
			dmHistoryRankRatingImpl.setRankCode(StringPool.BLANK);
		}
		else {
			dmHistoryRankRatingImpl.setRankCode(rankCode);
		}

		if (rankName == null) {
			dmHistoryRankRatingImpl.setRankName(StringPool.BLANK);
		}
		else {
			dmHistoryRankRatingImpl.setRankName(rankName);
		}

		if (rankNameVN == null) {
			dmHistoryRankRatingImpl.setRankNameVN(StringPool.BLANK);
		}
		else {
			dmHistoryRankRatingImpl.setRankNameVN(rankNameVN);
		}

		dmHistoryRankRatingImpl.setRankOrder(rankOrder);
		dmHistoryRankRatingImpl.setIsDelete(isDelete);
		dmHistoryRankRatingImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryRankRatingImpl.setModifiedDate(null);
		}
		else {
			dmHistoryRankRatingImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryRankRatingImpl.setRequestedDate(null);
		}
		else {
			dmHistoryRankRatingImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryRankRatingImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryRankRatingImpl.setSyncVersion(syncVersion);
		}

		dmHistoryRankRatingImpl.resetOriginalValues();

		return dmHistoryRankRatingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		rankCode = objectInput.readUTF();
		rankName = objectInput.readUTF();
		rankNameVN = objectInput.readUTF();
		rankOrder = objectInput.readInt();
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

		if (rankCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(rankCode);
		}

		if (rankName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(rankName);
		}

		if (rankNameVN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(rankNameVN);
		}

		objectOutput.writeInt(rankOrder);
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
	public String rankCode;
	public String rankName;
	public String rankNameVN;
	public int rankOrder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}