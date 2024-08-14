package UserInterfaceD.Forms;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.TextField;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import UserInterfaceD.DuckStyle;


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
        
        txtIngreso = new TextField(null);

        public Logeo() {
            customizeComponent();
        }
        
        private void customizeComponent(){
            
            ImageIcon img_perro;
            img_perro = new ImageIcon(DuckStyle.URL_PerroR);
            jlbLabel4.setIcon(img_perro);
            
            try {
                
                File fontStyle = new File("src/UserInterfaceD/Resource/tipografias/m29.TTF");
                Font font1 = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(44f);
                jlbLabel1.setFont(font1);
                
            } catch (FontFormatException | IOException e) {
                e.printStackTrace();
            }
            
            jfrLogeo = new JFrame();
            setBackground(DuckStyle.COLOR_LOGEO);
            setLayout(null);
            jfrLogeo.setLocationRelativeTo(null);
            
            try {
                
                jlbLabel1.setForeground(DuckStyle.COLOR_BORDER);
                jlbLabel1.setBounds(180,-10,800,100);
                
                jlbLabel2.setForeground(Color.BLACK);
                jlbLabel2.setFont(DuckStyle.FONT_BOLD);
                jlbLabel2.setBounds(150, 80, 200, 100);
                
                txtIngreso.setBounds(400, 120, 200, 20);
            txtIngreso.setForeground(Color.WHITE);
            txtIngreso.setBackground(DuckStyle.COLOR_INTRO);
            
            btnConinuar.setBounds(335, 190, 160, 40);
            btnConinuar.setForeground(DuckStyle.COLOR_INTRO);
            btnConinuar.setBackground(Color.WHITE);
            btnConinuar.setFont(DuckStyle.FONT_HIGHT);

            btnSalir.setBounds(650, 200, 80, 40);
            btnSalir.setForeground(Color.WHITE);
            btnSalir.setBackground(Color.BLACK);
            btnSalir.setFont(DuckStyle.FONT_HIGHT);

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