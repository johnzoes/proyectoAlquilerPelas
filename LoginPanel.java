
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends JPanel{
    JTextField txtusuario, txtcontraseña;
    JLabel lbl;
    public LoginPanel(){
        setLayout(new GridLayout(3,2));
        txtusuario = new JTextField(20);
        add(txtusuario);

        txtcontraseña = new JTextField(10);
        add(txtcontraseña);
    }
}
