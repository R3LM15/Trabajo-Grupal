package UserInterfaceD;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public abstract class IAStyle {

    public static final Color COLOR_LOGEO = new Color(12,152,185);
    public static final Color COLOR_FONT = new Color(0, 100, 50); //(218, 8, 40)
    public static final Color COLOR_FONT_LIGHT = new Color(0, 100, 100);
    public static final Color COLOR_CURSOR = Color.black;
    public static final Color COLOR_INTRO= Color.BLACK;
    public static final Color COLOR_BORDER= Color.CYAN;
    
    public static final Font Font_DAH = new Font("m29.TTF", 0 , 15);
    public static final Font FONT         = new Font("JetBrains Mono", Font.PLAIN, 14);
    public static final Font FONT_TITLE = new Font("JetBrains Mono",0,24);
    public static final Font FONT_HIGHT = new Font("JetBrains Mono",1,10);
    public static final Font FONT_BOLD = new Font("JetBrains Mono",2,14);
    
    public static final int ALIGNMENT_LEFT = SwingConstants.LEFT;
    public static final int ALIGNMENT_RIGT = SwingConstants.RIGHT;
    public static final int ALIGNMENT_CENTER = SwingConstants.CENTER;

    public static final Cursor CURSOR_HAND    = new Cursor(Cursor.HAND_CURSOR);
    public static final Cursor CURSOR_DEFAULT = new Cursor(Cursor.DEFAULT_CURSOR);

    public static final URL URL_Splash = IAStyle.class.getResource("/UserInterfaceD/Resource/Img/font1.jpg");
    public static final URL URL_Perro = IAStyle.class.getResource("/UserInterfaceD/Resource/Img/font2.gif");
    public static final URL URL_Patod = IAStyle.class.getResource("/UserInterfaceD/Resource/Img/font3.gif");
    public static final URL URL_Patodi = IAStyle.class.getResource("/UserInterfaceD/Resource/Img/font5.gif");
    public static final URL URL_PerroR = IAStyle.class.getResource("/UserInterfaceD/Resource/Img/font4.gif");
    public static final URL URL_Login = IAStyle.class.getResource("/UserInterfaceD/Resource/Img/Img2.webp");    
    public static final URL URL_startmenu = IAStyle.class.getResource("/UserInterfaceD/Resource/Img/startmenu.png");    

    public static final CompoundBorder createBorderRect(){
        return BorderFactory.createCompoundBorder(  new LineBorder(Color.lightGray),
                                                    new EmptyBorder(5, 5, 5, 5));
    }

    public static final void showMsg(String msg){
        JOptionPane.showMessageDialog(null, msg, "😏 IABot", JOptionPane.INFORMATION_MESSAGE);
    }

    public static final void showMsgError(String msg){
        JOptionPane.showMessageDialog(null, msg, "💀 IABot", JOptionPane.OK_OPTION);
    }

    public static final boolean showConfirmYesNo(String msg){
        return (JOptionPane.showConfirmDialog(null, msg, "😞 IABot", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
    }
}
