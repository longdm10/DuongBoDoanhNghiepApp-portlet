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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.base.QLVTXuLyPhuHieuPhuongTienLocalServiceBaseImpl;

/**
 * The implementation of the q l v t xu ly phu hieu phuong tien local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuPhuongTienLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author binhta
 * @see vn.dtt.duongbo.dao.capbienhieuphuhieu.service.base.QLVTXuLyPhuHieuPhuongTienLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuPhuongTienLocalServiceUtil
 */
public class QLVTXuLyPhuHieuPhuongTienLocalServiceImpl
	extends QLVTXuLyPhuHieuPhuongTienLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuPhuongTienLocalServiceUtil} to access the q l v t xu ly phu hieu phuong tien local service.
	 */
	public List<QLVTXuLyPhuHieuPhuongTien> findBycapPhuHieuID(int capPhuHieuID) throws SystemException {
		return qlvtXuLyPhuHieuPhuongTienPersistence.findBycapPhuHieuID(capPhuHieuID);
	}
}