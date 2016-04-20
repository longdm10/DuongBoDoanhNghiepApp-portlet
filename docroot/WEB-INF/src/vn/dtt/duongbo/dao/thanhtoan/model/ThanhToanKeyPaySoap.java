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

package vn.dtt.duongbo.dao.thanhtoan.model;

import vn.dtt.duongbo.dao.thanhtoan.service.persistence.ThanhToanKeyPayPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author win_64
 * @generated
 */
public class ThanhToanKeyPaySoap implements Serializable {
	public static ThanhToanKeyPaySoap toSoapModel(ThanhToanKeyPay model) {
		ThanhToanKeyPaySoap soapModel = new ThanhToanKeyPaySoap();

		soapModel.setId(model.getId());
		soapModel.setIdDoanhNghiep(model.getIdDoanhNghiep());
		soapModel.setGoodCode(model.getGoodCode());
		soapModel.setAmount(model.getAmount());
		soapModel.setMerchantTransId(model.getMerchantTransId());
		soapModel.setMerchantCode(model.getMerchantCode());
		soapModel.setResponseCode(model.getResponseCode());
		soapModel.setTransidKeypay(model.getTransidKeypay());
		soapModel.setNetCost(model.getNetCost());
		soapModel.setShipFee(model.getShipFee());
		soapModel.setCurrencyCode(model.getCurrencyCode());
		soapModel.setBankCode(model.getBankCode());
		soapModel.setXmlDescription(model.getXmlDescription());
		soapModel.setNgayXuLy(model.getNgayXuLy());
		soapModel.setThongTinHoSo(model.getThongTinHoSo());
		soapModel.setLoaiMessage(model.getLoaiMessage());
		soapModel.setIpn(model.getIpn());

		return soapModel;
	}

	public static ThanhToanKeyPaySoap[] toSoapModels(ThanhToanKeyPay[] models) {
		ThanhToanKeyPaySoap[] soapModels = new ThanhToanKeyPaySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ThanhToanKeyPaySoap[][] toSoapModels(
		ThanhToanKeyPay[][] models) {
		ThanhToanKeyPaySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ThanhToanKeyPaySoap[models.length][models[0].length];
		}
		else {
			soapModels = new ThanhToanKeyPaySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ThanhToanKeyPaySoap[] toSoapModels(
		List<ThanhToanKeyPay> models) {
		List<ThanhToanKeyPaySoap> soapModels = new ArrayList<ThanhToanKeyPaySoap>(models.size());

		for (ThanhToanKeyPay model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ThanhToanKeyPaySoap[soapModels.size()]);
	}

	public ThanhToanKeyPaySoap() {
	}

	public ThanhToanKeyPayPK getPrimaryKey() {
		return new ThanhToanKeyPayPK(_id, _idDoanhNghiep);
	}

	public void setPrimaryKey(ThanhToanKeyPayPK pk) {
		setId(pk.id);
		setIdDoanhNghiep(pk.idDoanhNghiep);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getIdDoanhNghiep() {
		return _idDoanhNghiep;
	}

	public void setIdDoanhNghiep(long idDoanhNghiep) {
		_idDoanhNghiep = idDoanhNghiep;
	}

	public String getGoodCode() {
		return _goodCode;
	}

	public void setGoodCode(String goodCode) {
		_goodCode = goodCode;
	}

	public long getAmount() {
		return _amount;
	}

	public void setAmount(long amount) {
		_amount = amount;
	}

	public String getMerchantTransId() {
		return _merchantTransId;
	}

	public void setMerchantTransId(String merchantTransId) {
		_merchantTransId = merchantTransId;
	}

	public String getMerchantCode() {
		return _merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		_merchantCode = merchantCode;
	}

	public String getResponseCode() {
		return _responseCode;
	}

	public void setResponseCode(String responseCode) {
		_responseCode = responseCode;
	}

	public long getTransidKeypay() {
		return _transidKeypay;
	}

	public void setTransidKeypay(long transidKeypay) {
		_transidKeypay = transidKeypay;
	}

	public long getNetCost() {
		return _netCost;
	}

	public void setNetCost(long netCost) {
		_netCost = netCost;
	}

	public long getShipFee() {
		return _shipFee;
	}

	public void setShipFee(long shipFee) {
		_shipFee = shipFee;
	}

	public String getCurrencyCode() {
		return _currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		_currencyCode = currencyCode;
	}

	public String getBankCode() {
		return _bankCode;
	}

	public void setBankCode(String bankCode) {
		_bankCode = bankCode;
	}

	public String getXmlDescription() {
		return _xmlDescription;
	}

	public void setXmlDescription(String xmlDescription) {
		_xmlDescription = xmlDescription;
	}

	public Date getNgayXuLy() {
		return _ngayXuLy;
	}

	public void setNgayXuLy(Date ngayXuLy) {
		_ngayXuLy = ngayXuLy;
	}

	public String getThongTinHoSo() {
		return _thongTinHoSo;
	}

	public void setThongTinHoSo(String thongTinHoSo) {
		_thongTinHoSo = thongTinHoSo;
	}

	public long getLoaiMessage() {
		return _loaiMessage;
	}

	public void setLoaiMessage(long loaiMessage) {
		_loaiMessage = loaiMessage;
	}

	public long getIpn() {
		return _ipn;
	}

	public void setIpn(long ipn) {
		_ipn = ipn;
	}

	private long _id;
	private long _idDoanhNghiep;
	private String _goodCode;
	private long _amount;
	private String _merchantTransId;
	private String _merchantCode;
	private String _responseCode;
	private long _transidKeypay;
	private long _netCost;
	private long _shipFee;
	private String _currencyCode;
	private String _bankCode;
	private String _xmlDescription;
	private Date _ngayXuLy;
	private String _thongTinHoSo;
	private long _loaiMessage;
	private long _ipn;
}