package com.mySampleApplication.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.mySampleApplication.client.LoginService;

/**
 * Max Titov 4/1/2014 2:15 PM
 */
public class LoginServiceImpl extends RemoteServiceServlet implements LoginService {

    @Override
    public Boolean checkLoggedIn() {
        return true;
    }
}
