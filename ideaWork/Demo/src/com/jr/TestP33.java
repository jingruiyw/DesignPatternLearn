package com.jr;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo 练习题
 *
 * @author axiuj
 */
public class TestP33 {

    public static void main(String[] args) {

        System.out.println(power2(16));


//        int a = 1;
//        int b = 2;
//        int c = 9;
//        if (a > b) {
//            c = 0;
//        } else {
//            b = 0;
//        }
//        System.out.println(c);
//
//        Scanner s = new Scanner(System.in);
//        Scanner s2 = new Scanner(System.in);
//        double d1 = s.nextDouble();
//        double d2 = s2.nextDouble();
//
//        boolean m = d1 > 0 && d1 < 1;
//        boolean n = d2 > 0 && d2 < 1;
//        if (m && n){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }
    }

    @Test
    public void t1() {
        int f = 0;
        int g = 1;
        for(int i = 0; i<=15; i++){
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }

    @Test
    public void list() {
        List<String> list = new ArrayList<>();
        list.add("jr1");
        list.add("jr2");
        list.add("jr3");
        list.add("jr4");
        list.add("jr5");

        list.forEach(entity->{
            System.out.println(entity);
        });
    }

    @Test
    public void t3() {
        double t = 9.0;
        while (Math.abs(t-9.0/t)>.001){
            t = (9.0/t + t)/2.0;
            System.out.println(t);
        }
    }

    @Test
    public void t4() {
        int sum = 0;
        for(int i = 1;i<10;i++){
            for(int j = 0;j<i;j++){
                sum++;
                System.out.println("*");
            }
        }
    }

    @Test
    public void t5() {
        System.out.println((char)('a'+4));
        System.out.println((int)'a');
        System.out.println((int)'e');
    }

    @Test
    public void t6() {
         int n = 11;

         Integer remainderm = n%2;
         StringBuilder sb = new StringBuilder();
         if(n != 1){
             sb.append(remainderm.toString());
             div(n);
         }
        System.out.println(sb);
    }

    public int div(int num){
        int b = num/2;
        return b;
    }

    @Test
    public static boolean power2(Integer num) {
        return (num & num-1) == 0;
    }
}
