package jr;

import org.junit.Test;

import java.util.StringTokenizer;
import java.util.UUID;

public class TreadTest {
    public static void main(String[] args) {
        String s = UUID.randomUUID().toString();
        System.out.println(s);
    }

    @Test
    public void t1P() {
        StringTokenizer st = new StringTokenizer("a aaa sss aaa");
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

}
