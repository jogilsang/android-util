package app.worker.check.util;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class SP {

    public static Boolean getBoolean(Context context, String key){

        SharedPreferences pref = context.getSharedPreferences("pref", Activity.MODE_PRIVATE);
        // ON,OFF 여부
        Boolean value =pref.getBoolean(key, false);

        return value;

    }

    public static void setBoolean(Context context, String key, boolean value){

        SharedPreferences pref = context.getSharedPreferences("pref", Activity.MODE_PRIVATE);

        SharedPreferences.Editor editor = pref.edit();

        // 하나 더 추가한다.
        editor.putBoolean(key, value);
        editor.commit();

    }

    public static String getString(Context context, String key){

        SharedPreferences pref = context.getSharedPreferences("pref", Activity.MODE_PRIVATE);
        // String 값 가져오기
        String value =pref.getString(key, "");

        return value;

    }

    public static void setString(Context context, String key, String value){

        SharedPreferences pref = context.getSharedPreferences("pref", Activity.MODE_PRIVATE);

        SharedPreferences.Editor editor = pref.edit();

        // 하나 더 추가한다.
        editor.putString(key, value);
        editor.commit();

    }

    public static int getInt(Context context, String key){

        SharedPreferences pref = context.getSharedPreferences("pref", Activity.MODE_PRIVATE);
        // String 값 가져오기
        int value =pref.getInt(key, 0);

        return value;

    }

    public static void setInt(Context context, String key, int value){

        SharedPreferences pref = context.getSharedPreferences("pref", Activity.MODE_PRIVATE);

        SharedPreferences.Editor editor = pref.edit();

        // 하나 더 추가한다.
        editor.putInt(key, value);
        editor.commit();

    }

    public static void setLong(Context context, String key, long value){

        SharedPreferences pref = context.getSharedPreferences("pref", Activity.MODE_PRIVATE);

        SharedPreferences.Editor editor = pref.edit();

        // 하나 더 추가한다.
        editor.putLong(key, value);
        editor.commit();

    }

    public static long getlong(Context context, String key){

        SharedPreferences pref = context.getSharedPreferences("pref", Activity.MODE_PRIVATE);
        // String 값 가져오기
        long value =pref.getLong(key,0);

        return value;

    }

    public static void setFloat(Context context, String key, float value){

        SharedPreferences pref = context.getSharedPreferences("pref", Activity.MODE_PRIVATE);

        SharedPreferences.Editor editor = pref.edit();

        // 하나 더 추가한다.
        editor.putFloat(key, value);
        editor.commit();

    }

    public static float getfloat(Context context, String key){

        SharedPreferences pref = context.getSharedPreferences("pref", Activity.MODE_PRIVATE);
        // String 값 가져오기
        float value =pref.getFloat(key,0);

        return value;

    }

}
