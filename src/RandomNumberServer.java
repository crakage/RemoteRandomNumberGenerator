import java.rmi.Naming;

public class RandomNumberServer {
    public static void main(String[] args) throws Exception {
        new RandomNumberServer();
    }

    public RandomNumberServer() throws  Exception{
        IRandomNumber r = new RandomNumber();
        Naming.rebind("rmi://localhost/random", r);

    }
}
