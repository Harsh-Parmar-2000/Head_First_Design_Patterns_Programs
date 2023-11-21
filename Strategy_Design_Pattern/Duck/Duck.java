package Strategy_Design_Pattern.Duck;

import Strategy_Design_Pattern.Fly.FlyBehaviour;
import Strategy_Design_Pattern.Quack.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    public Duck(){

    }

    public abstract void display();

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void swim(){
        System.out.println("I can Swim");
    }
 
}