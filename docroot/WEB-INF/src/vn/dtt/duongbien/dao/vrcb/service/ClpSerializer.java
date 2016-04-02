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

package vn.dtt.duongbien.dao.vrcb.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import vn.dtt.duongbien.dao.vrcb.model.CrewListClp;
import vn.dtt.duongbien.dao.vrcb.model.DmArrivalPurposeClp;
import vn.dtt.duongbien.dao.vrcb.model.DmCertificateClp;
import vn.dtt.duongbien.dao.vrcb.model.DmDocTypeClp;
import vn.dtt.duongbien.dao.vrcb.model.DmEnterriseClp;
import vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessTypeClp;
import vn.dtt.duongbien.dao.vrcb.model.DmGTFunctionTypeClp;
import vn.dtt.duongbien.dao.vrcb.model.DmGTShipPositionClp;
import vn.dtt.duongbien.dao.vrcb.model.DmGoodsClp;
import vn.dtt.duongbien.dao.vrcb.model.DmGoodsTypeClp;
import vn.dtt.duongbien.dao.vrcb.model.DmGtOrganizationClp;
import vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategoryClp;
import vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplateClp;
import vn.dtt.duongbien.dao.vrcb.model.DmGtRouteConfigClp;
import vn.dtt.duongbien.dao.vrcb.model.DmGtStatusClp;
import vn.dtt.duongbien.dao.vrcb.model.DmGtVersionClp;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryArrivalPurposeClp;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocTypeClp;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterriseClp;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsClp;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsTypeClp;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryMaritimeClp;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryMinistryClp;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryPackageClp;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryPassportTypeClp;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortClp;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbourClp;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortRegionClp;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortWharfClp;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryRankRatingClp;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryRepresentativeClp;
import vn.dtt.duongbien.dao.vrcb.model.DmHistorySecurityLevelClp;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgencyClp;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipTypeClp;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryStateClp;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneralClp;
import vn.dtt.duongbien.dao.vrcb.model.DmMaritimeClp;
import vn.dtt.duongbien.dao.vrcb.model.DmMinistryClp;
import vn.dtt.duongbien.dao.vrcb.model.DmPackageClp;
import vn.dtt.duongbien.dao.vrcb.model.DmPassportTypeClp;
import vn.dtt.duongbien.dao.vrcb.model.DmPortClp;
import vn.dtt.duongbien.dao.vrcb.model.DmPortHarbourClp;
import vn.dtt.duongbien.dao.vrcb.model.DmPortRegionClp;
import vn.dtt.duongbien.dao.vrcb.model.DmPortWharfClp;
import vn.dtt.duongbien.dao.vrcb.model.DmRankRatingClp;
import vn.dtt.duongbien.dao.vrcb.model.DmRepresentativeClp;
import vn.dtt.duongbien.dao.vrcb.model.DmSecurityLevelClp;
import vn.dtt.duongbien.dao.vrcb.model.DmShipAgencyClp;
import vn.dtt.duongbien.dao.vrcb.model.DmShipTypeClp;
import vn.dtt.duongbien.dao.vrcb.model.DmStateClp;
import vn.dtt.duongbien.dao.vrcb.model.DmSyncCategoryClp;
import vn.dtt.duongbien.dao.vrcb.model.DmTestN01RequestClp;
import vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneralClp;
import vn.dtt.duongbien.dao.vrcb.model.DocumentClp;
import vn.dtt.duongbien.dao.vrcb.model.DocumentGeneralClp;
import vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestClp;
import vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestFieldClp;
import vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShipClp;
import vn.dtt.duongbien.dao.vrcb.model.HistorySyncVersionClp;
import vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestClp;
import vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestFieldClp;
import vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransitClp;
import vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransitClp;
import vn.dtt.duongbien.dao.vrcb.model.IssuePortClearanceClp;
import vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrderClp;
import vn.dtt.duongbien.dao.vrcb.model.LogMessageValidationClp;
import vn.dtt.duongbien.dao.vrcb.model.ModifyClp;
import vn.dtt.duongbien.dao.vrcb.model.NoticeShipMessageClp;
import vn.dtt.duongbien.dao.vrcb.model.PassengerListClp;
import vn.dtt.duongbien.dao.vrcb.model.ResponseBoClp;
import vn.dtt.duongbien.dao.vrcb.model.ResultCertificateClp;
import vn.dtt.duongbien.dao.vrcb.model.ResultCompetionClp;
import vn.dtt.duongbien.dao.vrcb.model.ResultDeclarationClp;
import vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistryClp;
import vn.dtt.duongbien.dao.vrcb.model.ResultMinistryClp;
import vn.dtt.duongbien.dao.vrcb.model.ResultNotificationClp;
import vn.dtt.duongbien.dao.vrcb.model.RmdcShipClp;
import vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantineClp;
import vn.dtt.duongbien.dao.vrcb.model.TempAttachmentDeclarationHealthClp;
import vn.dtt.duongbien.dao.vrcb.model.TempCargoDeclarationClp;
import vn.dtt.duongbien.dao.vrcb.model.TempCrewDetailsClp;
import vn.dtt.duongbien.dao.vrcb.model.TempCrewEffectsDeclarationClp;
import vn.dtt.duongbien.dao.vrcb.model.TempCrewEffectsItemsClp;
import vn.dtt.duongbien.dao.vrcb.model.TempCrewListClp;
import vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsItemsClp;
import vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsNanifestClp;
import vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantineClp;
import vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForPlantQuarantineClp;
import vn.dtt.duongbien.dao.vrcb.model.TempDeclarationOfHealthClp;
import vn.dtt.duongbien.dao.vrcb.model.TempDocumentClp;
import vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclarationClp;
import vn.dtt.duongbien.dao.vrcb.model.TempGoodsItemsClp;
import vn.dtt.duongbien.dao.vrcb.model.TempHealthCrewPassengerListClp;
import vn.dtt.duongbien.dao.vrcb.model.TempHealthQuestionClp;
import vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessageClp;
import vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetailsClp;
import vn.dtt.duongbien.dao.vrcb.model.TempPassengerListClp;
import vn.dtt.duongbien.dao.vrcb.model.TempPlantQuarantineClp;
import vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityMessageClp;
import vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItemsClp;
import vn.dtt.duongbien.dao.vrcb.model.TempShipStoresDeclarationClp;
import vn.dtt.duongbien.dao.vrcb.model.TempShipStoresItemsClp;
import vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneralClp;
import vn.dtt.duongbien.dao.vrcb.model.UserPortClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author longdm
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"DuongBoDoanhNghiepApp-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"DuongBoDoanhNghiepApp-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "DuongBoDoanhNghiepApp-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(CrewListClp.class.getName())) {
			return translateInputCrewList(oldModel);
		}

		if (oldModelClassName.equals(DmArrivalPurposeClp.class.getName())) {
			return translateInputDmArrivalPurpose(oldModel);
		}

		if (oldModelClassName.equals(DmCertificateClp.class.getName())) {
			return translateInputDmCertificate(oldModel);
		}

		if (oldModelClassName.equals(DmDocTypeClp.class.getName())) {
			return translateInputDmDocType(oldModel);
		}

		if (oldModelClassName.equals(DmEnterriseClp.class.getName())) {
			return translateInputDmEnterrise(oldModel);
		}

		if (oldModelClassName.equals(DmGoodsClp.class.getName())) {
			return translateInputDmGoods(oldModel);
		}

		if (oldModelClassName.equals(DmGoodsTypeClp.class.getName())) {
			return translateInputDmGoodsType(oldModel);
		}

		if (oldModelClassName.equals(DmGTBusinessTypeClp.class.getName())) {
			return translateInputDmGTBusinessType(oldModel);
		}

		if (oldModelClassName.equals(DmGTFunctionTypeClp.class.getName())) {
			return translateInputDmGTFunctionType(oldModel);
		}

		if (oldModelClassName.equals(DmGtOrganizationClp.class.getName())) {
			return translateInputDmGtOrganization(oldModel);
		}

		if (oldModelClassName.equals(DmGtReportCategoryClp.class.getName())) {
			return translateInputDmGtReportCategory(oldModel);
		}

		if (oldModelClassName.equals(DmGtReportTemplateClp.class.getName())) {
			return translateInputDmGtReportTemplate(oldModel);
		}

		if (oldModelClassName.equals(DmGtRouteConfigClp.class.getName())) {
			return translateInputDmGtRouteConfig(oldModel);
		}

		if (oldModelClassName.equals(DmGTShipPositionClp.class.getName())) {
			return translateInputDmGTShipPosition(oldModel);
		}

		if (oldModelClassName.equals(DmGtStatusClp.class.getName())) {
			return translateInputDmGtStatus(oldModel);
		}

		if (oldModelClassName.equals(DmGtVersionClp.class.getName())) {
			return translateInputDmGtVersion(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryArrivalPurposeClp.class.getName())) {
			return translateInputDmHistoryArrivalPurpose(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryDocTypeClp.class.getName())) {
			return translateInputDmHistoryDocType(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryEnterriseClp.class.getName())) {
			return translateInputDmHistoryEnterrise(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryGoodsClp.class.getName())) {
			return translateInputDmHistoryGoods(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryGoodsTypeClp.class.getName())) {
			return translateInputDmHistoryGoodsType(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryMaritimeClp.class.getName())) {
			return translateInputDmHistoryMaritime(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryMinistryClp.class.getName())) {
			return translateInputDmHistoryMinistry(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryPackageClp.class.getName())) {
			return translateInputDmHistoryPackage(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryPassportTypeClp.class.getName())) {
			return translateInputDmHistoryPassportType(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryPortClp.class.getName())) {
			return translateInputDmHistoryPort(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryPortHarbourClp.class.getName())) {
			return translateInputDmHistoryPortHarbour(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryPortRegionClp.class.getName())) {
			return translateInputDmHistoryPortRegion(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryPortWharfClp.class.getName())) {
			return translateInputDmHistoryPortWharf(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryRankRatingClp.class.getName())) {
			return translateInputDmHistoryRankRating(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryRepresentativeClp.class.getName())) {
			return translateInputDmHistoryRepresentative(oldModel);
		}

		if (oldModelClassName.equals(DmHistorySecurityLevelClp.class.getName())) {
			return translateInputDmHistorySecurityLevel(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryShipAgencyClp.class.getName())) {
			return translateInputDmHistoryShipAgency(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryShipTypeClp.class.getName())) {
			return translateInputDmHistoryShipType(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryStateClp.class.getName())) {
			return translateInputDmHistoryState(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryUnitGeneralClp.class.getName())) {
			return translateInputDmHistoryUnitGeneral(oldModel);
		}

		if (oldModelClassName.equals(DmMaritimeClp.class.getName())) {
			return translateInputDmMaritime(oldModel);
		}

		if (oldModelClassName.equals(DmMinistryClp.class.getName())) {
			return translateInputDmMinistry(oldModel);
		}

		if (oldModelClassName.equals(DmPackageClp.class.getName())) {
			return translateInputDmPackage(oldModel);
		}

		if (oldModelClassName.equals(DmPassportTypeClp.class.getName())) {
			return translateInputDmPassportType(oldModel);
		}

		if (oldModelClassName.equals(DmPortClp.class.getName())) {
			return translateInputDmPort(oldModel);
		}

		if (oldModelClassName.equals(DmPortHarbourClp.class.getName())) {
			return translateInputDmPortHarbour(oldModel);
		}

		if (oldModelClassName.equals(DmPortRegionClp.class.getName())) {
			return translateInputDmPortRegion(oldModel);
		}

		if (oldModelClassName.equals(DmPortWharfClp.class.getName())) {
			return translateInputDmPortWharf(oldModel);
		}

		if (oldModelClassName.equals(DmRankRatingClp.class.getName())) {
			return translateInputDmRankRating(oldModel);
		}

		if (oldModelClassName.equals(DmRepresentativeClp.class.getName())) {
			return translateInputDmRepresentative(oldModel);
		}

		if (oldModelClassName.equals(DmSecurityLevelClp.class.getName())) {
			return translateInputDmSecurityLevel(oldModel);
		}

		if (oldModelClassName.equals(DmShipAgencyClp.class.getName())) {
			return translateInputDmShipAgency(oldModel);
		}

		if (oldModelClassName.equals(DmShipTypeClp.class.getName())) {
			return translateInputDmShipType(oldModel);
		}

		if (oldModelClassName.equals(DmStateClp.class.getName())) {
			return translateInputDmState(oldModel);
		}

		if (oldModelClassName.equals(DmSyncCategoryClp.class.getName())) {
			return translateInputDmSyncCategory(oldModel);
		}

		if (oldModelClassName.equals(DmTestN01RequestClp.class.getName())) {
			return translateInputDmTestN01Request(oldModel);
		}

		if (oldModelClassName.equals(DmUnitGeneralClp.class.getName())) {
			return translateInputDmUnitGeneral(oldModel);
		}

		if (oldModelClassName.equals(DocumentClp.class.getName())) {
			return translateInputDocument(oldModel);
		}

		if (oldModelClassName.equals(DocumentGeneralClp.class.getName())) {
			return translateInputDocumentGeneral(oldModel);
		}

		if (oldModelClassName.equals(HistoryInterfaceRequestClp.class.getName())) {
			return translateInputHistoryInterfaceRequest(oldModel);
		}

		if (oldModelClassName.equals(
					HistoryInterfaceRequestFieldClp.class.getName())) {
			return translateInputHistoryInterfaceRequestField(oldModel);
		}

		if (oldModelClassName.equals(HistoryRmdcShipClp.class.getName())) {
			return translateInputHistoryRmdcShip(oldModel);
		}

		if (oldModelClassName.equals(HistorySyncVersionClp.class.getName())) {
			return translateInputHistorySyncVersion(oldModel);
		}

		if (oldModelClassName.equals(InterfaceRequestClp.class.getName())) {
			return translateInputInterfaceRequest(oldModel);
		}

		if (oldModelClassName.equals(InterfaceRequestFieldClp.class.getName())) {
			return translateInputInterfaceRequestField(oldModel);
		}

		if (oldModelClassName.equals(
					IssueAcceptanceForTransitClp.class.getName())) {
			return translateInputIssueAcceptanceForTransit(oldModel);
		}

		if (oldModelClassName.equals(
					IssuePermissionForTransitClp.class.getName())) {
			return translateInputIssuePermissionForTransit(oldModel);
		}

		if (oldModelClassName.equals(IssuePortClearanceClp.class.getName())) {
			return translateInputIssuePortClearance(oldModel);
		}

		if (oldModelClassName.equals(IssueShiftingOrderClp.class.getName())) {
			return translateInputIssueShiftingOrder(oldModel);
		}

		if (oldModelClassName.equals(LogMessageValidationClp.class.getName())) {
			return translateInputLogMessageValidation(oldModel);
		}

		if (oldModelClassName.equals(ModifyClp.class.getName())) {
			return translateInputModify(oldModel);
		}

		if (oldModelClassName.equals(NoticeShipMessageClp.class.getName())) {
			return translateInputNoticeShipMessage(oldModel);
		}

		if (oldModelClassName.equals(PassengerListClp.class.getName())) {
			return translateInputPassengerList(oldModel);
		}

		if (oldModelClassName.equals(ResponseBoClp.class.getName())) {
			return translateInputResponseBo(oldModel);
		}

		if (oldModelClassName.equals(ResultCertificateClp.class.getName())) {
			return translateInputResultCertificate(oldModel);
		}

		if (oldModelClassName.equals(ResultCompetionClp.class.getName())) {
			return translateInputResultCompetion(oldModel);
		}

		if (oldModelClassName.equals(ResultDeclarationClp.class.getName())) {
			return translateInputResultDeclaration(oldModel);
		}

		if (oldModelClassName.equals(ResultHistoryMinistryClp.class.getName())) {
			return translateInputResultHistoryMinistry(oldModel);
		}

		if (oldModelClassName.equals(ResultMinistryClp.class.getName())) {
			return translateInputResultMinistry(oldModel);
		}

		if (oldModelClassName.equals(ResultNotificationClp.class.getName())) {
			return translateInputResultNotification(oldModel);
		}

		if (oldModelClassName.equals(RmdcShipClp.class.getName())) {
			return translateInputRmdcShip(oldModel);
		}

		if (oldModelClassName.equals(TempAnimalQuarantineClp.class.getName())) {
			return translateInputTempAnimalQuarantine(oldModel);
		}

		if (oldModelClassName.equals(
					TempAttachmentDeclarationHealthClp.class.getName())) {
			return translateInputTempAttachmentDeclarationHealth(oldModel);
		}

		if (oldModelClassName.equals(TempCargoDeclarationClp.class.getName())) {
			return translateInputTempCargoDeclaration(oldModel);
		}

		if (oldModelClassName.equals(TempCrewDetailsClp.class.getName())) {
			return translateInputTempCrewDetails(oldModel);
		}

		if (oldModelClassName.equals(
					TempCrewEffectsDeclarationClp.class.getName())) {
			return translateInputTempCrewEffectsDeclaration(oldModel);
		}

		if (oldModelClassName.equals(TempCrewEffectsItemsClp.class.getName())) {
			return translateInputTempCrewEffectsItems(oldModel);
		}

		if (oldModelClassName.equals(TempCrewListClp.class.getName())) {
			return translateInputTempCrewList(oldModel);
		}

		if (oldModelClassName.equals(TempDangerousGoodsItemsClp.class.getName())) {
			return translateInputTempDangerousGoodsItems(oldModel);
		}

		if (oldModelClassName.equals(
					TempDangerousGoodsNanifestClp.class.getName())) {
			return translateInputTempDangerousGoodsNanifest(oldModel);
		}

		if (oldModelClassName.equals(
					TempDeclarationForAnimalQuarantineClp.class.getName())) {
			return translateInputTempDeclarationForAnimalQuarantine(oldModel);
		}

		if (oldModelClassName.equals(
					TempDeclarationForPlantQuarantineClp.class.getName())) {
			return translateInputTempDeclarationForPlantQuarantine(oldModel);
		}

		if (oldModelClassName.equals(TempDeclarationOfHealthClp.class.getName())) {
			return translateInputTempDeclarationOfHealth(oldModel);
		}

		if (oldModelClassName.equals(TempDocumentClp.class.getName())) {
			return translateInputTempDocument(oldModel);
		}

		if (oldModelClassName.equals(TempGeneralDeclarationClp.class.getName())) {
			return translateInputTempGeneralDeclaration(oldModel);
		}

		if (oldModelClassName.equals(TempGoodsItemsClp.class.getName())) {
			return translateInputTempGoodsItems(oldModel);
		}

		if (oldModelClassName.equals(
					TempHealthCrewPassengerListClp.class.getName())) {
			return translateInputTempHealthCrewPassengerList(oldModel);
		}

		if (oldModelClassName.equals(TempHealthQuestionClp.class.getName())) {
			return translateInputTempHealthQuestion(oldModel);
		}

		if (oldModelClassName.equals(TempNoTiceShipMessageClp.class.getName())) {
			return translateInputTempNoTiceShipMessage(oldModel);
		}

		if (oldModelClassName.equals(TempPassengerDetailsClp.class.getName())) {
			return translateInputTempPassengerDetails(oldModel);
		}

		if (oldModelClassName.equals(TempPassengerListClp.class.getName())) {
			return translateInputTempPassengerList(oldModel);
		}

		if (oldModelClassName.equals(TempPlantQuarantineClp.class.getName())) {
			return translateInputTempPlantQuarantine(oldModel);
		}

		if (oldModelClassName.equals(TempShipSecurityMessageClp.class.getName())) {
			return translateInputTempShipSecurityMessage(oldModel);
		}

		if (oldModelClassName.equals(
					TempShipSecurityPortItemsClp.class.getName())) {
			return translateInputTempShipSecurityPortItems(oldModel);
		}

		if (oldModelClassName.equals(
					TempShipStoresDeclarationClp.class.getName())) {
			return translateInputTempShipStoresDeclaration(oldModel);
		}

		if (oldModelClassName.equals(TempShipStoresItemsClp.class.getName())) {
			return translateInputTempShipStoresItems(oldModel);
		}

		if (oldModelClassName.equals(TempUnitGeneralClp.class.getName())) {
			return translateInputTempUnitGeneral(oldModel);
		}

		if (oldModelClassName.equals(UserPortClp.class.getName())) {
			return translateInputUserPort(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputCrewList(BaseModel<?> oldModel) {
		CrewListClp oldClpModel = (CrewListClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCrewListRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmArrivalPurpose(BaseModel<?> oldModel) {
		DmArrivalPurposeClp oldClpModel = (DmArrivalPurposeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmArrivalPurposeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmCertificate(BaseModel<?> oldModel) {
		DmCertificateClp oldClpModel = (DmCertificateClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmCertificateRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmDocType(BaseModel<?> oldModel) {
		DmDocTypeClp oldClpModel = (DmDocTypeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmDocTypeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmEnterrise(BaseModel<?> oldModel) {
		DmEnterriseClp oldClpModel = (DmEnterriseClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmEnterriseRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmGoods(BaseModel<?> oldModel) {
		DmGoodsClp oldClpModel = (DmGoodsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmGoodsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmGoodsType(BaseModel<?> oldModel) {
		DmGoodsTypeClp oldClpModel = (DmGoodsTypeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmGoodsTypeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmGTBusinessType(BaseModel<?> oldModel) {
		DmGTBusinessTypeClp oldClpModel = (DmGTBusinessTypeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmGTBusinessTypeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmGTFunctionType(BaseModel<?> oldModel) {
		DmGTFunctionTypeClp oldClpModel = (DmGTFunctionTypeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmGTFunctionTypeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmGtOrganization(BaseModel<?> oldModel) {
		DmGtOrganizationClp oldClpModel = (DmGtOrganizationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmGtOrganizationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmGtReportCategory(BaseModel<?> oldModel) {
		DmGtReportCategoryClp oldClpModel = (DmGtReportCategoryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmGtReportCategoryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmGtReportTemplate(BaseModel<?> oldModel) {
		DmGtReportTemplateClp oldClpModel = (DmGtReportTemplateClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmGtReportTemplateRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmGtRouteConfig(BaseModel<?> oldModel) {
		DmGtRouteConfigClp oldClpModel = (DmGtRouteConfigClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmGtRouteConfigRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmGTShipPosition(BaseModel<?> oldModel) {
		DmGTShipPositionClp oldClpModel = (DmGTShipPositionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmGTShipPositionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmGtStatus(BaseModel<?> oldModel) {
		DmGtStatusClp oldClpModel = (DmGtStatusClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmGtStatusRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmGtVersion(BaseModel<?> oldModel) {
		DmGtVersionClp oldClpModel = (DmGtVersionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmGtVersionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmHistoryArrivalPurpose(
		BaseModel<?> oldModel) {
		DmHistoryArrivalPurposeClp oldClpModel = (DmHistoryArrivalPurposeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmHistoryArrivalPurposeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmHistoryDocType(BaseModel<?> oldModel) {
		DmHistoryDocTypeClp oldClpModel = (DmHistoryDocTypeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmHistoryDocTypeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmHistoryEnterrise(BaseModel<?> oldModel) {
		DmHistoryEnterriseClp oldClpModel = (DmHistoryEnterriseClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmHistoryEnterriseRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmHistoryGoods(BaseModel<?> oldModel) {
		DmHistoryGoodsClp oldClpModel = (DmHistoryGoodsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmHistoryGoodsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmHistoryGoodsType(BaseModel<?> oldModel) {
		DmHistoryGoodsTypeClp oldClpModel = (DmHistoryGoodsTypeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmHistoryGoodsTypeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmHistoryMaritime(BaseModel<?> oldModel) {
		DmHistoryMaritimeClp oldClpModel = (DmHistoryMaritimeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmHistoryMaritimeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmHistoryMinistry(BaseModel<?> oldModel) {
		DmHistoryMinistryClp oldClpModel = (DmHistoryMinistryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmHistoryMinistryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmHistoryPackage(BaseModel<?> oldModel) {
		DmHistoryPackageClp oldClpModel = (DmHistoryPackageClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmHistoryPackageRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmHistoryPassportType(
		BaseModel<?> oldModel) {
		DmHistoryPassportTypeClp oldClpModel = (DmHistoryPassportTypeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmHistoryPassportTypeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmHistoryPort(BaseModel<?> oldModel) {
		DmHistoryPortClp oldClpModel = (DmHistoryPortClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmHistoryPortRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmHistoryPortHarbour(
		BaseModel<?> oldModel) {
		DmHistoryPortHarbourClp oldClpModel = (DmHistoryPortHarbourClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmHistoryPortHarbourRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmHistoryPortRegion(
		BaseModel<?> oldModel) {
		DmHistoryPortRegionClp oldClpModel = (DmHistoryPortRegionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmHistoryPortRegionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmHistoryPortWharf(BaseModel<?> oldModel) {
		DmHistoryPortWharfClp oldClpModel = (DmHistoryPortWharfClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmHistoryPortWharfRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmHistoryRankRating(
		BaseModel<?> oldModel) {
		DmHistoryRankRatingClp oldClpModel = (DmHistoryRankRatingClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmHistoryRankRatingRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmHistoryRepresentative(
		BaseModel<?> oldModel) {
		DmHistoryRepresentativeClp oldClpModel = (DmHistoryRepresentativeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmHistoryRepresentativeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmHistorySecurityLevel(
		BaseModel<?> oldModel) {
		DmHistorySecurityLevelClp oldClpModel = (DmHistorySecurityLevelClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmHistorySecurityLevelRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmHistoryShipAgency(
		BaseModel<?> oldModel) {
		DmHistoryShipAgencyClp oldClpModel = (DmHistoryShipAgencyClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmHistoryShipAgencyRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmHistoryShipType(BaseModel<?> oldModel) {
		DmHistoryShipTypeClp oldClpModel = (DmHistoryShipTypeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmHistoryShipTypeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmHistoryState(BaseModel<?> oldModel) {
		DmHistoryStateClp oldClpModel = (DmHistoryStateClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmHistoryStateRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmHistoryUnitGeneral(
		BaseModel<?> oldModel) {
		DmHistoryUnitGeneralClp oldClpModel = (DmHistoryUnitGeneralClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmHistoryUnitGeneralRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmMaritime(BaseModel<?> oldModel) {
		DmMaritimeClp oldClpModel = (DmMaritimeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmMaritimeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmMinistry(BaseModel<?> oldModel) {
		DmMinistryClp oldClpModel = (DmMinistryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmMinistryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmPackage(BaseModel<?> oldModel) {
		DmPackageClp oldClpModel = (DmPackageClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmPackageRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmPassportType(BaseModel<?> oldModel) {
		DmPassportTypeClp oldClpModel = (DmPassportTypeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmPassportTypeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmPort(BaseModel<?> oldModel) {
		DmPortClp oldClpModel = (DmPortClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmPortRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmPortHarbour(BaseModel<?> oldModel) {
		DmPortHarbourClp oldClpModel = (DmPortHarbourClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmPortHarbourRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmPortRegion(BaseModel<?> oldModel) {
		DmPortRegionClp oldClpModel = (DmPortRegionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmPortRegionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmPortWharf(BaseModel<?> oldModel) {
		DmPortWharfClp oldClpModel = (DmPortWharfClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmPortWharfRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmRankRating(BaseModel<?> oldModel) {
		DmRankRatingClp oldClpModel = (DmRankRatingClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmRankRatingRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmRepresentative(BaseModel<?> oldModel) {
		DmRepresentativeClp oldClpModel = (DmRepresentativeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmRepresentativeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmSecurityLevel(BaseModel<?> oldModel) {
		DmSecurityLevelClp oldClpModel = (DmSecurityLevelClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmSecurityLevelRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmShipAgency(BaseModel<?> oldModel) {
		DmShipAgencyClp oldClpModel = (DmShipAgencyClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmShipAgencyRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmShipType(BaseModel<?> oldModel) {
		DmShipTypeClp oldClpModel = (DmShipTypeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmShipTypeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmState(BaseModel<?> oldModel) {
		DmStateClp oldClpModel = (DmStateClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmStateRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmSyncCategory(BaseModel<?> oldModel) {
		DmSyncCategoryClp oldClpModel = (DmSyncCategoryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmSyncCategoryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmTestN01Request(BaseModel<?> oldModel) {
		DmTestN01RequestClp oldClpModel = (DmTestN01RequestClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmTestN01RequestRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmUnitGeneral(BaseModel<?> oldModel) {
		DmUnitGeneralClp oldClpModel = (DmUnitGeneralClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmUnitGeneralRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDocument(BaseModel<?> oldModel) {
		DocumentClp oldClpModel = (DocumentClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDocumentRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDocumentGeneral(BaseModel<?> oldModel) {
		DocumentGeneralClp oldClpModel = (DocumentGeneralClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDocumentGeneralRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputHistoryInterfaceRequest(
		BaseModel<?> oldModel) {
		HistoryInterfaceRequestClp oldClpModel = (HistoryInterfaceRequestClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getHistoryInterfaceRequestRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputHistoryInterfaceRequestField(
		BaseModel<?> oldModel) {
		HistoryInterfaceRequestFieldClp oldClpModel = (HistoryInterfaceRequestFieldClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getHistoryInterfaceRequestFieldRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputHistoryRmdcShip(BaseModel<?> oldModel) {
		HistoryRmdcShipClp oldClpModel = (HistoryRmdcShipClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getHistoryRmdcShipRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputHistorySyncVersion(BaseModel<?> oldModel) {
		HistorySyncVersionClp oldClpModel = (HistorySyncVersionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getHistorySyncVersionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputInterfaceRequest(BaseModel<?> oldModel) {
		InterfaceRequestClp oldClpModel = (InterfaceRequestClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getInterfaceRequestRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputInterfaceRequestField(
		BaseModel<?> oldModel) {
		InterfaceRequestFieldClp oldClpModel = (InterfaceRequestFieldClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getInterfaceRequestFieldRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputIssueAcceptanceForTransit(
		BaseModel<?> oldModel) {
		IssueAcceptanceForTransitClp oldClpModel = (IssueAcceptanceForTransitClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getIssueAcceptanceForTransitRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputIssuePermissionForTransit(
		BaseModel<?> oldModel) {
		IssuePermissionForTransitClp oldClpModel = (IssuePermissionForTransitClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getIssuePermissionForTransitRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputIssuePortClearance(BaseModel<?> oldModel) {
		IssuePortClearanceClp oldClpModel = (IssuePortClearanceClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getIssuePortClearanceRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputIssueShiftingOrder(BaseModel<?> oldModel) {
		IssueShiftingOrderClp oldClpModel = (IssueShiftingOrderClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getIssueShiftingOrderRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputLogMessageValidation(
		BaseModel<?> oldModel) {
		LogMessageValidationClp oldClpModel = (LogMessageValidationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLogMessageValidationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputModify(BaseModel<?> oldModel) {
		ModifyClp oldClpModel = (ModifyClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getModifyRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputNoticeShipMessage(BaseModel<?> oldModel) {
		NoticeShipMessageClp oldClpModel = (NoticeShipMessageClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getNoticeShipMessageRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPassengerList(BaseModel<?> oldModel) {
		PassengerListClp oldClpModel = (PassengerListClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPassengerListRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputResponseBo(BaseModel<?> oldModel) {
		ResponseBoClp oldClpModel = (ResponseBoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getResponseBoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputResultCertificate(BaseModel<?> oldModel) {
		ResultCertificateClp oldClpModel = (ResultCertificateClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getResultCertificateRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputResultCompetion(BaseModel<?> oldModel) {
		ResultCompetionClp oldClpModel = (ResultCompetionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getResultCompetionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputResultDeclaration(BaseModel<?> oldModel) {
		ResultDeclarationClp oldClpModel = (ResultDeclarationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getResultDeclarationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputResultHistoryMinistry(
		BaseModel<?> oldModel) {
		ResultHistoryMinistryClp oldClpModel = (ResultHistoryMinistryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getResultHistoryMinistryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputResultMinistry(BaseModel<?> oldModel) {
		ResultMinistryClp oldClpModel = (ResultMinistryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getResultMinistryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputResultNotification(BaseModel<?> oldModel) {
		ResultNotificationClp oldClpModel = (ResultNotificationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getResultNotificationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputRmdcShip(BaseModel<?> oldModel) {
		RmdcShipClp oldClpModel = (RmdcShipClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getRmdcShipRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempAnimalQuarantine(
		BaseModel<?> oldModel) {
		TempAnimalQuarantineClp oldClpModel = (TempAnimalQuarantineClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempAnimalQuarantineRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempAttachmentDeclarationHealth(
		BaseModel<?> oldModel) {
		TempAttachmentDeclarationHealthClp oldClpModel = (TempAttachmentDeclarationHealthClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempAttachmentDeclarationHealthRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempCargoDeclaration(
		BaseModel<?> oldModel) {
		TempCargoDeclarationClp oldClpModel = (TempCargoDeclarationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempCargoDeclarationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempCrewDetails(BaseModel<?> oldModel) {
		TempCrewDetailsClp oldClpModel = (TempCrewDetailsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempCrewDetailsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempCrewEffectsDeclaration(
		BaseModel<?> oldModel) {
		TempCrewEffectsDeclarationClp oldClpModel = (TempCrewEffectsDeclarationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempCrewEffectsDeclarationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempCrewEffectsItems(
		BaseModel<?> oldModel) {
		TempCrewEffectsItemsClp oldClpModel = (TempCrewEffectsItemsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempCrewEffectsItemsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempCrewList(BaseModel<?> oldModel) {
		TempCrewListClp oldClpModel = (TempCrewListClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempCrewListRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempDangerousGoodsItems(
		BaseModel<?> oldModel) {
		TempDangerousGoodsItemsClp oldClpModel = (TempDangerousGoodsItemsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempDangerousGoodsItemsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempDangerousGoodsNanifest(
		BaseModel<?> oldModel) {
		TempDangerousGoodsNanifestClp oldClpModel = (TempDangerousGoodsNanifestClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempDangerousGoodsNanifestRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempDeclarationForAnimalQuarantine(
		BaseModel<?> oldModel) {
		TempDeclarationForAnimalQuarantineClp oldClpModel = (TempDeclarationForAnimalQuarantineClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempDeclarationForAnimalQuarantineRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempDeclarationForPlantQuarantine(
		BaseModel<?> oldModel) {
		TempDeclarationForPlantQuarantineClp oldClpModel = (TempDeclarationForPlantQuarantineClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempDeclarationForPlantQuarantineRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempDeclarationOfHealth(
		BaseModel<?> oldModel) {
		TempDeclarationOfHealthClp oldClpModel = (TempDeclarationOfHealthClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempDeclarationOfHealthRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempDocument(BaseModel<?> oldModel) {
		TempDocumentClp oldClpModel = (TempDocumentClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempDocumentRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempGeneralDeclaration(
		BaseModel<?> oldModel) {
		TempGeneralDeclarationClp oldClpModel = (TempGeneralDeclarationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempGeneralDeclarationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempGoodsItems(BaseModel<?> oldModel) {
		TempGoodsItemsClp oldClpModel = (TempGoodsItemsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempGoodsItemsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempHealthCrewPassengerList(
		BaseModel<?> oldModel) {
		TempHealthCrewPassengerListClp oldClpModel = (TempHealthCrewPassengerListClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempHealthCrewPassengerListRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempHealthQuestion(BaseModel<?> oldModel) {
		TempHealthQuestionClp oldClpModel = (TempHealthQuestionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempHealthQuestionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempNoTiceShipMessage(
		BaseModel<?> oldModel) {
		TempNoTiceShipMessageClp oldClpModel = (TempNoTiceShipMessageClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempNoTiceShipMessageRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempPassengerDetails(
		BaseModel<?> oldModel) {
		TempPassengerDetailsClp oldClpModel = (TempPassengerDetailsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempPassengerDetailsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempPassengerList(BaseModel<?> oldModel) {
		TempPassengerListClp oldClpModel = (TempPassengerListClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempPassengerListRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempPlantQuarantine(
		BaseModel<?> oldModel) {
		TempPlantQuarantineClp oldClpModel = (TempPlantQuarantineClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempPlantQuarantineRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempShipSecurityMessage(
		BaseModel<?> oldModel) {
		TempShipSecurityMessageClp oldClpModel = (TempShipSecurityMessageClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempShipSecurityMessageRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempShipSecurityPortItems(
		BaseModel<?> oldModel) {
		TempShipSecurityPortItemsClp oldClpModel = (TempShipSecurityPortItemsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempShipSecurityPortItemsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempShipStoresDeclaration(
		BaseModel<?> oldModel) {
		TempShipStoresDeclarationClp oldClpModel = (TempShipStoresDeclarationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempShipStoresDeclarationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempShipStoresItems(
		BaseModel<?> oldModel) {
		TempShipStoresItemsClp oldClpModel = (TempShipStoresItemsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempShipStoresItemsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTempUnitGeneral(BaseModel<?> oldModel) {
		TempUnitGeneralClp oldClpModel = (TempUnitGeneralClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTempUnitGeneralRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputUserPort(BaseModel<?> oldModel) {
		UserPortClp oldClpModel = (UserPortClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getUserPortRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.CrewListImpl")) {
			return translateOutputCrewList(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmArrivalPurposeImpl")) {
			return translateOutputDmArrivalPurpose(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmCertificateImpl")) {
			return translateOutputDmCertificate(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmDocTypeImpl")) {
			return translateOutputDmDocType(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmEnterriseImpl")) {
			return translateOutputDmEnterrise(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmGoodsImpl")) {
			return translateOutputDmGoods(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmGoodsTypeImpl")) {
			return translateOutputDmGoodsType(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmGTBusinessTypeImpl")) {
			return translateOutputDmGTBusinessType(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmGTFunctionTypeImpl")) {
			return translateOutputDmGTFunctionType(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmGtOrganizationImpl")) {
			return translateOutputDmGtOrganization(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmGtReportCategoryImpl")) {
			return translateOutputDmGtReportCategory(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmGtReportTemplateImpl")) {
			return translateOutputDmGtReportTemplate(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmGtRouteConfigImpl")) {
			return translateOutputDmGtRouteConfig(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmGTShipPositionImpl")) {
			return translateOutputDmGTShipPosition(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmGtStatusImpl")) {
			return translateOutputDmGtStatus(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmGtVersionImpl")) {
			return translateOutputDmGtVersion(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryArrivalPurposeImpl")) {
			return translateOutputDmHistoryArrivalPurpose(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryDocTypeImpl")) {
			return translateOutputDmHistoryDocType(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseImpl")) {
			return translateOutputDmHistoryEnterrise(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsImpl")) {
			return translateOutputDmHistoryGoods(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsTypeImpl")) {
			return translateOutputDmHistoryGoodsType(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryMaritimeImpl")) {
			return translateOutputDmHistoryMaritime(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryMinistryImpl")) {
			return translateOutputDmHistoryMinistry(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPackageImpl")) {
			return translateOutputDmHistoryPackage(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPassportTypeImpl")) {
			return translateOutputDmHistoryPassportType(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortImpl")) {
			return translateOutputDmHistoryPort(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortHarbourImpl")) {
			return translateOutputDmHistoryPortHarbour(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortRegionImpl")) {
			return translateOutputDmHistoryPortRegion(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortWharfImpl")) {
			return translateOutputDmHistoryPortWharf(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryRankRatingImpl")) {
			return translateOutputDmHistoryRankRating(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryRepresentativeImpl")) {
			return translateOutputDmHistoryRepresentative(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmHistorySecurityLevelImpl")) {
			return translateOutputDmHistorySecurityLevel(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryShipAgencyImpl")) {
			return translateOutputDmHistoryShipAgency(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryShipTypeImpl")) {
			return translateOutputDmHistoryShipType(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryStateImpl")) {
			return translateOutputDmHistoryState(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryUnitGeneralImpl")) {
			return translateOutputDmHistoryUnitGeneral(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmMaritimeImpl")) {
			return translateOutputDmMaritime(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmMinistryImpl")) {
			return translateOutputDmMinistry(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmPackageImpl")) {
			return translateOutputDmPackage(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmPassportTypeImpl")) {
			return translateOutputDmPassportType(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmPortImpl")) {
			return translateOutputDmPort(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmPortHarbourImpl")) {
			return translateOutputDmPortHarbour(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmPortRegionImpl")) {
			return translateOutputDmPortRegion(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfImpl")) {
			return translateOutputDmPortWharf(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmRankRatingImpl")) {
			return translateOutputDmRankRating(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmRepresentativeImpl")) {
			return translateOutputDmRepresentative(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmSecurityLevelImpl")) {
			return translateOutputDmSecurityLevel(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmShipAgencyImpl")) {
			return translateOutputDmShipAgency(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmShipTypeImpl")) {
			return translateOutputDmShipType(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmStateImpl")) {
			return translateOutputDmState(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmSyncCategoryImpl")) {
			return translateOutputDmSyncCategory(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmTestN01RequestImpl")) {
			return translateOutputDmTestN01Request(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DmUnitGeneralImpl")) {
			return translateOutputDmUnitGeneral(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DocumentImpl")) {
			return translateOutputDocument(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.DocumentGeneralImpl")) {
			return translateOutputDocumentGeneral(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestImpl")) {
			return translateOutputHistoryInterfaceRequest(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestFieldImpl")) {
			return translateOutputHistoryInterfaceRequestField(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.HistoryRmdcShipImpl")) {
			return translateOutputHistoryRmdcShip(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.HistorySyncVersionImpl")) {
			return translateOutputHistorySyncVersion(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestImpl")) {
			return translateOutputInterfaceRequest(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestFieldImpl")) {
			return translateOutputInterfaceRequestField(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.IssueAcceptanceForTransitImpl")) {
			return translateOutputIssueAcceptanceForTransit(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.IssuePermissionForTransitImpl")) {
			return translateOutputIssuePermissionForTransit(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceImpl")) {
			return translateOutputIssuePortClearance(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderImpl")) {
			return translateOutputIssueShiftingOrder(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.LogMessageValidationImpl")) {
			return translateOutputLogMessageValidation(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.ModifyImpl")) {
			return translateOutputModify(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.NoticeShipMessageImpl")) {
			return translateOutputNoticeShipMessage(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.PassengerListImpl")) {
			return translateOutputPassengerList(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.ResponseBoImpl")) {
			return translateOutputResponseBo(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateImpl")) {
			return translateOutputResultCertificate(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.ResultCompetionImpl")) {
			return translateOutputResultCompetion(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.ResultDeclarationImpl")) {
			return translateOutputResultDeclaration(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.ResultHistoryMinistryImpl")) {
			return translateOutputResultHistoryMinistry(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.ResultMinistryImpl")) {
			return translateOutputResultMinistry(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.ResultNotificationImpl")) {
			return translateOutputResultNotification(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.RmdcShipImpl")) {
			return translateOutputRmdcShip(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempAnimalQuarantineImpl")) {
			return translateOutputTempAnimalQuarantine(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempAttachmentDeclarationHealthImpl")) {
			return translateOutputTempAttachmentDeclarationHealth(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempCargoDeclarationImpl")) {
			return translateOutputTempCargoDeclaration(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewDetailsImpl")) {
			return translateOutputTempCrewDetails(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsDeclarationImpl")) {
			return translateOutputTempCrewEffectsDeclaration(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsItemsImpl")) {
			return translateOutputTempCrewEffectsItems(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewListImpl")) {
			return translateOutputTempCrewList(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempDangerousGoodsItemsImpl")) {
			return translateOutputTempDangerousGoodsItems(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempDangerousGoodsNanifestImpl")) {
			return translateOutputTempDangerousGoodsNanifest(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineImpl")) {
			return translateOutputTempDeclarationForAnimalQuarantine(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForPlantQuarantineImpl")) {
			return translateOutputTempDeclarationForPlantQuarantine(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationOfHealthImpl")) {
			return translateOutputTempDeclarationOfHealth(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempDocumentImpl")) {
			return translateOutputTempDocument(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationImpl")) {
			return translateOutputTempGeneralDeclaration(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempGoodsItemsImpl")) {
			return translateOutputTempGoodsItems(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempHealthCrewPassengerListImpl")) {
			return translateOutputTempHealthCrewPassengerList(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempHealthQuestionImpl")) {
			return translateOutputTempHealthQuestion(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageImpl")) {
			return translateOutputTempNoTiceShipMessage(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerDetailsImpl")) {
			return translateOutputTempPassengerDetails(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerListImpl")) {
			return translateOutputTempPassengerList(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempPlantQuarantineImpl")) {
			return translateOutputTempPlantQuarantine(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityMessageImpl")) {
			return translateOutputTempShipSecurityMessage(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityPortItemsImpl")) {
			return translateOutputTempShipSecurityPortItems(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempShipStoresDeclarationImpl")) {
			return translateOutputTempShipStoresDeclaration(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempShipStoresItemsImpl")) {
			return translateOutputTempShipStoresItems(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.TempUnitGeneralImpl")) {
			return translateOutputTempUnitGeneral(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.duongbien.dao.vrcb.model.impl.UserPortImpl")) {
			return translateOutputUserPort(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchCrewListException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchCrewListException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmArrivalPurposeException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmArrivalPurposeException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmDocTypeException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmDocTypeException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmEnterriseException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmEnterriseException();
		}

		if (className.equals("vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsTypeException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsTypeException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmGTBusinessTypeException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmGTBusinessTypeException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmGTFunctionTypeException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmGTFunctionTypeException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmGtOrganizationException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmGtOrganizationException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportCategoryException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportCategoryException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportTemplateException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportTemplateException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmGtRouteConfigException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmGTShipPositionException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmGTShipPositionException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmGtStatusException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmGtStatusException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmGtVersionException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmGtVersionException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryArrivalPurposeException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryArrivalPurposeException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMaritimeException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMaritimeException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMinistryException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryMinistryException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPackageException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPassportTypeException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPassportTypeException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortRegionException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortRegionException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortWharfException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortWharfException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRankRatingException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRankRatingException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRepresentativeException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRepresentativeException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmHistorySecurityLevelException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmHistorySecurityLevelException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryStateException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryStateException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryUnitGeneralException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryUnitGeneralException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmMinistryException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmMinistryException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmPackageException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmPassportTypeException();
		}

		if (className.equals("vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmPortException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmPortRegionException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmPortRegionException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmRankRatingException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmRankRatingException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmRepresentativeException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmRepresentativeException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmSecurityLevelException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmSecurityLevelException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmShipAgencyException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmShipAgencyException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmShipTypeException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmShipTypeException();
		}

		if (className.equals("vn.dtt.duongbien.dao.vrcb.NoSuchDmStateException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmStateException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmSyncCategoryException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmSyncCategoryException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmTestN01RequestException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmTestN01RequestException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDmUnitGeneralException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDmUnitGeneralException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDocumentException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDocumentException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchDocumentGeneralException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchDocumentGeneralException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestFieldException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestFieldException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchHistorySyncVersionException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchHistorySyncVersionException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchIssueAcceptanceForTransitException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchIssueAcceptanceForTransitException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchLogMessageValidationException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchLogMessageValidationException();
		}

		if (className.equals("vn.dtt.duongbien.dao.vrcb.NoSuchModifyException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchModifyException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchNoticeShipMessageException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchNoticeShipMessageException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchPassengerListException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchPassengerListException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchResponseBoException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchResponseBoException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchResultCompetionException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchResultCompetionException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchResultMinistryException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchResultMinistryException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchResultNotificationException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchResultNotificationException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchRmdcShipException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchRmdcShipException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempAnimalQuarantineException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempAnimalQuarantineException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempAttachmentDeclarationHealthException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempAttachmentDeclarationHealthException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempCargoDeclarationException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempCargoDeclarationException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewDetailsException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewDetailsException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsDeclarationException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsDeclarationException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsItemsException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsItemsException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewListException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewListException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempDangerousGoodsItemsException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempDangerousGoodsItemsException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempDangerousGoodsNanifestException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempDangerousGoodsNanifestException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForPlantQuarantineException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForPlantQuarantineException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationOfHealthException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationOfHealthException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempGeneralDeclarationException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempGeneralDeclarationException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempGoodsItemsException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempGoodsItemsException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthCrewPassengerListException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthCrewPassengerListException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthQuestionException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthQuestionException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerListException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerListException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempPlantQuarantineException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempPlantQuarantineException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityMessageException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityMessageException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityPortItemsException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityPortItemsException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresDeclarationException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresDeclarationException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresItemsException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresItemsException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException();
		}

		if (className.equals(
					"vn.dtt.duongbien.dao.vrcb.NoSuchUserPortException")) {
			return new vn.dtt.duongbien.dao.vrcb.NoSuchUserPortException();
		}

		return throwable;
	}

	public static Object translateOutputCrewList(BaseModel<?> oldModel) {
		CrewListClp newModel = new CrewListClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCrewListRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmArrivalPurpose(BaseModel<?> oldModel) {
		DmArrivalPurposeClp newModel = new DmArrivalPurposeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmArrivalPurposeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmCertificate(BaseModel<?> oldModel) {
		DmCertificateClp newModel = new DmCertificateClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmCertificateRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmDocType(BaseModel<?> oldModel) {
		DmDocTypeClp newModel = new DmDocTypeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmDocTypeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmEnterrise(BaseModel<?> oldModel) {
		DmEnterriseClp newModel = new DmEnterriseClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmEnterriseRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmGoods(BaseModel<?> oldModel) {
		DmGoodsClp newModel = new DmGoodsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmGoodsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmGoodsType(BaseModel<?> oldModel) {
		DmGoodsTypeClp newModel = new DmGoodsTypeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmGoodsTypeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmGTBusinessType(BaseModel<?> oldModel) {
		DmGTBusinessTypeClp newModel = new DmGTBusinessTypeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmGTBusinessTypeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmGTFunctionType(BaseModel<?> oldModel) {
		DmGTFunctionTypeClp newModel = new DmGTFunctionTypeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmGTFunctionTypeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmGtOrganization(BaseModel<?> oldModel) {
		DmGtOrganizationClp newModel = new DmGtOrganizationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmGtOrganizationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmGtReportCategory(
		BaseModel<?> oldModel) {
		DmGtReportCategoryClp newModel = new DmGtReportCategoryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmGtReportCategoryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmGtReportTemplate(
		BaseModel<?> oldModel) {
		DmGtReportTemplateClp newModel = new DmGtReportTemplateClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmGtReportTemplateRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmGtRouteConfig(BaseModel<?> oldModel) {
		DmGtRouteConfigClp newModel = new DmGtRouteConfigClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmGtRouteConfigRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmGTShipPosition(BaseModel<?> oldModel) {
		DmGTShipPositionClp newModel = new DmGTShipPositionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmGTShipPositionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmGtStatus(BaseModel<?> oldModel) {
		DmGtStatusClp newModel = new DmGtStatusClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmGtStatusRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmGtVersion(BaseModel<?> oldModel) {
		DmGtVersionClp newModel = new DmGtVersionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmGtVersionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmHistoryArrivalPurpose(
		BaseModel<?> oldModel) {
		DmHistoryArrivalPurposeClp newModel = new DmHistoryArrivalPurposeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmHistoryArrivalPurposeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmHistoryDocType(BaseModel<?> oldModel) {
		DmHistoryDocTypeClp newModel = new DmHistoryDocTypeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmHistoryDocTypeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmHistoryEnterrise(
		BaseModel<?> oldModel) {
		DmHistoryEnterriseClp newModel = new DmHistoryEnterriseClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmHistoryEnterriseRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmHistoryGoods(BaseModel<?> oldModel) {
		DmHistoryGoodsClp newModel = new DmHistoryGoodsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmHistoryGoodsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmHistoryGoodsType(
		BaseModel<?> oldModel) {
		DmHistoryGoodsTypeClp newModel = new DmHistoryGoodsTypeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmHistoryGoodsTypeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmHistoryMaritime(BaseModel<?> oldModel) {
		DmHistoryMaritimeClp newModel = new DmHistoryMaritimeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmHistoryMaritimeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmHistoryMinistry(BaseModel<?> oldModel) {
		DmHistoryMinistryClp newModel = new DmHistoryMinistryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmHistoryMinistryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmHistoryPackage(BaseModel<?> oldModel) {
		DmHistoryPackageClp newModel = new DmHistoryPackageClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmHistoryPackageRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmHistoryPassportType(
		BaseModel<?> oldModel) {
		DmHistoryPassportTypeClp newModel = new DmHistoryPassportTypeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmHistoryPassportTypeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmHistoryPort(BaseModel<?> oldModel) {
		DmHistoryPortClp newModel = new DmHistoryPortClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmHistoryPortRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmHistoryPortHarbour(
		BaseModel<?> oldModel) {
		DmHistoryPortHarbourClp newModel = new DmHistoryPortHarbourClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmHistoryPortHarbourRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmHistoryPortRegion(
		BaseModel<?> oldModel) {
		DmHistoryPortRegionClp newModel = new DmHistoryPortRegionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmHistoryPortRegionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmHistoryPortWharf(
		BaseModel<?> oldModel) {
		DmHistoryPortWharfClp newModel = new DmHistoryPortWharfClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmHistoryPortWharfRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmHistoryRankRating(
		BaseModel<?> oldModel) {
		DmHistoryRankRatingClp newModel = new DmHistoryRankRatingClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmHistoryRankRatingRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmHistoryRepresentative(
		BaseModel<?> oldModel) {
		DmHistoryRepresentativeClp newModel = new DmHistoryRepresentativeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmHistoryRepresentativeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmHistorySecurityLevel(
		BaseModel<?> oldModel) {
		DmHistorySecurityLevelClp newModel = new DmHistorySecurityLevelClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmHistorySecurityLevelRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmHistoryShipAgency(
		BaseModel<?> oldModel) {
		DmHistoryShipAgencyClp newModel = new DmHistoryShipAgencyClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmHistoryShipAgencyRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmHistoryShipType(BaseModel<?> oldModel) {
		DmHistoryShipTypeClp newModel = new DmHistoryShipTypeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmHistoryShipTypeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmHistoryState(BaseModel<?> oldModel) {
		DmHistoryStateClp newModel = new DmHistoryStateClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmHistoryStateRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmHistoryUnitGeneral(
		BaseModel<?> oldModel) {
		DmHistoryUnitGeneralClp newModel = new DmHistoryUnitGeneralClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmHistoryUnitGeneralRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmMaritime(BaseModel<?> oldModel) {
		DmMaritimeClp newModel = new DmMaritimeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmMaritimeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmMinistry(BaseModel<?> oldModel) {
		DmMinistryClp newModel = new DmMinistryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmMinistryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmPackage(BaseModel<?> oldModel) {
		DmPackageClp newModel = new DmPackageClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmPackageRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmPassportType(BaseModel<?> oldModel) {
		DmPassportTypeClp newModel = new DmPassportTypeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmPassportTypeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmPort(BaseModel<?> oldModel) {
		DmPortClp newModel = new DmPortClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmPortRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmPortHarbour(BaseModel<?> oldModel) {
		DmPortHarbourClp newModel = new DmPortHarbourClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmPortHarbourRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmPortRegion(BaseModel<?> oldModel) {
		DmPortRegionClp newModel = new DmPortRegionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmPortRegionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmPortWharf(BaseModel<?> oldModel) {
		DmPortWharfClp newModel = new DmPortWharfClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmPortWharfRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmRankRating(BaseModel<?> oldModel) {
		DmRankRatingClp newModel = new DmRankRatingClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmRankRatingRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmRepresentative(BaseModel<?> oldModel) {
		DmRepresentativeClp newModel = new DmRepresentativeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmRepresentativeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmSecurityLevel(BaseModel<?> oldModel) {
		DmSecurityLevelClp newModel = new DmSecurityLevelClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmSecurityLevelRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmShipAgency(BaseModel<?> oldModel) {
		DmShipAgencyClp newModel = new DmShipAgencyClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmShipAgencyRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmShipType(BaseModel<?> oldModel) {
		DmShipTypeClp newModel = new DmShipTypeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmShipTypeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmState(BaseModel<?> oldModel) {
		DmStateClp newModel = new DmStateClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmStateRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmSyncCategory(BaseModel<?> oldModel) {
		DmSyncCategoryClp newModel = new DmSyncCategoryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmSyncCategoryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmTestN01Request(BaseModel<?> oldModel) {
		DmTestN01RequestClp newModel = new DmTestN01RequestClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmTestN01RequestRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmUnitGeneral(BaseModel<?> oldModel) {
		DmUnitGeneralClp newModel = new DmUnitGeneralClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmUnitGeneralRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDocument(BaseModel<?> oldModel) {
		DocumentClp newModel = new DocumentClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDocumentRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDocumentGeneral(BaseModel<?> oldModel) {
		DocumentGeneralClp newModel = new DocumentGeneralClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDocumentGeneralRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputHistoryInterfaceRequest(
		BaseModel<?> oldModel) {
		HistoryInterfaceRequestClp newModel = new HistoryInterfaceRequestClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setHistoryInterfaceRequestRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputHistoryInterfaceRequestField(
		BaseModel<?> oldModel) {
		HistoryInterfaceRequestFieldClp newModel = new HistoryInterfaceRequestFieldClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setHistoryInterfaceRequestFieldRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputHistoryRmdcShip(BaseModel<?> oldModel) {
		HistoryRmdcShipClp newModel = new HistoryRmdcShipClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setHistoryRmdcShipRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputHistorySyncVersion(
		BaseModel<?> oldModel) {
		HistorySyncVersionClp newModel = new HistorySyncVersionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setHistorySyncVersionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputInterfaceRequest(BaseModel<?> oldModel) {
		InterfaceRequestClp newModel = new InterfaceRequestClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setInterfaceRequestRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputInterfaceRequestField(
		BaseModel<?> oldModel) {
		InterfaceRequestFieldClp newModel = new InterfaceRequestFieldClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setInterfaceRequestFieldRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputIssueAcceptanceForTransit(
		BaseModel<?> oldModel) {
		IssueAcceptanceForTransitClp newModel = new IssueAcceptanceForTransitClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setIssueAcceptanceForTransitRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputIssuePermissionForTransit(
		BaseModel<?> oldModel) {
		IssuePermissionForTransitClp newModel = new IssuePermissionForTransitClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setIssuePermissionForTransitRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputIssuePortClearance(
		BaseModel<?> oldModel) {
		IssuePortClearanceClp newModel = new IssuePortClearanceClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setIssuePortClearanceRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputIssueShiftingOrder(
		BaseModel<?> oldModel) {
		IssueShiftingOrderClp newModel = new IssueShiftingOrderClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setIssueShiftingOrderRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputLogMessageValidation(
		BaseModel<?> oldModel) {
		LogMessageValidationClp newModel = new LogMessageValidationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLogMessageValidationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputModify(BaseModel<?> oldModel) {
		ModifyClp newModel = new ModifyClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setModifyRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputNoticeShipMessage(BaseModel<?> oldModel) {
		NoticeShipMessageClp newModel = new NoticeShipMessageClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setNoticeShipMessageRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPassengerList(BaseModel<?> oldModel) {
		PassengerListClp newModel = new PassengerListClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPassengerListRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputResponseBo(BaseModel<?> oldModel) {
		ResponseBoClp newModel = new ResponseBoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setResponseBoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputResultCertificate(BaseModel<?> oldModel) {
		ResultCertificateClp newModel = new ResultCertificateClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setResultCertificateRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputResultCompetion(BaseModel<?> oldModel) {
		ResultCompetionClp newModel = new ResultCompetionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setResultCompetionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputResultDeclaration(BaseModel<?> oldModel) {
		ResultDeclarationClp newModel = new ResultDeclarationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setResultDeclarationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputResultHistoryMinistry(
		BaseModel<?> oldModel) {
		ResultHistoryMinistryClp newModel = new ResultHistoryMinistryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setResultHistoryMinistryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputResultMinistry(BaseModel<?> oldModel) {
		ResultMinistryClp newModel = new ResultMinistryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setResultMinistryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputResultNotification(
		BaseModel<?> oldModel) {
		ResultNotificationClp newModel = new ResultNotificationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setResultNotificationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputRmdcShip(BaseModel<?> oldModel) {
		RmdcShipClp newModel = new RmdcShipClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setRmdcShipRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempAnimalQuarantine(
		BaseModel<?> oldModel) {
		TempAnimalQuarantineClp newModel = new TempAnimalQuarantineClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempAnimalQuarantineRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempAttachmentDeclarationHealth(
		BaseModel<?> oldModel) {
		TempAttachmentDeclarationHealthClp newModel = new TempAttachmentDeclarationHealthClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempAttachmentDeclarationHealthRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempCargoDeclaration(
		BaseModel<?> oldModel) {
		TempCargoDeclarationClp newModel = new TempCargoDeclarationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempCargoDeclarationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempCrewDetails(BaseModel<?> oldModel) {
		TempCrewDetailsClp newModel = new TempCrewDetailsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempCrewDetailsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempCrewEffectsDeclaration(
		BaseModel<?> oldModel) {
		TempCrewEffectsDeclarationClp newModel = new TempCrewEffectsDeclarationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempCrewEffectsDeclarationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempCrewEffectsItems(
		BaseModel<?> oldModel) {
		TempCrewEffectsItemsClp newModel = new TempCrewEffectsItemsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempCrewEffectsItemsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempCrewList(BaseModel<?> oldModel) {
		TempCrewListClp newModel = new TempCrewListClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempCrewListRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempDangerousGoodsItems(
		BaseModel<?> oldModel) {
		TempDangerousGoodsItemsClp newModel = new TempDangerousGoodsItemsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempDangerousGoodsItemsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempDangerousGoodsNanifest(
		BaseModel<?> oldModel) {
		TempDangerousGoodsNanifestClp newModel = new TempDangerousGoodsNanifestClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempDangerousGoodsNanifestRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempDeclarationForAnimalQuarantine(
		BaseModel<?> oldModel) {
		TempDeclarationForAnimalQuarantineClp newModel = new TempDeclarationForAnimalQuarantineClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempDeclarationForAnimalQuarantineRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempDeclarationForPlantQuarantine(
		BaseModel<?> oldModel) {
		TempDeclarationForPlantQuarantineClp newModel = new TempDeclarationForPlantQuarantineClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempDeclarationForPlantQuarantineRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempDeclarationOfHealth(
		BaseModel<?> oldModel) {
		TempDeclarationOfHealthClp newModel = new TempDeclarationOfHealthClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempDeclarationOfHealthRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempDocument(BaseModel<?> oldModel) {
		TempDocumentClp newModel = new TempDocumentClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempDocumentRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempGeneralDeclaration(
		BaseModel<?> oldModel) {
		TempGeneralDeclarationClp newModel = new TempGeneralDeclarationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempGeneralDeclarationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempGoodsItems(BaseModel<?> oldModel) {
		TempGoodsItemsClp newModel = new TempGoodsItemsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempGoodsItemsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempHealthCrewPassengerList(
		BaseModel<?> oldModel) {
		TempHealthCrewPassengerListClp newModel = new TempHealthCrewPassengerListClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempHealthCrewPassengerListRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempHealthQuestion(
		BaseModel<?> oldModel) {
		TempHealthQuestionClp newModel = new TempHealthQuestionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempHealthQuestionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempNoTiceShipMessage(
		BaseModel<?> oldModel) {
		TempNoTiceShipMessageClp newModel = new TempNoTiceShipMessageClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempNoTiceShipMessageRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempPassengerDetails(
		BaseModel<?> oldModel) {
		TempPassengerDetailsClp newModel = new TempPassengerDetailsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempPassengerDetailsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempPassengerList(BaseModel<?> oldModel) {
		TempPassengerListClp newModel = new TempPassengerListClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempPassengerListRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempPlantQuarantine(
		BaseModel<?> oldModel) {
		TempPlantQuarantineClp newModel = new TempPlantQuarantineClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempPlantQuarantineRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempShipSecurityMessage(
		BaseModel<?> oldModel) {
		TempShipSecurityMessageClp newModel = new TempShipSecurityMessageClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempShipSecurityMessageRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempShipSecurityPortItems(
		BaseModel<?> oldModel) {
		TempShipSecurityPortItemsClp newModel = new TempShipSecurityPortItemsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempShipSecurityPortItemsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempShipStoresDeclaration(
		BaseModel<?> oldModel) {
		TempShipStoresDeclarationClp newModel = new TempShipStoresDeclarationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempShipStoresDeclarationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempShipStoresItems(
		BaseModel<?> oldModel) {
		TempShipStoresItemsClp newModel = new TempShipStoresItemsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempShipStoresItemsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTempUnitGeneral(BaseModel<?> oldModel) {
		TempUnitGeneralClp newModel = new TempUnitGeneralClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTempUnitGeneralRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputUserPort(BaseModel<?> oldModel) {
		UserPortClp newModel = new UserPortClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setUserPortRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}