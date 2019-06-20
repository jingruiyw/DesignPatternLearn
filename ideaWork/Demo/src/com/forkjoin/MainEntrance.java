package com.forkjoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class MainEntrance {
    public static void main(String[] args) {

        ProductGenerator generator = new ProductGenerator();
        List<Product> products = generator.generate(5000);
        Task task = new Task(products, 0, 5000, 0.20);

        ForkJoinPool pool = new ForkJoinPool(10);
        pool.execute(task);

        do {
            System.out.println("当前线程名称是: " + Thread.currentThread().getName());
            System.out.println("main: thread count: " + pool.getActiveThreadCount());
            System.out.println("main: thread steal: " + pool.getStealCount());
            System.out.println("main: parallelism: " + pool.getParallelism());
            try {
                TimeUnit.MILLISECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!task.isDone());

        pool.shutdown();

        if (task.isCompletedNormally()) {
            System.out.println("main: the process has completed normally");
        }

        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getPrice() != 12) {
                System.out.println("product : " + "产品名称: " + product.getName() + "价格: " + product.getPrice());
            }
        }

        System.out.println("main: end of the program");
    }
}
