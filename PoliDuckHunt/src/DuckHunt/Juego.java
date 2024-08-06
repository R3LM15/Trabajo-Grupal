package DuckHunt;

import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Timer;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class Juego extends JPanel implements ActionListener, MouseListener {
    private List<Pato> patos;
    private Timer timer;
    private Image background;
    private JFrame frame;
    private long startTime;
    private int patosCazados;
    private final int patosObjetivo = 10;
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public Juego(JFrame frame, CardLayout cardLayout, JPanel mainPanel) {
        this.frame = frame;
        this.cardLayout = cardLayout;
        this.mainPanel = mainPanel;
        this.patos = new ArrayList<>();
        this.patosCazados = 0;
        for (int i = 0; i < 15; i++) {
            patos.add(new Pato());
        }
        this.timer = new Timer(1000 / 60, this);
        this.background = Toolkit.getDefaultToolkit().getImage("imagenes/fondo.png");
        addMouseListener(this);
    }

    public void startGame() {
        this.startTime = System.currentTimeMillis();
        this.timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, this);
        for (Pato duck : patos) {
            duck.draw(g);
        }
        long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
        g.drawString("Tiempo: " + elapsedTime + "s", 10, 20);
        g.drawString("Patos cazados: " + patosCazados, 10, 40);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Pato duck : patos) {
            duck.update();
        }
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();
        for (Pato duck : patos) {
            if (duck.isHit(mouseX, mouseY) && !duck.isFalling()) {
                duck.fall();
                patosCazados++;
                if (patosCazados >= patosObjetivo) {
                    showVictoryMessage();
                    break;
                }
            }
        }
    }

    private void showVictoryMessage() {
        long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
        JOptionPane.showMessageDialog(frame, "¡Victoria! Has cazado todos los patos en " + elapsedTime + " segundos.");
        resetGame();
        cardLayout.show(mainPanel, "Start");
    }

    private void resetGame() {
        patosCazados = 0;
        patos.clear();
        for (int i = 0; i < 10; i++) {
            patos.add(new Pato());
        }
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}
