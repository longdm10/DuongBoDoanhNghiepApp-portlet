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
 * This class is a wrapper for {@link TempShipStoresDeclaration}.
 * </p>
 *
 * @author longdm
 * @see TempShipStoresDeclaration
 * @generated
 */
public class TempShipStoresDeclarationWrapper
	implements TempShipStoresDeclaration,
		ModelWrapper<TempShipStoresDeclaration> {
	public TempShipStoresDeclarationWrapper(
		TempShipStoresDeclaration tempShipStoresDeclaration) {
		_tempShipStoresDeclaration = tempShipStoresDeclaration;
	}

	@Override
	public Class<?> getModelClass() {
		return TempShipStoresDeclaration.class;
	}

	@Override
	public String getModelClassName() {
		return TempShipStoresDeclaration.class.getName();
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
		attributes.put("callsign", getCallsign());
		attributes.put("voyageNumber", getVoyageNumber());
		attributes.put("nationalityOfShip", getNationalityOfShip());
		attributes.put("portOfArrivalCode", getPortOfArrivalCode());
		attributes.put("dateOfArrival", getDateOfArrival());
		attributes.put("lastPortOfCallCode", getLastPortOfCallCode());
		attributes.put("numberOfPersonsOnBoat", getNumberOfPersonsOnBoat());
		attributes.put("periodOfStay", getPeriodOfStay());
		attributes.put("periodOfStayUnit", getPeriodOfStayUnit());
		attributes.put("nameOfMaster", getNameOfMaster());
		attributes.put("listShipsStores", getListShipsStores());
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

		String callsign = (String)attributes.get("callsign");

		if (callsign != null) {
			setCallsign(callsign);
		}

		String voyageNumber = (String)attributes.get("voyageNumber");

		if (voyageNumber != null) {
			setVoyageNumber(voyageNumber);
		}

		String nationalityOfShip = (String)attributes.get("nationalityOfShip");

		if (nationalityOfShip != null) {
			setNationalityOfShip(nationalityOfShip);
		}

		String portOfArrivalCode = (String)attributes.get("portOfArrivalCode");

		if (portOfArrivalCode != null) {
			setPortOfArrivalCode(portOfArrivalCode);
		}

		Date dateOfArrival = (Date)attributes.get("dateOfArrival");

		if (dateOfArrival != null) {
			setDateOfArrival(dateOfArrival);
		}

		String lastPortOfCallCode = (String)attributes.get("lastPortOfCallCode");

		if (lastPortOfCallCode != null) {
			setLastPortOfCallCode(lastPortOfCallCode);
		}

		Integer numberOfPersonsOnBoat = (Integer)attributes.get(
				"numberOfPersonsOnBoat");

		if (numberOfPersonsOnBoat != null) {
			setNumberOfPersonsOnBoat(numberOfPersonsOnBoat);
		}

		String periodOfStay = (String)attributes.get("periodOfStay");

		if (periodOfStay != null) {
			setPeriodOfStay(periodOfStay);
		}

		String periodOfStayUnit = (String)attributes.get("periodOfStayUnit");

		if (periodOfStayUnit != null) {
			setPeriodOfStayUnit(periodOfStayUnit);
		}

		String nameOfMaster = (String)attributes.get("nameOfMaster");

		if (nameOfMaster != null) {
			setNameOfMaster(nameOfMaster);
		}

		Integer listShipsStores = (Integer)attributes.get("listShipsStores");

		if (listShipsStores != null) {
			setListShipsStores(listShipsStores);
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
	* Returns the primary key of this temp ship stores declaration.
	*
	* @return the primary key of this temp ship stores declaration
	*/
	@Override
	public long getPrimaryKey() {
		return _tempShipStoresDeclaration.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp ship stores declaration.
	*
	* @param primaryKey the primary key of this temp ship stores declaration
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempShipStoresDeclaration.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp ship stores declaration.
	*
	* @return the ID of this temp ship stores declaration
	*/
	@Override
	public long getId() {
		return _tempShipStoresDeclaration.getId();
	}

	/**
	* Sets the ID of this temp ship stores declaration.
	*
	* @param id the ID of this temp ship stores declaration
	*/
	@Override
	public void setId(long id) {
		_tempShipStoresDeclaration.setId(id);
	}

	/**
	* Returns the request code of this temp ship stores declaration.
	*
	* @return the request code of this temp ship stores declaration
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempShipStoresDeclaration.getRequestCode();
	}

	/**
	* Sets the request code of this temp ship stores declaration.
	*
	* @param requestCode the request code of this temp ship stores declaration
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempShipStoresDeclaration.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp ship stores declaration.
	*
	* @return the request state of this temp ship stores declaration
	*/
	@Override
	public int getRequestState() {
		return _tempShipStoresDeclaration.getRequestState();
	}

	/**
	* Sets the request state of this temp ship stores declaration.
	*
	* @param requestState the request state of this temp ship stores declaration
	*/
	@Override
	public void setRequestState(int requestState) {
		_tempShipStoresDeclaration.setRequestState(requestState);
	}

	/**
	* Returns the document name of this temp ship stores declaration.
	*
	* @return the document name of this temp ship stores declaration
	*/
	@Override
	public long getDocumentName() {
		return _tempShipStoresDeclaration.getDocumentName();
	}

	/**
	* Sets the document name of this temp ship stores declaration.
	*
	* @param documentName the document name of this temp ship stores declaration
	*/
	@Override
	public void setDocumentName(long documentName) {
		_tempShipStoresDeclaration.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this temp ship stores declaration.
	*
	* @return the document year of this temp ship stores declaration
	*/
	@Override
	public int getDocumentYear() {
		return _tempShipStoresDeclaration.getDocumentYear();
	}

	/**
	* Sets the document year of this temp ship stores declaration.
	*
	* @param documentYear the document year of this temp ship stores declaration
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_tempShipStoresDeclaration.setDocumentYear(documentYear);
	}

	/**
	* Returns the user created of this temp ship stores declaration.
	*
	* @return the user created of this temp ship stores declaration
	*/
	@Override
	public java.lang.String getUserCreated() {
		return _tempShipStoresDeclaration.getUserCreated();
	}

	/**
	* Sets the user created of this temp ship stores declaration.
	*
	* @param userCreated the user created of this temp ship stores declaration
	*/
	@Override
	public void setUserCreated(java.lang.String userCreated) {
		_tempShipStoresDeclaration.setUserCreated(userCreated);
	}

	/**
	* Returns the is arrival of this temp ship stores declaration.
	*
	* @return the is arrival of this temp ship stores declaration
	*/
	@Override
	public int getIsArrival() {
		return _tempShipStoresDeclaration.getIsArrival();
	}

	/**
	* Sets the is arrival of this temp ship stores declaration.
	*
	* @param isArrival the is arrival of this temp ship stores declaration
	*/
	@Override
	public void setIsArrival(int isArrival) {
		_tempShipStoresDeclaration.setIsArrival(isArrival);
	}

	/**
	* Returns the name of ship of this temp ship stores declaration.
	*
	* @return the name of ship of this temp ship stores declaration
	*/
	@Override
	public java.lang.String getNameOfShip() {
		return _tempShipStoresDeclaration.getNameOfShip();
	}

	/**
	* Sets the name of ship of this temp ship stores declaration.
	*
	* @param nameOfShip the name of ship of this temp ship stores declaration
	*/
	@Override
	public void setNameOfShip(java.lang.String nameOfShip) {
		_tempShipStoresDeclaration.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the imo number of this temp ship stores declaration.
	*
	* @return the imo number of this temp ship stores declaration
	*/
	@Override
	public java.lang.String getImoNumber() {
		return _tempShipStoresDeclaration.getImoNumber();
	}

	/**
	* Sets the imo number of this temp ship stores declaration.
	*
	* @param imoNumber the imo number of this temp ship stores declaration
	*/
	@Override
	public void setImoNumber(java.lang.String imoNumber) {
		_tempShipStoresDeclaration.setImoNumber(imoNumber);
	}

	/**
	* Returns the callsign of this temp ship stores declaration.
	*
	* @return the callsign of this temp ship stores declaration
	*/
	@Override
	public java.lang.String getCallsign() {
		return _tempShipStoresDeclaration.getCallsign();
	}

	/**
	* Sets the callsign of this temp ship stores declaration.
	*
	* @param callsign the callsign of this temp ship stores declaration
	*/
	@Override
	public void setCallsign(java.lang.String callsign) {
		_tempShipStoresDeclaration.setCallsign(callsign);
	}

	/**
	* Returns the voyage number of this temp ship stores declaration.
	*
	* @return the voyage number of this temp ship stores declaration
	*/
	@Override
	public java.lang.String getVoyageNumber() {
		return _tempShipStoresDeclaration.getVoyageNumber();
	}

	/**
	* Sets the voyage number of this temp ship stores declaration.
	*
	* @param voyageNumber the voyage number of this temp ship stores declaration
	*/
	@Override
	public void setVoyageNumber(java.lang.String voyageNumber) {
		_tempShipStoresDeclaration.setVoyageNumber(voyageNumber);
	}

	/**
	* Returns the nationality of ship of this temp ship stores declaration.
	*
	* @return the nationality of ship of this temp ship stores declaration
	*/
	@Override
	public java.lang.String getNationalityOfShip() {
		return _tempShipStoresDeclaration.getNationalityOfShip();
	}

	/**
	* Sets the nationality of ship of this temp ship stores declaration.
	*
	* @param nationalityOfShip the nationality of ship of this temp ship stores declaration
	*/
	@Override
	public void setNationalityOfShip(java.lang.String nationalityOfShip) {
		_tempShipStoresDeclaration.setNationalityOfShip(nationalityOfShip);
	}

	/**
	* Returns the port of arrival code of this temp ship stores declaration.
	*
	* @return the port of arrival code of this temp ship stores declaration
	*/
	@Override
	public java.lang.String getPortOfArrivalCode() {
		return _tempShipStoresDeclaration.getPortOfArrivalCode();
	}

	/**
	* Sets the port of arrival code of this temp ship stores declaration.
	*
	* @param portOfArrivalCode the port of arrival code of this temp ship stores declaration
	*/
	@Override
	public void setPortOfArrivalCode(java.lang.String portOfArrivalCode) {
		_tempShipStoresDeclaration.setPortOfArrivalCode(portOfArrivalCode);
	}

	/**
	* Returns the date of arrival of this temp ship stores declaration.
	*
	* @return the date of arrival of this temp ship stores declaration
	*/
	@Override
	public java.util.Date getDateOfArrival() {
		return _tempShipStoresDeclaration.getDateOfArrival();
	}

	/**
	* Sets the date of arrival of this temp ship stores declaration.
	*
	* @param dateOfArrival the date of arrival of this temp ship stores declaration
	*/
	@Override
	public void setDateOfArrival(java.util.Date dateOfArrival) {
		_tempShipStoresDeclaration.setDateOfArrival(dateOfArrival);
	}

	/**
	* Returns the last port of call code of this temp ship stores declaration.
	*
	* @return the last port of call code of this temp ship stores declaration
	*/
	@Override
	public java.lang.String getLastPortOfCallCode() {
		return _tempShipStoresDeclaration.getLastPortOfCallCode();
	}

	/**
	* Sets the last port of call code of this temp ship stores declaration.
	*
	* @param lastPortOfCallCode the last port of call code of this temp ship stores declaration
	*/
	@Override
	public void setLastPortOfCallCode(java.lang.String lastPortOfCallCode) {
		_tempShipStoresDeclaration.setLastPortOfCallCode(lastPortOfCallCode);
	}

	/**
	* Returns the number of persons on boat of this temp ship stores declaration.
	*
	* @return the number of persons on boat of this temp ship stores declaration
	*/
	@Override
	public int getNumberOfPersonsOnBoat() {
		return _tempShipStoresDeclaration.getNumberOfPersonsOnBoat();
	}

	/**
	* Sets the number of persons on boat of this temp ship stores declaration.
	*
	* @param numberOfPersonsOnBoat the number of persons on boat of this temp ship stores declaration
	*/
	@Override
	public void setNumberOfPersonsOnBoat(int numberOfPersonsOnBoat) {
		_tempShipStoresDeclaration.setNumberOfPersonsOnBoat(numberOfPersonsOnBoat);
	}

	/**
	* Returns the period of stay of this temp ship stores declaration.
	*
	* @return the period of stay of this temp ship stores declaration
	*/
	@Override
	public java.lang.String getPeriodOfStay() {
		return _tempShipStoresDeclaration.getPeriodOfStay();
	}

	/**
	* Sets the period of stay of this temp ship stores declaration.
	*
	* @param periodOfStay the period of stay of this temp ship stores declaration
	*/
	@Override
	public void setPeriodOfStay(java.lang.String periodOfStay) {
		_tempShipStoresDeclaration.setPeriodOfStay(periodOfStay);
	}

	/**
	* Returns the period of stay unit of this temp ship stores declaration.
	*
	* @return the period of stay unit of this temp ship stores declaration
	*/
	@Override
	public java.lang.String getPeriodOfStayUnit() {
		return _tempShipStoresDeclaration.getPeriodOfStayUnit();
	}

	/**
	* Sets the period of stay unit of this temp ship stores declaration.
	*
	* @param periodOfStayUnit the period of stay unit of this temp ship stores declaration
	*/
	@Override
	public void setPeriodOfStayUnit(java.lang.String periodOfStayUnit) {
		_tempShipStoresDeclaration.setPeriodOfStayUnit(periodOfStayUnit);
	}

	/**
	* Returns the name of master of this temp ship stores declaration.
	*
	* @return the name of master of this temp ship stores declaration
	*/
	@Override
	public java.lang.String getNameOfMaster() {
		return _tempShipStoresDeclaration.getNameOfMaster();
	}

	/**
	* Sets the name of master of this temp ship stores declaration.
	*
	* @param nameOfMaster the name of master of this temp ship stores declaration
	*/
	@Override
	public void setNameOfMaster(java.lang.String nameOfMaster) {
		_tempShipStoresDeclaration.setNameOfMaster(nameOfMaster);
	}

	/**
	* Returns the list ships stores of this temp ship stores declaration.
	*
	* @return the list ships stores of this temp ship stores declaration
	*/
	@Override
	public int getListShipsStores() {
		return _tempShipStoresDeclaration.getListShipsStores();
	}

	/**
	* Sets the list ships stores of this temp ship stores declaration.
	*
	* @param listShipsStores the list ships stores of this temp ship stores declaration
	*/
	@Override
	public void setListShipsStores(int listShipsStores) {
		_tempShipStoresDeclaration.setListShipsStores(listShipsStores);
	}

	/**
	* Returns the sign place of this temp ship stores declaration.
	*
	* @return the sign place of this temp ship stores declaration
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _tempShipStoresDeclaration.getSignPlace();
	}

	/**
	* Sets the sign place of this temp ship stores declaration.
	*
	* @param signPlace the sign place of this temp ship stores declaration
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_tempShipStoresDeclaration.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this temp ship stores declaration.
	*
	* @return the sign date of this temp ship stores declaration
	*/
	@Override
	public java.util.Date getSignDate() {
		return _tempShipStoresDeclaration.getSignDate();
	}

	/**
	* Sets the sign date of this temp ship stores declaration.
	*
	* @param signDate the sign date of this temp ship stores declaration
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_tempShipStoresDeclaration.setSignDate(signDate);
	}

	/**
	* Returns the master signed of this temp ship stores declaration.
	*
	* @return the master signed of this temp ship stores declaration
	*/
	@Override
	public int getMasterSigned() {
		return _tempShipStoresDeclaration.getMasterSigned();
	}

	/**
	* Sets the master signed of this temp ship stores declaration.
	*
	* @param masterSigned the master signed of this temp ship stores declaration
	*/
	@Override
	public void setMasterSigned(int masterSigned) {
		_tempShipStoresDeclaration.setMasterSigned(masterSigned);
	}

	/**
	* Returns the master signed image of this temp ship stores declaration.
	*
	* @return the master signed image of this temp ship stores declaration
	*/
	@Override
	public int getMasterSignedImage() {
		return _tempShipStoresDeclaration.getMasterSignedImage();
	}

	/**
	* Sets the master signed image of this temp ship stores declaration.
	*
	* @param masterSignedImage the master signed image of this temp ship stores declaration
	*/
	@Override
	public void setMasterSignedImage(int masterSignedImage) {
		_tempShipStoresDeclaration.setMasterSignedImage(masterSignedImage);
	}

	/**
	* Returns the attached file of this temp ship stores declaration.
	*
	* @return the attached file of this temp ship stores declaration
	*/
	@Override
	public long getAttachedFile() {
		return _tempShipStoresDeclaration.getAttachedFile();
	}

	/**
	* Sets the attached file of this temp ship stores declaration.
	*
	* @param attachedFile the attached file of this temp ship stores declaration
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_tempShipStoresDeclaration.setAttachedFile(attachedFile);
	}

	@Override
	public boolean isNew() {
		return _tempShipStoresDeclaration.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempShipStoresDeclaration.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempShipStoresDeclaration.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempShipStoresDeclaration.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempShipStoresDeclaration.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempShipStoresDeclaration.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempShipStoresDeclaration.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempShipStoresDeclaration.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempShipStoresDeclaration.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempShipStoresDeclaration.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempShipStoresDeclaration.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempShipStoresDeclarationWrapper((TempShipStoresDeclaration)_tempShipStoresDeclaration.clone());
	}

	@Override
	public int compareTo(TempShipStoresDeclaration tempShipStoresDeclaration) {
		return _tempShipStoresDeclaration.compareTo(tempShipStoresDeclaration);
	}

	@Override
	public int hashCode() {
		return _tempShipStoresDeclaration.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<TempShipStoresDeclaration> toCacheModel() {
		return _tempShipStoresDeclaration.toCacheModel();
	}

	@Override
	public TempShipStoresDeclaration toEscapedModel() {
		return new TempShipStoresDeclarationWrapper(_tempShipStoresDeclaration.toEscapedModel());
	}

	@Override
	public TempShipStoresDeclaration toUnescapedModel() {
		return new TempShipStoresDeclarationWrapper(_tempShipStoresDeclaration.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempShipStoresDeclaration.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempShipStoresDeclaration.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempShipStoresDeclaration.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempShipStoresDeclarationWrapper)) {
			return false;
		}

		TempShipStoresDeclarationWrapper tempShipStoresDeclarationWrapper = (TempShipStoresDeclarationWrapper)obj;

		if (Validator.equals(_tempShipStoresDeclaration,
					tempShipStoresDeclarationWrapper._tempShipStoresDeclaration)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempShipStoresDeclaration getWrappedTempShipStoresDeclaration() {
		return _tempShipStoresDeclaration;
	}

	@Override
	public TempShipStoresDeclaration getWrappedModel() {
		return _tempShipStoresDeclaration;
	}

	@Override
	public void resetOriginalValues() {
		_tempShipStoresDeclaration.resetOriginalValues();
	}

	private TempShipStoresDeclaration _tempShipStoresDeclaration;
}