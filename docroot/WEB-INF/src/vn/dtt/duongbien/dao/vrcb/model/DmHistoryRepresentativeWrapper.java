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
 * This class is a wrapper for {@link DmHistoryRepresentative}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryRepresentative
 * @generated
 */
public class DmHistoryRepresentativeWrapper implements DmHistoryRepresentative,
	ModelWrapper<DmHistoryRepresentative> {
	public DmHistoryRepresentativeWrapper(
		DmHistoryRepresentative dmHistoryRepresentative) {
		_dmHistoryRepresentative = dmHistoryRepresentative;
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryRepresentative.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryRepresentative.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("repCode", getRepCode());
		attributes.put("repName", getRepName());
		attributes.put("repNameVN", getRepNameVN());
		attributes.put("repOrder", getRepOrder());
		attributes.put("maritimeCode", getMaritimeCode());
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

		String repCode = (String)attributes.get("repCode");

		if (repCode != null) {
			setRepCode(repCode);
		}

		String repName = (String)attributes.get("repName");

		if (repName != null) {
			setRepName(repName);
		}

		String repNameVN = (String)attributes.get("repNameVN");

		if (repNameVN != null) {
			setRepNameVN(repNameVN);
		}

		Integer repOrder = (Integer)attributes.get("repOrder");

		if (repOrder != null) {
			setRepOrder(repOrder);
		}

		String maritimeCode = (String)attributes.get("maritimeCode");

		if (maritimeCode != null) {
			setMaritimeCode(maritimeCode);
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
	* Returns the primary key of this dm history representative.
	*
	* @return the primary key of this dm history representative
	*/
	@Override
	public int getPrimaryKey() {
		return _dmHistoryRepresentative.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history representative.
	*
	* @param primaryKey the primary key of this dm history representative
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryRepresentative.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history representative.
	*
	* @return the ID of this dm history representative
	*/
	@Override
	public int getId() {
		return _dmHistoryRepresentative.getId();
	}

	/**
	* Sets the ID of this dm history representative.
	*
	* @param id the ID of this dm history representative
	*/
	@Override
	public void setId(int id) {
		_dmHistoryRepresentative.setId(id);
	}

	/**
	* Returns the rep code of this dm history representative.
	*
	* @return the rep code of this dm history representative
	*/
	@Override
	public java.lang.String getRepCode() {
		return _dmHistoryRepresentative.getRepCode();
	}

	/**
	* Sets the rep code of this dm history representative.
	*
	* @param repCode the rep code of this dm history representative
	*/
	@Override
	public void setRepCode(java.lang.String repCode) {
		_dmHistoryRepresentative.setRepCode(repCode);
	}

	/**
	* Returns the rep name of this dm history representative.
	*
	* @return the rep name of this dm history representative
	*/
	@Override
	public java.lang.String getRepName() {
		return _dmHistoryRepresentative.getRepName();
	}

	/**
	* Sets the rep name of this dm history representative.
	*
	* @param repName the rep name of this dm history representative
	*/
	@Override
	public void setRepName(java.lang.String repName) {
		_dmHistoryRepresentative.setRepName(repName);
	}

	/**
	* Returns the rep name v n of this dm history representative.
	*
	* @return the rep name v n of this dm history representative
	*/
	@Override
	public java.lang.String getRepNameVN() {
		return _dmHistoryRepresentative.getRepNameVN();
	}

	/**
	* Sets the rep name v n of this dm history representative.
	*
	* @param repNameVN the rep name v n of this dm history representative
	*/
	@Override
	public void setRepNameVN(java.lang.String repNameVN) {
		_dmHistoryRepresentative.setRepNameVN(repNameVN);
	}

	/**
	* Returns the rep order of this dm history representative.
	*
	* @return the rep order of this dm history representative
	*/
	@Override
	public int getRepOrder() {
		return _dmHistoryRepresentative.getRepOrder();
	}

	/**
	* Sets the rep order of this dm history representative.
	*
	* @param repOrder the rep order of this dm history representative
	*/
	@Override
	public void setRepOrder(int repOrder) {
		_dmHistoryRepresentative.setRepOrder(repOrder);
	}

	/**
	* Returns the maritime code of this dm history representative.
	*
	* @return the maritime code of this dm history representative
	*/
	@Override
	public java.lang.String getMaritimeCode() {
		return _dmHistoryRepresentative.getMaritimeCode();
	}

	/**
	* Sets the maritime code of this dm history representative.
	*
	* @param maritimeCode the maritime code of this dm history representative
	*/
	@Override
	public void setMaritimeCode(java.lang.String maritimeCode) {
		_dmHistoryRepresentative.setMaritimeCode(maritimeCode);
	}

	/**
	* Returns the is delete of this dm history representative.
	*
	* @return the is delete of this dm history representative
	*/
	@Override
	public int getIsDelete() {
		return _dmHistoryRepresentative.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history representative.
	*
	* @param isDelete the is delete of this dm history representative
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmHistoryRepresentative.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history representative.
	*
	* @return the marked as delete of this dm history representative
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmHistoryRepresentative.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history representative.
	*
	* @param markedAsDelete the marked as delete of this dm history representative
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryRepresentative.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history representative.
	*
	* @return the modified date of this dm history representative
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmHistoryRepresentative.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history representative.
	*
	* @param modifiedDate the modified date of this dm history representative
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryRepresentative.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history representative.
	*
	* @return the requested date of this dm history representative
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmHistoryRepresentative.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history representative.
	*
	* @param requestedDate the requested date of this dm history representative
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryRepresentative.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history representative.
	*
	* @return the sync version of this dm history representative
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmHistoryRepresentative.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history representative.
	*
	* @param syncVersion the sync version of this dm history representative
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryRepresentative.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmHistoryRepresentative.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmHistoryRepresentative.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmHistoryRepresentative.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmHistoryRepresentative.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmHistoryRepresentative.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryRepresentative.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryRepresentative.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryRepresentative.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmHistoryRepresentative.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmHistoryRepresentative.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryRepresentative.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryRepresentativeWrapper((DmHistoryRepresentative)_dmHistoryRepresentative.clone());
	}

	@Override
	public int compareTo(DmHistoryRepresentative dmHistoryRepresentative) {
		return _dmHistoryRepresentative.compareTo(dmHistoryRepresentative);
	}

	@Override
	public int hashCode() {
		return _dmHistoryRepresentative.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<DmHistoryRepresentative> toCacheModel() {
		return _dmHistoryRepresentative.toCacheModel();
	}

	@Override
	public DmHistoryRepresentative toEscapedModel() {
		return new DmHistoryRepresentativeWrapper(_dmHistoryRepresentative.toEscapedModel());
	}

	@Override
	public DmHistoryRepresentative toUnescapedModel() {
		return new DmHistoryRepresentativeWrapper(_dmHistoryRepresentative.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryRepresentative.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmHistoryRepresentative.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryRepresentative.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmHistoryRepresentativeWrapper)) {
			return false;
		}

		DmHistoryRepresentativeWrapper dmHistoryRepresentativeWrapper = (DmHistoryRepresentativeWrapper)obj;

		if (Validator.equals(_dmHistoryRepresentative,
					dmHistoryRepresentativeWrapper._dmHistoryRepresentative)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmHistoryRepresentative getWrappedDmHistoryRepresentative() {
		return _dmHistoryRepresentative;
	}

	@Override
	public DmHistoryRepresentative getWrappedModel() {
		return _dmHistoryRepresentative;
	}

	@Override
	public void resetOriginalValues() {
		_dmHistoryRepresentative.resetOriginalValues();
	}

	private DmHistoryRepresentative _dmHistoryRepresentative;
}