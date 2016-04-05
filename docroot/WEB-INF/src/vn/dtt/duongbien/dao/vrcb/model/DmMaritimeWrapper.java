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
 * This class is a wrapper for {@link DmMaritime}.
 * </p>
 *
 * @author longdm
 * @see DmMaritime
 * @generated
 */
public class DmMaritimeWrapper implements DmMaritime, ModelWrapper<DmMaritime> {
	public DmMaritimeWrapper(DmMaritime dmMaritime) {
		_dmMaritime = dmMaritime;
	}

	@Override
	public Class<?> getModelClass() {
		return DmMaritime.class;
	}

	@Override
	public String getModelClassName() {
		return DmMaritime.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maritimeCode", getMaritimeCode());
		attributes.put("maritimeReference", getMaritimeReference());
		attributes.put("maritimeOrder", getMaritimeOrder());
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

		Integer maritimeOrder = (Integer)attributes.get("maritimeOrder");

		if (maritimeOrder != null) {
			setMaritimeOrder(maritimeOrder);
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
	* Returns the primary key of this dm maritime.
	*
	* @return the primary key of this dm maritime
	*/
	@Override
	public int getPrimaryKey() {
		return _dmMaritime.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm maritime.
	*
	* @param primaryKey the primary key of this dm maritime
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmMaritime.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm maritime.
	*
	* @return the ID of this dm maritime
	*/
	@Override
	public int getId() {
		return _dmMaritime.getId();
	}

	/**
	* Sets the ID of this dm maritime.
	*
	* @param id the ID of this dm maritime
	*/
	@Override
	public void setId(int id) {
		_dmMaritime.setId(id);
	}

	/**
	* Returns the maritime code of this dm maritime.
	*
	* @return the maritime code of this dm maritime
	*/
	@Override
	public java.lang.String getMaritimeCode() {
		return _dmMaritime.getMaritimeCode();
	}

	/**
	* Sets the maritime code of this dm maritime.
	*
	* @param maritimeCode the maritime code of this dm maritime
	*/
	@Override
	public void setMaritimeCode(java.lang.String maritimeCode) {
		_dmMaritime.setMaritimeCode(maritimeCode);
	}

	/**
	* Returns the maritime reference of this dm maritime.
	*
	* @return the maritime reference of this dm maritime
	*/
	@Override
	public java.lang.String getMaritimeReference() {
		return _dmMaritime.getMaritimeReference();
	}

	/**
	* Sets the maritime reference of this dm maritime.
	*
	* @param maritimeReference the maritime reference of this dm maritime
	*/
	@Override
	public void setMaritimeReference(java.lang.String maritimeReference) {
		_dmMaritime.setMaritimeReference(maritimeReference);
	}

	/**
	* Returns the maritime order of this dm maritime.
	*
	* @return the maritime order of this dm maritime
	*/
	@Override
	public int getMaritimeOrder() {
		return _dmMaritime.getMaritimeOrder();
	}

	/**
	* Sets the maritime order of this dm maritime.
	*
	* @param maritimeOrder the maritime order of this dm maritime
	*/
	@Override
	public void setMaritimeOrder(int maritimeOrder) {
		_dmMaritime.setMaritimeOrder(maritimeOrder);
	}

	/**
	* Returns the maritime name of this dm maritime.
	*
	* @return the maritime name of this dm maritime
	*/
	@Override
	public java.lang.String getMaritimeName() {
		return _dmMaritime.getMaritimeName();
	}

	/**
	* Sets the maritime name of this dm maritime.
	*
	* @param maritimeName the maritime name of this dm maritime
	*/
	@Override
	public void setMaritimeName(java.lang.String maritimeName) {
		_dmMaritime.setMaritimeName(maritimeName);
	}

	/**
	* Returns the maritime name v n of this dm maritime.
	*
	* @return the maritime name v n of this dm maritime
	*/
	@Override
	public java.lang.String getMaritimeNameVN() {
		return _dmMaritime.getMaritimeNameVN();
	}

	/**
	* Sets the maritime name v n of this dm maritime.
	*
	* @param maritimeNameVN the maritime name v n of this dm maritime
	*/
	@Override
	public void setMaritimeNameVN(java.lang.String maritimeNameVN) {
		_dmMaritime.setMaritimeNameVN(maritimeNameVN);
	}

	/**
	* Returns the address of this dm maritime.
	*
	* @return the address of this dm maritime
	*/
	@Override
	public java.lang.String getAddress() {
		return _dmMaritime.getAddress();
	}

	/**
	* Sets the address of this dm maritime.
	*
	* @param address the address of this dm maritime
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_dmMaritime.setAddress(address);
	}

	/**
	* Returns the address v n of this dm maritime.
	*
	* @return the address v n of this dm maritime
	*/
	@Override
	public java.lang.String getAddressVN() {
		return _dmMaritime.getAddressVN();
	}

	/**
	* Sets the address v n of this dm maritime.
	*
	* @param addressVN the address v n of this dm maritime
	*/
	@Override
	public void setAddressVN(java.lang.String addressVN) {
		_dmMaritime.setAddressVN(addressVN);
	}

	/**
	* Returns the state code of this dm maritime.
	*
	* @return the state code of this dm maritime
	*/
	@Override
	public java.lang.String getStateCode() {
		return _dmMaritime.getStateCode();
	}

	/**
	* Sets the state code of this dm maritime.
	*
	* @param stateCode the state code of this dm maritime
	*/
	@Override
	public void setStateCode(java.lang.String stateCode) {
		_dmMaritime.setStateCode(stateCode);
	}

	/**
	* Returns the citycode of this dm maritime.
	*
	* @return the citycode of this dm maritime
	*/
	@Override
	public java.lang.String getCitycode() {
		return _dmMaritime.getCitycode();
	}

	/**
	* Sets the citycode of this dm maritime.
	*
	* @param citycode the citycode of this dm maritime
	*/
	@Override
	public void setCitycode(java.lang.String citycode) {
		_dmMaritime.setCitycode(citycode);
	}

	/**
	* Returns the is delete of this dm maritime.
	*
	* @return the is delete of this dm maritime
	*/
	@Override
	public int getIsDelete() {
		return _dmMaritime.getIsDelete();
	}

	/**
	* Sets the is delete of this dm maritime.
	*
	* @param isDelete the is delete of this dm maritime
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmMaritime.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm maritime.
	*
	* @return the marked as delete of this dm maritime
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmMaritime.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm maritime.
	*
	* @param markedAsDelete the marked as delete of this dm maritime
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmMaritime.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm maritime.
	*
	* @return the modified date of this dm maritime
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmMaritime.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm maritime.
	*
	* @param modifiedDate the modified date of this dm maritime
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmMaritime.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm maritime.
	*
	* @return the requested date of this dm maritime
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmMaritime.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm maritime.
	*
	* @param requestedDate the requested date of this dm maritime
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmMaritime.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm maritime.
	*
	* @return the sync version of this dm maritime
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmMaritime.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm maritime.
	*
	* @param syncVersion the sync version of this dm maritime
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmMaritime.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmMaritime.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmMaritime.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmMaritime.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmMaritime.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmMaritime.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmMaritime.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmMaritime.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmMaritime.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmMaritime.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmMaritime.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmMaritime.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmMaritimeWrapper((DmMaritime)_dmMaritime.clone());
	}

	@Override
	public int compareTo(vn.dtt.duongbien.dao.vrcb.model.DmMaritime dmMaritime) {
		return _dmMaritime.compareTo(dmMaritime);
	}

	@Override
	public int hashCode() {
		return _dmMaritime.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmMaritime> toCacheModel() {
		return _dmMaritime.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmMaritime toEscapedModel() {
		return new DmMaritimeWrapper(_dmMaritime.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmMaritime toUnescapedModel() {
		return new DmMaritimeWrapper(_dmMaritime.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmMaritime.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmMaritime.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmMaritime.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmMaritimeWrapper)) {
			return false;
		}

		DmMaritimeWrapper dmMaritimeWrapper = (DmMaritimeWrapper)obj;

		if (Validator.equals(_dmMaritime, dmMaritimeWrapper._dmMaritime)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmMaritime getWrappedDmMaritime() {
		return _dmMaritime;
	}

	@Override
	public DmMaritime getWrappedModel() {
		return _dmMaritime;
	}

	@Override
	public void resetOriginalValues() {
		_dmMaritime.resetOriginalValues();
	}

	private DmMaritime _dmMaritime;
}