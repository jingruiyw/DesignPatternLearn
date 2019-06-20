package jr;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author AXiuJ
 */
public class MTest{

    public static void main(String[] args) throws CloneNotSupportedException{
        /*Person p1 = new Person(12,"jr1",new Person.Address("beijing"));

        Person cp = (Person)p1.clone();
        cp.setAge(11);
        Person.Address a = cp.getAdd();
        a.setName("harbin");
        System.out.println(p1.getAge()+"+"+p1.getName()+"+"+p1.getAdd().getName());
        System.out.println(cp.getAge()+"+"+cp.getName()+"+"+cp.getAdd().getName());
        */

        /*Map<String, String> m = new HashMap<>();
        m.put("1","1");
        m.put("2","2");
        m.put("3","3");
        m.forEach((k,v)->{
            System.out.println("item:" + k + "c:" + v);
            System.out.println();
        });
        */



        List<Person> personList = getPeople();

        personList.forEach(item->{
            System.out.println(item.getAge());
            item.setAge(1);
            System.out.println(item.getAge());

            System.out.println(item.getAge()+"->"+item.getName()+"->"+item.getAdd().getName());
        });
    }

    private static List<Person> getPeople() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(11,"jr1",new Person.Address("tianjin1")));
        personList.add(new Person(12,"jr2",new Person.Address("tianjin2")));
        personList.add(new Person(13,"jr3",new Person.Address("tianjin3")));
        personList.add(new Person(14,"jr4",new Person.Address("tianjin4")));
        return personList;
    }

    @Test
    public void testSum(){
        int m1 = Math.abs(-2147483648);
        int m2 = Math.abs(-2147483647);
        long n =  Math.abs(-2);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(n);
        System.out.println(1.0/0.0);

    }

    @Test
    public void t2(){
        String m = "";
        String m2 = "   ";
        String m3 = " ";
        System.out.println(m.length());
        System.out.println(m2.length());
        System.out.println(m3.length());

    }
}
