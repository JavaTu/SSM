package com.hjp.study;

import java.util.concurrent.Callable;

/**
 * @author huangjp 2019/9/20 4:01 PM
 **/
public class MyCallable implements Callable {

    @Override
    public Object call() {
        System.out.println("ִ���ҵ��߳�MyCallable");
        return true;
    }
}
