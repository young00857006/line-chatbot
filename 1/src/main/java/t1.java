import org.json.*;
import java.util.*;

public class t1{

    public static void main(String args[]){
        Sensor sensor = new Sensor("e762d3d0-328b-11ed-92f4-e76ba21be8a9", "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ3YXJyZW41NjA2QGdtYWlsLmNvbSIsInNjb3BlcyI6WyJURU5BTlRfQURNSU4iXSwidXNlcklkIjoiY2VlYWU1YjAtMTYzMi0xMWVkLTkyZjQtZTc2YmEyMWJlOGE5IiwiZW5hYmxlZCI6dHJ1ZSwiaXNQdWJsaWMiOmZhbHNlLCJ0ZW5hbnRJZCI6ImNlZTA1ZTYwLTE2MzItMTFlZC05MmY0LWU3NmJhMjFiZThhOSIsImN1c3RvbWVySWQiOiIxMzgxNDAwMC0xZGQyLTExYjItODA4MC04MDgwODA4MDgwODAiLCJpc3MiOiJ0aGluZ3Nib2FyZC5pbyIsImlhdCI6MTY2MzY2NjA4OSwiZXhwIjoxNjYzNzUyNDg5fQ.PZ1Pm23hSG7xM7xvoHRD3dUUb9UUxiiY9cc10lsEQXJWwlL1CwfEN8v50_nyyF32ud2BvWkTNWAWFGtby7V8mA");
        System.out.println(sensor.getLevel());

    }
}