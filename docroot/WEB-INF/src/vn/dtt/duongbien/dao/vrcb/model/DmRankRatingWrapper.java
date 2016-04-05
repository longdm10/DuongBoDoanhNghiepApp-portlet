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
 * This class is a wrapper for {@link DmRankRating}.
 * </p>
 *
 * @author longdm
 * @see DmRankRating
 * @generated
 */
public class DmRankRatingWrapper implements DmRankRating,
	ModelWrapper<DmRankRating> {
	public DmRankRatingWrapper(DmRankRating dmRankRating) {
		_dmRankRating = dmRankRating;
	}

	@Override
	public Class<?> getModelClass() {
		return DmRankRating.class;
	}

	@Override
	public String getModelClassName() {
		return DmRankRating.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("rankCode", getRankCode());
		attributes.put("rankName", getRankName());
		attributes.put("rankNameVN", getRankNameVN());
		attributes.put("rankOrder", getRankOrder());
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

		String rankCode = (String)attributes.get("rankCode");

		if (rankCode != null) {
			setRankCode(rankCode);
		}

		String rankName = (String)attributes.get("rankName");

		if (rankName != null) {
			setRankName(rankName);
		}

		String rankNameVN = (String)attributes.get("rankNameVN");

		if (rankNameVN != null) {
			setRankNameVN(rankNameVN);
		}

		Integer rankOrder = (Integer)attributes.get("rankOrder");

		if (rankOrder != null) {
			setRankOrder(rankOrder);
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
	* Returns the primary key of this dm rank rating.
	*
	* @return the primary key of this dm rank rating
	*/
	@Override
	public int getPrimaryKey() {
		return _dmRankRating.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm rank rating.
	*
	* @param primaryKey the primary key of this dm rank rating
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmRankRating.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm rank rating.
	*
	* @return the ID of this dm rank rating
	*/
	@Override
	public int getId() {
		return _dmRankRating.getId();
	}

	/**
	* Sets the ID of this dm rank rating.
	*
	* @param id the ID of this dm rank rating
	*/
	@Override
	public void setId(int id) {
		_dmRankRating.setId(id);
	}

	/**
	* Returns the rank code of this dm rank rating.
	*
	* @return the rank code of this dm rank rating
	*/
	@Override
	public java.lang.String getRankCode() {
		return _dmRankRating.getRankCode();
	}

	/**
	* Sets the rank code of this dm rank rating.
	*
	* @param rankCode the rank code of this dm rank rating
	*/
	@Override
	public void setRankCode(java.lang.String rankCode) {
		_dmRankRating.setRankCode(rankCode);
	}

	/**
	* Returns the rank name of this dm rank rating.
	*
	* @return the rank name of this dm rank rating
	*/
	@Override
	public java.lang.String getRankName() {
		return _dmRankRating.getRankName();
	}

	/**
	* Sets the rank name of this dm rank rating.
	*
	* @param rankName the rank name of this dm rank rating
	*/
	@Override
	public void setRankName(java.lang.String rankName) {
		_dmRankRating.setRankName(rankName);
	}

	/**
	* Returns the rank name v n of this dm rank rating.
	*
	* @return the rank name v n of this dm rank rating
	*/
	@Override
	public java.lang.String getRankNameVN() {
		return _dmRankRating.getRankNameVN();
	}

	/**
	* Sets the rank name v n of this dm rank rating.
	*
	* @param rankNameVN the rank name v n of this dm rank rating
	*/
	@Override
	public void setRankNameVN(java.lang.String rankNameVN) {
		_dmRankRating.setRankNameVN(rankNameVN);
	}

	/**
	* Returns the rank order of this dm rank rating.
	*
	* @return the rank order of this dm rank rating
	*/
	@Override
	public int getRankOrder() {
		return _dmRankRating.getRankOrder();
	}

	/**
	* Sets the rank order of this dm rank rating.
	*
	* @param rankOrder the rank order of this dm rank rating
	*/
	@Override
	public void setRankOrder(int rankOrder) {
		_dmRankRating.setRankOrder(rankOrder);
	}

	/**
	* Returns the is delete of this dm rank rating.
	*
	* @return the is delete of this dm rank rating
	*/
	@Override
	public int getIsDelete() {
		return _dmRankRating.getIsDelete();
	}

	/**
	* Sets the is delete of this dm rank rating.
	*
	* @param isDelete the is delete of this dm rank rating
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmRankRating.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm rank rating.
	*
	* @return the marked as delete of this dm rank rating
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmRankRating.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm rank rating.
	*
	* @param markedAsDelete the marked as delete of this dm rank rating
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmRankRating.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm rank rating.
	*
	* @return the modified date of this dm rank rating
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmRankRating.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm rank rating.
	*
	* @param modifiedDate the modified date of this dm rank rating
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmRankRating.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm rank rating.
	*
	* @return the requested date of this dm rank rating
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmRankRating.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm rank rating.
	*
	* @param requestedDate the requested date of this dm rank rating
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmRankRating.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm rank rating.
	*
	* @return the sync version of this dm rank rating
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmRankRating.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm rank rating.
	*
	* @param syncVersion the sync version of this dm rank rating
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmRankRating.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmRankRating.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmRankRating.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmRankRating.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmRankRating.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmRankRating.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmRankRating.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmRankRating.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmRankRating.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmRankRating.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmRankRating.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmRankRating.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmRankRatingWrapper((DmRankRating)_dmRankRating.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.DmRankRating dmRankRating) {
		return _dmRankRating.compareTo(dmRankRating);
	}

	@Override
	public int hashCode() {
		return _dmRankRating.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.DmRankRating> toCacheModel() {
		return _dmRankRating.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmRankRating toEscapedModel() {
		return new DmRankRatingWrapper(_dmRankRating.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmRankRating toUnescapedModel() {
		return new DmRankRatingWrapper(_dmRankRating.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmRankRating.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmRankRating.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmRankRating.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmRankRatingWrapper)) {
			return false;
		}

		DmRankRatingWrapper dmRankRatingWrapper = (DmRankRatingWrapper)obj;

		if (Validator.equals(_dmRankRating, dmRankRatingWrapper._dmRankRating)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmRankRating getWrappedDmRankRating() {
		return _dmRankRating;
	}

	@Override
	public DmRankRating getWrappedModel() {
		return _dmRankRating;
	}

	@Override
	public void resetOriginalValues() {
		_dmRankRating.resetOriginalValues();
	}

	private DmRankRating _dmRankRating;
}