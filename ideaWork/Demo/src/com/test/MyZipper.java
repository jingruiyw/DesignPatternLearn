package com.test;

public class MyZipper {

    private static String zip(String msg) {
        StringBuffer sb = new StringBuffer();
        int length = msg.length();
        int count ;
        int skip = 0;

        while(skip < length){
            if(skip+1 < length && msg.charAt(skip)==msg.charAt(skip+1)){
                count = 1;
                int skip2 = skip + 1;
                while(skip2 < length && msg.charAt(skip2)==msg.charAt(skip)) {
                    count++;
                    skip2++;
                }
                sb.append(msg.charAt(skip));
                sb.append(count);
                skip = skip2;
            } else {
                sb.append(msg.charAt(skip));
                sb.append(String.valueOf(1));
                skip++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(zip("aaaacccddc"));
    }
}
