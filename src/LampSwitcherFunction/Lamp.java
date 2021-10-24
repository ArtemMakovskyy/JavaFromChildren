package LampSwitcherFunction;

public class Lamp implements ElectricConsumer {
    void lighting(){
        System.out.println("Light on");
    }


    @Override
    public void switchOn() {

        lighting();
    }
}
