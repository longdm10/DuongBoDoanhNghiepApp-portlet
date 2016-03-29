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

package vn.dtt.duongbo.dao.thanhtoan.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ThanhToanKeyPay in entity cache.
 *
 * @author win_64
 * @see ThanhToanKeyPay
 * @generated
 */
public class ThanhToanKeyPayCacheModel implements CacheModel<ThanhToanKeyPay>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(id);
		sb.append(", idDoanhNghiep=");
		sb.append(idDoanhNghiep);
		sb.append(", goodCode=");
		sb.append(goodCode);
		sb.append(", amount=");
		sb.append(amount);
		sb.append(", merchantTransId=");
		sb.append(merchantTransId);
		sb.append(", merchantCode=");
		sb.append(merchantCode);
		sb.append(", responseCode=");
		sb.append(responseCode);
		sb.append(", transidKeypay=");
		sb.append(transidKeypay);
		sb.append(", netCost=");
		sb.append(netCost);
		sb.append(", shipFee=");
		sb.append(shipFee);
		sb.append(", currencyCode=");
		sb.append(currencyCode);
		sb.append(", bankCode=");
		sb.append(bankCode);
		sb.append(", xmlDescription=");
		sb.append(xmlDescription);
		sb.append(", ngayXuLy=");
		sb.append(ngayXuLy);
		sb.append(", thongTinHoSo=");
		sb.append(thongTinHoSo);
		sb.append(", loaiMessage=");
		sb.append(loaiMessage);
		sb.append(", ipn=");
		sb.append(ipn);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ThanhToanKeyPay toEntityModel() {
		ThanhToanKeyPayImpl thanhToanKeyPayImpl = new ThanhToanKeyPayImpl();

		thanhToanKeyPayImpl.setId(id);
		thanhToanKeyPayImpl.setIdDoanhNghiep(idDoanhNghiep);

		if (goodCode == null) {
			thanhToanKeyPayImpl.setGoodCode(StringPool.BLANK);
		}
		else {
			thanhToanKeyPayImpl.setGoodCode(goodCode);
		}

		thanhToanKeyPayImpl.setAmount(amount);

		if (merchantTransId == null) {
			thanhToanKeyPayImpl.setMerchantTransId(StringPool.BLANK);
		}
		else {
			thanhToanKeyPayImpl.setMerchantTransId(merchantTransId);
		}

		if (merchantCode == null) {
			thanhToanKeyPayImpl.setMerchantCode(StringPool.BLANK);
		}
		else {
			thanhToanKeyPayImpl.setMerchantCode(merchantCode);
		}

		if (responseCode == null) {
			thanhToanKeyPayImpl.setResponseCode(StringPool.BLANK);
		}
		else {
			thanhToanKeyPayImpl.setResponseCode(responseCode);
		}

		thanhToanKeyPayImpl.setTransidKeypay(transidKeypay);
		thanhToanKeyPayImpl.setNetCost(netCost);
		thanhToanKeyPayImpl.setShipFee(shipFee);

		if (currencyCode == null) {
			thanhToanKeyPayImpl.setCurrencyCode(StringPool.BLANK);
		}
		else {
			thanhToanKeyPayImpl.setCurrencyCode(currencyCode);
		}

		if (bankCode == null) {
			thanhToanKeyPayImpl.setBankCode(StringPool.BLANK);
		}
		else {
			thanhToanKeyPayImpl.setBankCode(bankCode);
		}

		if (xmlDescription == null) {
			thanhToanKeyPayImpl.setXmlDescription(StringPool.BLANK);
		}
		else {
			thanhToanKeyPayImpl.setXmlDescription(xmlDescription);
		}

		if (ngayXuLy == Long.MIN_VALUE) {
			thanhToanKeyPayImpl.setNgayXuLy(null);
		}
		else {
			thanhToanKeyPayImpl.setNgayXuLy(new Date(ngayXuLy));
		}

		if (thongTinHoSo == null) {
			thanhToanKeyPayImpl.setThongTinHoSo(StringPool.BLANK);
		}
		else {
			thanhToanKeyPayImpl.setThongTinHoSo(thongTinHoSo);
		}

		thanhToanKeyPayImpl.setLoaiMessage(loaiMessage);
		thanhToanKeyPayImpl.setIpn(ipn);

		thanhToanKeyPayImpl.resetOriginalValues();

		return thanhToanKeyPayImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		idDoanhNghiep = objectInput.readLong();
		goodCode = objectInput.readUTF();
		amount = objectInput.readLong();
		merchantTransId = objectInput.readUTF();
		merchantCode = objectInput.readUTF();
		responseCode = objectInput.readUTF();
		transidKeypay = objectInput.readLong();
		netCost = objectInput.readLong();
		shipFee = objectInput.readLong();
		currencyCode = objectInput.readUTF();
		bankCode = objectInput.readUTF();
		xmlDescription = objectInput.readUTF();
		ngayXuLy = objectInput.readLong();
		thongTinHoSo = objectInput.readUTF();
		loaiMessage = objectInput.readLong();
		ipn = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(idDoanhNghiep);

		if (goodCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(goodCode);
		}

		objectOutput.writeLong(amount);

		if (merchantTransId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(merchantTransId);
		}

		if (merchantCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(merchantCode);
		}

		if (responseCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(responseCode);
		}

		objectOutput.writeLong(transidKeypay);
		objectOutput.writeLong(netCost);
		objectOutput.writeLong(shipFee);

		if (currencyCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currencyCode);
		}

		if (bankCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bankCode);
		}

		if (xmlDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(xmlDescription);
		}

		objectOutput.writeLong(ngayXuLy);

		if (thongTinHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thongTinHoSo);
		}

		objectOutput.writeLong(loaiMessage);
		objectOutput.writeLong(ipn);
	}

	public long id;
	public long idDoanhNghiep;
	public String goodCode;
	public long amount;
	public String merchantTransId;
	public String merchantCode;
	public String responseCode;
	public long transidKeypay;
	public long netCost;
	public long shipFee;
	public String currencyCode;
	public String bankCode;
	public String xmlDescription;
	public long ngayXuLy;
	public String thongTinHoSo;
	public long loaiMessage;
	public long ipn;
}