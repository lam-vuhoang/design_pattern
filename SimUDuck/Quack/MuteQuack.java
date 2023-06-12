package SimUDuck.Quack;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("I could not talk");
    }
}
