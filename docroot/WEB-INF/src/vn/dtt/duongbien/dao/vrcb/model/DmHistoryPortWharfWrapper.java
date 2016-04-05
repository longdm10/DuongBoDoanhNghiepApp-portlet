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
 * This class is a wrapper for {@link DmHistoryPortWharf}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryPortWharf
 * @generated
 */
public class DmHistoryPortWharfWrapper implements DmHistoryPortWharf,
	ModelWrapper<DmHistoryPortWharf> {
	public DmHistoryPortWharfWrapper(DmHistoryPortWharf dmHistoryPortWharf) {
		_dmHistoryPortWharf = dmHistoryPortWharf;
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryPortWharf.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryPortWharf.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("portWharfCode", getPortWharfCode());
		attributes.put("portWharfName", getPortWharfName());
		attributes.put("portWharfNameVN", getPortWharfNameVN());
		attributes.put("portWharfType", getPortWharfType());
		attributes.put("portHarbourCode", getPortHarbourCode());
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

		String portHarbourCode = (String)attributes.get("portHarbourCode");

		if (portHarbourCode != null) {
			setPortHarbourCode(portHarbourCode);
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
	* Returns the primary key of this dm history port wharf.
	*
	* @return the primary key of this dm history port wharf
	*/
	@Override
	public int getPrimaryKey() {
		return _dmHistoryPortWharf.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history port wharf.
	*
	* @param primaryKey the primary key of this dm history port wharf
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryPortWharf.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history port wharf.
	*
	* @return the ID of this dm history port wharf
	*/
	@Override
	public int getId() {
		return _dmHistoryPortWharf.getId();
	}

	/**
	* Sets the ID of this dm history port wharf.
	*
	* @param id the ID of this dm history port wharf
	*/
	@Override
	public void setId(int id) {
		_dmHistoryPortWharf.setId(id);
	}

	/**
	* Returns the port wharf code of this dm history port wharf.
	*
	* @return the port wharf code of this dm history port wharf
	*/
	@Override
	public java.lang.String getPortWharfCode() {
		return _dmHistoryPortWharf.getPortWharfCode();
	}

	/**
	* Sets the port wharf code of this dm history port wharf.
	*
	* @param portWharfCode the port wharf code of this dm history port wharf
	*/
	@Override
	public void setPortWharfCode(java.lang.String portWharfCode) {
		_dmHistoryPortWharf.setPortWharfCode(portWharfCode);
	}

	/**
	* Returns the port wharf name of this dm history port wharf.
	*
	* @return the port wharf name of this dm history port wharf
	*/
	@Override
	public java.lang.String getPortWharfName() {
		return _dmHistoryPortWharf.getPortWharfName();
	}

	/**
	* Sets the port wharf name of this dm history port wharf.
	*
	* @param portWharfName the port wharf name of this dm history port wharf
	*/
	@Override
	public void setPortWharfName(java.lang.String portWharfName) {
		_dmHistoryPortWharf.setPortWharfName(portWharfName);
	}

	/**
	* Returns the port wharf name v n of this dm history port wharf.
	*
	* @return the port wharf name v n of this dm history port wharf
	*/
	@Override
	public java.lang.String getPortWharfNameVN() {
		return _dmHistoryPortWharf.getPortWharfNameVN();
	}

	/**
	* Sets the port wharf name v n of this dm history port wharf.
	*
	* @param portWharfNameVN the port wharf name v n of this dm history port wharf
	*/
	@Override
	public void setPortWharfNameVN(java.lang.String portWharfNameVN) {
		_dmHistoryPortWharf.setPortWharfNameVN(portWharfNameVN);
	}

	/**
	* Returns the port wharf type of this dm history port wharf.
	*
	* @return the port wharf type of this dm history port wharf
	*/
	@Override
	public int getPortWharfType() {
		return _dmHistoryPortWharf.getPortWharfType();
	}

	/**
	* Sets the port wharf type of this dm history port wharf.
	*
	* @param portWharfType the port wharf type of this dm history port wharf
	*/
	@Override
	public void setPortWharfType(int portWharfType) {
		_dmHistoryPortWharf.setPortWharfType(portWharfType);
	}

	/**
	* Returns the port harbour code of this dm history port wharf.
	*
	* @return the port harbour code of this dm history port wharf
	*/
	@Override
	public java.lang.String getPortHarbourCode() {
		return _dmHistoryPortWharf.getPortHarbourCode();
	}

	/**
	* Sets the port harbour code of this dm history port wharf.
	*
	* @param portHarbourCode the port harbour code of this dm history port wharf
	*/
	@Override
	public void setPortHarbourCode(java.lang.String portHarbourCode) {
		_dmHistoryPortWharf.setPortHarbourCode(portHarbourCode);
	}

	/**
	* Returns the port code of this dm history port wharf.
	*
	* @return the port code of this dm history port wharf
	*/
	@Override
	public java.lang.String getPortCode() {
		return _dmHistoryPortWharf.getPortCode();
	}

	/**
	* Sets the port code of this dm history port wharf.
	*
	* @param portCode the port code of this dm history port wharf
	*/
	@Override
	public void setPortCode(java.lang.String portCode) {
		_dmHistoryPortWharf.setPortCode(portCode);
	}

	/**
	* Returns the port region code of this dm history port wharf.
	*
	* @return the port region code of this dm history port wharf
	*/
	@Override
	public java.lang.String getPortRegionCode() {
		return _dmHistoryPortWharf.getPortRegionCode();
	}

	/**
	* Sets the port region code of this dm history port wharf.
	*
	* @param portRegionCode the port region code of this dm history port wharf
	*/
	@Override
	public void setPortRegionCode(java.lang.String portRegionCode) {
		_dmHistoryPortWharf.setPortRegionCode(portRegionCode);
	}

	/**
	* Returns the note of this dm history port wharf.
	*
	* @return the note of this dm history port wharf
	*/
	@Override
	public java.lang.String getNote() {
		return _dmHistoryPortWharf.getNote();
	}

	/**
	* Sets the note of this dm history port wharf.
	*
	* @param note the note of this dm history port wharf
	*/
	@Override
	public void setNote(java.lang.String note) {
		_dmHistoryPortWharf.setNote(note);
	}

	/**
	* Returns the is delete of this dm history port wharf.
	*
	* @return the is delete of this dm history port wharf
	*/
	@Override
	public int getIsDelete() {
		return _dmHistoryPortWharf.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history port wharf.
	*
	* @param isDelete the is delete of this dm history port wharf
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmHistoryPortWharf.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history port wharf.
	*
	* @return the marked as delete of this dm history port wharf
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmHistoryPortWharf.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history port wharf.
	*
	* @param markedAsDelete the marked as delete of this dm history port wharf
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryPortWharf.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history port wharf.
	*
	* @return the modified date of this dm history port wharf
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmHistoryPortWharf.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history port wharf.
	*
	* @param modifiedDate the modified date of this dm history port wharf
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryPortWharf.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history port wharf.
	*
	* @return the requested date of this dm history port wharf
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmHistoryPortWharf.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history port wharf.
	*
	* @param requestedDate the requested date of this dm history port wharf
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryPortWharf.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history port wharf.
	*
	* @return the sync version of this dm history port wharf
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmHistoryPortWharf.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history port wharf.
	*
	* @param syncVersion the sync version of this dm history port wharf
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryPortWharf.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmHistoryPortWharf.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmHistoryPortWharf.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmHistoryPortWharf.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmHistoryPortWharf.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmHistoryPortWharf.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryPortWharf.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryPortWharf.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryPortWharf.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmHistoryPortWharf.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmHistoryPortWharf.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryPortWharf.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryPortWharfWrapper((DmHistoryPortWharf)_dmHistoryPortWharf.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf dmHistoryPortWharf) {
		return _dmHistoryPortWharf.compareTo(dmHistoryPortWharf);
	}

	@Override
	public int hashCode() {
		return _dmHistoryPortWharf.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf> toCacheModel() {
		return _dmHistoryPortWharf.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf toEscapedModel() {
		return new DmHistoryPortWharfWrapper(_dmHistoryPortWharf.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharf toUnescapedModel() {
		return new DmHistoryPortWharfWrapper(_dmHistoryPortWharf.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryPortWharf.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmHistoryPortWharf.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryPortWharf.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmHistoryPortWharfWrapper)) {
			return false;
		}

		DmHistoryPortWharfWrapper dmHistoryPortWharfWrapper = (DmHistoryPortWharfWrapper)obj;

		if (Validator.equals(_dmHistoryPortWharf,
					dmHistoryPortWharfWrapper._dmHistoryPortWharf)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmHistoryPortWharf getWrappedDmHistoryPortWharf() {
		return _dmHistoryPortWharf;
	}

	@Override
	public DmHistoryPortWharf getWrappedModel() {
		return _dmHistoryPortWharf;
	}

	@Override
	public void resetOriginalValues() {
		_dmHistoryPortWharf.resetOriginalValues();
	}

	private DmHistoryPortWharf _dmHistoryPortWharf;
}