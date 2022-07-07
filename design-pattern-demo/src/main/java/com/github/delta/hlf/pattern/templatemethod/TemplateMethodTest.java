package com.github.delta.hlf.pattern.templatemethod;

import java.sql.SQLOutput;

public class TemplateMethodTest {

    public static void main(String[] args) {
        AbstractClass opObj = new SubClass();
        opObj.operation();
        System.out.println("===========================================");
        AbstractClass opObj2 = new SubClass2();
        opObj2.operation();
    }
}


abstract class AbstractClass {

    public void operation() {
        System.out.println("预处理");
        System.out.println("操作一");
        templateMethod();
        System.out.println("操作二");
        System.out.println("收尾工作");
    }

    abstract protected void templateMethod();
}

class SubClass extends AbstractClass {

    @Override
    protected void templateMethod() {
        System.out.println("子类处理方法。");
    }
}


class SubClass2 extends AbstractClass {

    @Override
    protected void templateMethod() {
        System.out.println("第二个子类处理方法。");
    }
}

