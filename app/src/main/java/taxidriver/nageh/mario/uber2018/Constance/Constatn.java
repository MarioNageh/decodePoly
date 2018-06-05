package taxidriver.nageh.mario.uber2018.Constance;


import taxidriver.nageh.mario.uber2018.Onlinedata.IGoogleApi;
import taxidriver.nageh.mario.uber2018.Onlinedata.RetrofitInstace;

public class Constatn {
    public static final String url ="https://maps.googleapis.com";
    public static IGoogleApi iGoogleApi(){
        return RetrofitInstace.getRetrofit(url).create(IGoogleApi.class);
    }
}
