package Strategy_Design_Pattern;

import Strategy_Design_Pattern.Duck.Duck;
import Strategy_Design_Pattern.Duck.MallardDuck;
import Strategy_Design_Pattern.Fly.CantFly;
import Strategy_Design_Pattern.Quack.Squeak;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.swim();
        mallard.performFly();
        mallard.performQuack();
        mallard.changeFlyBehaviour(new CantFly());
        mallard.performFly();
        mallard.changeQuackBehaviour(new Squeak());
        mallard.performQuack();
    }
}
