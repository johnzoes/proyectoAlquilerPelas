import javax.swing.JFrame;
import java.awt.*;
public class Main{ 
public static void main(String[] args) {
     JFrame ventana;
    ventana = new JFrame("Alquiler de pela");
    ventana.add(new LoginPanel());
    ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(new Color(0,38,85));

    ventana.setVisible(true);
    }

}