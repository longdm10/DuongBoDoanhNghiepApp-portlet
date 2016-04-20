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

package vn.dtt.duongbo.dao.common.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import vn.dtt.duongbo.dao.common.model.DmDataItem;
import vn.dtt.duongbo.dao.common.service.base.DmDataItemLocalServiceBaseImpl;

/**
 * The implementation of the dm data item local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.common.service.DmDataItemLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.common.service.base.DmDataItemLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil
 */
public class DmDataItemLocalServiceImpl extends DmDataItemLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil} to access the dm data item local service.
	 */
	
	private static Log _log = LogFactoryUtil.getLog(DmDataItemLocalServiceImpl.class);
	private DmDataItem fetchByCode;
	
	public List<DmDataItem> findByGroupIdAndLevel(long groupId, int level) {
		return dmDataItemFinder.findByGroupIdAndLevel(groupId, level);
	}
	
	public List<DmDataItem> findByGroupIdAndChaCode(long groupId, String chaCode) {
		return dmDataItemFinder.findByGroupIdAndChaCode(groupId, chaCode);
	}
	
	public DmDataItem findByGroupIdAndCode(long groupId, String code) {
		try {
			return dmDataItemPersistence.findByDataGroupIdAndCode(groupId, code);
		} catch (Exception e) {
			_log.error("No DmDataItem exists with the key {dataGroupId=" + groupId + ", code=" + code + "}");
		} 
		return null;
	}
	public DmDataItem findByGroupIdAndCodeStatus(long groupId, String code) {
		try {
			return dmDataItemPersistence.fetchByDataGroupIdAndCodeStatus(groupId, code);
		} catch (Exception e) {
			_log.error("No DmDataItem exists with the key {dataGroupId=" + groupId + ", code=" + code + "}");
		} 
		return null;
	}
	public List<DmDataItem> findTinhThanh() {
		return dmDataItemFinder.findTinhThanh();
	}
	
	public List<DmDataItem> findQuanHuyenByMaTinhThanh(String maTinhThanh) {
		return dmDataItemFinder.findQuanHuyenByMaTinhThanh(maTinhThanh);
	}
	
	public List<DmDataItem> findPhuongXaByMaTinhThanMaQuanHuyen(String maTinhThanh, String maQuanHuyen) {
		return dmDataItemFinder.findPhuongXaByMaTinhThanMaQuanHuyen(maTinhThanh, maQuanHuyen);
	}
	
	public List<DmDataItem> findByGroupCodeAndItemCode0(String groupName, String code_0) {
		try {
			return dmDataItemFinder.findByGroupCodeAndItemCode0(groupName, code_0);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<DmDataItem> findByGroupCode(String dmDataGroupCode) {
		try {
			return dmDataItemFinder.findByGroupCode(dmDataGroupCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	public List<DmDataItem> findByGroupCodeIdTTHC(String dmDataGroupCode, String idTTHC) {
		try {
			return dmDataItemFinder.findByGroupCodeIdTTHC(dmDataGroupCode, idTTHC);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public List<DmDataItem> findByGroupCodeAndNode1(String dmDataGroupCode, String node1) {
		try {
			return dmDataItemFinder.findByGroupCodeAndNode1(dmDataGroupCode, node1);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<DmDataItem> findByGroupId(long dataGroupId) {
		try {
			return dmDataItemFinder.findByGroupId(dataGroupId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	
//	public List<DmDataItem> findByDataGroupCodeNameAndDataItemAlterName(String groupName, String alterName) {
//		return dmDataItemFinder.findByDataGroupCodeNameAndDataItemAlterName(groupName, alterName);
//	}
//	
//	public List<DmDataItem> findByDataGroupIdAndLevelAlterName(String dmDataGroupCode,int level,String alterName) {
//		try {
//			return dmDataItemFinder.findByDmDataGroupCodeAndLevelAlterName(dmDataGroupCode, level, alterName);
//		} catch (Exception e) {
//			_log.error(e);
//		}
//		return null;
//	}
	
	public List<DmDataItem> findByGroupCodeAndLevel(String dmDataGroupCode, int level) {
		try {
			return dmDataItemFinder.findByGroupCodeAndLevel(dmDataGroupCode, level);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<DmDataItem>();
	}
	
	public List<DmDataItem> findByCodeAndStatus(String code, int status) {
		try {
			return dmDataItemPersistence.findByCodeAndStatus(code, status);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<DmDataItem>();
	}
	
	public List<DmDataItem> findByGroupIdAndStatus(long dataGroupId, int status) {
		try {
			return dmDataItemPersistence.findBydataGroupId(dataGroupId, status);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<DmDataItem>();
	}
	
	public List<DmDataItem> findByArrayId(String arrayId) {
		try {
			return dmDataItemFinder.findByArrayId(arrayId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	
	public DmDataItem findByGroupIdAndItemCode(long groupId, String code) {
		try {
			return dmDataItemFinder.findByGroupIdAndItemCode(groupId, code);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public DmDataItem getByGroupCodeAndItemCode0(String groupName, String code_0) {
		try {
			return dmDataItemFinder.getByGroupCodeAndItemCode0(groupName, code_0);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
//	public DmDataItem getByDmDataGroupCodeNameAndCode0AndLevel(String dmDataGroupCodeName, String code_0, int level) {
//		try {
//			return dmDataItemFinder.getByDmDataGroupCodeNameAndCode0AndLevel(dmDataGroupCodeName, code_0, level);
//		} catch (Exception e) {
//			_log.error(e);
//		}
//		return null;
//	}
	
	public DmDataItem getByCode(String code) {
		try {
			fetchByCode = dmDataItemPersistence.fetchByCodeAndNoStatus(code);
			if (Validator.isNull(fetchByCode)) {
				_log.info("-----No find DmDataItem with code:" + code);
			}
			return fetchByCode;
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<DmDataItem> getByCodeAndLevel(String code, int level) throws SystemException {
		return dmDataItemPersistence.findByCodeAndLevel(code, level, 1);
	}
	
	public List<DmDataItem> getByCodeAndNode1(String code, String node_1) throws SystemException {
		return dmDataItemPersistence.findByCodeAndNode1(code, node_1, 1);
	}
}