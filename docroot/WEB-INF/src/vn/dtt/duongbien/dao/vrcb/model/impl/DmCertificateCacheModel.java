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

import vn.dtt.duongbien.dao.vrcb.model.DmCertificate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmCertificate in entity cache.
 *
 * @author longdm
 * @see DmCertificate
 * @generated
 */
public class DmCertificateCacheModel implements CacheModel<DmCertificate>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", certificateCode=");
		sb.append(certificateCode);
		sb.append(", certificateName=");
		sb.append(certificateName);
		sb.append(", certificateNameVN=");
		sb.append(certificateNameVN);
		sb.append(", certificateOrder=");
		sb.append(certificateOrder);
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
	public DmCertificate toEntityModel() {
		DmCertificateImpl dmCertificateImpl = new DmCertificateImpl();

		dmCertificateImpl.setId(id);

		if (certificateCode == null) {
			dmCertificateImpl.setCertificateCode(StringPool.BLANK);
		}
		else {
			dmCertificateImpl.setCertificateCode(certificateCode);
		}

		if (certificateName == null) {
			dmCertificateImpl.setCertificateName(StringPool.BLANK);
		}
		else {
			dmCertificateImpl.setCertificateName(certificateName);
		}

		if (certificateNameVN == null) {
			dmCertificateImpl.setCertificateNameVN(StringPool.BLANK);
		}
		else {
			dmCertificateImpl.setCertificateNameVN(certificateNameVN);
		}

		dmCertificateImpl.setCertificateOrder(certificateOrder);
		dmCertificateImpl.setIsDelete(isDelete);
		dmCertificateImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmCertificateImpl.setModifiedDate(null);
		}
		else {
			dmCertificateImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmCertificateImpl.setRequestedDate(null);
		}
		else {
			dmCertificateImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmCertificateImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmCertificateImpl.setSyncVersion(syncVersion);
		}

		dmCertificateImpl.resetOriginalValues();

		return dmCertificateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		certificateCode = objectInput.readUTF();
		certificateName = objectInput.readUTF();
		certificateNameVN = objectInput.readUTF();
		certificateOrder = objectInput.readInt();
		isDelete = objectInput.readInt();
		markedAsDelete = objectInput.readInt();
		modifiedDate = objectInput.readLong();
		requestedDate = objectInput.readLong();
		syncVersion = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (certificateCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateCode);
		}

		if (certificateName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateName);
		}

		if (certificateNameVN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateNameVN);
		}

		objectOutput.writeInt(certificateOrder);
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

	public long id;
	public String certificateCode;
	public String certificateName;
	public String certificateNameVN;
	public int certificateOrder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}