import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRandomNumber extends Remote {
    public int getNumber(int low, int high) throws RemoteException;
}
