package UserInterfaceD.Forms;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RegisterForm extends JFrame {

    public String nombre;

    public JFrame jfrRegister = new JFrame();
    public Intro pnlIntro = new Intro();
    public Logeo pnlLogeo = new Logeo();
    public JPanel pnlRegister = new JPanel();
    public MenuForm pnlMenuForm = new MenuForm();
    

    public RegisterForm(){
        customizeComponent();
    }
    private void customizeComponent(){

            setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

            jfrRegister = new JFrame();
            
            pnlLogeo.btnConinuar.addActionListener(e -> showMainForm());
            pnlLogeo.btnSalir.addActionListener(e -> ExitQ());

            setSize(800,600);
            setResizable(false);
            setUndecorated(true);                 
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            Container container = getContentPane();
            container.setLayout(new BorderLayout());
            
            container.add(pnlIntro, BorderLayout.NORTH);
            getContentPane().add(pnlLogeo);
        
            setVisible(true);
        }

        private void showMainForm(){
            this.nombre = String.valueOf(pnlLogeo.txtIngreso.getText());
            MainForm pnlMainForm = new MainForm("DUCK AND HUNT 💀✨", nombre);
            pnlMainForm.setVisible(true);
            remove(pnlRegister);
            this.dispose();
            revalidate();
            repaint();
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

    