package Strategy_Design_Pattern.Quack;

public class MuteQuack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("Silence I am not saying Any Thing :)");
    }
    
}
