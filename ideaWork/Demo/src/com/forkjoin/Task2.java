package com.forkjoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.RecursiveTask;

public class Task2 extends RecursiveTask<Integer> {

    private static final Integer MAX = 10;
    private int arr[];
    private int start;
    private int end;
    public static Integer ss = 0;

    public Task2(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        if ((end - start) < MAX){
            for(int i = start; i < end; i++){
                sum += arr[i];
            }
            return sum;
        } else {
            System.out.println("任务分解-------->>");
            Integer s = ss++;
            System.out.println(s);
            int middle = (start + end)/2;
            Task2 t1 = new Task2(arr, start, middle);
            Task2 t2 = new Task2(arr, middle, end);

            t1.invoke();
            t2.invoke();
//            invokeAll(t1, t2);
            try {
                Integer num1 = t1.get();
                Integer num2 = t2.get();
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            return t1.join() + t2.join();
        }
    }
}
