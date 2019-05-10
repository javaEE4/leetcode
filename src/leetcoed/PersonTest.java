package leetcoed;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;
import java.util.Map;

public class PersonTest {
    public static void main(String[] args) throws CloneNotSupportedException {
       /* Person p = new Person(23, "zhangsan");
        Person p1 = (Person) p.clone();
        System.out.println(p);
        System.out.println(p1);

        System.out.println(p.name == p1.name ? "clone是浅拷贝" : "clone是深拷贝");
        p.setName("lisi");

        System.out.println(p);
        System.out.println(p1);*/
        //System.out.println("孔彤辉 666");
        int a = 16;
        printInfo(a);
        a = a >>> 16;
        System.out.println(a);
        printInfo(a);

    }

    private static void printInfo(int num) {
        System.out.println(Integer.toBinaryString(num));
    }
}
