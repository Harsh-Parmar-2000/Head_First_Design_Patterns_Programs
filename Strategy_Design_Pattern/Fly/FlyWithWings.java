package Strategy_Design_Pattern.Fly;

public class FlyWithWings implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("I am Flying With Wings");
    }    
}