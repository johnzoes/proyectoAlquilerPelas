
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        ImageIcon icon = new ImageIcon("C:\\Users\\santo\\Desktop\\imagen\\userr.jpeg");
        JLabel lbl = new JLabel(icon);
        lbl.setBounds(ancho/2 , alto/2 ,100,100);
        add(lbl);


    }
}
