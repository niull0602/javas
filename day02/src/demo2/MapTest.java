package demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lemon on 2019-12-05 16:54.
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Person, String> shannxi = new HashMap<>();
        shannxi.put(new Person("bhj",29),"xian");
        shannxi.put(new Person("ljh",23),"yulin");
        shannxi.put(new Person("zcc",25),"weinan");
        shannxi.put(new Person("nll",28),"hanzhong");
        Map<Person, String> henan = new HashMap<>();
        henan.put(new Person("bh",29),"lingbao");
        henan.put(new Person("lh",23),"zhengzhou");
        henan.put(new Person("cc",25),"kaifeng");
        henan.put(new Person("ll",28),"luoyang");
        Map<Map<Person,String>, String> map = new HashMap<>();
        map.put(henan,"henan");
        map.put(shannxi,"shannxi");
        for (Map<Person,String> hs:map.keySet()){
            String provice = map.get(hs);
            for (Person p:hs.keySet()){
                String city = hs.get(p);
                System.out.println(provice+"\t"+city+"\t"+p.getName()+"\t"+p.getAge());
            }
        }
    }
}
