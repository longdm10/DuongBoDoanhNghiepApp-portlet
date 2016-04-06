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

package vn.dtt.duongbien.dao.vrcb.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails;
import vn.dtt.duongbien.dao.vrcb.model.TempCrewDetailsModel;
import vn.dtt.duongbien.dao.vrcb.model.TempCrewDetailsSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the TempCrewDetails service. Represents a row in the &quot;TEMP_CREW_DETAILS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.TempCrewDetailsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TempCrewDetailsImpl}.
 * </p>
 *
 * @author longdm
 * @see TempCrewDetailsImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails
 * @see vn.dtt.duongbien.dao.vrcb.model.TempCrewDetailsModel
 * @generated
 */
@JSON(strict = true)
public class TempCrewDetailsModelImpl extends BaseModelImpl<TempCrewDetails>
	implements TempCrewDetailsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a temp crew details model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails} interface instead.
	 */
	public static final String TABLE_NAME = "TEMP_CREW_DETAILS";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "RequestCode", Types.VARCHAR },
			{ "CrewCode", Types.VARCHAR },
			{ "FamilyName", Types.VARCHAR },
			{ "GivenName", Types.VARCHAR },
			{ "RankCode", Types.VARCHAR },
			{ "Nationality", Types.VARCHAR },
			{ "DateOfBirth", Types.TIMESTAMP },
			{ "PlaceOfBirth", Types.VARCHAR },
			{ "PassportNumber", Types.VARCHAR },
			{ "PassportTypeCode", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table TEMP_CREW_DETAILS (ID LONG not null primary key,RequestCode VARCHAR(75) null,CrewCode VARCHAR(75) null,FamilyName VARCHAR(75) null,GivenName VARCHAR(75) null,RankCode VARCHAR(75) null,Nationality VARCHAR(75) null,DateOfBirth DATE null,PlaceOfBirth VARCHAR(75) null,PassportNumber VARCHAR(75) null,PassportTypeCode VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table TEMP_CREW_DETAILS";
	public static final String ORDER_BY_JPQL = " ORDER BY tempCrewDetails.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY TEMP_CREW_DETAILS.ID ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "ravaocangbienSessionFactory";
	public static final String TX_MANAGER = "ravaocangbienTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails"),
			true);
	public static long CREWCODE_COLUMN_BITMASK = 1L;
	public static long REQUESTCODE_COLUMN_BITMASK = 2L;
	public static long ID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static TempCrewDetails toModel(TempCrewDetailsSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		TempCrewDetails model = new TempCrewDetailsImpl();

		model.setId(soapModel.getId());
		model.setRequestCode(soapModel.getRequestCode());
		model.setCrewcode(soapModel.getCrewcode());
		model.setFamilyName(soapModel.getFamilyName());
		model.setGivenName(soapModel.getGivenName());
		model.setRankCode(soapModel.getRankCode());
		model.setNationality(soapModel.getNationality());
		model.setDateOfBirth(soapModel.getDateOfBirth());
		model.setPlaceOfBirth(soapModel.getPlaceOfBirth());
		model.setPassportNumber(soapModel.getPassportNumber());
		model.setPassportTypeCode(soapModel.getPassportTypeCode());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<TempCrewDetails> toModels(
		TempCrewDetailsSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<TempCrewDetails> models = new ArrayList<TempCrewDetails>(soapModels.length);

		for (TempCrewDetailsSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails"));

	public TempCrewDetailsModelImpl() {
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
	public Class<?> getModelClass() {
		return TempCrewDetails.class;
	}

	@Override
	public String getModelClassName() {
		return TempCrewDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("crewcode", getCrewcode());
		attributes.put("familyName", getFamilyName());
		attributes.put("givenName", getGivenName());
		attributes.put("rankCode", getRankCode());
		attributes.put("nationality", getNationality());
		attributes.put("dateOfBirth", getDateOfBirth());
		attributes.put("placeOfBirth", getPlaceOfBirth());
		attributes.put("passportNumber", getPassportNumber());
		attributes.put("passportTypeCode", getPassportTypeCode());

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

		String crewcode = (String)attributes.get("crewcode");

		if (crewcode != null) {
			setCrewcode(crewcode);
		}

		String familyName = (String)attributes.get("familyName");

		if (familyName != null) {
			setFamilyName(familyName);
		}

		String givenName = (String)attributes.get("givenName");

		if (givenName != null) {
			setGivenName(givenName);
		}

		String rankCode = (String)attributes.get("rankCode");

		if (rankCode != null) {
			setRankCode(rankCode);
		}

		String nationality = (String)attributes.get("nationality");

		if (nationality != null) {
			setNationality(nationality);
		}

		Date dateOfBirth = (Date)attributes.get("dateOfBirth");

		if (dateOfBirth != null) {
			setDateOfBirth(dateOfBirth);
		}

		String placeOfBirth = (String)attributes.get("placeOfBirth");

		if (placeOfBirth != null) {
			setPlaceOfBirth(placeOfBirth);
		}

		String passportNumber = (String)attributes.get("passportNumber");

		if (passportNumber != null) {
			setPassportNumber(passportNumber);
		}

		String passportTypeCode = (String)attributes.get("passportTypeCode");

		if (passportTypeCode != null) {
			setPassportTypeCode(passportTypeCode);
		}
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
	}

	@JSON
	@Override
	public String getRequestCode() {
		if (_requestCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _requestCode;
		}
	}

	@Override
	public void setRequestCode(String requestCode) {
		_columnBitmask |= REQUESTCODE_COLUMN_BITMASK;

		if (_originalRequestCode == null) {
			_originalRequestCode = _requestCode;
		}

		_requestCode = requestCode;
	}

	public String getOriginalRequestCode() {
		return GetterUtil.getString(_originalRequestCode);
	}

	@JSON
	@Override
	public String getCrewcode() {
		if (_crewcode == null) {
			return StringPool.BLANK;
		}
		else {
			return _crewcode;
		}
	}

	@Override
	public void setCrewcode(String crewcode) {
		_columnBitmask |= CREWCODE_COLUMN_BITMASK;

		if (_originalCrewcode == null) {
			_originalCrewcode = _crewcode;
		}

		_crewcode = crewcode;
	}

	public String getOriginalCrewcode() {
		return GetterUtil.getString(_originalCrewcode);
	}

	@JSON
	@Override
	public String getFamilyName() {
		if (_familyName == null) {
			return StringPool.BLANK;
		}
		else {
			return _familyName;
		}
	}

	@Override
	public void setFamilyName(String familyName) {
		_familyName = familyName;
	}

	@JSON
	@Override
	public String getGivenName() {
		if (_givenName == null) {
			return StringPool.BLANK;
		}
		else {
			return _givenName;
		}
	}

	@Override
	public void setGivenName(String givenName) {
		_givenName = givenName;
	}

	@JSON
	@Override
	public String getRankCode() {
		if (_rankCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _rankCode;
		}
	}

	@Override
	public void setRankCode(String rankCode) {
		_rankCode = rankCode;
	}

	@JSON
	@Override
	public String getNationality() {
		if (_nationality == null) {
			return StringPool.BLANK;
		}
		else {
			return _nationality;
		}
	}

	@Override
	public void setNationality(String nationality) {
		_nationality = nationality;
	}

	@JSON
	@Override
	public Date getDateOfBirth() {
		return _dateOfBirth;
	}

	@Override
	public void setDateOfBirth(Date dateOfBirth) {
		_dateOfBirth = dateOfBirth;
	}

	@JSON
	@Override
	public String getPlaceOfBirth() {
		if (_placeOfBirth == null) {
			return StringPool.BLANK;
		}
		else {
			return _placeOfBirth;
		}
	}

	@Override
	public void setPlaceOfBirth(String placeOfBirth) {
		_placeOfBirth = placeOfBirth;
	}

	@JSON
	@Override
	public String getPassportNumber() {
		if (_passportNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _passportNumber;
		}
	}

	@Override
	public void setPassportNumber(String passportNumber) {
		_passportNumber = passportNumber;
	}

	@JSON
	@Override
	public String getPassportTypeCode() {
		if (_passportTypeCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _passportTypeCode;
		}
	}

	@Override
	public void setPassportTypeCode(String passportTypeCode) {
		_passportTypeCode = passportTypeCode;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TempCrewDetails.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TempCrewDetails toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TempCrewDetails)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TempCrewDetailsImpl tempCrewDetailsImpl = new TempCrewDetailsImpl();

		tempCrewDetailsImpl.setId(getId());
		tempCrewDetailsImpl.setRequestCode(getRequestCode());
		tempCrewDetailsImpl.setCrewcode(getCrewcode());
		tempCrewDetailsImpl.setFamilyName(getFamilyName());
		tempCrewDetailsImpl.setGivenName(getGivenName());
		tempCrewDetailsImpl.setRankCode(getRankCode());
		tempCrewDetailsImpl.setNationality(getNationality());
		tempCrewDetailsImpl.setDateOfBirth(getDateOfBirth());
		tempCrewDetailsImpl.setPlaceOfBirth(getPlaceOfBirth());
		tempCrewDetailsImpl.setPassportNumber(getPassportNumber());
		tempCrewDetailsImpl.setPassportTypeCode(getPassportTypeCode());

		tempCrewDetailsImpl.resetOriginalValues();

		return tempCrewDetailsImpl;
	}

	@Override
	public int compareTo(TempCrewDetails tempCrewDetails) {
		int value = 0;

		if (getId() < tempCrewDetails.getId()) {
			value = -1;
		}
		else if (getId() > tempCrewDetails.getId()) {
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

		if (!(obj instanceof TempCrewDetails)) {
			return false;
		}

		TempCrewDetails tempCrewDetails = (TempCrewDetails)obj;

		long primaryKey = tempCrewDetails.getPrimaryKey();

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
	public void resetOriginalValues() {
		TempCrewDetailsModelImpl tempCrewDetailsModelImpl = this;

		tempCrewDetailsModelImpl._originalRequestCode = tempCrewDetailsModelImpl._requestCode;

		tempCrewDetailsModelImpl._originalCrewcode = tempCrewDetailsModelImpl._crewcode;

		tempCrewDetailsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TempCrewDetails> toCacheModel() {
		TempCrewDetailsCacheModel tempCrewDetailsCacheModel = new TempCrewDetailsCacheModel();

		tempCrewDetailsCacheModel.id = getId();

		tempCrewDetailsCacheModel.requestCode = getRequestCode();

		String requestCode = tempCrewDetailsCacheModel.requestCode;

		if ((requestCode != null) && (requestCode.length() == 0)) {
			tempCrewDetailsCacheModel.requestCode = null;
		}

		tempCrewDetailsCacheModel.crewcode = getCrewcode();

		String crewcode = tempCrewDetailsCacheModel.crewcode;

		if ((crewcode != null) && (crewcode.length() == 0)) {
			tempCrewDetailsCacheModel.crewcode = null;
		}

		tempCrewDetailsCacheModel.familyName = getFamilyName();

		String familyName = tempCrewDetailsCacheModel.familyName;

		if ((familyName != null) && (familyName.length() == 0)) {
			tempCrewDetailsCacheModel.familyName = null;
		}

		tempCrewDetailsCacheModel.givenName = getGivenName();

		String givenName = tempCrewDetailsCacheModel.givenName;

		if ((givenName != null) && (givenName.length() == 0)) {
			tempCrewDetailsCacheModel.givenName = null;
		}

		tempCrewDetailsCacheModel.rankCode = getRankCode();

		String rankCode = tempCrewDetailsCacheModel.rankCode;

		if ((rankCode != null) && (rankCode.length() == 0)) {
			tempCrewDetailsCacheModel.rankCode = null;
		}

		tempCrewDetailsCacheModel.nationality = getNationality();

		String nationality = tempCrewDetailsCacheModel.nationality;

		if ((nationality != null) && (nationality.length() == 0)) {
			tempCrewDetailsCacheModel.nationality = null;
		}

		Date dateOfBirth = getDateOfBirth();

		if (dateOfBirth != null) {
			tempCrewDetailsCacheModel.dateOfBirth = dateOfBirth.getTime();
		}
		else {
			tempCrewDetailsCacheModel.dateOfBirth = Long.MIN_VALUE;
		}

		tempCrewDetailsCacheModel.placeOfBirth = getPlaceOfBirth();

		String placeOfBirth = tempCrewDetailsCacheModel.placeOfBirth;

		if ((placeOfBirth != null) && (placeOfBirth.length() == 0)) {
			tempCrewDetailsCacheModel.placeOfBirth = null;
		}

		tempCrewDetailsCacheModel.passportNumber = getPassportNumber();

		String passportNumber = tempCrewDetailsCacheModel.passportNumber;

		if ((passportNumber != null) && (passportNumber.length() == 0)) {
			tempCrewDetailsCacheModel.passportNumber = null;
		}

		tempCrewDetailsCacheModel.passportTypeCode = getPassportTypeCode();

		String passportTypeCode = tempCrewDetailsCacheModel.passportTypeCode;

		if ((passportTypeCode != null) && (passportTypeCode.length() == 0)) {
			tempCrewDetailsCacheModel.passportTypeCode = null;
		}

		return tempCrewDetailsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", crewcode=");
		sb.append(getCrewcode());
		sb.append(", familyName=");
		sb.append(getFamilyName());
		sb.append(", givenName=");
		sb.append(getGivenName());
		sb.append(", rankCode=");
		sb.append(getRankCode());
		sb.append(", nationality=");
		sb.append(getNationality());
		sb.append(", dateOfBirth=");
		sb.append(getDateOfBirth());
		sb.append(", placeOfBirth=");
		sb.append(getPlaceOfBirth());
		sb.append(", passportNumber=");
		sb.append(getPassportNumber());
		sb.append(", passportTypeCode=");
		sb.append(getPassportTypeCode());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails");
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
			"<column><column-name>crewcode</column-name><column-value><![CDATA[");
		sb.append(getCrewcode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>familyName</column-name><column-value><![CDATA[");
		sb.append(getFamilyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>givenName</column-name><column-value><![CDATA[");
		sb.append(getGivenName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rankCode</column-name><column-value><![CDATA[");
		sb.append(getRankCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nationality</column-name><column-value><![CDATA[");
		sb.append(getNationality());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfBirth</column-name><column-value><![CDATA[");
		sb.append(getDateOfBirth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>placeOfBirth</column-name><column-value><![CDATA[");
		sb.append(getPlaceOfBirth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passportNumber</column-name><column-value><![CDATA[");
		sb.append(getPassportNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passportTypeCode</column-name><column-value><![CDATA[");
		sb.append(getPassportTypeCode());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TempCrewDetails.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TempCrewDetails.class
		};
	private long _id;
	private String _requestCode;
	private String _originalRequestCode;
	private String _crewcode;
	private String _originalCrewcode;
	private String _familyName;
	private String _givenName;
	private String _rankCode;
	private String _nationality;
	private Date _dateOfBirth;
	private String _placeOfBirth;
	private String _passportNumber;
	private String _passportTypeCode;
	private long _columnBitmask;
	private TempCrewDetails _escapedModel;
}