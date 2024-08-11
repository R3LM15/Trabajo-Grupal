package UserInterfaceD.Forms;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import UserInterfaceD.IAStyle;

public class MenuForm extends JPanel {

    JFrame jfrMenuFrame = new JFrame();
    Intro pnlIntro = new Intro();

    public JLabel
    jlbLabel7 = new JLabel("MENU PRINCIPAL");
    
    public JButton
        btnInicio = new JButton("JUGAR"),
        btnOpciones= new JButton("OPCIONES"),
        btnPuntajes= new JButton("PUNTAJES"),
        btnCredito= new JButton("CREDITOS"),
        btnSalir= new JButton("SALIR");
        
    public MenuForm(){
        customizeComponent();
    }

    private void customizeComponent(){
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));

        add(jlbLabel7);
        jlbLabel7.setFont(IAStyle.FONT_TITLE);

        setBackground(IAStyle.COLOR_INTRO);
            jfrMenuFrame.setSize(20, 20);
            jfrMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            add(pnlIntro);

        try {
            this.setLocation(null);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        add(btnInicio);
        add(btnOpciones);
        add(btnPuntajes);
        add(btnCredito);
        add(btnSalir);
        
        btnInicio.setBounds(10, 10, 10, 10);
    }
}
