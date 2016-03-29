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

import java.util.List;

import vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay;
import vn.dtt.duongbo.dao.thanhtoan.service.base.ThanhToanKeyPayLocalServiceBaseImpl;

/**
 * The implementation of the thanh toan key pay local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.thanhtoan.service.ThanhToanKeyPayLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.thanhtoan.service.base.ThanhToanKeyPayLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.thanhtoan.service.ThanhToanKeyPayLocalServiceUtil
 */
public class ThanhToanKeyPayLocalServiceImpl
	extends ThanhToanKeyPayLocalServiceBaseImpl {
	
	public List<ThanhToanKeyPay> findByGoodCode(String goodCode) {
		return thanhToanKeyPayFinder.findByGoodCode(goodCode);
	}
	
	public ThanhToanKeyPay findByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage(String goodCode, String merchantCode, String merchantTransId, int loaiMessage) {
		return thanhToanKeyPayFinder.findByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage(goodCode, merchantCode, merchantTransId, loaiMessage);
	}
}