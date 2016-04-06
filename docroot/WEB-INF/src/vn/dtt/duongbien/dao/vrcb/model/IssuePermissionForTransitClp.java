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
import vn.dtt.duongbien.dao.vrcb.service.IssuePermissionForTransitLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class IssuePermissionForTransitClp extends BaseModelImpl<IssuePermissionForTransit>
	implements IssuePermissionForTransit {
	public IssuePermissionForTransitClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return IssuePermissionForTransit.class;
	}

	@Override
	public String getModelClassName() {
		return IssuePermissionForTransit.class.getName();
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
		attributes.put("numberPermissionForTransit",
			getNumberPermissionForTransit());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("requestState", getRequestState());
		attributes.put("portofAuthority", getPortofAuthority());
		attributes.put("nameOfShip", getNameOfShip());
		attributes.put("flagStateOfShip", getFlagStateOfShip());
		attributes.put("gt", getGt());
		attributes.put("numberOfCrews", getNumberOfCrews());
		attributes.put("numberOfPassengers", getNumberOfPassengers());
		attributes.put("callSign", getCallSign());
		attributes.put("nameOfMaster", getNameOfMaster());
		attributes.put("transitCargo", getTransitCargo());
		attributes.put("volumeCargo", getVolumeCargo());
		attributes.put("cargoUnit", getCargoUnit());
		attributes.put("permittedTransitFrom", getPermittedTransitFrom());
		attributes.put("permittedTransitTo", getPermittedTransitTo());
		attributes.put("timeOfDeparture", getTimeOfDeparture());
		attributes.put("validUntil", getValidUntil());
		attributes.put("dateOfSign", getDateOfSign());
		attributes.put("userCreated", getUserCreated());
		attributes.put("directorOfMaritime", getDirectorOfMaritime());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("certificateNo", getCertificateNo());
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
		attributes.put("digitalAttachedFile", getDigitalAttachedFile());
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

		String numberPermissionForTransit = (String)attributes.get(
				"numberPermissionForTransit");

		if (numberPermissionForTransit != null) {
			setNumberPermissionForTransit(numberPermissionForTransit);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}

		Integer requestState = (Integer)attributes.get("requestState");

		if (requestState != null) {
			setRequestState(requestState);
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

		Double gt = (Double)attributes.get("gt");

		if (gt != null) {
			setGt(gt);
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

		String transitCargo = (String)attributes.get("transitCargo");

		if (transitCargo != null) {
			setTransitCargo(transitCargo);
		}

		Double volumeCargo = (Double)attributes.get("volumeCargo");

		if (volumeCargo != null) {
			setVolumeCargo(volumeCargo);
		}

		String cargoUnit = (String)attributes.get("cargoUnit");

		if (cargoUnit != null) {
			setCargoUnit(cargoUnit);
		}

		String permittedTransitFrom = (String)attributes.get(
				"permittedTransitFrom");

		if (permittedTransitFrom != null) {
			setPermittedTransitFrom(permittedTransitFrom);
		}

		String permittedTransitTo = (String)attributes.get("permittedTransitTo");

		if (permittedTransitTo != null) {
			setPermittedTransitTo(permittedTransitTo);
		}

		Date timeOfDeparture = (Date)attributes.get("timeOfDeparture");

		if (timeOfDeparture != null) {
			setTimeOfDeparture(timeOfDeparture);
		}

		Date validUntil = (Date)attributes.get("validUntil");

		if (validUntil != null) {
			setValidUntil(validUntil);
		}

		Date dateOfSign = (Date)attributes.get("dateOfSign");

		if (dateOfSign != null) {
			setDateOfSign(dateOfSign);
		}

		String userCreated = (String)attributes.get("userCreated");

		if (userCreated != null) {
			setUserCreated(userCreated);
		}

		String directorOfMaritime = (String)attributes.get("directorOfMaritime");

		if (directorOfMaritime != null) {
			setDirectorOfMaritime(directorOfMaritime);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String certificateNo = (String)attributes.get("certificateNo");

		if (certificateNo != null) {
			setCertificateNo(certificateNo);
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

		Long digitalAttachedFile = (Long)attributes.get("digitalAttachedFile");

		if (digitalAttachedFile != null) {
			setDigitalAttachedFile(digitalAttachedFile);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_issuePermissionForTransitRemoteModel, id);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_issuePermissionForTransitRemoteModel, requestCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNumberPermissionForTransit() {
		return _numberPermissionForTransit;
	}

	@Override
	public void setNumberPermissionForTransit(String numberPermissionForTransit) {
		_numberPermissionForTransit = numberPermissionForTransit;

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberPermissionForTransit",
						String.class);

				method.invoke(_issuePermissionForTransitRemoteModel,
					numberPermissionForTransit);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_issuePermissionForTransitRemoteModel,
					documentName);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_issuePermissionForTransitRemoteModel,
					documentYear);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestState", int.class);

				method.invoke(_issuePermissionForTransitRemoteModel,
					requestState);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setPortofAuthority",
						String.class);

				method.invoke(_issuePermissionForTransitRemoteModel,
					portofAuthority);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfShip", String.class);

				method.invoke(_issuePermissionForTransitRemoteModel, nameOfShip);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setFlagStateOfShip",
						String.class);

				method.invoke(_issuePermissionForTransitRemoteModel,
					flagStateOfShip);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setGt", double.class);

				method.invoke(_issuePermissionForTransitRemoteModel, gt);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberOfCrews", int.class);

				method.invoke(_issuePermissionForTransitRemoteModel,
					numberOfCrews);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberOfPassengers",
						int.class);

				method.invoke(_issuePermissionForTransitRemoteModel,
					numberOfPassengers);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setCallSign", String.class);

				method.invoke(_issuePermissionForTransitRemoteModel, callSign);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfMaster", String.class);

				method.invoke(_issuePermissionForTransitRemoteModel,
					nameOfMaster);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setTransitCargo", String.class);

				method.invoke(_issuePermissionForTransitRemoteModel,
					transitCargo);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setVolumeCargo", double.class);

				method.invoke(_issuePermissionForTransitRemoteModel, volumeCargo);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setCargoUnit", String.class);

				method.invoke(_issuePermissionForTransitRemoteModel, cargoUnit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPermittedTransitFrom() {
		return _permittedTransitFrom;
	}

	@Override
	public void setPermittedTransitFrom(String permittedTransitFrom) {
		_permittedTransitFrom = permittedTransitFrom;

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setPermittedTransitFrom",
						String.class);

				method.invoke(_issuePermissionForTransitRemoteModel,
					permittedTransitFrom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPermittedTransitTo() {
		return _permittedTransitTo;
	}

	@Override
	public void setPermittedTransitTo(String permittedTransitTo) {
		_permittedTransitTo = permittedTransitTo;

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setPermittedTransitTo",
						String.class);

				method.invoke(_issuePermissionForTransitRemoteModel,
					permittedTransitTo);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setTimeOfDeparture", Date.class);

				method.invoke(_issuePermissionForTransitRemoteModel,
					timeOfDeparture);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setValidUntil", Date.class);

				method.invoke(_issuePermissionForTransitRemoteModel, validUntil);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDateOfSign() {
		return _dateOfSign;
	}

	@Override
	public void setDateOfSign(Date dateOfSign) {
		_dateOfSign = dateOfSign;

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setDateOfSign", Date.class);

				method.invoke(_issuePermissionForTransitRemoteModel, dateOfSign);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserCreated() {
		return _userCreated;
	}

	@Override
	public void setUserCreated(String userCreated) {
		_userCreated = userCreated;

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setUserCreated", String.class);

				method.invoke(_issuePermissionForTransitRemoteModel, userCreated);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setDirectorOfMaritime",
						String.class);

				method.invoke(_issuePermissionForTransitRemoteModel,
					directorOfMaritime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_issuePermissionForTransitRemoteModel, createdDate);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateNo", String.class);

				method.invoke(_issuePermissionForTransitRemoteModel,
					certificateNo);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setVersionNo", String.class);

				method.invoke(_issuePermissionForTransitRemoteModel, versionNo);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setIsApproval", int.class);

				method.invoke(_issuePermissionForTransitRemoteModel, isApproval);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovalDate", Date.class);

				method.invoke(_issuePermissionForTransitRemoteModel,
					approvalDate);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovalName", String.class);

				method.invoke(_issuePermissionForTransitRemoteModel,
					approvalName);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_issuePermissionForTransitRemoteModel, remarks);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setIsCancel", int.class);

				method.invoke(_issuePermissionForTransitRemoteModel, isCancel);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setCancelDate", Date.class);

				method.invoke(_issuePermissionForTransitRemoteModel, cancelDate);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setCancelName", String.class);

				method.invoke(_issuePermissionForTransitRemoteModel, cancelName);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setCancelNote", String.class);

				method.invoke(_issuePermissionForTransitRemoteModel, cancelNote);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setRepresentative",
						String.class);

				method.invoke(_issuePermissionForTransitRemoteModel,
					representative);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDigitalAttachedFile() {
		return _digitalAttachedFile;
	}

	@Override
	public void setDigitalAttachedFile(long digitalAttachedFile) {
		_digitalAttachedFile = digitalAttachedFile;

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setDigitalAttachedFile",
						long.class);

				method.invoke(_issuePermissionForTransitRemoteModel,
					digitalAttachedFile);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_issuePermissionForTransitRemoteModel, signDate);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setSignName", String.class);

				method.invoke(_issuePermissionForTransitRemoteModel, signName);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setSignTitle", String.class);

				method.invoke(_issuePermissionForTransitRemoteModel, signTitle);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setSignPlace", String.class);

				method.invoke(_issuePermissionForTransitRemoteModel, signPlace);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setStampStatus", long.class);

				method.invoke(_issuePermissionForTransitRemoteModel, stampStatus);
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

		if (_issuePermissionForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issuePermissionForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_issuePermissionForTransitRemoteModel,
					attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getIssuePermissionForTransitRemoteModel() {
		return _issuePermissionForTransitRemoteModel;
	}

	public void setIssuePermissionForTransitRemoteModel(
		BaseModel<?> issuePermissionForTransitRemoteModel) {
		_issuePermissionForTransitRemoteModel = issuePermissionForTransitRemoteModel;
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

		Class<?> remoteModelClass = _issuePermissionForTransitRemoteModel.getClass();

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

		Object returnValue = method.invoke(_issuePermissionForTransitRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			IssuePermissionForTransitLocalServiceUtil.addIssuePermissionForTransit(this);
		}
		else {
			IssuePermissionForTransitLocalServiceUtil.updateIssuePermissionForTransit(this);
		}
	}

	@Override
	public IssuePermissionForTransit toEscapedModel() {
		return (IssuePermissionForTransit)ProxyUtil.newProxyInstance(IssuePermissionForTransit.class.getClassLoader(),
			new Class[] { IssuePermissionForTransit.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		IssuePermissionForTransitClp clone = new IssuePermissionForTransitClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setNumberPermissionForTransit(getNumberPermissionForTransit());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setRequestState(getRequestState());
		clone.setPortofAuthority(getPortofAuthority());
		clone.setNameOfShip(getNameOfShip());
		clone.setFlagStateOfShip(getFlagStateOfShip());
		clone.setGt(getGt());
		clone.setNumberOfCrews(getNumberOfCrews());
		clone.setNumberOfPassengers(getNumberOfPassengers());
		clone.setCallSign(getCallSign());
		clone.setNameOfMaster(getNameOfMaster());
		clone.setTransitCargo(getTransitCargo());
		clone.setVolumeCargo(getVolumeCargo());
		clone.setCargoUnit(getCargoUnit());
		clone.setPermittedTransitFrom(getPermittedTransitFrom());
		clone.setPermittedTransitTo(getPermittedTransitTo());
		clone.setTimeOfDeparture(getTimeOfDeparture());
		clone.setValidUntil(getValidUntil());
		clone.setDateOfSign(getDateOfSign());
		clone.setUserCreated(getUserCreated());
		clone.setDirectorOfMaritime(getDirectorOfMaritime());
		clone.setCreatedDate(getCreatedDate());
		clone.setCertificateNo(getCertificateNo());
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
		clone.setDigitalAttachedFile(getDigitalAttachedFile());
		clone.setSignDate(getSignDate());
		clone.setSignName(getSignName());
		clone.setSignTitle(getSignTitle());
		clone.setSignPlace(getSignPlace());
		clone.setStampStatus(getStampStatus());
		clone.setAttachedFile(getAttachedFile());

		return clone;
	}

	@Override
	public int compareTo(IssuePermissionForTransit issuePermissionForTransit) {
		int value = 0;

		if (getId() < issuePermissionForTransit.getId()) {
			value = -1;
		}
		else if (getId() > issuePermissionForTransit.getId()) {
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

		if (!(obj instanceof IssuePermissionForTransitClp)) {
			return false;
		}

		IssuePermissionForTransitClp issuePermissionForTransit = (IssuePermissionForTransitClp)obj;

		long primaryKey = issuePermissionForTransit.getPrimaryKey();

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
		StringBundler sb = new StringBundler(87);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", numberPermissionForTransit=");
		sb.append(getNumberPermissionForTransit());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", portofAuthority=");
		sb.append(getPortofAuthority());
		sb.append(", nameOfShip=");
		sb.append(getNameOfShip());
		sb.append(", flagStateOfShip=");
		sb.append(getFlagStateOfShip());
		sb.append(", gt=");
		sb.append(getGt());
		sb.append(", numberOfCrews=");
		sb.append(getNumberOfCrews());
		sb.append(", numberOfPassengers=");
		sb.append(getNumberOfPassengers());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", nameOfMaster=");
		sb.append(getNameOfMaster());
		sb.append(", transitCargo=");
		sb.append(getTransitCargo());
		sb.append(", volumeCargo=");
		sb.append(getVolumeCargo());
		sb.append(", cargoUnit=");
		sb.append(getCargoUnit());
		sb.append(", permittedTransitFrom=");
		sb.append(getPermittedTransitFrom());
		sb.append(", permittedTransitTo=");
		sb.append(getPermittedTransitTo());
		sb.append(", timeOfDeparture=");
		sb.append(getTimeOfDeparture());
		sb.append(", validUntil=");
		sb.append(getValidUntil());
		sb.append(", dateOfSign=");
		sb.append(getDateOfSign());
		sb.append(", userCreated=");
		sb.append(getUserCreated());
		sb.append(", directorOfMaritime=");
		sb.append(getDirectorOfMaritime());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", certificateNo=");
		sb.append(getCertificateNo());
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
		sb.append(", digitalAttachedFile=");
		sb.append(getDigitalAttachedFile());
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
		StringBundler sb = new StringBundler(133);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit");
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
			"<column><column-name>numberPermissionForTransit</column-name><column-value><![CDATA[");
		sb.append(getNumberPermissionForTransit());
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
			"<column><column-name>requestState</column-name><column-value><![CDATA[");
		sb.append(getRequestState());
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
			"<column><column-name>gt</column-name><column-value><![CDATA[");
		sb.append(getGt());
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
			"<column><column-name>transitCargo</column-name><column-value><![CDATA[");
		sb.append(getTransitCargo());
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
			"<column><column-name>permittedTransitFrom</column-name><column-value><![CDATA[");
		sb.append(getPermittedTransitFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>permittedTransitTo</column-name><column-value><![CDATA[");
		sb.append(getPermittedTransitTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>timeOfDeparture</column-name><column-value><![CDATA[");
		sb.append(getTimeOfDeparture());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validUntil</column-name><column-value><![CDATA[");
		sb.append(getValidUntil());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfSign</column-name><column-value><![CDATA[");
		sb.append(getDateOfSign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userCreated</column-name><column-value><![CDATA[");
		sb.append(getUserCreated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>directorOfMaritime</column-name><column-value><![CDATA[");
		sb.append(getDirectorOfMaritime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateNo</column-name><column-value><![CDATA[");
		sb.append(getCertificateNo());
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
			"<column><column-name>digitalAttachedFile</column-name><column-value><![CDATA[");
		sb.append(getDigitalAttachedFile());
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
	private String _numberPermissionForTransit;
	private long _documentName;
	private int _documentYear;
	private int _requestState;
	private String _portofAuthority;
	private String _nameOfShip;
	private String _flagStateOfShip;
	private double _gt;
	private int _numberOfCrews;
	private int _numberOfPassengers;
	private String _callSign;
	private String _nameOfMaster;
	private String _transitCargo;
	private double _volumeCargo;
	private String _cargoUnit;
	private String _permittedTransitFrom;
	private String _permittedTransitTo;
	private Date _timeOfDeparture;
	private Date _validUntil;
	private Date _dateOfSign;
	private String _userCreated;
	private String _directorOfMaritime;
	private Date _createdDate;
	private String _certificateNo;
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
	private long _digitalAttachedFile;
	private Date _signDate;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private long _stampStatus;
	private long _attachedFile;
	private BaseModel<?> _issuePermissionForTransitRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}