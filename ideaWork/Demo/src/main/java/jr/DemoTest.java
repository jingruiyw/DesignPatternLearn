package jr;

import org.junit.Test;

import java.util.Scanner;

/**
 * p33页的练习题
 */
public class DemoTest {
    public static void main(String[] args) {

        /**
        double m = (0+15)/2;
        float n = (0+15)/2;
        int i = (0+15)/2;
        long l = (0+15)/2;
        System.out.println(m);
        System.out.println(n);
        System.out.println(i);
        System.out.println(l);
        Scanner s = new Scanner(System.in);
        int m1 = s.nextInt();
        System.out.println("..."+m1);
         */
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        Integer num = scan1.nextInt();
        Integer num2 = scan2.nextInt();
        Integer num3 = scan3.nextInt();
        boolean b = num.equals(num2) && num2.equals(num3) ;
        if(b){
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }
    }

    @Test
    public void sum(){
        double d = 2.0e-6*100000000.1;
        System.out.println(d);

        boolean flag = true && false || true && true;
        boolean f = true && false || true;
        double dd = (1+2.236)/2;
        double a = 1+2+3+4.0;
        System.out.println(f);
        System.out.println(flag);
        System.out.println(dd);
        System.out.println(a);
    }

    @Test
    public void t1() {
        boolean b = 4.1>4;

        System.out.println(b);
        System.out.println(1+2+"3");
    }

    @Test
    public void t2() {
        Scanner scan1 = new Scanner(System.in);
//        Scanner scan2 = new Scanner(System.in);
//        Scanner scan3 = new Scanner(System.in);

        int num = scan1.nextInt();
        System.out.println("... " + num);
    }

    @Test
    public void t3(){
        String m = "1,2";
        String[] a = m.split(",");
        
        System.out.println();
    }
}

