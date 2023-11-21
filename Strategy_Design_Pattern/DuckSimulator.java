package Strategy_Design_Pattern;

import Strategy_Design_Pattern.Duck.Duck;
import Strategy_Design_Pattern.Duck.MallardDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.swim();
        mallard.performFly();
        mallard.performQuack();
    }
}
