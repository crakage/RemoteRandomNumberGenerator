import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RandomNumberClient {
    public RandomNumberClient(int l, int u) throws Exception {
        IRandomNumber r  = (IRandomNumber) Naming.lookup("rmi://localhost/random");
        System.out.println("Server sent: " + r.getNumber(l,u));
    }

    public static void main(String[] args) throws Exception{
        new RandomNumberClient(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

    }
}
