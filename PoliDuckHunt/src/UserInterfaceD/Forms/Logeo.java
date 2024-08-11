package UserInterfaceD.Forms;

import java.awt.Color;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import UserInterfaceD.IAStyle;


public class Logeo extends JPanel{

    public static JFrame jfrLogeo;

    public JButton
        btnConinuar = new JButton("CONTINUAR"),
        btnSalir = new JButton("SALIR"); 

    public JLabel
        jlbLabel1 = new JLabel(" Bienvenido "),
        jlbLabel2 = new JLabel("Por favor, ingrese su nombre: "),
        jlbLabel4 = new JLabel();

        public TextField
        txtIngreso = new TextField("");
        
        public Logeo(){
            customizeComponent();
        }

        private void customizeComponent(){

            ImageIcon img_perro;
            img_perro = new ImageIcon(IAStyle.URL_PerroR);
            jlbLabel4.setIcon(img_perro);
            

            jfrLogeo = new JFrame();
            setLayout(null);
            setBackground(IAStyle.COLOR_LOGEO);
            jfrLogeo.setLocationRelativeTo(null);

        try {
            
            btnConinuar.setSize(25, 25);
            
            jlbLabel1.setFont(IAStyle.FONT_TITLE);
            jlbLabel1.setForeground(Color.CYAN);
            jlbLabel1.setBounds(335,-20,200,100);
            
            jlbLabel2.setForeground(Color.ORANGE);
            jlbLabel2.setFont(IAStyle.FONT_BOLD);
            jlbLabel2.setBounds(150, 80, 200, 100);

            txtIngreso.setBounds(400, 120, 200, 20);
            txtIngreso.setForeground(Color.WHITE);
            txtIngreso.setBackground(Color.BLACK);

            btnConinuar.setBounds(335, 190, 160, 40);
            btnConinuar.setForeground(Color.BLACK);
            btnConinuar.setBackground(Color.YELLOW);
            btnConinuar.setFont(IAStyle.FONT_HIGHT);

            btnSalir.setBounds(650, 200, 80, 40);
            btnSalir.setForeground(Color.WHITE);
            btnSalir.setBackground(Color.RED);
            btnSalir.setFont(IAStyle.FONT_HIGHT);

            jlbLabel4.setBounds(150, 190, 150, 100);

            add(jlbLabel1);
            add(jlbLabel2);
            add(txtIngreso);
            add(btnConinuar);
            add(btnSalir);
            add(jlbLabel4);

            setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}