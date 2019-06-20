package com.jr;

import java.util.Scanner;

public class TestArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String[] nums = s.split(",");

        int ans = 0, x;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                x = Integer.parseInt(nums[j]);
                ans += x;
            }
        }
        System.out.println(ans);
    }
}
