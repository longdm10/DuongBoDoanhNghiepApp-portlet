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

package vn.dtt.duongbo.dao.common.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import vn.dtt.duongbo.dao.common.service.ClpSerializer;
import vn.dtt.duongbo.dao.common.service.DmDataGroupLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.DmDataVersionLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.DmMetaDataLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.QlvtDiemDungDangKyVietCamLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.QlvtDiemDungDangKyVietLaoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.QlvtDiemDungDangKyVietTrungLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.QlvtLoaiHinhHoatDongDnLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.QlvtPhuongTienCapBienHieuLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.QlvtPhuongTienCapPhuHieuLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietCamLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietLaoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietTrungLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcDoiTuongThucHienLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcDonViThucHienLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcLinhVucThuTucLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoTmpLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoVaiTroLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThongBaoXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcTrangThaiHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcTrangThaiHoSoServiceUtil;

/**
 * @author win_64
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
			DmDataGroupLocalServiceUtil.clearService();

			DmDataItemLocalServiceUtil.clearService();

			DmDataVersionLocalServiceUtil.clearService();

			DmMetaDataLocalServiceUtil.clearService();

			QlvtDiemDungDangKyVietCamLocalServiceUtil.clearService();

			QlvtDiemDungDangKyVietLaoLocalServiceUtil.clearService();

			QlvtDiemDungDangKyVietTrungLocalServiceUtil.clearService();

			QlvtLoaiHinhHoatDongDnLocalServiceUtil.clearService();

			QlvtPhuongTienCapBienHieuLocalServiceUtil.clearService();

			QlvtPhuongTienCapPhuHieuLocalServiceUtil.clearService();

			QlvtPhuongTienDangKyVietCamLocalServiceUtil.clearService();

			QlvtPhuongTienDangKyVietLaoLocalServiceUtil.clearService();

			QlvtPhuongTienDangKyVietTrungLocalServiceUtil.clearService();

			TthcBieuMauHoSoLocalServiceUtil.clearService();

			TthcDoiTuongThucHienLocalServiceUtil.clearService();

			TthcDonViThucHienLocalServiceUtil.clearService();

			TthcHoSoThuTucLocalServiceUtil.clearService();

			TthcLinhVucThuTucLocalServiceUtil.clearService();

			TthcNoidungHoSoLocalServiceUtil.clearService();

			TthcNoidungHoSoTmpLocalServiceUtil.clearService();

			TthcPhanNhomHoSoLocalServiceUtil.clearService();

			TthcPhanNhomHoSoVaiTroLocalServiceUtil.clearService();

			TthcThanhPhanHoSoLocalServiceUtil.clearService();

			TthcThanhPhanHoSoBieuMauLocalServiceUtil.clearService();

			TthcThongBaoXuLyLocalServiceUtil.clearService();

			TthcThuTucHanhChinhLocalServiceUtil.clearService();

			TthcTrangThaiHoSoLocalServiceUtil.clearService();

			TthcTrangThaiHoSoServiceUtil.clearService();
		}
	}
}