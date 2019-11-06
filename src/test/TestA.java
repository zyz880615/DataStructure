import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestA {

    private static Map<String, String> map = new ConcurrentHashMap<String, String>();

    public String getString(String a) {
        String b = "";
        if (map != null) {
            b = map.get(a);
        }
        return b;
    }

    public void setMap(String a, String value) {
        map.put(a, value);
    }

    public static void main(String[] args){
        TestA testA = new TestA();
        testA.setMap("a","1");
        TestA testB = new TestA();
        System.out.println(testB.getString("a"));

    }

}
