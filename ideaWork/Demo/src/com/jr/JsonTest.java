package com.jr;

import java.util.function.Supplier;

public class JsonTest implements Runnable, Supplier {

    String json = "\"data\":{\n" +
            "                   \"first\": {\n" +
            "                       \"value\":\"恭喜你购买成功！\",\n" +
            "                       \"color\":\"#173177\"\n" +
            "                   },\n" +
            "                   \"keyword1\":{\n" +
            "                       \"value\":\"巧克力\",\n" +
            "                       \"color\":\"#173177\"\n" +
            "                   },\n" +
            "                   \"keyword2\": {\n" +
            "                       \"value\":\"39.8元\",\n" +
            "                       \"color\":\"#173177\"\n" +
            "                   },\n" +
            "                   \"keyword3\": {\n" +
            "                       \"value\":\"2014年9月22日\",\n" +
            "                       \"color\":\"#173177\"\n" +
            "                   },\n" +
            "                   \"remark\":{\n" +
            "                       \"value\":\"欢迎再次购买！\",\n" +
            "                       \"color\":\"#173177\"\n" +
            "                   }\n" +
            "           }";



    @Override
    public void run() {
        System.out.println("这是什么东西呀哇哇哇");
    }

    @Override
    public Object get() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String S = "123456";
        return S;
    }
}


