package com.github.delta.hlf.pattern.facade;

public class FacadeTest {

    public static void main(String[] args) {
        Client1 client1 = new Client1();
        client1.doSomeThing1();

        System.out.println("-----------------------------------------");

        Client2 client2 = new Client2();
        client2.doSomeThing2();
    }

}

class Client1 {

    Facade facade = new Facade();

    public void doSomeThing1() {
        facade.doSomethingFacade();
    }
}


class Client2 {

    Facade facade = new Facade();

    public void doSomeThing2() {
        facade.doSomethingFacade();
    }
}


class SubSystem1 {

    public void method1() {
        System.out.println("系统一的方法一");
    }
}

class SubSystem2 {

    public void method2() {
        System.out.println("系统二的方法二");
    }
}

class SubSystem3 {

    public void method3() {
        System.out.println("系统三的方法三");
    }
}

class Facade {

    SubSystem1 system1 = new SubSystem1();
    SubSystem2 system2 = new SubSystem2();
    SubSystem3 system3 = new SubSystem3();

    public void doSomethingFacade() {
        system1.method1();
        system2.method2();
        system3.method3();
    }
}


