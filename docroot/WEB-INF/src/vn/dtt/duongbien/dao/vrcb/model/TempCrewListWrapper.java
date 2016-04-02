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
 * This class is a wrapper for {@link TempCrewList}.
 * </p>
 *
 * @author longdm
 * @see TempCrewList
 * @generated
 */
public class TempCrewListWrapper implements TempCrewList,
	ModelWrapper<TempCrewList> {
	public TempCrewListWrapper(TempCrewList tempCrewList) {
		_tempCrewList = tempCrewList;
	}

	@Override
	public Class<?> getModelClass() {
		return TempCrewList.class;
	}

	@Override
	public String getModelClassName() {
		return TempCrewList.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("requestState", getRequestState());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("userCreated", getUserCreated());
		attributes.put("isArrival", getIsArrival());
		attributes.put("nameOfShip", getNameOfShip());
		attributes.put("imoNumber", getImoNumber());
		attributes.put("callSign", getCallSign());
		attributes.put("voyageNumber", getVoyageNumber());
		attributes.put("portOfArrivalCode", getPortOfArrivalCode());
		attributes.put("dateOfArrival", getDateOfArrival());
		attributes.put("flagStateOfShip", getFlagStateOfShip());
		attributes.put("lastPortOfCallCode", getLastPortOfCallCode());
		attributes.put("crewList", getCrewList());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());
		attributes.put("masterSigned", getMasterSigned());
		attributes.put("masterSignedImage", getMasterSignedImage());
		attributes.put("attachedFile", getAttachedFile());

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

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
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

		String portOfArrivalCode = (String)attributes.get("portOfArrivalCode");

		if (portOfArrivalCode != null) {
			setPortOfArrivalCode(portOfArrivalCode);
		}

		Date dateOfArrival = (Date)attributes.get("dateOfArrival");

		if (dateOfArrival != null) {
			setDateOfArrival(dateOfArrival);
		}

		String flagStateOfShip = (String)attributes.get("flagStateOfShip");

		if (flagStateOfShip != null) {
			setFlagStateOfShip(flagStateOfShip);
		}

		String lastPortOfCallCode = (String)attributes.get("lastPortOfCallCode");

		if (lastPortOfCallCode != null) {
			setLastPortOfCallCode(lastPortOfCallCode);
		}

		Integer crewList = (Integer)attributes.get("crewList");

		if (crewList != null) {
			setCrewList(crewList);
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
	}

	/**
	* Returns the primary key of this temp crew list.
	*
	* @return the primary key of this temp crew list
	*/
	@Override
	public long getPrimaryKey() {
		return _tempCrewList.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp crew list.
	*
	* @param primaryKey the primary key of this temp crew list
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempCrewList.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp crew list.
	*
	* @return the ID of this temp crew list
	*/
	@Override
	public long getId() {
		return _tempCrewList.getId();
	}

	/**
	* Sets the ID of this temp crew list.
	*
	* @param id the ID of this temp crew list
	*/
	@Override
	public void setId(long id) {
		_tempCrewList.setId(id);
	}

	/**
	* Returns the request code of this temp crew list.
	*
	* @return the request code of this temp crew list
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempCrewList.getRequestCode();
	}

	/**
	* Sets the request code of this temp crew list.
	*
	* @param requestCode the request code of this temp crew list
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempCrewList.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp crew list.
	*
	* @return the request state of this temp crew list
	*/
	@Override
	public int getRequestState() {
		return _tempCrewList.getRequestState();
	}

	/**
	* Sets the request state of this temp crew list.
	*
	* @param requestState the request state of this temp crew list
	*/
	@Override
	public void setRequestState(int requestState) {
		_tempCrewList.setRequestState(requestState);
	}

	/**
	* Returns the document name of this temp crew list.
	*
	* @return the document name of this temp crew list
	*/
	@Override
	public long getDocumentName() {
		return _tempCrewList.getDocumentName();
	}

	/**
	* Sets the document name of this temp crew list.
	*
	* @param documentName the document name of this temp crew list
	*/
	@Override
	public void setDocumentName(long documentName) {
		_tempCrewList.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this temp crew list.
	*
	* @return the document year of this temp crew list
	*/
	@Override
	public int getDocumentYear() {
		return _tempCrewList.getDocumentYear();
	}

	/**
	* Sets the document year of this temp crew list.
	*
	* @param documentYear the document year of this temp crew list
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_tempCrewList.setDocumentYear(documentYear);
	}

	/**
	* Returns the user created of this temp crew list.
	*
	* @return the user created of this temp crew list
	*/
	@Override
	public java.lang.String getUserCreated() {
		return _tempCrewList.getUserCreated();
	}

	/**
	* Sets the user created of this temp crew list.
	*
	* @param userCreated the user created of this temp crew list
	*/
	@Override
	public void setUserCreated(java.lang.String userCreated) {
		_tempCrewList.setUserCreated(userCreated);
	}

	/**
	* Returns the is arrival of this temp crew list.
	*
	* @return the is arrival of this temp crew list
	*/
	@Override
	public int getIsArrival() {
		return _tempCrewList.getIsArrival();
	}

	/**
	* Sets the is arrival of this temp crew list.
	*
	* @param isArrival the is arrival of this temp crew list
	*/
	@Override
	public void setIsArrival(int isArrival) {
		_tempCrewList.setIsArrival(isArrival);
	}

	/**
	* Returns the name of ship of this temp crew list.
	*
	* @return the name of ship of this temp crew list
	*/
	@Override
	public java.lang.String getNameOfShip() {
		return _tempCrewList.getNameOfShip();
	}

	/**
	* Sets the name of ship of this temp crew list.
	*
	* @param nameOfShip the name of ship of this temp crew list
	*/
	@Override
	public void setNameOfShip(java.lang.String nameOfShip) {
		_tempCrewList.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the imo number of this temp crew list.
	*
	* @return the imo number of this temp crew list
	*/
	@Override
	public java.lang.String getImoNumber() {
		return _tempCrewList.getImoNumber();
	}

	/**
	* Sets the imo number of this temp crew list.
	*
	* @param imoNumber the imo number of this temp crew list
	*/
	@Override
	public void setImoNumber(java.lang.String imoNumber) {
		_tempCrewList.setImoNumber(imoNumber);
	}

	/**
	* Returns the call sign of this temp crew list.
	*
	* @return the call sign of this temp crew list
	*/
	@Override
	public java.lang.String getCallSign() {
		return _tempCrewList.getCallSign();
	}

	/**
	* Sets the call sign of this temp crew list.
	*
	* @param callSign the call sign of this temp crew list
	*/
	@Override
	public void setCallSign(java.lang.String callSign) {
		_tempCrewList.setCallSign(callSign);
	}

	/**
	* Returns the voyage number of this temp crew list.
	*
	* @return the voyage number of this temp crew list
	*/
	@Override
	public java.lang.String getVoyageNumber() {
		return _tempCrewList.getVoyageNumber();
	}

	/**
	* Sets the voyage number of this temp crew list.
	*
	* @param voyageNumber the voyage number of this temp crew list
	*/
	@Override
	public void setVoyageNumber(java.lang.String voyageNumber) {
		_tempCrewList.setVoyageNumber(voyageNumber);
	}

	/**
	* Returns the port of arrival code of this temp crew list.
	*
	* @return the port of arrival code of this temp crew list
	*/
	@Override
	public java.lang.String getPortOfArrivalCode() {
		return _tempCrewList.getPortOfArrivalCode();
	}

	/**
	* Sets the port of arrival code of this temp crew list.
	*
	* @param portOfArrivalCode the port of arrival code of this temp crew list
	*/
	@Override
	public void setPortOfArrivalCode(java.lang.String portOfArrivalCode) {
		_tempCrewList.setPortOfArrivalCode(portOfArrivalCode);
	}

	/**
	* Returns the date of arrival of this temp crew list.
	*
	* @return the date of arrival of this temp crew list
	*/
	@Override
	public java.util.Date getDateOfArrival() {
		return _tempCrewList.getDateOfArrival();
	}

	/**
	* Sets the date of arrival of this temp crew list.
	*
	* @param dateOfArrival the date of arrival of this temp crew list
	*/
	@Override
	public void setDateOfArrival(java.util.Date dateOfArrival) {
		_tempCrewList.setDateOfArrival(dateOfArrival);
	}

	/**
	* Returns the flag state of ship of this temp crew list.
	*
	* @return the flag state of ship of this temp crew list
	*/
	@Override
	public java.lang.String getFlagStateOfShip() {
		return _tempCrewList.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this temp crew list.
	*
	* @param flagStateOfShip the flag state of ship of this temp crew list
	*/
	@Override
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_tempCrewList.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the last port of call code of this temp crew list.
	*
	* @return the last port of call code of this temp crew list
	*/
	@Override
	public java.lang.String getLastPortOfCallCode() {
		return _tempCrewList.getLastPortOfCallCode();
	}

	/**
	* Sets the last port of call code of this temp crew list.
	*
	* @param lastPortOfCallCode the last port of call code of this temp crew list
	*/
	@Override
	public void setLastPortOfCallCode(java.lang.String lastPortOfCallCode) {
		_tempCrewList.setLastPortOfCallCode(lastPortOfCallCode);
	}

	/**
	* Returns the crew list of this temp crew list.
	*
	* @return the crew list of this temp crew list
	*/
	@Override
	public int getCrewList() {
		return _tempCrewList.getCrewList();
	}

	/**
	* Sets the crew list of this temp crew list.
	*
	* @param crewList the crew list of this temp crew list
	*/
	@Override
	public void setCrewList(int crewList) {
		_tempCrewList.setCrewList(crewList);
	}

	/**
	* Returns the sign place of this temp crew list.
	*
	* @return the sign place of this temp crew list
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _tempCrewList.getSignPlace();
	}

	/**
	* Sets the sign place of this temp crew list.
	*
	* @param signPlace the sign place of this temp crew list
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_tempCrewList.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this temp crew list.
	*
	* @return the sign date of this temp crew list
	*/
	@Override
	public java.util.Date getSignDate() {
		return _tempCrewList.getSignDate();
	}

	/**
	* Sets the sign date of this temp crew list.
	*
	* @param signDate the sign date of this temp crew list
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_tempCrewList.setSignDate(signDate);
	}

	/**
	* Returns the master signed of this temp crew list.
	*
	* @return the master signed of this temp crew list
	*/
	@Override
	public int getMasterSigned() {
		return _tempCrewList.getMasterSigned();
	}

	/**
	* Sets the master signed of this temp crew list.
	*
	* @param masterSigned the master signed of this temp crew list
	*/
	@Override
	public void setMasterSigned(int masterSigned) {
		_tempCrewList.setMasterSigned(masterSigned);
	}

	/**
	* Returns the master signed image of this temp crew list.
	*
	* @return the master signed image of this temp crew list
	*/
	@Override
	public int getMasterSignedImage() {
		return _tempCrewList.getMasterSignedImage();
	}

	/**
	* Sets the master signed image of this temp crew list.
	*
	* @param masterSignedImage the master signed image of this temp crew list
	*/
	@Override
	public void setMasterSignedImage(int masterSignedImage) {
		_tempCrewList.setMasterSignedImage(masterSignedImage);
	}

	/**
	* Returns the attached file of this temp crew list.
	*
	* @return the attached file of this temp crew list
	*/
	@Override
	public long getAttachedFile() {
		return _tempCrewList.getAttachedFile();
	}

	/**
	* Sets the attached file of this temp crew list.
	*
	* @param attachedFile the attached file of this temp crew list
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_tempCrewList.setAttachedFile(attachedFile);
	}

	@Override
	public boolean isNew() {
		return _tempCrewList.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempCrewList.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempCrewList.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempCrewList.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempCrewList.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempCrewList.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempCrewList.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempCrewList.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempCrewList.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempCrewList.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempCrewList.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempCrewListWrapper((TempCrewList)_tempCrewList.clone());
	}

	@Override
	public int compareTo(TempCrewList tempCrewList) {
		return _tempCrewList.compareTo(tempCrewList);
	}

	@Override
	public int hashCode() {
		return _tempCrewList.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<TempCrewList> toCacheModel() {
		return _tempCrewList.toCacheModel();
	}

	@Override
	public TempCrewList toEscapedModel() {
		return new TempCrewListWrapper(_tempCrewList.toEscapedModel());
	}

	@Override
	public TempCrewList toUnescapedModel() {
		return new TempCrewListWrapper(_tempCrewList.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempCrewList.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempCrewList.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempCrewList.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempCrewListWrapper)) {
			return false;
		}

		TempCrewListWrapper tempCrewListWrapper = (TempCrewListWrapper)obj;

		if (Validator.equals(_tempCrewList, tempCrewListWrapper._tempCrewList)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempCrewList getWrappedTempCrewList() {
		return _tempCrewList;
	}

	@Override
	public TempCrewList getWrappedModel() {
		return _tempCrewList;
	}

	@Override
	public void resetOriginalValues() {
		_tempCrewList.resetOriginalValues();
	}

	private TempCrewList _tempCrewList;
}