package com.hjp.study;

import java.util.concurrent.*;

/**
 * ���� > ���� > �߳�
 * �����벢��
 * ���˴���������˴�����
 * �ػ��̣߳������ڿ����նˣ������Ե�ִ��ĳ�������ȴ�����ĳЩ�������¼�������Java�����������̣߳�����һ���ػ��̣߳�Ҳ�к�̨�̣߳�ֻҪ����thread.setDeamon(true)
 * �����̵߳ļ��ַ�������õģ�
 * �̵߳ļ���״̬��
 * wait��sleep:
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

        // InterruptedException �ж��쳣��https://www.jianshu.com/p/a8abe097d4ed
        try {
            synchronized (thread1){ //��ʹ��synchronized�ᱨIllegalMonitorStateException��https://blog.csdn.net/qq_39536158/article/details/86536943
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
