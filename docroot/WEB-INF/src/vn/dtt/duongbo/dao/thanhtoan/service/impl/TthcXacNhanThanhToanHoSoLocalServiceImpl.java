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

package vn.dtt.duongbo.dao.thanhtoan.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo;
import vn.dtt.duongbo.dao.thanhtoan.service.base.TthcXacNhanThanhToanHoSoLocalServiceBaseImpl;

/**
 * The implementation of the tthc xac nhan thanh toan ho so local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanHoSoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.thanhtoan.service.base.TthcXacNhanThanhToanHoSoLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanHoSoLocalServiceUtil
 */
public class TthcXacNhanThanhToanHoSoLocalServiceImpl
	extends TthcXacNhanThanhToanHoSoLocalServiceBaseImpl {
	
	public List<TthcXacNhanThanhToanHoSo> findByXacNhanThanhToanId(long xacNhanThanhToanId){
		try{
			return tthcXacNhanThanhToanHoSoPersistence.findByXacNhanThanhToanId(xacNhanThanhToanId);
		}catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<TthcXacNhanThanhToanHoSo>();
	}
	
	public  TthcXacNhanThanhToanHoSo findByHoSoThuTucId(long hoSoThuTucId){
		try{
			return tthcXacNhanThanhToanHoSoPersistence.findByHoSoThuTucId(hoSoThuTucId);
		}catch (Exception e) {
			_log.error(e);
		}
		
		return null;
	}
	
	public TthcXacNhanThanhToanHoSo findByXacNhanThanhToanIdHoSoThuTucId(
			long xacNhanThanhToanId, long hoSoThuTucId) {
		try{
			return tthcXacNhanThanhToanHoSoPersistence.findByXacNhanThanhToanIdHoSoThuTucId(xacNhanThanhToanId, hoSoThuTucId);
		}catch (Exception e) {
			_log.error(e);
		}
		
		return null;
	}
	
	private static Log _log = LogFactoryUtil.getLog(TthcXacNhanThanhToanHoSoLocalServiceImpl.class);
}