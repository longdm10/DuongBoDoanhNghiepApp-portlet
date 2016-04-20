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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author binhta
 * @generated
 */
public class QLVTCapPhepBienHieuPhuongTienSoap implements Serializable {
	public static QLVTCapPhepBienHieuPhuongTienSoap toSoapModel(
		QLVTCapPhepBienHieuPhuongTien model) {
		QLVTCapPhepBienHieuPhuongTienSoap soapModel = new QLVTCapPhepBienHieuPhuongTienSoap();

		soapModel.setId(model.getId());
		soapModel.setQlvtCapHepBienHieuId(model.getQlvtCapHepBienHieuId());
		soapModel.setQlvtPhuongTienVanTaiId(model.getQlvtPhuongTienVanTaiId());

		return soapModel;
	}

	public static QLVTCapPhepBienHieuPhuongTienSoap[] toSoapModels(
		QLVTCapPhepBienHieuPhuongTien[] models) {
		QLVTCapPhepBienHieuPhuongTienSoap[] soapModels = new QLVTCapPhepBienHieuPhuongTienSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QLVTCapPhepBienHieuPhuongTienSoap[][] toSoapModels(
		QLVTCapPhepBienHieuPhuongTien[][] models) {
		QLVTCapPhepBienHieuPhuongTienSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QLVTCapPhepBienHieuPhuongTienSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QLVTCapPhepBienHieuPhuongTienSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QLVTCapPhepBienHieuPhuongTienSoap[] toSoapModels(
		List<QLVTCapPhepBienHieuPhuongTien> models) {
		List<QLVTCapPhepBienHieuPhuongTienSoap> soapModels = new ArrayList<QLVTCapPhepBienHieuPhuongTienSoap>(models.size());

		for (QLVTCapPhepBienHieuPhuongTien model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QLVTCapPhepBienHieuPhuongTienSoap[soapModels.size()]);
	}

	public QLVTCapPhepBienHieuPhuongTienSoap() {
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

	public int getQlvtCapHepBienHieuId() {
		return _qlvtCapHepBienHieuId;
	}

	public void setQlvtCapHepBienHieuId(int qlvtCapHepBienHieuId) {
		_qlvtCapHepBienHieuId = qlvtCapHepBienHieuId;
	}

	public int getQlvtPhuongTienVanTaiId() {
		return _qlvtPhuongTienVanTaiId;
	}

	public void setQlvtPhuongTienVanTaiId(int qlvtPhuongTienVanTaiId) {
		_qlvtPhuongTienVanTaiId = qlvtPhuongTienVanTaiId;
	}

	private int _id;
	private int _qlvtCapHepBienHieuId;
	private int _qlvtPhuongTienVanTaiId;
}