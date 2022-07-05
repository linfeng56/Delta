package com.github.delta.hlf.pattern.adapter.v1;

public class AdapterTestV1 {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.output5v();
    }
}

class Adaptee {

    public int output220v() {
        return 220;
    }
}

interface Target {

    int output5v();
}

class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int output5v() {
        int in = adaptee.output220v();

        System.out.println(String.format("输入：%d V ，输出：%d V", in, 5));

        return 5;
    }
}