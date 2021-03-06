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

package vn.dtt.duongbo.dao.common.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.common.model.DmDataVersion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmDataVersion in entity cache.
 *
 * @author win_64
 * @see DmDataVersion
 * @generated
 */
public class DmDataVersionCacheModel implements CacheModel<DmDataVersion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", dataGroupId=");
		sb.append(dataGroupId);
		sb.append(", version=");
		sb.append(version);
		sb.append(", issuedTime=");
		sb.append(issuedTime);
		sb.append(", validateDFrom=");
		sb.append(validateDFrom);
		sb.append(", validatedTo=");
		sb.append(validatedTo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DmDataVersion toEntityModel() {
		DmDataVersionImpl dmDataVersionImpl = new DmDataVersionImpl();

		dmDataVersionImpl.setId(id);
		dmDataVersionImpl.setDataGroupId(dataGroupId);

		if (version == null) {
			dmDataVersionImpl.setVersion(StringPool.BLANK);
		}
		else {
			dmDataVersionImpl.setVersion(version);
		}

		if (issuedTime == Long.MIN_VALUE) {
			dmDataVersionImpl.setIssuedTime(null);
		}
		else {
			dmDataVersionImpl.setIssuedTime(new Date(issuedTime));
		}

		if (validateDFrom == Long.MIN_VALUE) {
			dmDataVersionImpl.setValidateDFrom(null);
		}
		else {
			dmDataVersionImpl.setValidateDFrom(new Date(validateDFrom));
		}

		if (validatedTo == Long.MIN_VALUE) {
			dmDataVersionImpl.setValidatedTo(null);
		}
		else {
			dmDataVersionImpl.setValidatedTo(new Date(validatedTo));
		}

		dmDataVersionImpl.resetOriginalValues();

		return dmDataVersionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		dataGroupId = objectInput.readLong();
		version = objectInput.readUTF();
		issuedTime = objectInput.readLong();
		validateDFrom = objectInput.readLong();
		validatedTo = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(dataGroupId);

		if (version == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(version);
		}

		objectOutput.writeLong(issuedTime);
		objectOutput.writeLong(validateDFrom);
		objectOutput.writeLong(validatedTo);
	}

	public long id;
	public long dataGroupId;
	public String version;
	public long issuedTime;
	public long validateDFrom;
	public long validatedTo;
}