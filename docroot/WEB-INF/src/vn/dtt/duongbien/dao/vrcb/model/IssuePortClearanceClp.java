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
import vn.dtt.duongbien.dao.vrcb.service.IssuePortClearanceLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class IssuePortClearanceClp extends BaseModelImpl<IssuePortClearance>
	implements IssuePortClearance {
	public IssuePortClearanceClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return IssuePortClearance.class;
	}

	@Override
	public String getModelClassName() {
		return IssuePortClearance.class.getName();
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
		attributes.put("numberPortClearance", getNumberPortClearance());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("portofAuthority", getPortofAuthority());
		attributes.put("nameOfShip", getNameOfShip());
		attributes.put("flagStateOfShip", getFlagStateOfShip());
		attributes.put("numberOfCrews", getNumberOfCrews());
		attributes.put("numberOfPassengers", getNumberOfPassengers());
		attributes.put("callSign", getCallSign());
		attributes.put("nameOfMaster", getNameOfMaster());
		attributes.put("cargo", getCargo());
		attributes.put("volumeCargo", getVolumeCargo());
		attributes.put("cargoUnit", getCargoUnit());
		attributes.put("transitCargo", getTransitCargo());
		attributes.put("volumeTransitCargo", getVolumeTransitCargo());
		attributes.put("transitCargoUnit", getTransitCargoUnit());
		attributes.put("timeOfDeparture", getTimeOfDeparture());
		attributes.put("nextPortOfCallCode", getNextPortOfCallCode());
		attributes.put("validUntil", getValidUntil());
		attributes.put("issueDate", getIssueDate());
		attributes.put("directorOfMaritime", getDirectorOfMaritime());
		attributes.put("certificateNo", getCertificateNo());
		attributes.put("requestState", getRequestState());
		attributes.put("gt", getGt());
		attributes.put("versionNo", getVersionNo());
		attributes.put("isApproval", getIsApproval());
		attributes.put("approvalDate", getApprovalDate());
		attributes.put("approvalName", getApprovalName());
		attributes.put("remarks", getRemarks());
		attributes.put("isCancel", getIsCancel());
		attributes.put("cancelDate", getCancelDate());
		attributes.put("cancelName", getCancelName());
		attributes.put("cancelNote", getCancelNote());
		attributes.put("representative", getRepresentative());
		attributes.put("signDate", getSignDate());
		attributes.put("signName", getSignName());
		attributes.put("signTitle", getSignTitle());
		attributes.put("signPlace", getSignPlace());
		attributes.put("stampStatus", getStampStatus());
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

		String numberPortClearance = (String)attributes.get(
				"numberPortClearance");

		if (numberPortClearance != null) {
			setNumberPortClearance(numberPortClearance);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}

		String portofAuthority = (String)attributes.get("portofAuthority");

		if (portofAuthority != null) {
			setPortofAuthority(portofAuthority);
		}

		String nameOfShip = (String)attributes.get("nameOfShip");

		if (nameOfShip != null) {
			setNameOfShip(nameOfShip);
		}

		String flagStateOfShip = (String)attributes.get("flagStateOfShip");

		if (flagStateOfShip != null) {
			setFlagStateOfShip(flagStateOfShip);
		}

		Integer numberOfCrews = (Integer)attributes.get("numberOfCrews");

		if (numberOfCrews != null) {
			setNumberOfCrews(numberOfCrews);
		}

		Integer numberOfPassengers = (Integer)attributes.get(
				"numberOfPassengers");

		if (numberOfPassengers != null) {
			setNumberOfPassengers(numberOfPassengers);
		}

		String callSign = (String)attributes.get("callSign");

		if (callSign != null) {
			setCallSign(callSign);
		}

		String nameOfMaster = (String)attributes.get("nameOfMaster");

		if (nameOfMaster != null) {
			setNameOfMaster(nameOfMaster);
		}

		String cargo = (String)attributes.get("cargo");

		if (cargo != null) {
			setCargo(cargo);
		}

		Double volumeCargo = (Double)attributes.get("volumeCargo");

		if (volumeCargo != null) {
			setVolumeCargo(volumeCargo);
		}

		String cargoUnit = (String)attributes.get("cargoUnit");

		if (cargoUnit != null) {
			setCargoUnit(cargoUnit);
		}

		String transitCargo = (String)attributes.get("transitCargo");

		if (transitCargo != null) {
			setTransitCargo(transitCargo);
		}

		Double volumeTransitCargo = (Double)attributes.get("volumeTransitCargo");

		if (volumeTransitCargo != null) {
			setVolumeTransitCargo(volumeTransitCargo);
		}

		String transitCargoUnit = (String)attributes.get("transitCargoUnit");

		if (transitCargoUnit != null) {
			setTransitCargoUnit(transitCargoUnit);
		}

		Date timeOfDeparture = (Date)attributes.get("timeOfDeparture");

		if (timeOfDeparture != null) {
			setTimeOfDeparture(timeOfDeparture);
		}

		String nextPortOfCallCode = (String)attributes.get("nextPortOfCallCode");

		if (nextPortOfCallCode != null) {
			setNextPortOfCallCode(nextPortOfCallCode);
		}

		Date validUntil = (Date)attributes.get("validUntil");

		if (validUntil != null) {
			setValidUntil(validUntil);
		}

		Date issueDate = (Date)attributes.get("issueDate");

		if (issueDate != null) {
			setIssueDate(issueDate);
		}

		String directorOfMaritime = (String)attributes.get("directorOfMaritime");

		if (directorOfMaritime != null) {
			setDirectorOfMaritime(directorOfMaritime);
		}

		String certificateNo = (String)attributes.get("certificateNo");

		if (certificateNo != null) {
			setCertificateNo(certificateNo);
		}

		Integer requestState = (Integer)attributes.get("requestState");

		if (requestState != null) {
			setRequestState(requestState);
		}

		Double gt = (Double)attributes.get("gt");

		if (gt != null) {
			setGt(gt);
		}

		String versionNo = (String)attributes.get("versionNo");

		if (versionNo != null) {
			setVersionNo(versionNo);
		}

		Integer isApproval = (Integer)attributes.get("isApproval");

		if (isApproval != null) {
			setIsApproval(isApproval);
		}

		Date approvalDate = (Date)attributes.get("approvalDate");

		if (approvalDate != null) {
			setApprovalDate(approvalDate);
		}

		String approvalName = (String)attributes.get("approvalName");

		if (approvalName != null) {
			setApprovalName(approvalName);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Integer isCancel = (Integer)attributes.get("isCancel");

		if (isCancel != null) {
			setIsCancel(isCancel);
		}

		Date cancelDate = (Date)attributes.get("cancelDate");

		if (cancelDate != null) {
			setCancelDate(cancelDate);
		}

		String cancelName = (String)attributes.get("cancelName");

		if (cancelName != null) {
			setCancelName(cancelName);
		}

		String cancelNote = (String)attributes.get("cancelNote");

		if (cancelNote != null) {
			setCancelNote(cancelNote);
		}

		String representative = (String)attributes.get("representative");

		if (representative != null) {
			setRepresentative(representative);
		}

		Date signDate = (Date)attributes.get("signDate");

		if (signDate != null) {
			setSignDate(signDate);
		}

		String signName = (String)attributes.get("signName");

		if (signName != null) {
			setSignName(signName);
		}

		String signTitle = (String)attributes.get("signTitle");

		if (signTitle != null) {
			setSignTitle(signTitle);
		}

		String signPlace = (String)attributes.get("signPlace");

		if (signPlace != null) {
			setSignPlace(signPlace);
		}

		Long stampStatus = (Long)attributes.get("stampStatus");

		if (stampStatus != null) {
			setStampStatus(stampStatus);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_issuePortClearanceRemoteModel, id);
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

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_issuePortClearanceRemoteModel, requestCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNumberPortClearance() {
		return _numberPortClearance;
	}

	@Override
	public void setNumberPortClearance(String numberPortClearance) {
		_numberPortClearance = numberPortClearance;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberPortClearance",
						String.class);

				method.invoke(_issuePortClearanceRemoteModel,
					numberPortClearance);
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

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_issuePortClearanceRemoteModel, documentName);
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

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_issuePortClearanceRemoteModel, documentYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortofAuthority() {
		return _portofAuthority;
	}

	@Override
	public void setPortofAuthority(String portofAuthority) {
		_portofAuthority = portofAuthority;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setPortofAuthority",
						String.class);

				method.invoke(_issuePortClearanceRemoteModel, portofAuthority);
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

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfShip", String.class);

				method.invoke(_issuePortClearanceRemoteModel, nameOfShip);
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

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setFlagStateOfShip",
						String.class);

				method.invoke(_issuePortClearanceRemoteModel, flagStateOfShip);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumberOfCrews() {
		return _numberOfCrews;
	}

	@Override
	public void setNumberOfCrews(int numberOfCrews) {
		_numberOfCrews = numberOfCrews;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberOfCrews", int.class);

				method.invoke(_issuePortClearanceRemoteModel, numberOfCrews);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumberOfPassengers() {
		return _numberOfPassengers;
	}

	@Override
	public void setNumberOfPassengers(int numberOfPassengers) {
		_numberOfPassengers = numberOfPassengers;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberOfPassengers",
						int.class);

				method.invoke(_issuePortClearanceRemoteModel, numberOfPassengers);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCallSign() {
		return _callSign;
	}

	@Override
	public void setCallSign(String callSign) {
		_callSign = callSign;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setCallSign", String.class);

				method.invoke(_issuePortClearanceRemoteModel, callSign);
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

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfMaster", String.class);

				method.invoke(_issuePortClearanceRemoteModel, nameOfMaster);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCargo() {
		return _cargo;
	}

	@Override
	public void setCargo(String cargo) {
		_cargo = cargo;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setCargo", String.class);

				method.invoke(_issuePortClearanceRemoteModel, cargo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getVolumeCargo() {
		return _volumeCargo;
	}

	@Override
	public void setVolumeCargo(double volumeCargo) {
		_volumeCargo = volumeCargo;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setVolumeCargo", double.class);

				method.invoke(_issuePortClearanceRemoteModel, volumeCargo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCargoUnit() {
		return _cargoUnit;
	}

	@Override
	public void setCargoUnit(String cargoUnit) {
		_cargoUnit = cargoUnit;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setCargoUnit", String.class);

				method.invoke(_issuePortClearanceRemoteModel, cargoUnit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTransitCargo() {
		return _transitCargo;
	}

	@Override
	public void setTransitCargo(String transitCargo) {
		_transitCargo = transitCargo;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setTransitCargo", String.class);

				method.invoke(_issuePortClearanceRemoteModel, transitCargo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getVolumeTransitCargo() {
		return _volumeTransitCargo;
	}

	@Override
	public void setVolumeTransitCargo(double volumeTransitCargo) {
		_volumeTransitCargo = volumeTransitCargo;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setVolumeTransitCargo",
						double.class);

				method.invoke(_issuePortClearanceRemoteModel, volumeTransitCargo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTransitCargoUnit() {
		return _transitCargoUnit;
	}

	@Override
	public void setTransitCargoUnit(String transitCargoUnit) {
		_transitCargoUnit = transitCargoUnit;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setTransitCargoUnit",
						String.class);

				method.invoke(_issuePortClearanceRemoteModel, transitCargoUnit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getTimeOfDeparture() {
		return _timeOfDeparture;
	}

	@Override
	public void setTimeOfDeparture(Date timeOfDeparture) {
		_timeOfDeparture = timeOfDeparture;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setTimeOfDeparture", Date.class);

				method.invoke(_issuePortClearanceRemoteModel, timeOfDeparture);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNextPortOfCallCode() {
		return _nextPortOfCallCode;
	}

	@Override
	public void setNextPortOfCallCode(String nextPortOfCallCode) {
		_nextPortOfCallCode = nextPortOfCallCode;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setNextPortOfCallCode",
						String.class);

				method.invoke(_issuePortClearanceRemoteModel, nextPortOfCallCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getValidUntil() {
		return _validUntil;
	}

	@Override
	public void setValidUntil(Date validUntil) {
		_validUntil = validUntil;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setValidUntil", Date.class);

				method.invoke(_issuePortClearanceRemoteModel, validUntil);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getIssueDate() {
		return _issueDate;
	}

	@Override
	public void setIssueDate(Date issueDate) {
		_issueDate = issueDate;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setIssueDate", Date.class);

				method.invoke(_issuePortClearanceRemoteModel, issueDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDirectorOfMaritime() {
		return _directorOfMaritime;
	}

	@Override
	public void setDirectorOfMaritime(String directorOfMaritime) {
		_directorOfMaritime = directorOfMaritime;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setDirectorOfMaritime",
						String.class);

				method.invoke(_issuePortClearanceRemoteModel, directorOfMaritime);
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

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateNo", String.class);

				method.invoke(_issuePortClearanceRemoteModel, certificateNo);
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

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestState", int.class);

				method.invoke(_issuePortClearanceRemoteModel, requestState);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getGt() {
		return _gt;
	}

	@Override
	public void setGt(double gt) {
		_gt = gt;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setGt", double.class);

				method.invoke(_issuePortClearanceRemoteModel, gt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVersionNo() {
		return _versionNo;
	}

	@Override
	public void setVersionNo(String versionNo) {
		_versionNo = versionNo;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setVersionNo", String.class);

				method.invoke(_issuePortClearanceRemoteModel, versionNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsApproval() {
		return _isApproval;
	}

	@Override
	public void setIsApproval(int isApproval) {
		_isApproval = isApproval;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setIsApproval", int.class);

				method.invoke(_issuePortClearanceRemoteModel, isApproval);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getApprovalDate() {
		return _approvalDate;
	}

	@Override
	public void setApprovalDate(Date approvalDate) {
		_approvalDate = approvalDate;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovalDate", Date.class);

				method.invoke(_issuePortClearanceRemoteModel, approvalDate);
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

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovalName", String.class);

				method.invoke(_issuePortClearanceRemoteModel, approvalName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRemarks() {
		return _remarks;
	}

	@Override
	public void setRemarks(String remarks) {
		_remarks = remarks;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_issuePortClearanceRemoteModel, remarks);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsCancel() {
		return _isCancel;
	}

	@Override
	public void setIsCancel(int isCancel) {
		_isCancel = isCancel;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setIsCancel", int.class);

				method.invoke(_issuePortClearanceRemoteModel, isCancel);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCancelDate() {
		return _cancelDate;
	}

	@Override
	public void setCancelDate(Date cancelDate) {
		_cancelDate = cancelDate;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setCancelDate", Date.class);

				method.invoke(_issuePortClearanceRemoteModel, cancelDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCancelName() {
		return _cancelName;
	}

	@Override
	public void setCancelName(String cancelName) {
		_cancelName = cancelName;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setCancelName", String.class);

				method.invoke(_issuePortClearanceRemoteModel, cancelName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCancelNote() {
		return _cancelNote;
	}

	@Override
	public void setCancelNote(String cancelNote) {
		_cancelNote = cancelNote;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setCancelNote", String.class);

				method.invoke(_issuePortClearanceRemoteModel, cancelNote);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRepresentative() {
		return _representative;
	}

	@Override
	public void setRepresentative(String representative) {
		_representative = representative;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setRepresentative",
						String.class);

				method.invoke(_issuePortClearanceRemoteModel, representative);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSignDate() {
		return _signDate;
	}

	@Override
	public void setSignDate(Date signDate) {
		_signDate = signDate;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_issuePortClearanceRemoteModel, signDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignName() {
		return _signName;
	}

	@Override
	public void setSignName(String signName) {
		_signName = signName;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setSignName", String.class);

				method.invoke(_issuePortClearanceRemoteModel, signName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignTitle() {
		return _signTitle;
	}

	@Override
	public void setSignTitle(String signTitle) {
		_signTitle = signTitle;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setSignTitle", String.class);

				method.invoke(_issuePortClearanceRemoteModel, signTitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignPlace() {
		return _signPlace;
	}

	@Override
	public void setSignPlace(String signPlace) {
		_signPlace = signPlace;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setSignPlace", String.class);

				method.invoke(_issuePortClearanceRemoteModel, signPlace);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStampStatus() {
		return _stampStatus;
	}

	@Override
	public void setStampStatus(long stampStatus) {
		_stampStatus = stampStatus;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setStampStatus", long.class);

				method.invoke(_issuePortClearanceRemoteModel, stampStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAttachedFile() {
		return _attachedFile;
	}

	@Override
	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;

		if (_issuePortClearanceRemoteModel != null) {
			try {
				Class<?> clazz = _issuePortClearanceRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_issuePortClearanceRemoteModel, attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getIssuePortClearanceRemoteModel() {
		return _issuePortClearanceRemoteModel;
	}

	public void setIssuePortClearanceRemoteModel(
		BaseModel<?> issuePortClearanceRemoteModel) {
		_issuePortClearanceRemoteModel = issuePortClearanceRemoteModel;
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

		Class<?> remoteModelClass = _issuePortClearanceRemoteModel.getClass();

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

		Object returnValue = method.invoke(_issuePortClearanceRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			IssuePortClearanceLocalServiceUtil.addIssuePortClearance(this);
		}
		else {
			IssuePortClearanceLocalServiceUtil.updateIssuePortClearance(this);
		}
	}

	@Override
	public IssuePortClearance toEscapedModel() {
		return (IssuePortClearance)ProxyUtil.newProxyInstance(IssuePortClearance.class.getClassLoader(),
			new Class[] { IssuePortClearance.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		IssuePortClearanceClp clone = new IssuePortClearanceClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setNumberPortClearance(getNumberPortClearance());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setPortofAuthority(getPortofAuthority());
		clone.setNameOfShip(getNameOfShip());
		clone.setFlagStateOfShip(getFlagStateOfShip());
		clone.setNumberOfCrews(getNumberOfCrews());
		clone.setNumberOfPassengers(getNumberOfPassengers());
		clone.setCallSign(getCallSign());
		clone.setNameOfMaster(getNameOfMaster());
		clone.setCargo(getCargo());
		clone.setVolumeCargo(getVolumeCargo());
		clone.setCargoUnit(getCargoUnit());
		clone.setTransitCargo(getTransitCargo());
		clone.setVolumeTransitCargo(getVolumeTransitCargo());
		clone.setTransitCargoUnit(getTransitCargoUnit());
		clone.setTimeOfDeparture(getTimeOfDeparture());
		clone.setNextPortOfCallCode(getNextPortOfCallCode());
		clone.setValidUntil(getValidUntil());
		clone.setIssueDate(getIssueDate());
		clone.setDirectorOfMaritime(getDirectorOfMaritime());
		clone.setCertificateNo(getCertificateNo());
		clone.setRequestState(getRequestState());
		clone.setGt(getGt());
		clone.setVersionNo(getVersionNo());
		clone.setIsApproval(getIsApproval());
		clone.setApprovalDate(getApprovalDate());
		clone.setApprovalName(getApprovalName());
		clone.setRemarks(getRemarks());
		clone.setIsCancel(getIsCancel());
		clone.setCancelDate(getCancelDate());
		clone.setCancelName(getCancelName());
		clone.setCancelNote(getCancelNote());
		clone.setRepresentative(getRepresentative());
		clone.setSignDate(getSignDate());
		clone.setSignName(getSignName());
		clone.setSignTitle(getSignTitle());
		clone.setSignPlace(getSignPlace());
		clone.setStampStatus(getStampStatus());
		clone.setAttachedFile(getAttachedFile());

		return clone;
	}

	@Override
	public int compareTo(IssuePortClearance issuePortClearance) {
		int value = 0;

		if (getId() < issuePortClearance.getId()) {
			value = -1;
		}
		else if (getId() > issuePortClearance.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof IssuePortClearanceClp)) {
			return false;
		}

		IssuePortClearanceClp issuePortClearance = (IssuePortClearanceClp)obj;

		long primaryKey = issuePortClearance.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(85);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", numberPortClearance=");
		sb.append(getNumberPortClearance());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", portofAuthority=");
		sb.append(getPortofAuthority());
		sb.append(", nameOfShip=");
		sb.append(getNameOfShip());
		sb.append(", flagStateOfShip=");
		sb.append(getFlagStateOfShip());
		sb.append(", numberOfCrews=");
		sb.append(getNumberOfCrews());
		sb.append(", numberOfPassengers=");
		sb.append(getNumberOfPassengers());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", nameOfMaster=");
		sb.append(getNameOfMaster());
		sb.append(", cargo=");
		sb.append(getCargo());
		sb.append(", volumeCargo=");
		sb.append(getVolumeCargo());
		sb.append(", cargoUnit=");
		sb.append(getCargoUnit());
		sb.append(", transitCargo=");
		sb.append(getTransitCargo());
		sb.append(", volumeTransitCargo=");
		sb.append(getVolumeTransitCargo());
		sb.append(", transitCargoUnit=");
		sb.append(getTransitCargoUnit());
		sb.append(", timeOfDeparture=");
		sb.append(getTimeOfDeparture());
		sb.append(", nextPortOfCallCode=");
		sb.append(getNextPortOfCallCode());
		sb.append(", validUntil=");
		sb.append(getValidUntil());
		sb.append(", issueDate=");
		sb.append(getIssueDate());
		sb.append(", directorOfMaritime=");
		sb.append(getDirectorOfMaritime());
		sb.append(", certificateNo=");
		sb.append(getCertificateNo());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", gt=");
		sb.append(getGt());
		sb.append(", versionNo=");
		sb.append(getVersionNo());
		sb.append(", isApproval=");
		sb.append(getIsApproval());
		sb.append(", approvalDate=");
		sb.append(getApprovalDate());
		sb.append(", approvalName=");
		sb.append(getApprovalName());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", isCancel=");
		sb.append(getIsCancel());
		sb.append(", cancelDate=");
		sb.append(getCancelDate());
		sb.append(", cancelName=");
		sb.append(getCancelName());
		sb.append(", cancelNote=");
		sb.append(getCancelNote());
		sb.append(", representative=");
		sb.append(getRepresentative());
		sb.append(", signDate=");
		sb.append(getSignDate());
		sb.append(", signName=");
		sb.append(getSignName());
		sb.append(", signTitle=");
		sb.append(getSignTitle());
		sb.append(", signPlace=");
		sb.append(getSignPlace());
		sb.append(", stampStatus=");
		sb.append(getStampStatus());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(130);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance");
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
			"<column><column-name>numberPortClearance</column-name><column-value><![CDATA[");
		sb.append(getNumberPortClearance());
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
			"<column><column-name>portofAuthority</column-name><column-value><![CDATA[");
		sb.append(getPortofAuthority());
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
			"<column><column-name>numberOfCrews</column-name><column-value><![CDATA[");
		sb.append(getNumberOfCrews());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberOfPassengers</column-name><column-value><![CDATA[");
		sb.append(getNumberOfPassengers());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>callSign</column-name><column-value><![CDATA[");
		sb.append(getCallSign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfMaster</column-name><column-value><![CDATA[");
		sb.append(getNameOfMaster());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cargo</column-name><column-value><![CDATA[");
		sb.append(getCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>volumeCargo</column-name><column-value><![CDATA[");
		sb.append(getVolumeCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cargoUnit</column-name><column-value><![CDATA[");
		sb.append(getCargoUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>transitCargo</column-name><column-value><![CDATA[");
		sb.append(getTransitCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>volumeTransitCargo</column-name><column-value><![CDATA[");
		sb.append(getVolumeTransitCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>transitCargoUnit</column-name><column-value><![CDATA[");
		sb.append(getTransitCargoUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>timeOfDeparture</column-name><column-value><![CDATA[");
		sb.append(getTimeOfDeparture());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nextPortOfCallCode</column-name><column-value><![CDATA[");
		sb.append(getNextPortOfCallCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validUntil</column-name><column-value><![CDATA[");
		sb.append(getValidUntil());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issueDate</column-name><column-value><![CDATA[");
		sb.append(getIssueDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>directorOfMaritime</column-name><column-value><![CDATA[");
		sb.append(getDirectorOfMaritime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateNo</column-name><column-value><![CDATA[");
		sb.append(getCertificateNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestState</column-name><column-value><![CDATA[");
		sb.append(getRequestState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gt</column-name><column-value><![CDATA[");
		sb.append(getGt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>versionNo</column-name><column-value><![CDATA[");
		sb.append(getVersionNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isApproval</column-name><column-value><![CDATA[");
		sb.append(getIsApproval());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvalDate</column-name><column-value><![CDATA[");
		sb.append(getApprovalDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvalName</column-name><column-value><![CDATA[");
		sb.append(getApprovalName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isCancel</column-name><column-value><![CDATA[");
		sb.append(getIsCancel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cancelDate</column-name><column-value><![CDATA[");
		sb.append(getCancelDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cancelName</column-name><column-value><![CDATA[");
		sb.append(getCancelName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cancelNote</column-name><column-value><![CDATA[");
		sb.append(getCancelNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>representative</column-name><column-value><![CDATA[");
		sb.append(getRepresentative());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signDate</column-name><column-value><![CDATA[");
		sb.append(getSignDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signName</column-name><column-value><![CDATA[");
		sb.append(getSignName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signTitle</column-name><column-value><![CDATA[");
		sb.append(getSignTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signPlace</column-name><column-value><![CDATA[");
		sb.append(getSignPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stampStatus</column-name><column-value><![CDATA[");
		sb.append(getStampStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _numberPortClearance;
	private long _documentName;
	private int _documentYear;
	private String _portofAuthority;
	private String _nameOfShip;
	private String _flagStateOfShip;
	private int _numberOfCrews;
	private int _numberOfPassengers;
	private String _callSign;
	private String _nameOfMaster;
	private String _cargo;
	private double _volumeCargo;
	private String _cargoUnit;
	private String _transitCargo;
	private double _volumeTransitCargo;
	private String _transitCargoUnit;
	private Date _timeOfDeparture;
	private String _nextPortOfCallCode;
	private Date _validUntil;
	private Date _issueDate;
	private String _directorOfMaritime;
	private String _certificateNo;
	private int _requestState;
	private double _gt;
	private String _versionNo;
	private int _isApproval;
	private Date _approvalDate;
	private String _approvalName;
	private String _remarks;
	private int _isCancel;
	private Date _cancelDate;
	private String _cancelName;
	private String _cancelNote;
	private String _representative;
	private Date _signDate;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private long _stampStatus;
	private long _attachedFile;
	private BaseModel<?> _issuePortClearanceRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}