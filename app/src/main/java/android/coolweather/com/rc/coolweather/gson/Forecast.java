package android.coolweather.com.rc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kuncao on 7/31/17.
 */

/*
"daily_forecast":{
    {
        "data":"2016-08-08",
        "cond":{
            "txt_d":"rain"
        },
        "tmp":{
            "max":"34",
            "min":"27"
        }
    },
    {
        "data":"2016-08-09",
        "cond":{
            "txt_d":"cloudy"
        },
        "tmp":{
            "max":"35",
            "min":"29"
        }
    }
}
*/

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;
        public String min;
    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }
}
