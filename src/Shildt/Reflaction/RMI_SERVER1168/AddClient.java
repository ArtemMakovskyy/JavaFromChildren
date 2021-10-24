package Shildt.Reflaction.RMI_SERVER1168;

import java.rmi.Naming;

public class AddClient {
    public static void main(String[] args) {
        try {
            String addServerURL = "rmi://"+args[0]+"/AssServer";
            AddServerintf addServerintf = (AddServerintf) Naming.lookup(addServerURL);
            System.out.println("Пepвoe число: " + args[1]);
            double d1 = Double.valueOf(args[1]).doubleValue();
            System.out.println("Bтopoe число: " + args[2]);
            double d2 = Double.valueOf(args[2]).doubleValue();
            System.out.println("Cyммa: " + addServerintf .add(d1, d2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
