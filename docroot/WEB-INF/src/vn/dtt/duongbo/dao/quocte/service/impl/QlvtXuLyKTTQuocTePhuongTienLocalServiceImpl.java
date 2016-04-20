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

package vn.dtt.duongbo.dao.quocte.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien;
import vn.dtt.duongbo.dao.quocte.service.base.QlvtXuLyKTTQuocTePhuongTienLocalServiceBaseImpl;

/**
 * The implementation of the qlvt xu ly k t t quoc te phuong tien local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTePhuongTienLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author NoiPham
 * @see vn.dtt.duongbo.dao.quocte.service.base.QlvtXuLyKTTQuocTePhuongTienLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil
 */
public class QlvtXuLyKTTQuocTePhuongTienLocalServiceImpl
	extends QlvtXuLyKTTQuocTePhuongTienLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil} to access the qlvt xu ly k t t quoc te phuong tien local service.
	 */
	public List<QlvtXuLyKTTQuocTePhuongTien> findBycapPhepKTTQuocTeID(long capPhepKTTQuocTeID) throws SystemException {
		return qlvtXuLyKTTQuocTePhuongTienPersistence.findBycapPhepKTTQuocTeID(capPhepKTTQuocTeID);
	}
}