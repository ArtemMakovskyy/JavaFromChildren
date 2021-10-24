package Shildt.Reflaction.RMI_SERVER1168;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddServerintf extends Remote {
    double add (double d1, double d2) throws RemoteException;
}
