import javax.swing.JFrame;

public class Main{ 
public static void main(String[] args) {
     JFrame ventana;
    ventana = new JFrame("Alquiler de pela");
    ventana.add(new LoginPanel());
    ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setVisible(true);
    }

}