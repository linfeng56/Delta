package com.github.delta.hlf.pattern.adapter.v2;

public class AdapterTestV2 {

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.output5v();
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

class Adapter extends Adaptee implements Target {

    @Override
    public int output5v() {
        int in = output220v();

        System.out.println(String.format("输入：%d V ，输出：%d V", in, 5));

        return 5;
    }
}
