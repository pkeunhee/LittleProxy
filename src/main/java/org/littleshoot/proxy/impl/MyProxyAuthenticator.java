package org.littleshoot.proxy.impl;

import org.littleshoot.proxy.ProxyAuthenticator;
import org.littleshoot.proxy.extras.PropertiesHolder;

import com.google.common.base.Strings;

public class MyProxyAuthenticator implements ProxyAuthenticator {
	@Override
	public boolean authenticate(String userName, String password) {
		String usernameInServer = PropertiesHolder.get("username");
		String passwordInServer = PropertiesHolder.get("password");

		// there's no authentication specified
		if (Strings.isNullOrEmpty(usernameInServer) || Strings.isNullOrEmpty(passwordInServer)) {
			return true;
		}

		return usernameInServer.equals(userName) && passwordInServer.equals(password);
	}

	@Override
	public String getRealm() {
		return null;
	}
}
