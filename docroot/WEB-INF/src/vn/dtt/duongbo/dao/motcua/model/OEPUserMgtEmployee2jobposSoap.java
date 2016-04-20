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

import vn.dtt.duongbo.dao.motcua.service.persistence.OEPUserMgtEmployee2jobposPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.duongbo.dao.motcua.service.http.OEPUserMgtEmployee2jobposServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.motcua.service.http.OEPUserMgtEmployee2jobposServiceSoap
 * @generated
 */
public class OEPUserMgtEmployee2jobposSoap implements Serializable {
	public static OEPUserMgtEmployee2jobposSoap toSoapModel(
		OEPUserMgtEmployee2jobpos model) {
		OEPUserMgtEmployee2jobposSoap soapModel = new OEPUserMgtEmployee2jobposSoap();

		soapModel.setEmployeeId(model.getEmployeeId());
		soapModel.setJobPosId(model.getJobPosId());

		return soapModel;
	}

	public static OEPUserMgtEmployee2jobposSoap[] toSoapModels(
		OEPUserMgtEmployee2jobpos[] models) {
		OEPUserMgtEmployee2jobposSoap[] soapModels = new OEPUserMgtEmployee2jobposSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OEPUserMgtEmployee2jobposSoap[][] toSoapModels(
		OEPUserMgtEmployee2jobpos[][] models) {
		OEPUserMgtEmployee2jobposSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OEPUserMgtEmployee2jobposSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OEPUserMgtEmployee2jobposSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OEPUserMgtEmployee2jobposSoap[] toSoapModels(
		List<OEPUserMgtEmployee2jobpos> models) {
		List<OEPUserMgtEmployee2jobposSoap> soapModels = new ArrayList<OEPUserMgtEmployee2jobposSoap>(models.size());

		for (OEPUserMgtEmployee2jobpos model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OEPUserMgtEmployee2jobposSoap[soapModels.size()]);
	}

	public OEPUserMgtEmployee2jobposSoap() {
	}

	public OEPUserMgtEmployee2jobposPK getPrimaryKey() {
		return new OEPUserMgtEmployee2jobposPK(_employeeId, _jobPosId);
	}

	public void setPrimaryKey(OEPUserMgtEmployee2jobposPK pk) {
		setEmployeeId(pk.employeeId);
		setJobPosId(pk.jobPosId);
	}

	public int getEmployeeId() {
		return _employeeId;
	}

	public void setEmployeeId(int employeeId) {
		_employeeId = employeeId;
	}

	public int getJobPosId() {
		return _jobPosId;
	}

	public void setJobPosId(int jobPosId) {
		_jobPosId = jobPosId;
	}

	private int _employeeId;
	private int _jobPosId;
}