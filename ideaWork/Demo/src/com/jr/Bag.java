package com.jr;

import org.junit.Test;

public class Bag {
    private String m ;

    public static void main(String[] args) {

        String s1 = "logs8";
        String s2 = new String("logs8");
        String s3 = "log";
        String s4 = "s8";
        String s5 = "log" + "s8";
        String s6 = s3 + s4;
        System.out.println(s1==s2);
        System.out.println(s1==s5);
        System.out.println(s1==s6.intern());
        System.out.println(s2==s2.intern());
        System.out.println(s5==s6);
        System.out.println(s1==s6);

    }

    private static void main(){

    }

    void t2(){};

    @Test
    public void t1() {

        final String m ;
        Bag bag = new Bag();
        M n = new M();
        n.staticMethod();
        StringBuffer sb = new StringBuffer("this is a buffer");
        sb.append("a");
        System.out.println(sb);
        System.out.println(sb.indexOf("a"));
        System.out.println(sb.lastIndexOf("a"));
    }

    @Test
    public void change() {
        M m1 = new M();
        System.out.println(m1.mmm);
        changExam(m1);
        System.out.println(m1.mmm);

    }

    private void changExam(M m){
        m.mmm = "0";
    }
}


class M{
    public String mmm = "123";
    public static void staticMethod(){}
}