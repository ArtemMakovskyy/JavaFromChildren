package Shildt.Reflaction.RMI_SERVER1168;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddServerlmpl extends UnicastRemoteObject implements AddServerintf {
    public AddServerlmpl() throws RemoteException {

    }

    @Override
    public double add(double d1, double d2) throws RemoteException {
        return d1 + d2;
    }
}
