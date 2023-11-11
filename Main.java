import javax.swing.JFrame;
import java.awt.*;
public class Main{ 
public static void main(String[] args) {
     JFrame ventana,ventana2;
    ventana = new JFrame("Alquiler de pela");
    ventana.add(new LoginPanel());
    ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setBackground(new Color(0,38,85));

    ventana.setVisible(true);
    
        ventana2= new JFrame("Alquiler de pela");
        ventana2.add(new LoginPanel());
        ventana2.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana2.setBackground(new Color(0,38,85));
        ventana2.setVisible(true);
    
    }

}