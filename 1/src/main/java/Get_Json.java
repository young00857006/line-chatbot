import okhttp3.*;
import java.math.BigInteger;

public class Get_Json {
    //取得最近一次的JSON
    public String Get_Json(String deviceId, String jwtToken) {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
//        RequestBody body = RequestBody.create(mediaType,);
        Request request = new Request.Builder()
                .url("https://iiot.ideaschain.com.tw/api/plugins/telemetry/DEVICE/"+deviceId+"/values/timeseries?keys=temp,tds,level,humd,UVlevel,random_2,random_1,millis")
//                .method("GET", body)
                .addHeader("X-Authorization", "Bearer "+jwtToken)
                .build();
        try {
            Response response = client.newCall(request).execute();
            //System.out.print(response.body().string());
            return response.body().string();
        } catch (Exception e) {

        }
        return null;
    }
    //取得某時間範圍內的JSON
    public String Get_Json_Range(String deviceId, String jwtToken, BigInteger startTime, BigInteger endTime, int range) {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        Request request = new Request.Builder()
                .url("https://iiot.ideaschain.com.tw/api/plugins/telemetry/DEVICE/"+deviceId+"/values/timeseries?keys=temp,tds,level,humd,UVlevel,random_2,random_1,millis&startTs="+startTime+"&endTs="+endTime+"&limit="+range+"")
                .addHeader("X-Authorization", "Bearer "+jwtToken)
                .build();
        try {
            Response response = client.newCall(request).execute();
            return response.body().string();
        } catch (Exception e) {

        }
        return null;
    }
}
