package vn.dtt.duongbien.hspttndvaocangbien;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;

import vn.dtt.duongbien.dao.vrcb.service.DmPortRegionLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempAnimalQuarantineLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalServiceUtil;
import vn.dtt.duongbien.qlhsphuongtientndvaoracangbien.QLHSPhuongTienTNDVaoRaCangBien;

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
		TempGeneralDeclarationLocalServiceUtil.addTemGeneralDeclaration(nameOfShip, nameOfMaster, portRegionCode, portOfArrivalCode, portHarbourCode, portWharfCode, isArrival, voyageNumber, numberOfCrew, numberOfPassengers, lastPortOfCallCode, dateOfArrival, taxCodeOfShipownersAgents, nameOfShipownersAgents, shipAgencyAddress, shipAgencyPhone, shipAgencyFax, shipAgencyEmail, signDate );
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteVaoCangBien(ActionRequest actionRequest, ActionResponse actionResponse) {
		try {
			String id = ParamUtil.getString(actionRequest, "id");
			TempGeneralDeclarationLocalServiceUtil.deleteTempGeneralDeclaration(Long.valueOf(id));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
