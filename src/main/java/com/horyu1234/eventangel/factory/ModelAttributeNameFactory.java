package com.horyu1234.eventangel.factory;

/**
 * Created by horyu on 2018-04-07
 */
public class ModelAttributeNameFactory {
    public static final String VIEW_NAME = "viewName";

    public static final String LOGIN_USERNAME = "username";

    public static final String EVENT_ID = "eventId";
    public static final String EVENT_STATUS = "eventStatus";
    public static final String EVENT_TITLE = "eventTitle";
    public static final String EVENT_DETAIL = "eventDetail";
    public static final String EVENT_START_TIME = "eventStartTime";
    public static final String EVENT_END_TIME = "eventEndTime";

    private ModelAttributeNameFactory() {
        throw new IllegalStateException("Factory class");
    }
}
