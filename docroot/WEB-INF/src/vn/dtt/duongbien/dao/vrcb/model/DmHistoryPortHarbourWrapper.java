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
 * This class is a wrapper for {@link DmHistoryPortHarbour}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryPortHarbour
 * @generated
 */
public class DmHistoryPortHarbourWrapper implements DmHistoryPortHarbour,
	ModelWrapper<DmHistoryPortHarbour> {
	public DmHistoryPortHarbourWrapper(
		DmHistoryPortHarbour dmHistoryPortHarbour) {
		_dmHistoryPortHarbour = dmHistoryPortHarbour;
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryPortHarbour.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryPortHarbour.class.getName();
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
	* Returns the primary key of this dm history port harbour.
	*
	* @return the primary key of this dm history port harbour
	*/
	@Override
	public int getPrimaryKey() {
		return _dmHistoryPortHarbour.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history port harbour.
	*
	* @param primaryKey the primary key of this dm history port harbour
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryPortHarbour.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history port harbour.
	*
	* @return the ID of this dm history port harbour
	*/
	@Override
	public int getId() {
		return _dmHistoryPortHarbour.getId();
	}

	/**
	* Sets the ID of this dm history port harbour.
	*
	* @param id the ID of this dm history port harbour
	*/
	@Override
	public void setId(int id) {
		_dmHistoryPortHarbour.setId(id);
	}

	/**
	* Returns the port harbour code of this dm history port harbour.
	*
	* @return the port harbour code of this dm history port harbour
	*/
	@Override
	public java.lang.String getPortHarbourCode() {
		return _dmHistoryPortHarbour.getPortHarbourCode();
	}

	/**
	* Sets the port harbour code of this dm history port harbour.
	*
	* @param portHarbourCode the port harbour code of this dm history port harbour
	*/
	@Override
	public void setPortHarbourCode(java.lang.String portHarbourCode) {
		_dmHistoryPortHarbour.setPortHarbourCode(portHarbourCode);
	}

	/**
	* Returns the port harbour name of this dm history port harbour.
	*
	* @return the port harbour name of this dm history port harbour
	*/
	@Override
	public java.lang.String getPortHarbourName() {
		return _dmHistoryPortHarbour.getPortHarbourName();
	}

	/**
	* Sets the port harbour name of this dm history port harbour.
	*
	* @param portHarbourName the port harbour name of this dm history port harbour
	*/
	@Override
	public void setPortHarbourName(java.lang.String portHarbourName) {
		_dmHistoryPortHarbour.setPortHarbourName(portHarbourName);
	}

	/**
	* Returns the port harbour name v n of this dm history port harbour.
	*
	* @return the port harbour name v n of this dm history port harbour
	*/
	@Override
	public java.lang.String getPortHarbourNameVN() {
		return _dmHistoryPortHarbour.getPortHarbourNameVN();
	}

	/**
	* Sets the port harbour name v n of this dm history port harbour.
	*
	* @param portHarbourNameVN the port harbour name v n of this dm history port harbour
	*/
	@Override
	public void setPortHarbourNameVN(java.lang.String portHarbourNameVN) {
		_dmHistoryPortHarbour.setPortHarbourNameVN(portHarbourNameVN);
	}

	/**
	* Returns the port harbour type of this dm history port harbour.
	*
	* @return the port harbour type of this dm history port harbour
	*/
	@Override
	public int getPortHarbourType() {
		return _dmHistoryPortHarbour.getPortHarbourType();
	}

	/**
	* Sets the port harbour type of this dm history port harbour.
	*
	* @param portHarbourType the port harbour type of this dm history port harbour
	*/
	@Override
	public void setPortHarbourType(int portHarbourType) {
		_dmHistoryPortHarbour.setPortHarbourType(portHarbourType);
	}

	/**
	* Returns the port code of this dm history port harbour.
	*
	* @return the port code of this dm history port harbour
	*/
	@Override
	public java.lang.String getPortCode() {
		return _dmHistoryPortHarbour.getPortCode();
	}

	/**
	* Sets the port code of this dm history port harbour.
	*
	* @param portCode the port code of this dm history port harbour
	*/
	@Override
	public void setPortCode(java.lang.String portCode) {
		_dmHistoryPortHarbour.setPortCode(portCode);
	}

	/**
	* Returns the port region code of this dm history port harbour.
	*
	* @return the port region code of this dm history port harbour
	*/
	@Override
	public java.lang.String getPortRegionCode() {
		return _dmHistoryPortHarbour.getPortRegionCode();
	}

	/**
	* Sets the port region code of this dm history port harbour.
	*
	* @param portRegionCode the port region code of this dm history port harbour
	*/
	@Override
	public void setPortRegionCode(java.lang.String portRegionCode) {
		_dmHistoryPortHarbour.setPortRegionCode(portRegionCode);
	}

	/**
	* Returns the note of this dm history port harbour.
	*
	* @return the note of this dm history port harbour
	*/
	@Override
	public java.lang.String getNote() {
		return _dmHistoryPortHarbour.getNote();
	}

	/**
	* Sets the note of this dm history port harbour.
	*
	* @param note the note of this dm history port harbour
	*/
	@Override
	public void setNote(java.lang.String note) {
		_dmHistoryPortHarbour.setNote(note);
	}

	/**
	* Returns the is delete of this dm history port harbour.
	*
	* @return the is delete of this dm history port harbour
	*/
	@Override
	public int getIsDelete() {
		return _dmHistoryPortHarbour.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history port harbour.
	*
	* @param isDelete the is delete of this dm history port harbour
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmHistoryPortHarbour.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history port harbour.
	*
	* @return the marked as delete of this dm history port harbour
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmHistoryPortHarbour.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history port harbour.
	*
	* @param markedAsDelete the marked as delete of this dm history port harbour
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryPortHarbour.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history port harbour.
	*
	* @return the modified date of this dm history port harbour
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmHistoryPortHarbour.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history port harbour.
	*
	* @param modifiedDate the modified date of this dm history port harbour
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryPortHarbour.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history port harbour.
	*
	* @return the requested date of this dm history port harbour
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmHistoryPortHarbour.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history port harbour.
	*
	* @param requestedDate the requested date of this dm history port harbour
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryPortHarbour.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history port harbour.
	*
	* @return the sync version of this dm history port harbour
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmHistoryPortHarbour.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history port harbour.
	*
	* @param syncVersion the sync version of this dm history port harbour
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryPortHarbour.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmHistoryPortHarbour.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmHistoryPortHarbour.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmHistoryPortHarbour.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmHistoryPortHarbour.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmHistoryPortHarbour.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryPortHarbour.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryPortHarbour.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryPortHarbour.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmHistoryPortHarbour.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmHistoryPortHarbour.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryPortHarbour.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryPortHarbourWrapper((DmHistoryPortHarbour)_dmHistoryPortHarbour.clone());
	}

	@Override
	public int compareTo(DmHistoryPortHarbour dmHistoryPortHarbour) {
		return _dmHistoryPortHarbour.compareTo(dmHistoryPortHarbour);
	}

	@Override
	public int hashCode() {
		return _dmHistoryPortHarbour.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<DmHistoryPortHarbour> toCacheModel() {
		return _dmHistoryPortHarbour.toCacheModel();
	}

	@Override
	public DmHistoryPortHarbour toEscapedModel() {
		return new DmHistoryPortHarbourWrapper(_dmHistoryPortHarbour.toEscapedModel());
	}

	@Override
	public DmHistoryPortHarbour toUnescapedModel() {
		return new DmHistoryPortHarbourWrapper(_dmHistoryPortHarbour.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryPortHarbour.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmHistoryPortHarbour.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryPortHarbour.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmHistoryPortHarbourWrapper)) {
			return false;
		}

		DmHistoryPortHarbourWrapper dmHistoryPortHarbourWrapper = (DmHistoryPortHarbourWrapper)obj;

		if (Validator.equals(_dmHistoryPortHarbour,
					dmHistoryPortHarbourWrapper._dmHistoryPortHarbour)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmHistoryPortHarbour getWrappedDmHistoryPortHarbour() {
		return _dmHistoryPortHarbour;
	}

	@Override
	public DmHistoryPortHarbour getWrappedModel() {
		return _dmHistoryPortHarbour;
	}

	@Override
	public void resetOriginalValues() {
		_dmHistoryPortHarbour.resetOriginalValues();
	}

	private DmHistoryPortHarbour _dmHistoryPortHarbour;
}