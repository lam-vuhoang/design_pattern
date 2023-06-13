package DP01SimUDuckStategy;

import DP01SimUDuckStategy.Fly.FlyBehavior;

public abstract class Duck
{
    FlyBehavior flyBehavior;


    public Duck() {}

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }


    public void swim() {
        System.out.println("All duck float, even decoys");
    }

}