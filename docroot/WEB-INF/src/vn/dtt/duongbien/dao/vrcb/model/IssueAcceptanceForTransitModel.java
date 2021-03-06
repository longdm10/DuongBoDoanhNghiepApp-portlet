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
 * The base model interface for the IssueAcceptanceForTransit service. Represents a row in the &quot;ISSUE_ACCEPTANCE_FOR_TRANSIT&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueAcceptanceForTransitModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueAcceptanceForTransitImpl}.
 * </p>
 *
 * @author longdm
 * @see IssueAcceptanceForTransit
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.IssueAcceptanceForTransitImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.IssueAcceptanceForTransitModelImpl
 * @generated
 */
public interface IssueAcceptanceForTransitModel extends BaseModel<IssueAcceptanceForTransit> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a issue acceptance for transit model instance should use the {@link IssueAcceptanceForTransit} interface instead.
	 */

	/**
	 * Returns the primary key of this issue acceptance for transit.
	 *
	 * @return the primary key of this issue acceptance for transit
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this issue acceptance for transit.
	 *
	 * @param primaryKey the primary key of this issue acceptance for transit
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this issue acceptance for transit.
	 *
	 * @return the ID of this issue acceptance for transit
	 */
	public long getId();

	/**
	 * Sets the ID of this issue acceptance for transit.
	 *
	 * @param id the ID of this issue acceptance for transit
	 */
	public void setId(long id);

	/**
	 * Returns the request code of this issue acceptance for transit.
	 *
	 * @return the request code of this issue acceptance for transit
	 */
	@AutoEscape
	public String getRequestCode();

	/**
	 * Sets the request code of this issue acceptance for transit.
	 *
	 * @param requestCode the request code of this issue acceptance for transit
	 */
	public void setRequestCode(String requestCode);

	/**
	 * Returns the number acceptance for transit of this issue acceptance for transit.
	 *
	 * @return the number acceptance for transit of this issue acceptance for transit
	 */
	@AutoEscape
	public String getNumberAcceptanceForTransit();

	/**
	 * Sets the number acceptance for transit of this issue acceptance for transit.
	 *
	 * @param numberAcceptanceForTransit the number acceptance for transit of this issue acceptance for transit
	 */
	public void setNumberAcceptanceForTransit(String numberAcceptanceForTransit);

	/**
	 * Returns the document name of this issue acceptance for transit.
	 *
	 * @return the document name of this issue acceptance for transit
	 */
	public long getDocumentName();

	/**
	 * Sets the document name of this issue acceptance for transit.
	 *
	 * @param documentName the document name of this issue acceptance for transit
	 */
	public void setDocumentName(long documentName);

	/**
	 * Returns the document year of this issue acceptance for transit.
	 *
	 * @return the document year of this issue acceptance for transit
	 */
	public int getDocumentYear();

	/**
	 * Sets the document year of this issue acceptance for transit.
	 *
	 * @param documentYear the document year of this issue acceptance for transit
	 */
	public void setDocumentYear(int documentYear);

	/**
	 * Returns the name of ship of this issue acceptance for transit.
	 *
	 * @return the name of ship of this issue acceptance for transit
	 */
	@AutoEscape
	public String getNameOfShip();

	/**
	 * Sets the name of ship of this issue acceptance for transit.
	 *
	 * @param nameOfShip the name of ship of this issue acceptance for transit
	 */
	public void setNameOfShip(String nameOfShip);

	/**
	 * Returns the flag state of ship of this issue acceptance for transit.
	 *
	 * @return the flag state of ship of this issue acceptance for transit
	 */
	@AutoEscape
	public String getFlagStateOfShip();

	/**
	 * Sets the flag state of ship of this issue acceptance for transit.
	 *
	 * @param flagStateOfShip the flag state of ship of this issue acceptance for transit
	 */
	public void setFlagStateOfShip(String flagStateOfShip);

	/**
	 * Returns the call sign of this issue acceptance for transit.
	 *
	 * @return the call sign of this issue acceptance for transit
	 */
	@AutoEscape
	public String getCallSign();

	/**
	 * Sets the call sign of this issue acceptance for transit.
	 *
	 * @param callSign the call sign of this issue acceptance for transit
	 */
	public void setCallSign(String callSign);

	/**
	 * Returns the name of master of this issue acceptance for transit.
	 *
	 * @return the name of master of this issue acceptance for transit
	 */
	@AutoEscape
	public String getNameOfMaster();

	/**
	 * Sets the name of master of this issue acceptance for transit.
	 *
	 * @param nameOfMaster the name of master of this issue acceptance for transit
	 */
	public void setNameOfMaster(String nameOfMaster);

	/**
	 * Returns the loa of this issue acceptance for transit.
	 *
	 * @return the loa of this issue acceptance for transit
	 */
	public double getLoa();

	/**
	 * Sets the loa of this issue acceptance for transit.
	 *
	 * @param loa the loa of this issue acceptance for transit
	 */
	public void setLoa(double loa);

	/**
	 * Returns the unit l o a of this issue acceptance for transit.
	 *
	 * @return the unit l o a of this issue acceptance for transit
	 */
	@AutoEscape
	public String getUnitLOA();

	/**
	 * Sets the unit l o a of this issue acceptance for transit.
	 *
	 * @param unitLOA the unit l o a of this issue acceptance for transit
	 */
	public void setUnitLOA(String unitLOA);

	/**
	 * Returns the breadth of this issue acceptance for transit.
	 *
	 * @return the breadth of this issue acceptance for transit
	 */
	public double getBreadth();

	/**
	 * Sets the breadth of this issue acceptance for transit.
	 *
	 * @param breadth the breadth of this issue acceptance for transit
	 */
	public void setBreadth(double breadth);

	/**
	 * Returns the unit breadth of this issue acceptance for transit.
	 *
	 * @return the unit breadth of this issue acceptance for transit
	 */
	@AutoEscape
	public String getUnitBreadth();

	/**
	 * Sets the unit breadth of this issue acceptance for transit.
	 *
	 * @param unitBreadth the unit breadth of this issue acceptance for transit
	 */
	public void setUnitBreadth(String unitBreadth);

	/**
	 * Returns the gross tonnage of this issue acceptance for transit.
	 *
	 * @return the gross tonnage of this issue acceptance for transit
	 */
	public double getGrossTonnage();

	/**
	 * Sets the gross tonnage of this issue acceptance for transit.
	 *
	 * @param grossTonnage the gross tonnage of this issue acceptance for transit
	 */
	public void setGrossTonnage(double grossTonnage);

	/**
	 * Returns the gross tonnage unit of this issue acceptance for transit.
	 *
	 * @return the gross tonnage unit of this issue acceptance for transit
	 */
	@AutoEscape
	public String getGrossTonnageUnit();

	/**
	 * Sets the gross tonnage unit of this issue acceptance for transit.
	 *
	 * @param grossTonnageUnit the gross tonnage unit of this issue acceptance for transit
	 */
	public void setGrossTonnageUnit(String grossTonnageUnit);

	/**
	 * Returns the net tonnage of this issue acceptance for transit.
	 *
	 * @return the net tonnage of this issue acceptance for transit
	 */
	public double getNetTonnage();

	/**
	 * Sets the net tonnage of this issue acceptance for transit.
	 *
	 * @param netTonnage the net tonnage of this issue acceptance for transit
	 */
	public void setNetTonnage(double netTonnage);

	/**
	 * Returns the net tonnage unit of this issue acceptance for transit.
	 *
	 * @return the net tonnage unit of this issue acceptance for transit
	 */
	@AutoEscape
	public String getNetTonnageUnit();

	/**
	 * Sets the net tonnage unit of this issue acceptance for transit.
	 *
	 * @param netTonnageUnit the net tonnage unit of this issue acceptance for transit
	 */
	public void setNetTonnageUnit(String netTonnageUnit);

	/**
	 * Returns the dwt of this issue acceptance for transit.
	 *
	 * @return the dwt of this issue acceptance for transit
	 */
	public double getDwt();

	/**
	 * Sets the dwt of this issue acceptance for transit.
	 *
	 * @param dwt the dwt of this issue acceptance for transit
	 */
	public void setDwt(double dwt);

	/**
	 * Returns the unit d w t of this issue acceptance for transit.
	 *
	 * @return the unit d w t of this issue acceptance for transit
	 */
	@AutoEscape
	public String getUnitDWT();

	/**
	 * Sets the unit d w t of this issue acceptance for transit.
	 *
	 * @param unitDWT the unit d w t of this issue acceptance for transit
	 */
	public void setUnitDWT(String unitDWT);

	/**
	 * Returns the shown draftx f of this issue acceptance for transit.
	 *
	 * @return the shown draftx f of this issue acceptance for transit
	 */
	public double getShownDraftxF();

	/**
	 * Sets the shown draftx f of this issue acceptance for transit.
	 *
	 * @param shownDraftxF the shown draftx f of this issue acceptance for transit
	 */
	public void setShownDraftxF(double shownDraftxF);

	/**
	 * Returns the unit shown draftx f of this issue acceptance for transit.
	 *
	 * @return the unit shown draftx f of this issue acceptance for transit
	 */
	@AutoEscape
	public String getUnitShownDraftxF();

	/**
	 * Sets the unit shown draftx f of this issue acceptance for transit.
	 *
	 * @param unitShownDraftxF the unit shown draftx f of this issue acceptance for transit
	 */
	public void setUnitShownDraftxF(String unitShownDraftxF);

	/**
	 * Returns the shown draftx a of this issue acceptance for transit.
	 *
	 * @return the shown draftx a of this issue acceptance for transit
	 */
	public double getShownDraftxA();

	/**
	 * Sets the shown draftx a of this issue acceptance for transit.
	 *
	 * @param shownDraftxA the shown draftx a of this issue acceptance for transit
	 */
	public void setShownDraftxA(double shownDraftxA);

	/**
	 * Returns the unit shown draftx a of this issue acceptance for transit.
	 *
	 * @return the unit shown draftx a of this issue acceptance for transit
	 */
	@AutoEscape
	public String getUnitShownDraftxA();

	/**
	 * Sets the unit shown draftx a of this issue acceptance for transit.
	 *
	 * @param unitShownDraftxA the unit shown draftx a of this issue acceptance for transit
	 */
	public void setUnitShownDraftxA(String unitShownDraftxA);

	/**
	 * Returns the clearance height of this issue acceptance for transit.
	 *
	 * @return the clearance height of this issue acceptance for transit
	 */
	public double getClearanceHeight();

	/**
	 * Sets the clearance height of this issue acceptance for transit.
	 *
	 * @param clearanceHeight the clearance height of this issue acceptance for transit
	 */
	public void setClearanceHeight(double clearanceHeight);

	/**
	 * Returns the unit clearance height of this issue acceptance for transit.
	 *
	 * @return the unit clearance height of this issue acceptance for transit
	 */
	@AutoEscape
	public String getUnitClearanceHeight();

	/**
	 * Sets the unit clearance height of this issue acceptance for transit.
	 *
	 * @param unitClearanceHeight the unit clearance height of this issue acceptance for transit
	 */
	public void setUnitClearanceHeight(String unitClearanceHeight);

	/**
	 * Returns the permitted transit from of this issue acceptance for transit.
	 *
	 * @return the permitted transit from of this issue acceptance for transit
	 */
	public Date getPermittedTransitFrom();

	/**
	 * Sets the permitted transit from of this issue acceptance for transit.
	 *
	 * @param permittedTransitFrom the permitted transit from of this issue acceptance for transit
	 */
	public void setPermittedTransitFrom(Date permittedTransitFrom);

	/**
	 * Returns the permitted transit to of this issue acceptance for transit.
	 *
	 * @return the permitted transit to of this issue acceptance for transit
	 */
	public Date getPermittedTransitTo();

	/**
	 * Sets the permitted transit to of this issue acceptance for transit.
	 *
	 * @param permittedTransitTo the permitted transit to of this issue acceptance for transit
	 */
	public void setPermittedTransitTo(Date permittedTransitTo);

	/**
	 * Returns the time of departure of this issue acceptance for transit.
	 *
	 * @return the time of departure of this issue acceptance for transit
	 */
	public Date getTimeOfDeparture();

	/**
	 * Sets the time of departure of this issue acceptance for transit.
	 *
	 * @param timeOfDeparture the time of departure of this issue acceptance for transit
	 */
	public void setTimeOfDeparture(Date timeOfDeparture);

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
	public int compareTo(IssueAcceptanceForTransit issueAcceptanceForTransit);

	@Override
	public int hashCode();

	@Override
	public CacheModel<IssueAcceptanceForTransit> toCacheModel();

	@Override
	public IssueAcceptanceForTransit toEscapedModel();

	@Override
	public IssueAcceptanceForTransit toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}