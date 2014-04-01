package com.mySampleApplication.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class MySampleApplication implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        LoginServiceAsync loginService = LoginService.App.getInstance();
        loginService.checkLoggedIn(new AsyncCallback<Boolean>() {
            public void onSuccess(Boolean loggedIn) {
                if (loggedIn) {
                    final Button button = new Button("Click me");
                    final Label label = new Label();
                    button.addClickHandler(new ClickHandler() {
                        public void onClick(ClickEvent event) {
                            if (label.getText().equals("")) {
                                MySampleApplicationService.App.getInstance().getMessage("Hello, World!", new MyAsyncCallback(label));
                            } else {
                                label.setText("");
                            }
                        }
                    });
                    RootPanel.get("slot1").add(button);
                    RootPanel.get("slot2").add(label);
                } else {
                    Window.Location.assign("/login");
                }
            }

            public void onFailure(Throwable caught) {

            }
        });        
    }

    private static class MyAsyncCallback implements AsyncCallback<String> {
        private Label label;

        public MyAsyncCallback(Label label) {
            this.label = label;
        }

        public void onSuccess(String result) {
            label.getElement().setInnerHTML(result);
        }

        public void onFailure(Throwable throwable) {
            label.setText("Failed to receive answer from server!");
        }
    }

}
