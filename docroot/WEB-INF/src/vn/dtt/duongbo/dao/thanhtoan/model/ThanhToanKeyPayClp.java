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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.thanhtoan.service.ClpSerializer;
import vn.dtt.duongbo.dao.thanhtoan.service.ThanhToanKeyPayLocalServiceUtil;
import vn.dtt.duongbo.dao.thanhtoan.service.persistence.ThanhToanKeyPayPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class ThanhToanKeyPayClp extends BaseModelImpl<ThanhToanKeyPay>
	implements ThanhToanKeyPay {
	public ThanhToanKeyPayClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ThanhToanKeyPay.class;
	}

	@Override
	public String getModelClassName() {
		return ThanhToanKeyPay.class.getName();
	}

	@Override
	public ThanhToanKeyPayPK getPrimaryKey() {
		return new ThanhToanKeyPayPK(_id, _idDoanhNghiep);
	}

	@Override
	public void setPrimaryKey(ThanhToanKeyPayPK primaryKey) {
		setId(primaryKey.id);
		setIdDoanhNghiep(primaryKey.idDoanhNghiep);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new ThanhToanKeyPayPK(_id, _idDoanhNghiep);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((ThanhToanKeyPayPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("idDoanhNghiep", getIdDoanhNghiep());
		attributes.put("goodCode", getGoodCode());
		attributes.put("amount", getAmount());
		attributes.put("merchantTransId", getMerchantTransId());
		attributes.put("merchantCode", getMerchantCode());
		attributes.put("responseCode", getResponseCode());
		attributes.put("transidKeypay", getTransidKeypay());
		attributes.put("netCost", getNetCost());
		attributes.put("shipFee", getShipFee());
		attributes.put("currencyCode", getCurrencyCode());
		attributes.put("bankCode", getBankCode());
		attributes.put("xmlDescription", getXmlDescription());
		attributes.put("ngayXuLy", getNgayXuLy());
		attributes.put("thongTinHoSo", getThongTinHoSo());
		attributes.put("loaiMessage", getLoaiMessage());
		attributes.put("ipn", getIpn());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long idDoanhNghiep = (Long)attributes.get("idDoanhNghiep");

		if (idDoanhNghiep != null) {
			setIdDoanhNghiep(idDoanhNghiep);
		}

		String goodCode = (String)attributes.get("goodCode");

		if (goodCode != null) {
			setGoodCode(goodCode);
		}

		Long amount = (Long)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		String merchantTransId = (String)attributes.get("merchantTransId");

		if (merchantTransId != null) {
			setMerchantTransId(merchantTransId);
		}

		String merchantCode = (String)attributes.get("merchantCode");

		if (merchantCode != null) {
			setMerchantCode(merchantCode);
		}

		String responseCode = (String)attributes.get("responseCode");

		if (responseCode != null) {
			setResponseCode(responseCode);
		}

		Long transidKeypay = (Long)attributes.get("transidKeypay");

		if (transidKeypay != null) {
			setTransidKeypay(transidKeypay);
		}

		Long netCost = (Long)attributes.get("netCost");

		if (netCost != null) {
			setNetCost(netCost);
		}

		Long shipFee = (Long)attributes.get("shipFee");

		if (shipFee != null) {
			setShipFee(shipFee);
		}

		String currencyCode = (String)attributes.get("currencyCode");

		if (currencyCode != null) {
			setCurrencyCode(currencyCode);
		}

		String bankCode = (String)attributes.get("bankCode");

		if (bankCode != null) {
			setBankCode(bankCode);
		}

		String xmlDescription = (String)attributes.get("xmlDescription");

		if (xmlDescription != null) {
			setXmlDescription(xmlDescription);
		}

		Date ngayXuLy = (Date)attributes.get("ngayXuLy");

		if (ngayXuLy != null) {
			setNgayXuLy(ngayXuLy);
		}

		String thongTinHoSo = (String)attributes.get("thongTinHoSo");

		if (thongTinHoSo != null) {
			setThongTinHoSo(thongTinHoSo);
		}

		Long loaiMessage = (Long)attributes.get("loaiMessage");

		if (loaiMessage != null) {
			setLoaiMessage(loaiMessage);
		}

		Long ipn = (Long)attributes.get("ipn");

		if (ipn != null) {
			setIpn(ipn);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_thanhToanKeyPayRemoteModel != null) {
			try {
				Class<?> clazz = _thanhToanKeyPayRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_thanhToanKeyPayRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getIdDoanhNghiep() {
		return _idDoanhNghiep;
	}

	@Override
	public void setIdDoanhNghiep(long idDoanhNghiep) {
		_idDoanhNghiep = idDoanhNghiep;

		if (_thanhToanKeyPayRemoteModel != null) {
			try {
				Class<?> clazz = _thanhToanKeyPayRemoteModel.getClass();

				Method method = clazz.getMethod("setIdDoanhNghiep", long.class);

				method.invoke(_thanhToanKeyPayRemoteModel, idDoanhNghiep);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGoodCode() {
		return _goodCode;
	}

	@Override
	public void setGoodCode(String goodCode) {
		_goodCode = goodCode;

		if (_thanhToanKeyPayRemoteModel != null) {
			try {
				Class<?> clazz = _thanhToanKeyPayRemoteModel.getClass();

				Method method = clazz.getMethod("setGoodCode", String.class);

				method.invoke(_thanhToanKeyPayRemoteModel, goodCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAmount() {
		return _amount;
	}

	@Override
	public void setAmount(long amount) {
		_amount = amount;

		if (_thanhToanKeyPayRemoteModel != null) {
			try {
				Class<?> clazz = _thanhToanKeyPayRemoteModel.getClass();

				Method method = clazz.getMethod("setAmount", long.class);

				method.invoke(_thanhToanKeyPayRemoteModel, amount);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMerchantTransId() {
		return _merchantTransId;
	}

	@Override
	public void setMerchantTransId(String merchantTransId) {
		_merchantTransId = merchantTransId;

		if (_thanhToanKeyPayRemoteModel != null) {
			try {
				Class<?> clazz = _thanhToanKeyPayRemoteModel.getClass();

				Method method = clazz.getMethod("setMerchantTransId",
						String.class);

				method.invoke(_thanhToanKeyPayRemoteModel, merchantTransId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMerchantCode() {
		return _merchantCode;
	}

	@Override
	public void setMerchantCode(String merchantCode) {
		_merchantCode = merchantCode;

		if (_thanhToanKeyPayRemoteModel != null) {
			try {
				Class<?> clazz = _thanhToanKeyPayRemoteModel.getClass();

				Method method = clazz.getMethod("setMerchantCode", String.class);

				method.invoke(_thanhToanKeyPayRemoteModel, merchantCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getResponseCode() {
		return _responseCode;
	}

	@Override
	public void setResponseCode(String responseCode) {
		_responseCode = responseCode;

		if (_thanhToanKeyPayRemoteModel != null) {
			try {
				Class<?> clazz = _thanhToanKeyPayRemoteModel.getClass();

				Method method = clazz.getMethod("setResponseCode", String.class);

				method.invoke(_thanhToanKeyPayRemoteModel, responseCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTransidKeypay() {
		return _transidKeypay;
	}

	@Override
	public void setTransidKeypay(long transidKeypay) {
		_transidKeypay = transidKeypay;

		if (_thanhToanKeyPayRemoteModel != null) {
			try {
				Class<?> clazz = _thanhToanKeyPayRemoteModel.getClass();

				Method method = clazz.getMethod("setTransidKeypay", long.class);

				method.invoke(_thanhToanKeyPayRemoteModel, transidKeypay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNetCost() {
		return _netCost;
	}

	@Override
	public void setNetCost(long netCost) {
		_netCost = netCost;

		if (_thanhToanKeyPayRemoteModel != null) {
			try {
				Class<?> clazz = _thanhToanKeyPayRemoteModel.getClass();

				Method method = clazz.getMethod("setNetCost", long.class);

				method.invoke(_thanhToanKeyPayRemoteModel, netCost);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getShipFee() {
		return _shipFee;
	}

	@Override
	public void setShipFee(long shipFee) {
		_shipFee = shipFee;

		if (_thanhToanKeyPayRemoteModel != null) {
			try {
				Class<?> clazz = _thanhToanKeyPayRemoteModel.getClass();

				Method method = clazz.getMethod("setShipFee", long.class);

				method.invoke(_thanhToanKeyPayRemoteModel, shipFee);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCurrencyCode() {
		return _currencyCode;
	}

	@Override
	public void setCurrencyCode(String currencyCode) {
		_currencyCode = currencyCode;

		if (_thanhToanKeyPayRemoteModel != null) {
			try {
				Class<?> clazz = _thanhToanKeyPayRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrencyCode", String.class);

				method.invoke(_thanhToanKeyPayRemoteModel, currencyCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBankCode() {
		return _bankCode;
	}

	@Override
	public void setBankCode(String bankCode) {
		_bankCode = bankCode;

		if (_thanhToanKeyPayRemoteModel != null) {
			try {
				Class<?> clazz = _thanhToanKeyPayRemoteModel.getClass();

				Method method = clazz.getMethod("setBankCode", String.class);

				method.invoke(_thanhToanKeyPayRemoteModel, bankCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXmlDescription() {
		return _xmlDescription;
	}

	@Override
	public void setXmlDescription(String xmlDescription) {
		_xmlDescription = xmlDescription;

		if (_thanhToanKeyPayRemoteModel != null) {
			try {
				Class<?> clazz = _thanhToanKeyPayRemoteModel.getClass();

				Method method = clazz.getMethod("setXmlDescription",
						String.class);

				method.invoke(_thanhToanKeyPayRemoteModel, xmlDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayXuLy() {
		return _ngayXuLy;
	}

	@Override
	public void setNgayXuLy(Date ngayXuLy) {
		_ngayXuLy = ngayXuLy;

		if (_thanhToanKeyPayRemoteModel != null) {
			try {
				Class<?> clazz = _thanhToanKeyPayRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayXuLy", Date.class);

				method.invoke(_thanhToanKeyPayRemoteModel, ngayXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getThongTinHoSo() {
		return _thongTinHoSo;
	}

	@Override
	public void setThongTinHoSo(String thongTinHoSo) {
		_thongTinHoSo = thongTinHoSo;

		if (_thanhToanKeyPayRemoteModel != null) {
			try {
				Class<?> clazz = _thanhToanKeyPayRemoteModel.getClass();

				Method method = clazz.getMethod("setThongTinHoSo", String.class);

				method.invoke(_thanhToanKeyPayRemoteModel, thongTinHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLoaiMessage() {
		return _loaiMessage;
	}

	@Override
	public void setLoaiMessage(long loaiMessage) {
		_loaiMessage = loaiMessage;

		if (_thanhToanKeyPayRemoteModel != null) {
			try {
				Class<?> clazz = _thanhToanKeyPayRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiMessage", long.class);

				method.invoke(_thanhToanKeyPayRemoteModel, loaiMessage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getIpn() {
		return _ipn;
	}

	@Override
	public void setIpn(long ipn) {
		_ipn = ipn;

		if (_thanhToanKeyPayRemoteModel != null) {
			try {
				Class<?> clazz = _thanhToanKeyPayRemoteModel.getClass();

				Method method = clazz.getMethod("setIpn", long.class);

				method.invoke(_thanhToanKeyPayRemoteModel, ipn);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getThanhToanKeyPayRemoteModel() {
		return _thanhToanKeyPayRemoteModel;
	}

	public void setThanhToanKeyPayRemoteModel(
		BaseModel<?> thanhToanKeyPayRemoteModel) {
		_thanhToanKeyPayRemoteModel = thanhToanKeyPayRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _thanhToanKeyPayRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_thanhToanKeyPayRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ThanhToanKeyPayLocalServiceUtil.addThanhToanKeyPay(this);
		}
		else {
			ThanhToanKeyPayLocalServiceUtil.updateThanhToanKeyPay(this);
		}
	}

	@Override
	public ThanhToanKeyPay toEscapedModel() {
		return (ThanhToanKeyPay)ProxyUtil.newProxyInstance(ThanhToanKeyPay.class.getClassLoader(),
			new Class[] { ThanhToanKeyPay.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ThanhToanKeyPayClp clone = new ThanhToanKeyPayClp();

		clone.setId(getId());
		clone.setIdDoanhNghiep(getIdDoanhNghiep());
		clone.setGoodCode(getGoodCode());
		clone.setAmount(getAmount());
		clone.setMerchantTransId(getMerchantTransId());
		clone.setMerchantCode(getMerchantCode());
		clone.setResponseCode(getResponseCode());
		clone.setTransidKeypay(getTransidKeypay());
		clone.setNetCost(getNetCost());
		clone.setShipFee(getShipFee());
		clone.setCurrencyCode(getCurrencyCode());
		clone.setBankCode(getBankCode());
		clone.setXmlDescription(getXmlDescription());
		clone.setNgayXuLy(getNgayXuLy());
		clone.setThongTinHoSo(getThongTinHoSo());
		clone.setLoaiMessage(getLoaiMessage());
		clone.setIpn(getIpn());

		return clone;
	}

	@Override
	public int compareTo(ThanhToanKeyPay thanhToanKeyPay) {
		int value = 0;

		if (getId() < thanhToanKeyPay.getId()) {
			value = -1;
		}
		else if (getId() > thanhToanKeyPay.getId()) {
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

		if (!(obj instanceof ThanhToanKeyPayClp)) {
			return false;
		}

		ThanhToanKeyPayClp thanhToanKeyPay = (ThanhToanKeyPayClp)obj;

		ThanhToanKeyPayPK primaryKey = thanhToanKeyPay.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", idDoanhNghiep=");
		sb.append(getIdDoanhNghiep());
		sb.append(", goodCode=");
		sb.append(getGoodCode());
		sb.append(", amount=");
		sb.append(getAmount());
		sb.append(", merchantTransId=");
		sb.append(getMerchantTransId());
		sb.append(", merchantCode=");
		sb.append(getMerchantCode());
		sb.append(", responseCode=");
		sb.append(getResponseCode());
		sb.append(", transidKeypay=");
		sb.append(getTransidKeypay());
		sb.append(", netCost=");
		sb.append(getNetCost());
		sb.append(", shipFee=");
		sb.append(getShipFee());
		sb.append(", currencyCode=");
		sb.append(getCurrencyCode());
		sb.append(", bankCode=");
		sb.append(getBankCode());
		sb.append(", xmlDescription=");
		sb.append(getXmlDescription());
		sb.append(", ngayXuLy=");
		sb.append(getNgayXuLy());
		sb.append(", thongTinHoSo=");
		sb.append(getThongTinHoSo());
		sb.append(", loaiMessage=");
		sb.append(getLoaiMessage());
		sb.append(", ipn=");
		sb.append(getIpn());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idDoanhNghiep</column-name><column-value><![CDATA[");
		sb.append(getIdDoanhNghiep());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodCode</column-name><column-value><![CDATA[");
		sb.append(getGoodCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amount</column-name><column-value><![CDATA[");
		sb.append(getAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>merchantTransId</column-name><column-value><![CDATA[");
		sb.append(getMerchantTransId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>merchantCode</column-name><column-value><![CDATA[");
		sb.append(getMerchantCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseCode</column-name><column-value><![CDATA[");
		sb.append(getResponseCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>transidKeypay</column-name><column-value><![CDATA[");
		sb.append(getTransidKeypay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>netCost</column-name><column-value><![CDATA[");
		sb.append(getNetCost());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipFee</column-name><column-value><![CDATA[");
		sb.append(getShipFee());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currencyCode</column-name><column-value><![CDATA[");
		sb.append(getCurrencyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bankCode</column-name><column-value><![CDATA[");
		sb.append(getBankCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>xmlDescription</column-name><column-value><![CDATA[");
		sb.append(getXmlDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayXuLy</column-name><column-value><![CDATA[");
		sb.append(getNgayXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thongTinHoSo</column-name><column-value><![CDATA[");
		sb.append(getThongTinHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiMessage</column-name><column-value><![CDATA[");
		sb.append(getLoaiMessage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ipn</column-name><column-value><![CDATA[");
		sb.append(getIpn());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _thanhToanKeyPayRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbo.dao.thanhtoan.service.ClpSerializer.class;
}