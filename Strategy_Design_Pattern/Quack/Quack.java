package Strategy_Design_Pattern.Quack;

public class Quack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("Original Quack Quack");
    }
    
}
