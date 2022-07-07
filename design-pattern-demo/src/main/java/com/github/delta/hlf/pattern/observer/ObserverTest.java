package com.github.delta.hlf.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverTest {

    public static void main(String[] args) {
        Subject subject = new Subject();
        TaskOne taskOne = new TaskOne();
        subject.addObserver(taskOne);
        TaskTwo taskTwo = new TaskTwo();
        subject.addObserver(taskTwo);

        subject.notifyObserver("开工啦");
        System.out.println("=====================================================");
        subject.removeObserver(taskTwo);
        subject.notifyObserver("整");
    }
}

interface Observer {

    void update(Object object);
}

class Subject {

    private List<Observer> container = new ArrayList<>();

    public void addObserver(Observer observer) {
        container.add(observer);
    }

    public void removeObserver(Observer observer) {
        container.remove(observer);
    }

    public void notifyObserver(Object object) {
        for (Observer observer : container) {
            observer.update(object);
        }
    }
}

class TaskOne implements Observer {

    @Override
    public void update(Object object) {
        System.out.println("任务一，接收到通知：" + object);
    }
}

class TaskTwo implements Observer {

    @Override
    public void update(Object object) {
        System.out.println("任务二，接收到通知：" + object);
    }
}
