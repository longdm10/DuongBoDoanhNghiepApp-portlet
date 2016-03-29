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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ThanhToanKeyPay}.
 * </p>
 *
 * @author win_64
 * @see ThanhToanKeyPay
 * @generated
 */
public class ThanhToanKeyPayWrapper implements ThanhToanKeyPay,
	ModelWrapper<ThanhToanKeyPay> {
	public ThanhToanKeyPayWrapper(ThanhToanKeyPay thanhToanKeyPay) {
		_thanhToanKeyPay = thanhToanKeyPay;
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

	/**
	* Returns the primary key of this thanh toan key pay.
	*
	* @return the primary key of this thanh toan key pay
	*/
	@Override
	public vn.dtt.duongbo.dao.thanhtoan.service.persistence.ThanhToanKeyPayPK getPrimaryKey() {
		return _thanhToanKeyPay.getPrimaryKey();
	}

	/**
	* Sets the primary key of this thanh toan key pay.
	*
	* @param primaryKey the primary key of this thanh toan key pay
	*/
	@Override
	public void setPrimaryKey(
		vn.dtt.duongbo.dao.thanhtoan.service.persistence.ThanhToanKeyPayPK primaryKey) {
		_thanhToanKeyPay.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this thanh toan key pay.
	*
	* @return the ID of this thanh toan key pay
	*/
	@Override
	public long getId() {
		return _thanhToanKeyPay.getId();
	}

	/**
	* Sets the ID of this thanh toan key pay.
	*
	* @param id the ID of this thanh toan key pay
	*/
	@Override
	public void setId(long id) {
		_thanhToanKeyPay.setId(id);
	}

	/**
	* Returns the id doanh nghiep of this thanh toan key pay.
	*
	* @return the id doanh nghiep of this thanh toan key pay
	*/
	@Override
	public long getIdDoanhNghiep() {
		return _thanhToanKeyPay.getIdDoanhNghiep();
	}

	/**
	* Sets the id doanh nghiep of this thanh toan key pay.
	*
	* @param idDoanhNghiep the id doanh nghiep of this thanh toan key pay
	*/
	@Override
	public void setIdDoanhNghiep(long idDoanhNghiep) {
		_thanhToanKeyPay.setIdDoanhNghiep(idDoanhNghiep);
	}

	/**
	* Returns the good code of this thanh toan key pay.
	*
	* @return the good code of this thanh toan key pay
	*/
	@Override
	public java.lang.String getGoodCode() {
		return _thanhToanKeyPay.getGoodCode();
	}

	/**
	* Sets the good code of this thanh toan key pay.
	*
	* @param goodCode the good code of this thanh toan key pay
	*/
	@Override
	public void setGoodCode(java.lang.String goodCode) {
		_thanhToanKeyPay.setGoodCode(goodCode);
	}

	/**
	* Returns the amount of this thanh toan key pay.
	*
	* @return the amount of this thanh toan key pay
	*/
	@Override
	public long getAmount() {
		return _thanhToanKeyPay.getAmount();
	}

	/**
	* Sets the amount of this thanh toan key pay.
	*
	* @param amount the amount of this thanh toan key pay
	*/
	@Override
	public void setAmount(long amount) {
		_thanhToanKeyPay.setAmount(amount);
	}

	/**
	* Returns the merchant trans ID of this thanh toan key pay.
	*
	* @return the merchant trans ID of this thanh toan key pay
	*/
	@Override
	public java.lang.String getMerchantTransId() {
		return _thanhToanKeyPay.getMerchantTransId();
	}

	/**
	* Sets the merchant trans ID of this thanh toan key pay.
	*
	* @param merchantTransId the merchant trans ID of this thanh toan key pay
	*/
	@Override
	public void setMerchantTransId(java.lang.String merchantTransId) {
		_thanhToanKeyPay.setMerchantTransId(merchantTransId);
	}

	/**
	* Returns the merchant code of this thanh toan key pay.
	*
	* @return the merchant code of this thanh toan key pay
	*/
	@Override
	public java.lang.String getMerchantCode() {
		return _thanhToanKeyPay.getMerchantCode();
	}

	/**
	* Sets the merchant code of this thanh toan key pay.
	*
	* @param merchantCode the merchant code of this thanh toan key pay
	*/
	@Override
	public void setMerchantCode(java.lang.String merchantCode) {
		_thanhToanKeyPay.setMerchantCode(merchantCode);
	}

	/**
	* Returns the response code of this thanh toan key pay.
	*
	* @return the response code of this thanh toan key pay
	*/
	@Override
	public java.lang.String getResponseCode() {
		return _thanhToanKeyPay.getResponseCode();
	}

	/**
	* Sets the response code of this thanh toan key pay.
	*
	* @param responseCode the response code of this thanh toan key pay
	*/
	@Override
	public void setResponseCode(java.lang.String responseCode) {
		_thanhToanKeyPay.setResponseCode(responseCode);
	}

	/**
	* Returns the transid keypay of this thanh toan key pay.
	*
	* @return the transid keypay of this thanh toan key pay
	*/
	@Override
	public long getTransidKeypay() {
		return _thanhToanKeyPay.getTransidKeypay();
	}

	/**
	* Sets the transid keypay of this thanh toan key pay.
	*
	* @param transidKeypay the transid keypay of this thanh toan key pay
	*/
	@Override
	public void setTransidKeypay(long transidKeypay) {
		_thanhToanKeyPay.setTransidKeypay(transidKeypay);
	}

	/**
	* Returns the net cost of this thanh toan key pay.
	*
	* @return the net cost of this thanh toan key pay
	*/
	@Override
	public long getNetCost() {
		return _thanhToanKeyPay.getNetCost();
	}

	/**
	* Sets the net cost of this thanh toan key pay.
	*
	* @param netCost the net cost of this thanh toan key pay
	*/
	@Override
	public void setNetCost(long netCost) {
		_thanhToanKeyPay.setNetCost(netCost);
	}

	/**
	* Returns the ship fee of this thanh toan key pay.
	*
	* @return the ship fee of this thanh toan key pay
	*/
	@Override
	public long getShipFee() {
		return _thanhToanKeyPay.getShipFee();
	}

	/**
	* Sets the ship fee of this thanh toan key pay.
	*
	* @param shipFee the ship fee of this thanh toan key pay
	*/
	@Override
	public void setShipFee(long shipFee) {
		_thanhToanKeyPay.setShipFee(shipFee);
	}

	/**
	* Returns the currency code of this thanh toan key pay.
	*
	* @return the currency code of this thanh toan key pay
	*/
	@Override
	public java.lang.String getCurrencyCode() {
		return _thanhToanKeyPay.getCurrencyCode();
	}

	/**
	* Sets the currency code of this thanh toan key pay.
	*
	* @param currencyCode the currency code of this thanh toan key pay
	*/
	@Override
	public void setCurrencyCode(java.lang.String currencyCode) {
		_thanhToanKeyPay.setCurrencyCode(currencyCode);
	}

	/**
	* Returns the bank code of this thanh toan key pay.
	*
	* @return the bank code of this thanh toan key pay
	*/
	@Override
	public java.lang.String getBankCode() {
		return _thanhToanKeyPay.getBankCode();
	}

	/**
	* Sets the bank code of this thanh toan key pay.
	*
	* @param bankCode the bank code of this thanh toan key pay
	*/
	@Override
	public void setBankCode(java.lang.String bankCode) {
		_thanhToanKeyPay.setBankCode(bankCode);
	}

	/**
	* Returns the xml description of this thanh toan key pay.
	*
	* @return the xml description of this thanh toan key pay
	*/
	@Override
	public java.lang.String getXmlDescription() {
		return _thanhToanKeyPay.getXmlDescription();
	}

	/**
	* Sets the xml description of this thanh toan key pay.
	*
	* @param xmlDescription the xml description of this thanh toan key pay
	*/
	@Override
	public void setXmlDescription(java.lang.String xmlDescription) {
		_thanhToanKeyPay.setXmlDescription(xmlDescription);
	}

	/**
	* Returns the ngay xu ly of this thanh toan key pay.
	*
	* @return the ngay xu ly of this thanh toan key pay
	*/
	@Override
	public java.util.Date getNgayXuLy() {
		return _thanhToanKeyPay.getNgayXuLy();
	}

	/**
	* Sets the ngay xu ly of this thanh toan key pay.
	*
	* @param ngayXuLy the ngay xu ly of this thanh toan key pay
	*/
	@Override
	public void setNgayXuLy(java.util.Date ngayXuLy) {
		_thanhToanKeyPay.setNgayXuLy(ngayXuLy);
	}

	/**
	* Returns the thong tin ho so of this thanh toan key pay.
	*
	* @return the thong tin ho so of this thanh toan key pay
	*/
	@Override
	public java.lang.String getThongTinHoSo() {
		return _thanhToanKeyPay.getThongTinHoSo();
	}

	/**
	* Sets the thong tin ho so of this thanh toan key pay.
	*
	* @param thongTinHoSo the thong tin ho so of this thanh toan key pay
	*/
	@Override
	public void setThongTinHoSo(java.lang.String thongTinHoSo) {
		_thanhToanKeyPay.setThongTinHoSo(thongTinHoSo);
	}

	/**
	* Returns the loai message of this thanh toan key pay.
	*
	* @return the loai message of this thanh toan key pay
	*/
	@Override
	public long getLoaiMessage() {
		return _thanhToanKeyPay.getLoaiMessage();
	}

	/**
	* Sets the loai message of this thanh toan key pay.
	*
	* @param loaiMessage the loai message of this thanh toan key pay
	*/
	@Override
	public void setLoaiMessage(long loaiMessage) {
		_thanhToanKeyPay.setLoaiMessage(loaiMessage);
	}

	/**
	* Returns the ipn of this thanh toan key pay.
	*
	* @return the ipn of this thanh toan key pay
	*/
	@Override
	public long getIpn() {
		return _thanhToanKeyPay.getIpn();
	}

	/**
	* Sets the ipn of this thanh toan key pay.
	*
	* @param ipn the ipn of this thanh toan key pay
	*/
	@Override
	public void setIpn(long ipn) {
		_thanhToanKeyPay.setIpn(ipn);
	}

	@Override
	public boolean isNew() {
		return _thanhToanKeyPay.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_thanhToanKeyPay.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _thanhToanKeyPay.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_thanhToanKeyPay.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _thanhToanKeyPay.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _thanhToanKeyPay.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_thanhToanKeyPay.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _thanhToanKeyPay.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_thanhToanKeyPay.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_thanhToanKeyPay.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_thanhToanKeyPay.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ThanhToanKeyPayWrapper((ThanhToanKeyPay)_thanhToanKeyPay.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay thanhToanKeyPay) {
		return _thanhToanKeyPay.compareTo(thanhToanKeyPay);
	}

	@Override
	public int hashCode() {
		return _thanhToanKeyPay.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay> toCacheModel() {
		return _thanhToanKeyPay.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay toEscapedModel() {
		return new ThanhToanKeyPayWrapper(_thanhToanKeyPay.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay toUnescapedModel() {
		return new ThanhToanKeyPayWrapper(_thanhToanKeyPay.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _thanhToanKeyPay.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _thanhToanKeyPay.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_thanhToanKeyPay.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ThanhToanKeyPayWrapper)) {
			return false;
		}

		ThanhToanKeyPayWrapper thanhToanKeyPayWrapper = (ThanhToanKeyPayWrapper)obj;

		if (Validator.equals(_thanhToanKeyPay,
					thanhToanKeyPayWrapper._thanhToanKeyPay)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ThanhToanKeyPay getWrappedThanhToanKeyPay() {
		return _thanhToanKeyPay;
	}

	@Override
	public ThanhToanKeyPay getWrappedModel() {
		return _thanhToanKeyPay;
	}

	@Override
	public void resetOriginalValues() {
		_thanhToanKeyPay.resetOriginalValues();
	}

	private ThanhToanKeyPay _thanhToanKeyPay;
}