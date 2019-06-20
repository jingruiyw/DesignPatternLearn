package forkjoin;

import java.time.Instant;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Main2 {
    public static void main(String[] args) {
        int[] arr = new int[10000000];
        Random random = new Random();
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = random.nextInt(10000000);
            total += (arr[i] = temp);
        }
        System.out.println("初始化的总和是：" + total);
        Long time = Instant.now().toEpochMilli();
        System.out.println(time);

        ForkJoinPool pool = new ForkJoinPool();
        Integer invoke = pool.invoke(new com.forkjoin.Task2(arr, 0, arr.length));
        System.out.println(Instant.now().toEpochMilli());
        System.out.println(time);
        System.out.println("计算出来的总和：" + invoke);

        pool.shutdown();
    }
}
