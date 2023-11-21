package Strategy_Design_Pattern.Quack;

public class Squeak implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("Squeak Squeak");
    }
    
}
