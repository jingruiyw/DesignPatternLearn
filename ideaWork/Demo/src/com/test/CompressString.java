package com.test;


public class CompressString {

        String compress(String src){
            StringBuilder ret = new StringBuilder();
            int p1 = 0;
            int count;
            int len = src.length();
            while(p1<len){
                if(p1+1 < len && src.charAt(p1)==src.charAt(p1+1)){
                    count = 1;
                    int p2 = p1+1;
                    while(p2<len&&src.charAt(p2)==src.charAt(p1)){
                        count++;
                        p2++;
                    }
                    ret.append(src.charAt(p1));
                    ret.append(count);
                    p1 = p2;
                }else{
                    ret.append(src.charAt(p1));
                    ret.append(String.valueOf(1));
                    p1++;
                }
            }
            return ret.toString();
        }

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            System.out.println(new CompressString().compress("welcometonowcoderrrrr"));
        }
    }
