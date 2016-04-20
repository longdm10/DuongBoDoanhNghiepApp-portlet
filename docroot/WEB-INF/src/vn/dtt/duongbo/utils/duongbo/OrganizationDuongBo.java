/**
 * 
 */
package vn.dtt.duongbo.utils.duongbo;

import java.util.List;

import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.Organization;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;

/**
 * @author win_64
 *
 */
public class OrganizationDuongBo {

	
	public boolean addUserToOrg(long userId, long organizationId) {
		long[] userIds = {userId};
		
		// Xoa cac org truoc day
		try {
			List<Organization> liOrganizations = OrganizationLocalServiceUtil.getUserOrganizations(userId);
			if (liOrganizations != null && liOrganizations.size() > 0) {
				for (Organization organization : liOrganizations) {
					try {
						UserLocalServiceUtil.unsetOrganizationUsers(organization.getOrganizationId(), userIds);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		} catch (Exception e1) {
			LogFactoryUtil.getLog(OrganizationDuongBo.class).error(e1);
		} 
		
		// Add User to Org
		try {
			Organization organization = OrganizationLocalServiceUtil.getOrganization(organizationId);
			
			
			UserLocalServiceUtil.addOrganizationUsers(organization.getOrganizationId(), userIds);
			return true;
		} catch (Exception es) {
			LogFactoryUtil.getLog(OrganizationDuongBo.class).error(es);
		}
		
		return false;
	}
	
	public static boolean checkOrg(long organizationId, long[] listOrg) {
		for (long id : listOrg) {
			if (organizationId == id) {
				return true;
			}
		}
		return false;
	}
}