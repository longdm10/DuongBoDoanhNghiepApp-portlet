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

package vn.dtt.duongbo.dao.motcua.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import vn.dtt.duongbo.dao.motcua.service.ClpSerializer;
import vn.dtt.duongbo.dao.motcua.service.MotCuaAnhXaTrangThaiLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaAnhXaTrangThaiServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaChuyenDichTrangThaiLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaChuyenDichTrangThaiServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaDienBienHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaDienBienHoSoServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaKetQuaDienBienLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaKetQuaDienBienServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaNhanTraHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaNhanTraHoSoServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhanCongXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhanCongXuLyServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaQuyTrinhThuTucLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaQuyTrinhThuTucServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaQuyTrinhThuTucTTHCLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaQuyTrinhThuTucTTHCServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaTrangThaiHoSoServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.OEPThuTucHanhChinhRoleLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.OEPThuTucHanhChinhRoleServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtEmployee2jobposLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtEmployee2jobposServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtEmployeeLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtEmployeeServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtJobpos2roleLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtJobpos2roleServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtJobposLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtJobposServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnit2tthcLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnit2tthcServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnitLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnitServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.ThamSoHeThongLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.ThamSoHeThongServiceUtil;

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
			MotCuaAnhXaTrangThaiLocalServiceUtil.clearService();

			MotCuaAnhXaTrangThaiServiceUtil.clearService();
			MotCuaChuyenDichTrangThaiLocalServiceUtil.clearService();

			MotCuaChuyenDichTrangThaiServiceUtil.clearService();
			MotCuaDienBienHoSoLocalServiceUtil.clearService();

			MotCuaDienBienHoSoServiceUtil.clearService();
			MotCuaKetQuaDienBienLocalServiceUtil.clearService();

			MotCuaKetQuaDienBienServiceUtil.clearService();
			MotCuaNhanTraHoSoLocalServiceUtil.clearService();

			MotCuaNhanTraHoSoServiceUtil.clearService();
			MotCuaPhanCongXuLyLocalServiceUtil.clearService();

			MotCuaPhanCongXuLyServiceUtil.clearService();
			MotCuaPhieuXuLyLocalServiceUtil.clearService();

			MotCuaPhieuXuLyServiceUtil.clearService();
			MotCuaQuyTrinhThuTucLocalServiceUtil.clearService();

			MotCuaQuyTrinhThuTucServiceUtil.clearService();
			MotCuaQuyTrinhThuTucTTHCLocalServiceUtil.clearService();

			MotCuaQuyTrinhThuTucTTHCServiceUtil.clearService();
			MotCuaTrangThaiHoSoLocalServiceUtil.clearService();

			MotCuaTrangThaiHoSoServiceUtil.clearService();
			OEPThuTucHanhChinhRoleLocalServiceUtil.clearService();

			OEPThuTucHanhChinhRoleServiceUtil.clearService();
			OEPUserMgtEmployeeLocalServiceUtil.clearService();

			OEPUserMgtEmployeeServiceUtil.clearService();
			OEPUserMgtEmployee2jobposLocalServiceUtil.clearService();

			OEPUserMgtEmployee2jobposServiceUtil.clearService();
			OEPUserMgtJobposLocalServiceUtil.clearService();

			OEPUserMgtJobposServiceUtil.clearService();
			OEPUserMgtJobpos2roleLocalServiceUtil.clearService();

			OEPUserMgtJobpos2roleServiceUtil.clearService();
			OEPUserMgtWorkingUnitLocalServiceUtil.clearService();

			OEPUserMgtWorkingUnitServiceUtil.clearService();
			OEPUserMgtWorkingUnit2tthcLocalServiceUtil.clearService();

			OEPUserMgtWorkingUnit2tthcServiceUtil.clearService();
			ThamSoHeThongLocalServiceUtil.clearService();

			ThamSoHeThongServiceUtil.clearService();
		}
	}
}