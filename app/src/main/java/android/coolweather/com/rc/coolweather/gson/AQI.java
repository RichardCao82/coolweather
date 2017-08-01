package android.coolweather.com.rc.coolweather.gson;

/**
 * Created by kuncao on 7/31/17.
 */

/*
"aqi":{
    "city::{
        "aqi":"44",
        "pm25":"13"
    }
 }
*/

public class AQI {

    public AQICity city;

    public class AQICity {

        public String api;
        public String pm25;
    }
}
