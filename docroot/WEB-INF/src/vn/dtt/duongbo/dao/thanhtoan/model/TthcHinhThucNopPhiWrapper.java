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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TthcHinhThucNopPhi}.
 * </p>
 *
 * @author win_64
 * @see TthcHinhThucNopPhi
 * @generated
 */
public class TthcHinhThucNopPhiWrapper implements TthcHinhThucNopPhi,
	ModelWrapper<TthcHinhThucNopPhi> {
	public TthcHinhThucNopPhiWrapper(TthcHinhThucNopPhi tthcHinhThucNopPhi) {
		_tthcHinhThucNopPhi = tthcHinhThucNopPhi;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcHinhThucNopPhi.class;
	}

	@Override
	public String getModelClassName() {
		return TthcHinhThucNopPhi.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thuTucHanhChinhId", getThuTucHanhChinhId());
		attributes.put("donViThucHienId", getDonViThucHienId());
		attributes.put("phiNopBanDau", getPhiNopBanDau());
		attributes.put("chuyenKhoan", getChuyenKhoan());
		attributes.put("keyPay", getKeyPay());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long thuTucHanhChinhId = (Long)attributes.get("thuTucHanhChinhId");

		if (thuTucHanhChinhId != null) {
			setThuTucHanhChinhId(thuTucHanhChinhId);
		}

		Long donViThucHienId = (Long)attributes.get("donViThucHienId");

		if (donViThucHienId != null) {
			setDonViThucHienId(donViThucHienId);
		}

		Long phiNopBanDau = (Long)attributes.get("phiNopBanDau");

		if (phiNopBanDau != null) {
			setPhiNopBanDau(phiNopBanDau);
		}

		String chuyenKhoan = (String)attributes.get("chuyenKhoan");

		if (chuyenKhoan != null) {
			setChuyenKhoan(chuyenKhoan);
		}

		String keyPay = (String)attributes.get("keyPay");

		if (keyPay != null) {
			setKeyPay(keyPay);
		}
	}

	/**
	* Returns the primary key of this tthc hinh thuc nop phi.
	*
	* @return the primary key of this tthc hinh thuc nop phi
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcHinhThucNopPhi.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc hinh thuc nop phi.
	*
	* @param primaryKey the primary key of this tthc hinh thuc nop phi
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcHinhThucNopPhi.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc hinh thuc nop phi.
	*
	* @return the ID of this tthc hinh thuc nop phi
	*/
	@Override
	public long getId() {
		return _tthcHinhThucNopPhi.getId();
	}

	/**
	* Sets the ID of this tthc hinh thuc nop phi.
	*
	* @param id the ID of this tthc hinh thuc nop phi
	*/
	@Override
	public void setId(long id) {
		_tthcHinhThucNopPhi.setId(id);
	}

	/**
	* Returns the thu tuc hanh chinh ID of this tthc hinh thuc nop phi.
	*
	* @return the thu tuc hanh chinh ID of this tthc hinh thuc nop phi
	*/
	@Override
	public long getThuTucHanhChinhId() {
		return _tthcHinhThucNopPhi.getThuTucHanhChinhId();
	}

	/**
	* Sets the thu tuc hanh chinh ID of this tthc hinh thuc nop phi.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID of this tthc hinh thuc nop phi
	*/
	@Override
	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_tthcHinhThucNopPhi.setThuTucHanhChinhId(thuTucHanhChinhId);
	}

	/**
	* Returns the don vi thuc hien ID of this tthc hinh thuc nop phi.
	*
	* @return the don vi thuc hien ID of this tthc hinh thuc nop phi
	*/
	@Override
	public long getDonViThucHienId() {
		return _tthcHinhThucNopPhi.getDonViThucHienId();
	}

	/**
	* Sets the don vi thuc hien ID of this tthc hinh thuc nop phi.
	*
	* @param donViThucHienId the don vi thuc hien ID of this tthc hinh thuc nop phi
	*/
	@Override
	public void setDonViThucHienId(long donViThucHienId) {
		_tthcHinhThucNopPhi.setDonViThucHienId(donViThucHienId);
	}

	/**
	* Returns the phi nop ban dau of this tthc hinh thuc nop phi.
	*
	* @return the phi nop ban dau of this tthc hinh thuc nop phi
	*/
	@Override
	public long getPhiNopBanDau() {
		return _tthcHinhThucNopPhi.getPhiNopBanDau();
	}

	/**
	* Sets the phi nop ban dau of this tthc hinh thuc nop phi.
	*
	* @param phiNopBanDau the phi nop ban dau of this tthc hinh thuc nop phi
	*/
	@Override
	public void setPhiNopBanDau(long phiNopBanDau) {
		_tthcHinhThucNopPhi.setPhiNopBanDau(phiNopBanDau);
	}

	/**
	* Returns the chuyen khoan of this tthc hinh thuc nop phi.
	*
	* @return the chuyen khoan of this tthc hinh thuc nop phi
	*/
	@Override
	public java.lang.String getChuyenKhoan() {
		return _tthcHinhThucNopPhi.getChuyenKhoan();
	}

	/**
	* Sets the chuyen khoan of this tthc hinh thuc nop phi.
	*
	* @param chuyenKhoan the chuyen khoan of this tthc hinh thuc nop phi
	*/
	@Override
	public void setChuyenKhoan(java.lang.String chuyenKhoan) {
		_tthcHinhThucNopPhi.setChuyenKhoan(chuyenKhoan);
	}

	/**
	* Returns the key pay of this tthc hinh thuc nop phi.
	*
	* @return the key pay of this tthc hinh thuc nop phi
	*/
	@Override
	public java.lang.String getKeyPay() {
		return _tthcHinhThucNopPhi.getKeyPay();
	}

	/**
	* Sets the key pay of this tthc hinh thuc nop phi.
	*
	* @param keyPay the key pay of this tthc hinh thuc nop phi
	*/
	@Override
	public void setKeyPay(java.lang.String keyPay) {
		_tthcHinhThucNopPhi.setKeyPay(keyPay);
	}

	@Override
	public boolean isNew() {
		return _tthcHinhThucNopPhi.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcHinhThucNopPhi.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcHinhThucNopPhi.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcHinhThucNopPhi.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcHinhThucNopPhi.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcHinhThucNopPhi.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcHinhThucNopPhi.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcHinhThucNopPhi.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcHinhThucNopPhi.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcHinhThucNopPhi.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcHinhThucNopPhi.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcHinhThucNopPhiWrapper((TthcHinhThucNopPhi)_tthcHinhThucNopPhi.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi tthcHinhThucNopPhi) {
		return _tthcHinhThucNopPhi.compareTo(tthcHinhThucNopPhi);
	}

	@Override
	public int hashCode() {
		return _tthcHinhThucNopPhi.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi> toCacheModel() {
		return _tthcHinhThucNopPhi.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi toEscapedModel() {
		return new TthcHinhThucNopPhiWrapper(_tthcHinhThucNopPhi.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi toUnescapedModel() {
		return new TthcHinhThucNopPhiWrapper(_tthcHinhThucNopPhi.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcHinhThucNopPhi.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcHinhThucNopPhi.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcHinhThucNopPhi.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcHinhThucNopPhiWrapper)) {
			return false;
		}

		TthcHinhThucNopPhiWrapper tthcHinhThucNopPhiWrapper = (TthcHinhThucNopPhiWrapper)obj;

		if (Validator.equals(_tthcHinhThucNopPhi,
					tthcHinhThucNopPhiWrapper._tthcHinhThucNopPhi)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcHinhThucNopPhi getWrappedTthcHinhThucNopPhi() {
		return _tthcHinhThucNopPhi;
	}

	@Override
	public TthcHinhThucNopPhi getWrappedModel() {
		return _tthcHinhThucNopPhi;
	}

	@Override
	public void resetOriginalValues() {
		_tthcHinhThucNopPhi.resetOriginalValues();
	}

	private TthcHinhThucNopPhi _tthcHinhThucNopPhi;
}