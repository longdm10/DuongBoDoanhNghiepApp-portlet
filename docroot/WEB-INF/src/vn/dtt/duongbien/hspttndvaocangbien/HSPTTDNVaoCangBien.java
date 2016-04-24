package vn.dtt.duongbien.hspttndvaocangbien;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;

import vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails;
import vn.dtt.duongbien.dao.vrcb.model.TempCrewList;
import vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration;
import vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails;
import vn.dtt.duongbien.dao.vrcb.model.TempPassengerList;
import vn.dtt.duongbien.dao.vrcb.service.DmPortRegionLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempAnimalQuarantineLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempCrewDetailsLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempCrewListLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempPassengerDetailsLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempPassengerListLocalServiceUtil;
import vn.dtt.duongbien.qlhsphuongtientndvaoracangbien.QLHSPhuongTienTNDVaoRaCangBien;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class HSPTTDNVaoCangBien
 */
public class HSPTTDNVaoCangBien extends MVCPortlet {
 

	private Log _log = LogFactoryUtil.getLog(HSPTTDNVaoCangBien.class);
	
	public void changeMenu(ActionRequest resourceRequest, ActionResponse httpReq) {

		try {
			String menuid = ParamUtil.getString(resourceRequest, "menuid");

			PortletPreferences resourcePrefs = PortletPreferencesFactoryUtil.getPortletSetup(resourceRequest);
			resourcePrefs.setValue("menuid", menuid);

		} catch (Exception es) {
			es.printStackTrace();
		}
		
		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void addVaoCangBen(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		try {
			Long id = ParamUtil.getLong(actionRequest, "ids");
			String nameOfShip = ParamUtil.getString(actionRequest, "nameOfShip");
			String nameOfMaster = ParamUtil.getString(actionRequest, "nameOfMaster");
			String portRegionCode = ParamUtil.getString(actionRequest, "portRegionCode");
			String portOfArrivalCode = ParamUtil.getString(actionRequest, "portOfArrivalCode");
			String portHarbourCode = ParamUtil.getString(actionRequest, "portHarbourCode");
			String portWharfCode = ParamUtil.getString(actionRequest, "portWharfCode");
			
			int isArrival = ParamUtil.getInteger(actionRequest, "isArrival");
			String voyageNumber = ParamUtil.getString(actionRequest, "voyageNumber");
			int numberOfCrew = ParamUtil.getInteger(actionRequest, "numberOfCrew");
			int numberOfPassengers = ParamUtil.getInteger(actionRequest, "numberOfPassengers");
			String lastPortOfCallCode = ParamUtil.getString(actionRequest, "lastPortOfCallCode");
			Date dateOfArrival = ParamUtil.getDate(actionRequest, "dateOfArrival", new SimpleDateFormat("dd/MM/yyyy"));
			String taxCodeOfShipownersAgents = ParamUtil.getString(actionRequest, "taxCodeOfShipownersAgents");
			String nameOfShipownersAgents = ParamUtil.getString(actionRequest, "nameOfShipownersAgents");
			String shipAgencyAddress = ParamUtil.getString(actionRequest, "shipAgencyAddress");
			String shipAgencyPhone = ParamUtil.getString(actionRequest, "shipAgencyPhone");
			String shipAgencyFax = ParamUtil.getString(actionRequest, "shipAgencyFax");
			String shipAgencyEmail = ParamUtil.getString(actionRequest, "shipAgencyEmail");
			Date signDate = new Date();
			if(id<=0){	
				TempGeneralDeclarationLocalServiceUtil.addTemGeneralDeclaration(nameOfShip, nameOfMaster, portRegionCode, portOfArrivalCode, portHarbourCode, portWharfCode, isArrival, voyageNumber, numberOfCrew, numberOfPassengers, lastPortOfCallCode, dateOfArrival, taxCodeOfShipownersAgents, nameOfShipownersAgents, shipAgencyAddress, shipAgencyPhone, shipAgencyFax, shipAgencyEmail, signDate );
			}else{
				TempGeneralDeclarationLocalServiceUtil.updateTemGeneralDeclaration(id,nameOfShip, nameOfMaster, portRegionCode, portOfArrivalCode, portHarbourCode, portWharfCode, isArrival, voyageNumber, numberOfCrew, numberOfPassengers, lastPortOfCallCode, dateOfArrival, taxCodeOfShipownersAgents, nameOfShipownersAgents, shipAgencyAddress, shipAgencyPhone, shipAgencyFax, shipAgencyEmail, signDate );
			}
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (NoSuchModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteVaoCangBien(ActionRequest actionRequest, ActionResponse actionResponse) {
		try {
			String id = ParamUtil.getString(actionRequest, "id");
			TempGeneralDeclarationLocalServiceUtil.deleteTempGeneralDeclaration(Long.valueOf(id));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateGeneralDoc(ActionRequest actionRequest, ActionResponse actionResponse) {
		try {
			long id = ParamUtil.getLong(actionRequest, "id");
			String redirect = ParamUtil.getString(actionRequest, "redirect");
			if(id>0){
				String briefDescriptionOfTheCargo = ParamUtil.getString(actionRequest, "briefDescriptionOfTheCargo");
				double grossTonnage = ParamUtil.getDouble(actionRequest, "grossTonnage");
				TempGeneralDeclarationLocalServiceUtil.updateTempGeneral(id, briefDescriptionOfTheCargo, grossTonnage);
				actionResponse.sendRedirect(redirect);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateAttachfile(ActionRequest actionRequest, ActionResponse actionResponse) {
	}

	public void updateCrew(ActionRequest actionRequest, ActionResponse actionResponse) {
		try {
			long id = ParamUtil.getLong(actionRequest, "id");
			String redirect = ParamUtil.getString(actionRequest, "redirect");
			String currentUrl = ParamUtil.getString(actionRequest, "currentUrl");
			if(id>0){
				String familyName = ParamUtil.getString(actionRequest, "familyName");
				String givenName = ParamUtil.getString(actionRequest, "givenName");
				String rankCode = ParamUtil.getString(actionRequest, "rankCode");
				TempGeneralDeclaration tempGD = TempGeneralDeclarationLocalServiceUtil.fetchTempGeneralDeclaration(id);
				TempCrewList tempCL = TempCrewListLocalServiceUtil.addTemCrewList(tempGD.getDocumentName(), tempGD.getDocumentYear(), tempGD.getUserCreated(), tempGD.getIsArrival(), tempGD.getNameOfShip(), tempGD.getImoNumber(), tempGD.getVoyageNumber(), tempGD.getPortOfArrivalCode(), tempGD.getDateOfArrival(), tempGD.getLastPortOfCallCode());
				TempCrewDetails tempCD = TempCrewDetailsLocalServiceUtil.addTempCrewDetails(null, familyName, givenName, rankCode);
				actionResponse.sendRedirect(currentUrl);
			}else{
				actionResponse.sendRedirect(redirect);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updatePassengers(ActionRequest actionRequest, ActionResponse actionResponse) {
		try {
			Long id = ParamUtil.getLong(actionRequest, "id");
			String redirect = ParamUtil.getString(actionRequest, "redirect");
			String currentUrl = ParamUtil.getString(actionRequest, "currentUrl");
			if(id>0){
				String familyName = ParamUtil.getString(actionRequest, "familyName");
				String givenName = ParamUtil.getString(actionRequest, "givenName");
				Date birthDay = ParamUtil.getDate(actionRequest, "birthDay", new SimpleDateFormat("dd/MM/yyyy"));
				String birthPlace = ParamUtil.getString(actionRequest, "birthPlace");;
				String serialNumberOfIdentity = ParamUtil.getString(actionRequest, "serialNumberOfIdentity");;
				TempGeneralDeclaration tempGD = TempGeneralDeclarationLocalServiceUtil.fetchTempGeneralDeclaration(id);
				TempPassengerList tempPL =  TempPassengerListLocalServiceUtil.addTempPassengerList(tempGD.getDocumentName(), tempGD.getDocumentYear(), tempGD.getUserCreated(), tempGD.getIsArrival(), tempGD.getNameOfShip(), tempGD.getPortOfArrivalCode(), tempGD.getDateOfArrival(), tempGD.getImoNumber(), tempGD.getVoyageNumber());
				TempPassengerDetails tempPD = TempPassengerDetailsLocalServiceUtil.addTempPassengerDetails(null, familyName, givenName,birthDay,birthPlace,serialNumberOfIdentity);
				actionResponse.sendRedirect(currentUrl);
			}else{
				actionResponse.sendRedirect(redirect);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateRemarks(ActionRequest actionRequest, ActionResponse actionResponse) {
		try {
			long id = ParamUtil.getLong(actionRequest, "id");
			String redirect = ParamUtil.getString(actionRequest, "redirect");
			String currentUrl = ParamUtil.getString(actionRequest, "currentUrl");
			String remarks = ParamUtil.getString(actionRequest, "remarks");
			if(id>0){
				TempGeneralDeclarationLocalServiceUtil.updateRemarks(id, remarks);
				actionResponse.sendRedirect(currentUrl);
			}else{
				actionResponse.sendRedirect(redirect);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
