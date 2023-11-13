import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CarteleraPanel extends JPanel {
    JLabel lblPeliculas, lblSeries;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7;
    LoginPanel lp;
ActionEvent e;
    public CarteleraPanel(LoginPanel lp) {
        this.lp = lp;
        setLayout(new FlowLayout()); // Utilizar un LayoutManager apropiado

        this.setBackground(lp.getColor());

        lblPeliculas = new JLabel("Películas");
        lblPeliculas.setFont(lp.getFont());
        lblPeliculas.setForeground(Color.white);
        add(lblPeliculas);

        lblSeries = new JLabel("Series");
        lblSeries.setForeground(Color.white);
        lblSeries.setFont(lp.getFont());
        add(lblSeries);

        btn1 = createButton("proyectoAlquilerPelas\\imgPelis\\df.jpg", 100, 120);
        add(btn1);

        btn2 = createButton("proyectoAlquilerPelas\\imgPelis\\interstellar.jpg", 100, 120);
        add(btn2);
        btn2.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              // Aquí colocas la lógica que quieres que se ejecute cuando se presiona el botón
          }
      });

        btn3 = createButton("proyectoAlquilerPelas\\imgPelis\\susi.jpg", 100, 120);
        add(btn3);

        btn4 = createButton("proyectoAlquilerPelas\\imgPelis\\fnaf.jpg", 100, 120);
        add(btn4);

        // Puedes seguir agregando más botones si es necesario
    }

    private JButton createButton(String imagePath, int imgWidth, int imgHeight) {
        JButton button = new JButton();
        ImageIcon icon = new ImageIcon(imagePath);
        Image image = icon.getImage().getScaledInstance(imgWidth, imgHeight, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(image);
        button.setIcon(resizedIcon);
        return button;
    }
}