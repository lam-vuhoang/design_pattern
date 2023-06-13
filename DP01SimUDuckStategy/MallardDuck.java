package DP01SimUDuckStategy;

import DP01SimUDuckStategy.Fly.FlyWithWings;
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        flyBehavior.fly();
    }

    public static void main(String[] args) {
        System.out.println("I'm Mallard Duck");
    }
}
