package Strategy_Design_Pattern.Fly;

public class CantFly implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("I cant able to Fly");
    }
    
}
