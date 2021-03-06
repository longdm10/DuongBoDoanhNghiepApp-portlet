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
 * The base model interface for the TempNoTiceShipMessage service. Represents a row in the &quot;TEMP_NOTICE_SHIP_MESSAGE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageImpl}.
 * </p>
 *
 * @author longdm
 * @see TempNoTiceShipMessage
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageModelImpl
 * @generated
 */
public interface TempNoTiceShipMessageModel extends BaseModel<TempNoTiceShipMessage> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a temp no tice ship message model instance should use the {@link TempNoTiceShipMessage} interface instead.
	 */

	/**
	 * Returns the primary key of this temp no tice ship message.
	 *
	 * @return the primary key of this temp no tice ship message
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this temp no tice ship message.
	 *
	 * @param primaryKey the primary key of this temp no tice ship message
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this temp no tice ship message.
	 *
	 * @return the ID of this temp no tice ship message
	 */
	public long getId();

	/**
	 * Sets the ID of this temp no tice ship message.
	 *
	 * @param id the ID of this temp no tice ship message
	 */
	public void setId(long id);

	/**
	 * Returns the request code of this temp no tice ship message.
	 *
	 * @return the request code of this temp no tice ship message
	 */
	@AutoEscape
	public String getRequestCode();

	/**
	 * Sets the request code of this temp no tice ship message.
	 *
	 * @param requestCode the request code of this temp no tice ship message
	 */
	public void setRequestCode(String requestCode);

	/**
	 * Returns the request state of this temp no tice ship message.
	 *
	 * @return the request state of this temp no tice ship message
	 */
	public int getRequestState();

	/**
	 * Sets the request state of this temp no tice ship message.
	 *
	 * @param requestState the request state of this temp no tice ship message
	 */
	public void setRequestState(int requestState);

	/**
	 * Returns the notice ship type of this temp no tice ship message.
	 *
	 * @return the notice ship type of this temp no tice ship message
	 */
	@AutoEscape
	public String getNoticeShipType();

	/**
	 * Sets the notice ship type of this temp no tice ship message.
	 *
	 * @param noticeShipType the notice ship type of this temp no tice ship message
	 */
	public void setNoticeShipType(String noticeShipType);

	/**
	 * Returns the notice ship code of this temp no tice ship message.
	 *
	 * @return the notice ship code of this temp no tice ship message
	 */
	@AutoEscape
	public String getNoticeShipCode();

	/**
	 * Sets the notice ship code of this temp no tice ship message.
	 *
	 * @param noticeShipCode the notice ship code of this temp no tice ship message
	 */
	public void setNoticeShipCode(String noticeShipCode);

	/**
	 * Returns the document name of this temp no tice ship message.
	 *
	 * @return the document name of this temp no tice ship message
	 */
	public long getDocumentName();

	/**
	 * Sets the document name of this temp no tice ship message.
	 *
	 * @param documentName the document name of this temp no tice ship message
	 */
	public void setDocumentName(long documentName);

	/**
	 * Returns the user created of this temp no tice ship message.
	 *
	 * @return the user created of this temp no tice ship message
	 */
	@AutoEscape
	public String getUserCreated();

	/**
	 * Sets the user created of this temp no tice ship message.
	 *
	 * @param userCreated the user created of this temp no tice ship message
	 */
	public void setUserCreated(String userCreated);

	/**
	 * Returns the confirm time of this temp no tice ship message.
	 *
	 * @return the confirm time of this temp no tice ship message
	 */
	public int getConfirmTime();

	/**
	 * Sets the confirm time of this temp no tice ship message.
	 *
	 * @param confirmTime the confirm time of this temp no tice ship message
	 */
	public void setConfirmTime(int confirmTime);

	/**
	 * Returns the ship name of this temp no tice ship message.
	 *
	 * @return the ship name of this temp no tice ship message
	 */
	@AutoEscape
	public String getShipName();

	/**
	 * Sets the ship name of this temp no tice ship message.
	 *
	 * @param shipName the ship name of this temp no tice ship message
	 */
	public void setShipName(String shipName);

	/**
	 * Returns the ship type code of this temp no tice ship message.
	 *
	 * @return the ship type code of this temp no tice ship message
	 */
	@AutoEscape
	public String getShipTypeCode();

	/**
	 * Sets the ship type code of this temp no tice ship message.
	 *
	 * @param shipTypeCode the ship type code of this temp no tice ship message
	 */
	public void setShipTypeCode(String shipTypeCode);

	/**
	 * Returns the state code of this temp no tice ship message.
	 *
	 * @return the state code of this temp no tice ship message
	 */
	@AutoEscape
	public String getStateCode();

	/**
	 * Sets the state code of this temp no tice ship message.
	 *
	 * @param stateCode the state code of this temp no tice ship message
	 */
	public void setStateCode(String stateCode);

	/**
	 * Returns the ship captain of this temp no tice ship message.
	 *
	 * @return the ship captain of this temp no tice ship message
	 */
	@AutoEscape
	public String getShipCaptain();

	/**
	 * Sets the ship captain of this temp no tice ship message.
	 *
	 * @param shipCaptain the ship captain of this temp no tice ship message
	 */
	public void setShipCaptain(String shipCaptain);

	/**
	 * Returns the imo of this temp no tice ship message.
	 *
	 * @return the imo of this temp no tice ship message
	 */
	@AutoEscape
	public String getImo();

	/**
	 * Sets the imo of this temp no tice ship message.
	 *
	 * @param imo the imo of this temp no tice ship message
	 */
	public void setImo(String imo);

	/**
	 * Returns the grt of this temp no tice ship message.
	 *
	 * @return the grt of this temp no tice ship message
	 */
	public double getGrt();

	/**
	 * Sets the grt of this temp no tice ship message.
	 *
	 * @param grt the grt of this temp no tice ship message
	 */
	public void setGrt(double grt);

	/**
	 * Returns the dwt of this temp no tice ship message.
	 *
	 * @return the dwt of this temp no tice ship message
	 */
	public double getDwt();

	/**
	 * Sets the dwt of this temp no tice ship message.
	 *
	 * @param dwt the dwt of this temp no tice ship message
	 */
	public void setDwt(double dwt);

	/**
	 * Returns the unit g r t of this temp no tice ship message.
	 *
	 * @return the unit g r t of this temp no tice ship message
	 */
	@AutoEscape
	public String getUnitGRT();

	/**
	 * Sets the unit g r t of this temp no tice ship message.
	 *
	 * @param unitGRT the unit g r t of this temp no tice ship message
	 */
	public void setUnitGRT(String unitGRT);

	/**
	 * Returns the unit d w t of this temp no tice ship message.
	 *
	 * @return the unit d w t of this temp no tice ship message
	 */
	@AutoEscape
	public String getUnitDWT();

	/**
	 * Sets the unit d w t of this temp no tice ship message.
	 *
	 * @param unitDWT the unit d w t of this temp no tice ship message
	 */
	public void setUnitDWT(String unitDWT);

	/**
	 * Returns the call sign of this temp no tice ship message.
	 *
	 * @return the call sign of this temp no tice ship message
	 */
	@AutoEscape
	public String getCallSign();

	/**
	 * Sets the call sign of this temp no tice ship message.
	 *
	 * @param callSign the call sign of this temp no tice ship message
	 */
	public void setCallSign(String callSign);

	/**
	 * Returns the arrival date of this temp no tice ship message.
	 *
	 * @return the arrival date of this temp no tice ship message
	 */
	public Date getArrivalDate();

	/**
	 * Sets the arrival date of this temp no tice ship message.
	 *
	 * @param arrivalDate the arrival date of this temp no tice ship message
	 */
	public void setArrivalDate(Date arrivalDate);

	/**
	 * Returns the arrival port code of this temp no tice ship message.
	 *
	 * @return the arrival port code of this temp no tice ship message
	 */
	@AutoEscape
	public String getArrivalPortCode();

	/**
	 * Sets the arrival port code of this temp no tice ship message.
	 *
	 * @param arrivalPortCode the arrival port code of this temp no tice ship message
	 */
	public void setArrivalPortCode(String arrivalPortCode);

	/**
	 * Returns the port harbour code of this temp no tice ship message.
	 *
	 * @return the port harbour code of this temp no tice ship message
	 */
	@AutoEscape
	public String getPortHarbourCode();

	/**
	 * Sets the port harbour code of this temp no tice ship message.
	 *
	 * @param portHarbourCode the port harbour code of this temp no tice ship message
	 */
	public void setPortHarbourCode(String portHarbourCode);

	/**
	 * Returns the port region code of this temp no tice ship message.
	 *
	 * @return the port region code of this temp no tice ship message
	 */
	@AutoEscape
	public String getPortRegionCode();

	/**
	 * Sets the port region code of this temp no tice ship message.
	 *
	 * @param portRegionCode the port region code of this temp no tice ship message
	 */
	public void setPortRegionCode(String portRegionCode);

	/**
	 * Returns the port wharf code of this temp no tice ship message.
	 *
	 * @return the port wharf code of this temp no tice ship message
	 */
	@AutoEscape
	public String getPortWharfCode();

	/**
	 * Sets the port wharf code of this temp no tice ship message.
	 *
	 * @param portWharfCode the port wharf code of this temp no tice ship message
	 */
	public void setPortWharfCode(String portWharfCode);

	/**
	 * Returns the port going to state name of this temp no tice ship message.
	 *
	 * @return the port going to state name of this temp no tice ship message
	 */
	@AutoEscape
	public String getPortGoingToStateName();

	/**
	 * Sets the port going to state name of this temp no tice ship message.
	 *
	 * @param portGoingToStateName the port going to state name of this temp no tice ship message
	 */
	public void setPortGoingToStateName(String portGoingToStateName);

	/**
	 * Returns the port going to code of this temp no tice ship message.
	 *
	 * @return the port going to code of this temp no tice ship message
	 */
	@AutoEscape
	public String getPortGoingToCode();

	/**
	 * Sets the port going to code of this temp no tice ship message.
	 *
	 * @param portGoingToCode the port going to code of this temp no tice ship message
	 */
	public void setPortGoingToCode(String portGoingToCode);

	/**
	 * Returns the name of ship owners of this temp no tice ship message.
	 *
	 * @return the name of ship owners of this temp no tice ship message
	 */
	@AutoEscape
	public String getNameOfShipOwners();

	/**
	 * Sets the name of ship owners of this temp no tice ship message.
	 *
	 * @param nameOfShipOwners the name of ship owners of this temp no tice ship message
	 */
	public void setNameOfShipOwners(String nameOfShipOwners);

	/**
	 * Returns the address of ship owners of this temp no tice ship message.
	 *
	 * @return the address of ship owners of this temp no tice ship message
	 */
	@AutoEscape
	public String getAddressOfShipOwners();

	/**
	 * Sets the address of ship owners of this temp no tice ship message.
	 *
	 * @param addressOfShipOwners the address of ship owners of this temp no tice ship message
	 */
	public void setAddressOfShipOwners(String addressOfShipOwners);

	/**
	 * Returns the ship ownerstate code of this temp no tice ship message.
	 *
	 * @return the ship ownerstate code of this temp no tice ship message
	 */
	@AutoEscape
	public String getShipOwnerstateCode();

	/**
	 * Sets the ship ownerstate code of this temp no tice ship message.
	 *
	 * @param shipOwnerstateCode the ship ownerstate code of this temp no tice ship message
	 */
	public void setShipOwnerstateCode(String shipOwnerstateCode);

	/**
	 * Returns the ship owner phone of this temp no tice ship message.
	 *
	 * @return the ship owner phone of this temp no tice ship message
	 */
	@AutoEscape
	public String getShipOwnerPhone();

	/**
	 * Sets the ship owner phone of this temp no tice ship message.
	 *
	 * @param shipOwnerPhone the ship owner phone of this temp no tice ship message
	 */
	public void setShipOwnerPhone(String shipOwnerPhone);

	/**
	 * Returns the ship owner fax of this temp no tice ship message.
	 *
	 * @return the ship owner fax of this temp no tice ship message
	 */
	@AutoEscape
	public String getShipOwnerFax();

	/**
	 * Sets the ship owner fax of this temp no tice ship message.
	 *
	 * @param shipOwnerFax the ship owner fax of this temp no tice ship message
	 */
	public void setShipOwnerFax(String shipOwnerFax);

	/**
	 * Returns the ship owner email of this temp no tice ship message.
	 *
	 * @return the ship owner email of this temp no tice ship message
	 */
	@AutoEscape
	public String getShipOwnerEmail();

	/**
	 * Sets the ship owner email of this temp no tice ship message.
	 *
	 * @param shipOwnerEmail the ship owner email of this temp no tice ship message
	 */
	public void setShipOwnerEmail(String shipOwnerEmail);

	/**
	 * Returns the loa of this temp no tice ship message.
	 *
	 * @return the loa of this temp no tice ship message
	 */
	public double getLoa();

	/**
	 * Sets the loa of this temp no tice ship message.
	 *
	 * @param loa the loa of this temp no tice ship message
	 */
	public void setLoa(double loa);

	/**
	 * Returns the breadth of this temp no tice ship message.
	 *
	 * @return the breadth of this temp no tice ship message
	 */
	public double getBreadth();

	/**
	 * Sets the breadth of this temp no tice ship message.
	 *
	 * @param breadth the breadth of this temp no tice ship message
	 */
	public void setBreadth(double breadth);

	/**
	 * Returns the clearance height of this temp no tice ship message.
	 *
	 * @return the clearance height of this temp no tice ship message
	 */
	public double getClearanceHeight();

	/**
	 * Sets the clearance height of this temp no tice ship message.
	 *
	 * @param clearanceHeight the clearance height of this temp no tice ship message
	 */
	public void setClearanceHeight(double clearanceHeight);

	/**
	 * Returns the shown draftx f of this temp no tice ship message.
	 *
	 * @return the shown draftx f of this temp no tice ship message
	 */
	public double getShownDraftxF();

	/**
	 * Sets the shown draftx f of this temp no tice ship message.
	 *
	 * @param shownDraftxF the shown draftx f of this temp no tice ship message
	 */
	public void setShownDraftxF(double shownDraftxF);

	/**
	 * Returns the shown draftx a of this temp no tice ship message.
	 *
	 * @return the shown draftx a of this temp no tice ship message
	 */
	public double getShownDraftxA();

	/**
	 * Sets the shown draftx a of this temp no tice ship message.
	 *
	 * @param shownDraftxA the shown draftx a of this temp no tice ship message
	 */
	public void setShownDraftxA(double shownDraftxA);

	/**
	 * Returns the unit l o a of this temp no tice ship message.
	 *
	 * @return the unit l o a of this temp no tice ship message
	 */
	@AutoEscape
	public String getUnitLOA();

	/**
	 * Sets the unit l o a of this temp no tice ship message.
	 *
	 * @param unitLOA the unit l o a of this temp no tice ship message
	 */
	public void setUnitLOA(String unitLOA);

	/**
	 * Returns the unit breadth of this temp no tice ship message.
	 *
	 * @return the unit breadth of this temp no tice ship message
	 */
	@AutoEscape
	public String getUnitBreadth();

	/**
	 * Sets the unit breadth of this temp no tice ship message.
	 *
	 * @param unitBreadth the unit breadth of this temp no tice ship message
	 */
	public void setUnitBreadth(String unitBreadth);

	/**
	 * Returns the unit clearance height of this temp no tice ship message.
	 *
	 * @return the unit clearance height of this temp no tice ship message
	 */
	@AutoEscape
	public String getUnitClearanceHeight();

	/**
	 * Sets the unit clearance height of this temp no tice ship message.
	 *
	 * @param unitClearanceHeight the unit clearance height of this temp no tice ship message
	 */
	public void setUnitClearanceHeight(String unitClearanceHeight);

	/**
	 * Returns the unit shown draftx f of this temp no tice ship message.
	 *
	 * @return the unit shown draftx f of this temp no tice ship message
	 */
	@AutoEscape
	public String getUnitShownDraftxF();

	/**
	 * Sets the unit shown draftx f of this temp no tice ship message.
	 *
	 * @param unitShownDraftxF the unit shown draftx f of this temp no tice ship message
	 */
	public void setUnitShownDraftxF(String unitShownDraftxF);

	/**
	 * Returns the unit shown draftx a of this temp no tice ship message.
	 *
	 * @return the unit shown draftx a of this temp no tice ship message
	 */
	@AutoEscape
	public String getUnitShownDraftxA();

	/**
	 * Sets the unit shown draftx a of this temp no tice ship message.
	 *
	 * @param unitShownDraftxA the unit shown draftx a of this temp no tice ship message
	 */
	public void setUnitShownDraftxA(String unitShownDraftxA);

	/**
	 * Returns the certificate of registry number of this temp no tice ship message.
	 *
	 * @return the certificate of registry number of this temp no tice ship message
	 */
	@AutoEscape
	public String getCertificateOfRegistryNumber();

	/**
	 * Sets the certificate of registry number of this temp no tice ship message.
	 *
	 * @param certificateOfRegistryNumber the certificate of registry number of this temp no tice ship message
	 */
	public void setCertificateOfRegistryNumber(
		String certificateOfRegistryNumber);

	/**
	 * Returns the certificate of registry date of this temp no tice ship message.
	 *
	 * @return the certificate of registry date of this temp no tice ship message
	 */
	public Date getCertificateOfRegistryDate();

	/**
	 * Sets the certificate of registry date of this temp no tice ship message.
	 *
	 * @param certificateOfRegistryDate the certificate of registry date of this temp no tice ship message
	 */
	public void setCertificateOfRegistryDate(Date certificateOfRegistryDate);

	/**
	 * Returns the certificate of registry port name of this temp no tice ship message.
	 *
	 * @return the certificate of registry port name of this temp no tice ship message
	 */
	@AutoEscape
	public String getCertificateOfRegistryPortName();

	/**
	 * Sets the certificate of registry port name of this temp no tice ship message.
	 *
	 * @param certificateOfRegistryPortName the certificate of registry port name of this temp no tice ship message
	 */
	public void setCertificateOfRegistryPortName(
		String certificateOfRegistryPortName);

	/**
	 * Returns the ship agency code of this temp no tice ship message.
	 *
	 * @return the ship agency code of this temp no tice ship message
	 */
	@AutoEscape
	public String getShipAgencyCode();

	/**
	 * Sets the ship agency code of this temp no tice ship message.
	 *
	 * @param shipAgencyCode the ship agency code of this temp no tice ship message
	 */
	public void setShipAgencyCode(String shipAgencyCode);

	/**
	 * Returns the ship agency address of this temp no tice ship message.
	 *
	 * @return the ship agency address of this temp no tice ship message
	 */
	@AutoEscape
	public String getShipAgencyAddress();

	/**
	 * Sets the ship agency address of this temp no tice ship message.
	 *
	 * @param shipAgencyAddress the ship agency address of this temp no tice ship message
	 */
	public void setShipAgencyAddress(String shipAgencyAddress);

	/**
	 * Returns the ship agency phone of this temp no tice ship message.
	 *
	 * @return the ship agency phone of this temp no tice ship message
	 */
	@AutoEscape
	public String getShipAgencyPhone();

	/**
	 * Sets the ship agency phone of this temp no tice ship message.
	 *
	 * @param shipAgencyPhone the ship agency phone of this temp no tice ship message
	 */
	public void setShipAgencyPhone(String shipAgencyPhone);

	/**
	 * Returns the ship agency fax of this temp no tice ship message.
	 *
	 * @return the ship agency fax of this temp no tice ship message
	 */
	@AutoEscape
	public String getShipAgencyFax();

	/**
	 * Sets the ship agency fax of this temp no tice ship message.
	 *
	 * @param shipAgencyFax the ship agency fax of this temp no tice ship message
	 */
	public void setShipAgencyFax(String shipAgencyFax);

	/**
	 * Returns the ship agency email of this temp no tice ship message.
	 *
	 * @return the ship agency email of this temp no tice ship message
	 */
	@AutoEscape
	public String getShipAgencyEmail();

	/**
	 * Sets the ship agency email of this temp no tice ship message.
	 *
	 * @param shipAgencyEmail the ship agency email of this temp no tice ship message
	 */
	public void setShipAgencyEmail(String shipAgencyEmail);

	/**
	 * Returns the purpose code of this temp no tice ship message.
	 *
	 * @return the purpose code of this temp no tice ship message
	 */
	@AutoEscape
	public String getPurposeCode();

	/**
	 * Sets the purpose code of this temp no tice ship message.
	 *
	 * @param purposeCode the purpose code of this temp no tice ship message
	 */
	public void setPurposeCode(String purposeCode);

	/**
	 * Returns the purpose specified of this temp no tice ship message.
	 *
	 * @return the purpose specified of this temp no tice ship message
	 */
	@AutoEscape
	public String getPurposeSpecified();

	/**
	 * Sets the purpose specified of this temp no tice ship message.
	 *
	 * @param purposeSpecified the purpose specified of this temp no tice ship message
	 */
	public void setPurposeSpecified(String purposeSpecified);

	/**
	 * Returns the crew number of this temp no tice ship message.
	 *
	 * @return the crew number of this temp no tice ship message
	 */
	public long getCrewNumber();

	/**
	 * Sets the crew number of this temp no tice ship message.
	 *
	 * @param crewNumber the crew number of this temp no tice ship message
	 */
	public void setCrewNumber(long crewNumber);

	/**
	 * Returns the unit crew of this temp no tice ship message.
	 *
	 * @return the unit crew of this temp no tice ship message
	 */
	@AutoEscape
	public String getUnitCrew();

	/**
	 * Sets the unit crew of this temp no tice ship message.
	 *
	 * @param unitCrew the unit crew of this temp no tice ship message
	 */
	public void setUnitCrew(String unitCrew);

	/**
	 * Returns the passenger number of this temp no tice ship message.
	 *
	 * @return the passenger number of this temp no tice ship message
	 */
	public long getPassengerNumber();

	/**
	 * Sets the passenger number of this temp no tice ship message.
	 *
	 * @param passengerNumber the passenger number of this temp no tice ship message
	 */
	public void setPassengerNumber(long passengerNumber);

	/**
	 * Returns the unit passenger of this temp no tice ship message.
	 *
	 * @return the unit passenger of this temp no tice ship message
	 */
	@AutoEscape
	public String getUnitPassenger();

	/**
	 * Sets the unit passenger of this temp no tice ship message.
	 *
	 * @param unitPassenger the unit passenger of this temp no tice ship message
	 */
	public void setUnitPassenger(String unitPassenger);

	/**
	 * Returns the quantity and type of cargo of this temp no tice ship message.
	 *
	 * @return the quantity and type of cargo of this temp no tice ship message
	 */
	@AutoEscape
	public String getQuantityAndTypeOfCargo();

	/**
	 * Sets the quantity and type of cargo of this temp no tice ship message.
	 *
	 * @param quantityAndTypeOfCargo the quantity and type of cargo of this temp no tice ship message
	 */
	public void setQuantityAndTypeOfCargo(String quantityAndTypeOfCargo);

	/**
	 * Returns the unit quantityof cargo of this temp no tice ship message.
	 *
	 * @return the unit quantityof cargo of this temp no tice ship message
	 */
	@AutoEscape
	public String getUnitQuantityofCargo();

	/**
	 * Sets the unit quantityof cargo of this temp no tice ship message.
	 *
	 * @param unitQuantityofCargo the unit quantityof cargo of this temp no tice ship message
	 */
	public void setUnitQuantityofCargo(String unitQuantityofCargo);

	/**
	 * Returns the type of cargo of this temp no tice ship message.
	 *
	 * @return the type of cargo of this temp no tice ship message
	 */
	@AutoEscape
	public String getTypeOfCargo();

	/**
	 * Sets the type of cargo of this temp no tice ship message.
	 *
	 * @param typeOfCargo the type of cargo of this temp no tice ship message
	 */
	public void setTypeOfCargo(String typeOfCargo);

	/**
	 * Returns the other persons of this temp no tice ship message.
	 *
	 * @return the other persons of this temp no tice ship message
	 */
	public int getOtherPersons();

	/**
	 * Sets the other persons of this temp no tice ship message.
	 *
	 * @param otherPersons the other persons of this temp no tice ship message
	 */
	public void setOtherPersons(int otherPersons);

	/**
	 * Returns the remarks of this temp no tice ship message.
	 *
	 * @return the remarks of this temp no tice ship message
	 */
	@AutoEscape
	public String getRemarks();

	/**
	 * Sets the remarks of this temp no tice ship message.
	 *
	 * @param remarks the remarks of this temp no tice ship message
	 */
	public void setRemarks(String remarks);

	/**
	 * Returns the sign place of this temp no tice ship message.
	 *
	 * @return the sign place of this temp no tice ship message
	 */
	@AutoEscape
	public String getSignPlace();

	/**
	 * Sets the sign place of this temp no tice ship message.
	 *
	 * @param signPlace the sign place of this temp no tice ship message
	 */
	public void setSignPlace(String signPlace);

	/**
	 * Returns the sign date of this temp no tice ship message.
	 *
	 * @return the sign date of this temp no tice ship message
	 */
	public Date getSignDate();

	/**
	 * Sets the sign date of this temp no tice ship message.
	 *
	 * @param signDate the sign date of this temp no tice ship message
	 */
	public void setSignDate(Date signDate);

	/**
	 * Returns the master signed of this temp no tice ship message.
	 *
	 * @return the master signed of this temp no tice ship message
	 */
	public int getMasterSigned();

	/**
	 * Sets the master signed of this temp no tice ship message.
	 *
	 * @param masterSigned the master signed of this temp no tice ship message
	 */
	public void setMasterSigned(int masterSigned);

	/**
	 * Returns the master signed image of this temp no tice ship message.
	 *
	 * @return the master signed image of this temp no tice ship message
	 */
	public int getMasterSignedImage();

	/**
	 * Sets the master signed image of this temp no tice ship message.
	 *
	 * @param masterSignedImage the master signed image of this temp no tice ship message
	 */
	public void setMasterSignedImage(int masterSignedImage);

	/**
	 * Returns the document year of this temp no tice ship message.
	 *
	 * @return the document year of this temp no tice ship message
	 */
	public int getDocumentYear();

	/**
	 * Sets the document year of this temp no tice ship message.
	 *
	 * @param documentYear the document year of this temp no tice ship message
	 */
	public void setDocumentYear(int documentYear);

	/**
	 * Returns the name of ship agent of this temp no tice ship message.
	 *
	 * @return the name of ship agent of this temp no tice ship message
	 */
	@AutoEscape
	public String getNameOfShipAgent();

	/**
	 * Sets the name of ship agent of this temp no tice ship message.
	 *
	 * @param nameOfShipAgent the name of ship agent of this temp no tice ship message
	 */
	public void setNameOfShipAgent(String nameOfShipAgent);

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
	public int compareTo(TempNoTiceShipMessage tempNoTiceShipMessage);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TempNoTiceShipMessage> toCacheModel();

	@Override
	public TempNoTiceShipMessage toEscapedModel();

	@Override
	public TempNoTiceShipMessage toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}