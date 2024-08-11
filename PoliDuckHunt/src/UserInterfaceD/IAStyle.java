package UserInterfaceD;

import java.awt.Color;
import java.awt.Font;
import java.net.URL;

import javax.swing.SwingConstants;


public abstract class IAStyle {

    public static final Color COLOR_LOGEO = new Color(12,152,185);
    public static final Color COLOR_INTRO= Color.BLACK;
    public static final Color COLOR_BORDER= Color.CYAN;
    
    public static final Font Font_DAH = new Font("m29.TTF", 0 , 15);
    public static final Font FONT_TITLE = new Font("JetBrains Mono",0,24);
    public static final Font FONT_HIGHT = new Font("JetBrains Mono",1,10);
    public static final Font FONT_BOLD = new Font("JetBrains Mono",2,14);
    
    public static final int ALIGNMENT_LEFT = SwingConstants.LEFT;
    public static final int ALIGNMENT_RIGT = SwingConstants.RIGHT;
    public static final int ALIGNMENT_CENTER = SwingConstants.CENTER;

    public static final URL URL_Splash = IAStyle.class.getResource("/UserInterfaceD/Resource/Img/font1.jpg");
    public static final URL URL_Perro = IAStyle.class.getResource("/UserInterfaceD/Resource/Img/font2.gif");
    public static final URL URL_Patod = IAStyle.class.getResource("/UserInterfaceD/Resource/Img/font3.gif");
    public static final URL URL_Patodi = IAStyle.class.getResource("/UserInterfaceD/Resource/Img/font5.gif");
    public static final URL URL_PerroR = IAStyle.class.getResource("/UserInterfaceD/Resource/Img/font4.gif");
    public static final URL URL_Login = IAStyle.class.getResource("/UserInterfaceD/Resource/Img/Img2.webp");    
    public static final URL URL_startmenu = IAStyle.class.getResource("/UserInterfaceD/Resource/Img/startmenu.png");    

}
