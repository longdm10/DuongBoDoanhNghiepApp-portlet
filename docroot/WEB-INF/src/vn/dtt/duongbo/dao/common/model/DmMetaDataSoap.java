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
public class DmMetaDataSoap implements Serializable {
	public static DmMetaDataSoap toSoapModel(DmMetaData model) {
		DmMetaDataSoap soapModel = new DmMetaDataSoap();

		soapModel.setId(model.getId());
		soapModel.setEntity(model.getEntity());
		soapModel.setFieldCode(model.getFieldCode());
		soapModel.setFieldName(model.getFieldName());
		soapModel.setFieldAlterName(model.getFieldAlterName());
		soapModel.setFieldDescription(model.getFieldDescription());
		soapModel.setFieldDataSet(model.getFieldDataSet());

		return soapModel;
	}

	public static DmMetaDataSoap[] toSoapModels(DmMetaData[] models) {
		DmMetaDataSoap[] soapModels = new DmMetaDataSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmMetaDataSoap[][] toSoapModels(DmMetaData[][] models) {
		DmMetaDataSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmMetaDataSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmMetaDataSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmMetaDataSoap[] toSoapModels(List<DmMetaData> models) {
		List<DmMetaDataSoap> soapModels = new ArrayList<DmMetaDataSoap>(models.size());

		for (DmMetaData model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmMetaDataSoap[soapModels.size()]);
	}

	public DmMetaDataSoap() {
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

	public String getEntity() {
		return _entity;
	}

	public void setEntity(String entity) {
		_entity = entity;
	}

	public String getFieldCode() {
		return _fieldCode;
	}

	public void setFieldCode(String fieldCode) {
		_fieldCode = fieldCode;
	}

	public String getFieldName() {
		return _fieldName;
	}

	public void setFieldName(String fieldName) {
		_fieldName = fieldName;
	}

	public String getFieldAlterName() {
		return _fieldAlterName;
	}

	public void setFieldAlterName(String fieldAlterName) {
		_fieldAlterName = fieldAlterName;
	}

	public String getFieldDescription() {
		return _fieldDescription;
	}

	public void setFieldDescription(String fieldDescription) {
		_fieldDescription = fieldDescription;
	}

	public String getFieldDataSet() {
		return _fieldDataSet;
	}

	public void setFieldDataSet(String fieldDataSet) {
		_fieldDataSet = fieldDataSet;
	}

	private long _id;
	private String _entity;
	private String _fieldCode;
	private String _fieldName;
	private String _fieldAlterName;
	private String _fieldDescription;
	private String _fieldDataSet;
}