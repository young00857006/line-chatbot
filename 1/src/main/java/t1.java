import org.json.*;

import java.math.BigInteger;
import java.text.ParseException;
import java.util.*;
import java.util.Scanner;

public class t1{

    public static void main(String args[]) throws ParseException {
        Get_JwtToken jwtToken = new Get_JwtToken();
        Scanner scanner = new Scanner(System.in);

        int mod, num;
        String str1, str2, name;
        name = "tds";//感測器
        System.out.println("請輸入功能代號(1.最近一次數據 2.時間範圍內數據):");
        mod = scanner.nextInt();
        if(mod==1){

            Sensor sensor = new Sensor("e762d3d0-328b-11ed-92f4-e76ba21be8a9", (String) jwtToken.setJwtToken(), name);
        }
        else{
            //開始時間(yyyy/MM/dd HH:mm:ss)
            str1 = "2022/09/12 12:00:00";
            //截止時間(yyyy/MM/dd HH:mm:ss)
            str2 = "2022/09/20 23:00:00";
            //資料數
            num = 5;

            long sT = new java.text.SimpleDateFormat ("yyyy/MM/dd HH:mm:ss").parse(str1).getTime();
            long eT = new java.text.SimpleDateFormat ("yyyy/MM/dd HH:mm:ss").parse(str2).getTime();

            BigInteger start = new BigInteger(String.valueOf(sT));
            BigInteger end = new BigInteger(String.valueOf(eT));

            Sensor_Range sensor_range = new Sensor_Range("e762d3d0-328b-11ed-92f4-e76ba21be8a9"
                    , (String) jwtToken.setJwtToken()
                    ,start
                    ,end
                    ,num
                    ,name);
        }

    }
}