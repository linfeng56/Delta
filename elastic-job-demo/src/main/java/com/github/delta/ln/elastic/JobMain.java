package com.github.delta.ln.elastic;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 任务入口
 */
public class JobMain {

    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ctx.registerShutdownHook();
    }

}
