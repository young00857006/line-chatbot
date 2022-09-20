import org.json.JSONObject;

public class Sensor {
    private String temp;
    private String tds;
    private String level;
    private String humd;
    private String UVlevel;
    private String random_2;
    private String random_1;
    private String millis;

    public Sensor(String deviceId, String jwtToken){
        this.temp = (String) setValue(deviceId, jwtToken, "temp");
        this.tds = (String) setValue(deviceId, jwtToken, "tds");
        this.level = (String) setValue(deviceId, jwtToken, "level");
        this.humd = (String) setValue(deviceId, jwtToken, "humd");
        this.UVlevel = (String) setValue(deviceId, jwtToken, "UVlevel");
        this.random_2 = (String) setValue(deviceId, jwtToken, "random_2");
        this.random_1 = (String) setValue(deviceId, jwtToken, "random_1");
        this.millis = (String) setValue(deviceId, jwtToken, "millis");
        //this.temp = (String) setValue(deviceId,"temp");
    }

    public Object setValue(String deviceId, String jwtToken, String key){
        JSONObject j;
        JSONObject j2;
        Get_Json g = new Get_Json();//呼叫api生成之json檔
        try {
            //String json1 = "{\"air\":[{\"ts\":1663123294543,\"value\":\"988\"}],\"hum\":[{\"ts\":1663123294543,\"value\":\"90\"}]}";
            String json1 =  g.Get_Json(deviceId, jwtToken);
            j = new JSONObject(json1);
            Object jsonOb = j.getJSONArray(key).get(0);

            j2 = new JSONObject(jsonOb.toString());
            Object jsonOb2 = j2.get("value");

            //System.out.println(jsonOb2);
            return jsonOb2;
        }catch(Exception e){
            System.err.println("Error: " + e.getMessage());
        }
        return null;
    }
    //(0.temp 1.tds 2.level 3.humd 4.UVlevel 5.random_2 6.random_1 7.millis)
    public String getTemp() {
        return temp;
    }
    public String getTds() {
        return tds;
    }
    public String getLevel() {
        return level;
    }
    public String getHumd() {
        return humd;
    }
    public String getUVlevel() {
        return UVlevel;
    }
    public String getRandom_2() {
        return random_2;
    }
    public String getRandom_1() {
        return random_1;
    }
    public String getMillis() {
        return millis;
    }
}
