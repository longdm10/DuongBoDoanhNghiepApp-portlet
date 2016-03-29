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

package vn.dtt.duongbo.dao.common.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author win_64
 * @generated
 */
public class DmDataGroupSoap implements Serializable {
	public static DmDataGroupSoap toSoapModel(DmDataGroup model) {
		DmDataGroupSoap soapModel = new DmDataGroupSoap();

		soapModel.setId(model.getId());
		soapModel.setCode(model.getCode());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static DmDataGroupSoap[] toSoapModels(DmDataGroup[] models) {
		DmDataGroupSoap[] soapModels = new DmDataGroupSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmDataGroupSoap[][] toSoapModels(DmDataGroup[][] models) {
		DmDataGroupSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmDataGroupSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmDataGroupSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmDataGroupSoap[] toSoapModels(List<DmDataGroup> models) {
		List<DmDataGroupSoap> soapModels = new ArrayList<DmDataGroupSoap>(models.size());

		for (DmDataGroup model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmDataGroupSoap[soapModels.size()]);
	}

	public DmDataGroupSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _id;
	private String _code;
	private String _name;
	private String _description;
}