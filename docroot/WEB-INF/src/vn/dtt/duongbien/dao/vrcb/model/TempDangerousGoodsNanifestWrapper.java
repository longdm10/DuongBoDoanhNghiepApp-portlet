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
 * This class is a wrapper for {@link TempDangerousGoodsNanifest}.
 * </p>
 *
 * @author longdm
 * @see TempDangerousGoodsNanifest
 * @generated
 */
public class TempDangerousGoodsNanifestWrapper
	implements TempDangerousGoodsNanifest,
		ModelWrapper<TempDangerousGoodsNanifest> {
	public TempDangerousGoodsNanifestWrapper(
		TempDangerousGoodsNanifest tempDangerousGoodsNanifest) {
		_tempDangerousGoodsNanifest = tempDangerousGoodsNanifest;
	}

	@Override
	public Class<?> getModelClass() {
		return TempDangerousGoodsNanifest.class;
	}

	@Override
	public String getModelClassName() {
		return TempDangerousGoodsNanifest.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("requestState", getRequestState());
		attributes.put("documentName", getDocumentName());
		attributes.put("userCreated", getUserCreated());
		attributes.put("nameOfShip", getNameOfShip());
		attributes.put("flagStateOfShip", getFlagStateOfShip());
		attributes.put("masterName", getMasterName());
		attributes.put("imoNumber", getImoNumber());
		attributes.put("callsign", getCallsign());
		attributes.put("voyageNumber", getVoyageNumber());
		attributes.put("portOfLoadingCode", getPortOfLoadingCode());
		attributes.put("portOfDischargeCode", getPortOfDischargeCode());
		attributes.put("shippingAgent", getShippingAgent());
		attributes.put("additionalRemark", getAdditionalRemark());
		attributes.put("listDangerousGoods", getListDangerousGoods());
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

		String nameOfShip = (String)attributes.get("nameOfShip");

		if (nameOfShip != null) {
			setNameOfShip(nameOfShip);
		}

		String flagStateOfShip = (String)attributes.get("flagStateOfShip");

		if (flagStateOfShip != null) {
			setFlagStateOfShip(flagStateOfShip);
		}

		String masterName = (String)attributes.get("masterName");

		if (masterName != null) {
			setMasterName(masterName);
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

		String portOfLoadingCode = (String)attributes.get("portOfLoadingCode");

		if (portOfLoadingCode != null) {
			setPortOfLoadingCode(portOfLoadingCode);
		}

		String portOfDischargeCode = (String)attributes.get(
				"portOfDischargeCode");

		if (portOfDischargeCode != null) {
			setPortOfDischargeCode(portOfDischargeCode);
		}

		String shippingAgent = (String)attributes.get("shippingAgent");

		if (shippingAgent != null) {
			setShippingAgent(shippingAgent);
		}

		String additionalRemark = (String)attributes.get("additionalRemark");

		if (additionalRemark != null) {
			setAdditionalRemark(additionalRemark);
		}

		Integer listDangerousGoods = (Integer)attributes.get(
				"listDangerousGoods");

		if (listDangerousGoods != null) {
			setListDangerousGoods(listDangerousGoods);
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
	* Returns the primary key of this temp dangerous goods nanifest.
	*
	* @return the primary key of this temp dangerous goods nanifest
	*/
	@Override
	public long getPrimaryKey() {
		return _tempDangerousGoodsNanifest.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp dangerous goods nanifest.
	*
	* @param primaryKey the primary key of this temp dangerous goods nanifest
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempDangerousGoodsNanifest.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp dangerous goods nanifest.
	*
	* @return the ID of this temp dangerous goods nanifest
	*/
	@Override
	public long getId() {
		return _tempDangerousGoodsNanifest.getId();
	}

	/**
	* Sets the ID of this temp dangerous goods nanifest.
	*
	* @param id the ID of this temp dangerous goods nanifest
	*/
	@Override
	public void setId(long id) {
		_tempDangerousGoodsNanifest.setId(id);
	}

	/**
	* Returns the request code of this temp dangerous goods nanifest.
	*
	* @return the request code of this temp dangerous goods nanifest
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempDangerousGoodsNanifest.getRequestCode();
	}

	/**
	* Sets the request code of this temp dangerous goods nanifest.
	*
	* @param requestCode the request code of this temp dangerous goods nanifest
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempDangerousGoodsNanifest.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp dangerous goods nanifest.
	*
	* @return the request state of this temp dangerous goods nanifest
	*/
	@Override
	public int getRequestState() {
		return _tempDangerousGoodsNanifest.getRequestState();
	}

	/**
	* Sets the request state of this temp dangerous goods nanifest.
	*
	* @param requestState the request state of this temp dangerous goods nanifest
	*/
	@Override
	public void setRequestState(int requestState) {
		_tempDangerousGoodsNanifest.setRequestState(requestState);
	}

	/**
	* Returns the document name of this temp dangerous goods nanifest.
	*
	* @return the document name of this temp dangerous goods nanifest
	*/
	@Override
	public long getDocumentName() {
		return _tempDangerousGoodsNanifest.getDocumentName();
	}

	/**
	* Sets the document name of this temp dangerous goods nanifest.
	*
	* @param documentName the document name of this temp dangerous goods nanifest
	*/
	@Override
	public void setDocumentName(long documentName) {
		_tempDangerousGoodsNanifest.setDocumentName(documentName);
	}

	/**
	* Returns the user created of this temp dangerous goods nanifest.
	*
	* @return the user created of this temp dangerous goods nanifest
	*/
	@Override
	public java.lang.String getUserCreated() {
		return _tempDangerousGoodsNanifest.getUserCreated();
	}

	/**
	* Sets the user created of this temp dangerous goods nanifest.
	*
	* @param userCreated the user created of this temp dangerous goods nanifest
	*/
	@Override
	public void setUserCreated(java.lang.String userCreated) {
		_tempDangerousGoodsNanifest.setUserCreated(userCreated);
	}

	/**
	* Returns the name of ship of this temp dangerous goods nanifest.
	*
	* @return the name of ship of this temp dangerous goods nanifest
	*/
	@Override
	public java.lang.String getNameOfShip() {
		return _tempDangerousGoodsNanifest.getNameOfShip();
	}

	/**
	* Sets the name of ship of this temp dangerous goods nanifest.
	*
	* @param nameOfShip the name of ship of this temp dangerous goods nanifest
	*/
	@Override
	public void setNameOfShip(java.lang.String nameOfShip) {
		_tempDangerousGoodsNanifest.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the flag state of ship of this temp dangerous goods nanifest.
	*
	* @return the flag state of ship of this temp dangerous goods nanifest
	*/
	@Override
	public java.lang.String getFlagStateOfShip() {
		return _tempDangerousGoodsNanifest.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this temp dangerous goods nanifest.
	*
	* @param flagStateOfShip the flag state of ship of this temp dangerous goods nanifest
	*/
	@Override
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_tempDangerousGoodsNanifest.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the master name of this temp dangerous goods nanifest.
	*
	* @return the master name of this temp dangerous goods nanifest
	*/
	@Override
	public java.lang.String getMasterName() {
		return _tempDangerousGoodsNanifest.getMasterName();
	}

	/**
	* Sets the master name of this temp dangerous goods nanifest.
	*
	* @param masterName the master name of this temp dangerous goods nanifest
	*/
	@Override
	public void setMasterName(java.lang.String masterName) {
		_tempDangerousGoodsNanifest.setMasterName(masterName);
	}

	/**
	* Returns the imo number of this temp dangerous goods nanifest.
	*
	* @return the imo number of this temp dangerous goods nanifest
	*/
	@Override
	public java.lang.String getImoNumber() {
		return _tempDangerousGoodsNanifest.getImoNumber();
	}

	/**
	* Sets the imo number of this temp dangerous goods nanifest.
	*
	* @param imoNumber the imo number of this temp dangerous goods nanifest
	*/
	@Override
	public void setImoNumber(java.lang.String imoNumber) {
		_tempDangerousGoodsNanifest.setImoNumber(imoNumber);
	}

	/**
	* Returns the callsign of this temp dangerous goods nanifest.
	*
	* @return the callsign of this temp dangerous goods nanifest
	*/
	@Override
	public java.lang.String getCallsign() {
		return _tempDangerousGoodsNanifest.getCallsign();
	}

	/**
	* Sets the callsign of this temp dangerous goods nanifest.
	*
	* @param callsign the callsign of this temp dangerous goods nanifest
	*/
	@Override
	public void setCallsign(java.lang.String callsign) {
		_tempDangerousGoodsNanifest.setCallsign(callsign);
	}

	/**
	* Returns the voyage number of this temp dangerous goods nanifest.
	*
	* @return the voyage number of this temp dangerous goods nanifest
	*/
	@Override
	public java.lang.String getVoyageNumber() {
		return _tempDangerousGoodsNanifest.getVoyageNumber();
	}

	/**
	* Sets the voyage number of this temp dangerous goods nanifest.
	*
	* @param voyageNumber the voyage number of this temp dangerous goods nanifest
	*/
	@Override
	public void setVoyageNumber(java.lang.String voyageNumber) {
		_tempDangerousGoodsNanifest.setVoyageNumber(voyageNumber);
	}

	/**
	* Returns the port of loading code of this temp dangerous goods nanifest.
	*
	* @return the port of loading code of this temp dangerous goods nanifest
	*/
	@Override
	public java.lang.String getPortOfLoadingCode() {
		return _tempDangerousGoodsNanifest.getPortOfLoadingCode();
	}

	/**
	* Sets the port of loading code of this temp dangerous goods nanifest.
	*
	* @param portOfLoadingCode the port of loading code of this temp dangerous goods nanifest
	*/
	@Override
	public void setPortOfLoadingCode(java.lang.String portOfLoadingCode) {
		_tempDangerousGoodsNanifest.setPortOfLoadingCode(portOfLoadingCode);
	}

	/**
	* Returns the port of discharge code of this temp dangerous goods nanifest.
	*
	* @return the port of discharge code of this temp dangerous goods nanifest
	*/
	@Override
	public java.lang.String getPortOfDischargeCode() {
		return _tempDangerousGoodsNanifest.getPortOfDischargeCode();
	}

	/**
	* Sets the port of discharge code of this temp dangerous goods nanifest.
	*
	* @param portOfDischargeCode the port of discharge code of this temp dangerous goods nanifest
	*/
	@Override
	public void setPortOfDischargeCode(java.lang.String portOfDischargeCode) {
		_tempDangerousGoodsNanifest.setPortOfDischargeCode(portOfDischargeCode);
	}

	/**
	* Returns the shipping agent of this temp dangerous goods nanifest.
	*
	* @return the shipping agent of this temp dangerous goods nanifest
	*/
	@Override
	public java.lang.String getShippingAgent() {
		return _tempDangerousGoodsNanifest.getShippingAgent();
	}

	/**
	* Sets the shipping agent of this temp dangerous goods nanifest.
	*
	* @param shippingAgent the shipping agent of this temp dangerous goods nanifest
	*/
	@Override
	public void setShippingAgent(java.lang.String shippingAgent) {
		_tempDangerousGoodsNanifest.setShippingAgent(shippingAgent);
	}

	/**
	* Returns the additional remark of this temp dangerous goods nanifest.
	*
	* @return the additional remark of this temp dangerous goods nanifest
	*/
	@Override
	public java.lang.String getAdditionalRemark() {
		return _tempDangerousGoodsNanifest.getAdditionalRemark();
	}

	/**
	* Sets the additional remark of this temp dangerous goods nanifest.
	*
	* @param additionalRemark the additional remark of this temp dangerous goods nanifest
	*/
	@Override
	public void setAdditionalRemark(java.lang.String additionalRemark) {
		_tempDangerousGoodsNanifest.setAdditionalRemark(additionalRemark);
	}

	/**
	* Returns the list dangerous goods of this temp dangerous goods nanifest.
	*
	* @return the list dangerous goods of this temp dangerous goods nanifest
	*/
	@Override
	public int getListDangerousGoods() {
		return _tempDangerousGoodsNanifest.getListDangerousGoods();
	}

	/**
	* Sets the list dangerous goods of this temp dangerous goods nanifest.
	*
	* @param listDangerousGoods the list dangerous goods of this temp dangerous goods nanifest
	*/
	@Override
	public void setListDangerousGoods(int listDangerousGoods) {
		_tempDangerousGoodsNanifest.setListDangerousGoods(listDangerousGoods);
	}

	/**
	* Returns the sign place of this temp dangerous goods nanifest.
	*
	* @return the sign place of this temp dangerous goods nanifest
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _tempDangerousGoodsNanifest.getSignPlace();
	}

	/**
	* Sets the sign place of this temp dangerous goods nanifest.
	*
	* @param signPlace the sign place of this temp dangerous goods nanifest
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_tempDangerousGoodsNanifest.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this temp dangerous goods nanifest.
	*
	* @return the sign date of this temp dangerous goods nanifest
	*/
	@Override
	public java.util.Date getSignDate() {
		return _tempDangerousGoodsNanifest.getSignDate();
	}

	/**
	* Sets the sign date of this temp dangerous goods nanifest.
	*
	* @param signDate the sign date of this temp dangerous goods nanifest
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_tempDangerousGoodsNanifest.setSignDate(signDate);
	}

	/**
	* Returns the master signed of this temp dangerous goods nanifest.
	*
	* @return the master signed of this temp dangerous goods nanifest
	*/
	@Override
	public int getMasterSigned() {
		return _tempDangerousGoodsNanifest.getMasterSigned();
	}

	/**
	* Sets the master signed of this temp dangerous goods nanifest.
	*
	* @param masterSigned the master signed of this temp dangerous goods nanifest
	*/
	@Override
	public void setMasterSigned(int masterSigned) {
		_tempDangerousGoodsNanifest.setMasterSigned(masterSigned);
	}

	/**
	* Returns the master signed image of this temp dangerous goods nanifest.
	*
	* @return the master signed image of this temp dangerous goods nanifest
	*/
	@Override
	public int getMasterSignedImage() {
		return _tempDangerousGoodsNanifest.getMasterSignedImage();
	}

	/**
	* Sets the master signed image of this temp dangerous goods nanifest.
	*
	* @param masterSignedImage the master signed image of this temp dangerous goods nanifest
	*/
	@Override
	public void setMasterSignedImage(int masterSignedImage) {
		_tempDangerousGoodsNanifest.setMasterSignedImage(masterSignedImage);
	}

	/**
	* Returns the attached file of this temp dangerous goods nanifest.
	*
	* @return the attached file of this temp dangerous goods nanifest
	*/
	@Override
	public long getAttachedFile() {
		return _tempDangerousGoodsNanifest.getAttachedFile();
	}

	/**
	* Sets the attached file of this temp dangerous goods nanifest.
	*
	* @param attachedFile the attached file of this temp dangerous goods nanifest
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_tempDangerousGoodsNanifest.setAttachedFile(attachedFile);
	}

	/**
	* Returns the document year of this temp dangerous goods nanifest.
	*
	* @return the document year of this temp dangerous goods nanifest
	*/
	@Override
	public int getDocumentYear() {
		return _tempDangerousGoodsNanifest.getDocumentYear();
	}

	/**
	* Sets the document year of this temp dangerous goods nanifest.
	*
	* @param documentYear the document year of this temp dangerous goods nanifest
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_tempDangerousGoodsNanifest.setDocumentYear(documentYear);
	}

	@Override
	public boolean isNew() {
		return _tempDangerousGoodsNanifest.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempDangerousGoodsNanifest.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempDangerousGoodsNanifest.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempDangerousGoodsNanifest.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempDangerousGoodsNanifest.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempDangerousGoodsNanifest.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempDangerousGoodsNanifest.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempDangerousGoodsNanifest.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempDangerousGoodsNanifest.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempDangerousGoodsNanifest.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempDangerousGoodsNanifest.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempDangerousGoodsNanifestWrapper((TempDangerousGoodsNanifest)_tempDangerousGoodsNanifest.clone());
	}

	@Override
	public int compareTo(TempDangerousGoodsNanifest tempDangerousGoodsNanifest) {
		return _tempDangerousGoodsNanifest.compareTo(tempDangerousGoodsNanifest);
	}

	@Override
	public int hashCode() {
		return _tempDangerousGoodsNanifest.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<TempDangerousGoodsNanifest> toCacheModel() {
		return _tempDangerousGoodsNanifest.toCacheModel();
	}

	@Override
	public TempDangerousGoodsNanifest toEscapedModel() {
		return new TempDangerousGoodsNanifestWrapper(_tempDangerousGoodsNanifest.toEscapedModel());
	}

	@Override
	public TempDangerousGoodsNanifest toUnescapedModel() {
		return new TempDangerousGoodsNanifestWrapper(_tempDangerousGoodsNanifest.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempDangerousGoodsNanifest.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempDangerousGoodsNanifest.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempDangerousGoodsNanifest.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempDangerousGoodsNanifestWrapper)) {
			return false;
		}

		TempDangerousGoodsNanifestWrapper tempDangerousGoodsNanifestWrapper = (TempDangerousGoodsNanifestWrapper)obj;

		if (Validator.equals(_tempDangerousGoodsNanifest,
					tempDangerousGoodsNanifestWrapper._tempDangerousGoodsNanifest)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempDangerousGoodsNanifest getWrappedTempDangerousGoodsNanifest() {
		return _tempDangerousGoodsNanifest;
	}

	@Override
	public TempDangerousGoodsNanifest getWrappedModel() {
		return _tempDangerousGoodsNanifest;
	}

	@Override
	public void resetOriginalValues() {
		_tempDangerousGoodsNanifest.resetOriginalValues();
	}

	private TempDangerousGoodsNanifest _tempDangerousGoodsNanifest;
}