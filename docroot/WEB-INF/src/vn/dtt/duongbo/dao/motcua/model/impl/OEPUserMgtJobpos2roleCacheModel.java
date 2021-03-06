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

import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos2role;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing OEPUserMgtJobpos2role in entity cache.
 *
 * @author win_64
 * @see OEPUserMgtJobpos2role
 * @generated
 */
public class OEPUserMgtJobpos2roleCacheModel implements CacheModel<OEPUserMgtJobpos2role>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{jobPosId=");
		sb.append(jobPosId);
		sb.append(", roleId=");
		sb.append(roleId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OEPUserMgtJobpos2role toEntityModel() {
		OEPUserMgtJobpos2roleImpl oepUserMgtJobpos2roleImpl = new OEPUserMgtJobpos2roleImpl();

		oepUserMgtJobpos2roleImpl.setJobPosId(jobPosId);
		oepUserMgtJobpos2roleImpl.setRoleId(roleId);

		oepUserMgtJobpos2roleImpl.resetOriginalValues();

		return oepUserMgtJobpos2roleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jobPosId = objectInput.readInt();
		roleId = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(jobPosId);
		objectOutput.writeInt(roleId);
	}

	public int jobPosId;
	public int roleId;
}