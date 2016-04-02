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
 * This class is a wrapper for {@link DmPortWharf}.
 * </p>
 *
 * @author longdm
 * @see DmPortWharf
 * @generated
 */
public class DmPortWharfWrapper implements DmPortWharf,
	ModelWrapper<DmPortWharf> {
	public DmPortWharfWrapper(DmPortWharf dmPortWharf) {
		_dmPortWharf = dmPortWharf;
	}

	@Override
	public Class<?> getModelClass() {
		return DmPortWharf.class;
	}

	@Override
	public String getModelClassName() {
		return DmPortWharf.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("portWharfCode", getPortWharfCode());
		attributes.put("portWharfName", getPortWharfName());
		attributes.put("portWharfNameVN", getPortWharfNameVN());
		attributes.put("portWharfType", getPortWharfType());
		attributes.put("portCode", getPortCode());
		attributes.put("portHarbourCode", getPortHarbourCode());
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

		String portWharfCode = (String)attributes.get("portWharfCode");

		if (portWharfCode != null) {
			setPortWharfCode(portWharfCode);
		}

		String portWharfName = (String)attributes.get("portWharfName");

		if (portWharfName != null) {
			setPortWharfName(portWharfName);
		}

		String portWharfNameVN = (String)attributes.get("portWharfNameVN");

		if (portWharfNameVN != null) {
			setPortWharfNameVN(portWharfNameVN);
		}

		Integer portWharfType = (Integer)attributes.get("portWharfType");

		if (portWharfType != null) {
			setPortWharfType(portWharfType);
		}

		String portCode = (String)attributes.get("portCode");

		if (portCode != null) {
			setPortCode(portCode);
		}

		String portHarbourCode = (String)attributes.get("portHarbourCode");

		if (portHarbourCode != null) {
			setPortHarbourCode(portHarbourCode);
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
	* Returns the primary key of this dm port wharf.
	*
	* @return the primary key of this dm port wharf
	*/
	@Override
	public int getPrimaryKey() {
		return _dmPortWharf.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm port wharf.
	*
	* @param primaryKey the primary key of this dm port wharf
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmPortWharf.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm port wharf.
	*
	* @return the ID of this dm port wharf
	*/
	@Override
	public int getId() {
		return _dmPortWharf.getId();
	}

	/**
	* Sets the ID of this dm port wharf.
	*
	* @param id the ID of this dm port wharf
	*/
	@Override
	public void setId(int id) {
		_dmPortWharf.setId(id);
	}

	/**
	* Returns the port wharf code of this dm port wharf.
	*
	* @return the port wharf code of this dm port wharf
	*/
	@Override
	public java.lang.String getPortWharfCode() {
		return _dmPortWharf.getPortWharfCode();
	}

	/**
	* Sets the port wharf code of this dm port wharf.
	*
	* @param portWharfCode the port wharf code of this dm port wharf
	*/
	@Override
	public void setPortWharfCode(java.lang.String portWharfCode) {
		_dmPortWharf.setPortWharfCode(portWharfCode);
	}

	/**
	* Returns the port wharf name of this dm port wharf.
	*
	* @return the port wharf name of this dm port wharf
	*/
	@Override
	public java.lang.String getPortWharfName() {
		return _dmPortWharf.getPortWharfName();
	}

	/**
	* Sets the port wharf name of this dm port wharf.
	*
	* @param portWharfName the port wharf name of this dm port wharf
	*/
	@Override
	public void setPortWharfName(java.lang.String portWharfName) {
		_dmPortWharf.setPortWharfName(portWharfName);
	}

	/**
	* Returns the port wharf name v n of this dm port wharf.
	*
	* @return the port wharf name v n of this dm port wharf
	*/
	@Override
	public java.lang.String getPortWharfNameVN() {
		return _dmPortWharf.getPortWharfNameVN();
	}

	/**
	* Sets the port wharf name v n of this dm port wharf.
	*
	* @param portWharfNameVN the port wharf name v n of this dm port wharf
	*/
	@Override
	public void setPortWharfNameVN(java.lang.String portWharfNameVN) {
		_dmPortWharf.setPortWharfNameVN(portWharfNameVN);
	}

	/**
	* Returns the port wharf type of this dm port wharf.
	*
	* @return the port wharf type of this dm port wharf
	*/
	@Override
	public int getPortWharfType() {
		return _dmPortWharf.getPortWharfType();
	}

	/**
	* Sets the port wharf type of this dm port wharf.
	*
	* @param portWharfType the port wharf type of this dm port wharf
	*/
	@Override
	public void setPortWharfType(int portWharfType) {
		_dmPortWharf.setPortWharfType(portWharfType);
	}

	/**
	* Returns the port code of this dm port wharf.
	*
	* @return the port code of this dm port wharf
	*/
	@Override
	public java.lang.String getPortCode() {
		return _dmPortWharf.getPortCode();
	}

	/**
	* Sets the port code of this dm port wharf.
	*
	* @param portCode the port code of this dm port wharf
	*/
	@Override
	public void setPortCode(java.lang.String portCode) {
		_dmPortWharf.setPortCode(portCode);
	}

	/**
	* Returns the port harbour code of this dm port wharf.
	*
	* @return the port harbour code of this dm port wharf
	*/
	@Override
	public java.lang.String getPortHarbourCode() {
		return _dmPortWharf.getPortHarbourCode();
	}

	/**
	* Sets the port harbour code of this dm port wharf.
	*
	* @param portHarbourCode the port harbour code of this dm port wharf
	*/
	@Override
	public void setPortHarbourCode(java.lang.String portHarbourCode) {
		_dmPortWharf.setPortHarbourCode(portHarbourCode);
	}

	/**
	* Returns the port region code of this dm port wharf.
	*
	* @return the port region code of this dm port wharf
	*/
	@Override
	public java.lang.String getPortRegionCode() {
		return _dmPortWharf.getPortRegionCode();
	}

	/**
	* Sets the port region code of this dm port wharf.
	*
	* @param portRegionCode the port region code of this dm port wharf
	*/
	@Override
	public void setPortRegionCode(java.lang.String portRegionCode) {
		_dmPortWharf.setPortRegionCode(portRegionCode);
	}

	/**
	* Returns the note of this dm port wharf.
	*
	* @return the note of this dm port wharf
	*/
	@Override
	public java.lang.String getNote() {
		return _dmPortWharf.getNote();
	}

	/**
	* Sets the note of this dm port wharf.
	*
	* @param note the note of this dm port wharf
	*/
	@Override
	public void setNote(java.lang.String note) {
		_dmPortWharf.setNote(note);
	}

	/**
	* Returns the is delete of this dm port wharf.
	*
	* @return the is delete of this dm port wharf
	*/
	@Override
	public int getIsDelete() {
		return _dmPortWharf.getIsDelete();
	}

	/**
	* Sets the is delete of this dm port wharf.
	*
	* @param isDelete the is delete of this dm port wharf
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmPortWharf.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm port wharf.
	*
	* @return the marked as delete of this dm port wharf
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmPortWharf.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm port wharf.
	*
	* @param markedAsDelete the marked as delete of this dm port wharf
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmPortWharf.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm port wharf.
	*
	* @return the modified date of this dm port wharf
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmPortWharf.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm port wharf.
	*
	* @param modifiedDate the modified date of this dm port wharf
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmPortWharf.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm port wharf.
	*
	* @return the requested date of this dm port wharf
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmPortWharf.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm port wharf.
	*
	* @param requestedDate the requested date of this dm port wharf
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmPortWharf.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm port wharf.
	*
	* @return the sync version of this dm port wharf
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmPortWharf.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm port wharf.
	*
	* @param syncVersion the sync version of this dm port wharf
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmPortWharf.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmPortWharf.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmPortWharf.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmPortWharf.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmPortWharf.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmPortWharf.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmPortWharf.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmPortWharf.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmPortWharf.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmPortWharf.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmPortWharf.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmPortWharf.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmPortWharfWrapper((DmPortWharf)_dmPortWharf.clone());
	}

	@Override
	public int compareTo(DmPortWharf dmPortWharf) {
		return _dmPortWharf.compareTo(dmPortWharf);
	}

	@Override
	public int hashCode() {
		return _dmPortWharf.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<DmPortWharf> toCacheModel() {
		return _dmPortWharf.toCacheModel();
	}

	@Override
	public DmPortWharf toEscapedModel() {
		return new DmPortWharfWrapper(_dmPortWharf.toEscapedModel());
	}

	@Override
	public DmPortWharf toUnescapedModel() {
		return new DmPortWharfWrapper(_dmPortWharf.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmPortWharf.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmPortWharf.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmPortWharf.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmPortWharfWrapper)) {
			return false;
		}

		DmPortWharfWrapper dmPortWharfWrapper = (DmPortWharfWrapper)obj;

		if (Validator.equals(_dmPortWharf, dmPortWharfWrapper._dmPortWharf)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmPortWharf getWrappedDmPortWharf() {
		return _dmPortWharf;
	}

	@Override
	public DmPortWharf getWrappedModel() {
		return _dmPortWharf;
	}

	@Override
	public void resetOriginalValues() {
		_dmPortWharf.resetOriginalValues();
	}

	private DmPortWharf _dmPortWharf;
}