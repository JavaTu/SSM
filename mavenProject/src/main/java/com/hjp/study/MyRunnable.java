package com.hjp.study;

/**
 * @author huangjp 2019/9/20 3:59 PM
 **/
public class MyRunnable implements Runnable{

    private int i = 0;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public void run() {

        if (i == 0){
            try {
                System.out.println("MyRunnable开始睡眠。。");
                long start = System.currentTimeMillis();
                Thread.sleep(3000);
                i++;
                long end = System.currentTimeMillis();
                System.out.println("睡眠了"+(end-start)+"ms");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("执行MyRunnable...");
        }

    }
}
