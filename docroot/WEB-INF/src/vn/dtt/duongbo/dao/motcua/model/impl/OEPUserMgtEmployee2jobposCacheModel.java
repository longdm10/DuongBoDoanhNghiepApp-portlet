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

import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee2jobpos;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing OEPUserMgtEmployee2jobpos in entity cache.
 *
 * @author win_64
 * @see OEPUserMgtEmployee2jobpos
 * @generated
 */
public class OEPUserMgtEmployee2jobposCacheModel implements CacheModel<OEPUserMgtEmployee2jobpos>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{employeeId=");
		sb.append(employeeId);
		sb.append(", jobPosId=");
		sb.append(jobPosId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OEPUserMgtEmployee2jobpos toEntityModel() {
		OEPUserMgtEmployee2jobposImpl oepUserMgtEmployee2jobposImpl = new OEPUserMgtEmployee2jobposImpl();

		oepUserMgtEmployee2jobposImpl.setEmployeeId(employeeId);
		oepUserMgtEmployee2jobposImpl.setJobPosId(jobPosId);

		oepUserMgtEmployee2jobposImpl.resetOriginalValues();

		return oepUserMgtEmployee2jobposImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeeId = objectInput.readInt();
		jobPosId = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(employeeId);
		objectOutput.writeInt(jobPosId);
	}

	public int employeeId;
	public int jobPosId;
}