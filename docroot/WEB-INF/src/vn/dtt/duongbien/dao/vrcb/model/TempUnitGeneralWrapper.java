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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TempUnitGeneral}.
 * </p>
 *
 * @author longdm
 * @see TempUnitGeneral
 * @generated
 */
public class TempUnitGeneralWrapper implements TempUnitGeneral,
	ModelWrapper<TempUnitGeneral> {
	public TempUnitGeneralWrapper(TempUnitGeneral tempUnitGeneral) {
		_tempUnitGeneral = tempUnitGeneral;
	}

	@Override
	public Class<?> getModelClass() {
		return TempUnitGeneral.class;
	}

	@Override
	public String getModelClassName() {
		return TempUnitGeneral.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("grossTonnageUnit", getGrossTonnageUnit());
		attributes.put("netTonnageUnit", getNetTonnageUnit());
		attributes.put("unitDWT", getUnitDWT());
		attributes.put("unitLOA", getUnitLOA());
		attributes.put("unitBreadth", getUnitBreadth());
		attributes.put("unitClearanceHeight", getUnitClearanceHeight());
		attributes.put("unitShownDraft", getUnitShownDraft());
		attributes.put("unitShownDraftxF", getUnitShownDraftxF());
		attributes.put("unitShownDraftxA", getUnitShownDraftxA());
		attributes.put("unitHorsePower", getUnitHorsePower());
		attributes.put("unitRemainingOnBoardxB", getUnitRemainingOnBoardxB());
		attributes.put("unitRemainingOnBoardxS", getUnitRemainingOnBoardxS());
		attributes.put("unitFO", getUnitFO());
		attributes.put("unitLO", getUnitLO());
		attributes.put("unitFW", getUnitFW());
		attributes.put("unitDO", getUnitDO());
		attributes.put("unitSludgeOil", getUnitSludgeOil());

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

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}

		String grossTonnageUnit = (String)attributes.get("grossTonnageUnit");

		if (grossTonnageUnit != null) {
			setGrossTonnageUnit(grossTonnageUnit);
		}

		String netTonnageUnit = (String)attributes.get("netTonnageUnit");

		if (netTonnageUnit != null) {
			setNetTonnageUnit(netTonnageUnit);
		}

		String unitDWT = (String)attributes.get("unitDWT");

		if (unitDWT != null) {
			setUnitDWT(unitDWT);
		}

		String unitLOA = (String)attributes.get("unitLOA");

		if (unitLOA != null) {
			setUnitLOA(unitLOA);
		}

		String unitBreadth = (String)attributes.get("unitBreadth");

		if (unitBreadth != null) {
			setUnitBreadth(unitBreadth);
		}

		String unitClearanceHeight = (String)attributes.get(
				"unitClearanceHeight");

		if (unitClearanceHeight != null) {
			setUnitClearanceHeight(unitClearanceHeight);
		}

		String unitShownDraft = (String)attributes.get("unitShownDraft");

		if (unitShownDraft != null) {
			setUnitShownDraft(unitShownDraft);
		}

		String unitShownDraftxF = (String)attributes.get("unitShownDraftxF");

		if (unitShownDraftxF != null) {
			setUnitShownDraftxF(unitShownDraftxF);
		}

		String unitShownDraftxA = (String)attributes.get("unitShownDraftxA");

		if (unitShownDraftxA != null) {
			setUnitShownDraftxA(unitShownDraftxA);
		}

		String unitHorsePower = (String)attributes.get("unitHorsePower");

		if (unitHorsePower != null) {
			setUnitHorsePower(unitHorsePower);
		}

		String unitRemainingOnBoardxB = (String)attributes.get(
				"unitRemainingOnBoardxB");

		if (unitRemainingOnBoardxB != null) {
			setUnitRemainingOnBoardxB(unitRemainingOnBoardxB);
		}

		String unitRemainingOnBoardxS = (String)attributes.get(
				"unitRemainingOnBoardxS");

		if (unitRemainingOnBoardxS != null) {
			setUnitRemainingOnBoardxS(unitRemainingOnBoardxS);
		}

		String unitFO = (String)attributes.get("unitFO");

		if (unitFO != null) {
			setUnitFO(unitFO);
		}

		String unitLO = (String)attributes.get("unitLO");

		if (unitLO != null) {
			setUnitLO(unitLO);
		}

		String unitFW = (String)attributes.get("unitFW");

		if (unitFW != null) {
			setUnitFW(unitFW);
		}

		String unitDO = (String)attributes.get("unitDO");

		if (unitDO != null) {
			setUnitDO(unitDO);
		}

		String unitSludgeOil = (String)attributes.get("unitSludgeOil");

		if (unitSludgeOil != null) {
			setUnitSludgeOil(unitSludgeOil);
		}
	}

	/**
	* Returns the primary key of this temp unit general.
	*
	* @return the primary key of this temp unit general
	*/
	@Override
	public long getPrimaryKey() {
		return _tempUnitGeneral.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp unit general.
	*
	* @param primaryKey the primary key of this temp unit general
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempUnitGeneral.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp unit general.
	*
	* @return the ID of this temp unit general
	*/
	@Override
	public long getId() {
		return _tempUnitGeneral.getId();
	}

	/**
	* Sets the ID of this temp unit general.
	*
	* @param id the ID of this temp unit general
	*/
	@Override
	public void setId(long id) {
		_tempUnitGeneral.setId(id);
	}

	/**
	* Returns the request code of this temp unit general.
	*
	* @return the request code of this temp unit general
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempUnitGeneral.getRequestCode();
	}

	/**
	* Sets the request code of this temp unit general.
	*
	* @param requestCode the request code of this temp unit general
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempUnitGeneral.setRequestCode(requestCode);
	}

	/**
	* Returns the document name of this temp unit general.
	*
	* @return the document name of this temp unit general
	*/
	@Override
	public long getDocumentName() {
		return _tempUnitGeneral.getDocumentName();
	}

	/**
	* Sets the document name of this temp unit general.
	*
	* @param documentName the document name of this temp unit general
	*/
	@Override
	public void setDocumentName(long documentName) {
		_tempUnitGeneral.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this temp unit general.
	*
	* @return the document year of this temp unit general
	*/
	@Override
	public int getDocumentYear() {
		return _tempUnitGeneral.getDocumentYear();
	}

	/**
	* Sets the document year of this temp unit general.
	*
	* @param documentYear the document year of this temp unit general
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_tempUnitGeneral.setDocumentYear(documentYear);
	}

	/**
	* Returns the gross tonnage unit of this temp unit general.
	*
	* @return the gross tonnage unit of this temp unit general
	*/
	@Override
	public java.lang.String getGrossTonnageUnit() {
		return _tempUnitGeneral.getGrossTonnageUnit();
	}

	/**
	* Sets the gross tonnage unit of this temp unit general.
	*
	* @param grossTonnageUnit the gross tonnage unit of this temp unit general
	*/
	@Override
	public void setGrossTonnageUnit(java.lang.String grossTonnageUnit) {
		_tempUnitGeneral.setGrossTonnageUnit(grossTonnageUnit);
	}

	/**
	* Returns the net tonnage unit of this temp unit general.
	*
	* @return the net tonnage unit of this temp unit general
	*/
	@Override
	public java.lang.String getNetTonnageUnit() {
		return _tempUnitGeneral.getNetTonnageUnit();
	}

	/**
	* Sets the net tonnage unit of this temp unit general.
	*
	* @param netTonnageUnit the net tonnage unit of this temp unit general
	*/
	@Override
	public void setNetTonnageUnit(java.lang.String netTonnageUnit) {
		_tempUnitGeneral.setNetTonnageUnit(netTonnageUnit);
	}

	/**
	* Returns the unit d w t of this temp unit general.
	*
	* @return the unit d w t of this temp unit general
	*/
	@Override
	public java.lang.String getUnitDWT() {
		return _tempUnitGeneral.getUnitDWT();
	}

	/**
	* Sets the unit d w t of this temp unit general.
	*
	* @param unitDWT the unit d w t of this temp unit general
	*/
	@Override
	public void setUnitDWT(java.lang.String unitDWT) {
		_tempUnitGeneral.setUnitDWT(unitDWT);
	}

	/**
	* Returns the unit l o a of this temp unit general.
	*
	* @return the unit l o a of this temp unit general
	*/
	@Override
	public java.lang.String getUnitLOA() {
		return _tempUnitGeneral.getUnitLOA();
	}

	/**
	* Sets the unit l o a of this temp unit general.
	*
	* @param unitLOA the unit l o a of this temp unit general
	*/
	@Override
	public void setUnitLOA(java.lang.String unitLOA) {
		_tempUnitGeneral.setUnitLOA(unitLOA);
	}

	/**
	* Returns the unit breadth of this temp unit general.
	*
	* @return the unit breadth of this temp unit general
	*/
	@Override
	public java.lang.String getUnitBreadth() {
		return _tempUnitGeneral.getUnitBreadth();
	}

	/**
	* Sets the unit breadth of this temp unit general.
	*
	* @param unitBreadth the unit breadth of this temp unit general
	*/
	@Override
	public void setUnitBreadth(java.lang.String unitBreadth) {
		_tempUnitGeneral.setUnitBreadth(unitBreadth);
	}

	/**
	* Returns the unit clearance height of this temp unit general.
	*
	* @return the unit clearance height of this temp unit general
	*/
	@Override
	public java.lang.String getUnitClearanceHeight() {
		return _tempUnitGeneral.getUnitClearanceHeight();
	}

	/**
	* Sets the unit clearance height of this temp unit general.
	*
	* @param unitClearanceHeight the unit clearance height of this temp unit general
	*/
	@Override
	public void setUnitClearanceHeight(java.lang.String unitClearanceHeight) {
		_tempUnitGeneral.setUnitClearanceHeight(unitClearanceHeight);
	}

	/**
	* Returns the unit shown draft of this temp unit general.
	*
	* @return the unit shown draft of this temp unit general
	*/
	@Override
	public java.lang.String getUnitShownDraft() {
		return _tempUnitGeneral.getUnitShownDraft();
	}

	/**
	* Sets the unit shown draft of this temp unit general.
	*
	* @param unitShownDraft the unit shown draft of this temp unit general
	*/
	@Override
	public void setUnitShownDraft(java.lang.String unitShownDraft) {
		_tempUnitGeneral.setUnitShownDraft(unitShownDraft);
	}

	/**
	* Returns the unit shown draftx f of this temp unit general.
	*
	* @return the unit shown draftx f of this temp unit general
	*/
	@Override
	public java.lang.String getUnitShownDraftxF() {
		return _tempUnitGeneral.getUnitShownDraftxF();
	}

	/**
	* Sets the unit shown draftx f of this temp unit general.
	*
	* @param unitShownDraftxF the unit shown draftx f of this temp unit general
	*/
	@Override
	public void setUnitShownDraftxF(java.lang.String unitShownDraftxF) {
		_tempUnitGeneral.setUnitShownDraftxF(unitShownDraftxF);
	}

	/**
	* Returns the unit shown draftx a of this temp unit general.
	*
	* @return the unit shown draftx a of this temp unit general
	*/
	@Override
	public java.lang.String getUnitShownDraftxA() {
		return _tempUnitGeneral.getUnitShownDraftxA();
	}

	/**
	* Sets the unit shown draftx a of this temp unit general.
	*
	* @param unitShownDraftxA the unit shown draftx a of this temp unit general
	*/
	@Override
	public void setUnitShownDraftxA(java.lang.String unitShownDraftxA) {
		_tempUnitGeneral.setUnitShownDraftxA(unitShownDraftxA);
	}

	/**
	* Returns the unit horse power of this temp unit general.
	*
	* @return the unit horse power of this temp unit general
	*/
	@Override
	public java.lang.String getUnitHorsePower() {
		return _tempUnitGeneral.getUnitHorsePower();
	}

	/**
	* Sets the unit horse power of this temp unit general.
	*
	* @param unitHorsePower the unit horse power of this temp unit general
	*/
	@Override
	public void setUnitHorsePower(java.lang.String unitHorsePower) {
		_tempUnitGeneral.setUnitHorsePower(unitHorsePower);
	}

	/**
	* Returns the unit remaining on boardx b of this temp unit general.
	*
	* @return the unit remaining on boardx b of this temp unit general
	*/
	@Override
	public java.lang.String getUnitRemainingOnBoardxB() {
		return _tempUnitGeneral.getUnitRemainingOnBoardxB();
	}

	/**
	* Sets the unit remaining on boardx b of this temp unit general.
	*
	* @param unitRemainingOnBoardxB the unit remaining on boardx b of this temp unit general
	*/
	@Override
	public void setUnitRemainingOnBoardxB(
		java.lang.String unitRemainingOnBoardxB) {
		_tempUnitGeneral.setUnitRemainingOnBoardxB(unitRemainingOnBoardxB);
	}

	/**
	* Returns the unit remaining on boardx s of this temp unit general.
	*
	* @return the unit remaining on boardx s of this temp unit general
	*/
	@Override
	public java.lang.String getUnitRemainingOnBoardxS() {
		return _tempUnitGeneral.getUnitRemainingOnBoardxS();
	}

	/**
	* Sets the unit remaining on boardx s of this temp unit general.
	*
	* @param unitRemainingOnBoardxS the unit remaining on boardx s of this temp unit general
	*/
	@Override
	public void setUnitRemainingOnBoardxS(
		java.lang.String unitRemainingOnBoardxS) {
		_tempUnitGeneral.setUnitRemainingOnBoardxS(unitRemainingOnBoardxS);
	}

	/**
	* Returns the unit f o of this temp unit general.
	*
	* @return the unit f o of this temp unit general
	*/
	@Override
	public java.lang.String getUnitFO() {
		return _tempUnitGeneral.getUnitFO();
	}

	/**
	* Sets the unit f o of this temp unit general.
	*
	* @param unitFO the unit f o of this temp unit general
	*/
	@Override
	public void setUnitFO(java.lang.String unitFO) {
		_tempUnitGeneral.setUnitFO(unitFO);
	}

	/**
	* Returns the unit l o of this temp unit general.
	*
	* @return the unit l o of this temp unit general
	*/
	@Override
	public java.lang.String getUnitLO() {
		return _tempUnitGeneral.getUnitLO();
	}

	/**
	* Sets the unit l o of this temp unit general.
	*
	* @param unitLO the unit l o of this temp unit general
	*/
	@Override
	public void setUnitLO(java.lang.String unitLO) {
		_tempUnitGeneral.setUnitLO(unitLO);
	}

	/**
	* Returns the unit f w of this temp unit general.
	*
	* @return the unit f w of this temp unit general
	*/
	@Override
	public java.lang.String getUnitFW() {
		return _tempUnitGeneral.getUnitFW();
	}

	/**
	* Sets the unit f w of this temp unit general.
	*
	* @param unitFW the unit f w of this temp unit general
	*/
	@Override
	public void setUnitFW(java.lang.String unitFW) {
		_tempUnitGeneral.setUnitFW(unitFW);
	}

	/**
	* Returns the unit d o of this temp unit general.
	*
	* @return the unit d o of this temp unit general
	*/
	@Override
	public java.lang.String getUnitDO() {
		return _tempUnitGeneral.getUnitDO();
	}

	/**
	* Sets the unit d o of this temp unit general.
	*
	* @param unitDO the unit d o of this temp unit general
	*/
	@Override
	public void setUnitDO(java.lang.String unitDO) {
		_tempUnitGeneral.setUnitDO(unitDO);
	}

	/**
	* Returns the unit sludge oil of this temp unit general.
	*
	* @return the unit sludge oil of this temp unit general
	*/
	@Override
	public java.lang.String getUnitSludgeOil() {
		return _tempUnitGeneral.getUnitSludgeOil();
	}

	/**
	* Sets the unit sludge oil of this temp unit general.
	*
	* @param unitSludgeOil the unit sludge oil of this temp unit general
	*/
	@Override
	public void setUnitSludgeOil(java.lang.String unitSludgeOil) {
		_tempUnitGeneral.setUnitSludgeOil(unitSludgeOil);
	}

	@Override
	public boolean isNew() {
		return _tempUnitGeneral.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempUnitGeneral.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempUnitGeneral.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempUnitGeneral.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempUnitGeneral.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempUnitGeneral.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempUnitGeneral.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempUnitGeneral.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempUnitGeneral.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempUnitGeneral.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempUnitGeneral.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempUnitGeneralWrapper((TempUnitGeneral)_tempUnitGeneral.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral tempUnitGeneral) {
		return _tempUnitGeneral.compareTo(tempUnitGeneral);
	}

	@Override
	public int hashCode() {
		return _tempUnitGeneral.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral> toCacheModel() {
		return _tempUnitGeneral.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral toEscapedModel() {
		return new TempUnitGeneralWrapper(_tempUnitGeneral.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral toUnescapedModel() {
		return new TempUnitGeneralWrapper(_tempUnitGeneral.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempUnitGeneral.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempUnitGeneral.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempUnitGeneral.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempUnitGeneralWrapper)) {
			return false;
		}

		TempUnitGeneralWrapper tempUnitGeneralWrapper = (TempUnitGeneralWrapper)obj;

		if (Validator.equals(_tempUnitGeneral,
					tempUnitGeneralWrapper._tempUnitGeneral)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempUnitGeneral getWrappedTempUnitGeneral() {
		return _tempUnitGeneral;
	}

	@Override
	public TempUnitGeneral getWrappedModel() {
		return _tempUnitGeneral;
	}

	@Override
	public void resetOriginalValues() {
		_tempUnitGeneral.resetOriginalValues();
	}

	private TempUnitGeneral _tempUnitGeneral;
}