package Shildt.Reflaction.RMI_SERVER1168;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class AddServer {
    public static void main(String[] args) {
        try {
            AddServerlmpl addServerlmpl = new AddServerlmpl();
            Naming.rebind("AddServer",addServerlmpl);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
