package DP01SimUDuckStategy;

import DP01SimUDuckStategy.Fly.FlyNoWay;

public class MiniDuckSimulator extends Duck {
    public MiniDuckSimulator() {
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        flyBehavior.fly();
    }
    
    public static void main(String[] args) {
        System.out.println("MiniDuckSimulator");
    }
}
