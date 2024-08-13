package UserInterfaceD.Forms;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

import UserInterfaceD.DuckStyle;


public class SplashForm {
private static JFrame       frmSplash;          
private static JProgressBar barraSplash;        
private static ImageIcon    icoImage;           
private static JLabel       porcetajeSplash;    

    public static void show(){
        icoImage             = new ImageIcon(DuckStyle.URL_Splash);
        porcetajeSplash      = new JLabel(icoImage);
        barraSplash          = new JProgressBar(0, 100);

        barraSplash.setStringPainted(true); 

        frmSplash = new JFrame();
        frmSplash.setUndecorated(true);
        frmSplash.getContentPane().add(porcetajeSplash, BorderLayout.CENTER);
        frmSplash.add(barraSplash, BorderLayout.SOUTH);
        frmSplash.setSize(800,600);
        frmSplash.setLocationRelativeTo(null);
        frmSplash.setVisible(true);

        for(int i=0;i<=100;i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            barraSplash.setValue(i);
        }
        frmSplash.setVisible(false);
    }
}
