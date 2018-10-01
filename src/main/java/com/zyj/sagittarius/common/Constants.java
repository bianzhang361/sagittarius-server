package com.zyj.sagittarius.common;

import java.util.List;
import java.util.ResourceBundle;

public class Constants {

    public static ResourceBundle bundle = null;

    public static final String HTTP_PREFIX = "http://";

    public static String getPropertyByKey(String key) {
        try {
            if (bundle == null) {
                bundle = ResourceBundle.getBundle("application");
            }
            return bundle.getString(key);
        } catch (Exception e) {
            bundle = null;
            return "";
        }
    }

    @SuppressWarnings("rawtypes")
    public static boolean isNotEmpty(Object... data) {
        if (data == null) {
            return false;
        }
        for (int i=0;i<data.length;i++) {
            if (data[i] == null) {
                return false;
            }
            if (data[i] instanceof String) {
                if( null == data[i] || "".equals((String) data[i])) {
                    return false;
                }
            }
            if (data[i] instanceof List) {
                if( null == data[i] || ((List) data[i]).isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

}
