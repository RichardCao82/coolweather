package android.coolweather.com.rc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kuncao on 7/31/17.
 */

/*
"now":{
    "tmp":"29",
    "cond":{
        "txt":"rain"
    }
}
*/

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
