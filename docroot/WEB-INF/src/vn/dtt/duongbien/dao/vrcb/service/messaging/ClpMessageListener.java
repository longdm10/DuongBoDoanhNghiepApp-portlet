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

package vn.dtt.duongbien.dao.vrcb.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import vn.dtt.duongbien.dao.vrcb.service.ClpSerializer;
import vn.dtt.duongbien.dao.vrcb.service.CrewListLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.CrewListServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmArrivalPurposeLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmCertificateLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmCertificateServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmDocTypeLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmEnterriseLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmGTBusinessTypeLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmGTBusinessTypeServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmGTFunctionTypeLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmGTFunctionTypeServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmGTShipPositionLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmGTShipPositionServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmGoodsLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmGoodsTypeLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmGtOrganizationLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmGtOrganizationServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmGtReportCategoryLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmGtReportCategoryServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmGtReportTemplateLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmGtReportTemplateServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmGtRouteConfigLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmGtRouteConfigServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmGtStatusLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmGtStatusServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmGtVersionLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryArrivalPurposeLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryDocTypeLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryEnterriseLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryGoodsLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryGoodsTypeLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryMaritimeLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryMinistryLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryMinistryServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryPackageLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryPassportTypeLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortHarbourLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortRegionLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortWharfLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryRankRatingLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryRepresentativeLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmHistorySecurityLevelLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryShipAgencyLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryShipTypeLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryStateLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryUnitGeneralLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmMaritimeLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmMinistryLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmMinistryServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmPackageLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmPassportTypeLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmPortHarbourLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmPortLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmPortRegionLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmPortWharfLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmRankRatingLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmRepresentativeLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmSecurityLevelLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmShipAgencyLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmShipTypeLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmStateLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmSyncCategoryLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmTestN01RequestLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DmUnitGeneralLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DocumentGeneralLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DocumentGeneralServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DocumentLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.DocumentServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.HistoryInterfaceRequestFieldLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.HistoryInterfaceRequestFieldServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.HistoryInterfaceRequestLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.HistoryInterfaceRequestServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.HistoryRmdcShipLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.HistoryRmdcShipServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.HistorySyncVersionLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestFieldLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestFieldServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.IssueAcceptanceForTransitLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.IssueAcceptanceForTransitServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.IssuePermissionForTransitLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.IssuePermissionForTransitServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.IssuePortClearanceLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.IssuePortClearanceServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.IssueShiftingOrderLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.IssueShiftingOrderServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.LogMessageValidationLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.LogMessageValidationServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.ModifyLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.ModifyServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.NoticeShipMessageLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.NoticeShipMessageServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.PassengerListLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.PassengerListServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.ResponseBoLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.ResponseBoServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.ResultCertificateLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.ResultCertificateServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.ResultCompetionLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.ResultCompetionServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.ResultDeclarationLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.ResultDeclarationServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.ResultHistoryMinistryLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.ResultHistoryMinistryServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.ResultMinistryLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.ResultMinistryServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.ResultNotificationLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.ResultNotificationServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.RmdcShipLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.RmdcShipServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempAnimalQuarantineLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempAnimalQuarantineServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempAttachmentDeclarationHealthLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempAttachmentDeclarationHealthServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempCargoDeclarationLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempCargoDeclarationServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempCrewDetailsLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempCrewDetailsServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempCrewEffectsDeclarationLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempCrewEffectsDeclarationServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempCrewEffectsItemsLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempCrewEffectsItemsServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempCrewListLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempCrewListServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsItemsLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsItemsServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsNanifestLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsNanifestServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForAnimalQuarantineLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForAnimalQuarantineServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForPlantQuarantineLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForPlantQuarantineServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempDeclarationOfHealthLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempDeclarationOfHealthServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempDocumentLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempDocumentServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempGoodsItemsLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempGoodsItemsServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempHealthCrewPassengerListLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempHealthCrewPassengerListServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempHealthQuestionLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempHealthQuestionServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempNoTiceShipMessageLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempNoTiceShipMessageServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempPassengerDetailsLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempPassengerDetailsServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempPassengerListLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempPassengerListServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempPlantQuarantineLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempPlantQuarantineServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityMessageLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityMessageServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityPortItemsLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityPortItemsServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempShipStoresDeclarationLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempShipStoresDeclarationServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempShipStoresItemsLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempShipStoresItemsServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempUnitGeneralLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempUnitGeneralServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.UserPortLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.UserPortServiceUtil;

/**
 * @author longdm
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			CrewListLocalServiceUtil.clearService();

			CrewListServiceUtil.clearService();
			DmArrivalPurposeLocalServiceUtil.clearService();

			DmCertificateLocalServiceUtil.clearService();

			DmCertificateServiceUtil.clearService();
			DmDocTypeLocalServiceUtil.clearService();

			DmEnterriseLocalServiceUtil.clearService();

			DmGoodsLocalServiceUtil.clearService();

			DmGoodsTypeLocalServiceUtil.clearService();

			DmGTBusinessTypeLocalServiceUtil.clearService();

			DmGTBusinessTypeServiceUtil.clearService();
			DmGTFunctionTypeLocalServiceUtil.clearService();

			DmGTFunctionTypeServiceUtil.clearService();
			DmGtOrganizationLocalServiceUtil.clearService();

			DmGtOrganizationServiceUtil.clearService();
			DmGtReportCategoryLocalServiceUtil.clearService();

			DmGtReportCategoryServiceUtil.clearService();
			DmGtReportTemplateLocalServiceUtil.clearService();

			DmGtReportTemplateServiceUtil.clearService();
			DmGtRouteConfigLocalServiceUtil.clearService();

			DmGtRouteConfigServiceUtil.clearService();
			DmGTShipPositionLocalServiceUtil.clearService();

			DmGTShipPositionServiceUtil.clearService();
			DmGtStatusLocalServiceUtil.clearService();

			DmGtStatusServiceUtil.clearService();
			DmGtVersionLocalServiceUtil.clearService();

			DmHistoryArrivalPurposeLocalServiceUtil.clearService();

			DmHistoryDocTypeLocalServiceUtil.clearService();

			DmHistoryEnterriseLocalServiceUtil.clearService();

			DmHistoryGoodsLocalServiceUtil.clearService();

			DmHistoryGoodsTypeLocalServiceUtil.clearService();

			DmHistoryMaritimeLocalServiceUtil.clearService();

			DmHistoryMinistryLocalServiceUtil.clearService();

			DmHistoryMinistryServiceUtil.clearService();
			DmHistoryPackageLocalServiceUtil.clearService();

			DmHistoryPassportTypeLocalServiceUtil.clearService();

			DmHistoryPortLocalServiceUtil.clearService();

			DmHistoryPortHarbourLocalServiceUtil.clearService();

			DmHistoryPortRegionLocalServiceUtil.clearService();

			DmHistoryPortWharfLocalServiceUtil.clearService();

			DmHistoryRankRatingLocalServiceUtil.clearService();

			DmHistoryRepresentativeLocalServiceUtil.clearService();

			DmHistorySecurityLevelLocalServiceUtil.clearService();

			DmHistoryShipAgencyLocalServiceUtil.clearService();

			DmHistoryShipTypeLocalServiceUtil.clearService();

			DmHistoryStateLocalServiceUtil.clearService();

			DmHistoryUnitGeneralLocalServiceUtil.clearService();

			DmMaritimeLocalServiceUtil.clearService();

			DmMinistryLocalServiceUtil.clearService();

			DmMinistryServiceUtil.clearService();
			DmPackageLocalServiceUtil.clearService();

			DmPassportTypeLocalServiceUtil.clearService();

			DmPortLocalServiceUtil.clearService();

			DmPortHarbourLocalServiceUtil.clearService();

			DmPortRegionLocalServiceUtil.clearService();

			DmPortWharfLocalServiceUtil.clearService();

			DmRankRatingLocalServiceUtil.clearService();

			DmRepresentativeLocalServiceUtil.clearService();

			DmSecurityLevelLocalServiceUtil.clearService();

			DmShipAgencyLocalServiceUtil.clearService();

			DmShipTypeLocalServiceUtil.clearService();

			DmStateLocalServiceUtil.clearService();

			DmSyncCategoryLocalServiceUtil.clearService();

			DmTestN01RequestLocalServiceUtil.clearService();

			DmUnitGeneralLocalServiceUtil.clearService();

			DocumentLocalServiceUtil.clearService();

			DocumentServiceUtil.clearService();
			DocumentGeneralLocalServiceUtil.clearService();

			DocumentGeneralServiceUtil.clearService();
			HistoryInterfaceRequestLocalServiceUtil.clearService();

			HistoryInterfaceRequestServiceUtil.clearService();
			HistoryInterfaceRequestFieldLocalServiceUtil.clearService();

			HistoryInterfaceRequestFieldServiceUtil.clearService();
			HistoryRmdcShipLocalServiceUtil.clearService();

			HistoryRmdcShipServiceUtil.clearService();
			HistorySyncVersionLocalServiceUtil.clearService();

			InterfaceRequestLocalServiceUtil.clearService();

			InterfaceRequestServiceUtil.clearService();
			InterfaceRequestFieldLocalServiceUtil.clearService();

			InterfaceRequestFieldServiceUtil.clearService();
			IssueAcceptanceForTransitLocalServiceUtil.clearService();

			IssueAcceptanceForTransitServiceUtil.clearService();
			IssuePermissionForTransitLocalServiceUtil.clearService();

			IssuePermissionForTransitServiceUtil.clearService();
			IssuePortClearanceLocalServiceUtil.clearService();

			IssuePortClearanceServiceUtil.clearService();
			IssueShiftingOrderLocalServiceUtil.clearService();

			IssueShiftingOrderServiceUtil.clearService();
			LogMessageValidationLocalServiceUtil.clearService();

			LogMessageValidationServiceUtil.clearService();
			ModifyLocalServiceUtil.clearService();

			ModifyServiceUtil.clearService();
			NoticeShipMessageLocalServiceUtil.clearService();

			NoticeShipMessageServiceUtil.clearService();
			PassengerListLocalServiceUtil.clearService();

			PassengerListServiceUtil.clearService();
			ResponseBoLocalServiceUtil.clearService();

			ResponseBoServiceUtil.clearService();
			ResultCertificateLocalServiceUtil.clearService();

			ResultCertificateServiceUtil.clearService();
			ResultCompetionLocalServiceUtil.clearService();

			ResultCompetionServiceUtil.clearService();
			ResultDeclarationLocalServiceUtil.clearService();

			ResultDeclarationServiceUtil.clearService();
			ResultHistoryMinistryLocalServiceUtil.clearService();

			ResultHistoryMinistryServiceUtil.clearService();
			ResultMinistryLocalServiceUtil.clearService();

			ResultMinistryServiceUtil.clearService();
			ResultNotificationLocalServiceUtil.clearService();

			ResultNotificationServiceUtil.clearService();
			RmdcShipLocalServiceUtil.clearService();

			RmdcShipServiceUtil.clearService();
			TempAnimalQuarantineLocalServiceUtil.clearService();

			TempAnimalQuarantineServiceUtil.clearService();
			TempAttachmentDeclarationHealthLocalServiceUtil.clearService();

			TempAttachmentDeclarationHealthServiceUtil.clearService();
			TempCargoDeclarationLocalServiceUtil.clearService();

			TempCargoDeclarationServiceUtil.clearService();
			TempCrewDetailsLocalServiceUtil.clearService();

			TempCrewDetailsServiceUtil.clearService();
			TempCrewEffectsDeclarationLocalServiceUtil.clearService();

			TempCrewEffectsDeclarationServiceUtil.clearService();
			TempCrewEffectsItemsLocalServiceUtil.clearService();

			TempCrewEffectsItemsServiceUtil.clearService();
			TempCrewListLocalServiceUtil.clearService();

			TempCrewListServiceUtil.clearService();
			TempDangerousGoodsItemsLocalServiceUtil.clearService();

			TempDangerousGoodsItemsServiceUtil.clearService();
			TempDangerousGoodsNanifestLocalServiceUtil.clearService();

			TempDangerousGoodsNanifestServiceUtil.clearService();
			TempDeclarationForAnimalQuarantineLocalServiceUtil.clearService();

			TempDeclarationForAnimalQuarantineServiceUtil.clearService();
			TempDeclarationForPlantQuarantineLocalServiceUtil.clearService();

			TempDeclarationForPlantQuarantineServiceUtil.clearService();
			TempDeclarationOfHealthLocalServiceUtil.clearService();

			TempDeclarationOfHealthServiceUtil.clearService();
			TempDocumentLocalServiceUtil.clearService();

			TempDocumentServiceUtil.clearService();
			TempGeneralDeclarationLocalServiceUtil.clearService();

			TempGeneralDeclarationServiceUtil.clearService();
			TempGoodsItemsLocalServiceUtil.clearService();

			TempGoodsItemsServiceUtil.clearService();
			TempHealthCrewPassengerListLocalServiceUtil.clearService();

			TempHealthCrewPassengerListServiceUtil.clearService();
			TempHealthQuestionLocalServiceUtil.clearService();

			TempHealthQuestionServiceUtil.clearService();
			TempNoTiceShipMessageLocalServiceUtil.clearService();

			TempNoTiceShipMessageServiceUtil.clearService();
			TempPassengerDetailsLocalServiceUtil.clearService();

			TempPassengerDetailsServiceUtil.clearService();
			TempPassengerListLocalServiceUtil.clearService();

			TempPassengerListServiceUtil.clearService();
			TempPlantQuarantineLocalServiceUtil.clearService();

			TempPlantQuarantineServiceUtil.clearService();
			TempShipSecurityMessageLocalServiceUtil.clearService();

			TempShipSecurityMessageServiceUtil.clearService();
			TempShipSecurityPortItemsLocalServiceUtil.clearService();

			TempShipSecurityPortItemsServiceUtil.clearService();
			TempShipStoresDeclarationLocalServiceUtil.clearService();

			TempShipStoresDeclarationServiceUtil.clearService();
			TempShipStoresItemsLocalServiceUtil.clearService();

			TempShipStoresItemsServiceUtil.clearService();
			TempUnitGeneralLocalServiceUtil.clearService();

			TempUnitGeneralServiceUtil.clearService();
			UserPortLocalServiceUtil.clearService();

			UserPortServiceUtil.clearService();
		}
	}
}