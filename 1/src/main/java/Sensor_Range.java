import org.json.JSONObject;

import java.math.BigInteger;

public class Sensor_Range {

    public Sensor_Range(String deviceId, String jwtToken, BigInteger startTime, BigInteger endTime, int range, String key){
        Get_Json g = new Get_Json();//呼叫api生成之json檔
        String json1 = g.Get_Json_Range(deviceId, jwtToken, startTime, endTime, range);
        setValue(deviceId, json1, key, range);
    }

    public void setValue(String deviceId, String json1, String key, int num) {
        JSONObject j;
        JSONObject j2;

        try {
            j = new JSONObject(json1);

            for (int i = 0; i < num; i++) {
                Object jsonOb = j.getJSONArray(key).get(i);
                j2 = new JSONObject(jsonOb.toString());
                Object jsonOb2 = j2.get("value");
                Object jsonOb_Time = j2.get("ts");
                long ms = (long) jsonOb_Time / 1000;
                String date = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new java.util.Date(ms * 1000));
                System.out.println(date + " 所測得"+key+"數據為: " + jsonOb2);
                //System.out.println(jsonOb2);

            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
