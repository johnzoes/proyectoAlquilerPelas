package paneles;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import java.awt.*;

public class Main{ 
public static void main(String[] args) {

    SwingUtilities.invokeLater(new Runnable() {
        public void run(){
            LoginPanel1 login = new LoginPanel1();
            login.setVisible(true);
        }
    });

    /*JFrame ventana;
    ventana = new JFrame("Alquiler de pela");
    ventana.add(new LoginPanel1());
    ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setBackground(new Color(0,38,85));

    ventana.setVisible(true);*/
    
     
    }

}