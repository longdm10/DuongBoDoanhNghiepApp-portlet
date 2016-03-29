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
public class DmDataItemSoap implements Serializable {
	public static DmDataItemSoap toSoapModel(DmDataItem model) {
		DmDataItemSoap soapModel = new DmDataItemSoap();

		soapModel.setId(model.getId());
		soapModel.setDataGroupId(model.getDataGroupId());
		soapModel.setCode(model.getCode());
		soapModel.setNode1(model.getNode1());
		soapModel.setNode2(model.getNode2());
		soapModel.setNode3(model.getNode3());
		soapModel.setNode4(model.getNode4());
		soapModel.setLevel(model.getLevel());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());
		soapModel.setValidatedFrom(model.getValidatedFrom());
		soapModel.setValidatedTo(model.getValidatedTo());
		soapModel.setStatus(model.getStatus());
		soapModel.setOrder(model.getOrder());

		return soapModel;
	}

	public static DmDataItemSoap[] toSoapModels(DmDataItem[] models) {
		DmDataItemSoap[] soapModels = new DmDataItemSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmDataItemSoap[][] toSoapModels(DmDataItem[][] models) {
		DmDataItemSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmDataItemSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmDataItemSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmDataItemSoap[] toSoapModels(List<DmDataItem> models) {
		List<DmDataItemSoap> soapModels = new ArrayList<DmDataItemSoap>(models.size());

		for (DmDataItem model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmDataItemSoap[soapModels.size()]);
	}

	public DmDataItemSoap() {
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

	public long getDataGroupId() {
		return _dataGroupId;
	}

	public void setDataGroupId(long dataGroupId) {
		_dataGroupId = dataGroupId;
	}

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public String getNode1() {
		return _node1;
	}

	public void setNode1(String node1) {
		_node1 = node1;
	}

	public String getNode2() {
		return _node2;
	}

	public void setNode2(String node2) {
		_node2 = node2;
	}

	public String getNode3() {
		return _node3;
	}

	public void setNode3(String node3) {
		_node3 = node3;
	}

	public String getNode4() {
		return _node4;
	}

	public void setNode4(String node4) {
		_node4 = node4;
	}

	public int getLevel() {
		return _level;
	}

	public void setLevel(int level) {
		_level = level;
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

	public String getValidatedFrom() {
		return _validatedFrom;
	}

	public void setValidatedFrom(String validatedFrom) {
		_validatedFrom = validatedFrom;
	}

	public String getValidatedTo() {
		return _validatedTo;
	}

	public void setValidatedTo(String validatedTo) {
		_validatedTo = validatedTo;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public int getOrder() {
		return _order;
	}

	public void setOrder(int order) {
		_order = order;
	}

	private long _id;
	private long _dataGroupId;
	private String _code;
	private String _node1;
	private String _node2;
	private String _node3;
	private String _node4;
	private int _level;
	private String _name;
	private String _description;
	private String _validatedFrom;
	private String _validatedTo;
	private int _status;
	private int _order;
}