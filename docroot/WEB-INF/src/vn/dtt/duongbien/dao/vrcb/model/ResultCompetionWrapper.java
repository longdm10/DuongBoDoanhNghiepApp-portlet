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
 * This class is a wrapper for {@link ResultCompetion}.
 * </p>
 *
 * @author longdm
 * @see ResultCompetion
 * @generated
 */
public class ResultCompetionWrapper implements ResultCompetion,
	ModelWrapper<ResultCompetion> {
	public ResultCompetionWrapper(ResultCompetion resultCompetion) {
		_resultCompetion = resultCompetion;
	}

	@Override
	public Class<?> getModelClass() {
		return ResultCompetion.class;
	}

	@Override
	public String getModelClassName() {
		return ResultCompetion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("requestState", getRequestState());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("nameOfShip", getNameOfShip());
		attributes.put("flagStateOfShip", getFlagStateOfShip());
		attributes.put("nameOfMaster", getNameOfMaster());
		attributes.put("grossTonnage", getGrossTonnage());
		attributes.put("portOfArrivalCode", getPortOfArrivalCode());
		attributes.put("maritimeCode", getMaritimeCode());
		attributes.put("division", getDivision());
		attributes.put("approvalName", getApprovalName());
		attributes.put("approvalTime", getApprovalTime());
		attributes.put("certificateNo", getCertificateNo());
		attributes.put("responseStatusHQ", getResponseStatusHQ());
		attributes.put("responseStatusBP", getResponseStatusBP());
		attributes.put("responseStatusYT", getResponseStatusYT());
		attributes.put("responseStatusDV", getResponseStatusDV());
		attributes.put("responseStatusTV", getResponseStatusTV());
		attributes.put("responseStatusCVHH", getResponseStatusCVHH());
		attributes.put("responseTimeHQ", getResponseTimeHQ());
		attributes.put("responseTimeBP", getResponseTimeBP());
		attributes.put("responseTimeYT", getResponseTimeYT());
		attributes.put("responseTimeDV", getResponseTimeDV());
		attributes.put("responseTimeTV", getResponseTimeTV());
		attributes.put("responseTimeCVHH", getResponseTimeCVHH());
		attributes.put("responseHQ", getResponseHQ());
		attributes.put("responseBP", getResponseBP());
		attributes.put("responseYT", getResponseYT());
		attributes.put("responseDV", getResponseDV());
		attributes.put("responseTV", getResponseTV());
		attributes.put("responseCVHH", getResponseCVHH());

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

		String nameOfShip = (String)attributes.get("nameOfShip");

		if (nameOfShip != null) {
			setNameOfShip(nameOfShip);
		}

		String flagStateOfShip = (String)attributes.get("flagStateOfShip");

		if (flagStateOfShip != null) {
			setFlagStateOfShip(flagStateOfShip);
		}

		String nameOfMaster = (String)attributes.get("nameOfMaster");

		if (nameOfMaster != null) {
			setNameOfMaster(nameOfMaster);
		}

		Double grossTonnage = (Double)attributes.get("grossTonnage");

		if (grossTonnage != null) {
			setGrossTonnage(grossTonnage);
		}

		String portOfArrivalCode = (String)attributes.get("portOfArrivalCode");

		if (portOfArrivalCode != null) {
			setPortOfArrivalCode(portOfArrivalCode);
		}

		String maritimeCode = (String)attributes.get("maritimeCode");

		if (maritimeCode != null) {
			setMaritimeCode(maritimeCode);
		}

		String division = (String)attributes.get("division");

		if (division != null) {
			setDivision(division);
		}

		String approvalName = (String)attributes.get("approvalName");

		if (approvalName != null) {
			setApprovalName(approvalName);
		}

		Date approvalTime = (Date)attributes.get("approvalTime");

		if (approvalTime != null) {
			setApprovalTime(approvalTime);
		}

		String certificateNo = (String)attributes.get("certificateNo");

		if (certificateNo != null) {
			setCertificateNo(certificateNo);
		}

		Integer responseStatusHQ = (Integer)attributes.get("responseStatusHQ");

		if (responseStatusHQ != null) {
			setResponseStatusHQ(responseStatusHQ);
		}

		Integer responseStatusBP = (Integer)attributes.get("responseStatusBP");

		if (responseStatusBP != null) {
			setResponseStatusBP(responseStatusBP);
		}

		Integer responseStatusYT = (Integer)attributes.get("responseStatusYT");

		if (responseStatusYT != null) {
			setResponseStatusYT(responseStatusYT);
		}

		Integer responseStatusDV = (Integer)attributes.get("responseStatusDV");

		if (responseStatusDV != null) {
			setResponseStatusDV(responseStatusDV);
		}

		Integer responseStatusTV = (Integer)attributes.get("responseStatusTV");

		if (responseStatusTV != null) {
			setResponseStatusTV(responseStatusTV);
		}

		Integer responseStatusCVHH = (Integer)attributes.get(
				"responseStatusCVHH");

		if (responseStatusCVHH != null) {
			setResponseStatusCVHH(responseStatusCVHH);
		}

		Date responseTimeHQ = (Date)attributes.get("responseTimeHQ");

		if (responseTimeHQ != null) {
			setResponseTimeHQ(responseTimeHQ);
		}

		Date responseTimeBP = (Date)attributes.get("responseTimeBP");

		if (responseTimeBP != null) {
			setResponseTimeBP(responseTimeBP);
		}

		Date responseTimeYT = (Date)attributes.get("responseTimeYT");

		if (responseTimeYT != null) {
			setResponseTimeYT(responseTimeYT);
		}

		Date responseTimeDV = (Date)attributes.get("responseTimeDV");

		if (responseTimeDV != null) {
			setResponseTimeDV(responseTimeDV);
		}

		Date responseTimeTV = (Date)attributes.get("responseTimeTV");

		if (responseTimeTV != null) {
			setResponseTimeTV(responseTimeTV);
		}

		Date responseTimeCVHH = (Date)attributes.get("responseTimeCVHH");

		if (responseTimeCVHH != null) {
			setResponseTimeCVHH(responseTimeCVHH);
		}

		String responseHQ = (String)attributes.get("responseHQ");

		if (responseHQ != null) {
			setResponseHQ(responseHQ);
		}

		String responseBP = (String)attributes.get("responseBP");

		if (responseBP != null) {
			setResponseBP(responseBP);
		}

		String responseYT = (String)attributes.get("responseYT");

		if (responseYT != null) {
			setResponseYT(responseYT);
		}

		String responseDV = (String)attributes.get("responseDV");

		if (responseDV != null) {
			setResponseDV(responseDV);
		}

		String responseTV = (String)attributes.get("responseTV");

		if (responseTV != null) {
			setResponseTV(responseTV);
		}

		String responseCVHH = (String)attributes.get("responseCVHH");

		if (responseCVHH != null) {
			setResponseCVHH(responseCVHH);
		}
	}

	/**
	* Returns the primary key of this result competion.
	*
	* @return the primary key of this result competion
	*/
	@Override
	public long getPrimaryKey() {
		return _resultCompetion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this result competion.
	*
	* @param primaryKey the primary key of this result competion
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_resultCompetion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this result competion.
	*
	* @return the ID of this result competion
	*/
	@Override
	public long getId() {
		return _resultCompetion.getId();
	}

	/**
	* Sets the ID of this result competion.
	*
	* @param id the ID of this result competion
	*/
	@Override
	public void setId(long id) {
		_resultCompetion.setId(id);
	}

	/**
	* Returns the request code of this result competion.
	*
	* @return the request code of this result competion
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _resultCompetion.getRequestCode();
	}

	/**
	* Sets the request code of this result competion.
	*
	* @param requestCode the request code of this result competion
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_resultCompetion.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this result competion.
	*
	* @return the request state of this result competion
	*/
	@Override
	public int getRequestState() {
		return _resultCompetion.getRequestState();
	}

	/**
	* Sets the request state of this result competion.
	*
	* @param requestState the request state of this result competion
	*/
	@Override
	public void setRequestState(int requestState) {
		_resultCompetion.setRequestState(requestState);
	}

	/**
	* Returns the document name of this result competion.
	*
	* @return the document name of this result competion
	*/
	@Override
	public long getDocumentName() {
		return _resultCompetion.getDocumentName();
	}

	/**
	* Sets the document name of this result competion.
	*
	* @param documentName the document name of this result competion
	*/
	@Override
	public void setDocumentName(long documentName) {
		_resultCompetion.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this result competion.
	*
	* @return the document year of this result competion
	*/
	@Override
	public int getDocumentYear() {
		return _resultCompetion.getDocumentYear();
	}

	/**
	* Sets the document year of this result competion.
	*
	* @param documentYear the document year of this result competion
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_resultCompetion.setDocumentYear(documentYear);
	}

	/**
	* Returns the name of ship of this result competion.
	*
	* @return the name of ship of this result competion
	*/
	@Override
	public java.lang.String getNameOfShip() {
		return _resultCompetion.getNameOfShip();
	}

	/**
	* Sets the name of ship of this result competion.
	*
	* @param nameOfShip the name of ship of this result competion
	*/
	@Override
	public void setNameOfShip(java.lang.String nameOfShip) {
		_resultCompetion.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the flag state of ship of this result competion.
	*
	* @return the flag state of ship of this result competion
	*/
	@Override
	public java.lang.String getFlagStateOfShip() {
		return _resultCompetion.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this result competion.
	*
	* @param flagStateOfShip the flag state of ship of this result competion
	*/
	@Override
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_resultCompetion.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the name of master of this result competion.
	*
	* @return the name of master of this result competion
	*/
	@Override
	public java.lang.String getNameOfMaster() {
		return _resultCompetion.getNameOfMaster();
	}

	/**
	* Sets the name of master of this result competion.
	*
	* @param nameOfMaster the name of master of this result competion
	*/
	@Override
	public void setNameOfMaster(java.lang.String nameOfMaster) {
		_resultCompetion.setNameOfMaster(nameOfMaster);
	}

	/**
	* Returns the gross tonnage of this result competion.
	*
	* @return the gross tonnage of this result competion
	*/
	@Override
	public double getGrossTonnage() {
		return _resultCompetion.getGrossTonnage();
	}

	/**
	* Sets the gross tonnage of this result competion.
	*
	* @param grossTonnage the gross tonnage of this result competion
	*/
	@Override
	public void setGrossTonnage(double grossTonnage) {
		_resultCompetion.setGrossTonnage(grossTonnage);
	}

	/**
	* Returns the port of arrival code of this result competion.
	*
	* @return the port of arrival code of this result competion
	*/
	@Override
	public java.lang.String getPortOfArrivalCode() {
		return _resultCompetion.getPortOfArrivalCode();
	}

	/**
	* Sets the port of arrival code of this result competion.
	*
	* @param portOfArrivalCode the port of arrival code of this result competion
	*/
	@Override
	public void setPortOfArrivalCode(java.lang.String portOfArrivalCode) {
		_resultCompetion.setPortOfArrivalCode(portOfArrivalCode);
	}

	/**
	* Returns the maritime code of this result competion.
	*
	* @return the maritime code of this result competion
	*/
	@Override
	public java.lang.String getMaritimeCode() {
		return _resultCompetion.getMaritimeCode();
	}

	/**
	* Sets the maritime code of this result competion.
	*
	* @param maritimeCode the maritime code of this result competion
	*/
	@Override
	public void setMaritimeCode(java.lang.String maritimeCode) {
		_resultCompetion.setMaritimeCode(maritimeCode);
	}

	/**
	* Returns the division of this result competion.
	*
	* @return the division of this result competion
	*/
	@Override
	public java.lang.String getDivision() {
		return _resultCompetion.getDivision();
	}

	/**
	* Sets the division of this result competion.
	*
	* @param division the division of this result competion
	*/
	@Override
	public void setDivision(java.lang.String division) {
		_resultCompetion.setDivision(division);
	}

	/**
	* Returns the approval name of this result competion.
	*
	* @return the approval name of this result competion
	*/
	@Override
	public java.lang.String getApprovalName() {
		return _resultCompetion.getApprovalName();
	}

	/**
	* Sets the approval name of this result competion.
	*
	* @param approvalName the approval name of this result competion
	*/
	@Override
	public void setApprovalName(java.lang.String approvalName) {
		_resultCompetion.setApprovalName(approvalName);
	}

	/**
	* Returns the approval time of this result competion.
	*
	* @return the approval time of this result competion
	*/
	@Override
	public java.util.Date getApprovalTime() {
		return _resultCompetion.getApprovalTime();
	}

	/**
	* Sets the approval time of this result competion.
	*
	* @param approvalTime the approval time of this result competion
	*/
	@Override
	public void setApprovalTime(java.util.Date approvalTime) {
		_resultCompetion.setApprovalTime(approvalTime);
	}

	/**
	* Returns the certificate no of this result competion.
	*
	* @return the certificate no of this result competion
	*/
	@Override
	public java.lang.String getCertificateNo() {
		return _resultCompetion.getCertificateNo();
	}

	/**
	* Sets the certificate no of this result competion.
	*
	* @param certificateNo the certificate no of this result competion
	*/
	@Override
	public void setCertificateNo(java.lang.String certificateNo) {
		_resultCompetion.setCertificateNo(certificateNo);
	}

	/**
	* Returns the response status h q of this result competion.
	*
	* @return the response status h q of this result competion
	*/
	@Override
	public int getResponseStatusHQ() {
		return _resultCompetion.getResponseStatusHQ();
	}

	/**
	* Sets the response status h q of this result competion.
	*
	* @param responseStatusHQ the response status h q of this result competion
	*/
	@Override
	public void setResponseStatusHQ(int responseStatusHQ) {
		_resultCompetion.setResponseStatusHQ(responseStatusHQ);
	}

	/**
	* Returns the response status b p of this result competion.
	*
	* @return the response status b p of this result competion
	*/
	@Override
	public int getResponseStatusBP() {
		return _resultCompetion.getResponseStatusBP();
	}

	/**
	* Sets the response status b p of this result competion.
	*
	* @param responseStatusBP the response status b p of this result competion
	*/
	@Override
	public void setResponseStatusBP(int responseStatusBP) {
		_resultCompetion.setResponseStatusBP(responseStatusBP);
	}

	/**
	* Returns the response status y t of this result competion.
	*
	* @return the response status y t of this result competion
	*/
	@Override
	public int getResponseStatusYT() {
		return _resultCompetion.getResponseStatusYT();
	}

	/**
	* Sets the response status y t of this result competion.
	*
	* @param responseStatusYT the response status y t of this result competion
	*/
	@Override
	public void setResponseStatusYT(int responseStatusYT) {
		_resultCompetion.setResponseStatusYT(responseStatusYT);
	}

	/**
	* Returns the response status d v of this result competion.
	*
	* @return the response status d v of this result competion
	*/
	@Override
	public int getResponseStatusDV() {
		return _resultCompetion.getResponseStatusDV();
	}

	/**
	* Sets the response status d v of this result competion.
	*
	* @param responseStatusDV the response status d v of this result competion
	*/
	@Override
	public void setResponseStatusDV(int responseStatusDV) {
		_resultCompetion.setResponseStatusDV(responseStatusDV);
	}

	/**
	* Returns the response status t v of this result competion.
	*
	* @return the response status t v of this result competion
	*/
	@Override
	public int getResponseStatusTV() {
		return _resultCompetion.getResponseStatusTV();
	}

	/**
	* Sets the response status t v of this result competion.
	*
	* @param responseStatusTV the response status t v of this result competion
	*/
	@Override
	public void setResponseStatusTV(int responseStatusTV) {
		_resultCompetion.setResponseStatusTV(responseStatusTV);
	}

	/**
	* Returns the response status c v h h of this result competion.
	*
	* @return the response status c v h h of this result competion
	*/
	@Override
	public int getResponseStatusCVHH() {
		return _resultCompetion.getResponseStatusCVHH();
	}

	/**
	* Sets the response status c v h h of this result competion.
	*
	* @param responseStatusCVHH the response status c v h h of this result competion
	*/
	@Override
	public void setResponseStatusCVHH(int responseStatusCVHH) {
		_resultCompetion.setResponseStatusCVHH(responseStatusCVHH);
	}

	/**
	* Returns the response time h q of this result competion.
	*
	* @return the response time h q of this result competion
	*/
	@Override
	public java.util.Date getResponseTimeHQ() {
		return _resultCompetion.getResponseTimeHQ();
	}

	/**
	* Sets the response time h q of this result competion.
	*
	* @param responseTimeHQ the response time h q of this result competion
	*/
	@Override
	public void setResponseTimeHQ(java.util.Date responseTimeHQ) {
		_resultCompetion.setResponseTimeHQ(responseTimeHQ);
	}

	/**
	* Returns the response time b p of this result competion.
	*
	* @return the response time b p of this result competion
	*/
	@Override
	public java.util.Date getResponseTimeBP() {
		return _resultCompetion.getResponseTimeBP();
	}

	/**
	* Sets the response time b p of this result competion.
	*
	* @param responseTimeBP the response time b p of this result competion
	*/
	@Override
	public void setResponseTimeBP(java.util.Date responseTimeBP) {
		_resultCompetion.setResponseTimeBP(responseTimeBP);
	}

	/**
	* Returns the response time y t of this result competion.
	*
	* @return the response time y t of this result competion
	*/
	@Override
	public java.util.Date getResponseTimeYT() {
		return _resultCompetion.getResponseTimeYT();
	}

	/**
	* Sets the response time y t of this result competion.
	*
	* @param responseTimeYT the response time y t of this result competion
	*/
	@Override
	public void setResponseTimeYT(java.util.Date responseTimeYT) {
		_resultCompetion.setResponseTimeYT(responseTimeYT);
	}

	/**
	* Returns the response time d v of this result competion.
	*
	* @return the response time d v of this result competion
	*/
	@Override
	public java.util.Date getResponseTimeDV() {
		return _resultCompetion.getResponseTimeDV();
	}

	/**
	* Sets the response time d v of this result competion.
	*
	* @param responseTimeDV the response time d v of this result competion
	*/
	@Override
	public void setResponseTimeDV(java.util.Date responseTimeDV) {
		_resultCompetion.setResponseTimeDV(responseTimeDV);
	}

	/**
	* Returns the response time t v of this result competion.
	*
	* @return the response time t v of this result competion
	*/
	@Override
	public java.util.Date getResponseTimeTV() {
		return _resultCompetion.getResponseTimeTV();
	}

	/**
	* Sets the response time t v of this result competion.
	*
	* @param responseTimeTV the response time t v of this result competion
	*/
	@Override
	public void setResponseTimeTV(java.util.Date responseTimeTV) {
		_resultCompetion.setResponseTimeTV(responseTimeTV);
	}

	/**
	* Returns the response time c v h h of this result competion.
	*
	* @return the response time c v h h of this result competion
	*/
	@Override
	public java.util.Date getResponseTimeCVHH() {
		return _resultCompetion.getResponseTimeCVHH();
	}

	/**
	* Sets the response time c v h h of this result competion.
	*
	* @param responseTimeCVHH the response time c v h h of this result competion
	*/
	@Override
	public void setResponseTimeCVHH(java.util.Date responseTimeCVHH) {
		_resultCompetion.setResponseTimeCVHH(responseTimeCVHH);
	}

	/**
	* Returns the response h q of this result competion.
	*
	* @return the response h q of this result competion
	*/
	@Override
	public java.lang.String getResponseHQ() {
		return _resultCompetion.getResponseHQ();
	}

	/**
	* Sets the response h q of this result competion.
	*
	* @param responseHQ the response h q of this result competion
	*/
	@Override
	public void setResponseHQ(java.lang.String responseHQ) {
		_resultCompetion.setResponseHQ(responseHQ);
	}

	/**
	* Returns the response b p of this result competion.
	*
	* @return the response b p of this result competion
	*/
	@Override
	public java.lang.String getResponseBP() {
		return _resultCompetion.getResponseBP();
	}

	/**
	* Sets the response b p of this result competion.
	*
	* @param responseBP the response b p of this result competion
	*/
	@Override
	public void setResponseBP(java.lang.String responseBP) {
		_resultCompetion.setResponseBP(responseBP);
	}

	/**
	* Returns the response y t of this result competion.
	*
	* @return the response y t of this result competion
	*/
	@Override
	public java.lang.String getResponseYT() {
		return _resultCompetion.getResponseYT();
	}

	/**
	* Sets the response y t of this result competion.
	*
	* @param responseYT the response y t of this result competion
	*/
	@Override
	public void setResponseYT(java.lang.String responseYT) {
		_resultCompetion.setResponseYT(responseYT);
	}

	/**
	* Returns the response d v of this result competion.
	*
	* @return the response d v of this result competion
	*/
	@Override
	public java.lang.String getResponseDV() {
		return _resultCompetion.getResponseDV();
	}

	/**
	* Sets the response d v of this result competion.
	*
	* @param responseDV the response d v of this result competion
	*/
	@Override
	public void setResponseDV(java.lang.String responseDV) {
		_resultCompetion.setResponseDV(responseDV);
	}

	/**
	* Returns the response t v of this result competion.
	*
	* @return the response t v of this result competion
	*/
	@Override
	public java.lang.String getResponseTV() {
		return _resultCompetion.getResponseTV();
	}

	/**
	* Sets the response t v of this result competion.
	*
	* @param responseTV the response t v of this result competion
	*/
	@Override
	public void setResponseTV(java.lang.String responseTV) {
		_resultCompetion.setResponseTV(responseTV);
	}

	/**
	* Returns the response c v h h of this result competion.
	*
	* @return the response c v h h of this result competion
	*/
	@Override
	public java.lang.String getResponseCVHH() {
		return _resultCompetion.getResponseCVHH();
	}

	/**
	* Sets the response c v h h of this result competion.
	*
	* @param responseCVHH the response c v h h of this result competion
	*/
	@Override
	public void setResponseCVHH(java.lang.String responseCVHH) {
		_resultCompetion.setResponseCVHH(responseCVHH);
	}

	@Override
	public boolean isNew() {
		return _resultCompetion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_resultCompetion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _resultCompetion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_resultCompetion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _resultCompetion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _resultCompetion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_resultCompetion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _resultCompetion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_resultCompetion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_resultCompetion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_resultCompetion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ResultCompetionWrapper((ResultCompetion)_resultCompetion.clone());
	}

	@Override
	public int compareTo(ResultCompetion resultCompetion) {
		return _resultCompetion.compareTo(resultCompetion);
	}

	@Override
	public int hashCode() {
		return _resultCompetion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<ResultCompetion> toCacheModel() {
		return _resultCompetion.toCacheModel();
	}

	@Override
	public ResultCompetion toEscapedModel() {
		return new ResultCompetionWrapper(_resultCompetion.toEscapedModel());
	}

	@Override
	public ResultCompetion toUnescapedModel() {
		return new ResultCompetionWrapper(_resultCompetion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _resultCompetion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _resultCompetion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_resultCompetion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ResultCompetionWrapper)) {
			return false;
		}

		ResultCompetionWrapper resultCompetionWrapper = (ResultCompetionWrapper)obj;

		if (Validator.equals(_resultCompetion,
					resultCompetionWrapper._resultCompetion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ResultCompetion getWrappedResultCompetion() {
		return _resultCompetion;
	}

	@Override
	public ResultCompetion getWrappedModel() {
		return _resultCompetion;
	}

	@Override
	public void resetOriginalValues() {
		_resultCompetion.resetOriginalValues();
	}

	private ResultCompetion _resultCompetion;
}