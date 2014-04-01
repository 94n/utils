package com.mySampleApplication.client;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Widget;

/**
 * User: makstitoff
 * Date: 31.03.2014
 * Time: 15:35
 */
public class MyWidget extends Widget {

    public MyWidget() {
        setElement(DOM.createButton());
        sinkEvents(Event.ONCLICK);
    }

    public void onBrowserEvent(Event evt) {
        switch (DOM.eventGetType(evt)) {
            case Event.ONCLICK:
                break;
        }
    }

}
