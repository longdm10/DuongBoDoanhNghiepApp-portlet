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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TempUnitGeneral in entity cache.
 *
 * @author longdm
 * @see TempUnitGeneral
 * @generated
 */
public class TempUnitGeneralCacheModel implements CacheModel<TempUnitGeneral>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", grossTonnageUnit=");
		sb.append(grossTonnageUnit);
		sb.append(", netTonnageUnit=");
		sb.append(netTonnageUnit);
		sb.append(", unitDWT=");
		sb.append(unitDWT);
		sb.append(", unitLOA=");
		sb.append(unitLOA);
		sb.append(", unitBreadth=");
		sb.append(unitBreadth);
		sb.append(", unitClearanceHeight=");
		sb.append(unitClearanceHeight);
		sb.append(", unitShownDraft=");
		sb.append(unitShownDraft);
		sb.append(", unitShownDraftxF=");
		sb.append(unitShownDraftxF);
		sb.append(", unitShownDraftxA=");
		sb.append(unitShownDraftxA);
		sb.append(", unitHorsePower=");
		sb.append(unitHorsePower);
		sb.append(", unitRemainingOnBoardxB=");
		sb.append(unitRemainingOnBoardxB);
		sb.append(", unitRemainingOnBoardxS=");
		sb.append(unitRemainingOnBoardxS);
		sb.append(", unitFO=");
		sb.append(unitFO);
		sb.append(", unitLO=");
		sb.append(unitLO);
		sb.append(", unitFW=");
		sb.append(unitFW);
		sb.append(", unitDO=");
		sb.append(unitDO);
		sb.append(", unitSludgeOil=");
		sb.append(unitSludgeOil);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TempUnitGeneral toEntityModel() {
		TempUnitGeneralImpl tempUnitGeneralImpl = new TempUnitGeneralImpl();

		tempUnitGeneralImpl.setId(id);

		if (requestCode == null) {
			tempUnitGeneralImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setRequestCode(requestCode);
		}

		tempUnitGeneralImpl.setDocumentName(documentName);
		tempUnitGeneralImpl.setDocumentYear(documentYear);

		if (grossTonnageUnit == null) {
			tempUnitGeneralImpl.setGrossTonnageUnit(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setGrossTonnageUnit(grossTonnageUnit);
		}

		if (netTonnageUnit == null) {
			tempUnitGeneralImpl.setNetTonnageUnit(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setNetTonnageUnit(netTonnageUnit);
		}

		if (unitDWT == null) {
			tempUnitGeneralImpl.setUnitDWT(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitDWT(unitDWT);
		}

		if (unitLOA == null) {
			tempUnitGeneralImpl.setUnitLOA(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitLOA(unitLOA);
		}

		if (unitBreadth == null) {
			tempUnitGeneralImpl.setUnitBreadth(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitBreadth(unitBreadth);
		}

		if (unitClearanceHeight == null) {
			tempUnitGeneralImpl.setUnitClearanceHeight(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitClearanceHeight(unitClearanceHeight);
		}

		if (unitShownDraft == null) {
			tempUnitGeneralImpl.setUnitShownDraft(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitShownDraft(unitShownDraft);
		}

		if (unitShownDraftxF == null) {
			tempUnitGeneralImpl.setUnitShownDraftxF(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitShownDraftxF(unitShownDraftxF);
		}

		if (unitShownDraftxA == null) {
			tempUnitGeneralImpl.setUnitShownDraftxA(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitShownDraftxA(unitShownDraftxA);
		}

		if (unitHorsePower == null) {
			tempUnitGeneralImpl.setUnitHorsePower(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitHorsePower(unitHorsePower);
		}

		if (unitRemainingOnBoardxB == null) {
			tempUnitGeneralImpl.setUnitRemainingOnBoardxB(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitRemainingOnBoardxB(unitRemainingOnBoardxB);
		}

		if (unitRemainingOnBoardxS == null) {
			tempUnitGeneralImpl.setUnitRemainingOnBoardxS(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitRemainingOnBoardxS(unitRemainingOnBoardxS);
		}

		if (unitFO == null) {
			tempUnitGeneralImpl.setUnitFO(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitFO(unitFO);
		}

		if (unitLO == null) {
			tempUnitGeneralImpl.setUnitLO(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitLO(unitLO);
		}

		if (unitFW == null) {
			tempUnitGeneralImpl.setUnitFW(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitFW(unitFW);
		}

		if (unitDO == null) {
			tempUnitGeneralImpl.setUnitDO(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitDO(unitDO);
		}

		if (unitSludgeOil == null) {
			tempUnitGeneralImpl.setUnitSludgeOil(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitSludgeOil(unitSludgeOil);
		}

		tempUnitGeneralImpl.resetOriginalValues();

		return tempUnitGeneralImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		documentName = objectInput.readLong();
		documentYear = objectInput.readInt();
		grossTonnageUnit = objectInput.readUTF();
		netTonnageUnit = objectInput.readUTF();
		unitDWT = objectInput.readUTF();
		unitLOA = objectInput.readUTF();
		unitBreadth = objectInput.readUTF();
		unitClearanceHeight = objectInput.readUTF();
		unitShownDraft = objectInput.readUTF();
		unitShownDraftxF = objectInput.readUTF();
		unitShownDraftxA = objectInput.readUTF();
		unitHorsePower = objectInput.readUTF();
		unitRemainingOnBoardxB = objectInput.readUTF();
		unitRemainingOnBoardxS = objectInput.readUTF();
		unitFO = objectInput.readUTF();
		unitLO = objectInput.readUTF();
		unitFW = objectInput.readUTF();
		unitDO = objectInput.readUTF();
		unitSludgeOil = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (requestCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(requestCode);
		}

		objectOutput.writeLong(documentName);
		objectOutput.writeInt(documentYear);

		if (grossTonnageUnit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(grossTonnageUnit);
		}

		if (netTonnageUnit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(netTonnageUnit);
		}

		if (unitDWT == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitDWT);
		}

		if (unitLOA == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitLOA);
		}

		if (unitBreadth == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitBreadth);
		}

		if (unitClearanceHeight == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitClearanceHeight);
		}

		if (unitShownDraft == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitShownDraft);
		}

		if (unitShownDraftxF == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitShownDraftxF);
		}

		if (unitShownDraftxA == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitShownDraftxA);
		}

		if (unitHorsePower == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitHorsePower);
		}

		if (unitRemainingOnBoardxB == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitRemainingOnBoardxB);
		}

		if (unitRemainingOnBoardxS == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitRemainingOnBoardxS);
		}

		if (unitFO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitFO);
		}

		if (unitLO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitLO);
		}

		if (unitFW == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitFW);
		}

		if (unitDO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitDO);
		}

		if (unitSludgeOil == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitSludgeOil);
		}
	}

	public long id;
	public String requestCode;
	public long documentName;
	public int documentYear;
	public String grossTonnageUnit;
	public String netTonnageUnit;
	public String unitDWT;
	public String unitLOA;
	public String unitBreadth;
	public String unitClearanceHeight;
	public String unitShownDraft;
	public String unitShownDraftxF;
	public String unitShownDraftxA;
	public String unitHorsePower;
	public String unitRemainingOnBoardxB;
	public String unitRemainingOnBoardxS;
	public String unitFO;
	public String unitLO;
	public String unitFW;
	public String unitDO;
	public String unitSludgeOil;
}