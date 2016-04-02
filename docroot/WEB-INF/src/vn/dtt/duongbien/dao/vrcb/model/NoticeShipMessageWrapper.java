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
 * This class is a wrapper for {@link NoticeShipMessage}.
 * </p>
 *
 * @author longdm
 * @see NoticeShipMessage
 * @generated
 */
public class NoticeShipMessageWrapper implements NoticeShipMessage,
	ModelWrapper<NoticeShipMessage> {
	public NoticeShipMessageWrapper(NoticeShipMessage noticeShipMessage) {
		_noticeShipMessage = noticeShipMessage;
	}

	@Override
	public Class<?> getModelClass() {
		return NoticeShipMessage.class;
	}

	@Override
	public String getModelClassName() {
		return NoticeShipMessage.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("noticeShipCode", getNoticeShipCode());
		attributes.put("documentName", getDocumentName());
		attributes.put("userCreated", getUserCreated());
		attributes.put("confirmTime", getConfirmTime());
		attributes.put("callSign", getCallSign());
		attributes.put("arrivalDate", getArrivalDate());
		attributes.put("arrivalPortCode", getArrivalPortCode());
		attributes.put("portGoingToCode", getPortGoingToCode());
		attributes.put("nameAndAddOfShipOwners", getNameAndAddOfShipOwners());
		attributes.put("clearanceHeight", getClearanceHeight());
		attributes.put("shownDraft", getShownDraft());
		attributes.put("dwt", getDwt());
		attributes.put("shipAgencyCode", getShipAgencyCode());
		attributes.put("purposeCode", getPurposeCode());
		attributes.put("crewNumber", getCrewNumber());
		attributes.put("passengerNumber", getPassengerNumber());
		attributes.put("quantityAndTypeOfCargo", getQuantityAndTypeOfCargo());
		attributes.put("otherPersons", getOtherPersons());
		attributes.put("remarks", getRemarks());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String noticeShipCode = (String)attributes.get("noticeShipCode");

		if (noticeShipCode != null) {
			setNoticeShipCode(noticeShipCode);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		String userCreated = (String)attributes.get("userCreated");

		if (userCreated != null) {
			setUserCreated(userCreated);
		}

		Integer confirmTime = (Integer)attributes.get("confirmTime");

		if (confirmTime != null) {
			setConfirmTime(confirmTime);
		}

		String callSign = (String)attributes.get("callSign");

		if (callSign != null) {
			setCallSign(callSign);
		}

		Date arrivalDate = (Date)attributes.get("arrivalDate");

		if (arrivalDate != null) {
			setArrivalDate(arrivalDate);
		}

		String arrivalPortCode = (String)attributes.get("arrivalPortCode");

		if (arrivalPortCode != null) {
			setArrivalPortCode(arrivalPortCode);
		}

		String portGoingToCode = (String)attributes.get("portGoingToCode");

		if (portGoingToCode != null) {
			setPortGoingToCode(portGoingToCode);
		}

		String nameAndAddOfShipOwners = (String)attributes.get(
				"nameAndAddOfShipOwners");

		if (nameAndAddOfShipOwners != null) {
			setNameAndAddOfShipOwners(nameAndAddOfShipOwners);
		}

		Long clearanceHeight = (Long)attributes.get("clearanceHeight");

		if (clearanceHeight != null) {
			setClearanceHeight(clearanceHeight);
		}

		Long shownDraft = (Long)attributes.get("shownDraft");

		if (shownDraft != null) {
			setShownDraft(shownDraft);
		}

		Long dwt = (Long)attributes.get("dwt");

		if (dwt != null) {
			setDwt(dwt);
		}

		String shipAgencyCode = (String)attributes.get("shipAgencyCode");

		if (shipAgencyCode != null) {
			setShipAgencyCode(shipAgencyCode);
		}

		Integer purposeCode = (Integer)attributes.get("purposeCode");

		if (purposeCode != null) {
			setPurposeCode(purposeCode);
		}

		Long crewNumber = (Long)attributes.get("crewNumber");

		if (crewNumber != null) {
			setCrewNumber(crewNumber);
		}

		Long passengerNumber = (Long)attributes.get("passengerNumber");

		if (passengerNumber != null) {
			setPassengerNumber(passengerNumber);
		}

		String quantityAndTypeOfCargo = (String)attributes.get(
				"quantityAndTypeOfCargo");

		if (quantityAndTypeOfCargo != null) {
			setQuantityAndTypeOfCargo(quantityAndTypeOfCargo);
		}

		Integer otherPersons = (Integer)attributes.get("otherPersons");

		if (otherPersons != null) {
			setOtherPersons(otherPersons);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}
	}

	/**
	* Returns the primary key of this notice ship message.
	*
	* @return the primary key of this notice ship message
	*/
	@Override
	public long getPrimaryKey() {
		return _noticeShipMessage.getPrimaryKey();
	}

	/**
	* Sets the primary key of this notice ship message.
	*
	* @param primaryKey the primary key of this notice ship message
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_noticeShipMessage.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this notice ship message.
	*
	* @return the ID of this notice ship message
	*/
	@Override
	public long getId() {
		return _noticeShipMessage.getId();
	}

	/**
	* Sets the ID of this notice ship message.
	*
	* @param id the ID of this notice ship message
	*/
	@Override
	public void setId(long id) {
		_noticeShipMessage.setId(id);
	}

	/**
	* Returns the notice ship code of this notice ship message.
	*
	* @return the notice ship code of this notice ship message
	*/
	@Override
	public java.lang.String getNoticeShipCode() {
		return _noticeShipMessage.getNoticeShipCode();
	}

	/**
	* Sets the notice ship code of this notice ship message.
	*
	* @param noticeShipCode the notice ship code of this notice ship message
	*/
	@Override
	public void setNoticeShipCode(java.lang.String noticeShipCode) {
		_noticeShipMessage.setNoticeShipCode(noticeShipCode);
	}

	/**
	* Returns the document name of this notice ship message.
	*
	* @return the document name of this notice ship message
	*/
	@Override
	public long getDocumentName() {
		return _noticeShipMessage.getDocumentName();
	}

	/**
	* Sets the document name of this notice ship message.
	*
	* @param documentName the document name of this notice ship message
	*/
	@Override
	public void setDocumentName(long documentName) {
		_noticeShipMessage.setDocumentName(documentName);
	}

	/**
	* Returns the user created of this notice ship message.
	*
	* @return the user created of this notice ship message
	*/
	@Override
	public java.lang.String getUserCreated() {
		return _noticeShipMessage.getUserCreated();
	}

	/**
	* Sets the user created of this notice ship message.
	*
	* @param userCreated the user created of this notice ship message
	*/
	@Override
	public void setUserCreated(java.lang.String userCreated) {
		_noticeShipMessage.setUserCreated(userCreated);
	}

	/**
	* Returns the confirm time of this notice ship message.
	*
	* @return the confirm time of this notice ship message
	*/
	@Override
	public int getConfirmTime() {
		return _noticeShipMessage.getConfirmTime();
	}

	/**
	* Sets the confirm time of this notice ship message.
	*
	* @param confirmTime the confirm time of this notice ship message
	*/
	@Override
	public void setConfirmTime(int confirmTime) {
		_noticeShipMessage.setConfirmTime(confirmTime);
	}

	/**
	* Returns the call sign of this notice ship message.
	*
	* @return the call sign of this notice ship message
	*/
	@Override
	public java.lang.String getCallSign() {
		return _noticeShipMessage.getCallSign();
	}

	/**
	* Sets the call sign of this notice ship message.
	*
	* @param callSign the call sign of this notice ship message
	*/
	@Override
	public void setCallSign(java.lang.String callSign) {
		_noticeShipMessage.setCallSign(callSign);
	}

	/**
	* Returns the arrival date of this notice ship message.
	*
	* @return the arrival date of this notice ship message
	*/
	@Override
	public java.util.Date getArrivalDate() {
		return _noticeShipMessage.getArrivalDate();
	}

	/**
	* Sets the arrival date of this notice ship message.
	*
	* @param arrivalDate the arrival date of this notice ship message
	*/
	@Override
	public void setArrivalDate(java.util.Date arrivalDate) {
		_noticeShipMessage.setArrivalDate(arrivalDate);
	}

	/**
	* Returns the arrival port code of this notice ship message.
	*
	* @return the arrival port code of this notice ship message
	*/
	@Override
	public java.lang.String getArrivalPortCode() {
		return _noticeShipMessage.getArrivalPortCode();
	}

	/**
	* Sets the arrival port code of this notice ship message.
	*
	* @param arrivalPortCode the arrival port code of this notice ship message
	*/
	@Override
	public void setArrivalPortCode(java.lang.String arrivalPortCode) {
		_noticeShipMessage.setArrivalPortCode(arrivalPortCode);
	}

	/**
	* Returns the port going to code of this notice ship message.
	*
	* @return the port going to code of this notice ship message
	*/
	@Override
	public java.lang.String getPortGoingToCode() {
		return _noticeShipMessage.getPortGoingToCode();
	}

	/**
	* Sets the port going to code of this notice ship message.
	*
	* @param portGoingToCode the port going to code of this notice ship message
	*/
	@Override
	public void setPortGoingToCode(java.lang.String portGoingToCode) {
		_noticeShipMessage.setPortGoingToCode(portGoingToCode);
	}

	/**
	* Returns the name and add of ship owners of this notice ship message.
	*
	* @return the name and add of ship owners of this notice ship message
	*/
	@Override
	public java.lang.String getNameAndAddOfShipOwners() {
		return _noticeShipMessage.getNameAndAddOfShipOwners();
	}

	/**
	* Sets the name and add of ship owners of this notice ship message.
	*
	* @param nameAndAddOfShipOwners the name and add of ship owners of this notice ship message
	*/
	@Override
	public void setNameAndAddOfShipOwners(
		java.lang.String nameAndAddOfShipOwners) {
		_noticeShipMessage.setNameAndAddOfShipOwners(nameAndAddOfShipOwners);
	}

	/**
	* Returns the clearance height of this notice ship message.
	*
	* @return the clearance height of this notice ship message
	*/
	@Override
	public long getClearanceHeight() {
		return _noticeShipMessage.getClearanceHeight();
	}

	/**
	* Sets the clearance height of this notice ship message.
	*
	* @param clearanceHeight the clearance height of this notice ship message
	*/
	@Override
	public void setClearanceHeight(long clearanceHeight) {
		_noticeShipMessage.setClearanceHeight(clearanceHeight);
	}

	/**
	* Returns the shown draft of this notice ship message.
	*
	* @return the shown draft of this notice ship message
	*/
	@Override
	public long getShownDraft() {
		return _noticeShipMessage.getShownDraft();
	}

	/**
	* Sets the shown draft of this notice ship message.
	*
	* @param shownDraft the shown draft of this notice ship message
	*/
	@Override
	public void setShownDraft(long shownDraft) {
		_noticeShipMessage.setShownDraft(shownDraft);
	}

	/**
	* Returns the dwt of this notice ship message.
	*
	* @return the dwt of this notice ship message
	*/
	@Override
	public long getDwt() {
		return _noticeShipMessage.getDwt();
	}

	/**
	* Sets the dwt of this notice ship message.
	*
	* @param dwt the dwt of this notice ship message
	*/
	@Override
	public void setDwt(long dwt) {
		_noticeShipMessage.setDwt(dwt);
	}

	/**
	* Returns the ship agency code of this notice ship message.
	*
	* @return the ship agency code of this notice ship message
	*/
	@Override
	public java.lang.String getShipAgencyCode() {
		return _noticeShipMessage.getShipAgencyCode();
	}

	/**
	* Sets the ship agency code of this notice ship message.
	*
	* @param shipAgencyCode the ship agency code of this notice ship message
	*/
	@Override
	public void setShipAgencyCode(java.lang.String shipAgencyCode) {
		_noticeShipMessage.setShipAgencyCode(shipAgencyCode);
	}

	/**
	* Returns the purpose code of this notice ship message.
	*
	* @return the purpose code of this notice ship message
	*/
	@Override
	public int getPurposeCode() {
		return _noticeShipMessage.getPurposeCode();
	}

	/**
	* Sets the purpose code of this notice ship message.
	*
	* @param purposeCode the purpose code of this notice ship message
	*/
	@Override
	public void setPurposeCode(int purposeCode) {
		_noticeShipMessage.setPurposeCode(purposeCode);
	}

	/**
	* Returns the crew number of this notice ship message.
	*
	* @return the crew number of this notice ship message
	*/
	@Override
	public long getCrewNumber() {
		return _noticeShipMessage.getCrewNumber();
	}

	/**
	* Sets the crew number of this notice ship message.
	*
	* @param crewNumber the crew number of this notice ship message
	*/
	@Override
	public void setCrewNumber(long crewNumber) {
		_noticeShipMessage.setCrewNumber(crewNumber);
	}

	/**
	* Returns the passenger number of this notice ship message.
	*
	* @return the passenger number of this notice ship message
	*/
	@Override
	public long getPassengerNumber() {
		return _noticeShipMessage.getPassengerNumber();
	}

	/**
	* Sets the passenger number of this notice ship message.
	*
	* @param passengerNumber the passenger number of this notice ship message
	*/
	@Override
	public void setPassengerNumber(long passengerNumber) {
		_noticeShipMessage.setPassengerNumber(passengerNumber);
	}

	/**
	* Returns the quantity and type of cargo of this notice ship message.
	*
	* @return the quantity and type of cargo of this notice ship message
	*/
	@Override
	public java.lang.String getQuantityAndTypeOfCargo() {
		return _noticeShipMessage.getQuantityAndTypeOfCargo();
	}

	/**
	* Sets the quantity and type of cargo of this notice ship message.
	*
	* @param quantityAndTypeOfCargo the quantity and type of cargo of this notice ship message
	*/
	@Override
	public void setQuantityAndTypeOfCargo(
		java.lang.String quantityAndTypeOfCargo) {
		_noticeShipMessage.setQuantityAndTypeOfCargo(quantityAndTypeOfCargo);
	}

	/**
	* Returns the other persons of this notice ship message.
	*
	* @return the other persons of this notice ship message
	*/
	@Override
	public int getOtherPersons() {
		return _noticeShipMessage.getOtherPersons();
	}

	/**
	* Sets the other persons of this notice ship message.
	*
	* @param otherPersons the other persons of this notice ship message
	*/
	@Override
	public void setOtherPersons(int otherPersons) {
		_noticeShipMessage.setOtherPersons(otherPersons);
	}

	/**
	* Returns the remarks of this notice ship message.
	*
	* @return the remarks of this notice ship message
	*/
	@Override
	public java.lang.String getRemarks() {
		return _noticeShipMessage.getRemarks();
	}

	/**
	* Sets the remarks of this notice ship message.
	*
	* @param remarks the remarks of this notice ship message
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_noticeShipMessage.setRemarks(remarks);
	}

	@Override
	public boolean isNew() {
		return _noticeShipMessage.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_noticeShipMessage.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _noticeShipMessage.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_noticeShipMessage.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _noticeShipMessage.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _noticeShipMessage.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_noticeShipMessage.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _noticeShipMessage.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_noticeShipMessage.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_noticeShipMessage.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_noticeShipMessage.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new NoticeShipMessageWrapper((NoticeShipMessage)_noticeShipMessage.clone());
	}

	@Override
	public int compareTo(NoticeShipMessage noticeShipMessage) {
		return _noticeShipMessage.compareTo(noticeShipMessage);
	}

	@Override
	public int hashCode() {
		return _noticeShipMessage.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<NoticeShipMessage> toCacheModel() {
		return _noticeShipMessage.toCacheModel();
	}

	@Override
	public NoticeShipMessage toEscapedModel() {
		return new NoticeShipMessageWrapper(_noticeShipMessage.toEscapedModel());
	}

	@Override
	public NoticeShipMessage toUnescapedModel() {
		return new NoticeShipMessageWrapper(_noticeShipMessage.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _noticeShipMessage.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _noticeShipMessage.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_noticeShipMessage.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NoticeShipMessageWrapper)) {
			return false;
		}

		NoticeShipMessageWrapper noticeShipMessageWrapper = (NoticeShipMessageWrapper)obj;

		if (Validator.equals(_noticeShipMessage,
					noticeShipMessageWrapper._noticeShipMessage)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public NoticeShipMessage getWrappedNoticeShipMessage() {
		return _noticeShipMessage;
	}

	@Override
	public NoticeShipMessage getWrappedModel() {
		return _noticeShipMessage;
	}

	@Override
	public void resetOriginalValues() {
		_noticeShipMessage.resetOriginalValues();
	}

	private NoticeShipMessage _noticeShipMessage;
}