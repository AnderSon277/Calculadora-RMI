import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author ander
 */
public class rmi extends UnicastRemoteObject implements Calculadora {

    public rmi() throws RemoteException{
       int a,b;
    }
    
    public int suma (int a , int b) throws RemoteException{
        return a+b;
    }
    
    public int resta (int a , int b) throws RemoteException{
        return a-b;
    }
    
    public int multiplicacion (int a , int b) throws RemoteException{
        return a*b;
    }
    
    public int division (int a , int b) throws RemoteException{
        return a/b;
    }
    
}