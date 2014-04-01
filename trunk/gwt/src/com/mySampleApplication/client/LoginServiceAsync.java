package com.mySampleApplication.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LoginServiceAsync {
    void checkLoggedIn(AsyncCallback<Boolean> async);
}
