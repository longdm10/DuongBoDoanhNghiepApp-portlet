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

import java.util.Date;

/**
 * The base model interface for the DmHistoryRankRating service. Represents a row in the &quot;DM_HISTORY_RANK_RATING&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryRankRatingModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryRankRatingImpl}.
 * </p>
 *
 * @author longdm
 * @see DmHistoryRankRating
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryRankRatingImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryRankRatingModelImpl
 * @generated
 */
public interface DmHistoryRankRatingModel extends BaseModel<DmHistoryRankRating> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dm history rank rating model instance should use the {@link DmHistoryRankRating} interface instead.
	 */

	/**
	 * Returns the primary key of this dm history rank rating.
	 *
	 * @return the primary key of this dm history rank rating
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this dm history rank rating.
	 *
	 * @param primaryKey the primary key of this dm history rank rating
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the ID of this dm history rank rating.
	 *
	 * @return the ID of this dm history rank rating
	 */
	public int getId();

	/**
	 * Sets the ID of this dm history rank rating.
	 *
	 * @param id the ID of this dm history rank rating
	 */
	public void setId(int id);

	/**
	 * Returns the rank code of this dm history rank rating.
	 *
	 * @return the rank code of this dm history rank rating
	 */
	@AutoEscape
	public String getRankCode();

	/**
	 * Sets the rank code of this dm history rank rating.
	 *
	 * @param rankCode the rank code of this dm history rank rating
	 */
	public void setRankCode(String rankCode);

	/**
	 * Returns the rank name of this dm history rank rating.
	 *
	 * @return the rank name of this dm history rank rating
	 */
	@AutoEscape
	public String getRankName();

	/**
	 * Sets the rank name of this dm history rank rating.
	 *
	 * @param rankName the rank name of this dm history rank rating
	 */
	public void setRankName(String rankName);

	/**
	 * Returns the rank name v n of this dm history rank rating.
	 *
	 * @return the rank name v n of this dm history rank rating
	 */
	@AutoEscape
	public String getRankNameVN();

	/**
	 * Sets the rank name v n of this dm history rank rating.
	 *
	 * @param rankNameVN the rank name v n of this dm history rank rating
	 */
	public void setRankNameVN(String rankNameVN);

	/**
	 * Returns the rank order of this dm history rank rating.
	 *
	 * @return the rank order of this dm history rank rating
	 */
	public int getRankOrder();

	/**
	 * Sets the rank order of this dm history rank rating.
	 *
	 * @param rankOrder the rank order of this dm history rank rating
	 */
	public void setRankOrder(int rankOrder);

	/**
	 * Returns the is delete of this dm history rank rating.
	 *
	 * @return the is delete of this dm history rank rating
	 */
	public int getIsDelete();

	/**
	 * Sets the is delete of this dm history rank rating.
	 *
	 * @param isDelete the is delete of this dm history rank rating
	 */
	public void setIsDelete(int isDelete);

	/**
	 * Returns the marked as delete of this dm history rank rating.
	 *
	 * @return the marked as delete of this dm history rank rating
	 */
	public int getMarkedAsDelete();

	/**
	 * Sets the marked as delete of this dm history rank rating.
	 *
	 * @param markedAsDelete the marked as delete of this dm history rank rating
	 */
	public void setMarkedAsDelete(int markedAsDelete);

	/**
	 * Returns the modified date of this dm history rank rating.
	 *
	 * @return the modified date of this dm history rank rating
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dm history rank rating.
	 *
	 * @param modifiedDate the modified date of this dm history rank rating
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the requested date of this dm history rank rating.
	 *
	 * @return the requested date of this dm history rank rating
	 */
	public Date getRequestedDate();

	/**
	 * Sets the requested date of this dm history rank rating.
	 *
	 * @param requestedDate the requested date of this dm history rank rating
	 */
	public void setRequestedDate(Date requestedDate);

	/**
	 * Returns the sync version of this dm history rank rating.
	 *
	 * @return the sync version of this dm history rank rating
	 */
	@AutoEscape
	public String getSyncVersion();

	/**
	 * Sets the sync version of this dm history rank rating.
	 *
	 * @param syncVersion the sync version of this dm history rank rating
	 */
	public void setSyncVersion(String syncVersion);

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
	public int compareTo(DmHistoryRankRating dmHistoryRankRating);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DmHistoryRankRating> toCacheModel();

	@Override
	public DmHistoryRankRating toEscapedModel();

	@Override
	public DmHistoryRankRating toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}