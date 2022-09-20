import okhttp3.*;
import org.json.JSONObject;

public class Get_JwtToken {
    public String Get_JwtToken(){
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\r\n \"username\":\"warren5606@gmail.com\",\r\n \"password\":\"warren00857020\"\r\n}");
        Request request = new Request.Builder()
                .url("https://iiot.ideaschain.com.tw/api/auth/login")
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response = client.newCall(request).execute();
            return response.body().string();
        }
        catch (Exception e){

        }
        return null;
    }

    public Object setJwtToken(){
        JSONObject t;
        Get_JwtToken jwt = new Get_JwtToken();//呼叫jwt token
        try {
            //String json1 = "{\"air\":[{\"ts\":1663123294543,\"value\":\"988\"}],\"hum\":[{\"ts\":1663123294543,\"value\":\"90\"}]}";
            String json1 =  jwt.Get_JwtToken();
            t = new JSONObject(json1);
            Object jsonOb = t.get("token");

            return jsonOb;
        }catch(Exception e){
            System.err.println("Error: " + e.getMessage());
        }
        return null;
    }
}
