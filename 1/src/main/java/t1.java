import org.json.*;
import java.util.*;

public class t1{

    public static void main(String args[]){
        Get_JwtToken jwtToken = new Get_JwtToken();
        Sensor sensor = new Sensor("e762d3d0-328b-11ed-92f4-e76ba21be8a9", (String) jwtToken.setJwtToken());
        System.out.println(sensor.getTds());
        //System.out.println(sensor.setJwtToken());

    }
}