package com.mySampleApplication.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("LoginService")
public interface LoginService extends RemoteService {

    Boolean checkLoggedIn();

    public static class App {
        private static LoginServiceAsync ourInstance = GWT.create(LoginService.class);

        public static synchronized LoginServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
