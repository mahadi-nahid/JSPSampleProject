
package hellojava;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author MdMahadiHasan
 */
public class HelloJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello Java");
        
        String s = "Hello Java";
        Scanner input = new Scanner(System.in);
        
        String name =  input.nextLine();
        
        System.out.println("Hello, "+name);
        showName(name);
        
        
    }
    
    public static void showName(String name) {
        JOptionPane.showMessageDialog(null, "Hello, "+name);
    }
    
}
