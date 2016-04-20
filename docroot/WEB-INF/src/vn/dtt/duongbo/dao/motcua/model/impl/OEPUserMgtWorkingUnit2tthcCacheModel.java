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

package vn.dtt.duongbo.dao.motcua.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OEPUserMgtWorkingUnit2tthc in entity cache.
 *
 * @author win_64
 * @see OEPUserMgtWorkingUnit2tthc
 * @generated
 */
public class OEPUserMgtWorkingUnit2tthcCacheModel implements CacheModel<OEPUserMgtWorkingUnit2tthc>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{workingUnit2TTHCId=");
		sb.append(workingUnit2TTHCId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", workingUnitId=");
		sb.append(workingUnitId);
		sb.append(", TTHCId=");
		sb.append(TTHCId);
		sb.append(", laDonViTiepNhanBanDau=");
		sb.append(laDonViTiepNhanBanDau);
		sb.append(", parentWorkingUnitID=");
		sb.append(parentWorkingUnitID);
		sb.append(", tiepNhanTrucTiep=");
		sb.append(tiepNhanTrucTiep);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OEPUserMgtWorkingUnit2tthc toEntityModel() {
		OEPUserMgtWorkingUnit2tthcImpl oepUserMgtWorkingUnit2tthcImpl = new OEPUserMgtWorkingUnit2tthcImpl();

		oepUserMgtWorkingUnit2tthcImpl.setWorkingUnit2TTHCId(workingUnit2TTHCId);
		oepUserMgtWorkingUnit2tthcImpl.setUserId(userId);
		oepUserMgtWorkingUnit2tthcImpl.setGroupId(groupId);
		oepUserMgtWorkingUnit2tthcImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			oepUserMgtWorkingUnit2tthcImpl.setCreateDate(null);
		}
		else {
			oepUserMgtWorkingUnit2tthcImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			oepUserMgtWorkingUnit2tthcImpl.setModifiedDate(null);
		}
		else {
			oepUserMgtWorkingUnit2tthcImpl.setModifiedDate(new Date(
					modifiedDate));
		}

		oepUserMgtWorkingUnit2tthcImpl.setWorkingUnitId(workingUnitId);
		oepUserMgtWorkingUnit2tthcImpl.setTTHCId(TTHCId);
		oepUserMgtWorkingUnit2tthcImpl.setLaDonViTiepNhanBanDau(laDonViTiepNhanBanDau);
		oepUserMgtWorkingUnit2tthcImpl.setParentWorkingUnitID(parentWorkingUnitID);
		oepUserMgtWorkingUnit2tthcImpl.setTiepNhanTrucTiep(tiepNhanTrucTiep);

		oepUserMgtWorkingUnit2tthcImpl.resetOriginalValues();

		return oepUserMgtWorkingUnit2tthcImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		workingUnit2TTHCId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		workingUnitId = objectInput.readLong();
		TTHCId = objectInput.readLong();
		laDonViTiepNhanBanDau = objectInput.readInt();
		parentWorkingUnitID = objectInput.readLong();
		tiepNhanTrucTiep = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(workingUnit2TTHCId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(workingUnitId);
		objectOutput.writeLong(TTHCId);
		objectOutput.writeInt(laDonViTiepNhanBanDau);
		objectOutput.writeLong(parentWorkingUnitID);
		objectOutput.writeInt(tiepNhanTrucTiep);
	}

	public long workingUnit2TTHCId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long workingUnitId;
	public long TTHCId;
	public int laDonViTiepNhanBanDau;
	public long parentWorkingUnitID;
	public int tiepNhanTrucTiep;
}