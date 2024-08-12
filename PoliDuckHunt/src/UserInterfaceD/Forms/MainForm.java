package UserInterfaceD.Forms;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import DuckHunt.DuckHunt;
import DuckHunt.Juego;

public class MainForm extends JFrame{
    MenuForm pnlMenuForm = new MenuForm();
    JPanel pnlMain = new JPanel();
    //Juego pnlJuego = new Juego();

    public MainForm (String tiltleApp){
        customizeComponent(tiltleApp);
        pnlMenuForm.btnInicio.addActionListener(e -> setPanel(new Juego()));
        pnlMenuForm.btnOpciones.addActionListener(e -> System.exit(0));
        pnlMenuForm.btnCredito.addActionListener(e -> System.exit(0));
        pnlMenuForm.btnSalir.addActionListener(e -> ExitQ());
    }

    private void setPanel(JPanel formularioPanel) {
        Container container = getContentPane();
        container.remove(pnlMain);
        pnlMain = formularioPanel;
        container.add(pnlMain, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    private void customizeComponent(String titleApp){
        setTitle(titleApp);
        setSize(800,600);
        setResizable(false);                  
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        this.add(pnlMenuForm, BorderLayout.CENTER);

        setVisible(true);
    }
    private void ExitQ(){
            String [] arreglo = {"SI","NO"};
            int opcion = JOptionPane.showOptionDialog(null, "¿ Estas seguro ?"
            , " SALIR 💀 ", 0 , JOptionPane.QUESTION_MESSAGE, null, arreglo, "");
            if (opcion==0) {
                System.exit(0);
            }
        }
}
