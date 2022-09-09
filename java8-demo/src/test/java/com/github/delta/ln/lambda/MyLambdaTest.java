package com.github.delta.ln.lambda;

import org.junit.Test;

public class MyLambdaTest {

    @Test
    public void test() {
        MyLambda mathUtil = (x, y) -> x * y;
        System.out.println(mathUtil.add(1, 2));
    }

    @Test
    public void test2(){
        Runnable r = () -> System.out.println("哈哈");
        r.run();
    }
}
