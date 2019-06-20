package jr;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.SECONDS;

public class FutureTest {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        Future<List<String>> future = executor.submit(() -> {
            System.out.println("running task");
            Thread.sleep(10000);
            List<String> list = new ArrayList<>();
            list.add("jr");
            list.add("jr");
            list.add("jr");
            list.add("jr");
            list.add("jr");
            list.add("jr");
            list.add("jr");
            return list;
        });

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        System.out.println("do something else");
        System.out.println(future.isDone());
        System.out.println(future.isCancelled());

        try {
            System.out.println(future.get(15, SECONDS));
            System.out.println(future.isCancelled());
        } catch (InterruptedException e) {
        } catch (TimeoutException e) {
            System.out.println("time out");
        } catch (ExecutionException e) {
        }finally {
            executor.shutdown();
        }
    }

    @Test
    public void t1() {
        JsonTest t1 = new JsonTest();
        CompletableFuture future = CompletableFuture.runAsync(t1);
        CompletableFuture future1 = CompletableFuture.supplyAsync(t1);
        try {
            future.get();
            future1.completeExceptionally(new Exception("这是一个人工异常"));
            future1.complete("???");
//            Thread.sleep(5000);

            System.out.println(future1.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
