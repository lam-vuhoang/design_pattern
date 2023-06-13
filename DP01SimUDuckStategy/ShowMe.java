package DP01SimUDuckStategy;

public class ShowMe {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        MiniDuckSimulator miniDuckSimulator = new MiniDuckSimulator();

        System.out.println("MallardDuck =============================");
        mallardDuck.display();

        System.out.println("MiniDuckSimulator =============================");
        miniDuckSimulator.display();
    }
}
