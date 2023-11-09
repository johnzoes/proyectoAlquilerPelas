
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends JPanel{
    JTextField txtusuario, txtcontraseña;
    JLabel lbl;
    JButton btnIngresar;
    public LoginPanel(){
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        txtusuario = new JTextField(20);

        txtcontraseña = new JPasswordField(20);

    JButton loginButton = new JButton("Iniciar Sesión");

    constraints.insets = new Insets(5, 0, 5,5 );

        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridheight = 2;
        add(txtusuario, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        add(txtcontraseña, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        add(loginButton, constraints);

    }
}
