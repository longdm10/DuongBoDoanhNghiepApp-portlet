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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbien.dao.vrcb.service.ClpSerializer;
import vn.dtt.duongbien.dao.vrcb.service.ResultCompetionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class ResultCompetionClp extends BaseModelImpl<ResultCompetion>
	implements ResultCompetion {
	public ResultCompetionClp() {
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
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_resultCompetionRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRequestCode() {
		return _requestCode;
	}

	@Override
	public void setRequestCode(String requestCode) {
		_requestCode = requestCode;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_resultCompetionRemoteModel, requestCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getRequestState() {
		return _requestState;
	}

	@Override
	public void setRequestState(int requestState) {
		_requestState = requestState;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestState", int.class);

				method.invoke(_resultCompetionRemoteModel, requestState);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDocumentName() {
		return _documentName;
	}

	@Override
	public void setDocumentName(long documentName) {
		_documentName = documentName;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_resultCompetionRemoteModel, documentName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDocumentYear() {
		return _documentYear;
	}

	@Override
	public void setDocumentYear(int documentYear) {
		_documentYear = documentYear;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_resultCompetionRemoteModel, documentYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNameOfShip() {
		return _nameOfShip;
	}

	@Override
	public void setNameOfShip(String nameOfShip) {
		_nameOfShip = nameOfShip;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfShip", String.class);

				method.invoke(_resultCompetionRemoteModel, nameOfShip);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFlagStateOfShip() {
		return _flagStateOfShip;
	}

	@Override
	public void setFlagStateOfShip(String flagStateOfShip) {
		_flagStateOfShip = flagStateOfShip;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setFlagStateOfShip",
						String.class);

				method.invoke(_resultCompetionRemoteModel, flagStateOfShip);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNameOfMaster() {
		return _nameOfMaster;
	}

	@Override
	public void setNameOfMaster(String nameOfMaster) {
		_nameOfMaster = nameOfMaster;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfMaster", String.class);

				method.invoke(_resultCompetionRemoteModel, nameOfMaster);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getGrossTonnage() {
		return _grossTonnage;
	}

	@Override
	public void setGrossTonnage(double grossTonnage) {
		_grossTonnage = grossTonnage;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setGrossTonnage", double.class);

				method.invoke(_resultCompetionRemoteModel, grossTonnage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortOfArrivalCode() {
		return _portOfArrivalCode;
	}

	@Override
	public void setPortOfArrivalCode(String portOfArrivalCode) {
		_portOfArrivalCode = portOfArrivalCode;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setPortOfArrivalCode",
						String.class);

				method.invoke(_resultCompetionRemoteModel, portOfArrivalCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaritimeCode() {
		return _maritimeCode;
	}

	@Override
	public void setMaritimeCode(String maritimeCode) {
		_maritimeCode = maritimeCode;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setMaritimeCode", String.class);

				method.invoke(_resultCompetionRemoteModel, maritimeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDivision() {
		return _division;
	}

	@Override
	public void setDivision(String division) {
		_division = division;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setDivision", String.class);

				method.invoke(_resultCompetionRemoteModel, division);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApprovalName() {
		return _approvalName;
	}

	@Override
	public void setApprovalName(String approvalName) {
		_approvalName = approvalName;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovalName", String.class);

				method.invoke(_resultCompetionRemoteModel, approvalName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getApprovalTime() {
		return _approvalTime;
	}

	@Override
	public void setApprovalTime(Date approvalTime) {
		_approvalTime = approvalTime;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovalTime", Date.class);

				method.invoke(_resultCompetionRemoteModel, approvalTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCertificateNo() {
		return _certificateNo;
	}

	@Override
	public void setCertificateNo(String certificateNo) {
		_certificateNo = certificateNo;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateNo", String.class);

				method.invoke(_resultCompetionRemoteModel, certificateNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getResponseStatusHQ() {
		return _responseStatusHQ;
	}

	@Override
	public void setResponseStatusHQ(int responseStatusHQ) {
		_responseStatusHQ = responseStatusHQ;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setResponseStatusHQ", int.class);

				method.invoke(_resultCompetionRemoteModel, responseStatusHQ);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getResponseStatusBP() {
		return _responseStatusBP;
	}

	@Override
	public void setResponseStatusBP(int responseStatusBP) {
		_responseStatusBP = responseStatusBP;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setResponseStatusBP", int.class);

				method.invoke(_resultCompetionRemoteModel, responseStatusBP);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getResponseStatusYT() {
		return _responseStatusYT;
	}

	@Override
	public void setResponseStatusYT(int responseStatusYT) {
		_responseStatusYT = responseStatusYT;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setResponseStatusYT", int.class);

				method.invoke(_resultCompetionRemoteModel, responseStatusYT);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getResponseStatusDV() {
		return _responseStatusDV;
	}

	@Override
	public void setResponseStatusDV(int responseStatusDV) {
		_responseStatusDV = responseStatusDV;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setResponseStatusDV", int.class);

				method.invoke(_resultCompetionRemoteModel, responseStatusDV);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getResponseStatusTV() {
		return _responseStatusTV;
	}

	@Override
	public void setResponseStatusTV(int responseStatusTV) {
		_responseStatusTV = responseStatusTV;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setResponseStatusTV", int.class);

				method.invoke(_resultCompetionRemoteModel, responseStatusTV);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getResponseStatusCVHH() {
		return _responseStatusCVHH;
	}

	@Override
	public void setResponseStatusCVHH(int responseStatusCVHH) {
		_responseStatusCVHH = responseStatusCVHH;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setResponseStatusCVHH",
						int.class);

				method.invoke(_resultCompetionRemoteModel, responseStatusCVHH);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getResponseTimeHQ() {
		return _responseTimeHQ;
	}

	@Override
	public void setResponseTimeHQ(Date responseTimeHQ) {
		_responseTimeHQ = responseTimeHQ;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setResponseTimeHQ", Date.class);

				method.invoke(_resultCompetionRemoteModel, responseTimeHQ);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getResponseTimeBP() {
		return _responseTimeBP;
	}

	@Override
	public void setResponseTimeBP(Date responseTimeBP) {
		_responseTimeBP = responseTimeBP;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setResponseTimeBP", Date.class);

				method.invoke(_resultCompetionRemoteModel, responseTimeBP);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getResponseTimeYT() {
		return _responseTimeYT;
	}

	@Override
	public void setResponseTimeYT(Date responseTimeYT) {
		_responseTimeYT = responseTimeYT;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setResponseTimeYT", Date.class);

				method.invoke(_resultCompetionRemoteModel, responseTimeYT);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getResponseTimeDV() {
		return _responseTimeDV;
	}

	@Override
	public void setResponseTimeDV(Date responseTimeDV) {
		_responseTimeDV = responseTimeDV;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setResponseTimeDV", Date.class);

				method.invoke(_resultCompetionRemoteModel, responseTimeDV);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getResponseTimeTV() {
		return _responseTimeTV;
	}

	@Override
	public void setResponseTimeTV(Date responseTimeTV) {
		_responseTimeTV = responseTimeTV;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setResponseTimeTV", Date.class);

				method.invoke(_resultCompetionRemoteModel, responseTimeTV);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getResponseTimeCVHH() {
		return _responseTimeCVHH;
	}

	@Override
	public void setResponseTimeCVHH(Date responseTimeCVHH) {
		_responseTimeCVHH = responseTimeCVHH;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setResponseTimeCVHH",
						Date.class);

				method.invoke(_resultCompetionRemoteModel, responseTimeCVHH);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getResponseHQ() {
		return _responseHQ;
	}

	@Override
	public void setResponseHQ(String responseHQ) {
		_responseHQ = responseHQ;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setResponseHQ", String.class);

				method.invoke(_resultCompetionRemoteModel, responseHQ);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getResponseBP() {
		return _responseBP;
	}

	@Override
	public void setResponseBP(String responseBP) {
		_responseBP = responseBP;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setResponseBP", String.class);

				method.invoke(_resultCompetionRemoteModel, responseBP);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getResponseYT() {
		return _responseYT;
	}

	@Override
	public void setResponseYT(String responseYT) {
		_responseYT = responseYT;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setResponseYT", String.class);

				method.invoke(_resultCompetionRemoteModel, responseYT);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getResponseDV() {
		return _responseDV;
	}

	@Override
	public void setResponseDV(String responseDV) {
		_responseDV = responseDV;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setResponseDV", String.class);

				method.invoke(_resultCompetionRemoteModel, responseDV);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getResponseTV() {
		return _responseTV;
	}

	@Override
	public void setResponseTV(String responseTV) {
		_responseTV = responseTV;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setResponseTV", String.class);

				method.invoke(_resultCompetionRemoteModel, responseTV);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getResponseCVHH() {
		return _responseCVHH;
	}

	@Override
	public void setResponseCVHH(String responseCVHH) {
		_responseCVHH = responseCVHH;

		if (_resultCompetionRemoteModel != null) {
			try {
				Class<?> clazz = _resultCompetionRemoteModel.getClass();

				Method method = clazz.getMethod("setResponseCVHH", String.class);

				method.invoke(_resultCompetionRemoteModel, responseCVHH);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getResultCompetionRemoteModel() {
		return _resultCompetionRemoteModel;
	}

	public void setResultCompetionRemoteModel(
		BaseModel<?> resultCompetionRemoteModel) {
		_resultCompetionRemoteModel = resultCompetionRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _resultCompetionRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_resultCompetionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ResultCompetionLocalServiceUtil.addResultCompetion(this);
		}
		else {
			ResultCompetionLocalServiceUtil.updateResultCompetion(this);
		}
	}

	@Override
	public ResultCompetion toEscapedModel() {
		return (ResultCompetion)ProxyUtil.newProxyInstance(ResultCompetion.class.getClassLoader(),
			new Class[] { ResultCompetion.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ResultCompetionClp clone = new ResultCompetionClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setNameOfShip(getNameOfShip());
		clone.setFlagStateOfShip(getFlagStateOfShip());
		clone.setNameOfMaster(getNameOfMaster());
		clone.setGrossTonnage(getGrossTonnage());
		clone.setPortOfArrivalCode(getPortOfArrivalCode());
		clone.setMaritimeCode(getMaritimeCode());
		clone.setDivision(getDivision());
		clone.setApprovalName(getApprovalName());
		clone.setApprovalTime(getApprovalTime());
		clone.setCertificateNo(getCertificateNo());
		clone.setResponseStatusHQ(getResponseStatusHQ());
		clone.setResponseStatusBP(getResponseStatusBP());
		clone.setResponseStatusYT(getResponseStatusYT());
		clone.setResponseStatusDV(getResponseStatusDV());
		clone.setResponseStatusTV(getResponseStatusTV());
		clone.setResponseStatusCVHH(getResponseStatusCVHH());
		clone.setResponseTimeHQ(getResponseTimeHQ());
		clone.setResponseTimeBP(getResponseTimeBP());
		clone.setResponseTimeYT(getResponseTimeYT());
		clone.setResponseTimeDV(getResponseTimeDV());
		clone.setResponseTimeTV(getResponseTimeTV());
		clone.setResponseTimeCVHH(getResponseTimeCVHH());
		clone.setResponseHQ(getResponseHQ());
		clone.setResponseBP(getResponseBP());
		clone.setResponseYT(getResponseYT());
		clone.setResponseDV(getResponseDV());
		clone.setResponseTV(getResponseTV());
		clone.setResponseCVHH(getResponseCVHH());

		return clone;
	}

	@Override
	public int compareTo(ResultCompetion resultCompetion) {
		int value = 0;

		if (getId() < resultCompetion.getId()) {
			value = -1;
		}
		else if (getId() > resultCompetion.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ResultCompetionClp)) {
			return false;
		}

		ResultCompetionClp resultCompetion = (ResultCompetionClp)obj;

		long primaryKey = resultCompetion.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(67);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", nameOfShip=");
		sb.append(getNameOfShip());
		sb.append(", flagStateOfShip=");
		sb.append(getFlagStateOfShip());
		sb.append(", nameOfMaster=");
		sb.append(getNameOfMaster());
		sb.append(", grossTonnage=");
		sb.append(getGrossTonnage());
		sb.append(", portOfArrivalCode=");
		sb.append(getPortOfArrivalCode());
		sb.append(", maritimeCode=");
		sb.append(getMaritimeCode());
		sb.append(", division=");
		sb.append(getDivision());
		sb.append(", approvalName=");
		sb.append(getApprovalName());
		sb.append(", approvalTime=");
		sb.append(getApprovalTime());
		sb.append(", certificateNo=");
		sb.append(getCertificateNo());
		sb.append(", responseStatusHQ=");
		sb.append(getResponseStatusHQ());
		sb.append(", responseStatusBP=");
		sb.append(getResponseStatusBP());
		sb.append(", responseStatusYT=");
		sb.append(getResponseStatusYT());
		sb.append(", responseStatusDV=");
		sb.append(getResponseStatusDV());
		sb.append(", responseStatusTV=");
		sb.append(getResponseStatusTV());
		sb.append(", responseStatusCVHH=");
		sb.append(getResponseStatusCVHH());
		sb.append(", responseTimeHQ=");
		sb.append(getResponseTimeHQ());
		sb.append(", responseTimeBP=");
		sb.append(getResponseTimeBP());
		sb.append(", responseTimeYT=");
		sb.append(getResponseTimeYT());
		sb.append(", responseTimeDV=");
		sb.append(getResponseTimeDV());
		sb.append(", responseTimeTV=");
		sb.append(getResponseTimeTV());
		sb.append(", responseTimeCVHH=");
		sb.append(getResponseTimeCVHH());
		sb.append(", responseHQ=");
		sb.append(getResponseHQ());
		sb.append(", responseBP=");
		sb.append(getResponseBP());
		sb.append(", responseYT=");
		sb.append(getResponseYT());
		sb.append(", responseDV=");
		sb.append(getResponseDV());
		sb.append(", responseTV=");
		sb.append(getResponseTV());
		sb.append(", responseCVHH=");
		sb.append(getResponseCVHH());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(103);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.ResultCompetion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestCode</column-name><column-value><![CDATA[");
		sb.append(getRequestCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestState</column-name><column-value><![CDATA[");
		sb.append(getRequestState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfShip</column-name><column-value><![CDATA[");
		sb.append(getNameOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flagStateOfShip</column-name><column-value><![CDATA[");
		sb.append(getFlagStateOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfMaster</column-name><column-value><![CDATA[");
		sb.append(getNameOfMaster());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grossTonnage</column-name><column-value><![CDATA[");
		sb.append(getGrossTonnage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portOfArrivalCode</column-name><column-value><![CDATA[");
		sb.append(getPortOfArrivalCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeCode</column-name><column-value><![CDATA[");
		sb.append(getMaritimeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>division</column-name><column-value><![CDATA[");
		sb.append(getDivision());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvalName</column-name><column-value><![CDATA[");
		sb.append(getApprovalName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvalTime</column-name><column-value><![CDATA[");
		sb.append(getApprovalTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateNo</column-name><column-value><![CDATA[");
		sb.append(getCertificateNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseStatusHQ</column-name><column-value><![CDATA[");
		sb.append(getResponseStatusHQ());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseStatusBP</column-name><column-value><![CDATA[");
		sb.append(getResponseStatusBP());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseStatusYT</column-name><column-value><![CDATA[");
		sb.append(getResponseStatusYT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseStatusDV</column-name><column-value><![CDATA[");
		sb.append(getResponseStatusDV());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseStatusTV</column-name><column-value><![CDATA[");
		sb.append(getResponseStatusTV());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseStatusCVHH</column-name><column-value><![CDATA[");
		sb.append(getResponseStatusCVHH());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseTimeHQ</column-name><column-value><![CDATA[");
		sb.append(getResponseTimeHQ());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseTimeBP</column-name><column-value><![CDATA[");
		sb.append(getResponseTimeBP());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseTimeYT</column-name><column-value><![CDATA[");
		sb.append(getResponseTimeYT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseTimeDV</column-name><column-value><![CDATA[");
		sb.append(getResponseTimeDV());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseTimeTV</column-name><column-value><![CDATA[");
		sb.append(getResponseTimeTV());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseTimeCVHH</column-name><column-value><![CDATA[");
		sb.append(getResponseTimeCVHH());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseHQ</column-name><column-value><![CDATA[");
		sb.append(getResponseHQ());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseBP</column-name><column-value><![CDATA[");
		sb.append(getResponseBP());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseYT</column-name><column-value><![CDATA[");
		sb.append(getResponseYT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseDV</column-name><column-value><![CDATA[");
		sb.append(getResponseDV());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseTV</column-name><column-value><![CDATA[");
		sb.append(getResponseTV());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseCVHH</column-name><column-value><![CDATA[");
		sb.append(getResponseCVHH());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private int _requestState;
	private long _documentName;
	private int _documentYear;
	private String _nameOfShip;
	private String _flagStateOfShip;
	private String _nameOfMaster;
	private double _grossTonnage;
	private String _portOfArrivalCode;
	private String _maritimeCode;
	private String _division;
	private String _approvalName;
	private Date _approvalTime;
	private String _certificateNo;
	private int _responseStatusHQ;
	private int _responseStatusBP;
	private int _responseStatusYT;
	private int _responseStatusDV;
	private int _responseStatusTV;
	private int _responseStatusCVHH;
	private Date _responseTimeHQ;
	private Date _responseTimeBP;
	private Date _responseTimeYT;
	private Date _responseTimeDV;
	private Date _responseTimeTV;
	private Date _responseTimeCVHH;
	private String _responseHQ;
	private String _responseBP;
	private String _responseYT;
	private String _responseDV;
	private String _responseTV;
	private String _responseCVHH;
	private BaseModel<?> _resultCompetionRemoteModel;
}