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

package vn.dtt.duongbo.dao.motcua.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MotCuaNhanTraHoSo}.
 * </p>
 *
 * @author win_64
 * @see MotCuaNhanTraHoSo
 * @generated
 */
public class MotCuaNhanTraHoSoWrapper implements MotCuaNhanTraHoSo,
	ModelWrapper<MotCuaNhanTraHoSo> {
	public MotCuaNhanTraHoSoWrapper(MotCuaNhanTraHoSo motCuaNhanTraHoSo) {
		_motCuaNhanTraHoSo = motCuaNhanTraHoSo;
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaNhanTraHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaNhanTraHoSo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("tenNguoiNop", getTenNguoiNop());
		attributes.put("cmndNguoiNop", getCmndNguoiNop());
		attributes.put("diaChiNguoiNop", getDiaChiNguoiNop());
		attributes.put("soDienThoaiNguoiNop", getSoDienThoaiNguoiNop());
		attributes.put("emailNguoiNop", getEmailNguoiNop());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		String tenNguoiNop = (String)attributes.get("tenNguoiNop");

		if (tenNguoiNop != null) {
			setTenNguoiNop(tenNguoiNop);
		}

		String cmndNguoiNop = (String)attributes.get("cmndNguoiNop");

		if (cmndNguoiNop != null) {
			setCmndNguoiNop(cmndNguoiNop);
		}

		String diaChiNguoiNop = (String)attributes.get("diaChiNguoiNop");

		if (diaChiNguoiNop != null) {
			setDiaChiNguoiNop(diaChiNguoiNop);
		}

		String soDienThoaiNguoiNop = (String)attributes.get(
				"soDienThoaiNguoiNop");

		if (soDienThoaiNguoiNop != null) {
			setSoDienThoaiNguoiNop(soDienThoaiNguoiNop);
		}

		String emailNguoiNop = (String)attributes.get("emailNguoiNop");

		if (emailNguoiNop != null) {
			setEmailNguoiNop(emailNguoiNop);
		}
	}

	/**
	* Returns the primary key of this mot cua nhan tra ho so.
	*
	* @return the primary key of this mot cua nhan tra ho so
	*/
	@Override
	public long getPrimaryKey() {
		return _motCuaNhanTraHoSo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this mot cua nhan tra ho so.
	*
	* @param primaryKey the primary key of this mot cua nhan tra ho so
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_motCuaNhanTraHoSo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this mot cua nhan tra ho so.
	*
	* @return the ID of this mot cua nhan tra ho so
	*/
	@Override
	public long getId() {
		return _motCuaNhanTraHoSo.getId();
	}

	/**
	* Sets the ID of this mot cua nhan tra ho so.
	*
	* @param id the ID of this mot cua nhan tra ho so
	*/
	@Override
	public void setId(long id) {
		_motCuaNhanTraHoSo.setId(id);
	}

	/**
	* Returns the ho so thu tuc ID of this mot cua nhan tra ho so.
	*
	* @return the ho so thu tuc ID of this mot cua nhan tra ho so
	*/
	@Override
	public long getHoSoThuTucId() {
		return _motCuaNhanTraHoSo.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this mot cua nhan tra ho so.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this mot cua nhan tra ho so
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_motCuaNhanTraHoSo.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the ten nguoi nop of this mot cua nhan tra ho so.
	*
	* @return the ten nguoi nop of this mot cua nhan tra ho so
	*/
	@Override
	public java.lang.String getTenNguoiNop() {
		return _motCuaNhanTraHoSo.getTenNguoiNop();
	}

	/**
	* Sets the ten nguoi nop of this mot cua nhan tra ho so.
	*
	* @param tenNguoiNop the ten nguoi nop of this mot cua nhan tra ho so
	*/
	@Override
	public void setTenNguoiNop(java.lang.String tenNguoiNop) {
		_motCuaNhanTraHoSo.setTenNguoiNop(tenNguoiNop);
	}

	/**
	* Returns the cmnd nguoi nop of this mot cua nhan tra ho so.
	*
	* @return the cmnd nguoi nop of this mot cua nhan tra ho so
	*/
	@Override
	public java.lang.String getCmndNguoiNop() {
		return _motCuaNhanTraHoSo.getCmndNguoiNop();
	}

	/**
	* Sets the cmnd nguoi nop of this mot cua nhan tra ho so.
	*
	* @param cmndNguoiNop the cmnd nguoi nop of this mot cua nhan tra ho so
	*/
	@Override
	public void setCmndNguoiNop(java.lang.String cmndNguoiNop) {
		_motCuaNhanTraHoSo.setCmndNguoiNop(cmndNguoiNop);
	}

	/**
	* Returns the dia chi nguoi nop of this mot cua nhan tra ho so.
	*
	* @return the dia chi nguoi nop of this mot cua nhan tra ho so
	*/
	@Override
	public java.lang.String getDiaChiNguoiNop() {
		return _motCuaNhanTraHoSo.getDiaChiNguoiNop();
	}

	/**
	* Sets the dia chi nguoi nop of this mot cua nhan tra ho so.
	*
	* @param diaChiNguoiNop the dia chi nguoi nop of this mot cua nhan tra ho so
	*/
	@Override
	public void setDiaChiNguoiNop(java.lang.String diaChiNguoiNop) {
		_motCuaNhanTraHoSo.setDiaChiNguoiNop(diaChiNguoiNop);
	}

	/**
	* Returns the so dien thoai nguoi nop of this mot cua nhan tra ho so.
	*
	* @return the so dien thoai nguoi nop of this mot cua nhan tra ho so
	*/
	@Override
	public java.lang.String getSoDienThoaiNguoiNop() {
		return _motCuaNhanTraHoSo.getSoDienThoaiNguoiNop();
	}

	/**
	* Sets the so dien thoai nguoi nop of this mot cua nhan tra ho so.
	*
	* @param soDienThoaiNguoiNop the so dien thoai nguoi nop of this mot cua nhan tra ho so
	*/
	@Override
	public void setSoDienThoaiNguoiNop(java.lang.String soDienThoaiNguoiNop) {
		_motCuaNhanTraHoSo.setSoDienThoaiNguoiNop(soDienThoaiNguoiNop);
	}

	/**
	* Returns the email nguoi nop of this mot cua nhan tra ho so.
	*
	* @return the email nguoi nop of this mot cua nhan tra ho so
	*/
	@Override
	public java.lang.String getEmailNguoiNop() {
		return _motCuaNhanTraHoSo.getEmailNguoiNop();
	}

	/**
	* Sets the email nguoi nop of this mot cua nhan tra ho so.
	*
	* @param emailNguoiNop the email nguoi nop of this mot cua nhan tra ho so
	*/
	@Override
	public void setEmailNguoiNop(java.lang.String emailNguoiNop) {
		_motCuaNhanTraHoSo.setEmailNguoiNop(emailNguoiNop);
	}

	@Override
	public boolean isNew() {
		return _motCuaNhanTraHoSo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_motCuaNhanTraHoSo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _motCuaNhanTraHoSo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_motCuaNhanTraHoSo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _motCuaNhanTraHoSo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _motCuaNhanTraHoSo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_motCuaNhanTraHoSo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _motCuaNhanTraHoSo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_motCuaNhanTraHoSo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_motCuaNhanTraHoSo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_motCuaNhanTraHoSo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MotCuaNhanTraHoSoWrapper((MotCuaNhanTraHoSo)_motCuaNhanTraHoSo.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo motCuaNhanTraHoSo) {
		return _motCuaNhanTraHoSo.compareTo(motCuaNhanTraHoSo);
	}

	@Override
	public int hashCode() {
		return _motCuaNhanTraHoSo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo> toCacheModel() {
		return _motCuaNhanTraHoSo.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo toEscapedModel() {
		return new MotCuaNhanTraHoSoWrapper(_motCuaNhanTraHoSo.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo toUnescapedModel() {
		return new MotCuaNhanTraHoSoWrapper(_motCuaNhanTraHoSo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _motCuaNhanTraHoSo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _motCuaNhanTraHoSo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_motCuaNhanTraHoSo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MotCuaNhanTraHoSoWrapper)) {
			return false;
		}

		MotCuaNhanTraHoSoWrapper motCuaNhanTraHoSoWrapper = (MotCuaNhanTraHoSoWrapper)obj;

		if (Validator.equals(_motCuaNhanTraHoSo,
					motCuaNhanTraHoSoWrapper._motCuaNhanTraHoSo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MotCuaNhanTraHoSo getWrappedMotCuaNhanTraHoSo() {
		return _motCuaNhanTraHoSo;
	}

	@Override
	public MotCuaNhanTraHoSo getWrappedModel() {
		return _motCuaNhanTraHoSo;
	}

	@Override
	public void resetOriginalValues() {
		_motCuaNhanTraHoSo.resetOriginalValues();
	}

	private MotCuaNhanTraHoSo _motCuaNhanTraHoSo;
}