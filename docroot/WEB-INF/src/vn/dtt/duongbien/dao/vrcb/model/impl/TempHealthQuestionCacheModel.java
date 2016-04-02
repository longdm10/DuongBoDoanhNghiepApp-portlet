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

import vn.dtt.duongbien.dao.vrcb.model.TempHealthQuestion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TempHealthQuestion in entity cache.
 *
 * @author longdm
 * @see TempHealthQuestion
 * @generated
 */
public class TempHealthQuestionCacheModel implements CacheModel<TempHealthQuestion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", healthQuestionCode=");
		sb.append(healthQuestionCode);
		sb.append(", personDied=");
		sb.append(personDied);
		sb.append(", personDiedNo=");
		sb.append(personDiedNo);
		sb.append(", personDiedReport=");
		sb.append(personDiedReport);
		sb.append(", isinfectious=");
		sb.append(isinfectious);
		sb.append(", infectiousReport=");
		sb.append(infectiousReport);
		sb.append(", illPassengersGreaterNomal=");
		sb.append(illPassengersGreaterNomal);
		sb.append(", illPassengersNo=");
		sb.append(illPassengersNo);
		sb.append(", illPersonsOnBoard=");
		sb.append(illPersonsOnBoard);
		sb.append(", illPersonsReport=");
		sb.append(illPersonsReport);
		sb.append(", medicalPractitionerConsulted=");
		sb.append(medicalPractitionerConsulted);
		sb.append(", medicalTreatmentOrAdvice=");
		sb.append(medicalTreatmentOrAdvice);
		sb.append(", infectionOrSpreadOfDisease=");
		sb.append(infectionOrSpreadOfDisease);
		sb.append(", infectionsReport=");
		sb.append(infectionsReport);
		sb.append(", isSanitary=");
		sb.append(isSanitary);
		sb.append(", sanitaryDes=");
		sb.append(sanitaryDes);
		sb.append(", isStowaways=");
		sb.append(isStowaways);
		sb.append(", joinShip=");
		sb.append(joinShip);
		sb.append(", isAnimal=");
		sb.append(isAnimal);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TempHealthQuestion toEntityModel() {
		TempHealthQuestionImpl tempHealthQuestionImpl = new TempHealthQuestionImpl();

		tempHealthQuestionImpl.setId(id);

		if (requestCode == null) {
			tempHealthQuestionImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempHealthQuestionImpl.setRequestCode(requestCode);
		}

		if (healthQuestionCode == null) {
			tempHealthQuestionImpl.setHealthQuestionCode(StringPool.BLANK);
		}
		else {
			tempHealthQuestionImpl.setHealthQuestionCode(healthQuestionCode);
		}

		tempHealthQuestionImpl.setPersonDied(personDied);
		tempHealthQuestionImpl.setPersonDiedNo(personDiedNo);

		if (personDiedReport == null) {
			tempHealthQuestionImpl.setPersonDiedReport(StringPool.BLANK);
		}
		else {
			tempHealthQuestionImpl.setPersonDiedReport(personDiedReport);
		}

		tempHealthQuestionImpl.setIsinfectious(isinfectious);

		if (infectiousReport == null) {
			tempHealthQuestionImpl.setInfectiousReport(StringPool.BLANK);
		}
		else {
			tempHealthQuestionImpl.setInfectiousReport(infectiousReport);
		}

		tempHealthQuestionImpl.setIllPassengersGreaterNomal(illPassengersGreaterNomal);
		tempHealthQuestionImpl.setIllPassengersNo(illPassengersNo);
		tempHealthQuestionImpl.setIllPersonsOnBoard(illPersonsOnBoard);
		tempHealthQuestionImpl.setIllPersonsReport(illPersonsReport);
		tempHealthQuestionImpl.setMedicalPractitionerConsulted(medicalPractitionerConsulted);

		if (medicalTreatmentOrAdvice == null) {
			tempHealthQuestionImpl.setMedicalTreatmentOrAdvice(StringPool.BLANK);
		}
		else {
			tempHealthQuestionImpl.setMedicalTreatmentOrAdvice(medicalTreatmentOrAdvice);
		}

		tempHealthQuestionImpl.setInfectionOrSpreadOfDisease(infectionOrSpreadOfDisease);

		if (infectionsReport == null) {
			tempHealthQuestionImpl.setInfectionsReport(StringPool.BLANK);
		}
		else {
			tempHealthQuestionImpl.setInfectionsReport(infectionsReport);
		}

		tempHealthQuestionImpl.setIsSanitary(isSanitary);

		if (sanitaryDes == null) {
			tempHealthQuestionImpl.setSanitaryDes(StringPool.BLANK);
		}
		else {
			tempHealthQuestionImpl.setSanitaryDes(sanitaryDes);
		}

		tempHealthQuestionImpl.setIsStowaways(isStowaways);

		if (joinShip == null) {
			tempHealthQuestionImpl.setJoinShip(StringPool.BLANK);
		}
		else {
			tempHealthQuestionImpl.setJoinShip(joinShip);
		}

		tempHealthQuestionImpl.setIsAnimal(isAnimal);

		tempHealthQuestionImpl.resetOriginalValues();

		return tempHealthQuestionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		healthQuestionCode = objectInput.readUTF();
		personDied = objectInput.readInt();
		personDiedNo = objectInput.readInt();
		personDiedReport = objectInput.readUTF();
		isinfectious = objectInput.readInt();
		infectiousReport = objectInput.readUTF();
		illPassengersGreaterNomal = objectInput.readInt();
		illPassengersNo = objectInput.readInt();
		illPersonsOnBoard = objectInput.readInt();
		illPersonsReport = objectInput.readInt();
		medicalPractitionerConsulted = objectInput.readInt();
		medicalTreatmentOrAdvice = objectInput.readUTF();
		infectionOrSpreadOfDisease = objectInput.readInt();
		infectionsReport = objectInput.readUTF();
		isSanitary = objectInput.readInt();
		sanitaryDes = objectInput.readUTF();
		isStowaways = objectInput.readInt();
		joinShip = objectInput.readUTF();
		isAnimal = objectInput.readInt();
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

		if (healthQuestionCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(healthQuestionCode);
		}

		objectOutput.writeInt(personDied);
		objectOutput.writeInt(personDiedNo);

		if (personDiedReport == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(personDiedReport);
		}

		objectOutput.writeInt(isinfectious);

		if (infectiousReport == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(infectiousReport);
		}

		objectOutput.writeInt(illPassengersGreaterNomal);
		objectOutput.writeInt(illPassengersNo);
		objectOutput.writeInt(illPersonsOnBoard);
		objectOutput.writeInt(illPersonsReport);
		objectOutput.writeInt(medicalPractitionerConsulted);

		if (medicalTreatmentOrAdvice == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(medicalTreatmentOrAdvice);
		}

		objectOutput.writeInt(infectionOrSpreadOfDisease);

		if (infectionsReport == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(infectionsReport);
		}

		objectOutput.writeInt(isSanitary);

		if (sanitaryDes == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sanitaryDes);
		}

		objectOutput.writeInt(isStowaways);

		if (joinShip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(joinShip);
		}

		objectOutput.writeInt(isAnimal);
	}

	public long id;
	public String requestCode;
	public String healthQuestionCode;
	public int personDied;
	public int personDiedNo;
	public String personDiedReport;
	public int isinfectious;
	public String infectiousReport;
	public int illPassengersGreaterNomal;
	public int illPassengersNo;
	public int illPersonsOnBoard;
	public int illPersonsReport;
	public int medicalPractitionerConsulted;
	public String medicalTreatmentOrAdvice;
	public int infectionOrSpreadOfDisease;
	public String infectionsReport;
	public int isSanitary;
	public String sanitaryDes;
	public int isStowaways;
	public String joinShip;
	public int isAnimal;
}