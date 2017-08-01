package android.coolweather.com.rc.coolweather.gson;

import android.app.NotificationManager;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by kuncao on 7/31/17.
 */

/*
"HeWeather":[
    {
        "status":"ok",
        "basic": {},
        "aqi": {},
        "now": {},
        "suggestion": {},
        "daily_forecast": []
    }
]
*/

public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
