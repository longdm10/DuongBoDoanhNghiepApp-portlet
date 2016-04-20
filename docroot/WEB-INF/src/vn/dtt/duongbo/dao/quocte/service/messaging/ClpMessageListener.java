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

package vn.dtt.duongbo.dao.quocte.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import vn.dtt.duongbo.dao.quocte.service.ClpSerializer;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTeBieuDoXeLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTeBieuDoXeServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTeDiemDungNghiLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTeDiemDungNghiServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTeLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTePhuongTienServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTeServiceUtil;

/**
 * @author NoiPham
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
			QlvtXuLyGpkdvtQuocTeLocalServiceUtil.clearService();

			QlvtXuLyGpkdvtQuocTeServiceUtil.clearService();
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil.clearService();

			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiServiceUtil.clearService();
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenLocalServiceUtil.clearService();

			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenServiceUtil.clearService();
			QlvtXuLyKTTQuocTeLocalServiceUtil.clearService();

			QlvtXuLyKTTQuocTeServiceUtil.clearService();
			QlvtXuLyKTTQuocTeBieuDoXeLocalServiceUtil.clearService();

			QlvtXuLyKTTQuocTeBieuDoXeServiceUtil.clearService();
			QlvtXuLyKTTQuocTeDiemDungNghiLocalServiceUtil.clearService();

			QlvtXuLyKTTQuocTeDiemDungNghiServiceUtil.clearService();
			QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil.clearService();

			QlvtXuLyKTTQuocTePhuongTienServiceUtil.clearService();
		}
	}
}