
import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class LoginPanel extends JPanel{
    JTextField txtusuario, txtcontraseña;
    JLabel lbl;
    public LoginPanel(){
        setLayout(null);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = (int) screenSize.getWidth();
        int alto = (int) screenSize.getHeight();

        txtusuario = new JTextField();
        txtusuario.setBounds(ancho/2-150, alto/2 -70,200,40);
        add(txtusuario);
        txtcontraseña = new JTextField();
        txtcontraseña.setBounds(ancho/2-150, alto/2 -150,200,40);
        add(txtcontraseña);

        lbl = new JLabel();
        ImageIcon icon = new ImageIcon("C:\\Users\\santo\\Desktop\\imagen\\user.jpeg");

            int labelWidth = 100;
          int labelHeight = 100;
   
            Image image = icon.getImage().getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(image);

            lbl.setIcon(resizedIcon);

        lbl.setBounds(ancho/2-100 , alto/2 -300 ,100,100);
        add(lbl);


    }
}
