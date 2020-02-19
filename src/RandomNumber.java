import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RandomNumber extends UnicastRemoteObject implements IRandomNumber {

    public RandomNumber() throws RemoteException {}

    public int getNumber(int low, int high) throws RemoteException{
        return (low + (int)(Math.random() * (double) (high - low)));
    }

}
