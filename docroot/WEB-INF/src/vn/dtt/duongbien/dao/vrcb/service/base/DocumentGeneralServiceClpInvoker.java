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

package vn.dtt.duongbien.dao.vrcb.service.base;

import vn.dtt.duongbien.dao.vrcb.service.DocumentGeneralServiceUtil;

import java.util.Arrays;

/**
 * @author longdm
 * @generated
 */
public class DocumentGeneralServiceClpInvoker {
	public DocumentGeneralServiceClpInvoker() {
		_methodName552 = "getBeanIdentifier";

		_methodParameterTypes552 = new String[] {  };

		_methodName553 = "setBeanIdentifier";

		_methodParameterTypes553 = new String[] { "java.lang.String" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName552.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes552, parameterTypes)) {
			return DocumentGeneralServiceUtil.getBeanIdentifier();
		}

		if (_methodName553.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes553, parameterTypes)) {
			DocumentGeneralServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName552;
	private String[] _methodParameterTypes552;
	private String _methodName553;
	private String[] _methodParameterTypes553;
}