package android.coolweather.com.rc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kuncao on 7/31/17.
 */

/*
"basic":{
    "city":"TianJin",
    "id":"CN123",
    "update":{
        "loc":"2016-08-08 21:58"
    }
}
*/

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
