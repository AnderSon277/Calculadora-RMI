import java.awt.HeadlessException;
import java.rmi.*;
import java.rmi.registry.Registry;
import javax.swing.*;

/**
 *
 * @author ander
 */
public class Servidor {

    public static void main(String args[]) {
       
        try{
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
                r.rebind("Calculadora", new rmi());
                JOptionPane.showMessageDialog(null, "Servido conectado exitosamente");
        }
        catch(HeadlessException | RemoteException e){    
            JOptionPane.showMessageDialog(null,"ERROR: Servidor NO conectado"+e);
        }
    }
}
