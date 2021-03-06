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

package vn.dtt.duongbien.dao.vrcb.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author longdm
 * @generated
 */
public class DmHistoryGoodsSoap implements Serializable {
	public static DmHistoryGoodsSoap toSoapModel(DmHistoryGoods model) {
		DmHistoryGoodsSoap soapModel = new DmHistoryGoodsSoap();

		soapModel.setId(model.getId());
		soapModel.setGoodsItemCode(model.getGoodsItemCode());
		soapModel.setGoodsItemName(model.getGoodsItemName());
		soapModel.setGoodsItemNameVN(model.getGoodsItemNameVN());
		soapModel.setGoodsItemOrder(model.getGoodsItemOrder());
		soapModel.setIsDelete(model.getIsDelete());
		soapModel.setMarkedAsDelete(model.getMarkedAsDelete());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setSyncVersion(model.getSyncVersion());

		return soapModel;
	}

	public static DmHistoryGoodsSoap[] toSoapModels(DmHistoryGoods[] models) {
		DmHistoryGoodsSoap[] soapModels = new DmHistoryGoodsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmHistoryGoodsSoap[][] toSoapModels(DmHistoryGoods[][] models) {
		DmHistoryGoodsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmHistoryGoodsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmHistoryGoodsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmHistoryGoodsSoap[] toSoapModels(List<DmHistoryGoods> models) {
		List<DmHistoryGoodsSoap> soapModels = new ArrayList<DmHistoryGoodsSoap>(models.size());

		for (DmHistoryGoods model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmHistoryGoodsSoap[soapModels.size()]);
	}

	public DmHistoryGoodsSoap() {
	}

	public int getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(int pk) {
		setId(pk);
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getGoodsItemCode() {
		return _goodsItemCode;
	}

	public void setGoodsItemCode(String goodsItemCode) {
		_goodsItemCode = goodsItemCode;
	}

	public String getGoodsItemName() {
		return _goodsItemName;
	}

	public void setGoodsItemName(String goodsItemName) {
		_goodsItemName = goodsItemName;
	}

	public String getGoodsItemNameVN() {
		return _goodsItemNameVN;
	}

	public void setGoodsItemNameVN(String goodsItemNameVN) {
		_goodsItemNameVN = goodsItemNameVN;
	}

	public int getGoodsItemOrder() {
		return _goodsItemOrder;
	}

	public void setGoodsItemOrder(int goodsItemOrder) {
		_goodsItemOrder = goodsItemOrder;
	}

	public int getIsDelete() {
		return _isDelete;
	}

	public void setIsDelete(int isDelete) {
		_isDelete = isDelete;
	}

	public int getMarkedAsDelete() {
		return _markedAsDelete;
	}

	public void setMarkedAsDelete(int markedAsDelete) {
		_markedAsDelete = markedAsDelete;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public Date getRequestedDate() {
		return _requestedDate;
	}

	public void setRequestedDate(Date requestedDate) {
		_requestedDate = requestedDate;
	}

	public String getSyncVersion() {
		return _syncVersion;
	}

	public void setSyncVersion(String syncVersion) {
		_syncVersion = syncVersion;
	}

	private int _id;
	private String _goodsItemCode;
	private String _goodsItemName;
	private String _goodsItemNameVN;
	private int _goodsItemOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}