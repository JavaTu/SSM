package com.hjp.study;

import java.util.concurrent.*;

/**
 * 程序 > 进程 > 线程
 * 并行与并发
 * 单核处理器，多核处理器
 * 守护线程：独立于控制终端，周期性的执行某种任务或等待处理某些发生的事件，例如Java的垃圾回收线程，创建一个守护线程，也叫后台线程，只要设置thread.setDeamon(true)
 * 创建线程的几种方法，最常用的？
 * 线程的几种状态？
 * wait与sleep:
 *
 * @author huangjp 2019/9/20 3:40 PM
 **/
public class Test {

    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        thread1.start();

        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();

        Callable<MyCallable> callable = new MyCallable();
        FutureTask<MyCallable> futureTask = new FutureTask<>(callable);
        futureTask.run();
        try {
            futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        ExecutorService pool = Executors.newFixedThreadPool(10);
        Future result = pool.submit(new MyCallable());
        pool.shutdown();
        try {
            result.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        // InterruptedException 中断异常：https://www.jianshu.com/p/a8abe097d4ed
        try {
            synchronized (thread1){ //不使用synchronized会报IllegalMonitorStateException：https://blog.csdn.net/qq_39536158/article/details/86536943
                System.out.println("wait3s");
                thread1.wait(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("sleep1s");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public static void createPool(){

        ExecutorService pool1 = Executors.newFixedThreadPool(10);
        ExecutorService pool2 = Executors.newCachedThreadPool();
        ExecutorService pool3 = Executors.newScheduledThreadPool(10);
        ExecutorService pool4 = Executors.newSingleThreadExecutor();




    }


}
