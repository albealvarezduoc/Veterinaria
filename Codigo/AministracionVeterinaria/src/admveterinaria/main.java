/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admveterinaria;

import admveterinaria.Interface.HomeMedicoVeterinario;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Administrador
 */
public class main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        try
        {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {


                    try {
                        // Set System L&F
                        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    }
                    catch (UnsupportedLookAndFeelException e) {
                       // handle exception
                    }
                    catch (ClassNotFoundException e) {
                       // handle exception
                    }
                    catch (InstantiationException e) {
                       // handle exception
                    }
                    catch (IllegalAccessException e) {
                       // handle exception
                    }

                    HomeMedicoVeterinario         objMenuPrincipal               = new HomeMedicoVeterinario();

                    objMenuPrincipal.setVisible(true);
                }
            });

        }
        catch( Exception ex )
        {
            System.out.println("Error general: " + ex.getLocalizedMessage());
        }
   }

}
