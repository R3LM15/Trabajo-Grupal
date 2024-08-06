package DuckHunt;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JPanel {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public Menu(CardLayout cardLayout, JPanel mainPanel) {
        this.cardLayout = cardLayout;
        this.mainPanel = mainPanel;
        initMenu();
    }

    private void initMenu() {
        JButton startButton = new JButton("Iniciar Juego");
        JButton leaderboardButton = new JButton("Tabla de Posiciones");
        JButton creditsButton = new JButton("Créditos");

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "Juego");
                Juego juego = (Juego) mainPanel.getComponent(2);
                juego.startGame();
            }
        });

        // Por ahora, estos botones no hacen nada
        leaderboardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción para mostrar la tabla de posiciones
            }
        });

        creditsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción para mostrar los créditos
            }
        });

        add(startButton);
        add(leaderboardButton);
        add(creditsButton);
    }
}
