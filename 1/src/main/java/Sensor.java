import org.json.JSONObject;

public class Sensor {

    public Sensor(String deviceId, String jwtToken, String key){
        Get_Json g = new Get_Json();//呼叫api生成之json檔
        String json1 =  g.Get_Json(deviceId, jwtToken);
        setValue(deviceId, json1, key);
    }

    public void setValue(String deviceId, String json1, String key){
        JSONObject j;
        JSONObject j2;
        //Get_Json g = new Get_Json();//呼叫api生成之json檔
        try {
            //String json1 = "{\"air\":[{\"ts\":1663123294543,\"value\":\"988\"}],\"hum\":[{\"ts\":1663123294543,\"value\":\"90\"}]}";
            //String json1 =  g.Get_Json(deviceId, jwtToken);
            j = new JSONObject(json1);
            Object jsonOb = j.getJSONArray(key).get(0);

            j2 = new JSONObject(jsonOb.toString());
            Object jsonOb2 = j2.get("value");
            System.out.println(jsonOb2);
        }catch(Exception e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}
