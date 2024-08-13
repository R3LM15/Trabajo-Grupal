package UserInterfaceD.Forms;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import UserInterfaceD.DuckStyle;

public class MenuForm extends JPanel {

    JFrame jfrMenuFrame = new JFrame();
    Intro pnlIntro = new Intro();

    public JLabel
    jlbLabel7 = new JLabel("MENU PRINCIPAL");
    
    public JButton
        btnInicio = new JButton("JUGAR"),
        btnPuntajes= new JButton("PUNTAJES"),
        //btnCredito= new JButton("CREDITOS"),
        btnSalir= new JButton("SALIR");
        
    public MenuForm(){
        customizeComponent();
    }

    private void customizeComponent(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        try {
            File fontStyle = new File("src/UserInterfaceD/Resource/tipografias/m29.TTF");
            Font font1 = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(10f);
            jlbLabel7.setFont(font1);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        btnInicio.setBackground(DuckStyle.COLOR_BORDER);
        btnPuntajes.setBackground(DuckStyle.COLOR_BORDER);
        btnSalir.setBackground(DuckStyle.COLOR_BORDER);

        btnInicio.setForeground(DuckStyle.COLOR_INTRO);
        btnPuntajes.setForeground(DuckStyle.COLOR_INTRO);
        btnSalir.setForeground(DuckStyle.COLOR_INTRO);

        setPreferredSize(new Dimension(350, getHeight()));

        setBackground(DuckStyle.COLOR_INTRO);
            jfrMenuFrame.setSize(20, 20);
            jfrMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            add(pnlIntro);
            add(jlbLabel7);
        
        add(btnInicio);
        add(btnPuntajes);
        //add(btnCredito);
        add(btnSalir);
    }
}
