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
 * This class is a wrapper for {@link DmPortHarbour}.
 * </p>
 *
 * @author longdm
 * @see DmPortHarbour
 * @generated
 */
public class DmPortHarbourWrapper implements DmPortHarbour,
	ModelWrapper<DmPortHarbour> {
	public DmPortHarbourWrapper(DmPortHarbour dmPortHarbour) {
		_dmPortHarbour = dmPortHarbour;
	}

	@Override
	public Class<?> getModelClass() {
		return DmPortHarbour.class;
	}

	@Override
	public String getModelClassName() {
		return DmPortHarbour.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("portHarbourCode", getPortHarbourCode());
		attributes.put("portHarbourName", getPortHarbourName());
		attributes.put("portHarbourNameVN", getPortHarbourNameVN());
		attributes.put("portHarbourType", getPortHarbourType());
		attributes.put("portCode", getPortCode());
		attributes.put("portRegionCode", getPortRegionCode());
		attributes.put("note", getNote());
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

		String portHarbourCode = (String)attributes.get("portHarbourCode");

		if (portHarbourCode != null) {
			setPortHarbourCode(portHarbourCode);
		}

		String portHarbourName = (String)attributes.get("portHarbourName");

		if (portHarbourName != null) {
			setPortHarbourName(portHarbourName);
		}

		String portHarbourNameVN = (String)attributes.get("portHarbourNameVN");

		if (portHarbourNameVN != null) {
			setPortHarbourNameVN(portHarbourNameVN);
		}

		Integer portHarbourType = (Integer)attributes.get("portHarbourType");

		if (portHarbourType != null) {
			setPortHarbourType(portHarbourType);
		}

		String portCode = (String)attributes.get("portCode");

		if (portCode != null) {
			setPortCode(portCode);
		}

		String portRegionCode = (String)attributes.get("portRegionCode");

		if (portRegionCode != null) {
			setPortRegionCode(portRegionCode);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
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
	* Returns the primary key of this dm port harbour.
	*
	* @return the primary key of this dm port harbour
	*/
	@Override
	public int getPrimaryKey() {
		return _dmPortHarbour.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm port harbour.
	*
	* @param primaryKey the primary key of this dm port harbour
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmPortHarbour.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm port harbour.
	*
	* @return the ID of this dm port harbour
	*/
	@Override
	public int getId() {
		return _dmPortHarbour.getId();
	}

	/**
	* Sets the ID of this dm port harbour.
	*
	* @param id the ID of this dm port harbour
	*/
	@Override
	public void setId(int id) {
		_dmPortHarbour.setId(id);
	}

	/**
	* Returns the port harbour code of this dm port harbour.
	*
	* @return the port harbour code of this dm port harbour
	*/
	@Override
	public java.lang.String getPortHarbourCode() {
		return _dmPortHarbour.getPortHarbourCode();
	}

	/**
	* Sets the port harbour code of this dm port harbour.
	*
	* @param portHarbourCode the port harbour code of this dm port harbour
	*/
	@Override
	public void setPortHarbourCode(java.lang.String portHarbourCode) {
		_dmPortHarbour.setPortHarbourCode(portHarbourCode);
	}

	/**
	* Returns the port harbour name of this dm port harbour.
	*
	* @return the port harbour name of this dm port harbour
	*/
	@Override
	public java.lang.String getPortHarbourName() {
		return _dmPortHarbour.getPortHarbourName();
	}

	/**
	* Sets the port harbour name of this dm port harbour.
	*
	* @param portHarbourName the port harbour name of this dm port harbour
	*/
	@Override
	public void setPortHarbourName(java.lang.String portHarbourName) {
		_dmPortHarbour.setPortHarbourName(portHarbourName);
	}

	/**
	* Returns the port harbour name v n of this dm port harbour.
	*
	* @return the port harbour name v n of this dm port harbour
	*/
	@Override
	public java.lang.String getPortHarbourNameVN() {
		return _dmPortHarbour.getPortHarbourNameVN();
	}

	/**
	* Sets the port harbour name v n of this dm port harbour.
	*
	* @param portHarbourNameVN the port harbour name v n of this dm port harbour
	*/
	@Override
	public void setPortHarbourNameVN(java.lang.String portHarbourNameVN) {
		_dmPortHarbour.setPortHarbourNameVN(portHarbourNameVN);
	}

	/**
	* Returns the port harbour type of this dm port harbour.
	*
	* @return the port harbour type of this dm port harbour
	*/
	@Override
	public int getPortHarbourType() {
		return _dmPortHarbour.getPortHarbourType();
	}

	/**
	* Sets the port harbour type of this dm port harbour.
	*
	* @param portHarbourType the port harbour type of this dm port harbour
	*/
	@Override
	public void setPortHarbourType(int portHarbourType) {
		_dmPortHarbour.setPortHarbourType(portHarbourType);
	}

	/**
	* Returns the port code of this dm port harbour.
	*
	* @return the port code of this dm port harbour
	*/
	@Override
	public java.lang.String getPortCode() {
		return _dmPortHarbour.getPortCode();
	}

	/**
	* Sets the port code of this dm port harbour.
	*
	* @param portCode the port code of this dm port harbour
	*/
	@Override
	public void setPortCode(java.lang.String portCode) {
		_dmPortHarbour.setPortCode(portCode);
	}

	/**
	* Returns the port region code of this dm port harbour.
	*
	* @return the port region code of this dm port harbour
	*/
	@Override
	public java.lang.String getPortRegionCode() {
		return _dmPortHarbour.getPortRegionCode();
	}

	/**
	* Sets the port region code of this dm port harbour.
	*
	* @param portRegionCode the port region code of this dm port harbour
	*/
	@Override
	public void setPortRegionCode(java.lang.String portRegionCode) {
		_dmPortHarbour.setPortRegionCode(portRegionCode);
	}

	/**
	* Returns the note of this dm port harbour.
	*
	* @return the note of this dm port harbour
	*/
	@Override
	public java.lang.String getNote() {
		return _dmPortHarbour.getNote();
	}

	/**
	* Sets the note of this dm port harbour.
	*
	* @param note the note of this dm port harbour
	*/
	@Override
	public void setNote(java.lang.String note) {
		_dmPortHarbour.setNote(note);
	}

	/**
	* Returns the is delete of this dm port harbour.
	*
	* @return the is delete of this dm port harbour
	*/
	@Override
	public int getIsDelete() {
		return _dmPortHarbour.getIsDelete();
	}

	/**
	* Sets the is delete of this dm port harbour.
	*
	* @param isDelete the is delete of this dm port harbour
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmPortHarbour.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm port harbour.
	*
	* @return the marked as delete of this dm port harbour
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmPortHarbour.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm port harbour.
	*
	* @param markedAsDelete the marked as delete of this dm port harbour
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmPortHarbour.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm port harbour.
	*
	* @return the modified date of this dm port harbour
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmPortHarbour.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm port harbour.
	*
	* @param modifiedDate the modified date of this dm port harbour
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmPortHarbour.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm port harbour.
	*
	* @return the requested date of this dm port harbour
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmPortHarbour.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm port harbour.
	*
	* @param requestedDate the requested date of this dm port harbour
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmPortHarbour.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm port harbour.
	*
	* @return the sync version of this dm port harbour
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmPortHarbour.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm port harbour.
	*
	* @param syncVersion the sync version of this dm port harbour
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmPortHarbour.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmPortHarbour.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmPortHarbour.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmPortHarbour.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmPortHarbour.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmPortHarbour.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmPortHarbour.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmPortHarbour.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmPortHarbour.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmPortHarbour.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmPortHarbour.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmPortHarbour.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmPortHarbourWrapper((DmPortHarbour)_dmPortHarbour.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour dmPortHarbour) {
		return _dmPortHarbour.compareTo(dmPortHarbour);
	}

	@Override
	public int hashCode() {
		return _dmPortHarbour.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour> toCacheModel() {
		return _dmPortHarbour.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour toEscapedModel() {
		return new DmPortHarbourWrapper(_dmPortHarbour.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour toUnescapedModel() {
		return new DmPortHarbourWrapper(_dmPortHarbour.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmPortHarbour.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmPortHarbour.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmPortHarbour.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmPortHarbourWrapper)) {
			return false;
		}

		DmPortHarbourWrapper dmPortHarbourWrapper = (DmPortHarbourWrapper)obj;

		if (Validator.equals(_dmPortHarbour, dmPortHarbourWrapper._dmPortHarbour)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmPortHarbour getWrappedDmPortHarbour() {
		return _dmPortHarbour;
	}

	@Override
	public DmPortHarbour getWrappedModel() {
		return _dmPortHarbour;
	}

	@Override
	public void resetOriginalValues() {
		_dmPortHarbour.resetOriginalValues();
	}

	private DmPortHarbour _dmPortHarbour;
}