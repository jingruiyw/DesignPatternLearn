package com.test;

public class Zipper {
    public static String zipString(String iniString) {
        // write code here
        int len = iniString.length();
        final int maxn = 10010;
        int counts[] = new int[maxn];
        char charlog[] = new char[maxn];
        int index = 0;
        counts[index]++;

        charlog[index] = iniString.charAt(0);
        for(int i=1;i<len;i++) {
            if(iniString.charAt(i)==iniString.charAt(i-1)) {
                counts[index]++;
            }else {
                counts[++index]++;
                charlog[index] = iniString.charAt(i);
            }
        }
        String ansStr = "";
        for(int i=0;i<=index;i++) {
            ansStr = ansStr + charlog[i];
            ansStr = ansStr + counts[i];
        }
        int Len = ansStr.length();
        if(Len<=len) return ansStr;
        return iniString;
    }

    public static void main(String[] args) {
        System.out.println(zipString("welcometonowcoderrrrr"));
        System.out.println(zipString("welcometrrr"));
    }
}
