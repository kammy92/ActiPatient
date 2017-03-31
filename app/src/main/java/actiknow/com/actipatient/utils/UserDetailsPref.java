package actiknow.com.actipatient.utils;


import android.content.Context;
import android.content.SharedPreferences;

import static actiknow.com.actipatient.utils.AppConfigTags.SURVEY_TYPE;

public class UserDetailsPref {
    public static String LANGUAGE = "language";
    public static String SURVEY_TYPE = "survey_type";
    public static String DEVICE_ID = "device_id";
    public static String DEVICE_LOCATION = "device_location";
    public static String HOSPITAL_NAME = "hospital_name";
    public static String HOSPITAL_LOGO = "hospital_logo";
    public static String HOSPITAL_LOGIN_KEY = "hospital_login_key";
    public static String HOSPITAL_ACCESS_PIN = "hospital_access_pin";
    public static String SUBSCRIPTION_STATUS = "subscription_status";
    public static String SUBSCRIPTION_STARTS = "subscription_starts";
    public static String SUBSCRIPTION_EXPIRES = "subscription_expires";


    private static UserDetailsPref userDetailsPref;
    private String USER_DETAILS = "USER_DETAILS";

    public static UserDetailsPref getInstance () {
        if (userDetailsPref == null)
            userDetailsPref = new UserDetailsPref ();
        return userDetailsPref;
    }

    private SharedPreferences getPref (Context context) {
        return context.getSharedPreferences (USER_DETAILS, Context.MODE_PRIVATE);
    }

    public String getStringPref (Context context, String key) {
        return getPref (context).getString (key, "");
    }

    public int getIntPref (Context context, String key) {
        return getPref (context).getInt (key, 0);
    }

    public void putStringPref (Context context, String key, String value) {
        SharedPreferences.Editor editor = getPref (context).edit ();
        editor.putString (key, value);
        editor.apply ();
    }

    public void putIntPref (Context context, String key, int value) {
        SharedPreferences.Editor editor = getPref (context).edit ();
        editor.putInt (key, value);
        editor.apply ();
    }
}