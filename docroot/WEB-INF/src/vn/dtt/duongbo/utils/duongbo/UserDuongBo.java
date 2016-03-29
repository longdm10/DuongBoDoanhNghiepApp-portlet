package vn.dtt.duongbo.utils.duongbo;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.utils.config.DuongBoConfigurationManager;

import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;

public class UserDuongBo {
	
	public UserDuongBo() {
	}
	
	public void blockUser(long userId) throws PortalException, SystemException {
		User existUser = null;
		try {
			existUser = UserLocalServiceUtil.fetchUserById(userId);
			if (existUser != null ) {
				UserLocalServiceUtil.updateStatus(existUser.getUserId(), WorkflowConstants.STATUS_INACTIVE);
			}	
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public boolean checkUserExits(long companyId, String email) {
		User existUser = null;
		try {
			existUser = UserLocalServiceUtil.fetchUserByEmailAddress(companyId, email);
			if (existUser != null ) {
				return true;
			}	
		} catch (Exception e) {
			_log.error(e);
		}
		return false;
	}
	
	public boolean updatePass(long userId, String newPass) {
		User existUser = null;
		try {
			existUser = UserLocalServiceUtil.fetchUserById(userId);
			if (existUser != null ) {
				UserLocalServiceUtil.updatePassword(userId, newPass, newPass, true);
				return true;
			}
		} catch (Exception e) {
			_log.error(e);
		}
		return false;
	}
	
	public void activeUser(long userId) {
		User existUser = null;
		try {
			existUser = UserLocalServiceUtil.fetchUserById(userId);
			if (existUser != null ) {
				UserLocalServiceUtil.updateStatus(existUser.getUserId(), WorkflowConstants.STATUS_APPROVED);
			}
		} catch (Exception e) {
			_log.error(e);
		}
	}

	public User createPortalUser(long companyId, String matKhau, String email, String fullName, String type) throws Exception{
		
		// Check if user exists		
		User existUser = null;
		
		try {
			existUser = UserLocalServiceUtil.getUserByEmailAddress(companyId, email.trim().toLowerCase());
		} catch (NoSuchUserException nsue) {
			
		}
		
		// Update the existing user incase user found
		if ( existUser != null ) {
			// Activate user if it is deactive
			if ( !existUser.isActive() ) {
				UserLocalServiceUtil.updateStatus(existUser.getUserId(), WorkflowConstants.STATUS_APPROVED);
			}
	
			if (Validator.isNotNull(matKhau)) {
				String decryptPassword = matKhau.trim().toLowerCase();
				UserLocalServiceUtil.updatePassword(existUser.getUserId(), decryptPassword, decryptPassword, false);
			}			

			return existUser;
		}
		
		// Create new user here
		
		long creatorUserId = 0;
		
		boolean autoPassword = false;
		
		String password1 = matKhau;
		
		String password2 = matKhau;
		
		boolean autoScreenName = true;
		
		String screenName = StringPool.BLANK;
		
		String emailAddress = email;
		
		long facebookId = 0;
		
		String openId = StringPool.BLANK;
		
		Locale locale = LocaleUtil.getDefault();
		
		String firstName = fullName;
		
		String middleName = StringPool.BLANK;
		
		String lastName = StringPool.BLANK;
		
		int prefixId = 0;
		
		int suffixId = 0;
		
		boolean male = true; // Default is male
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		
		// Set the birth day as current date
		int birthdayMonth = cal.get(Calendar.MONTH);
		int birthdayDay = cal.get(Calendar.DAY_OF_MONTH);
		int birthdayYear = cal.get(Calendar.YEAR);
		
		String jobTitle = StringPool.BLANK;
		
		long[] groupIds = null;
		
		long[] organizationIds = null;
		long[] roleIds = null;
		
		long[] userGroupIds = null;
		
		boolean sendEmail = false;

		ServiceContext serviceContext = new ServiceContext();

		User user = null;
		
		if(type.equalsIgnoreCase(Constants.LOAI_NGUOI_LAM_THU_TUC_CD)){
			organizationIds = new long[]{DuongBoConfigurationManager.getLongProp("id_org_congdan", 0)};
		} else if(type.equalsIgnoreCase(Constants.LOAI_NGUOI_LAM_THU_TUC_DN)){
			organizationIds = new long[]{DuongBoConfigurationManager.getLongProp("id_org_doanhnghiep", 0)};
		}	
		
		user = UserLocalServiceUtil.addUser(
			creatorUserId, companyId, autoPassword, password1, password2,
			autoScreenName, screenName, emailAddress, facebookId, openId,
			locale, firstName, middleName, lastName, prefixId, suffixId, male,
			birthdayMonth, birthdayDay, birthdayYear, jobTitle, groupIds,
			organizationIds, roleIds, userGroupIds, sendEmail, serviceContext);
		
		UserLocalServiceUtil.updateLastLogin(user.getUserId(), user.getLoginIP());
	
		UserLocalServiceUtil.updatePasswordReset(user.getUserId(), true);
	
		UserLocalServiceUtil.updateEmailAddressVerified(user.getUserId(), true);
		
		//UserLocalServiceUtil.updateCreateDate(user.getUserId(), new Date());
		
		user = UserLocalServiceUtil.getUserByEmailAddress(user.getCompanyId(), email);
		
		return user;
	}
	
	public boolean deletePortalUser(long userID) throws Exception{
		try {
			long id_admin = DuongBoConfigurationManager.getLongProp("id_admin", 0);
			
			if (id_admin == userID) {
				return false;
			}
			
			UserLocalServiceUtil.deleteUser(userID);
			
		} catch (Exception e) {
			_log.error(e);
		}
		
		return false;
	}
	
	private static Log _log = LogFactoryUtil.getLog(UserDuongBo.class);
}
