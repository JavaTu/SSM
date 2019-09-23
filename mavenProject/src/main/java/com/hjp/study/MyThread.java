package com.hjp.study;

/**
 * @author huangjp 2019/9/20 3:40 PM
 **/
public class MyThread extends Thread{

    public int i = 0;

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
                synchronized (this){
                    System.out.println("wait3s");
                    long start = System.currentTimeMillis();
                    this.wait(3000);
                    i++;
                    long end = System.currentTimeMillis();
                    System.out.println("wait¡À"+(end-start)+"ms");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("÷¥––°£°£");
        }
    }
}
