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

package vn.dtt.duongbo.dao.motcua.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author win_64
 */
public class OEPUserMgtJobpos2rolePK implements Comparable<OEPUserMgtJobpos2rolePK>,
	Serializable {
	public int jobPosId;
	public int roleId;

	public OEPUserMgtJobpos2rolePK() {
	}

	public OEPUserMgtJobpos2rolePK(int jobPosId, int roleId) {
		this.jobPosId = jobPosId;
		this.roleId = roleId;
	}

	public int getJobPosId() {
		return jobPosId;
	}

	public void setJobPosId(int jobPosId) {
		this.jobPosId = jobPosId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Override
	public int compareTo(OEPUserMgtJobpos2rolePK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (jobPosId < pk.jobPosId) {
			value = -1;
		}
		else if (jobPosId > pk.jobPosId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (roleId < pk.roleId) {
			value = -1;
		}
		else if (roleId > pk.roleId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OEPUserMgtJobpos2rolePK)) {
			return false;
		}

		OEPUserMgtJobpos2rolePK pk = (OEPUserMgtJobpos2rolePK)obj;

		if ((jobPosId == pk.jobPosId) && (roleId == pk.roleId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(jobPosId) + String.valueOf(roleId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("jobPosId");
		sb.append(StringPool.EQUAL);
		sb.append(jobPosId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("roleId");
		sb.append(StringPool.EQUAL);
		sb.append(roleId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}