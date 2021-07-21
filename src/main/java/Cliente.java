import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author ander
 */
public class Cliente {

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        
        try{
            Registry myRegister = LocateRegistry.getRegistry("localhost", 1099);
            Calculadora c = (Calculadora)Naming.lookup("//localhost/Calculadora");
        
        while (true){
            String menu = JOptionPane.showInputDialog(".:: CALCULADORA RMI ::. \n *** ANDERSON CORDOVA *** \n\n Seleccione la operacion requerida \n\n"
                    +"1 .......... Suma \n"
                    +"2 .......... Resta \n"
                    +"3 .......... Multiplicacion \n"
                    +"4 .......... Division \n"
                    +"0 .......... Salir \n");
            switch(menu){
            
                case "1":{
                    int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer diguito: "));
                    int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo diguito: "));
                    
                    JOptionPane.showMessageDialog(null, "El resultado es: "+c.suma(x,y));
                    break;
                    
                }
                case "2":{
                    int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer diguito: "));
                    int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo diguito: "));
                    
                    JOptionPane.showMessageDialog(null, "El resultado es: "+c.resta(x,y));
                    break;
                    
                }
                case "3":{
                    int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer diguito: "));
                    int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo diguito: "));
                    
                    JOptionPane.showMessageDialog(null, "El resultado es: "+c.multiplicacion(x,y));
                    break;
                    
                }
                case "4":{
                    int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer diguito: "));
                    int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo diguito: "));
                    
                    JOptionPane.showMessageDialog(null, "El resultado es: "+c.division(x,y));
                    break;
                    
                }
            
             }
        }
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Servidor no conectado "+ e);
        }
    }
}
