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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the TempCrewEffectsItems service. Represents a row in the &quot;TEMP_CREW_EFFECTS_ITEMS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsItemsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsItemsImpl}.
 * </p>
 *
 * @author longdm
 * @see TempCrewEffectsItems
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsItemsImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsItemsModelImpl
 * @generated
 */
public interface TempCrewEffectsItemsModel extends BaseModel<TempCrewEffectsItems> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a temp crew effects items model instance should use the {@link TempCrewEffectsItems} interface instead.
	 */

	/**
	 * Returns the primary key of this temp crew effects items.
	 *
	 * @return the primary key of this temp crew effects items
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this temp crew effects items.
	 *
	 * @param primaryKey the primary key of this temp crew effects items
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this temp crew effects items.
	 *
	 * @return the ID of this temp crew effects items
	 */
	public long getId();

	/**
	 * Sets the ID of this temp crew effects items.
	 *
	 * @param id the ID of this temp crew effects items
	 */
	public void setId(long id);

	/**
	 * Returns the request code of this temp crew effects items.
	 *
	 * @return the request code of this temp crew effects items
	 */
	@AutoEscape
	public String getRequestCode();

	/**
	 * Sets the request code of this temp crew effects items.
	 *
	 * @param requestCode the request code of this temp crew effects items
	 */
	public void setRequestCode(String requestCode);

	/**
	 * Returns the crew effect itemcode of this temp crew effects items.
	 *
	 * @return the crew effect itemcode of this temp crew effects items
	 */
	@AutoEscape
	public String getCrewEffectItemcode();

	/**
	 * Sets the crew effect itemcode of this temp crew effects items.
	 *
	 * @param crewEffectItemcode the crew effect itemcode of this temp crew effects items
	 */
	public void setCrewEffectItemcode(String crewEffectItemcode);

	/**
	 * Returns the family name of this temp crew effects items.
	 *
	 * @return the family name of this temp crew effects items
	 */
	@AutoEscape
	public String getFamilyName();

	/**
	 * Sets the family name of this temp crew effects items.
	 *
	 * @param familyName the family name of this temp crew effects items
	 */
	public void setFamilyName(String familyName);

	/**
	 * Returns the given name of this temp crew effects items.
	 *
	 * @return the given name of this temp crew effects items
	 */
	@AutoEscape
	public String getGivenName();

	/**
	 * Sets the given name of this temp crew effects items.
	 *
	 * @param givenName the given name of this temp crew effects items
	 */
	public void setGivenName(String givenName);

	/**
	 * Returns the rank orrating code of this temp crew effects items.
	 *
	 * @return the rank orrating code of this temp crew effects items
	 */
	@AutoEscape
	public String getRankOrratingCode();

	/**
	 * Sets the rank orrating code of this temp crew effects items.
	 *
	 * @param rankOrratingCode the rank orrating code of this temp crew effects items
	 */
	public void setRankOrratingCode(String rankOrratingCode);

	/**
	 * Returns the effects ineligible for relief of this temp crew effects items.
	 *
	 * @return the effects ineligible for relief of this temp crew effects items
	 */
	@AutoEscape
	public String getEffectsIneligibleForRelief();

	/**
	 * Sets the effects ineligible for relief of this temp crew effects items.
	 *
	 * @param effectsIneligibleForRelief the effects ineligible for relief of this temp crew effects items
	 */
	public void setEffectsIneligibleForRelief(String effectsIneligibleForRelief);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(TempCrewEffectsItems tempCrewEffectsItems);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TempCrewEffectsItems> toCacheModel();

	@Override
	public TempCrewEffectsItems toEscapedModel();

	@Override
	public TempCrewEffectsItems toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}