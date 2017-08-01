package android.coolweather.com.rc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kuncao on 7/31/17.
 */

/*
"suggestion":{
    "comf":{
        "txt":"12312123123"
    },
    "cw":{
        "txt":"12312123123"
    },
    "sport":{
        "txt":"12312123123"
    },
}
*/

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("txt")
        public String info;
    }

    public class CarWash {

        @SerializedName("txt")
        public String info;
    }

    public class Sport {

        @SerializedName("txt")
        public String info;
    }
}
