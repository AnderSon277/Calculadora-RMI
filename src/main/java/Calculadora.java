import java.rmi.*;
/**
 *
 * @author ander
 */
public interface Calculadora extends Remote {

    public int suma(int a, int b)throws RemoteException;
    public int resta(int a, int b)throws RemoteException;
    public int multiplicacion(int a, int b)throws RemoteException;
    public int division(int a, int b)throws RemoteException;
}

