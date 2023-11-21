package Strategy_Design_Pattern.Duck;

import Strategy_Design_Pattern.Fly.FlyWithWings;
import Strategy_Design_Pattern.Quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("See I am looking like - Mallard Duck");
    }
    
}
