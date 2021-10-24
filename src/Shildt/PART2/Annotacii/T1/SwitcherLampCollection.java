package Shildt.PART2.Annotacii.T1;
/**
 * https://www.youtube.com/watch?v=DNC6Lknn2AE
 */

import java.util.ArrayList;
import java.util.List;

interface Electricity {
    void electricityOn();
}

class Switcher {
//    private List<Electricity> listeners = new ArrayList<>();
//
//    void addElectrisityConsumer(Electricity listener) {
//        listeners.add(listener);
//    }
//
//    void removeElectrisityConsumer(Electricity listener) {
//        listeners.remove(listener);
//    }
//
//    void switchOn() {
//        System.out.println("Switch on");
//        for (Electricity c : listeners) {
//            c.electricityOn();
//        }
//    }

  private List<Electricity> list = new ArrayList<>();

  void addToListConsumer(Electricity addConsumer){
      list.add(addConsumer);
  }
  void switherOn(){
      for (Electricity e :
              list) {
          e.electricityOn();
      }
  }
}

class Radio implements Electricity {
    void radSin() {
        System.out.println("Radio sining");
    }

    @Override
    public void electricityOn() {
        radSin();
    }
}

class Lamp implements Electricity {
    void lampLight() {
        System.out.println("Lamp lighting");
    }

    @Override
    public void electricityOn() {
        lampLight();
    }
}

public class SwitcherLampCollection {
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        sw.addToListConsumer(lamp);
        sw.addToListConsumer(radio);
        sw.addToListConsumer(() -> System.err.println("Lets working"));


        sw.switherOn();

    }
}
