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
 * This class is a wrapper for {@link DmRepresentative}.
 * </p>
 *
 * @author longdm
 * @see DmRepresentative
 * @generated
 */
public class DmRepresentativeWrapper implements DmRepresentative,
	ModelWrapper<DmRepresentative> {
	public DmRepresentativeWrapper(DmRepresentative dmRepresentative) {
		_dmRepresentative = dmRepresentative;
	}

	@Override
	public Class<?> getModelClass() {
		return DmRepresentative.class;
	}

	@Override
	public String getModelClassName() {
		return DmRepresentative.class.getName();
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
	* Returns the primary key of this dm representative.
	*
	* @return the primary key of this dm representative
	*/
	@Override
	public int getPrimaryKey() {
		return _dmRepresentative.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm representative.
	*
	* @param primaryKey the primary key of this dm representative
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmRepresentative.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm representative.
	*
	* @return the ID of this dm representative
	*/
	@Override
	public int getId() {
		return _dmRepresentative.getId();
	}

	/**
	* Sets the ID of this dm representative.
	*
	* @param id the ID of this dm representative
	*/
	@Override
	public void setId(int id) {
		_dmRepresentative.setId(id);
	}

	/**
	* Returns the rep code of this dm representative.
	*
	* @return the rep code of this dm representative
	*/
	@Override
	public java.lang.String getRepCode() {
		return _dmRepresentative.getRepCode();
	}

	/**
	* Sets the rep code of this dm representative.
	*
	* @param repCode the rep code of this dm representative
	*/
	@Override
	public void setRepCode(java.lang.String repCode) {
		_dmRepresentative.setRepCode(repCode);
	}

	/**
	* Returns the rep name of this dm representative.
	*
	* @return the rep name of this dm representative
	*/
	@Override
	public java.lang.String getRepName() {
		return _dmRepresentative.getRepName();
	}

	/**
	* Sets the rep name of this dm representative.
	*
	* @param repName the rep name of this dm representative
	*/
	@Override
	public void setRepName(java.lang.String repName) {
		_dmRepresentative.setRepName(repName);
	}

	/**
	* Returns the rep name v n of this dm representative.
	*
	* @return the rep name v n of this dm representative
	*/
	@Override
	public java.lang.String getRepNameVN() {
		return _dmRepresentative.getRepNameVN();
	}

	/**
	* Sets the rep name v n of this dm representative.
	*
	* @param repNameVN the rep name v n of this dm representative
	*/
	@Override
	public void setRepNameVN(java.lang.String repNameVN) {
		_dmRepresentative.setRepNameVN(repNameVN);
	}

	/**
	* Returns the rep order of this dm representative.
	*
	* @return the rep order of this dm representative
	*/
	@Override
	public int getRepOrder() {
		return _dmRepresentative.getRepOrder();
	}

	/**
	* Sets the rep order of this dm representative.
	*
	* @param repOrder the rep order of this dm representative
	*/
	@Override
	public void setRepOrder(int repOrder) {
		_dmRepresentative.setRepOrder(repOrder);
	}

	/**
	* Returns the maritime code of this dm representative.
	*
	* @return the maritime code of this dm representative
	*/
	@Override
	public java.lang.String getMaritimeCode() {
		return _dmRepresentative.getMaritimeCode();
	}

	/**
	* Sets the maritime code of this dm representative.
	*
	* @param maritimeCode the maritime code of this dm representative
	*/
	@Override
	public void setMaritimeCode(java.lang.String maritimeCode) {
		_dmRepresentative.setMaritimeCode(maritimeCode);
	}

	/**
	* Returns the is delete of this dm representative.
	*
	* @return the is delete of this dm representative
	*/
	@Override
	public int getIsDelete() {
		return _dmRepresentative.getIsDelete();
	}

	/**
	* Sets the is delete of this dm representative.
	*
	* @param isDelete the is delete of this dm representative
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmRepresentative.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm representative.
	*
	* @return the marked as delete of this dm representative
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmRepresentative.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm representative.
	*
	* @param markedAsDelete the marked as delete of this dm representative
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmRepresentative.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm representative.
	*
	* @return the modified date of this dm representative
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmRepresentative.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm representative.
	*
	* @param modifiedDate the modified date of this dm representative
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmRepresentative.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm representative.
	*
	* @return the requested date of this dm representative
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmRepresentative.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm representative.
	*
	* @param requestedDate the requested date of this dm representative
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmRepresentative.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm representative.
	*
	* @return the sync version of this dm representative
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmRepresentative.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm representative.
	*
	* @param syncVersion the sync version of this dm representative
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmRepresentative.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmRepresentative.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmRepresentative.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmRepresentative.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmRepresentative.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmRepresentative.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmRepresentative.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmRepresentative.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmRepresentative.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmRepresentative.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmRepresentative.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmRepresentative.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmRepresentativeWrapper((DmRepresentative)_dmRepresentative.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmRepresentative dmRepresentative) {
		return _dmRepresentative.compareTo(dmRepresentative);
	}

	@Override
	public int hashCode() {
		return _dmRepresentative.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmRepresentative> toCacheModel() {
		return _dmRepresentative.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmRepresentative toEscapedModel() {
		return new DmRepresentativeWrapper(_dmRepresentative.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmRepresentative toUnescapedModel() {
		return new DmRepresentativeWrapper(_dmRepresentative.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmRepresentative.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmRepresentative.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmRepresentative.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmRepresentativeWrapper)) {
			return false;
		}

		DmRepresentativeWrapper dmRepresentativeWrapper = (DmRepresentativeWrapper)obj;

		if (Validator.equals(_dmRepresentative,
					dmRepresentativeWrapper._dmRepresentative)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmRepresentative getWrappedDmRepresentative() {
		return _dmRepresentative;
	}

	@Override
	public DmRepresentative getWrappedModel() {
		return _dmRepresentative;
	}

	@Override
	public void resetOriginalValues() {
		_dmRepresentative.resetOriginalValues();
	}

	private DmRepresentative _dmRepresentative;
}