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

package vn.dtt.duongbo.dao.common.service.base;

import vn.dtt.duongbo.dao.common.service.TthcTrangThaiHoSoServiceUtil;

import java.util.Arrays;

/**
 * @author win_64
 * @generated
 */
public class TthcTrangThaiHoSoServiceClpInvoker {
	public TthcTrangThaiHoSoServiceClpInvoker() {
		_methodName154 = "getBeanIdentifier";

		_methodParameterTypes154 = new String[] {  };

		_methodName155 = "setBeanIdentifier";

		_methodParameterTypes155 = new String[] { "java.lang.String" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName154.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes154, parameterTypes)) {
			return TthcTrangThaiHoSoServiceUtil.getBeanIdentifier();
		}

		if (_methodName155.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes155, parameterTypes)) {
			TthcTrangThaiHoSoServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName154;
	private String[] _methodParameterTypes154;
	private String _methodName155;
	private String[] _methodParameterTypes155;
}