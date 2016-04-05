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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TempCrewEffectsItems}.
 * </p>
 *
 * @author longdm
 * @see TempCrewEffectsItems
 * @generated
 */
public class TempCrewEffectsItemsWrapper implements TempCrewEffectsItems,
	ModelWrapper<TempCrewEffectsItems> {
	public TempCrewEffectsItemsWrapper(
		TempCrewEffectsItems tempCrewEffectsItems) {
		_tempCrewEffectsItems = tempCrewEffectsItems;
	}

	@Override
	public Class<?> getModelClass() {
		return TempCrewEffectsItems.class;
	}

	@Override
	public String getModelClassName() {
		return TempCrewEffectsItems.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("crewEffectItemcode", getCrewEffectItemcode());
		attributes.put("familyName", getFamilyName());
		attributes.put("givenName", getGivenName());
		attributes.put("rankOrratingCode", getRankOrratingCode());
		attributes.put("effectsIneligibleForRelief",
			getEffectsIneligibleForRelief());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String requestCode = (String)attributes.get("requestCode");

		if (requestCode != null) {
			setRequestCode(requestCode);
		}

		String crewEffectItemcode = (String)attributes.get("crewEffectItemcode");

		if (crewEffectItemcode != null) {
			setCrewEffectItemcode(crewEffectItemcode);
		}

		String familyName = (String)attributes.get("familyName");

		if (familyName != null) {
			setFamilyName(familyName);
		}

		String givenName = (String)attributes.get("givenName");

		if (givenName != null) {
			setGivenName(givenName);
		}

		String rankOrratingCode = (String)attributes.get("rankOrratingCode");

		if (rankOrratingCode != null) {
			setRankOrratingCode(rankOrratingCode);
		}

		String effectsIneligibleForRelief = (String)attributes.get(
				"effectsIneligibleForRelief");

		if (effectsIneligibleForRelief != null) {
			setEffectsIneligibleForRelief(effectsIneligibleForRelief);
		}
	}

	/**
	* Returns the primary key of this temp crew effects items.
	*
	* @return the primary key of this temp crew effects items
	*/
	@Override
	public long getPrimaryKey() {
		return _tempCrewEffectsItems.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp crew effects items.
	*
	* @param primaryKey the primary key of this temp crew effects items
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempCrewEffectsItems.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp crew effects items.
	*
	* @return the ID of this temp crew effects items
	*/
	@Override
	public long getId() {
		return _tempCrewEffectsItems.getId();
	}

	/**
	* Sets the ID of this temp crew effects items.
	*
	* @param id the ID of this temp crew effects items
	*/
	@Override
	public void setId(long id) {
		_tempCrewEffectsItems.setId(id);
	}

	/**
	* Returns the request code of this temp crew effects items.
	*
	* @return the request code of this temp crew effects items
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempCrewEffectsItems.getRequestCode();
	}

	/**
	* Sets the request code of this temp crew effects items.
	*
	* @param requestCode the request code of this temp crew effects items
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempCrewEffectsItems.setRequestCode(requestCode);
	}

	/**
	* Returns the crew effect itemcode of this temp crew effects items.
	*
	* @return the crew effect itemcode of this temp crew effects items
	*/
	@Override
	public java.lang.String getCrewEffectItemcode() {
		return _tempCrewEffectsItems.getCrewEffectItemcode();
	}

	/**
	* Sets the crew effect itemcode of this temp crew effects items.
	*
	* @param crewEffectItemcode the crew effect itemcode of this temp crew effects items
	*/
	@Override
	public void setCrewEffectItemcode(java.lang.String crewEffectItemcode) {
		_tempCrewEffectsItems.setCrewEffectItemcode(crewEffectItemcode);
	}

	/**
	* Returns the family name of this temp crew effects items.
	*
	* @return the family name of this temp crew effects items
	*/
	@Override
	public java.lang.String getFamilyName() {
		return _tempCrewEffectsItems.getFamilyName();
	}

	/**
	* Sets the family name of this temp crew effects items.
	*
	* @param familyName the family name of this temp crew effects items
	*/
	@Override
	public void setFamilyName(java.lang.String familyName) {
		_tempCrewEffectsItems.setFamilyName(familyName);
	}

	/**
	* Returns the given name of this temp crew effects items.
	*
	* @return the given name of this temp crew effects items
	*/
	@Override
	public java.lang.String getGivenName() {
		return _tempCrewEffectsItems.getGivenName();
	}

	/**
	* Sets the given name of this temp crew effects items.
	*
	* @param givenName the given name of this temp crew effects items
	*/
	@Override
	public void setGivenName(java.lang.String givenName) {
		_tempCrewEffectsItems.setGivenName(givenName);
	}

	/**
	* Returns the rank orrating code of this temp crew effects items.
	*
	* @return the rank orrating code of this temp crew effects items
	*/
	@Override
	public java.lang.String getRankOrratingCode() {
		return _tempCrewEffectsItems.getRankOrratingCode();
	}

	/**
	* Sets the rank orrating code of this temp crew effects items.
	*
	* @param rankOrratingCode the rank orrating code of this temp crew effects items
	*/
	@Override
	public void setRankOrratingCode(java.lang.String rankOrratingCode) {
		_tempCrewEffectsItems.setRankOrratingCode(rankOrratingCode);
	}

	/**
	* Returns the effects ineligible for relief of this temp crew effects items.
	*
	* @return the effects ineligible for relief of this temp crew effects items
	*/
	@Override
	public java.lang.String getEffectsIneligibleForRelief() {
		return _tempCrewEffectsItems.getEffectsIneligibleForRelief();
	}

	/**
	* Sets the effects ineligible for relief of this temp crew effects items.
	*
	* @param effectsIneligibleForRelief the effects ineligible for relief of this temp crew effects items
	*/
	@Override
	public void setEffectsIneligibleForRelief(
		java.lang.String effectsIneligibleForRelief) {
		_tempCrewEffectsItems.setEffectsIneligibleForRelief(effectsIneligibleForRelief);
	}

	@Override
	public boolean isNew() {
		return _tempCrewEffectsItems.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempCrewEffectsItems.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempCrewEffectsItems.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempCrewEffectsItems.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempCrewEffectsItems.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempCrewEffectsItems.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempCrewEffectsItems.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempCrewEffectsItems.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempCrewEffectsItems.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempCrewEffectsItems.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempCrewEffectsItems.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempCrewEffectsItemsWrapper((TempCrewEffectsItems)_tempCrewEffectsItems.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.TempCrewEffectsItems tempCrewEffectsItems) {
		return _tempCrewEffectsItems.compareTo(tempCrewEffectsItems);
	}

	@Override
	public int hashCode() {
		return _tempCrewEffectsItems.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.TempCrewEffectsItems> toCacheModel() {
		return _tempCrewEffectsItems.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewEffectsItems toEscapedModel() {
		return new TempCrewEffectsItemsWrapper(_tempCrewEffectsItems.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewEffectsItems toUnescapedModel() {
		return new TempCrewEffectsItemsWrapper(_tempCrewEffectsItems.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempCrewEffectsItems.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempCrewEffectsItems.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempCrewEffectsItems.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempCrewEffectsItemsWrapper)) {
			return false;
		}

		TempCrewEffectsItemsWrapper tempCrewEffectsItemsWrapper = (TempCrewEffectsItemsWrapper)obj;

		if (Validator.equals(_tempCrewEffectsItems,
					tempCrewEffectsItemsWrapper._tempCrewEffectsItems)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempCrewEffectsItems getWrappedTempCrewEffectsItems() {
		return _tempCrewEffectsItems;
	}

	@Override
	public TempCrewEffectsItems getWrappedModel() {
		return _tempCrewEffectsItems;
	}

	@Override
	public void resetOriginalValues() {
		_tempCrewEffectsItems.resetOriginalValues();
	}

	private TempCrewEffectsItems _tempCrewEffectsItems;
}