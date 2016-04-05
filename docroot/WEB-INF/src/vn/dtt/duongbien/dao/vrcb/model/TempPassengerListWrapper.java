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
 * This class is a wrapper for {@link TempPassengerList}.
 * </p>
 *
 * @author longdm
 * @see TempPassengerList
 * @generated
 */
public class TempPassengerListWrapper implements TempPassengerList,
	ModelWrapper<TempPassengerList> {
	public TempPassengerListWrapper(TempPassengerList tempPassengerList) {
		_tempPassengerList = tempPassengerList;
	}

	@Override
	public Class<?> getModelClass() {
		return TempPassengerList.class;
	}

	@Override
	public String getModelClassName() {
		return TempPassengerList.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("requestState", getRequestState());
		attributes.put("documentName", getDocumentName());
		attributes.put("userCreated", getUserCreated());
		attributes.put("isArrival", getIsArrival());
		attributes.put("nameOfShip", getNameOfShip());
		attributes.put("portOfArrivalCode", getPortOfArrivalCode());
		attributes.put("dateOfArrival", getDateOfArrival());
		attributes.put("imoNumber", getImoNumber());
		attributes.put("callSign", getCallSign());
		attributes.put("voyageNumber", getVoyageNumber());
		attributes.put("flagStateOfShip", getFlagStateOfShip());
		attributes.put("listPassengers", getListPassengers());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());
		attributes.put("masterSigned", getMasterSigned());
		attributes.put("masterSignedImage", getMasterSignedImage());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("documentYear", getDocumentYear());

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

		Integer requestState = (Integer)attributes.get("requestState");

		if (requestState != null) {
			setRequestState(requestState);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		String userCreated = (String)attributes.get("userCreated");

		if (userCreated != null) {
			setUserCreated(userCreated);
		}

		Integer isArrival = (Integer)attributes.get("isArrival");

		if (isArrival != null) {
			setIsArrival(isArrival);
		}

		String nameOfShip = (String)attributes.get("nameOfShip");

		if (nameOfShip != null) {
			setNameOfShip(nameOfShip);
		}

		String portOfArrivalCode = (String)attributes.get("portOfArrivalCode");

		if (portOfArrivalCode != null) {
			setPortOfArrivalCode(portOfArrivalCode);
		}

		Date dateOfArrival = (Date)attributes.get("dateOfArrival");

		if (dateOfArrival != null) {
			setDateOfArrival(dateOfArrival);
		}

		String imoNumber = (String)attributes.get("imoNumber");

		if (imoNumber != null) {
			setImoNumber(imoNumber);
		}

		String callSign = (String)attributes.get("callSign");

		if (callSign != null) {
			setCallSign(callSign);
		}

		String voyageNumber = (String)attributes.get("voyageNumber");

		if (voyageNumber != null) {
			setVoyageNumber(voyageNumber);
		}

		String flagStateOfShip = (String)attributes.get("flagStateOfShip");

		if (flagStateOfShip != null) {
			setFlagStateOfShip(flagStateOfShip);
		}

		Integer listPassengers = (Integer)attributes.get("listPassengers");

		if (listPassengers != null) {
			setListPassengers(listPassengers);
		}

		String signPlace = (String)attributes.get("signPlace");

		if (signPlace != null) {
			setSignPlace(signPlace);
		}

		Date signDate = (Date)attributes.get("signDate");

		if (signDate != null) {
			setSignDate(signDate);
		}

		Integer masterSigned = (Integer)attributes.get("masterSigned");

		if (masterSigned != null) {
			setMasterSigned(masterSigned);
		}

		Integer masterSignedImage = (Integer)attributes.get("masterSignedImage");

		if (masterSignedImage != null) {
			setMasterSignedImage(masterSignedImage);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}
	}

	/**
	* Returns the primary key of this temp passenger list.
	*
	* @return the primary key of this temp passenger list
	*/
	@Override
	public long getPrimaryKey() {
		return _tempPassengerList.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp passenger list.
	*
	* @param primaryKey the primary key of this temp passenger list
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempPassengerList.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp passenger list.
	*
	* @return the ID of this temp passenger list
	*/
	@Override
	public long getId() {
		return _tempPassengerList.getId();
	}

	/**
	* Sets the ID of this temp passenger list.
	*
	* @param id the ID of this temp passenger list
	*/
	@Override
	public void setId(long id) {
		_tempPassengerList.setId(id);
	}

	/**
	* Returns the request code of this temp passenger list.
	*
	* @return the request code of this temp passenger list
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempPassengerList.getRequestCode();
	}

	/**
	* Sets the request code of this temp passenger list.
	*
	* @param requestCode the request code of this temp passenger list
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempPassengerList.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp passenger list.
	*
	* @return the request state of this temp passenger list
	*/
	@Override
	public int getRequestState() {
		return _tempPassengerList.getRequestState();
	}

	/**
	* Sets the request state of this temp passenger list.
	*
	* @param requestState the request state of this temp passenger list
	*/
	@Override
	public void setRequestState(int requestState) {
		_tempPassengerList.setRequestState(requestState);
	}

	/**
	* Returns the document name of this temp passenger list.
	*
	* @return the document name of this temp passenger list
	*/
	@Override
	public long getDocumentName() {
		return _tempPassengerList.getDocumentName();
	}

	/**
	* Sets the document name of this temp passenger list.
	*
	* @param documentName the document name of this temp passenger list
	*/
	@Override
	public void setDocumentName(long documentName) {
		_tempPassengerList.setDocumentName(documentName);
	}

	/**
	* Returns the user created of this temp passenger list.
	*
	* @return the user created of this temp passenger list
	*/
	@Override
	public java.lang.String getUserCreated() {
		return _tempPassengerList.getUserCreated();
	}

	/**
	* Sets the user created of this temp passenger list.
	*
	* @param userCreated the user created of this temp passenger list
	*/
	@Override
	public void setUserCreated(java.lang.String userCreated) {
		_tempPassengerList.setUserCreated(userCreated);
	}

	/**
	* Returns the is arrival of this temp passenger list.
	*
	* @return the is arrival of this temp passenger list
	*/
	@Override
	public int getIsArrival() {
		return _tempPassengerList.getIsArrival();
	}

	/**
	* Sets the is arrival of this temp passenger list.
	*
	* @param isArrival the is arrival of this temp passenger list
	*/
	@Override
	public void setIsArrival(int isArrival) {
		_tempPassengerList.setIsArrival(isArrival);
	}

	/**
	* Returns the name of ship of this temp passenger list.
	*
	* @return the name of ship of this temp passenger list
	*/
	@Override
	public java.lang.String getNameOfShip() {
		return _tempPassengerList.getNameOfShip();
	}

	/**
	* Sets the name of ship of this temp passenger list.
	*
	* @param nameOfShip the name of ship of this temp passenger list
	*/
	@Override
	public void setNameOfShip(java.lang.String nameOfShip) {
		_tempPassengerList.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the port of arrival code of this temp passenger list.
	*
	* @return the port of arrival code of this temp passenger list
	*/
	@Override
	public java.lang.String getPortOfArrivalCode() {
		return _tempPassengerList.getPortOfArrivalCode();
	}

	/**
	* Sets the port of arrival code of this temp passenger list.
	*
	* @param portOfArrivalCode the port of arrival code of this temp passenger list
	*/
	@Override
	public void setPortOfArrivalCode(java.lang.String portOfArrivalCode) {
		_tempPassengerList.setPortOfArrivalCode(portOfArrivalCode);
	}

	/**
	* Returns the date of arrival of this temp passenger list.
	*
	* @return the date of arrival of this temp passenger list
	*/
	@Override
	public java.util.Date getDateOfArrival() {
		return _tempPassengerList.getDateOfArrival();
	}

	/**
	* Sets the date of arrival of this temp passenger list.
	*
	* @param dateOfArrival the date of arrival of this temp passenger list
	*/
	@Override
	public void setDateOfArrival(java.util.Date dateOfArrival) {
		_tempPassengerList.setDateOfArrival(dateOfArrival);
	}

	/**
	* Returns the imo number of this temp passenger list.
	*
	* @return the imo number of this temp passenger list
	*/
	@Override
	public java.lang.String getImoNumber() {
		return _tempPassengerList.getImoNumber();
	}

	/**
	* Sets the imo number of this temp passenger list.
	*
	* @param imoNumber the imo number of this temp passenger list
	*/
	@Override
	public void setImoNumber(java.lang.String imoNumber) {
		_tempPassengerList.setImoNumber(imoNumber);
	}

	/**
	* Returns the call sign of this temp passenger list.
	*
	* @return the call sign of this temp passenger list
	*/
	@Override
	public java.lang.String getCallSign() {
		return _tempPassengerList.getCallSign();
	}

	/**
	* Sets the call sign of this temp passenger list.
	*
	* @param callSign the call sign of this temp passenger list
	*/
	@Override
	public void setCallSign(java.lang.String callSign) {
		_tempPassengerList.setCallSign(callSign);
	}

	/**
	* Returns the voyage number of this temp passenger list.
	*
	* @return the voyage number of this temp passenger list
	*/
	@Override
	public java.lang.String getVoyageNumber() {
		return _tempPassengerList.getVoyageNumber();
	}

	/**
	* Sets the voyage number of this temp passenger list.
	*
	* @param voyageNumber the voyage number of this temp passenger list
	*/
	@Override
	public void setVoyageNumber(java.lang.String voyageNumber) {
		_tempPassengerList.setVoyageNumber(voyageNumber);
	}

	/**
	* Returns the flag state of ship of this temp passenger list.
	*
	* @return the flag state of ship of this temp passenger list
	*/
	@Override
	public java.lang.String getFlagStateOfShip() {
		return _tempPassengerList.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this temp passenger list.
	*
	* @param flagStateOfShip the flag state of ship of this temp passenger list
	*/
	@Override
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_tempPassengerList.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the list passengers of this temp passenger list.
	*
	* @return the list passengers of this temp passenger list
	*/
	@Override
	public int getListPassengers() {
		return _tempPassengerList.getListPassengers();
	}

	/**
	* Sets the list passengers of this temp passenger list.
	*
	* @param listPassengers the list passengers of this temp passenger list
	*/
	@Override
	public void setListPassengers(int listPassengers) {
		_tempPassengerList.setListPassengers(listPassengers);
	}

	/**
	* Returns the sign place of this temp passenger list.
	*
	* @return the sign place of this temp passenger list
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _tempPassengerList.getSignPlace();
	}

	/**
	* Sets the sign place of this temp passenger list.
	*
	* @param signPlace the sign place of this temp passenger list
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_tempPassengerList.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this temp passenger list.
	*
	* @return the sign date of this temp passenger list
	*/
	@Override
	public java.util.Date getSignDate() {
		return _tempPassengerList.getSignDate();
	}

	/**
	* Sets the sign date of this temp passenger list.
	*
	* @param signDate the sign date of this temp passenger list
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_tempPassengerList.setSignDate(signDate);
	}

	/**
	* Returns the master signed of this temp passenger list.
	*
	* @return the master signed of this temp passenger list
	*/
	@Override
	public int getMasterSigned() {
		return _tempPassengerList.getMasterSigned();
	}

	/**
	* Sets the master signed of this temp passenger list.
	*
	* @param masterSigned the master signed of this temp passenger list
	*/
	@Override
	public void setMasterSigned(int masterSigned) {
		_tempPassengerList.setMasterSigned(masterSigned);
	}

	/**
	* Returns the master signed image of this temp passenger list.
	*
	* @return the master signed image of this temp passenger list
	*/
	@Override
	public int getMasterSignedImage() {
		return _tempPassengerList.getMasterSignedImage();
	}

	/**
	* Sets the master signed image of this temp passenger list.
	*
	* @param masterSignedImage the master signed image of this temp passenger list
	*/
	@Override
	public void setMasterSignedImage(int masterSignedImage) {
		_tempPassengerList.setMasterSignedImage(masterSignedImage);
	}

	/**
	* Returns the attached file of this temp passenger list.
	*
	* @return the attached file of this temp passenger list
	*/
	@Override
	public long getAttachedFile() {
		return _tempPassengerList.getAttachedFile();
	}

	/**
	* Sets the attached file of this temp passenger list.
	*
	* @param attachedFile the attached file of this temp passenger list
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_tempPassengerList.setAttachedFile(attachedFile);
	}

	/**
	* Returns the document year of this temp passenger list.
	*
	* @return the document year of this temp passenger list
	*/
	@Override
	public int getDocumentYear() {
		return _tempPassengerList.getDocumentYear();
	}

	/**
	* Sets the document year of this temp passenger list.
	*
	* @param documentYear the document year of this temp passenger list
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_tempPassengerList.setDocumentYear(documentYear);
	}

	@Override
	public boolean isNew() {
		return _tempPassengerList.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempPassengerList.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempPassengerList.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempPassengerList.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempPassengerList.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempPassengerList.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempPassengerList.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempPassengerList.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempPassengerList.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempPassengerList.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempPassengerList.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempPassengerListWrapper((TempPassengerList)_tempPassengerList.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.TempPassengerList tempPassengerList) {
		return _tempPassengerList.compareTo(tempPassengerList);
	}

	@Override
	public int hashCode() {
		return _tempPassengerList.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.TempPassengerList> toCacheModel() {
		return _tempPassengerList.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempPassengerList toEscapedModel() {
		return new TempPassengerListWrapper(_tempPassengerList.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempPassengerList toUnescapedModel() {
		return new TempPassengerListWrapper(_tempPassengerList.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempPassengerList.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempPassengerList.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempPassengerList.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempPassengerListWrapper)) {
			return false;
		}

		TempPassengerListWrapper tempPassengerListWrapper = (TempPassengerListWrapper)obj;

		if (Validator.equals(_tempPassengerList,
					tempPassengerListWrapper._tempPassengerList)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempPassengerList getWrappedTempPassengerList() {
		return _tempPassengerList;
	}

	@Override
	public TempPassengerList getWrappedModel() {
		return _tempPassengerList;
	}

	@Override
	public void resetOriginalValues() {
		_tempPassengerList.resetOriginalValues();
	}

	private TempPassengerList _tempPassengerList;
}