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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DmHistoryMaritime}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryMaritime
 * @generated
 */
public class DmHistoryMaritimeWrapper implements DmHistoryMaritime,
	ModelWrapper<DmHistoryMaritime> {
	public DmHistoryMaritimeWrapper(DmHistoryMaritime dmHistoryMaritime) {
		_dmHistoryMaritime = dmHistoryMaritime;
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryMaritime.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryMaritime.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maritimeCode", getMaritimeCode());
		attributes.put("maritimeReference", getMaritimeReference());
		attributes.put("maritimeName", getMaritimeName());
		attributes.put("maritimeNameVN", getMaritimeNameVN());
		attributes.put("address", getAddress());
		attributes.put("addressVN", getAddressVN());
		attributes.put("stateCode", getStateCode());
		attributes.put("citycode", getCitycode());
		attributes.put("isDelete", getIsDelete());
		attributes.put("markedAsDelete", getMarkedAsDelete());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("syncVersion", getSyncVersion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maritimeCode = (String)attributes.get("maritimeCode");

		if (maritimeCode != null) {
			setMaritimeCode(maritimeCode);
		}

		String maritimeReference = (String)attributes.get("maritimeReference");

		if (maritimeReference != null) {
			setMaritimeReference(maritimeReference);
		}

		String maritimeName = (String)attributes.get("maritimeName");

		if (maritimeName != null) {
			setMaritimeName(maritimeName);
		}

		String maritimeNameVN = (String)attributes.get("maritimeNameVN");

		if (maritimeNameVN != null) {
			setMaritimeNameVN(maritimeNameVN);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String addressVN = (String)attributes.get("addressVN");

		if (addressVN != null) {
			setAddressVN(addressVN);
		}

		String stateCode = (String)attributes.get("stateCode");

		if (stateCode != null) {
			setStateCode(stateCode);
		}

		String citycode = (String)attributes.get("citycode");

		if (citycode != null) {
			setCitycode(citycode);
		}

		Integer isDelete = (Integer)attributes.get("isDelete");

		if (isDelete != null) {
			setIsDelete(isDelete);
		}

		Integer markedAsDelete = (Integer)attributes.get("markedAsDelete");

		if (markedAsDelete != null) {
			setMarkedAsDelete(markedAsDelete);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Date requestedDate = (Date)attributes.get("requestedDate");

		if (requestedDate != null) {
			setRequestedDate(requestedDate);
		}

		String syncVersion = (String)attributes.get("syncVersion");

		if (syncVersion != null) {
			setSyncVersion(syncVersion);
		}
	}

	/**
	* Returns the primary key of this dm history maritime.
	*
	* @return the primary key of this dm history maritime
	*/
	@Override
	public int getPrimaryKey() {
		return _dmHistoryMaritime.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history maritime.
	*
	* @param primaryKey the primary key of this dm history maritime
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryMaritime.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history maritime.
	*
	* @return the ID of this dm history maritime
	*/
	@Override
	public int getId() {
		return _dmHistoryMaritime.getId();
	}

	/**
	* Sets the ID of this dm history maritime.
	*
	* @param id the ID of this dm history maritime
	*/
	@Override
	public void setId(int id) {
		_dmHistoryMaritime.setId(id);
	}

	/**
	* Returns the maritime code of this dm history maritime.
	*
	* @return the maritime code of this dm history maritime
	*/
	@Override
	public java.lang.String getMaritimeCode() {
		return _dmHistoryMaritime.getMaritimeCode();
	}

	/**
	* Sets the maritime code of this dm history maritime.
	*
	* @param maritimeCode the maritime code of this dm history maritime
	*/
	@Override
	public void setMaritimeCode(java.lang.String maritimeCode) {
		_dmHistoryMaritime.setMaritimeCode(maritimeCode);
	}

	/**
	* Returns the maritime reference of this dm history maritime.
	*
	* @return the maritime reference of this dm history maritime
	*/
	@Override
	public java.lang.String getMaritimeReference() {
		return _dmHistoryMaritime.getMaritimeReference();
	}

	/**
	* Sets the maritime reference of this dm history maritime.
	*
	* @param maritimeReference the maritime reference of this dm history maritime
	*/
	@Override
	public void setMaritimeReference(java.lang.String maritimeReference) {
		_dmHistoryMaritime.setMaritimeReference(maritimeReference);
	}

	/**
	* Returns the maritime name of this dm history maritime.
	*
	* @return the maritime name of this dm history maritime
	*/
	@Override
	public java.lang.String getMaritimeName() {
		return _dmHistoryMaritime.getMaritimeName();
	}

	/**
	* Sets the maritime name of this dm history maritime.
	*
	* @param maritimeName the maritime name of this dm history maritime
	*/
	@Override
	public void setMaritimeName(java.lang.String maritimeName) {
		_dmHistoryMaritime.setMaritimeName(maritimeName);
	}

	/**
	* Returns the maritime name v n of this dm history maritime.
	*
	* @return the maritime name v n of this dm history maritime
	*/
	@Override
	public java.lang.String getMaritimeNameVN() {
		return _dmHistoryMaritime.getMaritimeNameVN();
	}

	/**
	* Sets the maritime name v n of this dm history maritime.
	*
	* @param maritimeNameVN the maritime name v n of this dm history maritime
	*/
	@Override
	public void setMaritimeNameVN(java.lang.String maritimeNameVN) {
		_dmHistoryMaritime.setMaritimeNameVN(maritimeNameVN);
	}

	/**
	* Returns the address of this dm history maritime.
	*
	* @return the address of this dm history maritime
	*/
	@Override
	public java.lang.String getAddress() {
		return _dmHistoryMaritime.getAddress();
	}

	/**
	* Sets the address of this dm history maritime.
	*
	* @param address the address of this dm history maritime
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_dmHistoryMaritime.setAddress(address);
	}

	/**
	* Returns the address v n of this dm history maritime.
	*
	* @return the address v n of this dm history maritime
	*/
	@Override
	public java.lang.String getAddressVN() {
		return _dmHistoryMaritime.getAddressVN();
	}

	/**
	* Sets the address v n of this dm history maritime.
	*
	* @param addressVN the address v n of this dm history maritime
	*/
	@Override
	public void setAddressVN(java.lang.String addressVN) {
		_dmHistoryMaritime.setAddressVN(addressVN);
	}

	/**
	* Returns the state code of this dm history maritime.
	*
	* @return the state code of this dm history maritime
	*/
	@Override
	public java.lang.String getStateCode() {
		return _dmHistoryMaritime.getStateCode();
	}

	/**
	* Sets the state code of this dm history maritime.
	*
	* @param stateCode the state code of this dm history maritime
	*/
	@Override
	public void setStateCode(java.lang.String stateCode) {
		_dmHistoryMaritime.setStateCode(stateCode);
	}

	/**
	* Returns the citycode of this dm history maritime.
	*
	* @return the citycode of this dm history maritime
	*/
	@Override
	public java.lang.String getCitycode() {
		return _dmHistoryMaritime.getCitycode();
	}

	/**
	* Sets the citycode of this dm history maritime.
	*
	* @param citycode the citycode of this dm history maritime
	*/
	@Override
	public void setCitycode(java.lang.String citycode) {
		_dmHistoryMaritime.setCitycode(citycode);
	}

	/**
	* Returns the is delete of this dm history maritime.
	*
	* @return the is delete of this dm history maritime
	*/
	@Override
	public int getIsDelete() {
		return _dmHistoryMaritime.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history maritime.
	*
	* @param isDelete the is delete of this dm history maritime
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmHistoryMaritime.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history maritime.
	*
	* @return the marked as delete of this dm history maritime
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmHistoryMaritime.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history maritime.
	*
	* @param markedAsDelete the marked as delete of this dm history maritime
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryMaritime.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history maritime.
	*
	* @return the modified date of this dm history maritime
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmHistoryMaritime.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history maritime.
	*
	* @param modifiedDate the modified date of this dm history maritime
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryMaritime.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history maritime.
	*
	* @return the requested date of this dm history maritime
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmHistoryMaritime.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history maritime.
	*
	* @param requestedDate the requested date of this dm history maritime
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryMaritime.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history maritime.
	*
	* @return the sync version of this dm history maritime
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmHistoryMaritime.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history maritime.
	*
	* @param syncVersion the sync version of this dm history maritime
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryMaritime.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmHistoryMaritime.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmHistoryMaritime.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmHistoryMaritime.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmHistoryMaritime.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmHistoryMaritime.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryMaritime.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryMaritime.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryMaritime.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmHistoryMaritime.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmHistoryMaritime.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryMaritime.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryMaritimeWrapper((DmHistoryMaritime)_dmHistoryMaritime.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryMaritime dmHistoryMaritime) {
		return _dmHistoryMaritime.compareTo(dmHistoryMaritime);
	}

	@Override
	public int hashCode() {
		return _dmHistoryMaritime.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmHistoryMaritime> toCacheModel() {
		return _dmHistoryMaritime.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryMaritime toEscapedModel() {
		return new DmHistoryMaritimeWrapper(_dmHistoryMaritime.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryMaritime toUnescapedModel() {
		return new DmHistoryMaritimeWrapper(_dmHistoryMaritime.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryMaritime.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmHistoryMaritime.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryMaritime.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmHistoryMaritimeWrapper)) {
			return false;
		}

		DmHistoryMaritimeWrapper dmHistoryMaritimeWrapper = (DmHistoryMaritimeWrapper)obj;

		if (Validator.equals(_dmHistoryMaritime,
					dmHistoryMaritimeWrapper._dmHistoryMaritime)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmHistoryMaritime getWrappedDmHistoryMaritime() {
		return _dmHistoryMaritime;
	}

	@Override
	public DmHistoryMaritime getWrappedModel() {
		return _dmHistoryMaritime;
	}

	@Override
	public void resetOriginalValues() {
		_dmHistoryMaritime.resetOriginalValues();
	}

	private DmHistoryMaritime _dmHistoryMaritime;
}