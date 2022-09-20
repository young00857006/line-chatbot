import okhttp3.*;

public class Get_Json {
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
}
