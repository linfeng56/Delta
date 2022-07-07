package com.github.delta.hlf.pattern.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        Zombie zombie = new NormalZombie();
        zombie.display();
        zombie.move();
        zombie.attack();

        zombie.setAttackable(new HitAttack());
        zombie.attack();

        zombie.setMoveable(new JumpMove());
        zombie.move();
    }
}

interface Moveable {

    void move();
}

interface Attackable {

    void attack();
}


abstract class Zombie {

    abstract public void display();

    Moveable moveable;
    Attackable attackable;

    public Zombie() {
    }

    public Zombie(Moveable moveable, Attackable attackable) {
        this.moveable = moveable;
        this.attackable = attackable;
    }


    public void move() {
        moveable.move();
    }


    public void attack() {
        attackable.attack();
    }


    public void setMoveable(Moveable moveable) {
        this.moveable = moveable;
    }


    public void setAttackable(Attackable attackable) {
        this.attackable = attackable;
    }
}

class NormalZombie extends Zombie {

    public NormalZombie() {
        super(new StepByStepMove(), new BiteAttack());
    }

    public NormalZombie(Moveable moveable, Attackable attackable) {
        super(moveable, attackable);
    }

    @Override
    public void display() {
        System.out.println("普通僵尸");
    }
}

class StepByStepMove implements Moveable {

    @Override
    public void move() {
        System.out.println("一步一步");
    }
}

class JumpMove implements Moveable {

    @Override
    public void move() {
        System.out.println("跳一跳");
    }
}

class BiteAttack implements Attackable {

    @Override
    public void attack() {
        System.out.println("咬它");
    }
}


class HitAttack implements Attackable {

    @Override
    public void attack() {
        System.out.println("盘它");
    }
}

