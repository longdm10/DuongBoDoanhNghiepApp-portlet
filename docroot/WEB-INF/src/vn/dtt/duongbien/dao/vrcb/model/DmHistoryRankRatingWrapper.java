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
 * This class is a wrapper for {@link DmHistoryRankRating}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryRankRating
 * @generated
 */
public class DmHistoryRankRatingWrapper implements DmHistoryRankRating,
	ModelWrapper<DmHistoryRankRating> {
	public DmHistoryRankRatingWrapper(DmHistoryRankRating dmHistoryRankRating) {
		_dmHistoryRankRating = dmHistoryRankRating;
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryRankRating.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryRankRating.class.getName();
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
	* Returns the primary key of this dm history rank rating.
	*
	* @return the primary key of this dm history rank rating
	*/
	@Override
	public int getPrimaryKey() {
		return _dmHistoryRankRating.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history rank rating.
	*
	* @param primaryKey the primary key of this dm history rank rating
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryRankRating.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history rank rating.
	*
	* @return the ID of this dm history rank rating
	*/
	@Override
	public int getId() {
		return _dmHistoryRankRating.getId();
	}

	/**
	* Sets the ID of this dm history rank rating.
	*
	* @param id the ID of this dm history rank rating
	*/
	@Override
	public void setId(int id) {
		_dmHistoryRankRating.setId(id);
	}

	/**
	* Returns the rank code of this dm history rank rating.
	*
	* @return the rank code of this dm history rank rating
	*/
	@Override
	public java.lang.String getRankCode() {
		return _dmHistoryRankRating.getRankCode();
	}

	/**
	* Sets the rank code of this dm history rank rating.
	*
	* @param rankCode the rank code of this dm history rank rating
	*/
	@Override
	public void setRankCode(java.lang.String rankCode) {
		_dmHistoryRankRating.setRankCode(rankCode);
	}

	/**
	* Returns the rank name of this dm history rank rating.
	*
	* @return the rank name of this dm history rank rating
	*/
	@Override
	public java.lang.String getRankName() {
		return _dmHistoryRankRating.getRankName();
	}

	/**
	* Sets the rank name of this dm history rank rating.
	*
	* @param rankName the rank name of this dm history rank rating
	*/
	@Override
	public void setRankName(java.lang.String rankName) {
		_dmHistoryRankRating.setRankName(rankName);
	}

	/**
	* Returns the rank name v n of this dm history rank rating.
	*
	* @return the rank name v n of this dm history rank rating
	*/
	@Override
	public java.lang.String getRankNameVN() {
		return _dmHistoryRankRating.getRankNameVN();
	}

	/**
	* Sets the rank name v n of this dm history rank rating.
	*
	* @param rankNameVN the rank name v n of this dm history rank rating
	*/
	@Override
	public void setRankNameVN(java.lang.String rankNameVN) {
		_dmHistoryRankRating.setRankNameVN(rankNameVN);
	}

	/**
	* Returns the rank order of this dm history rank rating.
	*
	* @return the rank order of this dm history rank rating
	*/
	@Override
	public int getRankOrder() {
		return _dmHistoryRankRating.getRankOrder();
	}

	/**
	* Sets the rank order of this dm history rank rating.
	*
	* @param rankOrder the rank order of this dm history rank rating
	*/
	@Override
	public void setRankOrder(int rankOrder) {
		_dmHistoryRankRating.setRankOrder(rankOrder);
	}

	/**
	* Returns the is delete of this dm history rank rating.
	*
	* @return the is delete of this dm history rank rating
	*/
	@Override
	public int getIsDelete() {
		return _dmHistoryRankRating.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history rank rating.
	*
	* @param isDelete the is delete of this dm history rank rating
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_dmHistoryRankRating.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history rank rating.
	*
	* @return the marked as delete of this dm history rank rating
	*/
	@Override
	public int getMarkedAsDelete() {
		return _dmHistoryRankRating.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history rank rating.
	*
	* @param markedAsDelete the marked as delete of this dm history rank rating
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryRankRating.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history rank rating.
	*
	* @return the modified date of this dm history rank rating
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dmHistoryRankRating.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history rank rating.
	*
	* @param modifiedDate the modified date of this dm history rank rating
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryRankRating.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history rank rating.
	*
	* @return the requested date of this dm history rank rating
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _dmHistoryRankRating.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history rank rating.
	*
	* @param requestedDate the requested date of this dm history rank rating
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryRankRating.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history rank rating.
	*
	* @return the sync version of this dm history rank rating
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _dmHistoryRankRating.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history rank rating.
	*
	* @param syncVersion the sync version of this dm history rank rating
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryRankRating.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _dmHistoryRankRating.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmHistoryRankRating.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmHistoryRankRating.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmHistoryRankRating.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmHistoryRankRating.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryRankRating.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryRankRating.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryRankRating.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmHistoryRankRating.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmHistoryRankRating.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryRankRating.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryRankRatingWrapper((DmHistoryRankRating)_dmHistoryRankRating.clone());
	}

	@Override
	public int compareTo(DmHistoryRankRating dmHistoryRankRating) {
		return _dmHistoryRankRating.compareTo(dmHistoryRankRating);
	}

	@Override
	public int hashCode() {
		return _dmHistoryRankRating.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<DmHistoryRankRating> toCacheModel() {
		return _dmHistoryRankRating.toCacheModel();
	}

	@Override
	public DmHistoryRankRating toEscapedModel() {
		return new DmHistoryRankRatingWrapper(_dmHistoryRankRating.toEscapedModel());
	}

	@Override
	public DmHistoryRankRating toUnescapedModel() {
		return new DmHistoryRankRatingWrapper(_dmHistoryRankRating.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryRankRating.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmHistoryRankRating.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryRankRating.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmHistoryRankRatingWrapper)) {
			return false;
		}

		DmHistoryRankRatingWrapper dmHistoryRankRatingWrapper = (DmHistoryRankRatingWrapper)obj;

		if (Validator.equals(_dmHistoryRankRating,
					dmHistoryRankRatingWrapper._dmHistoryRankRating)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmHistoryRankRating getWrappedDmHistoryRankRating() {
		return _dmHistoryRankRating;
	}

	@Override
	public DmHistoryRankRating getWrappedModel() {
		return _dmHistoryRankRating;
	}

	@Override
	public void resetOriginalValues() {
		_dmHistoryRankRating.resetOriginalValues();
	}

	private DmHistoryRankRating _dmHistoryRankRating;
}