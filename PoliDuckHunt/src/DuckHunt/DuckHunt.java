package DuckHunt;

import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuckHunt {
    private static JFrame frame;
    private static CardLayout cardLayout;
    private static JPanel mainPanel;

    public static void main(String[] args) {
        frame = new JFrame("Duck Hunt");
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        JPanel startPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image startImage = Toolkit.getDefaultToolkit().getImage("imagenes/startmenu.png");
                g.drawImage(startImage, 0, 0, this);
            }
        };
        startPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardLayout.show(mainPanel, "Menu");
            }
        });

        Menu menu = new Menu(cardLayout, mainPanel);
        Juego juego = new Juego(frame, cardLayout, mainPanel);
        //Salir salir = new salir(frame, cardLayout, mainPanel);


        mainPanel.add(startPanel, "Start");
        mainPanel.add(menu, "Menu");
        mainPanel.add(juego, "Juego");
        //mainPanel.add(salir, "Salir");

        frame.add(mainPanel);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        cardLayout.show(mainPanel, "Start");
    }
}
