package UserInterfaceD.Forms;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import UserInterfaceD.IAStyle;


public class Intro extends JPanel {

    JFrame jfrIntro = new JFrame();
    
    public JLabel
    jlbLabel5 = new JLabel(),
    jlbLabel6 = new JLabel();

    public Intro(){
        customizeComponent();
    }
        private void customizeComponent(){

            
            setBackground(IAStyle.COLOR_INTRO);
            jfrIntro.setSize(20, 20);

            ImageIcon img_patoi;
            img_patoi = new ImageIcon(IAStyle.URL_Patodi);
            jlbLabel5.setIcon(img_patoi);

            ImageIcon img_patod;
            img_patod = new ImageIcon(IAStyle.URL_Patod);
            jlbLabel6.setIcon(img_patod);
            
            jfrIntro.setLayout(null);    
                        add(jlbLabel5);
                        
                        try {
                            Image logo = ImageIO.read(IAStyle.URL_Login);
                            logo = logo.getScaledInstance(550, 300, Image.SCALE_SMOOTH);
                            add(new JLabel(new ImageIcon(logo)));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }   
                        add(jlbLabel6);
                    }
}
