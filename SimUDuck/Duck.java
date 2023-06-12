package SimUDuck;

import SimUDuck.Fly.FlyBehavior;

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