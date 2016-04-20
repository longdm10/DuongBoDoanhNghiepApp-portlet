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

package vn.dtt.duongbo.dao.motcua.model;

import vn.dtt.duongbo.dao.motcua.service.persistence.OEPUserMgtJobpos2rolePK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.motcua.service.http.OEPUserMgtJobpos2roleServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.motcua.service.http.OEPUserMgtJobpos2roleServiceSoap
 * @generated
 */
public class OEPUserMgtJobpos2roleSoap implements Serializable {
	public static OEPUserMgtJobpos2roleSoap toSoapModel(
		OEPUserMgtJobpos2role model) {
		OEPUserMgtJobpos2roleSoap soapModel = new OEPUserMgtJobpos2roleSoap();

		soapModel.setJobPosId(model.getJobPosId());
		soapModel.setRoleId(model.getRoleId());

		return soapModel;
	}

	public static OEPUserMgtJobpos2roleSoap[] toSoapModels(
		OEPUserMgtJobpos2role[] models) {
		OEPUserMgtJobpos2roleSoap[] soapModels = new OEPUserMgtJobpos2roleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OEPUserMgtJobpos2roleSoap[][] toSoapModels(
		OEPUserMgtJobpos2role[][] models) {
		OEPUserMgtJobpos2roleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OEPUserMgtJobpos2roleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OEPUserMgtJobpos2roleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OEPUserMgtJobpos2roleSoap[] toSoapModels(
		List<OEPUserMgtJobpos2role> models) {
		List<OEPUserMgtJobpos2roleSoap> soapModels = new ArrayList<OEPUserMgtJobpos2roleSoap>(models.size());

		for (OEPUserMgtJobpos2role model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OEPUserMgtJobpos2roleSoap[soapModels.size()]);
	}

	public OEPUserMgtJobpos2roleSoap() {
	}

	public OEPUserMgtJobpos2rolePK getPrimaryKey() {
		return new OEPUserMgtJobpos2rolePK(_jobPosId, _roleId);
	}

	public void setPrimaryKey(OEPUserMgtJobpos2rolePK pk) {
		setJobPosId(pk.jobPosId);
		setRoleId(pk.roleId);
	}

	public int getJobPosId() {
		return _jobPosId;
	}

	public void setJobPosId(int jobPosId) {
		_jobPosId = jobPosId;
	}

	public int getRoleId() {
		return _roleId;
	}

	public void setRoleId(int roleId) {
		_roleId = roleId;
	}

	private int _jobPosId;
	private int _roleId;
}