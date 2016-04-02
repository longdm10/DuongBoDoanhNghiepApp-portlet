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

import vn.dtt.duongbien.dao.vrcb.model.ResponseBo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ResponseBo in entity cache.
 *
 * @author longdm
 * @see ResponseBo
 * @generated
 */
public class ResponseBoCacheModel implements CacheModel<ResponseBo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", isSuccess=");
		sb.append(isSuccess);
		sb.append(", errorMessage=");
		sb.append(errorMessage);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ResponseBo toEntityModel() {
		ResponseBoImpl responseBoImpl = new ResponseBoImpl();

		responseBoImpl.setId(id);
		responseBoImpl.setIsSuccess(isSuccess);

		if (errorMessage == null) {
			responseBoImpl.setErrorMessage(StringPool.BLANK);
		}
		else {
			responseBoImpl.setErrorMessage(errorMessage);
		}

		responseBoImpl.resetOriginalValues();

		return responseBoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		isSuccess = objectInput.readInt();
		errorMessage = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeInt(isSuccess);

		if (errorMessage == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(errorMessage);
		}
	}

	public long id;
	public int isSuccess;
	public String errorMessage;
}