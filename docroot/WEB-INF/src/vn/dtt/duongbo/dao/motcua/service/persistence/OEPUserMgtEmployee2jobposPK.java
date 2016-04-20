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
public class OEPUserMgtEmployee2jobposPK implements Comparable<OEPUserMgtEmployee2jobposPK>,
	Serializable {
	public int employeeId;
	public int jobPosId;

	public OEPUserMgtEmployee2jobposPK() {
	}

	public OEPUserMgtEmployee2jobposPK(int employeeId, int jobPosId) {
		this.employeeId = employeeId;
		this.jobPosId = jobPosId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getJobPosId() {
		return jobPosId;
	}

	public void setJobPosId(int jobPosId) {
		this.jobPosId = jobPosId;
	}

	@Override
	public int compareTo(OEPUserMgtEmployee2jobposPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (employeeId < pk.employeeId) {
			value = -1;
		}
		else if (employeeId > pk.employeeId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

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

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OEPUserMgtEmployee2jobposPK)) {
			return false;
		}

		OEPUserMgtEmployee2jobposPK pk = (OEPUserMgtEmployee2jobposPK)obj;

		if ((employeeId == pk.employeeId) && (jobPosId == pk.jobPosId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(employeeId) + String.valueOf(jobPosId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("employeeId");
		sb.append(StringPool.EQUAL);
		sb.append(employeeId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("jobPosId");
		sb.append(StringPool.EQUAL);
		sb.append(jobPosId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}