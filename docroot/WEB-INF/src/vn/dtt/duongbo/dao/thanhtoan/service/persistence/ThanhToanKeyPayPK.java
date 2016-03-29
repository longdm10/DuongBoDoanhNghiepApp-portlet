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

package vn.dtt.duongbo.dao.thanhtoan.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author win_64
 * @generated
 */
public class ThanhToanKeyPayPK implements Comparable<ThanhToanKeyPayPK>,
	Serializable {
	public long id;
	public long idDoanhNghiep;

	public ThanhToanKeyPayPK() {
	}

	public ThanhToanKeyPayPK(long id, long idDoanhNghiep) {
		this.id = id;
		this.idDoanhNghiep = idDoanhNghiep;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdDoanhNghiep() {
		return idDoanhNghiep;
	}

	public void setIdDoanhNghiep(long idDoanhNghiep) {
		this.idDoanhNghiep = idDoanhNghiep;
	}

	@Override
	public int compareTo(ThanhToanKeyPayPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (id < pk.id) {
			value = -1;
		}
		else if (id > pk.id) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (idDoanhNghiep < pk.idDoanhNghiep) {
			value = -1;
		}
		else if (idDoanhNghiep > pk.idDoanhNghiep) {
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

		if (!(obj instanceof ThanhToanKeyPayPK)) {
			return false;
		}

		ThanhToanKeyPayPK pk = (ThanhToanKeyPayPK)obj;

		if ((id == pk.id) && (idDoanhNghiep == pk.idDoanhNghiep)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(id) + String.valueOf(idDoanhNghiep)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("id");
		sb.append(StringPool.EQUAL);
		sb.append(id);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("idDoanhNghiep");
		sb.append(StringPool.EQUAL);
		sb.append(idDoanhNghiep);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}