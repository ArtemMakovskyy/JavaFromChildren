package DiferentsLessons;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface ElectricityConsumer {
    void electricityOn();

}

class Switcher {
    private List<ElectricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListener(ElectricityConsumer listener) {
        listeners.add(listener);
    }

    public void aremooveElectricityListener(ElectricityConsumer listener) {
        listeners.remove(listener);
    }

    void switchOn() {
        System.out.println("Switcher is On");
//        if (consumer != null)
//            consumer.electricityOn(ElectricityConsumer);
        for (ElectricityConsumer c : listeners) {
            c.electricityOn();
        }
    }
}

class Lamp implements ElectricityConsumer {
    void liteOn() {
        System.out.println("Lamp is Ligting");
    }


    @Override
    public void electricityOn() {
        liteOn();
    }
}

class Radio implements ElectricityConsumer {
    void radioOn() {
        System.out.println("Radio playing");
    }

    @Override
    public void electricityOn() {
        radioOn();
    }
}

public class MainSw {
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);

        sw.addElectricityListener(() -> {
            System.out.println("Fire");
        });


        sw.switchOn();
    }
}
