package taxidriver.nageh.mario.uber2018.Onlinedata;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitInstace {
    private static Retrofit retrofit=null;
    public static Retrofit getRetrofit(String Url){
        if( retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl(Url)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
